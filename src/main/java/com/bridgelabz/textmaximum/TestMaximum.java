package com.bridgelabz.textmaximum;

public class TestMaximum {

    public static<E extends  Comparable> E getThreeInput(E firstNumber, E secondNumber, E thirdNumber) {
        E max=firstNumber;
        if(secondNumber.compareTo(max)>0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max)>0) {
            max = thirdNumber;
        }
        return max;

    }

}
