package com.hpdeveloper.databindingdemo.Utility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by hirenpatel on 04/10/17.
 */
@RunWith(value = Parameterized.class)
public class DomainUtilsTest {

    @Parameterized.Parameter(value = 0)
    public String domainName;

    @Parameterized.Parameters(name = "{index}: testDomain - {0}")
    public static List<String> data(){
        return Arrays.asList(new String[] {"www.google.com","www.facebook.com","www.yahoo.com"});
    }

    @Test
    public void isValid() throws Exception {
        assertThat(DomainUtils.isValid(domainName), is(true));
    }

}