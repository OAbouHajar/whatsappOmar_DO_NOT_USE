package X;

/* renamed from: X.0Ke  reason: invalid class name and case insensitive filesystem */
public enum C03870Ke {
    STATIC(0),
    ANIMATED(1),
    ANIMATED_WHILE_LOADING(2),
    DISABLED(4);
    
    public static final C03870Ke[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    /* access modifiers changed from: public */
    C03870Ke(int i2) {
        this.value = r2;
    }

    public static C03870Ke A00(String str) {
        for (C03870Ke r1 : A00) {
            if (r1.toString().equals(str)) {
                return r1;
            }
        }
        C29691b2.A00("CdsOpenScreenConfig", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Error finding BackgroundMode enum value for: ")));
        return STATIC;
    }

    public String toString() {
        return this.value;
    }
}
