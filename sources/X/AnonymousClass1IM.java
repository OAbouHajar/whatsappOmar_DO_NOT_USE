package X;

/* renamed from: X.1IM  reason: invalid class name */
public final class AnonymousClass1IM extends AnonymousClass1IC {
    public final C14870pt A00;
    public final C16980tz A01;
    public final C119315wt A02;
    public final C18340wX A03;
    public final C18310wU A04;
    public final C119285wq A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1IM(C14870pt r2, C16980tz r3, C119315wt r4, C18340wX r5, C18310wU r6, C119285wq r7, C20210zg r8) {
        super(r8);
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        C18450wi.A0H(r6, 3);
        C18450wi.A0H(r4, 4);
        C18450wi.A0H(r5, 5);
        C18450wi.A0H(r7, 6);
        C18450wi.A0H(r8, 7);
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
    }

    public final void A04(AnonymousClass2HJ r9, AnonymousClass50C r10, AnonymousClass39C r11, String str) {
        C25401Jq[] r6;
        C25401Jq r1;
        if (r9 != null) {
            r6 = new C25401Jq[1];
            r1 = new C25401Jq(C796140n.ERROR.key, C25411Jr.A06(new C25401Jq(C796140n.ERROR_NAME.key, "ProviderKeyNetworkError"), new C25401Jq(C796140n.ERROR_CODE.key, Integer.valueOf(r9.A00))));
        } else {
            String A032 = this.A02.A03(r10, str);
            if (A032 == null || A032.length() == 0) {
                r6 = new C25401Jq[1];
                r1 = new C25401Jq(C796140n.ERROR.key, C25411Jr.A06(new C25401Jq(C796140n.ERROR_NAME.key, "ProviderKeyNetworkError"), new C25401Jq(C796140n.ERROR_CODE.key, -1)));
            } else {
                r11.A01(C25411Jr.A06(new C25401Jq("data", A032)));
                return;
            }
        }
        r6[0] = r1;
        r11.A00(C25411Jr.A06(r6));
    }
}
