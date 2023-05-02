package X;

import android.widget.AbsListView;

/* renamed from: X.3DC  reason: invalid class name */
public class AnonymousClass3DC implements AbsListView.OnScrollListener {
    public final /* synthetic */ AnonymousClass3BH A00;

    public AnonymousClass3DC(AnonymousClass3BH r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (r5 <= 1.0f) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.widget.AbsListView r9) {
        /*
            r8 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0061
            X.3BH r4 = r8.A00
            android.view.ViewGroup r3 = r4.A0F
            if (r3 == 0) goto L_0x0061
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            android.content.res.Resources r0 = X.C13680ns.A0D(r9)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = r0.density
            float r2 = r2 * r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r1 = r9.getFirstVisiblePosition()
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            r7 = 0
            if (r0 != 0) goto L_0x0062
            r0 = 0
        L_0x002a:
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x004a
            float r5 = -r0
            android.content.res.Resources r1 = X.C13680ns.A0D(r9)
            r0 = 2131166043(0x7f07035b, float:1.794632E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            float r5 = r5 / r0
            float r5 = java.lang.Math.min(r5, r6)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x004b
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x004b
        L_0x004a:
            float r2 = r2 * r5
        L_0x004b:
            int r1 = r4.A08
            r0 = 1095761920(0x41500000, float:13.0)
            float r5 = r5 * r0
            int r0 = (int) r5
            int r1 = X.AnonymousClass090.A06(r1, r0)
            int r0 = r4.A06
            int r0 = X.AnonymousClass090.A05(r1, r0)
            r3.setBackgroundColor(r0)
            X.C004601z.A0X(r3, r2)
        L_0x0061:
            return
        L_0x0062:
            int r0 = r0.getTop()
            float r0 = (float) r0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DC.A00(android.widget.AbsListView):void");
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        A00(absListView);
        AbsListView.OnScrollListener onScrollListener = this.A00.A0H;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i2, i3, i4);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        A00(absListView);
        AbsListView.OnScrollListener onScrollListener = this.A00.A0H;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i2);
        }
    }
}
