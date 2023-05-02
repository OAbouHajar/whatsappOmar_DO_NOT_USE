package X;

/* renamed from: X.4p0  reason: invalid class name and case insensitive filesystem */
public final class C96854p0 implements AnonymousClass5SM {
    public long A00 = -1;
    public long A01 = -1;
    public AnonymousClass4G8 A02;
    public C90654eW A03;

    public C96854p0(AnonymousClass4G8 r3, C90654eW r4) {
        this.A03 = r4;
        this.A02 = r3;
    }

    public C32371gD A7a() {
        long j2 = this.A00;
        C90524eJ.A04(AnonymousClass000.A1O((j2 > -1 ? 1 : (j2 == -1 ? 0 : -1))));
        return new C96684oj(this.A03, j2);
    }

    public long AbP(C55142iu r9) {
        long j2 = this.A01;
        if (j2 < 0) {
            return -1;
        }
        long j3 = -(j2 + 2);
        this.A01 = -1;
        return j3;
    }

    public void Ag7(long j2) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AnonymousClass3C1.A04(jArr, j2, true)];
    }
}
