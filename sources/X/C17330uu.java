package X;

import com.facebook.redex.IDxECallbackShape325S0100000_2_I0;
import com.obwhatsapp.fbusers.IDxVResponseShape2S0400000_2_I0;

/* renamed from: X.0uu  reason: invalid class name and case insensitive filesystem */
public final class C17330uu {
    public final C14870pt A00;
    public final C211913d A01;
    public final AnonymousClass01D A02;

    public C17330uu(C14870pt r2, C211913d r3, AnonymousClass01D r4) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        C18450wi.A0H(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final AnonymousClass28T A00() {
        return ((AnonymousClass14L) this.A02.get()).A00(AnonymousClass146.A00);
    }

    public final void A01() {
        if (A00() != null) {
            ((AnonymousClass14K) ((AnonymousClass14L) this.A02.get()).A00.get()).A04(AnonymousClass146.A00);
        }
    }

    public final void A02(AnonymousClass2HX r9, AnonymousClass2HV r10) {
        AnonymousClass14L r5 = (AnonymousClass14L) this.A02.get();
        AnonymousClass144 r3 = AnonymousClass146.A00;
        IDxECallbackShape325S0100000_2_I0 iDxECallbackShape325S0100000_2_I0 = new IDxECallbackShape325S0100000_2_I0(r10, 1);
        ((AnonymousClass14J) r5.A02.get()).A01(r3, new IDxVResponseShape2S0400000_2_I0(iDxECallbackShape325S0100000_2_I0, r3, iDxECallbackShape325S0100000_2_I0, r5, r9, 1));
    }

    public final void A03(AnonymousClass2HV r5) {
        if (A00() == null) {
            r5.AQu(new IllegalStateException("Avatar user does not exist"));
            return;
        }
        ((AnonymousClass14L) this.A02.get()).A03(new IDxECallbackShape325S0100000_2_I0(r5, 0), AnonymousClass146.A00);
    }
}
