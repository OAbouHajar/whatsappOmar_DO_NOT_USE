package X;

import android.widget.AbsListView;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.collections.observablelistview.ObservableListView;

/* renamed from: X.3DA  reason: invalid class name */
public class AnonymousClass3DA implements AbsListView.OnScrollListener {
    public final /* synthetic */ ObservableListView A00;

    public AnonymousClass3DA(ObservableListView observableListView) {
        this.A00 = observableListView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        if (r2 == 0) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            com.obwhatsapp.collections.observablelistview.ObservableListView r3 = r10.A00
            android.widget.AbsListView$OnScrollListener r0 = r3.A08
            if (r0 == 0) goto L_0x0009
            r0.onScroll(r11, r12, r13, r14)
        L_0x0009:
            X.0pb r0 = r3.A09
            if (r0 == 0) goto L_0x0118
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L_0x0118
            int r2 = r3.getFirstVisiblePosition()
            int r6 = r3.getFirstVisiblePosition()
            r4 = 0
            r5 = 0
        L_0x001d:
            int r0 = r3.getLastVisiblePosition()
            if (r6 > r0) goto L_0x004d
            android.util.SparseIntArray r0 = r3.A05
            int r0 = r0.indexOfKey(r6)
            if (r0 < 0) goto L_0x003b
            android.view.View r0 = r3.getChildAt(r5)
            int r1 = r0.getHeight()
            android.util.SparseIntArray r0 = r3.A05
            int r0 = r0.get(r6)
            if (r1 == r0) goto L_0x0048
        L_0x003b:
            android.util.SparseIntArray r1 = r3.A05
            android.view.View r0 = r3.getChildAt(r5)
            int r0 = r0.getHeight()
            r1.put(r6, r0)
        L_0x0048:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L_0x001d
        L_0x004d:
            android.view.View r7 = r3.getChildAt(r4)
            if (r7 == 0) goto L_0x0118
            int r6 = r3.A01
            r5 = 1
            if (r6 >= r2) goto L_0x007a
            int r0 = r2 - r6
            r6 = 0
            if (r0 == r5) goto L_0x00a7
            int r1 = r2 + -1
        L_0x005f:
            int r0 = r3.A01
            if (r1 <= r0) goto L_0x00a7
            android.util.SparseIntArray r0 = r3.A05
            int r0 = r0.indexOfKey(r1)
            if (r0 <= 0) goto L_0x0075
            android.util.SparseIntArray r0 = r3.A05
            int r0 = r0.get(r1)
        L_0x0071:
            int r6 = r6 + r0
            int r1 = r1 + -1
            goto L_0x005f
        L_0x0075:
            int r0 = r7.getHeight()
            goto L_0x0071
        L_0x007a:
            if (r2 >= r6) goto L_0x00a4
            int r0 = r6 - r2
            r1 = 0
            if (r0 == r5) goto L_0x009b
            int r6 = r6 - r5
        L_0x0082:
            if (r6 <= r2) goto L_0x009b
            android.util.SparseIntArray r0 = r3.A05
            int r0 = r0.indexOfKey(r6)
            if (r0 <= 0) goto L_0x0096
            android.util.SparseIntArray r0 = r3.A05
            int r0 = r0.get(r6)
        L_0x0092:
            int r1 = r1 + r0
            int r6 = r6 + -1
            goto L_0x0082
        L_0x0096:
            int r0 = r7.getHeight()
            goto L_0x0092
        L_0x009b:
            int r5 = r3.A03
            int r0 = r7.getHeight()
            int r0 = r0 + r1
            int r5 = r5 - r0
            goto L_0x00ad
        L_0x00a4:
            if (r2 != 0) goto L_0x00b5
            goto L_0x00af
        L_0x00a7:
            int r5 = r3.A03
            int r0 = r3.A00
            int r0 = r0 + r6
            int r5 = r5 + r0
        L_0x00ad:
            r3.A03 = r5
        L_0x00af:
            int r0 = r7.getHeight()
            r3.A00 = r0
        L_0x00b5:
            int r0 = r3.A00
            if (r0 >= 0) goto L_0x00bb
            r3.A00 = r4
        L_0x00bb:
            int r6 = r3.A03
            int r0 = r7.getTop()
            int r6 = r6 - r0
            r3.A04 = r6
            r3.A01 = r2
            X.0pb r5 = r3.A09
            boolean r9 = r3.A0D
            boolean r8 = r3.A0C
            com.obwhatsapp.HomeActivity r5 = (com.obwhatsapp.HomeActivity) r5
            com.obwhatsapp.collections.observablelistview.ObservableListView r0 = r5.A3B()
            if (r3 != r0) goto L_0x010e
            com.obwhatsapp.yo.HomeUI.yoScroll(r6)
            boolean r0 = r5.A3b()
            r7 = 1
            if (r0 == 0) goto L_0x0119
            android.view.View r1 = r5.getCurrentFocus()
            X.01V r0 = r5.A08
            android.view.inputmethod.InputMethodManager r2 = r0.A0Q()
            if (r9 != 0) goto L_0x010e
            if (r8 == 0) goto L_0x010e
            if (r1 == 0) goto L_0x00f8
            if (r2 == 0) goto L_0x00f8
            android.os.IBinder r1 = r1.getWindowToken()
            r0 = 2
            r2.hideSoftInputFromWindow(r1, r0)
        L_0x00f8:
            boolean r0 = r5.A3Y()
            if (r0 == 0) goto L_0x010e
            X.02C r1 = r5.AGM()
            java.lang.String r0 = "search_fragment"
            X.01A r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x010e
            r5.A3U(r7)
        L_0x010e:
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0114
            r3.A0D = r4
        L_0x0114:
            int r0 = r3.A04
            r3.A02 = r0
        L_0x0118:
            return
        L_0x0119:
            androidx.appcompat.widget.Toolbar r0 = r5.A0J
            int r2 = r0.getHeight()
            int r0 = r5.A02
            if (r0 < r6) goto L_0x0124
            r7 = 0
        L_0x0124:
            r5.A02 = r6
            if (r9 != 0) goto L_0x012c
            boolean r0 = r5.A1v
            if (r0 == r7) goto L_0x014c
        L_0x012c:
            r5.A1v = r7
            int r0 = r5.A01
            int r0 = r0 + r6
            r5.A00 = r0
            android.view.View r0 = r5.A09
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r1 = r5.A09
            int r0 = r5.A01
            float r0 = (float) r0
            r1.setTranslationY(r0)
            com.obwhatsapp.WaTextView r1 = r5.A0X
            int r0 = r5.A01
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x014c:
            int r0 = r5.A00
            int r6 = r6 - r0
            int r0 = -r6
            int r1 = -r2
            int r0 = java.lang.Math.min(r0, r4)
            int r2 = java.lang.Math.max(r1, r0)
            int r0 = r5.A01
            if (r2 == r0) goto L_0x010e
            r5.A01 = r2
            android.view.View r0 = r5.A09
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r1 = r5.A09
            int r0 = r5.A01
            float r0 = (float) r0
            r1.setTranslationY(r0)
            com.obwhatsapp.WaTextView r1 = r5.A0X
            float r0 = (float) r2
            r1.setTranslationY(r0)
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DA.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        ObservableListView A3B;
        ObservableListView observableListView = this.A00;
        AbsListView.OnScrollListener onScrollListener = observableListView.A08;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i2);
        }
        C14690pb r4 = observableListView.A09;
        if (r4 != null && i2 == 0) {
            HomeActivity homeActivity = (HomeActivity) r4;
            if (observableListView != homeActivity.A3B()) {
                return;
            }
            if ((-homeActivity.A01) <= (homeActivity.A0J.getHeight() >> 1) || ((A3B = homeActivity.A3B()) != null && A3B.A04 < homeActivity.A0J.getHeight())) {
                homeActivity.A3H();
                return;
            }
            int i3 = -homeActivity.A0J.getHeight();
            float f2 = (float) i3;
            if (homeActivity.A09.getTranslationY() != f2) {
                homeActivity.A09.animate().cancel();
                homeActivity.A09.animate().translationY(f2).setDuration(250).start();
                homeActivity.A01 = i3;
            }
            homeActivity.A3V(false);
        }
    }
}
