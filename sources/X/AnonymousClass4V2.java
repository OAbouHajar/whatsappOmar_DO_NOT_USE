package X;

/* renamed from: X.4V2  reason: invalid class name */
public final class AnonymousClass4V2 {
    public final C28371Vv A00;
    public final AnonymousClass4UM A01;
    public final C86594Tk A02;
    public final C86604Tl A03;
    public final C86614Tm A04;
    public final C86624Tn A05;

    public AnonymousClass4V2(C16300so r5, C28371Vv r6) {
        C28371Vv.A06(r6, "fds");
        this.A01 = (AnonymousClass4UM) C32271fx.A03(r6, AnonymousClass3K3.A0X(r5, 30), new String[0]);
        this.A05 = (C86624Tn) AnonymousClass3K2.A0e(r5, r6, new String[]{"states"}, 29);
        this.A02 = (C86594Tk) AnonymousClass3K2.A0e(r5, r6, new String[]{"next_screens"}, 32);
        this.A04 = (C86614Tm) AnonymousClass3K2.A0e(r5, r6, new String[]{"screen_data"}, 33);
        this.A03 = (C86604Tl) AnonymousClass3K2.A0e(r5, r6, new String[]{"persist_data"}, 31);
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4V2.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4V2 r5 = (AnonymousClass4V2) obj;
            if (!C34901l3.A00(this.A05, r5.A05) || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A04, r5.A04) || !C34901l3.A00(this.A03, r5.A03) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A05;
        objArr[1] = this.A02;
        objArr[2] = this.A04;
        objArr[3] = this.A03;
        return AnonymousClass000.A0F(this.A01, objArr, 4);
    }
}
