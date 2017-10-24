package com.hpdeveloper.databindingdemo.models;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by hirenpatel on 03/10/17.
 */

public class LogicalModel {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 26;
    private static final int REQUIRED_NUMBERS = 10;

    public LogicalModel() {

    }

    // Generate list of random numbers
    public List<Integer> getRandomNumber() {
        List<Integer> randomNumList = new ArrayList<>();
        randomNumList.addAll(getRandomNumbner(MIN_RANGE, MAX_RANGE, REQUIRED_NUMBERS));
        return randomNumList;
    }

    /**
     * Check the number is even or not
     * @param number - Check #number is event or not
     * @return - true if number is unique else return false
     */
    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    /**
     * Create set of unique even integers
     * @param min - Minimum number for range
     * @param max - Maximum number for range
     * @param totalNoRequired - Number of elements you want to generate
     * @return - Set of even unique integer
     */
    private Set<Integer> getRandomNumbner(int min, int max, int totalNoRequired) {
        Random rng = new Random();
        Set<Integer> generatedList = new LinkedHashSet<>();
        while (generatedList.size() < totalNoRequired) {
            Integer radnomInt = rng.nextInt(max - min + 1) + min;
            if (isEvenNumber(radnomInt)) {
                generatedList.add(radnomInt);
            }
        }
        return generatedList;
    }
}
