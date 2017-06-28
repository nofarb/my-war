package com.example;

import com.example.myjar.MyJar;
import org.junit.Test;

public class ApplicationServletTest {

    @Test
    public void success() {
        System.out.println(new MyJar().sayHello("cyrille"));
    }
}
