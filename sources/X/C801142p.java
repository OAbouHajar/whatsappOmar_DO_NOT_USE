package X;

/* renamed from: X.42p  reason: invalid class name and case insensitive filesystem */
public enum C801142p {
    UPTO_DATE(0, true, true),
    FETCH_ERROR(1, false, false),
    NETWORK_ERROR(2, false, false),
    LANGUAGE_UNAVAILABLE(3, false, true);
    
    public final boolean fetchSuccessful;
    public final String fieldStatString;
    public final boolean gotDictionary;

    /* access modifiers changed from: public */
    C801142p(int i2, boolean z2, boolean z3) {
        this.gotDictionary = z2;
        this.fetchSuccessful = z3;
        this.fieldStatString = r2;
    }
}
