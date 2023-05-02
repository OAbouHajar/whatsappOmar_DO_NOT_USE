package com.obwhatsapp.calling.callgrid.view;

import X.AnonymousClass0Ri;
import X.AnonymousClass4DX;
import X.C57772rm;
import X.C89574cT;
import android.os.Handler;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class CallGridLayoutManager extends StaggeredGridLayoutManager {
    public int A00 = 0;
    public int A01 = 0;
    public AnonymousClass4DX A02;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final C57772rm A09;

    public CallGridLayoutManager(C57772rm r2) {
        super(1, 1);
        this.A09 = r2;
        this.A08 = new Handler();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r4.A07 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        if ((r9 % 2) == 0) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0t(X.AnonymousClass0SJ r19, X.AnonymousClass0Ri r20) {
        /*
            r18 = this;
            r4 = r18
            int r2 = r4.A06()
            r17 = r20
            int r9 = r17.A00()
            if (r2 != 0) goto L_0x001c
            int r1 = r4.A05()
        L_0x0012:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0134
            X.0SK r0 = r4.A05
            r0.A06(r1)
            goto L_0x0012
        L_0x001c:
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0037
            r0 = 2
            if (r2 != r0) goto L_0x0037
            java.lang.String r1 = "Number of items/tiles in call grid RecyclerView should not be "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0037:
            r7 = r19
            r4.A0M(r7)
            boolean r0 = r4.A04
            int r5 = X.C89574cT.A01(r2, r0)
            int r0 = r4.A06
            r1 = 1
            r13 = 0
            if (r5 == r0) goto L_0x0049
            r13 = 1
        L_0x0049:
            int r2 = r4.A00
            int r0 = r4.A01
            r12 = 0
            if (r2 == r0) goto L_0x0051
            r12 = 1
        L_0x0051:
            if (r9 != r1) goto L_0x0059
            boolean r0 = r4.A07
            r16 = 1
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            r16 = 0
        L_0x005b:
            int r3 = r4.A06()
            int r2 = r4.A00
            boolean r0 = r4.A04
            int r8 = X.C89574cT.A00(r3, r2, r0)
            int r3 = r4.A06()
            int r6 = r4.A00
            boolean r2 = r4.A04
            r0 = 12
            if (r3 <= r0) goto L_0x011d
            r6 = 0
        L_0x0074:
            int r11 = r4.A03
            int r10 = r11 / r5
            int r0 = r10 * r5
            int r11 = r11 - r0
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x011a
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x008b
            X.2rm r0 = r4.A09
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x0095
        L_0x008b:
            int r0 = r4.A00
            if (r8 <= r0) goto L_0x011a
            if (r12 != 0) goto L_0x011a
            if (r13 != 0) goto L_0x011a
            if (r9 == r1) goto L_0x011a
        L_0x0095:
            r4.A03 = r1
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            if (r16 == 0) goto L_0x00b8
            boolean r12 = r4.A05
            boolean r2 = r4.A04
            int r10 = r4.A03
            r1 = r10
            int r0 = r4.A00
            r8 = r0
            if (r2 == r12) goto L_0x00ae
            if (r12 == 0) goto L_0x0117
            int r8 = r0 >> 1
        L_0x00ae:
            int r0 = r0 - r8
            int r0 = r0 >> 1
            r3.top = r0
            int r1 = r1 - r10
            int r0 = r1 >> 1
            r3.left = r0
        L_0x00b8:
            r2 = 0
        L_0x00b9:
            if (r2 >= r9) goto L_0x0125
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.02k r0 = r7.A01(r2, r0)
            android.view.View r13 = r0.A0H
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0111
            int r0 = r13.getHeight()
            if (r0 != 0) goto L_0x010f
            int r15 = r4.A00
        L_0x00d2:
            int r0 = r2 % r5
            r14 = 0
            if (r0 != 0) goto L_0x00d8
            r14 = r11
        L_0x00d8:
            int r14 = r14 + r10
            if (r15 == 0) goto L_0x0107
            if (r16 != 0) goto L_0x00f0
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x00ed
            r0 = 1
            if (r2 != r0) goto L_0x00ed
            r0 = 5
            if (r9 < r0) goto L_0x00ed
            int r1 = r9 % 2
            int r0 = r15 >> 1
            if (r1 != 0) goto L_0x00ee
        L_0x00ed:
            r0 = 0
        L_0x00ee:
            r3.top = r0
        L_0x00f0:
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            int r1 = r3.top
            r12.topMargin = r1
            int r0 = r3.left
            r12.leftMargin = r0
            int r15 = r15 + r1
            r12.height = r15
            int r14 = r14 + r0
            r12.width = r14
            r13.setLayoutParams(r12)
        L_0x0107:
            r1 = -1
            r0 = 0
            r4.A0H(r13, r1, r0)
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x010f:
            r15 = 0
            goto L_0x00d2
        L_0x0111:
            r15 = 0
            if (r2 >= r5) goto L_0x0115
            r15 = r6
        L_0x0115:
            int r15 = r15 + r8
            goto L_0x00d2
        L_0x0117:
            int r10 = r10 >> 1
            goto L_0x00ae
        L_0x011a:
            r1 = 0
            goto L_0x0095
        L_0x011d:
            int r0 = X.C89574cT.A02(r3, r2)
            int r0 = r0 * r8
            int r6 = r6 - r0
            goto L_0x0074
        L_0x0125:
            int r0 = r4.A06
            if (r5 == r0) goto L_0x0135
            android.os.Handler r2 = r4.A08
            r1 = 6
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r0.<init>((java.lang.Object) r4, (int) r5, (int) r1)
            r2.post(r0)
        L_0x0134:
            return
        L_0x0135:
            r0 = r17
            super.A0t(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callgrid.view.CallGridLayoutManager.A0t(X.0SJ, X.0Ri):void");
    }

    public void A0v(AnonymousClass0Ri r4) {
        super.A0v(r4);
        this.A01 = this.A00;
        this.A00 = C89574cT.A00(A06(), this.A00, this.A04);
        AnonymousClass4DX r0 = this.A02;
        if (r0 != null) {
            CallGrid.A02(r0.A00);
        }
    }

    public boolean A14() {
        return !this.A06;
    }
}
