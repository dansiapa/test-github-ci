package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HelloServletTest {

    private HelloServlet servlet;

    @Before
    public void setUp() {
        servlet = new HelloServlet();
    }

    @Test
    public void testBuildGreeting_withName() {
        String result = servlet.buildGreeting("GitHub");
        assertEquals("Hello, GitHub!", result);
    }

    @Test
    public void testBuildGreeting_withWorld() {
        String result = servlet.buildGreeting("World");
        assertEquals("Hello, World!", result);
    }

    @Test
    public void testGetCurrentTime_notNull() {
        String time = servlet.getCurrentTime();
        assertNotNull(time);
        assertFalse(time.isEmpty());
    }
}
