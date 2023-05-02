package X;

/* renamed from: X.0wR  reason: invalid class name and case insensitive filesystem */
public class C18280wR {
    public AnonymousClass2H5 A00 = null;
    public final C16980tz A01;
    public final C18300wT A02;
    public final AnonymousClass174 A03;
    public final C18290wS A04;

    public C18280wR(C16980tz r2, C18300wT r3, AnonymousClass174 r4, C18290wS r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final AnonymousClass2H5 A00() {
        C228919r AEp;
        AnonymousClass174 r2 = this.A03;
        C28391Vx A022 = r2.A01() != null ? this.A04.A02(r2.A01().A03) : null;
        C28411Vz A002 = r2.A00();
        String str = A002 != null ? ((C35491m1) A002).A04 : null;
        if (A022 == null || (AEp = A022.AEp(str)) == null) {
            return null;
        }
        return AEp.AEV(this.A01, this.A02);
    }

    public String A01() {
        AnonymousClass2H5 r0 = this.A00;
        if (r0 == null) {
            r0 = A00();
            this.A00 = r0;
            if (r0 == null) {
                return null;
            }
        }
        return r0.getId();
    }
}
