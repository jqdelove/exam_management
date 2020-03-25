package com.jinqi.exam.exception;

/**
 * 重复的邮箱
 */
public class TeacherDuplicateEmailException extends Exception{

    public TeacherDuplicateEmailException() {
    }

    public TeacherDuplicateEmailException(String message) {
        super(message);
    }

    public TeacherDuplicateEmailException(Throwable cause) {
        super(cause);
    }

    public TeacherDuplicateEmailException(String message, Throwable cause) {
        super(message, cause);
    }
}
