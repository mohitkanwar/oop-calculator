package com.xebia.domain.operations;

public class SinOperation implements Operation {
    @Override
    public String onKeyPress(String input) {
        return String.valueOf(Math.sin(Double.parseDouble(input)));
    }
}
