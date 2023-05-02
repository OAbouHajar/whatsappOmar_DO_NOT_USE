package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.4e9  reason: invalid class name and case insensitive filesystem */
public class C90444e9 {
    public static final C90444e9 A01 = new C90444e9(true);
    public static volatile C90444e9 A02;
    public static volatile C90444e9 A03;
    public final Map A00;

    public C90444e9() {
        this.A00 = AnonymousClass000.A0x();
    }

    public C90444e9(boolean z2) {
        this.A00 = Collections.emptyMap();
    }

    public static C90444e9 A00() {
        C90444e9 r0;
        C90444e9 r02 = A02;
        if (r02 != null) {
            return r02;
        }
        synchronized (C90444e9.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = A01;
                A02 = r0;
            }
        }
        return r0;
    }
}
