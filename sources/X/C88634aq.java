package X;

/* renamed from: X.4aq  reason: invalid class name and case insensitive filesystem */
public class C88634aq {
    public final int A00;
    public final String A01;

    public C88634aq(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public C88634aq(AnonymousClass3GL r2, int i2) {
        this.A00 = i2;
        this.A01 = r2.getId();
    }

    public boolean A00(int i2) {
        boolean z2 = this instanceof C78413y0;
        int i3 = this.A00;
        return z2 ? i2 >= i3 && i2 < i3 + 4 : AnonymousClass000.A1R(i2, i3);
    }
}
