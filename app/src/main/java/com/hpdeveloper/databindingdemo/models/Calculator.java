package com.hpdeveloper.databindingdemo.models;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Created by hirenpatel on 04/10/17.
 */

public class Calculator {

    public enum Operator {ADD, SUB, DIV, MUL}

    /**
     * Addition operation
     */
    public int add(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Substract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        checkArgument(secondOperand != 0, "secondOperand must be != 0, you cannot divide by zero");
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
}
