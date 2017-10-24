package com.hpdeveloper.databindingdemo.managers;

/**
 * Created by hirenpatel on 04/10/17.
 */

public class ApplicationManager {
    private static final ApplicationManager ourInstance = new ApplicationManager();

    public static ApplicationManager getInstance() {
        return ourInstance;
    }

    private ApplicationManager() {
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplier(int a, int b) {
        return a * b;
    }

    public int divider(int a, int b) {
        return a / b;
    }
}
