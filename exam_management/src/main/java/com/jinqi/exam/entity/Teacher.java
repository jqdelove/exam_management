package com.jinqi.exam.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Teacher implements Serializable {
    private Integer teacherId;

    private String teacherName;

    private Date teacherBirth;

    private String teacherSex;

    private String teacherEmail;

    private String teacherPhone;

    private String teacherAddress;

    private String teacherCollage;

    private String teacherPwd;

    private Integer teacherStatus;

    private List<ClazzTeacher> clazzTeachers;

    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<ClazzTeacher> getClazzTeachers() {
        return clazzTeachers;
    }

    public void setClazzTeachers(List<ClazzTeacher> clazzTeachers) {
        this.clazzTeachers = clazzTeachers;
    }

    private static final long serialVersionUID = 1L;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Date getTeacherBirth() {
        return teacherBirth;
    }

    public void setTeacherBirth(Date teacherBirth) {
        this.teacherBirth = teacherBirth;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex == null ? null : teacherSex.trim();
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail == null ? null : teacherEmail.trim();
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone == null ? null : teacherPhone.trim();
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress == null ? null : teacherAddress.trim();
    }

    public String getTeacherCollage() {
        return teacherCollage;
    }

    public void setTeacherCollage(String teacherCollage) {
        this.teacherCollage = teacherCollage == null ? null : teacherCollage.trim();
    }

    public String getTeacherPwd() {
        return teacherPwd;
    }

    public void setTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd == null ? null : teacherPwd.trim();
    }

    public Integer getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(Integer teacherStatus) {
        this.teacherStatus = teacherStatus;
    }
}