package X;

/* renamed from: X.5I8  reason: invalid class name */
public class AnonymousClass5I8 extends C32061fa {
    public int A00;
    public byte[] A01;

    public AnonymousClass5I8(C32411gJ r3) {
        this.A01 = C107405Ib.A01(AnonymousClass3K3.A0u(r3)).A00;
        this.A00 = r3.A0A() == 2 ? C33041hq.A00(AnonymousClass3K4.A0h(r3)).A0A() : 12;
    }

    public AnonymousClass5I8(byte[] bArr, int i2) {
        this.A01 = C33111hx.A02(bArr);
        this.A00 = i2;
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(new AnonymousClass5IT(this.A01));
        int i2 = this.A00;
        if (i2 != 12) {
            A0v.A02(new C33041hq((long) i2));
        }
        return new C32401gI(A0v);
    }
}
