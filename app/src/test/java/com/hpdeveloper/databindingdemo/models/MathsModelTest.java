package com.hpdeveloper.databindingdemo.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Created by hirenpatel on 05/10/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MathsModelTest {

    private static final int EVEN_REMAINDER = 0;
    private static final int ODD_REMAINDER = 1;

    private int oddInput = 637;
    private int evenInput = 424;

    @Test
    public void setNumber() throws Exception {

        MathsModel mathsModel = spy(MathsModel.class);

        int remainder = getRemainder(mathsModel, evenInput);
        mathsModel.setNumber(remainder);

        remainder = getRemainder(mathsModel, oddInput);
        mathsModel.setNumber(remainder);

        verify(mathsModel, atLeastOnce()).setNumber(EVEN_REMAINDER);
        verify(mathsModel, atLeastOnce()).setNumber(ODD_REMAINDER);

        reset(mathsModel);

    }

    @Test
    public void acceptOnlyEvenArgs(){
        MathsModel mathsModel = spy(MathsModel.class);

        int remainder = getRemainder(mathsModel, evenInput);
        doThrow(new RuntimeException()).when(mathsModel).setNumber(ODD_REMAINDER);
        mathsModel.setNumber(remainder);

    }


    /**
     * Verify the order of method calling in sequence or not
     */
    @Test
    public void verifyMethodOrder(){
        MathsModel mathsModel = spy(MathsModel.class);
        mathsModel.setPrimaryMessage("1");
        mathsModel.setSecondaryMessage("2");

        InOrder inOrder = inOrder(mathsModel);
        inOrder.verify(mathsModel).setPrimaryMessage("1");
        inOrder.verify(mathsModel).setSecondaryMessage("2");

    }

    private int getRemainder(MathsModel mathsModel, int number) {
        return mathsModel.getRemainder(number);
    }

}