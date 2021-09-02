package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
/*
*期望x个时候抛出异常
* 我们传入了x些不合法的参数，程序抛出异常
* */
//测试结果失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    //测试结果失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();

    }

}
