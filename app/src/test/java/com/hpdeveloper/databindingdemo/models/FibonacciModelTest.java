package com.hpdeveloper.databindingdemo.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by hirenpatel on 04/10/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class FibonacciModelTest {

    private FibonacciModel fibonacciModel;
    private String desiredOutput = "1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89";

    @Before
    public void setup() {
        fibonacciModel = new FibonacciModel();
    }

    @Test
    public void getSeries() throws Exception {
        assertEquals(fibonacciModel.generateFibonacciRecursive(11), desiredOutput);
    }


    @After
    public void destroy() {
        fibonacciModel = null;
    }
}