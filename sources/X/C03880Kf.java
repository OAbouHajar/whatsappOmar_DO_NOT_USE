package X;

/* renamed from: X.0Kf  reason: invalid class name and case insensitive filesystem */
public enum C03880Kf {
    FULL_SHEET(0),
    HALF_SHEET(1),
    FULL_SCREEN(3),
    FLEXIBLE_SHEET(4);
    
    public static final C03880Kf[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        A00 = values();
    }

    /* access modifiers changed from: public */
    C03880Kf(int i2) {
        this.value = r2;
    }

    public static C03880Kf A00(String str) {
        for (C03880Kf r1 : A00) {
            if (r1.toString().equals(str)) {
                return r1;
            }
        }
        C29691b2.A00("CdsOpenScreenConfig", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Error finding Mode enum value for ")));
        return FULL_SHEET;
    }

    public String toString() {
        return this.value;
    }
}
