package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1(){ System.out.println("test1 befor run");
        throw new RuntimeException();    //被依赖方法执行失败 依赖的test 会被ignored.
    }
    @Test(dependsOnMethods = {"test1"})    //单独运行了test2 test1也会被运行
    public void test2(){ System.out.println("test2 befor run"); }
}