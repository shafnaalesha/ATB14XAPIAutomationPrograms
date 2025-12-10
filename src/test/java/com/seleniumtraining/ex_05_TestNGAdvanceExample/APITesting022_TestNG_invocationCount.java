package com.seleniumtraining.ex_05_TestNGAdvanceExample;

import org.testng.annotations.Test;

public class APITesting022_TestNG_invocationCount {
    @Test(invocationCount = 2)
    public void test_01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test_02(){
        System.out.println("Bye");
    }
}
