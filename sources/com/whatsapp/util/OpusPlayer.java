package com.whatsapp.util;

import java.io.Closeable;

public class OpusPlayer implements Closeable {
    public long nativeHandle;

    public OpusPlayer(String str, int i2) {
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

    public native long getCurrentPosition();

    public native long getLength();

    public native boolean isPlaying();

    public native void pause();

    public native void prepare();

    public native void resume();

    public native void seek(long j2);

    public native void start();

    public native void stop();
}
