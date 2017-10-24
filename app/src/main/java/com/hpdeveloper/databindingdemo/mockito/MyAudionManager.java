package com.hpdeveloper.databindingdemo.mockito;

import android.media.AudioManager;

import static android.media.AudioManager.RINGER_MODE_SILENT;
import static android.media.AudioManager.STREAM_RING;

/**
 * Created by hirenpatel on 03/10/17.
 */

public class MyAudionManager {

    public MyAudionManager() {

    }
    public void maximizeVolume(AudioManager audioManager) {
        if (audioManager.getRingerMode() != RINGER_MODE_SILENT) {
            int max = audioManager.getStreamMaxVolume(STREAM_RING);
            audioManager.setStreamVolume(STREAM_RING, max, 0);
        }
    }
}
