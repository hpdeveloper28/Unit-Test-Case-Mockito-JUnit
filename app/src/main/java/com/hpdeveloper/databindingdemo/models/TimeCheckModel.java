package com.hpdeveloper.databindingdemo.models;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by hirenpatel on 04/10/17.
 */

public class TimeCheckModel {

    public TimeCheckModel() {

    }

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({MORNING, NOON, EVENING, NIGHT})
    public @interface Time {
    }

    // Declare the constants
    public static final int MORNING = 0;
    public static final int NOON = 1;
    public static final int EVENING = 2;
    public static final int NIGHT = 3;


    public String getDailyMessage(int hours) {
        if (hours >= 1 && hours <= 12) {
            return "Good Morning";
        } else if (hours >= 12 && hours <= 16) {
            return "Good Afternoon";
        } else if (hours >= 16 && hours <= 21) {
            return "Good Evening";
        } else if (hours >= 21 && hours <= 24) {
            return "Good Night";
        }
        return "";
    }


}
