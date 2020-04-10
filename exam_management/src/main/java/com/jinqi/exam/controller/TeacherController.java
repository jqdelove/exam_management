package com.jinqi.exam.controller;

import com.github.pagehelper.PageInfo;
import com.jinqi.exam.entity.*;
import com.jinqi.exam.exception.*;
import com.jinqi.exam.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private ClazzTeacherService clazzTeacherService;

    @Autowired
    private ClazzStudentService clazzStudentService;

    @Autowired
    private ScoreService scoreService;

    @Autowired
    private ClazzService clazzService;

    @Autowired
    private TeacherCourseService teacherCourseService;

    @Autowired
    private ClazzCourseService clazzCourseService;

    @Autowired
    private KnowledgePointsService knowledgePointsService;

    @Autowired
    private ExaminationSyllabusService examinationSyllabusService;

    @Autowired
    private SyllabusKnowledgeService syllabusKnowledgeService;

    /**
     * 跳转注册页面
     * @return
     */
    @RequestMapping("/showReg.do")
    public String showReg(){
        return "teacher/register";
    }

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/showLogin.do")
    public String showLogin(){
        return "teacher/login";
    }

    //处理注册异常
    @ExceptionHandler(TeacherDuplicateEmailException.class)
    public ModelAndView registerExceptionHandler(Exception e){
        return new ModelAndView("teacher/register","e",e);
    }

    /**
     * 注册
     * @param teacher
     * @param session
     * @param map
     * @return
     * @throws TeacherDuplicateEmailException
     */
    @RequestMapping("/register.do")
    public String register(@ModelAttribute Teacher teacher, HttpSession session, Map map) throws TeacherDuplicateEmailException {
        teacher.setTeacherStatus(2);//2表示学生未通过审核，1表示通过审核可以登录
        teacherService.register(teacher);
        return "redirect:/teacher/showLogin.do";//注册完去下一个页面登录页面
    }

    //处理登录异常
    @ExceptionHandler({TeacherDisableException.class,TeacherNotFoundException.class})
    public ModelAndView loginExceptionHandler(Exception e){
        return new ModelAndView("teacher/login","e",e);
    }

    /**
     * 登录
     * @param teacher
     * @return
     * @throws TeacherDisableException
     * @throws TeacherNotFoundException
     */
    @RequestMapping("/login.do")
    public String login(@ModelAttribute Teacher teacher, HttpSession session) throws TeacherDisableException, TeacherNotFoundException {
        Teacher tea = teacherService.login(teacher);
        session.setAttribute("tea",tea);
        return "redirect:/teacher/checked/showMain.do";//登录完去下一个页面首页
    }

    /**
     * 显示教师首页
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/checked/showMain.do")//加checked用于过滤未登录用户
    public String showMain(HttpSession session, Model model){
        Teacher tea = (Teacher) session.getAttribute("tea");
        return "teacher/main";
    }

    /**
     * 注销
     * @param session
     * @return
     */
    @RequestMapping("/logout.do")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/teacher/showLogin.do";
    }

    /**
     * 查看个人信息
     * @param session
     * @param map
     * @return
     */
    @RequestMapping("/checked/showInfo.do")
    public String showInfo(HttpSession session, Map<String, Teacher> map){
        Teacher tea1 = (Teacher) session.getAttribute("tea");
        Teacher teacher = teacherService.checkInfo(tea1.getTeacherId());
        map.put("teacher",teacher);
        return "teacher/profile";
    }

    /**
     * 修改个人信息
     * @param teacher 教师
     * @param session
     * @return
     */
    @RequestMapping("/checked/updateInfo.do")
    public String updateInfo(@ModelAttribute Teacher teacher,HttpSession session){
        Teacher tea1 = (Teacher) session.getAttribute("tea");
        teacher.setTeacherId(tea1.getTeacherId());
        teacherService.updateInfo(teacher);
        return "redirect:/teacher/checked/showInfo.do";
    }

    /**
     * 教师管理班级
     * @param session
     * @param map
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/checked/showClazz.do")
    public String showClazz(HttpSession session, Map<String, PageInfo<ClazzTeacher>> map, @RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        Teacher tea1 = (Teacher) session.getAttribute("tea");
        List<ClazzTeacher> clazzTeachers = clazzTeacherService.getClazzTeacher(tea1.getTeacherId(), page, size);
        PageInfo<ClazzTeacher> pageInfo=new PageInfo<>(clazzTeachers);
        map.put("clazzTeachers",pageInfo);
        return "teacher/class";
    }

    /**
     * 教师查看班级详情
     * @param classId 教师查看班级传过来的班级id
     * @return
     */
    @RequestMapping("/checked/showClazzDtl.do")
    public String showClazzDtl(Integer classId, Map<String, Object> map){
        List<ClazzStudent> clazzStudents = clazzStudentService.getClazzStudent(classId);
        map.put("clazzStudents",clazzStudents);
        List<Clazz> clazzes = clazzService.getClazz(classId);
        Clazz clazz = clazzes.get(0);
        map.put("clazz",clazz);
        return "teacher/class-edit";
    }

    /**
     * 更新班级信息
     * @param clazz
     * @param classId
     * @return
     */
    @RequestMapping("/checked/editClass.do")
    public String editClass(@ModelAttribute Clazz clazz,Integer classId){
        clazz.setClassId(classId);
        clazzService.editClass(clazz);
        return "redirect:/teacher/checked/showClazzDtl.do?classId=" + classId;
    }

    /**
     * 教师查看学生成绩
     * @param studentId
     * @return
     */
    @RequestMapping("/checked/showStudentScore.do")
    public String showStudentScore(Integer studentId, Map<String, List<Score>> map){
        List<Score> scores = scoreService.getScore(studentId);
        map.put("scores",scores);
        return "teacher/class-edit2";
    }

    /**
     * 教师查看所教课程
     * @param session
     * @param map
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/checked/showCourse.do")
    public String showCourse(HttpSession session, Map<String, PageInfo<TeacherCourse>> map, @RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        Teacher tea1 = (Teacher) session.getAttribute("tea");
        List<TeacherCourse> teacherCourses = teacherCourseService.getTeacherCourse(tea1.getTeacherId(), page, size);
        PageInfo<TeacherCourse> pageInfo = new PageInfo<>(teacherCourses);
        map.put("teacherCourses",pageInfo);
        return "teacher/course";
    }

    /**
     * 教师查看课程详情
     * @param courseId
     * @return
     */
    @RequestMapping("/checked/showCourseDtl.do")
    public String showCourseDtl(Integer courseId,Map map){
        List<ClazzCourse> clazzCourses = clazzCourseService.getClazzCourse(courseId);
        map.put("clazzCourses",clazzCourses);
        return "teacher/course-edit";
    }

    /**
     * 教师查看所教课程，上课班级的成绩情况
     * @param classId
     * @return
     */
    @RequestMapping("/checked/showClazzScore.do")
    public String showClazzScore(Integer classId,Integer courseId,Map map){
        List<ClazzStudent> clazzStudents = clazzStudentService.getClazzStudent(classId, courseId);
        map.put("clazzStudents",clazzStudents);
        return "teacher/course-edit2";
    }

    /**
     * 教师查看所属自己课程的知识点
     * @return
     */
    @RequestMapping("/checked/showKnowledge.do")
    public String showKnowledge(HttpSession session, Map map, @RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        Teacher tea1 = (Teacher) session.getAttribute("tea");
        List<KnowledgePoints> knowledgePoints = knowledgePointsService.getAll(tea1.getTeacherId(), page, size);
        PageInfo pageInfo =  new PageInfo(knowledgePoints);
        map.put("knowledgePoints",pageInfo);
        return "teacher/knowledge";
    }

    /**
     * 查看知识点详情
     * @param knowledgePointsId
     * @return
     */
    @RequestMapping("/checked/showKnowledgeDtl.do")
    public String showKnowledgeDtl(Integer knowledgePointsId,Map map){
        KnowledgePoints knowledge = knowledgePointsService.getKnowledge(knowledgePointsId);
        map.put("knowledge",knowledge);
        return "teacher/knowledge-edit";
    }

    /**
     * 修改时知识点
     * @param knowledgePointsId
     * @return
     */
    @RequestMapping("/checked/editKnowledge.do")
    public String editKnowledge(Integer knowledgePointsId,@ModelAttribute KnowledgePoints knowledgePoints){
        knowledgePoints.setKnowledgePointsId(knowledgePointsId);
        knowledgePointsService.updateInfo(knowledgePoints);
        return "redirect:/teacher/checked/showKnowledgeDtl.do?knowledgePointsId=" + knowledgePointsId;
    }

    /**
     * 跳转新建知识点页面
     * @return
     */
    @RequestMapping("/checked/showCreateKnowledge.do")
    public String showCreateKnowledge(){
        return "teacher/knowledge-create";
    }

    /**
     * 新建知识点
     * @return
     */
    @RequestMapping("/checked/createKnowledge.do")
    public String createKnowledge(@ModelAttribute KnowledgePoints knowledgePoints){
        knowledgePointsService.addKnowledge(knowledgePoints);
        return "redirect:/teacher/checked/showKnowledge.do?page=1&size=6";
    }

    /**
     * 删除知识点
     * @param knowledgePointsId
     * @return
     */
    @RequestMapping("/checked/deleteKnowledge.do")
    public String deleteKnowledge(Integer knowledgePointsId){
        knowledgePointsService.deleteKnowledge(knowledgePointsId);
        return "redirect:/teacher/checked/showKnowledge.do?page=1&size=6";
    }

    /**
     * 教师查询和自己课程相关的大纲，知识点只能在一个大纲中出现一次
     * @param session
     * @param map
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/checked/showExaminationSyllabus.do")
    public String showExaminationSyllabus(HttpSession session,Map map, @RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        Teacher tea1 = (Teacher) session.getAttribute("tea");
        List<ExaminationSyllabus> examinationSyllabusList = examinationSyllabusService.getAll(tea1.getTeacherId(), page, size);
        PageInfo pageInfo = new PageInfo(examinationSyllabusList);
        map.put("examinationSyllabusList",pageInfo);
        return "teacher/examinationSyllabus";
    }

    /**
     * 删除单条大纲
     * @return
     */
    @RequestMapping("/checked/deleteExaminationSyllabus.do")
    public String deleteExaminationSyllabus(Integer examinationSyllabusId){
        examinationSyllabusService.deleteExaminationSyllabus(examinationSyllabusId);
        return "redirect:/teacher//checked/showExaminationSyllabus.do?page=1&size=6";
    }

    /**
     * 查看大纲详情
     * @param examinationSyllabusId
     * @return
     */
    @RequestMapping("/checked/showExaminationSyllabusDtl.do")
    public String showExaminationSyllabusDtl(Integer examinationSyllabusId,Map map){

        List<ExaminationSyllabus> examinationSyllabus =
                examinationSyllabusService.getExaminationSyllabus(examinationSyllabusId);
        ExaminationSyllabus examinationSyllabus1 = examinationSyllabus.get(0);
        map.put("examinationSyllabus",examinationSyllabus1);
        return "teacher/examinationSyllabus-edit";
    }

    /**
     * 新建大纲页面
     * @return
     */
    @RequestMapping("/checked/showCreateExaminationSyllabus.do")
    public String showCreateExaminationSyllabus(){
        return "teacher/examinationSyllabus-create";
    }

    /**
     * 前台页面显示教师所教课程下拉框
     * @param session
     * @return
     */
    @RequestMapping(value = "/checked/showSelectCourse.do", produces="application/json;charset=utf-8")
    public @ResponseBody List<TeacherCourse> showCourse(HttpSession session){
        Teacher tea1 = (Teacher) session.getAttribute("tea");
        List<TeacherCourse> teacherCourses = teacherCourseService.getTeacherCourse(tea1.getTeacherId());
        return teacherCourses;
    }

    /**
     * 前台页面显示教师所生成的知识点
     * @param session
     * @return
     */
    @RequestMapping(value = "/checked/showAllKnowledge.do",produces="application/json;charset=utf-8")
    public @ResponseBody List<KnowledgePoints> showKnowledge(HttpSession session){
        Teacher tea1 = (Teacher) session.getAttribute("tea");
        List<KnowledgePoints> knowledgePoints = knowledgePointsService.getAll(tea1.getTeacherId());
        return knowledgePoints;
    }

    /**
     * 新建大纲
     * @param courseId
     * @param
     * @return
     */
    @RequestMapping("/checked/createExaminationSyllabus.do")
    public String createExaminationSyllabus(Integer courseId,Integer knowledgePointsIds){
        ExaminationSyllabus examinationSyllabus = new ExaminationSyllabus();
        examinationSyllabus.setCourseId(courseId);

        examinationSyllabusService.createExaminationSyllabus(examinationSyllabus);

        SyllabusKnowledge syllabusKnowledge = null;
//        for (Integer knowledgePointsId : knowledgePointsIds) {
            syllabusKnowledge = new SyllabusKnowledge();
            syllabusKnowledge.setExaminationSyllabusId(examinationSyllabus.getExaminationSyllabusId());
            syllabusKnowledge.setKnowledgePointsId(knowledgePointsIds);
            syllabusKnowledgeService.createSyllabusKnowledge(syllabusKnowledge);
//        }

        return "redirect:/teacher/checked/showExaminationSyllabus.do?page=1&size=6";
    }
}
