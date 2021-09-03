package com.course.testng;
//超时测试

import org.testng.annotations.Test;

public class TimeoutTest {
    /*下面函数讲解：等待超过3000就抛出异常 否则正常*/
    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);

    }

    @Test(timeOut = 2000)//单位为毫秒值
    public void testFaild() throws InterruptedException {
        Thread.sleep(3000);

    }
}