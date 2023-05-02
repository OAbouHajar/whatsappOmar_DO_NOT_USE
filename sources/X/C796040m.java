package X;

/* renamed from: X.40m  reason: invalid class name and case insensitive filesystem */
public enum C796040m {
    REFERRAL(0),
    SESSION_ID(1),
    ADDITIONAL_PARAMS(2);
    
    public final String key;

    /* access modifiers changed from: public */
    static {
        REFERRAL = new C796040m("REFERRAL", "referral", 0);
        SESSION_ID = new C796040m("SESSION_ID", "session_id", 1);
        ADDITIONAL_PARAMS = new C796040m("ADDITIONAL_PARAMS", "additional_params", 2);
    }

    /* access modifiers changed from: public */
    C796040m(int i2) {
        this.key = r2;
    }
}
