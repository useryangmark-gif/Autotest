package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1-中运行stu1运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1-中运行stu2运行");
    }
}
