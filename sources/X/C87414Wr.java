package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.redex.IDxOHelperShape5S0000000_I1;

/* renamed from: X.4Wr  reason: invalid class name and case insensitive filesystem */
public class C87414Wr {
    public C83434Gq A00;
    public C83434Gq A01;
    public C798241l A02;
    public Float A03;

    public C87414Wr(C798241l r1, Float f2) {
        this.A02 = r1;
        this.A03 = f2;
    }

    public final int A00(View view, AnonymousClass0VA r5) {
        C798241l r1 = this.A02;
        switch (r1.ordinal()) {
            case 0:
                return r5.A0B(view);
            case 1:
                return r5.A0B(view) + (r5.A09(view) / 2);
            case 2:
                return r5.A08(view);
            default:
                throw AnonymousClass000.A0T(AnonymousClass000.A0g("Invalid gravity :", r1));
        }
    }

    public final int A01(AnonymousClass0VA r4, AnonymousClass02W r5) {
        C798241l r1 = this.A02;
        switch (r1.ordinal()) {
            case 0:
                Float f2 = this.A03;
                if (r5.A0R()) {
                    return r4.A06() + Math.round(f2.floatValue());
                }
                return 0;
            case 1:
                return (r5.A0R() ? r4.A06() : 0) + (r4.A07() >> 1);
            case 2:
                return r5.A0R() ? r4.A02() : r4.A01();
            default:
                throw AnonymousClass000.A0T(AnonymousClass000.A0g("Invalid gravity :", r1));
        }
    }

    public View A02(AnonymousClass02W r9) {
        C83434Gq r1;
        if (r9.A13()) {
            r1 = this.A00;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C83434Gq(new IDxOHelperShape5S0000000_I1(r9, 0), r9);
                this.A00 = r1;
            }
        } else {
            r1 = this.A01;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C83434Gq(new IDxOHelperShape5S0000000_I1(r9, 1), r9);
                this.A01 = r1;
            }
        }
        AnonymousClass0VA r6 = r1.A00;
        int A05 = r9.A05();
        View view = null;
        if (A05 == 0) {
            return null;
        }
        if (this.A02 == C798241l.CENTER && (r9 instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r9;
            if (linearLayoutManager.A18() == 0) {
                return r9.A0C(0);
            }
            if (linearLayoutManager.A1A() == r9.A06() - 1) {
                return r9.A0C(r9.A05() - 1);
            }
        }
        int i2 = Integer.MAX_VALUE;
        int A012 = A01(r6, r9);
        for (int i3 = 0; i3 < A05; i3++) {
            View A0C = r9.A0C(i3);
            int A09 = AnonymousClass000.A09(A00(A0C, r6), A012);
            if (A09 < i2) {
                view = A0C;
                i2 = A09;
            }
        }
        return view;
    }

    public int[] A03(View view, AnonymousClass02W r7) {
        int[] iArr = new int[2];
        if (r7.A13()) {
            C83434Gq r1 = this.A00;
            if (r1 == null || r1.A01 != r7) {
                r1 = new C83434Gq(new IDxOHelperShape5S0000000_I1(r7, 0), r7);
                this.A00 = r1;
            }
            AnonymousClass0VA r0 = r1.A00;
            iArr[0] = A00(view, r0) - A01(r0, r7);
        } else {
            iArr[0] = 0;
        }
        if (r7.A14()) {
            C83434Gq r12 = this.A01;
            if (r12 == null || r12.A01 != r7) {
                r12 = new C83434Gq(new IDxOHelperShape5S0000000_I1(r7, 1), r7);
                this.A01 = r12;
            }
            AnonymousClass0VA r02 = r12.A00;
            iArr[1] = A00(view, r02) - A01(r02, r7);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
