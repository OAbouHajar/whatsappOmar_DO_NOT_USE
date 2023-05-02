package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.0GF  reason: invalid class name */
public abstract class AnonymousClass0GF extends C015707n {
    public static final String[] A01 = {"android:visibility:visibility", "android:visibility:parent"};
    public int A00 = 3;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r9 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r5.A01 == 0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r1 == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r5.A03 == null) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0P1 A00(X.C06230Uw r8, X.C06230Uw r9) {
        /*
            X.0P1 r5 = new X.0P1
            r5.<init>()
            r6 = 0
            r5.A05 = r6
            r5.A04 = r6
            java.lang.String r3 = "android:visibility:parent"
            r4 = 0
            r7 = -1
            java.lang.String r2 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x007a
            java.util.Map r1 = r8.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r1.get(r2)
            int r0 = X.AnonymousClass000.A0D(r0)
            r5.A01 = r0
            java.lang.Object r0 = r1.get(r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A03 = r0
        L_0x002c:
            if (r9 == 0) goto L_0x0077
            java.util.Map r1 = r9.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r1.get(r2)
            int r0 = X.AnonymousClass000.A0D(r0)
            r5.A00 = r0
            java.lang.Object r4 = r1.get(r3)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x0046:
            r5.A02 = r4
            r3 = 1
            if (r8 == 0) goto L_0x0058
            if (r9 == 0) goto L_0x005e
            int r2 = r5.A01
            int r1 = r5.A00
            if (r2 != r1) goto L_0x0067
            android.view.ViewGroup r0 = r5.A03
            if (r0 != r4) goto L_0x0067
        L_0x0057:
            return r5
        L_0x0058:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x006d
            if (r9 != 0) goto L_0x0057
        L_0x005e:
            int r0 = r5.A01
            if (r0 != 0) goto L_0x0057
        L_0x0062:
            r5.A04 = r6
        L_0x0064:
            r5.A05 = r3
            return r5
        L_0x0067:
            if (r2 == r1) goto L_0x0070
            if (r2 == 0) goto L_0x0062
            if (r1 != 0) goto L_0x0057
        L_0x006d:
            r5.A04 = r3
            goto L_0x0064
        L_0x0070:
            if (r4 == 0) goto L_0x0062
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L_0x0057
            goto L_0x006d
        L_0x0077:
            r5.A00 = r7
            goto L_0x0046
        L_0x007a:
            r5.A01 = r7
            r5.A03 = r4
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GF.A00(X.0Uw, X.0Uw):X.0P1");
    }

    public static final void A03(C06230Uw r4) {
        View view = r4.A00;
        int visibility = view.getVisibility();
        Map map = r4.A02;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (A00(A0A(r2, false), A0B(r2, false)).A05 != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A0S(android.view.ViewGroup r12, X.C06230Uw r13, X.C06230Uw r14) {
        /*
            r11 = this;
            X.0P1 r1 = A00(r13, r14)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x011e
            android.view.ViewGroup r0 = r1.A03
            if (r0 != 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.A02
            if (r0 == 0) goto L_0x011e
        L_0x0010:
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x003a
            int r0 = r11.A00
            r1 = 1
            r0 = r0 & 1
            r4 = 0
            if (r0 != r1) goto L_0x0039
            if (r14 == 0) goto L_0x0039
            if (r13 != 0) goto L_0x0107
            android.view.View r0 = r14.A00
            android.view.ViewParent r2 = r0.getParent()
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            X.0Uw r1 = r11.A0A(r2, r0)
            X.0Uw r0 = r11.A0B(r2, r0)
            X.0P1 r0 = A00(r1, r0)
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0107
        L_0x0039:
            return r4
        L_0x003a:
            int r9 = r1.A00
            int r0 = r11.A00
            r8 = 2
            r0 = r0 & 2
            r4 = 0
            if (r0 != r8) goto L_0x0039
            if (r13 == 0) goto L_0x0039
            android.view.View r7 = r13.A00
            if (r14 == 0) goto L_0x00f3
            android.view.View r2 = r14.A00
        L_0x004c:
            r6 = 2131365882(0x7f0a0ffa, float:1.8351642E38)
            java.lang.Object r1 = r7.getTag(r6)
            android.view.View r1 = (android.view.View) r1
            r5 = 0
            r3 = 1
            if (r1 == 0) goto L_0x006a
            r10 = 1
        L_0x005a:
            android.animation.Animator r4 = r11.A0Y(r1, r12, r13, r14)
            if (r10 != 0) goto L_0x0039
            if (r4 != 0) goto L_0x010e
            X.0lR r0 = X.AnonymousClass0We.A01(r12)
            r0.Abr(r1)
            return r4
        L_0x006a:
            if (r2 == 0) goto L_0x0095
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x00f0
            r0 = 4
            if (r9 == r0) goto L_0x0077
            if (r7 != r2) goto L_0x0095
        L_0x0077:
            int r1 = r2.getVisibility()
            X.0SD r0 = X.C06430Vt.A02
            r0.A07(r2, r5)
            android.animation.Animator r4 = r11.A0Y(r2, r12, r13, r14)
            if (r4 == 0) goto L_0x011a
            X.09x r0 = new X.09x
            r0.<init>(r2, r9)
            r4.addListener(r0)
            X.AnonymousClass0M9.A00(r4, r0)
            r11.A08(r0)
            return r4
        L_0x0095:
            android.view.ViewParent r0 = r7.getParent()
            if (r0 != 0) goto L_0x00ce
            r10 = 0
            r1 = r7
        L_0x009d:
            java.util.Map r2 = r13.A02
            java.lang.String r0 = "android:visibility:screenLocation"
            java.lang.Object r0 = r2.get(r0)
            int[] r0 = (int[]) r0
            r9 = r0[r5]
            r4 = r0[r3]
            int[] r2 = new int[r8]
            r12.getLocationOnScreen(r2)
            r0 = r2[r5]
            int r9 = r9 - r0
            int r0 = r1.getLeft()
            int r9 = r9 - r0
            r1.offsetLeftAndRight(r9)
            r0 = r2[r3]
            int r4 = r4 - r0
            int r0 = r1.getTop()
            int r4 = r4 - r0
            r1.offsetTopAndBottom(r4)
            X.0lR r0 = X.AnonymousClass0We.A01(r12)
            r0.A4U(r1)
            goto L_0x005a
        L_0x00ce:
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x0039
            android.view.ViewParent r2 = r7.getParent()
            android.view.View r2 = (android.view.View) r2
            X.0Uw r1 = r11.A0B(r2, r3)
            X.0Uw r0 = r11.A0A(r2, r3)
            X.0P1 r0 = A00(r1, r0)
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x00f6
            android.view.View r2 = X.C05830Te.A00(r7, r2, r12)
        L_0x00f0:
            r10 = 0
            r1 = r2
            goto L_0x009d
        L_0x00f3:
            r2 = r4
            goto L_0x004c
        L_0x00f6:
            int r1 = r2.getId()
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != 0) goto L_0x0039
            r0 = -1
            if (r1 == r0) goto L_0x0039
            r12.findViewById(r1)
            return r4
        L_0x0107:
            android.view.View r0 = r14.A00
            android.animation.Animator r4 = r11.A0X(r0, r12, r13, r14)
            return r4
        L_0x010e:
            r7.setTag(r6, r1)
            X.0GJ r0 = new X.0GJ
            r0.<init>(r1, r7, r12, r11)
            r11.A08(r0)
            return r4
        L_0x011a:
            r0.A07(r2, r1)
            return r4
        L_0x011e:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GF.A0S(android.view.ViewGroup, X.0Uw, X.0Uw):android.animation.Animator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r6 == null) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(X.C06230Uw r5, X.C06230Uw r6) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L_0x0006
            if (r6 != 0) goto L_0x0019
        L_0x0005:
            return r3
        L_0x0006:
            if (r6 == 0) goto L_0x0019
            java.util.Map r0 = r6.A02
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r0.containsKey(r2)
            java.util.Map r0 = r5.A02
            boolean r0 = r0.containsKey(r2)
            if (r1 == r0) goto L_0x0019
            return r3
        L_0x0019:
            X.0P1 r1 = A00(r5, r6)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0005
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0029
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0005
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GF.A0T(X.0Uw, X.0Uw):boolean");
    }

    public String[] A0U() {
        return A01;
    }

    public void A0V(C06230Uw r1) {
        A03(r1);
    }

    public abstract Animator A0X(View view, ViewGroup viewGroup, C06230Uw r3, C06230Uw r4);

    public abstract Animator A0Y(View view, ViewGroup viewGroup, C06230Uw r3, C06230Uw r4);
}
