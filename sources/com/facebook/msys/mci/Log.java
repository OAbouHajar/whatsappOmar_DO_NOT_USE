package com.facebook.msys.mci;

import X.C004201v;
import X.C48832Pi;

public class Log {
    public static boolean sRegistered;

    public static int getWaLogLevel(int i2) {
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 != 5) {
            return i2 != 7 ? 1 : 0;
        }
        return 2;
    }

    public static void log(int i2, String str) {
        int waLogLevel = getWaLogLevel(i2);
        StringBuilder sb = new StringBuilder("wamsys/");
        sb.append(str);
        com.whatsapp.util.Log.log(waLogLevel, sb.toString());
    }

    public static synchronized boolean registerLogger(C48832Pi r3) {
        boolean z2;
        synchronized (Log.class) {
            C004201v.A01("registerLogger");
            try {
                if (sRegistered) {
                    z2 = false;
                } else {
                    registerLoggerNative(0, 0, false);
                    setLogLevel(4);
                    z2 = true;
                    sRegistered = true;
                }
            } finally {
                C004201v.A00();
            }
        }
        return z2;
    }

    public static native void registerLoggerNative(long j2, int i2, boolean z2);

    public static native void setLogLevel(int i2);
}
