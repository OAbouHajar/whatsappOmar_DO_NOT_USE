package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.38m  reason: invalid class name and case insensitive filesystem */
public class C613338m {
    public Rect A00;
    public View A01;
    public boolean A02;
    public final C49842Wd A03;
    public final AnonymousClass4O4 A04;

    public C613338m(C49842Wd r1, AnonymousClass4O4 r2) {
        this.A04 = r2;
        this.A03 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
        if (r5.contains(r9, r8) != false) goto L_0x0117;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(android.view.MotionEvent r11) {
        /*
            r10 = this;
            float r0 = r11.getX()
            int r9 = (int) r0
            float r0 = r11.getY()
            int r8 = (int) r0
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x00af
            r0 = 0
            r10.A01 = r0
            r10.A00 = r0
            r3 = 0
        L_0x0016:
            X.2Wd r1 = r10.A03
            int r0 = r1.getMountItemCount()
            if (r3 >= r0) goto L_0x00af
            X.2Wc r1 = (X.C49832Wc) r1
            X.4LN[] r0 = r1.A07
            r7 = r0[r3]
            if (r7 == 0) goto L_0x007e
            com.facebook.rendercore.RenderTreeNode r0 = r7.A01
            X.3BJ r0 = r0.A07
            long r5 = r0.A03()
            X.4O4 r2 = r10.A04
            int r0 = r2.A06
            long r0 = (long) r0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x007e
            java.lang.Object r5 = r7.A02
            boolean r0 = r5 instanceof android.view.View
            if (r0 == 0) goto L_0x007e
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x007e
            r10.A01 = r5
            android.graphics.Rect r4 = X.AnonymousClass000.A0J()
            r5.getHitRect(r4)
            float r0 = r2.A04
            r1 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            int r0 = r4.left
            float r1 = (float) r0
            float r0 = r2.A02
            float r1 = r1 - r0
            int r0 = (int) r1
            r4.left = r0
            int r0 = r4.right
            float r1 = (float) r0
            float r0 = r2.A03
        L_0x0066:
            float r1 = r1 + r0
            int r0 = (int) r1
            r4.right = r0
            int r0 = r4.top
            float r1 = (float) r0
            float r0 = r2.A05
            float r1 = r1 - r0
            int r0 = (int) r1
            r4.top = r0
            int r0 = r4.bottom
            float r1 = (float) r0
            float r0 = r2.A00
            float r1 = r1 + r0
            int r0 = (int) r1
            r4.bottom = r0
            r10.A00 = r4
        L_0x007e:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0081:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x00a0
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.C64013Mk.A00(r0)
            if (r0 == 0) goto L_0x00a0
            int r0 = r4.left
            float r1 = (float) r0
            float r0 = r2.A01
            float r1 = r1 - r0
            int r0 = (int) r1
            r4.left = r0
            int r0 = r4.right
            float r1 = (float) r0
            float r0 = r2.A04
            goto L_0x0066
        L_0x00a0:
            int r0 = r4.left
            float r1 = (float) r0
            float r0 = r2.A04
            float r1 = r1 - r0
            int r0 = (int) r1
            r4.left = r0
            int r0 = r4.right
            float r1 = (float) r0
            float r0 = r2.A01
            goto L_0x0066
        L_0x00af:
            android.graphics.Rect r0 = r10.A00
            r7 = 0
            if (r0 == 0) goto L_0x0103
            android.view.View r0 = r10.A01
            if (r0 == 0) goto L_0x0103
            X.2Wd r0 = r10.A03
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r6 = r0.getScaledTouchSlop()
            android.graphics.Rect r5 = X.AnonymousClass000.A0J()
            android.graphics.Rect r0 = r10.A00
            r5.set(r0)
            int r0 = -r6
            r5.inset(r0, r0)
            int r1 = r11.getAction()
            r4 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0122
            if (r1 == r4) goto L_0x010c
            if (r1 == r3) goto L_0x010c
            r0 = 3
            if (r1 != r0) goto L_0x0103
            boolean r2 = r10.A02
            r10.A02 = r7
        L_0x00e6:
            if (r2 == 0) goto L_0x0103
            if (r4 == 0) goto L_0x0104
            android.view.View r0 = r10.A01
            int r0 = r0.getWidth()
            int r0 = r0 / r3
            float r1 = (float) r0
            android.view.View r0 = r10.A01
            int r0 = r0.getHeight()
            int r0 = r0 / r3
            float r0 = (float) r0
            r11.setLocation(r1, r0)
        L_0x00fd:
            android.view.View r0 = r10.A01
            boolean r7 = r0.dispatchTouchEvent(r11)
        L_0x0103:
            return r7
        L_0x0104:
            int r0 = r6 << 1
            int r0 = -r0
            float r0 = (float) r0
            r11.setLocation(r0, r0)
            goto L_0x00fd
        L_0x010c:
            boolean r2 = r10.A02
            if (r2 == 0) goto L_0x0117
            boolean r0 = r5.contains(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0118
        L_0x0117:
            r1 = 1
        L_0x0118:
            int r0 = r11.getAction()
            if (r0 != r4) goto L_0x0120
            r10.A02 = r7
        L_0x0120:
            r4 = r1
            goto L_0x00e6
        L_0x0122:
            android.graphics.Rect r0 = r10.A00
            boolean r2 = r0.contains(r9, r8)
            r10.A02 = r2
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613338m.A00(android.view.MotionEvent):boolean");
    }
}
