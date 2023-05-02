package X;

/* renamed from: X.2xA  reason: invalid class name and case insensitive filesystem */
public class C59382xA extends AnonymousClass2G6 {
    public final AnonymousClass2GB A00;
    public final byte[] A01;
    public final byte[] A02;

    public C59382xA(AnonymousClass2G7 r6, byte[] bArr, byte[] bArr2) {
        this.A02 = bArr;
        this.A01 = bArr2;
        C28581Wr A0U = AnonymousClass2GB.A05.A0U();
        AnonymousClass42E r2 = AnonymousClass42E.A01;
        AnonymousClass2GB r1 = (AnonymousClass2GB) C28581Wr.A00(A0U);
        r1.A00 |= 1;
        r1.A01 = r2.value;
        C28581Wr A0U2 = AnonymousClass2t0.A02.A0U();
        C28631Ww A012 = C28631Ww.A01(bArr2, 0, bArr2.length);
        AnonymousClass2t0 r12 = (AnonymousClass2t0) C28581Wr.A00(A0U2);
        r12.A00 |= 1;
        r12.A01 = A012;
        AnonymousClass2GB r13 = (AnonymousClass2GB) C28581Wr.A00(A0U);
        r13.A03 = (AnonymousClass2t0) A0U2.A02();
        r13.A00 |= 4;
        if (r6 != null) {
            AnonymousClass2GB r14 = (AnonymousClass2GB) C28581Wr.A00(A0U);
            r14.A02 = r6;
            r14.A00 |= 8;
        }
        this.A00 = (AnonymousClass2GB) A0U.A02();
    }
}
