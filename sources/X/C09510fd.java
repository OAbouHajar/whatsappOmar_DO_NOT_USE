package X;

/* renamed from: X.0fd  reason: invalid class name and case insensitive filesystem */
public class C09510fd implements Runnable {
    public final /* synthetic */ C02800Fh A00;

    public C09510fd(C02800Fh r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r6 < 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cc, code lost:
        if (r6 > 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f2, code lost:
        if (r6 <= 0) goto L_0x00f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r8 = r21
            X.0Fh r7 = r8.A00
            X.02k r0 = r7.A0L
            if (r0 == 0) goto L_0x00aa
            r0 = -9223372036854775808
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r7.A0D
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00f7
            r13 = 0
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView r4 = r7.A0M
            X.02W r9 = r4.getLayoutManager()
            android.graphics.Rect r5 = r7.A0E
            if (r5 != 0) goto L_0x0026
            android.graphics.Rect r5 = X.AnonymousClass000.A0J()
            r7.A0E = r5
        L_0x0026:
            X.02k r4 = r7.A0L
            android.view.View r4 = r4.A0H
            r9.A0I(r4, r5)
            boolean r4 = r9.A13()
            r10 = 0
            if (r4 == 0) goto L_0x00f4
            float r5 = r7.A05
            float r4 = r7.A00
            float r5 = r5 + r4
            int r6 = (int) r5
            android.graphics.Rect r4 = r7.A0E
            int r4 = r4.left
            int r12 = r6 - r4
            androidx.recyclerview.widget.RecyclerView r4 = r7.A0M
            int r4 = r4.getPaddingLeft()
            int r12 = r12 - r4
            float r5 = r7.A00
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d1
            if (r12 >= 0) goto L_0x00d1
        L_0x004f:
            boolean r4 = r9.A14()
            if (r4 == 0) goto L_0x00cf
            float r5 = r7.A06
            float r4 = r7.A01
            float r5 = r5 + r4
            int r9 = (int) r5
            android.graphics.Rect r4 = r7.A0E
            int r4 = r4.top
            int r6 = r9 - r4
            androidx.recyclerview.widget.RecyclerView r4 = r7.A0M
            int r4 = r4.getPaddingTop()
            int r6 = r6 - r4
            float r5 = r7.A01
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ab
            if (r6 >= 0) goto L_0x00ab
        L_0x0070:
            if (r12 == 0) goto L_0x0087
            X.0V7 r9 = r7.A0I
            androidx.recyclerview.widget.RecyclerView r10 = r7.A0M
            X.02k r4 = r7.A0L
            android.view.View r4 = r4.A0H
            int r11 = r4.getWidth()
            androidx.recyclerview.widget.RecyclerView r4 = r7.A0M
            r4.getWidth()
            int r12 = r9.A02(r10, r11, r12, r13)
        L_0x0087:
            if (r6 == 0) goto L_0x00a4
            X.0V7 r15 = r7.A0I
            androidx.recyclerview.widget.RecyclerView r5 = r7.A0M
            X.02k r4 = r7.A0L
            android.view.View r4 = r4.A0H
            int r17 = r4.getHeight()
            androidx.recyclerview.widget.RecyclerView r4 = r7.A0M
            r4.getHeight()
            r18 = r6
            r19 = r13
            r16 = r5
            int r6 = r15.A02(r16, r17, r18, r19)
        L_0x00a4:
            if (r12 != 0) goto L_0x00fb
            if (r6 != 0) goto L_0x00fb
            r7.A0D = r0
        L_0x00aa:
            return
        L_0x00ab:
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x00cf
            X.02k r4 = r7.A0L
            android.view.View r4 = r4.A0H
            int r4 = r4.getHeight()
            int r9 = r9 + r4
            android.graphics.Rect r4 = r7.A0E
            int r4 = r4.bottom
            int r9 = r9 + r4
            androidx.recyclerview.widget.RecyclerView r4 = r7.A0M
            int r5 = r4.getHeight()
            androidx.recyclerview.widget.RecyclerView r4 = r7.A0M
            int r4 = r4.getPaddingBottom()
            int r5 = r5 - r4
            int r6 = r9 - r5
            if (r6 <= 0) goto L_0x00cf
            goto L_0x0070
        L_0x00cf:
            r6 = 0
            goto L_0x0070
        L_0x00d1:
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f4
            X.02k r4 = r7.A0L
            android.view.View r4 = r4.A0H
            int r4 = r4.getWidth()
            int r6 = r6 + r4
            android.graphics.Rect r4 = r7.A0E
            int r4 = r4.right
            int r6 = r6 + r4
            androidx.recyclerview.widget.RecyclerView r4 = r7.A0M
            int r5 = r4.getWidth()
            androidx.recyclerview.widget.RecyclerView r4 = r7.A0M
            int r4 = r4.getPaddingRight()
            int r5 = r5 - r4
            int r6 = r6 - r5
            r12 = r6
            if (r6 > 0) goto L_0x004f
        L_0x00f4:
            r12 = 0
            goto L_0x004f
        L_0x00f7:
            long r13 = r2 - r4
            goto L_0x0016
        L_0x00fb:
            long r4 = r7.A0D
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0103
            r7.A0D = r2
        L_0x0103:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0M
            r0.scrollBy(r12, r6)
            X.02k r0 = r7.A0L
            if (r0 == 0) goto L_0x010f
            r7.A0A(r0)
        L_0x010f:
            androidx.recyclerview.widget.RecyclerView r1 = r7.A0M
            java.lang.Runnable r0 = r7.A0R
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0M
            r0.postOnAnimation(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09510fd.run():void");
    }
}
