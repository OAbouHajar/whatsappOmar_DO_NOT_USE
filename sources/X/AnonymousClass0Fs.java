package X;

import android.graphics.PointF;
import android.view.View;
import com.facebook.redex.IDxOHelperShape5S0000000_I1;
import com.facebook.redex.IDxSScrollerShape28S0100000_I1;

/* renamed from: X.0Fs  reason: invalid class name */
public class AnonymousClass0Fs extends C02840Fl {
    public AnonymousClass0VA A00;
    public AnonymousClass0VA A01;

    public AnonymousClass0Fo A00(AnonymousClass02W r4) {
        if (!(r4 instanceof AnonymousClass02X)) {
            return null;
        }
        return new IDxSScrollerShape28S0100000_I1(this.A01.getContext(), this, 0);
    }

    public int A03(AnonymousClass02W r10, int i2, int i3) {
        AnonymousClass0VA r8;
        int A02;
        PointF A6V;
        int A06 = r10.A06();
        if (A06 != 0) {
            if (r10.A14()) {
                r8 = this.A01;
                if (r8 == null || r8.A02 != r10) {
                    r8 = new IDxOHelperShape5S0000000_I1(r10, 1);
                    this.A01 = r8;
                }
            } else if (r10.A13()) {
                r8 = this.A00;
                if (r8 == null || r8.A02 != r10) {
                    r8 = new IDxOHelperShape5S0000000_I1(r10, 0);
                    this.A00 = r8;
                }
            }
            int A05 = r10.A05();
            View view = null;
            if (A05 != 0) {
                int i4 = Integer.MAX_VALUE;
                for (int i5 = 0; i5 < A05; i5++) {
                    View A0C = r10.A0C(i5);
                    int A0B = r8.A0B(A0C);
                    if (A0B < i4) {
                        view = A0C;
                        i4 = A0B;
                    }
                }
                if (!(view == null || (A02 = AnonymousClass02W.A02(view)) == -1)) {
                    boolean z2 = !r10.A13() ? i3 > 0 : i2 > 0;
                    return (!(r10 instanceof AnonymousClass02X) || (A6V = ((AnonymousClass02X) r10).A6V(A06 - 1)) == null || (A6V.x >= 0.0f && A6V.y >= 0.0f)) ? z2 ? A02 + 1 : A02 : z2 ? A02 - 1 : A02;
                }
            }
        }
        return -1;
    }
}
