package com.bridgelabz.textmaximum;

public class TestMaximum {

    public Integer getThreeInput(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        int max=firstNumber;
        if(secondNumber.compareTo(max)>0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max)>0) {
            max = thirdNumber;
        }
        return max;

    }
    public Float getThreeFloatInput(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float max=firstNumber;
        if(secondNumber.compareTo(max)>0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max)>0) {
            max = thirdNumber;
        }
        return max;

    }
}
