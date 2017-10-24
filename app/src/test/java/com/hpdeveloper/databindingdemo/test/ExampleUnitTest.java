package com.hpdeveloper.databindingdemo.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsNot.not;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private List<String> names = new ArrayList<>();

    private static final int x = 4;

    @Test
    public void validateNumber() throws Exception {
        assertThat(x, is(not(3)));
    }

    @Test
    public void validateObjectInList() throws Exception {
        names.add("Android");
        names.add("iOS");
        names.add("Windows");
        assertThat(names, hasItem("Windows"));
    }

    @Test
    public void validateListSize() throws Exception {
        names.add("Android");
        names.add("iOS");
        names.add("Windows");
        assertEquals("Size match", 3, names.size());
    }


}