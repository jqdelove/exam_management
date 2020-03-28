package com.jinqi.exam.exception;

/**
 * 学生不存在
 */
public class ManagerNotFoundException extends Exception{

    public ManagerNotFoundException() {
    }

    public ManagerNotFoundException(String message) {
        super(message);
    }

    public ManagerNotFoundException(Throwable cause) {
        super(cause);
    }

    public ManagerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
