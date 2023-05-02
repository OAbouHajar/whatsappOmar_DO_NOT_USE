package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.32w  reason: invalid class name */
public class AnonymousClass32w extends C455829l {
    public final Paint A00;
    public final Path A01;
    public final PointF A02;
    public final PointF A03;
    public final RectF A04;
    public final RectF A05;
    public final PointF[] A06;

    public AnonymousClass32w() {
        this.A01 = AnonymousClass000.A0I();
        Paint A062 = C13700nu.A06(1);
        this.A00 = A062;
        this.A04 = AnonymousClass000.A0K();
        this.A06 = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF()};
        this.A05 = AnonymousClass000.A0K();
        this.A02 = new PointF();
        this.A03 = new PointF();
        this.A00 = 110.0f;
        A062.setStyle(Paint.Style.FILL);
        A062.setColor(-31);
        C13690nt.A0y(this.A01);
    }

    public AnonymousClass32w(JSONObject jSONObject) {
        this();
        super.A0A(jSONObject);
    }

    public static PointF A02(PointF pointF, RectF rectF, PointF[] pointFArr, int i2) {
        pointF.y = rectF.top + rectF.height();
        return pointFArr[i2];
    }

    public static PointF A03(PointF pointF, RectF rectF, PointF[] pointFArr, int i2, int i3) {
        float f2 = rectF.left;
        pointF.x = f2;
        pointF.y = rectF.top;
        pointFArr[i2].x = f2 + rectF.width();
        pointFArr[i2].y = rectF.top;
        pointFArr[i3].x = rectF.left + rectF.width();
        return pointFArr[i3];
    }

    public static PointF A04(RectF rectF, PointF[] pointFArr, int i2, int i3, int i4) {
        pointFArr[i2].x = rectF.left + rectF.width();
        pointFArr[i2].y = rectF.top + rectF.height();
        PointF pointF = pointFArr[i3];
        pointF.x = rectF.left;
        pointF.y = rectF.top + rectF.height();
        return pointFArr[i4];
    }

    public static void A05(PointF pointF, RectF rectF, float f2) {
        pointF.y = rectF.top + ((rectF.height() * f2) / 6.0f);
    }

    public static void A06(RectF rectF, PointF[] pointFArr, int i2, int i3) {
        PointF pointF = pointFArr[i2];
        float f2 = rectF.left;
        pointF.x = f2;
        pointF.y = rectF.top;
        pointFArr[i3].x = f2 + rectF.width();
        pointFArr[i3].y = rectF.top;
    }

    public void A0O(float f2) {
        super.A0O((f2 * 2.0f) / 3.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r6 = r22
            android.graphics.RectF r4 = r6.A02
            r4.sort()
            android.graphics.Path r5 = r6.A01
            r5.reset()
            float r8 = r4.centerX()
            float r0 = r6.A00
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r1 = java.lang.Math.cos(r0)
            float r0 = r4.width()
            double r9 = (double) r0
            double r1 = r1 * r9
            r11 = 4606281698659794944(0x3fecccccc0000000, double:0.8999999761581421)
            double r1 = r1 * r11
            float r0 = (float) r1
            float r8 = r8 + r0
            float r3 = r4.centerY()
            float r0 = r6.A00
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r1 = java.lang.Math.sin(r0)
            float r0 = r4.height()
            double r9 = (double) r0
            double r1 = r1 * r9
            double r1 = r1 * r11
            float r0 = (float) r1
            float r3 = r3 + r0
            android.graphics.RectF r7 = r6.A04
            r7.set(r4)
            float r0 = r7.left
            float r1 = r8 - r0
            float r0 = r7.width()
            r12 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r12
            float r1 = r1 - r0
            float r0 = r7.top
            float r21 = r3 - r0
            float r0 = r7.height()
            float r0 = r0 / r12
            float r21 = r21 - r0
            float r14 = r7.height()
            float r0 = r7.width()
            float r14 = r14 / r0
            float r2 = r7.width()
            r20 = 1086324736(0x40c00000, float:6.0)
            float r2 = r2 / r20
            float r0 = r7.height()
            float r0 = r0 / r20
            float r19 = java.lang.Math.min(r2, r0)
            float r18 = r19 * r12
            android.graphics.PointF[] r4 = r6.A06
            r17 = 0
            r0 = r4[r17]
            r0.x = r8
            r0.y = r3
            r16 = 1082130432(0x40800000, float:4.0)
            r2 = 1077936128(0x40400000, float:3.0)
            r3 = 0
            r8 = 6
            r10 = 5
            r11 = 4
            r9 = 3
            r13 = 2
            r15 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0229
            int r0 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0229
            float r0 = -r1
            float r0 = r0 * r14
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x0347
            r14 = r4[r15]
            float r1 = r7.left
            float r0 = r7.width()
            float r0 = r0 * r12
            float r0 = r0 / r20
            float r1 = r1 + r0
            r14.x = r1
            r0 = r4[r15]
            android.graphics.PointF r1 = A02(r0, r7, r4, r13)
            float r0 = r7.left
            r1.x = r0
            android.graphics.PointF r0 = A02(r1, r7, r4, r9)
            android.graphics.PointF r0 = A03(r0, r7, r4, r11, r10)
            android.graphics.PointF r9 = A02(r0, r7, r4, r8)
            float r1 = r7.left
            float r0 = r7.width()
            float r0 = r0 * r2
        L_0x00c8:
            float r0 = r0 / r20
            float r1 = r1 + r0
            r9.x = r1
            r8 = r4[r8]
            float r1 = r7.top
            float r0 = r7.height()
        L_0x00d5:
            float r1 = r1 + r0
        L_0x00d6:
            r8.y = r1
        L_0x00d8:
            r0 = r4[r17]
            float r1 = r0.x
            float r0 = r0.y
            r5.moveTo(r1, r0)
            r8 = 0
        L_0x00e2:
            android.graphics.PointF r12 = r6.A02
            r0 = r4[r8]
            float r1 = r0.x
            float r0 = r0.y
            r12.set(r1, r0)
            android.graphics.PointF r9 = r6.A03
            int r8 = r8 + 1
            int r0 = r8 % 7
            r0 = r4[r0]
            float r1 = r0.x
            float r0 = r0.y
            r9.set(r1, r0)
            float r10 = r12.x
            float r0 = r7.left
            r13 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0123
            float r11 = r12.y
            float r0 = r7.top
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0123
            float r1 = r10 + r18
            float r0 = r11 + r18
            android.graphics.RectF r2 = r6.A05
            r2.set(r10, r11, r1, r0)
            r1 = 1127481344(0x43340000, float:180.0)
            r0 = 0
            r5.arcTo(r2, r1, r13, r0)
            float r10 = r12.x
            float r10 = r10 + r19
            r12.x = r10
        L_0x0123:
            float r0 = r9.x
            float r2 = r7.left
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0137
            float r1 = r9.y
            float r0 = r7.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0137
            float r1 = r1 + r19
            r9.y = r1
        L_0x0137:
            float r0 = r7.width()
            float r2 = r2 + r0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x015f
            float r11 = r12.y
            float r0 = r7.top
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x015f
            float r10 = r12.x
            float r1 = r10 - r18
            float r0 = r11 + r18
            android.graphics.RectF r2 = r6.A05
            r2.set(r1, r11, r10, r0)
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0 = 0
            r5.arcTo(r2, r1, r13, r0)
            float r0 = r12.y
            float r0 = r0 + r19
            r12.y = r0
        L_0x015f:
            float r2 = r9.x
            float r1 = r7.left
            float r0 = r7.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x017a
            float r1 = r9.y
            float r0 = r7.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x017a
            float r0 = r9.x
            float r0 = r0 - r19
            r9.x = r0
        L_0x017a:
            float r2 = r12.x
            float r1 = r7.left
            float r0 = r7.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01ab
            float r2 = r12.y
            float r1 = r7.top
            float r0 = r7.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01ab
            float r11 = r12.x
            float r10 = r11 - r18
            float r2 = r12.y
            float r0 = r2 - r18
            android.graphics.RectF r1 = r6.A05
            r1.set(r10, r0, r11, r2)
            r0 = 0
            r5.arcTo(r1, r3, r13, r0)
            float r0 = r12.x
            float r0 = r0 - r19
            r12.x = r0
        L_0x01ab:
            float r2 = r9.x
            float r1 = r7.left
            float r0 = r7.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01cb
            float r2 = r9.y
            float r1 = r7.top
            float r0 = r7.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01cb
            float r0 = r9.y
            float r0 = r0 - r19
            r9.y = r0
        L_0x01cb:
            float r1 = r12.x
            float r0 = r7.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01f7
            float r2 = r12.y
            float r1 = r7.top
            float r0 = r7.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01f7
            float r11 = r12.x
            float r10 = r12.y
            float r2 = r10 - r18
            float r0 = r11 + r18
            android.graphics.RectF r1 = r6.A05
            r1.set(r11, r2, r0, r10)
            r0 = 0
            r5.arcTo(r1, r13, r13, r0)
            float r0 = r12.y
            float r0 = r0 - r19
            r12.y = r0
        L_0x01f7:
            float r1 = r9.x
            float r0 = r7.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0212
            float r2 = r9.y
            float r1 = r7.top
            float r0 = r7.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0212
            float r0 = r9.x
            float r0 = r0 + r19
            r9.x = r0
        L_0x0212:
            float r1 = r9.x
            float r0 = r9.y
            r5.lineTo(r1, r0)
            r0 = 7
            if (r8 < r0) goto L_0x00e2
            android.graphics.Paint r0 = r6.A00
            r1 = r23
            r1.drawPath(r5, r0)
            android.graphics.Paint r0 = r6.A01
            r1.drawPath(r5, r0)
            return
        L_0x0229:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0264
            int r0 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0264
            float r1 = r1 * r14
            int r14 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            r12 = r4[r15]
            float r1 = r7.left
            float r0 = r7.width()
            if (r14 >= 0) goto L_0x030f
            float r0 = r0 * r2
            float r0 = r0 / r20
            float r1 = r1 + r0
            r12.x = r1
            r0 = r4[r15]
            android.graphics.PointF r1 = A02(r0, r7, r4, r13)
            float r0 = r7.left
            r1.x = r0
            android.graphics.PointF r0 = A02(r1, r7, r4, r9)
            android.graphics.PointF r0 = A03(r0, r7, r4, r11, r10)
            android.graphics.PointF r9 = A02(r0, r7, r4, r8)
            float r1 = r7.left
            float r0 = r7.width()
            float r0 = r0 * r16
            goto L_0x00c8
        L_0x0264:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b4
            int r0 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b4
            float r1 = r1 * r14
            int r0 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            r1 = r4[r15]
            if (r0 < 0) goto L_0x02fc
            float r14 = r7.left
            float r0 = r7.width()
            float r0 = r0 * r2
            float r0 = r0 / r20
            float r14 = r14 + r0
            r1.x = r14
            r1 = r4[r15]
            float r0 = r7.top
            r1.y = r0
            r2 = r4[r13]
            float r1 = r7.left
            float r0 = r7.width()
            float r1 = r1 + r0
            r2.x = r1
            r1 = r4[r13]
            float r0 = r7.top
            r1.y = r0
            android.graphics.PointF r1 = A04(r7, r4, r9, r11, r10)
            float r9 = r7.left
            r1.x = r9
            float r0 = r7.top
            r1.y = r0
            r1 = r4[r8]
            float r0 = r7.width()
            float r0 = r0 * r12
        L_0x02a9:
            float r0 = r0 / r20
            float r9 = r9 + r0
            r1.x = r9
            r8 = r4[r8]
            float r1 = r7.top
            goto L_0x00d6
        L_0x02b4:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0367
            int r0 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0367
            float r0 = -r1
            float r0 = r0 * r14
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            r14 = r4[r15]
            if (r0 < 0) goto L_0x0329
            float r1 = r7.left
            float r0 = r7.width()
            float r0 = r0 * r16
            float r0 = r0 / r20
            float r1 = r1 + r0
            r14.x = r1
            r1 = r4[r15]
            float r0 = r7.top
            r1.y = r0
            r12 = r4[r13]
            float r1 = r7.left
            float r0 = r7.width()
            float r1 = r1 + r0
            r12.x = r1
            r1 = r4[r13]
            float r0 = r7.top
            r1.y = r0
            android.graphics.PointF r1 = A04(r7, r4, r9, r11, r10)
            float r9 = r7.left
            r1.x = r9
            float r0 = r7.top
            r1.y = r0
            r1 = r4[r8]
            float r0 = r7.width()
            float r0 = r0 * r2
            goto L_0x02a9
        L_0x02fc:
            float r0 = r7.left
            r1.x = r0
            A05(r1, r7, r12)
            A06(r7, r4, r13, r9)
            android.graphics.PointF r8 = A04(r7, r4, r11, r10, r8)
            float r0 = r7.left
            r8.x = r0
            goto L_0x0321
        L_0x030f:
            float r1 = r1 + r0
            r12.x = r1
            r1 = r4[r15]
            r0 = 1082130432(0x40800000, float:4.0)
            A05(r1, r7, r0)
            android.graphics.PointF r0 = A04(r7, r4, r13, r9, r11)
            android.graphics.PointF r8 = A03(r0, r7, r4, r10, r8)
        L_0x0321:
            float r1 = r7.top
            float r0 = r7.height()
            float r0 = r0 * r2
            goto L_0x0363
        L_0x0329:
            float r1 = r7.left
            float r0 = r7.width()
            float r1 = r1 + r0
            r14.x = r1
            r0 = r4[r15]
            A05(r0, r7, r2)
            android.graphics.PointF r0 = A04(r7, r4, r13, r9, r11)
            android.graphics.PointF r8 = A03(r0, r7, r4, r10, r8)
            float r1 = r7.top
            float r0 = r7.height()
            float r0 = r0 * r12
            goto L_0x0363
        L_0x0347:
            r1 = r4[r15]
            float r0 = r7.left
            r1.x = r0
            A05(r1, r7, r2)
            A06(r7, r4, r13, r9)
            android.graphics.PointF r8 = A04(r7, r4, r11, r10, r8)
            float r0 = r7.left
            r8.x = r0
            float r1 = r7.top
            float r0 = r7.height()
            float r0 = r0 * r16
        L_0x0363:
            float r0 = r0 / r20
            goto L_0x00d5
        L_0x0367:
            A06(r7, r4, r15, r13)
            android.graphics.PointF r0 = A04(r7, r4, r9, r11, r10)
            float r2 = r7.left
            r0.x = r2
            float r1 = r7.top
            r0.y = r1
            r0 = r4[r8]
            r0.x = r2
            r0.y = r1
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32w.A0P(android.graphics.Canvas):void");
    }

    public void A0Q(RectF rectF, float f2, float f3, float f4, float f5) {
        float f6 = (f3 + f5) / 2.0f;
        float f7 = (((f4 - f2) * 2.0f) / 3.0f) / 2.0f;
        float f8 = f6 - f7;
        float f9 = f6 + f7;
        super.A0Q(rectF, f2, f8, f4, f9);
    }
}
