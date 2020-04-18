package com.jinqi.exam.controller;

import com.github.pagehelper.PageInfo;
import com.jinqi.exam.entity.Score;
import com.jinqi.exam.entity.Student;
import com.jinqi.exam.entity.TestPaper;
import com.jinqi.exam.exception.DuplicateEmailException;
import com.jinqi.exam.exception.StudentDisableException;
import com.jinqi.exam.exception.StudentNotFoundException;
import com.jinqi.exam.service.ScoreService;
import com.jinqi.exam.service.StudentService;
import com.jinqi.exam.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
        return "student/test-paper";
    }
}
