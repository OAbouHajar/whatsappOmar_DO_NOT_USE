package X;

/* renamed from: X.0p4  reason: invalid class name and case insensitive filesystem */
public final class C14380p4 {
    public final String A00;

    public C14380p4(String str, String str2) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        } else if (str2 == null || str2.length() <= 0) {
            this.A00 = null;
        } else {
            this.A00 = str2;
        }
    }
}
