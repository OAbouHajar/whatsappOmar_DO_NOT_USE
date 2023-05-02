package X;

import android.os.Build;

/* renamed from: X.0Vo  reason: invalid class name */
public class AnonymousClass0Vo {
    public static final AnonymousClass0WS A00 = (Build.VERSION.SDK_INT >= 21 ? new C02770Ew() : null);
    public static final AnonymousClass0WS A01;

    static {
        AnonymousClass0WS r0;
        try {
            r0 = C02780Ex.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r0 = null;
        }
        A01 = r0;
    }
}
