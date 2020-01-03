package com.bridgelabz.textmaximum;

public class TestMaximum <T extends Comparable>{
    T firstElement;
    T secondElement;
    T thirdElement;

    public TestMaximum(T firstElement,T secondElement,T thirdElement){
      this.firstElement=firstElement;
      this.secondElement=secondElement;
      this.thirdElement=thirdElement;
    }

    public <T extends Comparable> T toFindMax(T firstElement,T secondElement,T thirdElement ){
      T max=(T)this.firstElement;
      if(this.secondElement.compareTo(max)>0)
          max=(T)this.secondElement;
      if (this.thirdElement.compareTo(max)>0)
          max=(T)this.thirdElement;
      return max;
    }

    public <T> T toFindMax(){
        T maxElement=(T)toFindMax(firstElement,secondElement,thirdElement);
        printMax(maxElement);
      return maxElement;
    }

    private static <T> void printMax(T maximumValue){
        System.out.println(maximumValue);
    }
}
