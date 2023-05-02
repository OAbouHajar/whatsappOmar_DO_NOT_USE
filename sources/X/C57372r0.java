package X;

import android.view.ViewGroup;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.2r0  reason: invalid class name and case insensitive filesystem */
public class C57372r0 extends AnonymousClass01X {
    public final AnonymousClass4NF A00;

    public C57372r0(AnonymousClass0Q5 r4) {
        this.A00 = new AnonymousClass4NF(new AnonymousClass0US(r4).A00(), new C07590c9(this));
    }

    public int A0C() {
        C34641kb r0 = this.A00.A01;
        if (r0 == null) {
            r0 = C34641kb.of();
        }
        return r0.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r4, int i2) {
        AnonymousClass3SI r42 = (AnonymousClass3SI) r4;
        C34641kb r0 = this.A00.A01;
        if (r0 == null) {
            r0 = C34641kb.of();
        }
        C84334Kd r2 = (C84334Kd) r0.get(i2);
        r42.A00 = r2;
        r42.A02.setText(r2.A02.A00);
        r42.A01.setChecked(r2.A00);
        r2.A01.A07(new IDxObserverShape116S0100000_2_I1(r42, 89));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new AnonymousClass3SI(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout02f5));
    }
}
