package com.hpdeveloper.databindingdemo.models;

import android.annotation.TargetApi;
import android.os.Build;

import java.util.StringJoiner;

/**
 * Created by hirenpatel on 04/10/17.
 */

public class FibonacciModel {

    public FibonacciModel() {

    }

    @TargetApi(Build.VERSION_CODES.N)
    public String generateFibonacciRecursive(int n) {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < n; i++) {
            joiner.add(String.valueOf(fibRecursive(i)));
        }
        return joiner.toString();
    }

    private int fibRecursive(int n) {
        int result = -1;
        if (n == 0 || n == 1) {
            result = 1;
        } else if (n > 1) {
            result = fibRecursive(n - 1) + fibRecursive(n - 2);
        }
        return result;
    }
}
