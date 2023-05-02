package X;

/* renamed from: X.2Ss  reason: invalid class name and case insensitive filesystem */
public final class C49382Ss {
    public static final AnonymousClass2St A00() {
        AnonymousClass2St r2 = new AnonymousClass2St((String) null, new AnonymousClass2St[0]);
        r2.A01("p2m_type", "p2m_lite");
        r2.A01("merchant_type", "api");
        return r2;
    }

    public static final String A01(Integer num) {
        if (num == null) {
            return "UNKNOWN";
        }
        int intValue = num.intValue();
        return intValue == 1 ? "DIGITAL_GOODS" : intValue == 2 ? "PHYSICAL_GOODS" : "UNKNOWN";
    }
}
