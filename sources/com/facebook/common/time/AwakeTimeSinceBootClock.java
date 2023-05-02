package com.facebook.common.time;

import X.C12890l8;
import android.os.SystemClock;

public class AwakeTimeSinceBootClock implements C12890l8 {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    public long now() {
        return SystemClock.uptimeMillis();
    }

    public long nowNanos() {
        return System.nanoTime();
    }
}
