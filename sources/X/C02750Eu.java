package X;

import android.view.View;

/* renamed from: X.0Eu  reason: invalid class name and case insensitive filesystem */
public class C02750Eu extends AnonymousClass062 {
    public final /* synthetic */ AnonymousClass01A A00;

    public C02750Eu(AnonymousClass01A r1) {
        this.A00 = r1;
    }

    public View A00(int i2) {
        AnonymousClass01A r2 = this.A00;
        View view = r2.A0A;
        if (view != null) {
            return view.findViewById(i2);
        }
        StringBuilder A0r = AnonymousClass000.A0r("Fragment ");
        A0r.append(r2);
        throw AnonymousClass000.A0V(AnonymousClass000.A0h(" does not have a view", A0r));
    }

    public boolean A01() {
        return AnonymousClass000.A1V(this.A00.A0A);
    }
}
