package com.devBootCamp.exercicio5;

public class CpfInvalidoException extends RuntimeException {

    public CpfInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CpfInvalidoException(String message) {
        super(message);
    }
}
