package com.xebia.domain.operations;

public class NumberOutputOperation implements Operation {

    @Override
    public String onKeyPress(String input) {
        return input;
    }
}
