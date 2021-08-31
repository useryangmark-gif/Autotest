package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("用例1");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("测试方法之前");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("测试方法之后");
    }


}
