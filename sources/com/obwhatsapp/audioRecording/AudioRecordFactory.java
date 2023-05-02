package com.obwhatsapp.audioRecording;

import android.media.AudioRecord;

public class AudioRecordFactory {
    public AudioRecord createAudioRecord(int i2, int i3) {
        return new AudioRecord(0, i2, 16, 2, i3);
    }
}
