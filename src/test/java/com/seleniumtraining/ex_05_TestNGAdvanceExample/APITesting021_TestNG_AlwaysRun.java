package com.seleniumtraining.ex_05_TestNGAdvanceExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting021_TestNG_AlwaysRun {
    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }
    @Test(alwaysRun = true)
    public void test_loginpage() {
        Assert.assertTrue(true);
    }
    @Test
    public void test_normal() {
        Assert.assertTrue(true);
    }
}
