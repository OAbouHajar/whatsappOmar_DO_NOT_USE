package com.facebook.common.time;

import X.C12890l8;
import android.os.SystemClock;

public class RealtimeSinceBootClock implements C12890l8 {
    public static final RealtimeSinceBootClock A00 = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
