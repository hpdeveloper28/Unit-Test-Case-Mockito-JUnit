package com.hpdeveloper.databindingdemo.test;

import com.hpdeveloper.databindingdemo.models.LogicalModel;
import com.hpdeveloper.databindingdemo.models.Student;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import java.util.List;
import java.util.Properties;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.atLeast;

/**
 * Created by hirenpatel on 03/10/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class LuckyWinnerAlgoTest {


    private static final int TODAY_LUCKY_NUMBER = 24;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();


    @Test
    public void verifyMethod()  {
        // create and configure mock
        Student test = mock(Student.class);

        // call method
        test.testing(1);
        test.testing(1);
        test.testing(2);
        test.testing(3);

        // verify this method has called or not
        verify(test, times(2)).testing(1);

        verify(test, never()).getStudent();
        verify(test, atLeastOnce()).testing(1);
        verify(test, atLeast(2)).testing(1);

//        test.testing(12);
//        test.getId();
//        test.getFirstName();
//
//
//        // now check if method testing was called with the parameter 12
//        verify(test).testing(ArgumentMatchers.eq(12));
//
//        // was the method called twice?
//        verify(test, times(2)).getId();


//        // now check if method testing was called with the parameter 12
//        verify(test).testing(ArgumentMatchers.eq(12));
//
//        // was the method called twice?
//        verify(test, times(2)).getUniqueId();
//
//        // other alternatives for verifiying the number of method calls for a method
//        verify(test, never()).someMethod("never called");
//        verify(test, atLeastOnce()).someMethod("called at least once");
//        verify(test, atLeast(2)).someMethod("called at least twice");
//        verify(test, times(5)).someMethod("called five times");
//        verify(test, atMost(3)).someMethod("called at most 3 times");
//        // This let's you check that no other methods where called on this object.
//        // You call it after you have verified the expected method calls.
//        verifyNoMoreInteractions(test);
    }

    @Test
    public void displayResult(){
        Properties properties = mock(Properties.class);

        when(properties.get("Anddroid")).thenThrow(new IllegalArgumentException());

        try {
            properties.get("Anddroid");
            properties.get("iOS");
            fail("Anddroid is misspelled");
        } catch (IllegalArgumentException ex) {
            System.out.println("Got Android word");
        }
    }



    private List<Integer> capturedArgument;

    @Before
    public void setupData(){
//        LogicalModel logicalModel = mock(LogicalModel.class);
        LogicalModel logicalModel = Mockito.spy(new LogicalModel());

        when(logicalModel.getRandomNumber()).thenCallRealMethod();

        List<Integer> mockedList = mock(List.class);
        mockedList.addAll(logicalModel.getRandomNumber());

        verify(mockedList).addAll(captor.capture());
        capturedArgument = captor.getValue();
    }


    @Test
    public void createEvenNumSeries() {

        assertThat(capturedArgument, hasItem(TODAY_LUCKY_NUMBER));
        assertTrue(capturedArgument.contains(TODAY_LUCKY_NUMBER));
        assertEquals("Total lucky numbers", 10, capturedArgument.size());


//        when(capturedArgument.contains(TODAY_LUCKY_NUMBER)).thenReturn(true);

    }

    @Captor
    private ArgumentCaptor<List<Integer>> captor;
}
