package X;

/* renamed from: X.3VN  reason: invalid class name */
public final class AnonymousClass3VN extends AnonymousClass3VO {
    public C97284ph A00;
    public AnonymousClass3VR A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass4XE A05;
    public final C89324by A06;
    public final AnonymousClass2PW A07;
    public final boolean A08;

    public AnonymousClass3VN(AnonymousClass2PW r6, boolean z2) {
        this.A07 = r6;
        this.A08 = z2 && !(r6 instanceof AnonymousClass3VM);
        this.A06 = new C89324by();
        this.A05 = new AnonymousClass4XE();
        if (r6 instanceof AnonymousClass3VM) {
            AnonymousClass3VM r62 = (AnonymousClass3VM) r6;
            int i2 = r62.A00;
            AnonymousClass3VR r0 = r62.A01.A01;
            this.A01 = new AnonymousClass3VR(i2 != Integer.MAX_VALUE ? new AnonymousClass3UD(r0, i2) : new AnonymousClass3VP(r0), (Object) null, (Object) null);
            this.A02 = true;
            return;
        }
        this.A01 = new AnonymousClass3VR(new AnonymousClass3UO(r6.ADS()), C89324by.A0F, AnonymousClass3VR.A02);
    }

    public void A01() {
        this.A04 = false;
        this.A03 = false;
        super.A01();
    }

    public void A03(AnonymousClass5LZ r2) {
        super.A03(r2);
        if (!this.A08) {
            this.A03 = true;
            A04(this.A07);
        }
    }

    /* renamed from: A05 */
    public C97284ph A7W(C30271c3 r4, AnonymousClass5RB r5, long j2) {
        C97284ph r2 = new C97284ph(r4, r5, j2);
        AnonymousClass2PW r1 = this.A07;
        C90524eJ.A04(AnonymousClass000.A1W(r2.A03));
        r2.A03 = r1;
        if (this.A04) {
            Object obj = r4.A04;
            if (this.A01.A00 != null && obj.equals(AnonymousClass3VR.A02)) {
                obj = this.A01.A00;
            }
            r2.A00(r4.A01(obj));
        } else {
            this.A00 = r2;
            if (!this.A03) {
                this.A03 = true;
                A04(r1);
                return r2;
            }
        }
        return r2;
    }

    public final void A06(long j2) {
        C97284ph r6 = this.A00;
        int A042 = this.A01.A04(r6.A05.A04);
        if (A042 != -1) {
            long j3 = this.A01.A08(this.A05, A042, false).A01;
            if (j3 != -9223372036854775807L && j2 >= j3) {
                j2 = Math.max(0, j3 - 1);
            }
            r6.A00 = j2;
        }
    }

    public C86924Ur ADS() {
        return this.A07.ADS();
    }

    public void Abl(C15070qH r3) {
        C97284ph r0 = (C97284ph) r3;
        C15070qH r1 = r0.A02;
        if (r1 != null) {
            r0.A03.Abl(r1);
        }
        if (r3 == this.A00) {
            this.A00 = null;
        }
    }
}
