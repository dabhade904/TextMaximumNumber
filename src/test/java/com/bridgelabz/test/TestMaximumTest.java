package com.bridgelabz.test;

import com.bridgelabz.textmaximum.TestMaximum;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

    @Test
    public void whenGivenMaxNumber_IfFirstPosition_ShouldReturnSameNumber(){
        TestMaximum testMaximum=new TestMaximum(30,20,10);
        Comparable input= testMaximum.findMaxValue();
        Assert.assertEquals(30,input);
    }

    @Test
    public void whenGivenMaxNumber_IfSecondPosition_ShouldReturnSameNumber(){
        TestMaximum testMaximum=new TestMaximum(20,30 ,10);
        Comparable input= testMaximum.findMaxValue();
        Assert.assertEquals(30,input);
    }

    @Test
    public void whenGivenMaxNumber_IfThirdPosition_ShouldReturnSameNumber(){
        TestMaximum testMaximum=new TestMaximum(10,20,30);
        Comparable input=testMaximum.findMaxValue();
        Assert.assertEquals(30,input);
    }

    @Test
    public void whenGivenFloatMaxNumber_IfFirstPosition_ShouldReturnSameNumber(){
        TestMaximum testMaximum=new TestMaximum(30.11f,20.33f,10.33f);
        Comparable input=testMaximum.findMaxValue();
        Assert.assertEquals(30.11f, (Float) input,0.0);
    }

    @Test
    public void whenGivenFloatMaxNumber_IfSecondPosition_ShouldReturnSameNumber(){
        TestMaximum testMaximum=new TestMaximum(20.55f,30.11f,10.33f);
        Comparable input=testMaximum.findMaxValue();
        Assert.assertEquals(30.11f, (Float) input,0.0);
    }

    @Test
    public void whenGivenFloatMaxNumber_IfThirdPosition_ShouldReturnSameNumber(){
        TestMaximum testMaximum=new TestMaximum(10.11f,20.33f,30.11f);
        Comparable input=testMaximum.findMaxValue();
        Assert.assertEquals(30.11f, (Float) input,0.0);
    }
    @Test
    public void whenGivenStringMaxNumber_IfFirstPosition_ShouldReturnSameNumber(){
        TestMaximum testMaximum=new TestMaximum("Apple","Peach","Banana");
        Comparable input=testMaximum.findMaxValue();
        Assert.assertEquals("Peach",input);
    }

    @Test
    public void whenGivenStringMaxNumber_IfSecondPosition_ShouldReturnSameNumber(){
        TestMaximum testMaximum=new TestMaximum("Peach","Apple","Banana");
        Comparable input=testMaximum.findMaxValue();
        Assert.assertEquals("Peach",input);
    }

    @Test
    public void whenGivenStringMaxNumber_IfThirdPosition_ShouldReturnSameNumber(){
        TestMaximum testMaximum=new TestMaximum("Apple","Banana","Peach");
        Comparable input=testMaximum.findMaxValue();
        Assert.assertEquals("Peach",input);
    }

    @Test
    public void toTestMaximum_AfterCreatingGeneric() {
        TestMaximum<Integer> testMaximum = new TestMaximum<>(10, 20, 30);
        Comparable comparable = testMaximum.findMaxValue();
        Assert.assertEquals(30, comparable);
    }

    @Test
    public void toTestMaximum_ByPassingFloats_ToConstructor() {
        TestMaximum<Float> testMaximum = new TestMaximum<>(10.6f, 35.8f, 5.5f);
        Comparable comparable = testMaximum.findMaxValue();
        Assert.assertEquals(35.8f,comparable);
    }

    @Test
    public void toTestMaximum_ByPassingString_ToConstructor() {
        TestMaximum<String> testMaximum = new TestMaximum<>("ironman", "batman", "superman");
        Comparable comparable = testMaximum.findMaxValue();
        Assert.assertEquals("superman",comparable);
    }

    @Test
    public void toTestMaximum_ByPassingNumber_UsingOption() {
        TestMaximum<Integer> testMaximum = new TestMaximum<>(10, 20, 30, 500, 70);
        Comparable comparable = testMaximum.findMaxValue();
        Assert.assertEquals(500,comparable);
    }
}
