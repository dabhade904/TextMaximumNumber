package com.bridgelabz.test;

import com.bridgelabz.textmaximum.TestMaximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumTest {
    private TestMaximum testMaximum;
    @Before

    public void setUp(){
        testMaximum=new TestMaximum();
    }

    @Test
    public void whenGivenMaxNumber_IfFirstPosition_ShouldReturnSameNumber(){
        int inpute=testMaximum.getThreeInput(30,20,10);
        Assert.assertEquals(30,inpute);
    }

    @Test
    public void whenGivenMaxNumber_IfSecondPosition_ShouldReturnSameNumber(){
        int inpute=testMaximum.getThreeInput(20,30,10);
        Assert.assertEquals(30,inpute);
    }

    @Test
    public void whenGivenMaxNumber_IfThirdPosition_ShouldReturnSameNumber(){
        int inpute=testMaximum.getThreeInput(10,20,30);
        Assert.assertEquals(30,inpute);
    }

    @Test
    public void whenGivenFloatMaxNumber_IfFirstPosition_ShouldReturnSameNumber(){
        float input=testMaximum.getThreeFloatInput(30.11f,20.33f,10.33f);
        Assert.assertEquals(30.11f,input,0.0);
    }

    @Test
    public void whenGivenFloatMaxNumber_IfSecondPosition_ShouldReturnSameNumber(){
        float input=testMaximum.getThreeFloatInput(20.55f,30.11f,10.33f);
        Assert.assertEquals(30.11f,input,0.0);
    }

    @Test
    public void whenGivenFloatMaxNumber_IfThirdPosition_ShouldReturnSameNumber(){
        float input=testMaximum.getThreeFloatInput(10.11f,20.33f,30.11f);
        Assert.assertEquals(30.11f,input,0.0);
    }
    @Test
    public void whenGivenStringMaxNumber_IfFirstPosition_ShouldReturnSameNumber(){
        String input=testMaximum.getThreeStringInput("Apple","Peach","Banana");
        Assert.assertEquals("Peach",input);
    }

    @Test
    public void whenGivenStringMaxNumber_IfSecondPosition_ShouldReturnSameNumber(){
        String input=testMaximum.getThreeStringInput("Peach","Apple","Banana");
        Assert.assertEquals("Peach",input);
    }

    @Test
    public void whenGivenStringMaxNumber_IfThirdPosition_ShouldReturnSameNumber(){
        String input=testMaximum.getThreeStringInput("Aople","Banana","Peach");
        Assert.assertEquals("Peach",input);
    }

}
