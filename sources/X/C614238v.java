package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.obwhatsapp.data.IDxMObserverShape75S0100000_2_I1;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.38v  reason: invalid class name and case insensitive filesystem */
public final class C614238v {
    public GroupJid A00;
    public final AnonymousClass028 A01 = C30801cy.A01();
    public final AnonymousClass028 A02 = new AnonymousClass027(C13680ns.A0X());
    public final IDxMObserverShape75S0100000_2_I1 A03;
    public final C19150xq A04;
    public final AnonymousClass1DH A05;
    public final C16220sf A06;
    public final C16320sq A07;

    public C614238v(C19150xq r3, AnonymousClass1DH r4, C16220sf r5, C16320sq r6) {
        C18450wi.A0J(r5, r6);
        C18450wi.A0H(r3, 3);
        this.A06 = r5;
        this.A07 = r6;
        this.A04 = r3;
        this.A05 = r4;
        IDxMObserverShape75S0100000_2_I1 iDxMObserverShape75S0100000_2_I1 = new IDxMObserverShape75S0100000_2_I1(this, 0);
        this.A03 = iDxMObserverShape75S0100000_2_I1;
        r3.A02(iDxMObserverShape75S0100000_2_I1);
    }

    public final void A00() {
        GroupJid groupJid = this.A00;
        if (groupJid != null) {
            this.A07.Acl(new RunnableRunnableShape12S0200000_I1(this, 33, groupJid));
        }
    }
}
