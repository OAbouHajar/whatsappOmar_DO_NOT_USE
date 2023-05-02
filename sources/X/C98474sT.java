package X;

/* renamed from: X.4sT  reason: invalid class name and case insensitive filesystem */
public final class C98474sT implements AnonymousClass5M3 {
    public final int A00;
    public final C109905Uc A01;
    public final String A02;
    public final Object[] A03;

    public C98474sT(C109905Uc r6, String str, Object[] objArr) {
        char charAt;
        this.A01 = r6;
        this.A02 = str;
        this.A03 = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c2 = charAt2 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                charAt = str.charAt(i3);
                if (charAt < 55296) {
                    break;
                }
                c2 |= (charAt & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
            charAt2 = c2 | (charAt << i2);
        }
        this.A00 = charAt2;
    }
}
