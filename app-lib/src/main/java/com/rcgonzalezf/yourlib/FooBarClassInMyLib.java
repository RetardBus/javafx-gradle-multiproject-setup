package com.rcgonzalezf.yourlib;

public class FooBarClassInMyLib {

    public void foo() {
        String message = "fooBar from lib module";
        say(message);
    }

    void say(String message) {
        System.out.print(message);
    }
}
