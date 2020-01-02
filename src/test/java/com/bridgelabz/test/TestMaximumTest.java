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
        int inpute=testMaximum.getThreeInpute(30,20,10);
        Assert.assertEquals(30,inpute);
    }

    @Test
    public void whenGivenMaxNumber_IfSecondPoasition_ShouldReturnSameNumber(){
        int inpute=testMaximum.getThreeInpute(20,30,10);
        Assert.assertEquals(30,inpute);
    }

    @Test
    public void whenGivenMaxNummber_IfThirdPosition_ShouldReturnSameNumber(){
        int inpute=testMaximum.getThreeInpute(10,20,30);
        Assert.assertEquals(30,inpute);
    }
}
