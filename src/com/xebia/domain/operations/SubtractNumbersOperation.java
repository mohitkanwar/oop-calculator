package com.xebia.domain.operations;


public class SubtractNumbersOperation extends MultiOperandOperations {


    public SubtractNumbersOperation(String oldValue) {
        super(oldValue);
    }

    @Override
    protected String onKeyPress(String oldValue, String newValue) {
        return String.valueOf(Integer.parseInt(oldValue) - Integer.parseInt(newValue));
    }
}
