package X;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.2qC  reason: invalid class name and case insensitive filesystem */
public class C57142qC extends AnonymousClass055 {
    public int A00 = -1;
    public int A01;
    public final /* synthetic */ SwipeDismissBehavior A02;

    public C57142qC(SwipeDismissBehavior swipeDismissBehavior) {
        this.A02 = swipeDismissBehavior;
    }

    public void A01(int i2) {
        AnonymousClass5MG r0 = this.A02.A04;
        if (r0 != null) {
            C89414c8 A002 = C89414c8.A00();
            AnonymousClass5MJ r02 = ((C98934tD) r0).A00.A07;
            if (i2 != 0) {
                A002.A02(r02);
            } else {
                A002.A03(r02);
            }
        }
    }

    public int A02(View view) {
        return view.getWidth();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        if (r1 != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r1 != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r2 = r3.A01;
        r1 = r4.getWidth() + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(android.view.View r4, int r5, int r6) {
        /*
            r3 = this;
            int r0 = X.C004601z.A06(r4)
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1R(r0, r2)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r3.A02
            int r0 = r0.A02
            if (r0 != 0) goto L_0x0023
            if (r1 == 0) goto L_0x0027
        L_0x0011:
            int r2 = r3.A01
            int r0 = r4.getWidth()
            int r2 = r2 - r0
            int r1 = r3.A01
        L_0x001a:
            int r0 = java.lang.Math.max(r2, r5)
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L_0x0023:
            if (r0 != r2) goto L_0x002f
            if (r1 == 0) goto L_0x0011
        L_0x0027:
            int r2 = r3.A01
            int r1 = r4.getWidth()
            int r1 = r1 + r2
            goto L_0x001a
        L_0x002f:
            int r2 = r3.A01
            int r0 = r4.getWidth()
            int r2 = r2 - r0
            int r0 = r3.A01
            int r1 = r4.getWidth()
            int r1 = r1 + r0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57142qC.A04(android.view.View, int, int):int");
    }

    public int A05(View view, int i2, int i3) {
        return view.getTop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r8 <= 0.0f) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (java.lang.Math.abs(r7.getLeft() - r6.A01) >= java.lang.Math.round(((float) r7.getWidth()) * 0.5f)) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        r4 = r6.A01;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r8 < 0.0f) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r0 = -1
            r6.A00 = r0
            int r5 = r7.getWidth()
            r3 = 0
            r1 = 1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            int r0 = X.C004601z.A06(r7)
            boolean r2 = X.AnonymousClass000.A1R(r0, r1)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r6.A02
            int r1 = r0.A02
            r0 = 2
            if (r1 == r0) goto L_0x0024
            if (r1 != 0) goto L_0x005c
            if (r2 == 0) goto L_0x005e
        L_0x0020:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x007d
        L_0x0024:
            int r0 = r7.getLeft()
            int r4 = r6.A01
            if (r0 >= r4) goto L_0x005a
            int r4 = r4 - r5
        L_0x002d:
            r3 = 1
        L_0x002e:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r6.A02
            X.0VE r1 = r2.A03
            int r0 = r7.getTop()
            boolean r0 = r1.A0C(r4, r0)
            if (r0 == 0) goto L_0x0046
            r1 = 0
            com.facebook.redex.RunnableRunnableShape1S0210000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0210000_I1
            r0.<init>(r2, r7, r1, r3)
            r7.postOnAnimation(r0)
        L_0x0045:
            return
        L_0x0046:
            if (r3 == 0) goto L_0x0045
            X.5MG r1 = r2.A04
            if (r1 == 0) goto L_0x0045
            X.4tD r1 = (X.C98934tD) r1
            r0 = 8
            r7.setVisibility(r0)
            X.0rI r1 = r1.A00
            r0 = 0
            r1.A04(r0)
            return
        L_0x005a:
            int r4 = r4 + r5
            goto L_0x002d
        L_0x005c:
            if (r2 == 0) goto L_0x0020
        L_0x005e:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x007d
            goto L_0x0024
        L_0x0063:
            int r2 = r7.getLeft()
            int r0 = r6.A01
            int r2 = r2 - r0
            int r0 = r7.getWidth()
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r0 = java.lang.Math.abs(r2)
            if (r0 < r1) goto L_0x007d
            goto L_0x0024
        L_0x007d:
            int r4 = r6.A01
            r3 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57142qC.A06(android.view.View, float, float):void");
    }

    public void A07(View view, int i2) {
        this.A00 = i2;
        this.A01 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void A08(View view, int i2, int i3, int i4, int i5) {
        SwipeDismissBehavior swipeDismissBehavior = this.A02;
        float width = ((float) this.A01) + (((float) view.getWidth()) * swipeDismissBehavior.A01);
        float width2 = ((float) this.A01) + (((float) view.getWidth()) * swipeDismissBehavior.A00);
        float f2 = (float) i2;
        if (f2 <= width) {
            view.setAlpha(1.0f);
        } else if (f2 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f2 - width) / (width2 - width))), 1.0f));
        }
    }

    public boolean A09(View view, int i2) {
        return this.A00 == -1 && this.A02.A0I(view);
    }
}
