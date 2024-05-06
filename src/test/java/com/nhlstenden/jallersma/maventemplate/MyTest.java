package com.nhlstenden.jallersma.maventemplate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyTest {
    double testmath(double first, double second) {
        return first * second;
    }

    double lol;
    double koek;

    public MyTest() {
        lol = testmath(2.0,1.5);
        koek = testmath(4.3,1.2);
    }
}

class Testmytest {

    @Test
    void testTestmath() {
        MyTest testMyTest = new MyTest();
        assertEquals(3.0, testMyTest.testmath(2.0, 1.5));
        assertEquals(5.16, testMyTest.testmath(4.3, 1.2));
    }

    @Test
    void testInitialization() {
        MyTest testMyTest = mock(MyTest.class);

        // Mock the behavior of testmath
        when(testMyTest.testmath(2.0, 1.5)).thenReturn(3.0);
        when(testMyTest.testmath(4.3, 1.2)).thenReturn(5.16);

        assertEquals(3.0, testMyTest.lol);
        assertEquals(5.16, testMyTest.koek);
    }

}