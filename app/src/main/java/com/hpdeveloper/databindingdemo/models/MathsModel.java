package com.hpdeveloper.databindingdemo.models;

import android.util.Log;

/**
 * Created by hirenpatel on 05/10/17.
 */

public class MathsModel {

    private static final String TAG = MathsModel.class.getSimpleName();

    // Default empty constructor
    public MathsModel() {

    }

    // This method required to call at least 2 times with 1 Odd number and 1 Even number
    public void setNumber(int remainder) {
        // TODO implementation
        Log.i(TAG, String.valueOf(remainder));
    }

    public int getRemainder(int number) {
        return number % 2;
    }


    /**
     *
     * @param message - Set message with X key in shared preference
     */
    public void setPrimaryMessage(String message){
        // TODO implementation
    }


    /**
     *
     * @param message - Update message with X key in shared preference
     */
    public void setSecondaryMessage(String message){
        // TODO implementation
    }

}
