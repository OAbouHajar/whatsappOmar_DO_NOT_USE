package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5uI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118195uI {
    public final /* synthetic */ C28881Zb A00;
    public final /* synthetic */ AnonymousClass1Vt A01;
    public final /* synthetic */ C110645ea A02;

    public /* synthetic */ C118195uI(C28881Zb r1, AnonymousClass1Vt r2, C110645ea r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A00(AnonymousClass2HJ r6, String str, String str2) {
        C110645ea r4 = this.A02;
        AnonymousClass1Vt r3 = this.A01;
        C28881Zb r2 = this.A00;
        if (r6 != null) {
            C116815rz.A00(r4.A02);
            C110645ea.A01(r6, r4);
            return;
        }
        r3.A0K = str2;
        C111855hW r0 = (C111855hW) r3.A0A;
        AnonymousClass00B.A06(r0);
        AnonymousClass5xC r1 = r0.A0B;
        AnonymousClass00B.A06(r1);
        r1.A08 = str != null ? C39841t9.A00(str, "mandateNo") : null;
        r3.A02 = 417;
        r3.A0E = (UserJid) r2.A0E;
        r4.A0M.Acl(new C1215065t(r3, r4));
    }
}
