package com.bridgelabz.textmaximum;

import java.util.Arrays;

public class TestMaximum <T extends Comparable>{
    T [] myArray;

  public TestMaximum(T...value){

    T[] array=(T[])new Comparable[value.length];
    int i=0;
    for(T c:value){
        array[i]=c;
        i++;
    }
    this.myArray=array;
  }

    public T findMaxValue(){
        Arrays.sort(myArray);
      return myArray[myArray.length-1];
    }
}
