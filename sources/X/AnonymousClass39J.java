package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.39J  reason: invalid class name */
public class AnonymousClass39J {
    public int A00;
    public int A01 = 4;
    public AnonymousClass027 A02;
    public final C14870pt A03;
    public final C18640x1 A04;
    public final AnonymousClass4K5 A05;
    public final UserJid A06;
    public final List A07;

    public AnonymousClass39J(C14870pt r2, C18640x1 r3, AnonymousClass4K5 r4, UserJid userJid, List list) {
        this.A03 = r2;
        this.A06 = userJid;
        this.A07 = list;
        this.A04 = r3;
        this.A05 = r4;
        this.A00 = 0;
    }

    public final List A00() {
        C35681mK r0;
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            C35701mM A052 = this.A04.A05((UserJid) null, AnonymousClass000.A0m(it));
            if (A052 != null && (r0 = A052.A01) != null && r0.A00 == 0 && !A052.A07) {
                A0u.add(A052);
            }
        }
        return A0u;
    }

    public void A01(C49822Vz r5) {
        this.A01 = r5.A00;
        List<C35701mM> list = r5.A01;
        if (list != null) {
            for (C35701mM A0C : list) {
                this.A04.A0C(A0C, this.A06);
            }
        }
        r5.A01 = A00();
        this.A03.A0K(new RunnableRunnableShape12S0200000_I1(this, 43, r5));
    }
}
