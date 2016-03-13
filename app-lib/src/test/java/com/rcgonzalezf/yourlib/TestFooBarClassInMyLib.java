package com.rcgonzalezf.yourlib;

import mockit.Verifications;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestFooBarClassInMyLib {

    // System under test (sut), following Jon Reid convention
    // https://youtu.be/GtKiLWIRaqQ?t=10m
    private FooBarClassInMyLib sut;

    @Before
    public void preconditions() {
        sut = new FooBarClassInMyLib();
    }

    @Test
    public void shouldSaySomethingWhenFooIsCalled() {

        sut.foo();

        new Verifications() {{
            sut.say(anyString);
        }};
    }
}
