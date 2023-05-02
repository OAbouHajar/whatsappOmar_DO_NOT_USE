package X;

/* renamed from: X.0Kd  reason: invalid class name and case insensitive filesystem */
public enum C03860Kd {
    AUTO(0),
    ENABLED(1),
    DISABLED(2);
    
    public static final C03860Kd[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    /* access modifiers changed from: public */
    C03860Kd(int i2) {
        this.value = r2;
    }

    public static C03860Kd A00(String str) {
        for (C03860Kd r1 : A00) {
            if (r1.toString().equals(str)) {
                return r1;
            }
        }
        C29691b2.A00("CdsOpenScreenConfig", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Error finding DragToDismiss enum value for: ")));
        return AUTO;
    }

    public String toString() {
        return this.value;
    }
}
