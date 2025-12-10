package com.seleniumtraining.ex_05_TestNGAdvanceExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting018_TestNG_DependsOnMethod {
    @Test
    public void serverStartedOk() {
        System.out.println("I will run First");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "serverStartedOk")
    public void test1() {
        System.out.println("method1");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "serverStartedOk")
    public void test2() {
        System.out.println("method2");
        Assert.assertTrue(true);
    }
}
