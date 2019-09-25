package com.xebia;

import com.xebia.domain.Calculator;
import com.xebia.domain.Position;

public class Main {

    public static void main(String[] args) {
        testInputNumbers();
        testTwoInputNumbers();
        testAddition();
        testSubtraction();
        testSin();
    }

    private static void testTwoInputNumbers() {
        Calculator calculator = new Calculator();
        calculator.pressButtonAt(new Position("9"));
        calculator.pressButtonAt(new Position("9"));
        String op = calculator.getResult();
        if(op.equals("99")){
            System.out.println("The test is successful for Two numbers input");
        }
        else {
            System.out.println("The test failed for Two numbers input");
        }
    }

    private static void testSin() {
        Calculator calculator = new Calculator();
        calculator.pressButtonAt(new Position("9"));
        calculator.pressButtonAt(new Position("0"));
        calculator.pressButtonAt(new Position("sin"));

        String op = calculator.getResult();
        if(op.indexOf("0.8939966636")==0){
            System.out.println("The test is successful for Sin");
        }
        else {
            System.out.println("The test failed for Sin");
        }

    }

    private static void testSubtraction() {
        Calculator calculator = new Calculator();
        calculator.pressButtonAt(new Position("9"));
        calculator.pressButtonAt(new Position("-"));
        calculator.pressButtonAt(new Position("5"));
        String op = calculator.getResult();
        if(op.equals("4")){
            System.out.println("The test is successful for subtraction");
        }
        else {
            System.out.println("The test failed for subtraction");
        }


    }

    private static void testAddition() {
        Calculator calculator = new Calculator();
        calculator.pressButtonAt(new Position("9"));
        calculator.pressButtonAt(new Position("+"));
        calculator.pressButtonAt(new Position("5"));
        String op = calculator.getResult();
        if(op.equals("14")){
            System.out.println("The test is successful for addition");
        }
        else {
            System.out.println("The test failed for addition");
        }


    }

    private static void testInputNumbers() {

        for(int i=0;i<10;i++){
            Calculator calculator = new Calculator();
            String positionLabel = String.valueOf(i);
            calculator.pressButtonAt(new Position(positionLabel));
            String op = calculator.getResult();
            if(op.equals(positionLabel)){
                System.out.println("The test is successful for " +positionLabel);
            }
            else {
                System.out.println("The test failed for "+positionLabel);
            }
        }


    }
}
