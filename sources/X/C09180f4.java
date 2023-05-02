package X;

/* renamed from: X.0f4  reason: invalid class name and case insensitive filesystem */
public final class C09180f4 implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C09180f4(String str, String str2, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = str;
        this.A03 = str2;
    }

    /* renamed from: A00 */
    public int compareTo(C09180f4 r3) {
        C18450wi.A0H(r3, 0);
        int i2 = this.A00 - r3.A00;
        return i2 == 0 ? this.A01 - r3.A01 : i2;
    }
}
