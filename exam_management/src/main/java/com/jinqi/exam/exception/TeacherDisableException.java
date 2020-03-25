package com.jinqi.exam.exception;

/**
 * 教师未通过审核
 */
public class TeacherDisableException extends Exception{

    public TeacherDisableException() {
    }

    public TeacherDisableException(String message) {
        super(message);
    }

    public TeacherDisableException(Throwable cause) {
        super(cause);
    }

    public TeacherDisableException(String message, Throwable cause) {
        super(message, cause);
    }
}
