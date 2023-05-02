package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.5yg  reason: invalid class name and case insensitive filesystem */
public class C119565yg implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C118905vb A00;

    public C119565yg(C118905vb r1) {
        this.A00 = r1;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onFling(android.view.MotionEvent r10, android.view.MotionEvent r11, float r12, float r13) {
        /*
            r9 = this;
            r1 = 0
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            X.5om r8 = X.C114895om.A03
        L_0x000b:
            X.5vb r5 = r9.A00
            X.5om r2 = X.C114895om.A02
            int r7 = r5.A05
            int r1 = r2.flag
            r0 = r7 & r1
            boolean r0 = X.AnonymousClass000.A1R(r0, r1)
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001f
            if (r8 == r2) goto L_0x0029
        L_0x001f:
            X.5om r2 = X.C114895om.A03
            int r1 = r2.flag
            r0 = r7 & r1
            if (r0 != r1) goto L_0x0045
            if (r8 != r2) goto L_0x0045
        L_0x0029:
            r3 = 1
        L_0x002a:
            X.5om r2 = X.C114895om.A01
            int r1 = r2.flag
            r0 = r7 & r1
            if (r0 != r1) goto L_0x0034
            if (r8 == r2) goto L_0x003d
        L_0x0034:
            X.5om r1 = X.C114895om.A04
            int r0 = r1.flag
            r7 = r7 & r0
            if (r7 != r0) goto L_0x0043
            if (r8 != r1) goto L_0x0043
        L_0x003d:
            r0 = 1
        L_0x003e:
            if (r3 != 0) goto L_0x0054
            if (r0 != 0) goto L_0x0054
            return r4
        L_0x0043:
            r0 = 0
            goto L_0x003e
        L_0x0045:
            r3 = 0
            goto L_0x002a
        L_0x0047:
            X.5om r8 = X.C114895om.A02
            goto L_0x000b
        L_0x004a:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            X.5om r8 = X.C114895om.A01
            goto L_0x000b
        L_0x0051:
            X.5om r8 = X.C114895om.A04
            goto L_0x000b
        L_0x0054:
            X.68G r1 = r5.A0E
            r11.getX()
            r11.getY()
            com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            r0 = 0
            r1.A0E = r0
            r1.A01()
            X.5oj r0 = X.C114865oj.AT_REST
            r5.A0F = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119565yg.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
