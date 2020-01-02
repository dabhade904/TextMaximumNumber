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

    public String getThreeStringInput(String firstString, String secondString, String thirdString) {
        String max=firstString;
        if(secondString.compareTo(max)>0) {
            max = secondString;
        }
        if (thirdString.compareTo(max)>0) {
            max = thirdString;
        }
        return max;
    }

}
