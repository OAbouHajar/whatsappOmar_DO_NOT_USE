package X;

import android.content.Intent;

/* renamed from: X.22U  reason: invalid class name */
public class AnonymousClass22U {
    public static void A00(Intent intent, String str) {
        if (!intent.hasExtra("perf_start_time_ns")) {
            intent.putExtra("perf_start_time_ns", System.nanoTime());
        }
        if (!intent.hasExtra("perf_origin")) {
            intent.putExtra("perf_origin", str);
        }
    }

    public static void A01(Intent intent, String str) {
        if (!intent.hasExtra("perf_origin")) {
            intent.putExtra("perf_origin", str);
        }
    }
}
