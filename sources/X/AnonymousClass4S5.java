package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4S5  reason: invalid class name */
public final class AnonymousClass4S5 {
    public final C16300so A00;
    public final C17150uc A01;
    public final AnonymousClass16N A02;
    public final C17170ue A03;
    public final AnonymousClass4D3 A04;
    public final C82604Dl A05;
    public final C16320sq A06;

    public AnonymousClass4S5(C16300so r2, C17150uc r3, AnonymousClass16N r4, C17170ue r5, AnonymousClass4D3 r6, C82604Dl r7, C16320sq r8) {
        AnonymousClass3K2.A1I(r5, r3);
        C18450wi.A0H(r8, 5);
        C18450wi.A0H(r4, 6);
        C18450wi.A0H(r2, 7);
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
        this.A01 = r3;
        this.A06 = r8;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final AnonymousClass26O A00(C87064Vf r9, String str, String str2, String str3) {
        UserJid userJid = r9.A00;
        int i2 = this.A04.A00;
        int A002 = C13690nt.A00(this.A05.A00.A07.A0I(userJid) ? 1 : 0) * 9;
        return new AnonymousClass26O(new C84304Ka(r9.A01, str, str2), userJid, str3, this.A03.A00, A002, i2, i2);
    }
}
