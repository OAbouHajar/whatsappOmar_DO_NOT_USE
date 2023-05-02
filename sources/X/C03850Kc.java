package X;

/* renamed from: X.0Kc  reason: invalid class name and case insensitive filesystem */
public enum C03850Kc {
    AUTO(0),
    ENABLED(1),
    DISABLED(2);
    
    public static final C03850Kc[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    /* access modifiers changed from: public */
    C03850Kc(int i2) {
        this.value = r2;
    }

    public static C03850Kc A00(String str) {
        for (C03850Kc r1 : A00) {
            if (r1.toString().equals(str)) {
                return r1;
            }
        }
        C29691b2.A00("CdsOpenScreenConfig", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Error finding DimmedBackgroundTapToDismiss enum value for: ")));
        return AUTO;
    }

    public String toString() {
        return this.value;
    }
}
