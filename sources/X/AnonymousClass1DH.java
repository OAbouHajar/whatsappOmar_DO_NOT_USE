package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1DH  reason: invalid class name */
public final class AnonymousClass1DH {
    public final C16070sO A00;
    public final C16490t9 A01;

    public AnonymousClass1DH(C16070sO r2, C16490t9 r3) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void A00(GroupJid groupJid, int i2) {
        C18450wi.A0H(groupJid, 1);
        int A012 = this.A00.A01(groupJid);
        C16490t9 r3 = this.A01;
        C74563qk r2 = new C74563qk();
        r2.A00 = Integer.valueOf(i2);
        r2.A01 = Long.valueOf((long) A012);
        r3.A04(r2);
    }
}
