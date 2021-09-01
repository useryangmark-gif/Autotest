package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1");
    }
    @Test(groups = "client")
    public void test2(){
        System.out.println("这客户端组的测试方法2");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端测试方法执行钱的方法BeforeGroups"); }
    @AfterGroups("server")
    public void afterGroupsOnServer(){ System.out.println("这是服务端测试方法执行后的方法AfterGroups"); }
}
