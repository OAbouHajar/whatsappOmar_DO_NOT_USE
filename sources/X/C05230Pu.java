package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.IDxDListenerShape265S0100000_I1;

/* renamed from: X.0Pu  reason: invalid class name and case insensitive filesystem */
public class C05230Pu {
    public C12260k6 A00;
    public C12270k7 A01;
    public final Context A02;
    public final View A03;
    public final C016607w A04;
    public final C05500Rr A05;

    public C05230Pu(Context context, View view, int i2, int i3) {
        this.A02 = context;
        this.A03 = view;
        C016607w r5 = new C016607w(context);
        this.A04 = r5;
        r5.A0D(new AnonymousClass0ZL(this));
        C05500Rr r2 = new C05500Rr(context, view, r5, i3, 0, false);
        this.A05 = r2;
        r2.A00 = i2;
        r2.A02 = new IDxDListenerShape265S0100000_I1(this, 1);
    }

    public void A00() {
        if (!this.A05.A03()) {
            throw AnonymousClass000.A0V("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
