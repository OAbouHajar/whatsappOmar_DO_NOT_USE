package X;

/* renamed from: X.2Hk  reason: invalid class name and case insensitive filesystem */
public final class C47082Hk {
    public final String A00;
    public final boolean A01;

    public C47082Hk(String str, boolean z2) {
        this.A00 = str;
        this.A01 = z2;
    }

    public final String toString() {
        String str = this.A00;
        boolean z2 = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z2);
        return sb.toString();
    }
}
