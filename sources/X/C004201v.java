package X;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: X.01v  reason: invalid class name and case insensitive filesystem */
public final class C004201v {
    public static Method A00;
    public static Method A01;
    public static Method A02;
    public static Method A03;

    static {
        Class<String> cls = String.class;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 18 && i2 < 29) {
            Class<Trace> cls2 = Trace.class;
            try {
                cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                A02 = cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                A00 = cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                A01 = cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                A03 = cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 18) {
            AnonymousClass034.A00();
        }
    }

    public static void A01(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            AnonymousClass034.A01(str);
        }
    }
}
