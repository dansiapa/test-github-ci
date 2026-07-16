package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AppInfoTest {

    private AppInfo appInfo;

    @Before
    public void setUp() {
        appInfo = new AppInfo();
    }

    @Test
    public void testGetAppName() {
        assertEquals("Java WebApp CI Demo", appInfo.getAppName());
    }

    @Test
    public void testGetVersion() {
        assertEquals("1.0.0", appInfo.getVersion());
    }

    @Test
    public void testGetJavaVersion_notNull() {
        assertNotNull(appInfo.getJavaVersion());
    }

    @Test
    public void testGetFullInfo_containsVersion() {
        String info = appInfo.getFullInfo();
        assertTrue(info.contains("1.0.0"));
        assertTrue(info.contains("Java WebApp CI Demo"));
    }
}
