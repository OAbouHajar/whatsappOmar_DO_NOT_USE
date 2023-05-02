package X;

import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.4Qk  reason: invalid class name and case insensitive filesystem */
public final class C85894Qk {
    public final AnonymousClass2Z2 A00;
    public final List A01;

    public C85894Qk(AnonymousClass2Z2 r3, C16980tz r4) {
        C18450wi.A0H(r4, 1);
        this.A00 = r3;
        int dimensionPixelSize = C16980tz.A00(r4).getDimensionPixelSize(R.dimen.dimen02ee);
        this.A01 = AnonymousClass1JB.A0V(new C71863lA(dimensionPixelSize, dimensionPixelSize));
    }

    public final void A00(String str) {
        C18450wi.A0H(str, 0);
        AnonymousClass2Z2 r4 = this.A00;
        List list = this.A01;
        C102284yh r2 = new C102284yh(r4, str);
        r4.A01 = r2;
        C59702yo A75 = r4.A0F.A75(r2, r4.A0O.A00, str, list);
        r4.A0Q.add(A75);
        A75.A04();
    }
}
