package com.hpdeveloper.databindingdemo.Utility;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by hirenpatel on 04/10/17.
 */
@RunWith(value = Theories.class)
public class DomainUtilsTheoryTest {

    @Theory
    public void isValidDomain(String domainName) {
        assertThat(DomainUtils.isValid(domainName), is(true));
    }

    @DataPoints
    public static String[] candidates = {"www.google.com", "www.facebook.com", "www.yahoo.com"};

}