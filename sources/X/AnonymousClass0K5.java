package X;

import java.util.Map;

/* renamed from: X.0K5  reason: invalid class name */
public enum AnonymousClass0K5 {
    nth_child,
    nth_of_type,
    nth_last_of_type,
    UNSUPPORTED;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        A00 = AnonymousClass000.A0x();
        for (AnonymousClass0K5 r3 : values()) {
            if (r3 != UNSUPPORTED) {
                A00.put(r3.name().replace('_', '-'), r3);
            }
        }
    }
}
