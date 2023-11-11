package org.example;

import java.util.Date;

public class StaticSample {

    public static Date getSystemTime(String arg) {
        return getSystemTime();
    }

    public static Date getSystemTime() {
        return new Date();
    }
}
