package X;

/* renamed from: X.62E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass62E implements C1220568c {
    public final /* synthetic */ C14530pL A00;
    public final /* synthetic */ C35431lv A01;
    public final /* synthetic */ AnonymousClass62L A02;
    public final /* synthetic */ C16840tj A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AnonymousClass62E(C14530pL r1, C35431lv r2, AnonymousClass62L r3, C16840tj r4, String str) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = str;
    }

    public final void A4H(String str) {
        AnonymousClass62L r6 = this.A02;
        C16840tj r5 = this.A03;
        C14530pL r7 = this.A00;
        C35431lv r4 = this.A01;
        String str2 = this.A04;
        AnonymousClass629 r2 = r6.A02;
        r2.A09 = str;
        r2.A0U.A01(r5, str, 10);
        r2.A01(C797441c.NONE, r2.A07.A00(r7, r5));
        if ("WhatsappPay".equals(str) || "p2m_lite".equals(str)) {
            r6.A00(r4, r5, str2);
        }
    }
}
