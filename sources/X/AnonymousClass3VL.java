package X;

import android.net.Uri;

@Deprecated
/* renamed from: X.3VL  reason: invalid class name */
public final class AnonymousClass3VL extends AnonymousClass3VO {
    public final AnonymousClass3VK A00;

    public AnonymousClass3VL(Uri uri, C108255Ng r8, C108355Nq r9, AnonymousClass5LY r10, Object obj) {
        C86284Rz r0 = new C86284Rz();
        r0.A00 = uri;
        r0.A01 = obj;
        this.A00 = new AnonymousClass3VK(r0.A00(), AnonymousClass5TW.A00, r8, r9, r10);
    }

    public void A03(AnonymousClass5LZ r2) {
        super.A03(r2);
        A04(this.A00);
    }

    public C15070qH A7W(C30271c3 r2, AnonymousClass5RB r3, long j2) {
        return this.A00.A7W(r2, r3, j2);
    }

    public C86924Ur ADS() {
        return this.A00.A06;
    }

    public void Abl(C15070qH r2) {
        this.A00.Abl(r2);
    }
}
