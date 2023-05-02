package X;

import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.whatsapp.util.Log;

/* renamed from: X.1Mm  reason: invalid class name and case insensitive filesystem */
public final class C26141Mm {
    public final C14870pt A00;
    public final C16320sq A01;
    public final AnonymousClass01J A02;
    public final AnonymousClass01J A03;
    public final AnonymousClass01J A04;

    public C26141Mm(C14870pt r2, C16320sq r3, AnonymousClass01J r4, AnonymousClass01J r5, AnonymousClass01J r6) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        C18450wi.A0H(r4, 3);
        C18450wi.A0H(r5, 4);
        C18450wi.A0H(r6, 5);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A04 = r6;
    }

    public final void A00(AnonymousClass22J r6) {
        Boolean A002;
        C212013e r1 = (C212013e) this.A04.get();
        if (((C17330uu) ((C27121Qn) this.A03.get()).A04.get()).A00() == null) {
            A002 = Boolean.FALSE;
        } else {
            A002 = r1.A00();
            if (A002 == null) {
                this.A01.Aco(new RunnableRunnableShape1S0300000_I0_1(this, new AnonymousClass28U(r6), new AnonymousClass28V(r6), 43));
                return;
            }
        }
        r6.AIU(A002);
    }

    public final boolean A01() {
        Boolean A002 = ((C212013e) this.A04.get()).A00();
        if (A002 != null) {
            return A002.booleanValue();
        }
        Log.i("AvatarRepository/unknown avatar config state, returning false.");
        return false;
    }
}
