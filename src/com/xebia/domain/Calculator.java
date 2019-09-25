package com.xebia.domain;

import com.xebia.domain.operations.MultiOperandOperations;
import com.xebia.domain.operations.NumberOutputOperation;
import com.xebia.domain.operations.Operation;
import com.xebia.domain.operations.OperationFactory;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Display display;
    private final Map<Position, Operation> inputNumberButtons;
    private Operation selectedOperation;
    private final OperationFactory operationFactory;
    public Calculator() {
        this.operationFactory = new OperationFactory();
        this.display = new Display();
        this.inputNumberButtons = new HashMap<>();
        populateNumberButtons();

    }

    private void populateNumberButtons() {
        for(int i = 0; i<10; i++){
            this.inputNumberButtons.put(
                    new Position(String.valueOf(i)),
                    new NumberOutputOperation()
            );

        }
    }

    public void pressButtonAt(Position position) {
        if(this.selectedOperation!=null){
            this.display.setMessage(
                    this.selectedOperation.onKeyPress(position.getPositionLabel())
            );
            this.selectedOperation = null;
        }
        else if(this.inputNumberButtons.keySet().contains(position)){
            Operation operation = inputNumberButtons.get(position);
            String result = operation.onKeyPress(position.getPositionLabel());
            this.display.setMessage(this.display.getMessage() +result);
        }
        else {
            Operation operation = this.operationFactory.getOperation(position.getPositionLabel(),this.display.getMessage());
            if(!(operation instanceof MultiOperandOperations)){
                this.display.setMessage(operation.onKeyPress(this.display.getMessage()));
            }
            else {
                this.selectedOperation = operation;
            }
        }

    }

    public String getResult() {
        return display.getMessage();
    }
}
