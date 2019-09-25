package com.xebia.domain.operations;

public class AddNumbersOperation extends MultiOperandOperations {


    public AddNumbersOperation(String oldValue) {
        super(oldValue);
    }

    @Override
    protected String onKeyPress(String oldValue, String newValue) {
        return String.valueOf(Integer.parseInt(oldValue)+Integer.parseInt(newValue));
    }


}
