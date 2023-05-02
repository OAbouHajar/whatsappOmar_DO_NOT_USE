package X;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2q9  reason: invalid class name and case insensitive filesystem */
public class C57112q9 extends AnonymousClass0EL {
    public Rect A00 = AnonymousClass000.A0J();
    public Rect A01 = AnonymousClass000.A0J();
    public Rect A02 = AnonymousClass000.A0J();
    public Rect A03 = AnonymousClass000.A0J();
    public boolean A04 = false;
    public final int A05;
    public final C456329v A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public C57112q9(View view, C456329v r4, int i2) {
        super(view);
        this.A05 = i2;
        this.A06 = r4;
        this.A09 = view.getResources().getString(R.string.str0044);
        this.A0A = view.getResources().getString(R.string.str0045);
        this.A07 = view.getResources().getString(R.string.str0042);
        this.A08 = view.getResources().getString(R.string.str0043);
    }

    public int A07(float f2, float f3) {
        if (A0L()) {
            int i2 = (int) f2;
            int i3 = (int) f3;
            if (this.A02.contains(i2, i3)) {
                return 0;
            }
            if (this.A03.contains(i2, i3)) {
                return 1;
            }
            if (this.A00.contains(i2, i3)) {
                return 2;
            }
            if (this.A01.contains(i2, i3)) {
                return 3;
            }
        }
        return -1;
    }

    public void A0D(AnonymousClass031 r3, int i2) {
        Rect rect;
        if (A0L()) {
            AccessibilityNodeInfo accessibilityNodeInfo = r3.A01;
            accessibilityNodeInfo.setClassName("VideoTimelineView");
            accessibilityNodeInfo.addAction(16);
            if (i2 == 0) {
                accessibilityNodeInfo.setContentDescription(this.A09);
                rect = this.A02;
            } else if (i2 == 1) {
                accessibilityNodeInfo.setContentDescription(this.A0A);
                rect = this.A03;
            } else if (i2 == 2) {
                accessibilityNodeInfo.setContentDescription(this.A07);
                rect = this.A00;
            } else if (i2 == 3) {
                accessibilityNodeInfo.setContentDescription(this.A08);
                rect = this.A01;
            } else {
                return;
            }
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    public void A0E(List list) {
        if (A0L()) {
            list.add(C13680ns.A0X());
            list.add(C13680ns.A0Y());
            list.add(C13680ns.A0Z());
            list.add(C13680ns.A0a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(int r22, int r23, android.os.Bundle r24) {
        /*
            r21 = this;
            r0 = r21
            X.29v r13 = r0.A06
            r7 = 0
            if (r13 == 0) goto L_0x00d6
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x00d6
            r0 = 16
            r1 = r23
            if (r1 != r0) goto L_0x00d6
            r6 = 1
            r1 = r22
            if (r22 == 0) goto L_0x0087
            if (r1 == r6) goto L_0x007f
            r8 = 2
            if (r1 == r8) goto L_0x0076
            r0 = 3
            if (r1 != r0) goto L_0x0075
            com.obwhatsapp.mediacomposer.VideoTimelineView r13 = (com.obwhatsapp.mediacomposer.VideoTimelineView) r13
            long r0 = r13.A0G
            long r11 = com.obwhatsapp.mediacomposer.VideoTimelineView.A0U
            long r2 = (long) r6
        L_0x0027:
            long r4 = r11 * r2
            long r0 = r0 + r4
            long r4 = r13.A0D
            long r2 = r13.A0F
            long r0 = java.lang.Math.max(r0, r2)
            long r0 = java.lang.Math.min(r4, r0)
            r13.A0G = r0
            long r9 = r0 - r2
            long r2 = r13.A0E
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0043
            long r0 = r0 - r2
            r13.A0F = r0
        L_0x0043:
            r13.invalidate()
            X.5Ps r5 = r13.A0I
            if (r5 == 0) goto L_0x005b
            long r2 = r13.A0F
            long r0 = r13.A0G
            int r4 = r13.A0A
            r14 = r5
            r15 = r13
            r16 = r4
            r17 = r2
            r19 = r0
            r14.AYt(r15, r16, r17, r19)
        L_0x005b:
            long r2 = r13.A0F
            long r2 = r2 / r11
            long r0 = r13.A0G
            long r0 = r0 / r11
            X.013 r9 = r13.A0H
            r5 = 2131755010(0x7f100002, float:1.9140887E38)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            X.C13690nt.A1Q(r4, r7, r2)
            X.C13690nt.A1Q(r4, r6, r0)
            java.lang.String r0 = r9.A0J(r4, r5, r0)
        L_0x0072:
            r13.announceForAccessibility(r0)
        L_0x0075:
            return r6
        L_0x0076:
            com.obwhatsapp.mediacomposer.VideoTimelineView r13 = (com.obwhatsapp.mediacomposer.VideoTimelineView) r13
            r2 = -1
            long r0 = r13.A0G
            long r11 = com.obwhatsapp.mediacomposer.VideoTimelineView.A0U
            long r2 = (long) r2
            goto L_0x0027
        L_0x007f:
            com.obwhatsapp.mediacomposer.VideoTimelineView r13 = (com.obwhatsapp.mediacomposer.VideoTimelineView) r13
            long r0 = r13.A0F
            long r9 = com.obwhatsapp.mediacomposer.VideoTimelineView.A0U
            long r4 = (long) r6
            goto L_0x008f
        L_0x0087:
            com.obwhatsapp.mediacomposer.VideoTimelineView r13 = (com.obwhatsapp.mediacomposer.VideoTimelineView) r13
            r2 = -1
            long r0 = r13.A0F
            long r9 = com.obwhatsapp.mediacomposer.VideoTimelineView.A0U
            long r4 = (long) r2
        L_0x008f:
            long r2 = r9 * r4
            long r0 = r0 + r2
            long r4 = r13.A0G
            long r2 = java.lang.Math.min(r0, r4)
            r0 = 0
            long r2 = java.lang.Math.max(r0, r2)
            r13.A0F = r2
            long r4 = r4 - r2
            long r0 = r13.A0E
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x00aa
            long r2 = r2 + r0
            r13.A0G = r2
        L_0x00aa:
            r13.invalidate()
            X.5Ps r12 = r13.A0I
            if (r12 == 0) goto L_0x00bc
            long r15 = r13.A0F
            long r0 = r13.A0G
            int r14 = r13.A0A
            r17 = r0
            r12.AYt(r13, r14, r15, r17)
        L_0x00bc:
            long r2 = r13.A0F
            long r2 = r2 / r9
            long r0 = r13.A0G
            long r0 = r0 / r9
            X.013 r8 = r13.A0H
            r5 = 2131755010(0x7f100002, float:1.9140887E38)
            java.lang.Object[] r4 = X.C13690nt.A1Z()
            X.C13690nt.A1Q(r4, r7, r2)
            X.C13690nt.A1Q(r4, r6, r0)
            java.lang.String r0 = r8.A0J(r4, r5, r0)
            goto L_0x0072
        L_0x00d6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57112q9.A0H(int, int, android.os.Bundle):boolean");
    }

    public final boolean A0L() {
        return this.A04 && !this.A02.isEmpty() && !this.A03.isEmpty() && !this.A00.isEmpty() && !this.A01.isEmpty();
    }
}
