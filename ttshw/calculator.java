package com.ttshw;

import java.util.List;

public class calculator {
    //double subtractTotal;
    //double multiTotal;
    //double divideTotal;
    //double squareTotal;
    public static int toAdd (int num1, int num2) {
        return num1 + num2;
    }
    public static int toSubtract (int num1, int num2) {
        return num1 - num2;
    }
    public static int toMultiply (int num1, int num2) {
        return num1 * num2;
    }
    public static int toDivide (int num1, int num2) {
        return num1 / num2;
    }
    public static int toModulus (int num1, int num2) {
        return num1 % num2;
    }
    public static int sumAll (List<Integer> nums) {
        int sum = 0;
        int i;
        for (i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }
}

