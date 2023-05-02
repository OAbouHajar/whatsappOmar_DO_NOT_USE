package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1Ji  reason: invalid class name and case insensitive filesystem */
public final class C25321Ji {
    public final C16490t9 A00;
    public final C20060zR A01;
    public final C16320sq A02;

    public C25321Ji(C16490t9 r2, C20060zR r3, C16320sq r4) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r2, 2);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(Jid jid, Integer num, String str, int i2, int i3, int i4, boolean z2) {
        this.A02.Acl(new AnonymousClass224(this, jid, num, str, i3, i4, i2, z2));
    }
}
