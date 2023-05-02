package X;

/* renamed from: X.1N7  reason: invalid class name */
public final class AnonymousClass1N7 {
    public C31081dR A00;
    public final C226718v A01;
    public final C14710pd A02;

    public AnonymousClass1N7(C226718v r2, C14710pd r3) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A00(String str) {
        if (this.A02.A0E(C16620tM.A02, 2396)) {
            C31081dR r1 = this.A00;
            if (r1 != null) {
                r1.A0C(4);
            }
            C31091dS r3 = new C31091dS(185473396);
            C31081dR A002 = this.A01.A00(r3, "QrScanFlow");
            this.A00 = A002;
            r3.A03 = true;
            C18450wi.A0F(A002);
            A002.A0D(str, -1);
            A002.A0A("entry_point", str, false);
            A002.A08("scan_qr_code");
        }
    }

    public final void A01(short s2) {
        C31081dR r1;
        if (this.A02.A0E(C16620tM.A02, 2396) && (r1 = this.A00) != null) {
            r1.A07("scan_qr_code");
            r1.A0C(s2);
            this.A00 = null;
        }
    }
}
