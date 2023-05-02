package X;

import java.util.Map;

/* renamed from: X.0K7  reason: invalid class name */
public enum AnonymousClass0K7 {
    ;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        A00 = AnonymousClass000.A0x();
        for (AnonymousClass0K7 r2 : values()) {
            if (r2 == A02) {
                A00.put("switch", r2);
            } else if (r2 != A03) {
                A00.put(r2.name(), r2);
            }
        }
    }

    public static AnonymousClass0K7 A00(String str, int i2) {
        return new AnonymousClass0K7(str, i2);
    }
}
