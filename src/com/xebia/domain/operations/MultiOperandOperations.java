package com.xebia.domain.operations;

public abstract class MultiOperandOperations implements Operation {

    private String oldValue;

    public MultiOperandOperations(String oldValue) {
        this.oldValue = oldValue;
    }

    @Override
    public String onKeyPress(String input) {

        return onKeyPress(this.oldValue,input);

    }
    protected abstract String onKeyPress(String oldValue,String newValue);
}
