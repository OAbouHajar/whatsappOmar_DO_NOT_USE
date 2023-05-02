package X;

import java.util.Map;

/* renamed from: X.43B  reason: invalid class name */
public enum AnonymousClass43B {
    ;
    
    public static final Map A00 = null;
    public static final Map A01 = null;
    public final String[] otherEncodingNames;
    public final int[] values;

    /* access modifiers changed from: public */
    static {
        A01 = AnonymousClass000.A0x();
        A00 = AnonymousClass000.A0x();
        for (AnonymousClass43B r5 : values()) {
            for (int valueOf : r5.values) {
                A01.put(Integer.valueOf(valueOf), r5);
            }
            A00.put(r5.name(), r5);
            for (String put : r5.otherEncodingNames) {
                A00.put(put, r5);
            }
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass43B(String[] strArr, int i2) {
        this.values = r2;
        this.otherEncodingNames = strArr;
    }

    /* access modifiers changed from: public */
    AnonymousClass43B(int i2, int i3) {
        this.values = new int[]{i3};
        this.otherEncodingNames = r4;
    }
}
