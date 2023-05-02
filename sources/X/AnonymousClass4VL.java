package X;

import android.os.Build;
import android.os.Trace;

/* renamed from: X.4VL  reason: invalid class name */
public final class AnonymousClass4VL {
    public void A00() {
        if (C814548h.A00 && Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public void A01(String str) {
        if (C814548h.A00 && Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public boolean A02() {
        int i2;
        if (!C814548h.A00 || (i2 = Build.VERSION.SDK_INT) < 18) {
            return false;
        }
        return i2 < 29 || Trace.isEnabled();
    }
}
