package com.bridgelabz.textmaximum;

public class TestMaximum <T extends Comparable>{
    T firstElement;
    T secondElement ;
    T thirdElement;

  public TestMaximum(T firstElement,T secondElement,T thirdElement){
        this.firstElement=firstElement;
        this.secondElement=secondElement;
        this.thirdElement=thirdElement;
    }

    public static  <T extends Comparable> T getThreeInput(T firstElement,T secondElement,T thirdElement) {
        T max=firstElement;
        if(secondElement.compareTo(max)>0) {
            max = secondElement;
        }
        if (thirdElement.compareTo(max)>0) {
            max =thirdElement;
        }
        return max;
    }

    public T findMaxValue(){
      T maximum=getThreeInput(firstElement,secondElement,thirdElement);
      return maximum;
    }
}
