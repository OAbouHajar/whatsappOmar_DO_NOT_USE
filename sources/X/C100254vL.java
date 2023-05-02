package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4vL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100254vL implements AnonymousClass23B {
    public final /* synthetic */ C439622f A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C25381Jo A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C100254vL(C439622f r1, UserJid userJid, C25381Jo r3, String str, String str2, String str3, boolean z2) {
        this.A02 = r3;
        this.A01 = userJid;
        this.A06 = z2;
        this.A03 = str;
        this.A00 = r1;
        this.A04 = str2;
        this.A05 = str3;
    }

    public final void ANn(C35611mD r9) {
        C25381Jo r1 = this.A02;
        UserJid userJid = this.A01;
        boolean z2 = this.A06;
        String str = this.A03;
        C439622f r2 = this.A00;
        String str2 = this.A04;
        String str3 = this.A05;
        C18450wi.A0H(r2, 4);
        if (r9 == null || !r9.A0M) {
            r2.ARf("extensions-invalid-business-profile");
        } else {
            r1.A00.A08.A01(r2, userJid, str, str2, str3, z2);
        }
    }
}
