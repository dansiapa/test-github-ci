package com.example;

/**
 * Simple utility class providing application information.
 */
public class AppInfo {

    private static final String APP_NAME = "Java WebApp CI Demo";
    private static final String VERSION = "1.0.0";

    public String getAppName() {
        return APP_NAME;
    }

    public String getVersion() {
        return VERSION;
    }

    public String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public String getFullInfo() {
        return APP_NAME + " v" + VERSION + " (Java " + getJavaVersion() + ")";
    }
}
