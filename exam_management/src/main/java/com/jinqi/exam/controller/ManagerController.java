package com.jinqi.exam.controller;

import com.github.pagehelper.PageInfo;
import com.jinqi.exam.entity.*;
import com.jinqi.exam.exception.ManagerNotFoundException;
import com.jinqi.exam.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private ClazzStudentService clazzStudentService;

    @Autowired
    private ClazzService clazzService;

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/showLogin.do")
    public String showLogin(){
        return "manager/login";
    }


    //处理登录异常
    @ExceptionHandler({ManagerNotFoundException.class})
    public ModelAndView loginExceptionHandler(Exception e){
        return new ModelAndView("manager/login","e",e);
    }

    /**
     * 登录
     * @param
     * @return
     * @throws ManagerNotFoundException
     */
    @RequestMapping("/login.do")
    public String login(@ModelAttribute Manager manager, HttpSession session) throws ManagerNotFoundException {
        Manager man = managerService.login(manager);
        session.setAttribute("man",man);
        return "redirect:/manager/checked/showMain.do";//登录完去下一个页面首页
    }

    /**
     * 显示管理员首页
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/checked/showMain.do")//加checked用于过滤未登录用户
    public String showMain(HttpSession session, Model model){
        Manager man = (Manager) session.getAttribute("man");
        return "manager/main";
    }

    /**
     * 注销
     * @param session
     * @return
     */
    @RequestMapping("/logout.do")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/manager/showLogin.do";
    }

    /**
     * 查看个人信息
     * @param session
     * @param map
     * @return
     */
    @RequestMapping("/checked/showInfo.do")
    public String showInfo(HttpSession session, Map<String, Manager> map){
        Manager man1 = (Manager) session.getAttribute("man");
        Manager manager = managerService.checkInfo(man1.getManagerId());
        map.put("manager",manager);
        return "manager/profile";
    }

    /**
     * 修改个人信息
     * @param
     * @param session
     * @return
     */
    @RequestMapping("/checked/updateInfo.do")
    public String updateInfo(@ModelAttribute Manager manager,HttpSession session){
        Manager man1 = (Manager) session.getAttribute("man");
        manager.setManagerId(man1.getManagerId());
        managerService.updateInfo(manager);
        return "redirect:/manager/checked/showInfo.do";
    }

    /**
     * 管理学生
     * @return
     */
    @RequestMapping("/checked/showStudent.do")
    public String showStudent(Map<String, PageInfo<Student>> map, @RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        List<Student> students = studentService.getAll(page,size);
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        map.put("students",pageInfo);
        return "manager/student";
    }

    /**
     * 启用学生
     * @param studentId
     * @return
     */
    @RequestMapping("/checked/enableStudent.do")
    public String enableStudent(Integer studentId){
        Student tmp = new Student();
        tmp.setStudentId(studentId);
        tmp.setStudentStatus(1);
        studentService.updateInfo(tmp);
        return "redirect:/manager/checked/showStudent.do";
    }

    /**
     * 禁用学生
     * @param studentId
     * @return
     */
    @RequestMapping("/checked/disableStudent.do")
    public String disableStudent(Integer studentId){
        Student tmp = new Student();
        tmp.setStudentId(studentId);
        tmp.setStudentStatus(2);
        studentService.updateInfo(tmp);
        return "redirect:/manager/checked/showStudent.do";
    }

    /**
     * 管理教师
     * @return
     */
    @RequestMapping("/checked/showTeacher.do")
    public String showTeacher(Map map, @RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        List<Teacher> teachers = teacherService.getAll(page,size);
        PageInfo<Teacher> pageInfo = new PageInfo<>(teachers);
        map.put("teachers",pageInfo);
        return "manager/teacher";
    }

    /**
     * 启用教师
     * @param teacherId
     * @return
     */
    @RequestMapping("/checked/enableTeacher.do")
    public String enableTeacher(Integer teacherId){
        Teacher tmp = new Teacher();
        tmp.setTeacherId(teacherId);
        tmp.setTeacherStatus(1);
        teacherService.updateInfo(tmp);
        return "redirect:/manager/checked/showTeacher.do";
    }

    /**
     * 禁用学生
     * @param teacherId
     * @return
     */
    @RequestMapping("/checked/disableTeacher.do")
    public String disableTeacher(Integer teacherId){
        Teacher tmp = new Teacher();
        tmp.setTeacherId(teacherId);
        tmp.setTeacherStatus(2);
        teacherService.updateInfo(tmp);
        return "redirect:/manager/checked/showTeacher.do";
    }

    /**
     * 编辑学生详情
     * @param studentId
     * @param map
     * @return
     */
    @RequestMapping("/checked/editStudent.do")
    public String editStudent(Integer studentId,Map map){
        Student student1 = studentService.checkInfo(studentId);
        map.put("student1",student1);
        return "manager/student-edit";
    }

    /**
     * 修改学生信息
     * @param studentId
     * @return
     */
    @RequestMapping("/checked/saveStudent.do")
    public String saveStudent(Integer studentId,@ModelAttribute Student student,Integer classId){
        ClazzStudent student2 = clazzStudentService.getClazzStudent2(studentId);
        if (null == student2){
            clazzStudentService.setClass(studentId,classId);
            student.setStudentId(studentId);
            studentService.updateInfo(student);
        }else {
            student.setStudentId(studentId);
            studentService.updateInfo(student);
        }
        return "redirect:/manager/checked/editStudent.do?studentId=" + studentId;
    }

    /**
     * 查询所有可用班级
     * @return 返回json对象
     */
    @RequestMapping(value = "/checked/showAllClazz.do", produces="application/json;charset=utf-8")
    public @ResponseBody List<Clazz> showAllClazz(){
        List<Clazz> clazzes = clazzService.getAll();
        return clazzes;
    }

    /**
     * 编辑教师详情
     * @param teacherId
     * @param map
     * @return
     */
    @RequestMapping("/checked/editTeacher.do")
    public String editTeacher(Integer teacherId,Map map){
        Teacher teacher1 = teacherService.checkInfo(teacherId);
        map.put("teacher1",teacher1);
        return "manager/teacher-edit";
    }

    /**
     * 修改教师信息
     * @return
     */
    @RequestMapping("/checked/saveTeacher.do")
    public String saveTeacher(Integer teacherId,@ModelAttribute Teacher teacher){
        teacher.setTeacherId(teacherId);
        teacherService.updateInfo(teacher);
        return "redirect:/manager/checked/editTeacher.do?teacherId=" + teacherId;
    }

    /**
     * 显示所有班级信息
     * @param map
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/checked/showAllClazzes.do")
    public String showAllClazzes(Map map,@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "6")int size){
        List<Clazz> clazzes = clazzService.getAll(page, size);
        PageInfo<Clazz> pageInfo = new PageInfo<>(clazzes);
        map.put("clazzes",pageInfo);
        return "manager/class";
    }

    /**
     * 编辑班级详情
     * @param classId
     * @param map
     * @return
     */
    @RequestMapping("/checked/showClazzDtl.do")
    public String showClazzDtl(Integer classId,Map map){
        Clazz clazz = clazzService.getClazz(classId);
        map.put("clazz",clazz);
        return "manager/class-edit";
    }

    /**
     * 修改班级信息
     * @param classId
     * @return
     */
    @RequestMapping("/checked/editClazz.do")
    public String editClazz(Integer classId,@ModelAttribute Clazz clazz){
        clazz.setClassId(classId);
        clazzService.editClass(clazz);
        return "redirect:/manager/checked/showClazzDtl.do?classId=" + classId;
    }

}
