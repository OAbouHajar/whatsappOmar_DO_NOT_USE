package X;

import com.facebook.redex.RunnableRunnableShape1S1400000_I1;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4vJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100234vJ implements AnonymousClass23B {
    public final /* synthetic */ AnonymousClass4S5 A00;
    public final /* synthetic */ C87064Vf A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AnonymousClass22J A04;

    public /* synthetic */ C100234vJ(AnonymousClass4S5 r1, C87064Vf r2, UserJid userJid, String str, AnonymousClass22J r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = str;
        this.A02 = userJid;
    }

    public final void ANn(C35611mD r9) {
        AnonymousClass4S5 r2 = this.A00;
        AnonymousClass22J r5 = this.A04;
        C87064Vf r4 = this.A01;
        String str = this.A03;
        UserJid userJid = this.A02;
        if (r9 == null || !r9.A0K) {
            r5.AIU(r2.A00(r4, r4.A01, "V2", str));
        } else {
            r2.A06.Acl(new RunnableRunnableShape1S1400000_I1(r2, userJid, r4, r5, str, 0));
        }
    }
}
