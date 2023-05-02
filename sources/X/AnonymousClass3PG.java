package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.3PG  reason: invalid class name */
public class AnonymousClass3PG extends AnonymousClass055 {
    public final /* synthetic */ BottomSheetBehavior A00;

    public AnonymousClass3PG(BottomSheetBehavior bottomSheetBehavior) {
        this.A00 = bottomSheetBehavior;
    }

    public void A01(int i2) {
        if (i2 == 1) {
            this.A00.A0K(1);
        }
    }

    public int A03(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        return bottomSheetBehavior.A0J ? bottomSheetBehavior.A08 : bottomSheetBehavior.A02;
    }

    public int A04(View view, int i2, int i3) {
        return view.getLeft();
    }

    public int A05(View view, int i2, int i3) {
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        int i4 = bottomSheetBehavior.A0I ? bottomSheetBehavior.A03 : 0;
        int i5 = bottomSheetBehavior.A0J ? bottomSheetBehavior.A08 : bottomSheetBehavior.A02;
        if (i2 >= i4) {
            i4 = i2;
            if (i2 > i5) {
                return i5;
            }
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r5 < X.AnonymousClass000.A09(r5, r3.A02)) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (r1 < X.AnonymousClass000.A09(r5, r4)) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            r4 = 0
            r2 = 0
            r6 = 4
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r7.A00
            if (r0 >= 0) goto L_0x0033
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x0029
            int r4 = r3.A03
        L_0x000f:
            r6 = 3
        L_0x0010:
            X.0VE r1 = r3.A0D
            int r0 = r8.getLeft()
            boolean r0 = r1.A0C(r0, r4)
            if (r0 == 0) goto L_0x009d
            r1 = 2
            r3.A0K(r1)
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r0.<init>((android.view.View) r8, (com.google.android.material.bottomsheet.BottomSheetBehavior) r3, (int) r6, (int) r1)
            r8.postOnAnimation(r0)
            return
        L_0x0029:
            int r1 = r8.getTop()
            int r0 = r3.A04
            if (r1 <= r0) goto L_0x000f
            r4 = r0
            goto L_0x009a
        L_0x0033:
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x0055
            boolean r0 = r3.A0P(r8, r10)
            if (r0 == 0) goto L_0x0055
            int r1 = r8.getTop()
            int r0 = r3.A02
            if (r1 > r0) goto L_0x0051
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
        L_0x0051:
            int r4 = r3.A08
            r6 = 5
            goto L_0x0010
        L_0x0055:
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0068
            int r4 = r3.A02
            goto L_0x0010
        L_0x0068:
            int r5 = r8.getTop()
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x0080
            int r2 = r3.A03
            int r1 = X.AnonymousClass000.A09(r5, r2)
            int r4 = r3.A02
            int r0 = X.AnonymousClass000.A09(r5, r4)
            if (r1 >= r0) goto L_0x0010
            r4 = r2
            goto L_0x000f
        L_0x0080:
            int r2 = r3.A04
            if (r5 >= r2) goto L_0x008d
            int r0 = r3.A02
            int r0 = X.AnonymousClass000.A09(r5, r0)
            if (r5 >= r0) goto L_0x0099
            goto L_0x000f
        L_0x008d:
            int r1 = X.AnonymousClass000.A09(r5, r2)
            int r4 = r3.A02
            int r0 = X.AnonymousClass000.A09(r5, r4)
            if (r1 >= r0) goto L_0x0010
        L_0x0099:
            r4 = r2
        L_0x009a:
            r6 = 6
            goto L_0x0010
        L_0x009d:
            r3.A0K(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PG.A06(android.view.View, float, float):void");
    }

    public void A08(View view, int i2, int i3, int i4, int i5) {
        this.A00.A0J(i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = r4.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r1 = (android.view.View) r4.A0F.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(android.view.View r6, int r7) {
        /*
            r5 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r5.A00
            int r1 = r4.A0B
            r3 = 1
            r2 = 0
            if (r1 == r3) goto L_0x0024
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x0024
            r0 = 3
            if (r1 != r0) goto L_0x0025
            int r0 = r4.A01
            if (r0 != r7) goto L_0x0025
            java.lang.ref.WeakReference r0 = r4.A0F
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0025
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            return r2
        L_0x0025:
            java.lang.ref.WeakReference r0 = r4.A0G
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r0.get()
            if (r0 != r6) goto L_0x0030
            return r3
        L_0x0030:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PG.A09(android.view.View, int):boolean");
    }
}
