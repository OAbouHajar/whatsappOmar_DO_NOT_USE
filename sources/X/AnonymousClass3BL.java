package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import java.util.Locale;

/* renamed from: X.3BL  reason: invalid class name */
public abstract class AnonymousClass3BL {
    public C16750ta A00;
    public final int A01;

    public AnonymousClass3BL(int i2) {
        this.A01 = i2;
    }

    public static float A01(int i2, float f2) {
        return View.MeasureSpec.getMode(i2) != 0 ? Math.min((float) View.MeasureSpec.getSize(i2), f2) : f2;
    }

    public static Pair A02(float f2, float f3) {
        return Pair.create(Integer.valueOf(Math.round(f2)), Integer.valueOf(Math.round(f3)));
    }

    public int A03() {
        int i2 = this.A01;
        int A04 = A04();
        AnonymousClass00B.A0F(AnonymousClass000.A1O(A04));
        return Math.round((((float) i2) * ((float) A04)) / 100.0f);
    }

    public int A04() {
        C603531c r1 = (C603531c) this;
        return (r1.A0A() ? r1.A01 : r1.A00).A02;
    }

    public RectF A05(int i2, int i3) {
        C603531c r1 = (C603531c) this;
        return r1.A06(r1.A00, i2, i3);
    }

    public final RectF A06(AnonymousClass4RB r13, int i2, int i3) {
        float f2;
        C16750ta r1 = this.A00;
        if (r1 == null || i3 <= 0 || i2 <= 0) {
            return null;
        }
        float f3 = (float) r1.A08;
        float f4 = (float) r1.A06;
        PointF pointF = new PointF(f3 / 2.0f, f4 / 2.0f);
        float f5 = (float) i2;
        float f6 = (float) i3;
        PointF pointF2 = new PointF(f5 / 2.0f, f6 / 2.0f);
        if (A0A()) {
            int i4 = this.A00.A03;
            pointF.y = i4 > 0 ? (float) i4 : f4 / 3.0f;
            pointF2.y = f6 / 3.0f;
        }
        float f7 = f3 / f5;
        float f8 = f6 * f7;
        float f9 = f3 / f4;
        if (f9 > r13.A01 / r13.A00) {
            f7 = f4 / f6;
            f2 = f5 * f7;
            f8 = f4;
        } else {
            f2 = f3;
        }
        PointF pointF3 = new PointF(pointF2.x * f7, pointF2.y * f7);
        RectF A0K = AnonymousClass000.A0K();
        float f10 = pointF.x - pointF3.x;
        A0K.left = f10;
        float f11 = pointF.y - pointF3.y;
        A0K.top = f11;
        A0K.right = f10 + f2;
        float f12 = f11 + f8;
        A0K.bottom = f12;
        if (f11 < 0.0f) {
            A0K.top = 0.0f;
            A0K.bottom = f8;
            f12 = f8;
        }
        if (f12 > f4) {
            A0K.bottom = f4;
            A0K.top = f4 - f8;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[12];
        objArr[0] = Float.valueOf(f3);
        objArr[1] = Float.valueOf(f4);
        objArr[2] = Float.valueOf(f9);
        C16750ta r8 = this.A00;
        AnonymousClass000.A1M(objArr, r8.A02, 3);
        AnonymousClass000.A1M(objArr, r8.A03, 4);
        AnonymousClass000.A1M(objArr, i2, 5);
        AnonymousClass000.A1M(objArr, i3, 6);
        objArr[7] = Float.valueOf(f5 / f6);
        objArr[8] = Float.valueOf(f2);
        objArr[9] = Float.valueOf(f8);
        objArr[10] = Float.valueOf(f2 / f8);
        objArr[11] = A0K.toString();
        String.format(locale, "ConversationRowSingleImagePreviewCalculator/getSourceRect bitmap=%f,%f(%f) face=%d,%d preview=%d,%d(%f) scaled=%f,%f(%f) rect=%s", objArr);
        return A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r6 == null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A07(int r10, int r11) {
        /*
            r9 = this;
            r4 = r9
            X.31c r4 = (X.C603531c) r4
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x00ce
            X.4RB r6 = r4.A01
        L_0x000b:
            int r0 = r4.A01
            float r3 = (float) r0
            int r0 = r6.A02
            float r0 = (float) r0
            float r1 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            java.lang.Float r8 = X.C603531c.A00(r1, r10)
            if (r8 == 0) goto L_0x006b
            float r7 = r8.floatValue()
            X.0ta r2 = r4.A00
            int r0 = r2.A06
            float r1 = (float) r0
            float r1 = r1 * r7
            int r0 = r2.A08
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r5 = X.C603531c.A00(r1, r11)
            if (r5 == 0) goto L_0x006b
            X.0ta r1 = r4.A00
            int r0 = r1.A08
            float r2 = (float) r0
            float r7 = r7 / r2
            float r5 = r5.floatValue()
            int r0 = r1.A06
            float r0 = (float) r0
            float r1 = r5 / r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0048
            float r2 = r2 * r1
            java.lang.Float r8 = java.lang.Float.valueOf(r2)
        L_0x0048:
            float r2 = r8.floatValue()
            float r0 = r6.A00
            float r1 = r2 * r0
            float r0 = r6.A01
            float r1 = r1 / r0
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x00c9
            float r0 = java.lang.Math.min(r5, r1)
        L_0x005d:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            android.util.Pair r6 = A02(r2, r0)
            if (r6 != 0) goto L_0x007d
        L_0x006b:
            r0 = 72
            float r0 = (float) r0
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3 * r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            android.util.Pair r6 = A02(r3, r1)
        L_0x007d:
            java.util.Locale r7 = java.util.Locale.US
            r0 = 8
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r0 = 0
            X.0ta r4 = r4.A00
            int r3 = r4.A08
            X.AnonymousClass000.A1M(r5, r3, r0)
            r1 = 1
            int r0 = r4.A06
            X.AnonymousClass000.A1M(r5, r0, r1)
            r2 = 2
            float r1 = (float) r3
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r5[r2] = r0
            r1 = 3
            int r0 = r4.A02
            X.AnonymousClass000.A1M(r5, r0, r1)
            r1 = 4
            int r0 = r4.A03
            X.AnonymousClass000.A1M(r5, r0, r1)
            r0 = 5
            java.lang.Object r1 = r6.first
            r5[r0] = r1
            r0 = 6
            java.lang.Object r3 = r6.second
            r5[r0] = r3
            r2 = 7
            int r0 = X.AnonymousClass000.A0D(r1)
            float r1 = (float) r0
            int r0 = X.AnonymousClass000.A0D(r3)
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r5[r2] = r0
            java.lang.String r0 = "ConversationRowSingleImagePreviewCalculator/getPreviewDimension bitmap=%d,%d(%f) face=%d,%d preview=%d,%d(%f)"
            java.lang.String.format(r7, r0, r5)
            return r6
        L_0x00c9:
            float r0 = java.lang.Math.max(r5, r1)
            goto L_0x005d
        L_0x00ce:
            X.4RB r6 = r4.A00
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BL.A07(int, int):android.util.Pair");
    }

    public final Pair A08(int i2, int i3, int i4) {
        C16750ta r1 = this.A00;
        AnonymousClass00B.A07(r1, "setMediaData() must be called prior.");
        float f2 = (float) r1.A08;
        float f3 = (float) r1.A06;
        float A012 = A01(i2, (float) i4);
        return A02(A012, A01(i3, (f3 * A012) / f2));
    }

    public void A09(int i2, int i3) {
        C16750ta r0 = new C16750ta();
        r0.A08 = i2;
        r0.A06 = i3;
        this.A00 = r0;
    }

    public boolean A0A() {
        C16750ta r3 = this.A00;
        AnonymousClass00B.A0G(AnonymousClass000.A1V(r3));
        return r3.A06 > r3.A08;
    }
}
