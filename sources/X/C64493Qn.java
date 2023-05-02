package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.redex.IDxOHelperShape5S0000000_I1;

/* renamed from: X.3Qn  reason: invalid class name and case insensitive filesystem */
public class C64493Qn extends AnonymousClass0Ft {
    public AnonymousClass0VA A00;
    public final double A01 = 0.8d;
    public final boolean A02 = true;

    public int A03(AnonymousClass02W r6, int i2, int i3) {
        int A06;
        View A04;
        int A022;
        if (!(r6 instanceof AnonymousClass02X) || (A06 = r6.A06()) == 0 || (A04 = A04(r6)) == null || (A022 = AnonymousClass02W.A02(A04)) == -1 || ((AnonymousClass02X) r6).A6V(A06 - 1) == null) {
            return -1;
        }
        int A03 = super.A03(r6, i2, i3);
        return (A03 != -1 || i2 == 0) ? A03 : A022 + (Math.abs(i2) / i2);
    }

    public View A04(AnonymousClass02W r13) {
        if ((r13 instanceof LinearLayoutManager) && r13.A13()) {
            AnonymousClass0VA r10 = this.A00;
            if (r10 == null) {
                r10 = new IDxOHelperShape5S0000000_I1(r13, 0);
                this.A00 = r10;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r13;
            int A19 = linearLayoutManager.A19();
            boolean A1R = AnonymousClass000.A1R(linearLayoutManager.A1A(), r13.A06() - 1);
            if (!this.A02 || linearLayoutManager.A18() == 0 || A1R) {
                if (A19 == -1 || A1R) {
                    return null;
                }
                View A0B = r13.A0B(A19);
                if (((double) r10.A08(A0B)) >= ((double) r10.A09(A0B)) * this.A01 && r10.A08(A0B) > 0) {
                    return A0B;
                }
                if (linearLayoutManager.A1A() != r13.A06() - 1) {
                    return r13.A0B(A19 + 1);
                }
                return null;
            }
        }
        return super.A04(r13);
    }

    public int[] A05(View view, AnonymousClass02W r7) {
        if (this.A02) {
            int A022 = AnonymousClass02W.A02(view);
            boolean A1P = AnonymousClass000.A1P(A022);
            boolean A1R = AnonymousClass000.A1R(A022, r7.A06() - 1);
            if (!A1P && !A1R) {
                return super.A05(view, r7);
            }
        }
        int[] iArr = new int[2];
        AnonymousClass0VA r0 = this.A00;
        if (r0 == null) {
            r0 = new IDxOHelperShape5S0000000_I1(r7, 0);
            this.A00 = r0;
        }
        iArr[0] = r0.A0B(view) - r0.A06();
        iArr[1] = 0;
        return iArr;
    }
}
