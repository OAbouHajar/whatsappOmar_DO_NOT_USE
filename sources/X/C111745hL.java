package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5hL  reason: invalid class name and case insensitive filesystem */
public class C111745hL extends C42541xy {
    public final /* synthetic */ C42511xv A00;
    public final /* synthetic */ C35511m3 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111745hL(C42511xv r2, C35511m3 r3) {
        super((Runnable) null);
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C35511m3 A05;
        C35511m3 r2 = this.A01;
        UserJid userJid = r2.A05;
        if (!(userJid == null || (A05 = this.A00.A01.A05(userJid)) == null)) {
            r2.A03 = A05.A03;
            r2.A04 = A05.A04;
        }
        return Boolean.valueOf(this.A00.A01.A0I(r2));
    }
}
