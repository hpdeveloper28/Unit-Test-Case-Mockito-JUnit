package com.hpdeveloper.databindingdemo.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Created by hirenpatel on 04/10/17.
 */

@RunWith(value = Parameterized.class)
public class CalculatorTest {

    @Parameterized.Parameter(value = 0)
    public int numberA;

    @Parameterized.Parameter(value = 1)
    public int numberB;

    @Parameterized.Parameter(value = 2)
    public int result;

    @Parameterized.Parameters(name = "{index}:add({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }


    @InjectMocks
    private Calculator calculator = new Calculator();

    @Test
    public void add() throws Exception {

        given(calculator.add(numberA, numberB)).willReturn(result);

        int resultAddition = calculator.add(numberA, numberB);
        assertThat(resultAddition, is(result));
//        when(calculator.add(numberA, numberB)).thenAnswer(new Answer<Double>() {
//
//            @Override
//            public Double answer(InvocationOnMock invocation) throws Throwable {
//                //get the arguments passed to mock
//                Object[] args = invocation.getArguments();
//
//                //get the mock
//                Object mock = invocation.getMock();
//
//                //return the result
//                return 30.0;
//            }
//        });
    }

    @Test
    public void sub() throws Exception {
        double resultSubtraction = calculator.sub(40, 20);
        assertThat(resultSubtraction, is(equalTo(20d)));
    }

    @Test
    public void div() throws Exception {
        double resultDivision = calculator.div(100, 25);
        assertThat(resultDivision, is(equalTo(4d)));

    }

    @Test
    public void mul() throws Exception {
        double resultMultiplier = calculator.mul(5, 5);
        assertThat(resultMultiplier, is(equalTo(25d)));
    }

}