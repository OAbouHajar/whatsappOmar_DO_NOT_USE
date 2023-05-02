package X;

import java.util.Map;

/* renamed from: X.42n  reason: invalid class name and case insensitive filesystem */
public enum C800942n {
    OBJECT(2, 0);
    
    public static final Map A00 = null;
    public final int size;
    public final int typeId;

    /* access modifiers changed from: public */
    static {
        int i2;
        A00 = AnonymousClass000.A0x();
        for (C800942n r2 : values()) {
            A00.put(Integer.valueOf(r2.typeId), r2);
        }
    }

    /* access modifiers changed from: public */
    C800942n(int i2, int i3) {
        this.typeId = i2;
        this.size = i3;
    }
}
