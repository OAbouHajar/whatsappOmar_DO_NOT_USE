package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.0tz  reason: invalid class name and case insensitive filesystem */
public class C16980tz {
    public Context A00;

    public C16980tz(Context context) {
        this.A00 = context;
    }

    public static Resources A00(C16980tz r0) {
        return r0.A00.getResources();
    }

    public Context A01() {
        return this.A00;
    }

    public String A02(int i2) {
        return this.A00.getResources().getString(i2);
    }
}
