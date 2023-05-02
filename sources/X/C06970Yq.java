package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.0Yq  reason: invalid class name and case insensitive filesystem */
public abstract class C06970Yq implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int A00;
    public Runnable A01;
    public Runnable A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final int[] A08 = new int[2];

    public C06970Yq(View view) {
        this.A07 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A04 = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.A06 = tapTimeout;
        this.A05 = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract C13250li A00();

    public final void A01() {
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.A01;
        if (runnable2 != null) {
            this.A07.removeCallbacks(runnable2);
        }
    }

    public boolean A02() {
        C13250li A002 = A00();
        if (A002 == null || !A002.AJh()) {
            return true;
        }
        A002.dismiss();
        return true;
    }

    public abstract boolean A03();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r2 == 3) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r0 != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (A02() == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        if (r1 != 3) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
        /*
            r14 = this;
            boolean r5 = r14.A03
            r4 = 1
            r2 = r16
            if (r5 == 0) goto L_0x006c
            android.view.View r9 = r14.A07
            X.0li r1 = r14.A00()
            r8 = 0
            if (r1 == 0) goto L_0x0065
            boolean r0 = r1.AJh()
            if (r0 == 0) goto L_0x0065
            android.widget.ListView r3 = r1.ADA()
            X.0CV r3 = (X.AnonymousClass0CV) r3
            if (r3 == 0) goto L_0x0065
            boolean r0 = r3.isShown()
            if (r0 == 0) goto L_0x0065
            android.view.MotionEvent r6 = android.view.MotionEvent.obtainNoHistory(r2)
            int[] r7 = r14.A08
            r9.getLocationOnScreen(r7)
            r0 = r7[r8]
            float r1 = (float) r0
            r0 = r7[r4]
            float r0 = (float) r0
            r6.offsetLocation(r1, r0)
            r3.getLocationOnScreen(r7)
            r0 = r7[r8]
            int r0 = -r0
            float r1 = (float) r0
            r0 = r7[r4]
            int r0 = -r0
            float r0 = (float) r0
            r6.offsetLocation(r1, r0)
            int r0 = r14.A00
            boolean r3 = r3.A01(r6, r0)
            r6.recycle()
            int r2 = r2.getActionMasked()
            if (r2 == r4) goto L_0x0057
            r1 = 3
            r0 = 1
            if (r2 != r1) goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r3 == 0) goto L_0x0065
            if (r0 == 0) goto L_0x0065
        L_0x005c:
            r1 = 1
        L_0x005d:
            r14.A03 = r1
            if (r1 != 0) goto L_0x0064
            if (r5 != 0) goto L_0x0064
            r4 = 0
        L_0x0064:
            return r4
        L_0x0065:
            boolean r0 = r14.A02()
            if (r0 != 0) goto L_0x0083
            goto L_0x005c
        L_0x006c:
            android.view.View r3 = r14.A07
            boolean r0 = r3.isEnabled()
            r13 = 0
            if (r0 == 0) goto L_0x0083
            int r1 = r2.getActionMasked()
            if (r1 == 0) goto L_0x00e8
            if (r1 == r4) goto L_0x00e4
            r0 = 2
            if (r1 == r0) goto L_0x0085
            r0 = 3
            if (r1 == r0) goto L_0x00e4
        L_0x0083:
            r1 = 0
            goto L_0x005d
        L_0x0085:
            int r0 = r14.A00
            int r0 = r2.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0083
            float r7 = r2.getX(r0)
            float r6 = r2.getY(r0)
            float r2 = r14.A04
            float r1 = -r2
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00bf
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00bf
            int r1 = r3.getRight()
            int r0 = r3.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bf
            int r1 = r3.getBottom()
            int r0 = r3.getTop()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bf
            goto L_0x0083
        L_0x00bf:
            r14.A01()
            android.view.ViewParent r0 = r3.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            boolean r0 = r14.A03()
            if (r0 == 0) goto L_0x0083
            r1 = 1
            long r6 = android.os.SystemClock.uptimeMillis()
            r10 = 3
            r11 = 0
            r12 = 0
            r8 = r6
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r6, r8, r10, r11, r12, r13)
            r3.onTouchEvent(r0)
            r0.recycle()
            goto L_0x005d
        L_0x00e4:
            r14.A01()
            goto L_0x0083
        L_0x00e8:
            int r0 = r2.getPointerId(r13)
            r14.A00 = r0
            java.lang.Runnable r2 = r14.A01
            if (r2 != 0) goto L_0x00f9
            X.0fE r2 = new X.0fE
            r2.<init>(r14)
            r14.A01 = r2
        L_0x00f9:
            int r0 = r14.A06
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            java.lang.Runnable r2 = r14.A02
            if (r2 != 0) goto L_0x010a
            X.0fF r2 = new X.0fF
            r2.<init>(r14)
            r14.A02 = r2
        L_0x010a:
            int r0 = r14.A05
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06970Yq.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.A03 = false;
        this.A00 = -1;
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
    }
}
