package com.hpdeveloper.databindingdemo.test;

import com.hpdeveloper.databindingdemo.models.Student;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hirenpatel on 03/10/17.
 */

public class ExampleMockitoUnitTest {


    @Test
    public void blockLinkedList() {
        List mockedList = mock(List.class);

        when(mockedList.get(0)).thenReturn("Android");

        System.out.println(mockedList.get(0));

        System.out.println(mockedList.get(1));
    }


    @Test
    public void testModel() {
        Student mockStudent = mock(Student.class);

        when(mockStudent.getId()).thenReturn(getStudent().getId());
        assertEquals(mockStudent.getId(), 1);

    }

    @Test
    public void multipleReturn() {
        Iterator<String> items = mock(Iterator.class);

        when(items.next()).thenReturn("A").thenReturn("B").thenReturn("C");

        String result = items.next() + items.next() + items.next();
        System.out.println(result);
    }

    private Student getStudent() {
        return new Student(1, "Hiren", "Patel");
    }
}
