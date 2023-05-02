package X;

/* renamed from: X.5Hs  reason: invalid class name */
public class AnonymousClass5Hs extends C32061fa {
    public int A00;
    public AnonymousClass5HY A01;
    public AnonymousClass5II A02;
    public AnonymousClass5Hl A03;
    public boolean A04 = false;

    public AnonymousClass5Hs(C32411gJ r4) {
        if (r4.A0A() == 3) {
            C32071fb A0C = r4.A0C(0);
            this.A03 = A0C instanceof AnonymousClass5Hl ? (AnonymousClass5Hl) A0C : A0C != null ? new AnonymousClass5Hl(C32411gJ.A00(A0C)) : null;
            this.A02 = AnonymousClass5II.A00(AnonymousClass3K4.A0h(r4));
            this.A01 = AnonymousClass5HY.A00(r4.A0C(2));
            return;
        }
        throw AnonymousClass000.A0T("sequence wrong size for CertificateList");
    }

    public C32051fZ Agm() {
        C32391gH r1 = new C32391gH(3);
        r1.A02(this.A03);
        r1.A02(this.A02);
        return AnonymousClass3K3.A0x(this.A01, r1);
    }

    public int hashCode() {
        if (!this.A04) {
            this.A00 = super.hashCode();
            this.A04 = true;
        }
        return this.A00;
    }
}
