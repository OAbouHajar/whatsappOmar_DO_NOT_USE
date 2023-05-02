package X;

import android.graphics.PointF;
import android.view.View;
import com.facebook.redex.IDxOHelperShape5S0000000_I1;

/* renamed from: X.0Ft  reason: invalid class name */
public class AnonymousClass0Ft extends C02840Fl {
    public AnonymousClass0VA A00;
    public AnonymousClass0VA A01;

    public static int A00(AnonymousClass0VA r2, AnonymousClass02W r3) {
        return r3.A0R() ? r2.A06() + (r2.A07() >> 1) : r2.A01() >> 1;
    }

    public int A03(AnonymousClass02W r11, int i2, int i3) {
        int A06;
        View A04;
        int A02;
        int i4;
        PointF A6V;
        int i5;
        int i6;
        if (!(!(r11 instanceof AnonymousClass02X) || (A06 = r11.A06()) == 0 || (A04 = A04(r11)) == null || (A02 = AnonymousClass02W.A02(A04)) == -1 || (A6V = ((AnonymousClass02X) r11).A6V(i4)) == null)) {
            int i7 = 0;
            if (r11.A13()) {
                AnonymousClass0VA r1 = this.A00;
                if (r1 == null || r1.A02 != r11) {
                    r1 = new IDxOHelperShape5S0000000_I1(r11, 0);
                    this.A00 = r1;
                }
                i5 = A06(r1, r11, i2, 0);
                if (A6V.x < 0.0f) {
                    i5 = -i5;
                }
            } else {
                i5 = 0;
            }
            if (r11.A14()) {
                AnonymousClass0VA r12 = this.A01;
                if (r12 == null || r12.A02 != r11) {
                    r12 = new IDxOHelperShape5S0000000_I1(r11, 1);
                    this.A01 = r12;
                }
                i6 = A06(r12, r11, 0, i3);
                if (A6V.y < 0.0f) {
                    i6 = -i6;
                }
            } else {
                i6 = 0;
            }
            if (r11.A14()) {
                i5 = i6;
            }
            if (i5 != 0) {
                int i8 = A02 + i5;
                if (i8 >= 0) {
                    i7 = i8;
                }
                return i7 < A06 ? i7 : A06 - 1;
            }
        }
        return -1;
    }

    public View A04(AnonymousClass02W r10) {
        AnonymousClass0VA r8;
        if (r10.A14()) {
            r8 = this.A01;
            if (r8 == null || r8.A02 != r10) {
                r8 = new IDxOHelperShape5S0000000_I1(r10, 1);
                this.A01 = r8;
            }
        } else if (!r10.A13()) {
            return null;
        } else {
            r8 = this.A00;
            if (r8 == null || r8.A02 != r10) {
                r8 = new IDxOHelperShape5S0000000_I1(r10, 0);
                this.A00 = r8;
            }
        }
        int A05 = r10.A05();
        View view = null;
        if (A05 == 0) {
            return null;
        }
        int A002 = A00(r8, r10);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < A05; i3++) {
            View A0C = r10.A0C(i3);
            int A09 = AnonymousClass000.A09(r8.A0B(A0C) + (r8.A09(A0C) >> 1), A002);
            if (A09 < i2) {
                view = A0C;
                i2 = A09;
            }
        }
        return view;
    }

    public int[] A05(View view, AnonymousClass02W r8) {
        int[] iArr = new int[2];
        if (r8.A13()) {
            AnonymousClass0VA r2 = this.A00;
            if (r2 == null || r2.A02 != r8) {
                r2 = new IDxOHelperShape5S0000000_I1(r8, 0);
                this.A00 = r2;
            }
            iArr[0] = (r2.A0B(view) + (r2.A09(view) >> 1)) - A00(r2, r8);
        } else {
            iArr[0] = 0;
        }
        if (r8.A14()) {
            AnonymousClass0VA r22 = this.A01;
            if (r22 == null || r22.A02 != r8) {
                r22 = new IDxOHelperShape5S0000000_I1(r8, 1);
                this.A01 = r22;
            }
            iArr[1] = (r22.A0B(view) + (r22.A09(view) >> 1)) - A00(r22, r8);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A06(X.AnonymousClass0VA r12, X.AnonymousClass02W r13, int r14, int r15) {
        /*
            r11 = this;
            r0 = 2
            int[] r1 = new int[r0]
            android.widget.Scroller r2 = r11.A00
            r3 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r5 = r14
            r6 = r15
            r2.fling(r3, r4, r5, r6, r7, r8, r9, r10)
            android.widget.Scroller r0 = r11.A00
            int r0 = r0.getFinalX()
            r1[r3] = r0
            android.widget.Scroller r0 = r11.A00
            int r2 = r0.getFinalY()
            r0 = 1
            r1[r0] = r2
            int r10 = r13.A05()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x004f
            r8 = 0
            r7 = 0
            r4 = r7
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0037:
            if (r8 >= r10) goto L_0x0052
            android.view.View r3 = r13.A0C(r8)
            int r2 = X.AnonymousClass02W.A02(r3)
            r0 = -1
            if (r2 == r0) goto L_0x004c
            if (r2 >= r6) goto L_0x0048
            r7 = r3
            r6 = r2
        L_0x0048:
            if (r2 <= r5) goto L_0x004c
            r4 = r3
            r5 = r2
        L_0x004c:
            int r8 = r8 + 1
            goto L_0x0037
        L_0x004f:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0078
        L_0x0052:
            if (r7 == 0) goto L_0x004f
            if (r4 == 0) goto L_0x004f
            int r2 = r12.A0B(r7)
            int r0 = r12.A0B(r4)
            int r3 = java.lang.Math.min(r2, r0)
            int r2 = r12.A08(r7)
            int r0 = r12.A08(r4)
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = r0 - r3
            if (r0 == 0) goto L_0x004f
            float r4 = (float) r0
            float r4 = r4 * r9
            int r5 = r5 - r6
            int r0 = r5 + 1
            float r0 = (float) r0
            float r4 = r4 / r0
        L_0x0078:
            r2 = 0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            return r2
        L_0x007f:
            r3 = r1[r2]
            int r2 = java.lang.Math.abs(r3)
            r0 = 1
            r1 = r1[r0]
            int r0 = java.lang.Math.abs(r1)
            if (r2 > r0) goto L_0x008f
            r3 = r1
        L_0x008f:
            float r0 = (float) r3
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ft.A06(X.0VA, X.02W, int, int):int");
    }
}
