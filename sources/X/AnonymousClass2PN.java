package X;

import android.view.View;
import android.view.ViewParent;
import com.obwhatsapp.R;

/* renamed from: X.2PN  reason: invalid class name */
public class AnonymousClass2PN extends AnonymousClass055 {
    public final /* synthetic */ C55322jK A00;

    public AnonymousClass2PN(C55322jK r1) {
        this.A00 = r1;
    }

    public static /* synthetic */ void A00(AnonymousClass2PN r2) {
        AnonymousClass5N3 r1;
        C55322jK r22 = r2.A00;
        View view = r22.A0E;
        if (view != null && r22.A0C == view && (r1 = r22.A0G) != null) {
            r22.A0E = null;
            ((C1038352x) r1).A00.A6N();
        }
    }

    public int A02(View view) {
        return view.getWidth();
    }

    public int A03(View view) {
        return view.getHeight();
    }

    public int A04(View view, int i2, int i3) {
        return i2;
    }

    public int A05(View view, int i2, int i3) {
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r12, float r13, float r14) {
        /*
            r11 = this;
            X.2jK r2 = r11.A00
            android.view.View r0 = r2.A0C
            if (r0 == 0) goto L_0x00a0
            if (r0 != r12) goto L_0x00a0
            float r3 = java.lang.Math.abs(r13)
            float r0 = java.lang.Math.abs(r14)
            r1 = 1077936128(0x40400000, float:3.0)
            r10 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0164
            float r0 = r13 / r14
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            r14 = 0
        L_0x0022:
            r3 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0150
            int r0 = r12.getWidth()
            int r4 = r2.A03(r0)
            r9 = 0
        L_0x0030:
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x013c
            int r0 = r12.getHeight()
            int r5 = r2.A04(r0)
        L_0x003c:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r7 = r0.getDisplayMetrics()
            int r0 = r2.A07
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            float r0 = (float) r0
            float r1 = r7.density
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r8 = 0
            if (r0 > 0) goto L_0x0055
            r8 = 1
        L_0x0055:
            int r0 = r2.A08
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            float r0 = (float) r0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r6 = 0
            if (r0 > 0) goto L_0x0064
            r6 = 1
        L_0x0064:
            if (r9 != 0) goto L_0x0070
            int r1 = r12.getTop()
            int r0 = r7.heightPixels
            int r0 = r0 / 3
            if (r1 <= r0) goto L_0x010b
        L_0x0070:
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x00a1
            r0 = 1
            r2.A0M = r0
            X.5N3 r0 = r2.A0G
            if (r0 == 0) goto L_0x0083
            X.52x r0 = (X.C1038352x) r0
            X.1ZP r1 = r0.A00
            r0 = 1
            r1.A8r(r0)
        L_0x0083:
            X.2Cx r4 = r2.A0I
            if (r4 == 0) goto L_0x00a0
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131099794(0x7f060092, float:1.7811951E38)
            int r0 = r1.getColor(r0)
            r4.A08(r3, r0)
            X.2Cx r1 = r2.A0I
            r0 = 6
            r1.setPlayerElevation(r0)
            X.2Cx r0 = r2.A0I
            r0.setVisibility(r3)
        L_0x00a0:
            return
        L_0x00a1:
            if (r9 == 0) goto L_0x010b
            if (r8 == 0) goto L_0x00a7
            if (r6 != 0) goto L_0x00be
        L_0x00a7:
            r1 = 1169915904(0x45bb8000, float:6000.0)
            if (r8 == 0) goto L_0x00b4
            float r0 = java.lang.Math.abs(r13)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00b4:
            if (r6 == 0) goto L_0x010b
            float r0 = java.lang.Math.abs(r14)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x010b
        L_0x00be:
            r2.A0E = r12
            r0 = 1
            r2.A0P = r0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00f6
            float r0 = r12.getX()
            int r1 = (int) r0
        L_0x00cc:
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00e5
            float r0 = r12.getY()
            int r4 = (int) r0
        L_0x00d5:
            X.0VE r0 = r2.A0U
            r0.A0H(r12, r1, r4)
            r1 = 12
            com.facebook.redex.RunnableRunnableShape16S0100000_I0_15 r0 = new com.facebook.redex.RunnableRunnableShape16S0100000_I0_15
            r0.<init>(r11, r1)
            r2.postOnAnimation(r0)
            goto L_0x0083
        L_0x00e5:
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            int r4 = r12.getHeight()
            if (r0 <= 0) goto L_0x00f3
            int r0 = r2.getHeight()
            int r4 = r4 + r0
            goto L_0x00d5
        L_0x00f3:
            int r4 = r4 * -2
            goto L_0x00d5
        L_0x00f6:
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0104
            int r1 = r12.getWidth()
            int r0 = r2.getWidth()
            int r1 = r1 + r0
            goto L_0x00cc
        L_0x0104:
            int r0 = r12.getHeight()
            int r1 = r0 * -2
            goto L_0x00cc
        L_0x010b:
            boolean r1 = r2.A0N
            X.0VE r0 = r2.A0U
            if (r1 != 0) goto L_0x011d
            r0.A0C(r4, r5)
            r2.A04 = r4
            r2.A05 = r5
        L_0x0118:
            r2.invalidate()
            goto L_0x0083
        L_0x011d:
            r0.A0C(r3, r3)
            X.2Cx r0 = r2.A0I
            if (r0 == 0) goto L_0x0137
            X.2Cw r0 = (X.C46202Cw) r0
            X.29D r0 = r0.A0I
            if (r0 == 0) goto L_0x0137
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0137
            X.2Cx r1 = r2.A0I
            r0 = 100
            r1.A07(r0)
        L_0x0137:
            r2.A04 = r3
            r2.A05 = r3
            goto L_0x0118
        L_0x013c:
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            int r0 = r12.getHeight()
            if (r1 <= 0) goto L_0x014b
            int r5 = r2.A05(r0)
        L_0x0148:
            r9 = 1
            goto L_0x003c
        L_0x014b:
            int r5 = r2.A06(r0)
            goto L_0x0148
        L_0x0150:
            int r1 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            int r0 = r12.getWidth()
            if (r1 <= 0) goto L_0x015f
            int r4 = X.C55322jK.A00(r2, r0)
        L_0x015c:
            r9 = 1
            goto L_0x0030
        L_0x015f:
            int r4 = X.C55322jK.A01(r2, r0)
            goto L_0x015c
        L_0x0164:
            float r0 = r14 / r13
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            r13 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PN.A06(android.view.View, float, float):void");
    }

    public void A07(View view, int i2) {
        AnonymousClass2Cx r2;
        ViewParent parent = view.getParent();
        C55322jK r3 = this.A00;
        r3.A07 = r3.A04;
        r3.A08 = r3.A05;
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (r3.A0N && (r2 = r3.A0I) != null) {
            r2.A08(r3.getResources().getColor(R.color.color0092), 0);
            r3.A0I.setPlayerElevation(0);
            r3.A0I.setVisibility(8);
            AnonymousClass29D r0 = ((C46202Cw) r3.A0I).A0I;
            if (r0 != null && r0.A0C()) {
                r3.A0I.A06();
            }
        }
    }

    public void A08(View view, int i2, int i3, int i4, int i5) {
        C55322jK r2 = this.A00;
        r2.A0F.A01(view);
        if (r2.A0U.A03 == 1 && !r2.A0P) {
            r2.A05 = view.getTop();
            r2.A04 = view.getLeft();
        }
    }

    public boolean A09(View view, int i2) {
        C55322jK r1 = this.A00;
        View view2 = r1.A0C;
        return view2 != null && view == view2 && !r1.A0Q;
    }
}
