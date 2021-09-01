package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1o(){ System.out.println("test1 befor run"); }
    @Test(dependsOnMethods = {"test1o"})
    public void test2(){ System.out.println("test2 befor run"); }
}