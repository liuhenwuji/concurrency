package com.ji.concurrency;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestJava {
    public static void main(String[] args) {
        Map map = new HashMap();
        Collections.unmodifiableMap(map);
    }
}
