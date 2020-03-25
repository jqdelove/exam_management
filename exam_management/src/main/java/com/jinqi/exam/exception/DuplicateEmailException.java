package com.jinqi.exam.exception;

/**
 * 重复的邮箱
 */
public class DuplicateEmailException extends Exception{

    public DuplicateEmailException() {
    }

    public DuplicateEmailException(String message) {
        super(message);
    }

    public DuplicateEmailException(Throwable cause) {
        super(cause);
    }

    public DuplicateEmailException(String message, Throwable cause) {
        super(message, cause);
    }
}
