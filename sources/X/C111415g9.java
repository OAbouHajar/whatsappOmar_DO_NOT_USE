package X;

import com.facebook.redex.IDxAListenerShape122S0100000_3_I0;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5g9  reason: invalid class name and case insensitive filesystem */
public abstract class C111415g9 extends C14530pL {
    public boolean A00 = false;

    public C111415g9() {
        A0T(new IDxAListenerShape122S0100000_3_I0(this, 1));
    }

    public static void A03(C49132Rg r1, C16150sX r2, WaBloksActivity waBloksActivity) {
        waBloksActivity.A06 = C17270uo.A00(r2.A1t);
        waBloksActivity.A03 = (C20140zZ) r2.A1r.get();
        waBloksActivity.A09 = C16150sX.A1D(r2);
        waBloksActivity.A00 = (AnonymousClass2ZU) r1.A1m.get();
        waBloksActivity.A08 = C16150sX.A1C(r2);
        waBloksActivity.A02 = r1.A06();
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            WaBloksActivity waBloksActivity = (WaBloksActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, waBloksActivity);
            C14530pL.A0b(r3, r1, waBloksActivity, C110105dW.A0F(r1));
            A03(r3, r1, waBloksActivity);
        }
    }
}
