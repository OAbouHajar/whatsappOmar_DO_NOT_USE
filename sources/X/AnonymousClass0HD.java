package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.0HD  reason: invalid class name */
public class AnonymousClass0HD extends AnonymousClass0SI {
    public final Path A00 = AnonymousClass000.A0I();
    public final AnonymousClass0UU A01 = new AnonymousClass0UU();

    public AnonymousClass0HD(List list) {
        super(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r3.A01 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A09(X.C06520Wl r16, float r17) {
        /*
            r15 = this;
            r0 = r16
            java.lang.Object r6 = r0.A0F
            X.0UU r6 = (X.AnonymousClass0UU) r6
            java.lang.Object r3 = r0.A09
            X.0UU r3 = (X.AnonymousClass0UU) r3
            X.0UU r5 = r15.A01
            android.graphics.PointF r0 = r5.A00
            if (r0 != 0) goto L_0x0017
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r5.A00 = r0
        L_0x0017:
            boolean r0 = r6.A01
            r10 = 1
            if (r0 != 0) goto L_0x0021
            boolean r1 = r3.A01
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            r5.A01 = r0
            java.util.List r8 = r6.A02
            int r1 = r8.size()
            java.util.List r7 = r3.A02
            int r0 = r7.size()
            if (r1 == r0) goto L_0x004f
            java.lang.String r0 = "Curves must have the same number of control points. Shape 1: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r8.size()
            r1.append(r0)
            java.lang.String r0 = "\tShape 2: "
            r1.append(r0)
            int r0 = r7.size()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            X.C05770Sy.A00(r0)
        L_0x004f:
            int r1 = r8.size()
            int r0 = r7.size()
            int r2 = java.lang.Math.min(r1, r0)
            java.util.List r4 = r5.A02
            int r0 = r4.size()
            int r1 = r4.size()
            if (r0 < r2) goto L_0x007b
            if (r1 <= r2) goto L_0x0088
            int r1 = r4.size()
            int r1 = r1 - r10
        L_0x006e:
            if (r1 < r2) goto L_0x0088
            int r0 = r4.size()
            int r0 = r0 - r10
            r4.remove(r0)
            int r1 = r1 + -1
            goto L_0x006e
        L_0x007b:
            if (r1 >= r2) goto L_0x0088
            X.0Tz r0 = new X.0Tz
            r0.<init>()
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x007b
        L_0x0088:
            android.graphics.PointF r6 = r6.A00
            android.graphics.PointF r3 = r3.A00
            float r1 = r6.x
            float r0 = r3.x
            r9 = r17
            float r2 = X.AnonymousClass000.A01(r0, r1, r9)
            float r1 = r6.y
            float r0 = r3.y
            float r1 = X.AnonymousClass000.A01(r0, r1, r9)
            android.graphics.PointF r0 = r5.A00
            if (r0 != 0) goto L_0x00a9
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r5.A00 = r0
        L_0x00a9:
            r0.set(r2, r1)
            int r6 = r4.size()
            int r6 = r6 - r10
        L_0x00b1:
            if (r6 < 0) goto L_0x011f
            java.lang.Object r2 = r8.get(r6)
            X.0Tz r2 = (X.C06040Tz) r2
            java.lang.Object r0 = r7.get(r6)
            X.0Tz r0 = (X.C06040Tz) r0
            android.graphics.PointF r1 = r2.A00
            android.graphics.PointF r13 = r2.A01
            android.graphics.PointF r11 = r2.A02
            android.graphics.PointF r14 = r0.A00
            android.graphics.PointF r12 = r0.A01
            android.graphics.PointF r10 = r0.A02
            java.lang.Object r3 = r4.get(r6)
            X.0Tz r3 = (X.C06040Tz) r3
            float r2 = r1.x
            float r0 = r14.x
            float r2 = X.AnonymousClass000.A01(r0, r2, r9)
            float r1 = r1.y
            float r0 = r14.y
            float r1 = X.AnonymousClass000.A01(r0, r1, r9)
            android.graphics.PointF r0 = r3.A00
            r0.set(r2, r1)
            java.lang.Object r3 = r4.get(r6)
            X.0Tz r3 = (X.C06040Tz) r3
            float r1 = r13.x
            float r0 = r12.x
            float r2 = X.AnonymousClass000.A01(r0, r1, r9)
            float r1 = r13.y
            float r0 = r12.y
            float r1 = X.AnonymousClass000.A01(r0, r1, r9)
            android.graphics.PointF r0 = r3.A01
            r0.set(r2, r1)
            java.lang.Object r3 = r4.get(r6)
            X.0Tz r3 = (X.C06040Tz) r3
            float r1 = r11.x
            float r0 = r10.x
            float r2 = X.AnonymousClass000.A01(r0, r1, r9)
            float r1 = r11.y
            float r0 = r10.y
            float r1 = X.AnonymousClass000.A01(r0, r1, r9)
            android.graphics.PointF r0 = r3.A02
            r0.set(r2, r1)
            int r6 = r6 + -1
            goto L_0x00b1
        L_0x011f:
            android.graphics.Path r8 = r15.A00
            r8.reset()
            android.graphics.PointF r2 = r5.A00
            float r1 = r2.x
            float r0 = r2.y
            r8.moveTo(r1, r0)
            android.graphics.PointF r3 = X.C06560Ws.A00
            float r1 = r2.x
            float r0 = r2.y
            r3.set(r1, r0)
            r2 = 0
        L_0x0137:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0176
            java.lang.Object r0 = r4.get(r2)
            X.0Tz r0 = (X.C06040Tz) r0
            android.graphics.PointF r7 = r0.A00
            android.graphics.PointF r1 = r0.A01
            android.graphics.PointF r6 = r0.A02
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x0166
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x0166
            float r1 = r6.x
            float r0 = r6.y
            r8.lineTo(r1, r0)
        L_0x015c:
            float r1 = r6.x
            float r0 = r6.y
            r3.set(r1, r0)
            int r2 = r2 + 1
            goto L_0x0137
        L_0x0166:
            float r9 = r7.x
            float r10 = r7.y
            float r11 = r1.x
            float r12 = r1.y
            float r13 = r6.x
            float r14 = r6.y
            r8.cubicTo(r9, r10, r11, r12, r13, r14)
            goto L_0x015c
        L_0x0176:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x017d
            r8.close()
        L_0x017d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HD.A09(X.0Wl, float):java.lang.Object");
    }
}
