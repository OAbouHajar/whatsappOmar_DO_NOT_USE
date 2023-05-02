package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1vT  reason: invalid class name and case insensitive filesystem */
public final class C41241vT extends C003401n {
    public final AnonymousClass027 A00 = new AnonymousClass027();
    public final AnonymousClass15H A01;
    public final Jid A02;
    public final C16320sq A03;

    public C41241vT(AnonymousClass15H r2, Jid jid, C16320sq r4) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r2, 2);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = jid;
    }

    public void A04() {
        AnonymousClass15H r1 = this.A01;
        synchronized (r1) {
            r1.A06.remove(this);
        }
    }
}
