package com.jinqi.exam.exception;

/**
 * 学生不存在
 */
public class TeacherNotFoundException extends Exception{

    public TeacherNotFoundException() {
    }

    public TeacherNotFoundException(String message) {
        super(message);
    }

    public TeacherNotFoundException(Throwable cause) {
        super(cause);
    }

    public TeacherNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
