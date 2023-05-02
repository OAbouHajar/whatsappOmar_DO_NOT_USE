package com.whatsapp.util;

import java.io.Closeable;

public class OpusRecorder implements Closeable {
    public long nativeHandle;

    public OpusRecorder(String str, int i2) {
        allocateNative(str, i2);
    }

    private native void allocateNative(String str, int i2);

    private native void freeNative();

    public void close() {
        freeNative();
    }

    public void finalize() {
        super.finalize();
        if (this.nativeHandle != 0) {
            freeNative();
        }
    }

    public native long getPageNumber();

    public native boolean isRecording();

    public native void pause();

    public native void prepare();

    public native void setInitialVariablesForResume(long j2, long j3);

    public native void start();

    public native void stop();
}
