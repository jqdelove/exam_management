package com.jinqi.exam.exception;

/**
 * 学生不存在
 */
public class StudentNotFoundException extends Exception{

    public StudentNotFoundException() {
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
