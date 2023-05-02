package X;

import java.util.Enumeration;

/* renamed from: X.5IA  reason: invalid class name */
public class AnonymousClass5IA extends C32061fa {
    public static final AnonymousClass5II A04 = new AnonymousClass5II(C107275Hc.A00, C32031fX.A1E);
    public final C33041hq A00;
    public final C33041hq A01;
    public final C107405Ib A02;
    public final AnonymousClass5II A03;

    public AnonymousClass5IA(C32411gJ r5) {
        Enumeration A0B = r5.A0B();
        this.A02 = (C107405Ib) A0B.nextElement();
        this.A00 = (C33041hq) A0B.nextElement();
        if (A0B.hasMoreElements()) {
            Object nextElement = A0B.nextElement();
            if (nextElement instanceof C33041hq) {
                this.A01 = C33041hq.A00(nextElement);
                nextElement = A0B.hasMoreElements() ? A0B.nextElement() : nextElement;
            } else {
                this.A01 = null;
            }
            if (nextElement != null) {
                this.A03 = AnonymousClass5II.A00(nextElement);
                return;
            }
        } else {
            this.A01 = null;
        }
        this.A03 = null;
    }

    public AnonymousClass5IA(byte[] bArr, int i2) {
        this.A02 = new AnonymousClass5IT(C33111hx.A02(bArr));
        this.A00 = new C33041hq((long) i2);
        this.A01 = null;
        this.A03 = null;
    }

    public C32051fZ Agm() {
        C32391gH r2 = new C32391gH(4);
        r2.A02(this.A02);
        r2.A02(this.A00);
        C33041hq r0 = this.A01;
        if (r0 != null) {
            r2.A02(r0);
        }
        AnonymousClass5II r1 = this.A03;
        if (r1 != null && !r1.equals(A04)) {
            r2.A02(r1);
        }
        return new C32401gI(r2);
    }
}
