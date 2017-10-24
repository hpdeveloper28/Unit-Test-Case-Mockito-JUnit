package com.hpdeveloper.databindingdemo.models;

import java.util.Random;

/**
 * Created by hirenpatel on 04/10/17.
 */

public class MultiInputModel {

    public MultiInputModel() {

    }

    /**
     * Create random integer
     *
     * @param min - Minimum number for range
     * @param max - Maximum number for range
     * @return - Random Integer between range
     */
    public Integer getRandomNumber(int min, int max) {
        Random rng = new Random();
        return rng.nextInt(max - min + 1) + min;
    }
}
