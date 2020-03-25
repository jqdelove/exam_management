package com.jinqi.exam.exception;

/**
 * 学生未通过审核
 */
public class StudentDisableException extends Exception{

    public StudentDisableException() {
    }

    public StudentDisableException(String message) {
        super(message);
    }

    public StudentDisableException(Throwable cause) {
        super(cause);
    }

    public StudentDisableException(String message, Throwable cause) {
        super(message, cause);
    }
}
