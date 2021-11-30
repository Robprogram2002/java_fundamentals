package com.tutorial.Proyect2Movies.Exception;

public class DataAccessEx extends Exception {
    private String message;

    public DataAccessEx(String message) {
        super(message);
    }
}
