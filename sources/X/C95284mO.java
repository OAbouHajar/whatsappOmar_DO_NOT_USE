package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4mO  reason: invalid class name and case insensitive filesystem */
public class C95284mO implements AnonymousClass04o {
    public final C82274Ce A00;
    public final UserJid A01;
    public final C28381Vw A02;
    public final String A03;
    public final String A04;

    public C95284mO(C82274Ce r1, UserJid userJid, C28381Vw r3, String str, String str2) {
        this.A02 = r3;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = userJid;
        this.A00 = r1;
    }

    public C003401n A6s(Class cls) {
        C82274Ce r0 = this.A00;
        C28381Vw r10 = this.A02;
        String str = this.A04;
        String str2 = this.A03;
        UserJid userJid = this.A01;
        C50142Yd r2 = r0.A00;
        C16150sX r1 = r2.A04;
        C16440t3 A0U = C16150sX.A0U(r1);
        C85524Ou A012 = r2.A03.A01();
        new C809646h();
        return new AnonymousClass3Q2(C16150sX.A04(r1), A012, A0U, (C16980tz) r1.AQB.get(), C16150sX.A0Z(r1), (C16460t6) r1.A5k.get(), userJid, r10, str, str2);
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
