package X;

import java.util.Map;

/* renamed from: X.0Ka  reason: invalid class name and case insensitive filesystem */
public enum C03830Ka {
    ;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        A00 = AnonymousClass000.A0x();
        for (C03830Ka r3 : values()) {
            if (r3 == A02) {
                A00.put("class", r3);
            } else if (r3 != A03) {
                A00.put(r3.name().replace('_', '-'), r3);
            }
        }
    }

    public static C03830Ka A00(String str, int i2) {
        return new C03830Ka(str, i2);
    }
}
