package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){ System.out.println("用例1"); }
    @Test
    public void testCase2(){ System.out.println("用例2"); }
    @BeforeMethod
    public void beforeMethod(){ System.out.println("测试方法之前"); }
    @AfterMethod
    public void afterMethod(){ System.out.println("测试方法之后"); }
    @BeforeClass
    public void beforeClass(){ System.out.println("测试类方法之前"); }
    @AfterClass
    public void afterClass(){ System.out.println("测试类方法之后"); }
    @BeforeSuite
    public void beforeSuite(){ System.out.println("beforeSuite-测试套件"); }
    @AfterSuite
    public void afterSuite(){ System.out.println("afterSuite-测试套件");
    }
}
