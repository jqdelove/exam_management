package com.jinqi.exam.controller;

import com.github.pagehelper.PageInfo;
import com.jinqi.exam.entity.*;
import com.jinqi.exam.exception.DuplicateEmailException;
import com.jinqi.exam.exception.StudentDisableException;
import com.jinqi.exam.exception.StudentNotFoundException;
import com.jinqi.exam.service.*;
import com.jinqi.exam.vo.ExaminationSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ScoreService scoreService;

    @Autowired
    private TestPaperService testPaperService;

    @Autowired
    private ExaminationTestPaperService examinationTestPaperService;

    @Autowired
    private ExaminationQuestionsService examinationQuestionsService;

    @Autowired
    private ExaminationSyllabusService examinationSyllabusService;

    /**
     * 跳转注册页面
     * @return
     */
    @RequestMapping("/showReg.do")
    public String showReg(){
        return "student/register";
    }

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/showLogin.do")
    public String showLogin(){
        return "student/login";
    }

    //处理注册异常
    @ExceptionHandler(DuplicateEmailException.class)
    public ModelAndView registerExceptionHandler(Exception e){
        return new ModelAndView("student/register","e",e);
    }

    /**
     * 注册
     * @param student
     * @param session
     * @param map
     * @return
     * @throws DuplicateEmailException
     */
    @RequestMapping("/register.do")
    public String register(@ModelAttribute Student student, HttpSession session, Map map) throws DuplicateEmailException {
        student.setStudentStatus(2);//2表示学生未通过审核，1表示通过审核可以登录
        studentService.register(student);
        return "redirect:/student/showLogin.do";//注册完去下一个页面登录页面
    }

    //处理登录异常
    @ExceptionHandler({StudentNotFoundException.class,StudentDisableException.class})
    public ModelAndView loginExceptionHandler(Exception e){
        return new ModelAndView("student/login","e",e);
    }

    /**
     * 登录
     * @param student
     * @return
     * @throws StudentDisableException
     * @throws StudentNotFoundException
     */
    @RequestMapping("/login.do")
    public String login(@ModelAttribute Student student, HttpSession session) throws StudentDisableException, StudentNotFoundException {
        Student stu = studentService.login(student);
        session.setAttribute("stu",stu);
        return "redirect:/student/checked/showMain.do";//登录完去下一个页面首页
    }

    /**
     * 显示学生首页
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/checked/showMain.do")//加checked用于过滤未登录用户
    public String showMain(HttpSession session, Model model){
        Student stu = (Student) session.getAttribute("stu");
        return "student/main";
    }

    /**
     * 注销
     * @param session
     * @return
     */
    @RequestMapping("/logout.do")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/student/showLogin.do";
    }

    /**
     * 查看个人信息
     * @param session
     * @param map
     * @return
     */
    @RequestMapping("/checked/showInfo.do")
    public String showInfo(HttpSession session, Map<String, Student> map){
        Student stu1 = (Student) session.getAttribute("stu");
        Student student = studentService.checkInfo(stu1.getStudentId());
        map.put("student",student);
        return "student/profile";
    }

    /**
     * 修改个人信息
     * @param student
     * @param session
     * @return
     */
    @RequestMapping("/checked/updateInfo.do")
    public String updateInfo(@ModelAttribute Student student,HttpSession session){
        Student stu1 = (Student) session.getAttribute("stu");
        student.setStudentId(stu1.getStudentId());
        studentService.updateInfo(student);
        return "redirect:/student/checked/showInfo.do";
    }

    /**
     * 查询学生的课程
     * @param session
     * @return
     */
    @RequestMapping("/checked/showCourse.do")
    public String showCourse(HttpSession session, Map<String, PageInfo<Score>> map, @RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        Student stu1 = (Student) session.getAttribute("stu");
        List<Score> scores = scoreService.getScore(stu1.getStudentId(),page,size);
        PageInfo<Score> pageInfo=new PageInfo<>(scores);
        map.put("scores",pageInfo);
        return "student/course";
    }

    /**
     * 查询成绩
     * @param session
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/checked/showScore.do")
    public ModelAndView showScore(HttpSession session,@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        ModelAndView mv=new ModelAndView();
        Student stu1 = (Student) session.getAttribute("stu");
        List<Score> scores = scoreService.getScore(stu1.getStudentId(),page,size);
        PageInfo<Score> pageInfo=new PageInfo<>(scores);
        mv.addObject("scores",pageInfo);
        mv.setViewName("student/score");
        return mv;
    }

    /**
     * 学生查看考试列表
     * @param map
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/checked/showTestPaper.do")
    public String showTestPaper(Map map,@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        List<TestPaper> testPaperList = testPaperService.getAllAvailable(page, size);
        PageInfo pageInfo = new PageInfo(testPaperList);
        map.put("testPapers",pageInfo);
        //查询是否已有这场考试的成绩
        for (TestPaper testPaper : testPaperList) {
            Integer examinationSyllabusId = testPaper.getExaminationSyllabusId();
            List<ExaminationSyllabus> examinationSyllabus = examinationSyllabusService.getExaminationSyllabus(examinationSyllabusId);
            for (ExaminationSyllabus syllabus : examinationSyllabus) {
                List<Score> scores = scoreService.getScores(syllabus.getCourseId());
                for (Score score : scores) {
                    if (null != score.getScoreNumber()){
                        map.put("scoreNumber",score.getScoreNumber());
                    }
                }
            }
        }
        return "student/test-paper";
    }

    /**
     * 学生进入考试
     * @param testPaperId
     * @return
     */
    @RequestMapping("/checked/showTestPaperDtl.do")
    public String showTestPaperDtl(Integer testPaperId,Map map,Integer examinationSyllabusId,HttpSession session){
        List<ExaminationTestPaper> examinationTestPapers = examinationTestPaperService.getByTestPaperId(testPaperId);
        map.put("examinationTestPapers",examinationTestPapers);
        session.setAttribute("examinationSyllabusId",examinationSyllabusId);
        return "student/test-paper-process";
    }

    /**
     * 学生提交试卷
     * @return
     */
    @RequestMapping("/checked/checkAnswer.do")
    public String checkAnswer(@org.jetbrains.annotations.NotNull HttpServletRequest request, HttpSession session, @ModelAttribute ExaminationSelect examinationSelect) {
        String[] split1 = examinationSelect.getExaminationSelect1().split("");
        String[] split2 = examinationSelect.getExaminationSelect2().split("");
        String[] split3 = examinationSelect.getExaminationSelect3().split("");
        String[] split4 = examinationSelect.getExaminationSelect4().split("");
        String[] split5 = examinationSelect.getExaminationSelect5().split("");
        String[] split6 = examinationSelect.getExaminationSelect6().split("");
        String[] split7 = examinationSelect.getExaminationSelect7().split("");
        String[] split8 = examinationSelect.getExaminationSelect8().split("");
        String[] split9 = examinationSelect.getExaminationSelect9().split("");
        String[] split10 = examinationSelect.getExaminationSelect10().split("");

        if (null != examinationSelect.getExaminationSelect4()){
            String examinationSelect4 = examinationSelect.getExaminationSelect4();
            split4 = examinationSelect4.split("");
        }
        if (null != examinationSelect.getExaminationSelect5()){
            String examinationSelect5 = examinationSelect.getExaminationSelect5();
            split5 = examinationSelect5.split("");
        }
        if (null != examinationSelect.getExaminationSelect6()){
            String examinationSelect6 = examinationSelect.getExaminationSelect6();
            split6 = examinationSelect6.split("");
        }
        if (null != examinationSelect.getExaminationSelect7()){
            String examinationSelect7 = examinationSelect.getExaminationSelect7();
            split7 = examinationSelect7.split("");
        }
        if (null != examinationSelect.getExaminationSelect8()){
            String examinationSelect8 = examinationSelect.getExaminationSelect8();
            split8 = examinationSelect8.split("");
        }
        if (null != examinationSelect.getExaminationSelect9()){
            String examinationSelect9 = examinationSelect.getExaminationSelect9();
            split9 = examinationSelect9.split("");
        }
        if (null != examinationSelect.getExaminationSelect10()){
            String examinationSelect10 = examinationSelect.getExaminationSelect10();
            split10 = examinationSelect10.split("");
        }
        //初始化分数，一题答对加10分
        int score = 0;
        Integer result1 = examinationQuestionsService.checkAnswer(Integer.parseInt(split1[0]), split1[2]);
        if (result1 == 1){
            score+=10;
        }
        Integer result2 = examinationQuestionsService.checkAnswer(Integer.parseInt(split2[0]), split2[2]);
        if (result2 == 1){
            score+=10;
        }
        Integer result3 = examinationQuestionsService.checkAnswer(Integer.parseInt(split3[0]), split3[2]);
        if (result3 == 1){
            score+=10;
        }
        Integer result4 = examinationQuestionsService.checkAnswer(Integer.parseInt(split4[0]), split3[2]);
        if (result4 == 1){
            score+=10;
        }
        Integer result5 = examinationQuestionsService.checkAnswer(Integer.parseInt(split5[0]), split5[2]);
        if (result5 == 1){
            score+=10;
        }
        Integer result6 = examinationQuestionsService.checkAnswer(Integer.parseInt(split6[0]), split6[2]);
        if (result6 == 1){
            score+=10;
        }
        Integer result7 = examinationQuestionsService.checkAnswer(Integer.parseInt(split7[0]), split7[2]);
        if (result7 == 1){
            score+=10;
        }
        Integer result8 = examinationQuestionsService.checkAnswer(Integer.parseInt(split8[0]), split8[2]);
        if (result8 == 1){
            score+=10;
        }
        Integer result9 = examinationQuestionsService.checkAnswer(Integer.parseInt(split9[0]), split9[2]);
        if (result9 == 1){
            score+=10;
        }
        Integer result10 = examinationQuestionsService.checkAnswer(Integer.parseInt(split10[0]), split10[2]);
        if (result10 == 1){
            score+=10;
        }
        //获得session中存放的大纲id
        Integer examinationSyllabusId = (Integer) session.getAttribute("examinationSyllabusId");
        //利用大纲id查询对应的课程id
        List<ExaminationSyllabus> examinationSyllabus =
                examinationSyllabusService.getExaminationSyllabus(examinationSyllabusId);
        ExaminationSyllabus examinationSyllabus1 = examinationSyllabus.get(0);
        Student stu = (Student) session.getAttribute("stu");
        Score scoreReal = new Score();
        scoreReal.setCourseId(examinationSyllabus1.getCourseId());
        scoreReal.setScoreNumber(score);
        scoreReal.setStudentId(stu.getStudentId());
        scoreService.createScore(scoreReal);
        //移除session中存放的大纲id
        session.removeAttribute("examinationSyllabusId");
        return "redirect:/student/checked/showTestPaper.do?page=1&size=6";
    }
}
