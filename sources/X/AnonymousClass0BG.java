package X;

import android.os.Handler;

/* renamed from: X.0BG  reason: invalid class name */
public class AnonymousClass0BG extends Handler {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (X.AnonymousClass0WR.A0P.size() > 0) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r16) {
        /*
            r15 = this;
            r0 = r16
            int r0 = r0.what
            r6 = 0
            r9 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r8) goto L_0x00ff
            r14 = 1
        L_0x000d:
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            java.util.ArrayList r3 = X.AnonymousClass0WR.A0P
            int r11 = r3.size()
            r10 = 0
        L_0x0018:
            if (r10 >= r11) goto L_0x0073
            java.lang.Object r2 = r3.get(r10)
            X.0WR r2 = (X.AnonymousClass0WR) r2
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x002b
            r2.A0H = r8
            r2.A06 = r4
        L_0x0028:
            int r10 = r10 + 1
            goto L_0x0018
        L_0x002b:
            long r0 = r2.A06
            long r12 = r4 - r0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            long r12 = r12 - r6
            long r0 = r4 - r12
            r2.A09 = r0
            r2.A04 = r8
            java.util.ArrayList r0 = X.AnonymousClass0WR.A0S
            r0.add(r2)
            goto L_0x0028
        L_0x0040:
            java.util.ArrayList r4 = X.AnonymousClass0WR.A0O
            int r0 = r4.size()
            if (r0 > 0) goto L_0x0051
            java.util.ArrayList r0 = X.AnonymousClass0WR.A0P
            int r0 = r0.size()
            r14 = 1
            if (r0 <= 0) goto L_0x0052
        L_0x0051:
            r14 = 0
        L_0x0052:
            java.util.ArrayList r3 = X.AnonymousClass0WR.A0R
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x000d
            int r2 = r3.size()
            r1 = 0
        L_0x005f:
            if (r1 >= r2) goto L_0x006f
            java.lang.Object r0 = r3.get(r1)
            X.0WR r0 = (X.AnonymousClass0WR) r0
            r0.A0E = r8
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x005f
        L_0x006f:
            r3.clear()
            goto L_0x0052
        L_0x0073:
            java.util.ArrayList r11 = X.AnonymousClass0WR.A0S
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x009a
            int r10 = r11.size()
            r2 = 0
        L_0x0080:
            if (r2 >= r10) goto L_0x0097
            java.lang.Object r1 = r11.get(r2)
            X.0WR r1 = (X.AnonymousClass0WR) r1
            r1.A0E = r8
            java.util.ArrayList r0 = X.AnonymousClass0WR.A0O
            r0.add(r1)
            r1.A0F = r8
            r3.remove(r1)
            int r2 = r2 + 1
            goto L_0x0080
        L_0x0097:
            r11.clear()
        L_0x009a:
            java.util.ArrayList r10 = X.AnonymousClass0WR.A0O
            int r11 = r10.size()
            r2 = 0
        L_0x00a1:
            if (r2 >= r11) goto L_0x00c5
            java.lang.Object r1 = r10.get(r2)
            X.0WR r1 = (X.AnonymousClass0WR) r1
            boolean r0 = r1.A08(r4)
            if (r0 == 0) goto L_0x00b4
            java.util.ArrayList r0 = X.AnonymousClass0WR.A0Q
            r0.add(r1)
        L_0x00b4:
            int r0 = r10.size()
            if (r0 != r11) goto L_0x00bd
            int r2 = r2 + 1
            goto L_0x00a1
        L_0x00bd:
            int r11 = r11 + -1
            java.util.ArrayList r0 = X.AnonymousClass0WR.A0Q
            r0.remove(r1)
            goto L_0x00a1
        L_0x00c5:
            java.util.ArrayList r2 = X.AnonymousClass0WR.A0Q
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00e2
            int r1 = r2.size()
        L_0x00d1:
            if (r9 >= r1) goto L_0x00df
            java.lang.Object r0 = r2.get(r9)
            X.0WR r0 = (X.AnonymousClass0WR) r0
            r0.A04()
            int r9 = r9 + 1
            goto L_0x00d1
        L_0x00df:
            r2.clear()
        L_0x00e2:
            if (r14 == 0) goto L_0x00ff
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00ff
        L_0x00f0:
            r2 = 10
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r0 = r0 - r4
            long r2 = r2 - r0
            long r0 = java.lang.Math.max(r6, r2)
            r15.sendEmptyMessageDelayed(r8, r0)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BG.handleMessage(android.os.Message):void");
    }
}
