package com.xebia.domain;
public class Display {
    private String message;

    public Display() {
        clear();
    }

    public void setMessage(String input) {
        this.message = input;
    }

    public void clear() {
        this.message = "";
    }

    public String getMessage() {
        return message;
    }

}
