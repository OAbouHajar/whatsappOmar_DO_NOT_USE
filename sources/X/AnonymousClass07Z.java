package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.view.MotionEventCompat;

/* renamed from: X.07Z  reason: invalid class name */
public class AnonymousClass07Z {
    public static final Matrix A0G = new Matrix();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public Paint A06;
    public Paint A07;
    public PathMeasure A08;
    public Boolean A09;
    public String A0A;
    public final Matrix A0B;
    public final Path A0C;
    public final Path A0D;
    public final AnonymousClass00N A0E;
    public final C014607a A0F;

    public AnonymousClass07Z() {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A05 = MotionEventCompat.ACTION_MASK;
        this.A0A = null;
        this.A09 = null;
        this.A0E = new AnonymousClass00N();
        this.A0F = new C014607a();
        this.A0C = new Path();
        this.A0D = new Path();
    }

    public AnonymousClass07Z(AnonymousClass07Z r4) {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A05 = MotionEventCompat.ACTION_MASK;
        this.A0A = null;
        this.A09 = null;
        AnonymousClass00N r2 = new AnonymousClass00N();
        this.A0E = r2;
        this.A0F = new C014607a(r2, r4.A0F);
        this.A0C = new Path(r4.A0C);
        this.A0D = new Path(r4.A0D);
        this.A01 = r4.A01;
        this.A00 = r4.A00;
        this.A03 = r4.A03;
        this.A02 = r4.A02;
        this.A04 = r4.A04;
        this.A05 = r4.A05;
        this.A0A = r4.A0A;
        String str = r4.A0A;
        if (str != null) {
            r2.put(str, this);
        }
        this.A09 = r4.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0114, code lost:
        if (r1.A00 != 0) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.graphics.Canvas r23, android.graphics.Matrix r24, X.C014607a r25, int r26, int r27) {
        /*
            r22 = this;
            r9 = 0
            r14 = r25
            android.graphics.Matrix r8 = r14.A0B
            r0 = r24
            r8.set(r0)
            android.graphics.Matrix r0 = r14.A0A
            r8.preConcat(r0)
            r15 = r23
            r15.save()
            r7 = 0
        L_0x0015:
            java.util.ArrayList r1 = r14.A0C
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x01e9
            java.lang.Object r6 = r1.get(r7)
            X.07b r6 = (X.C014707b) r6
            boolean r0 = r6 instanceof X.C014607a
            r5 = r22
            r2 = r26
            r1 = r27
            if (r0 == 0) goto L_0x0041
            X.07a r6 = (X.C014607a) r6
            r20 = r2
            r21 = r1
            r18 = r8
            r19 = r6
            r16 = r5
            r17 = r15
            r16.A00(r17, r18, r19, r20, r21)
        L_0x003e:
            int r7 = r7 + 1
            goto L_0x0015
        L_0x0041:
            boolean r0 = r6 instanceof X.AnonymousClass07f
            if (r0 == 0) goto L_0x003e
            X.07f r6 = (X.AnonymousClass07f) r6
            float r2 = (float) r2
            float r0 = r5.A03
            float r2 = r2 / r0
            float r1 = (float) r1
            float r0 = r5.A02
            float r1 = r1 / r0
            float r18 = java.lang.Math.min(r2, r1)
            android.graphics.Matrix r4 = r5.A0B
            r4.set(r8)
            r4.postScale(r2, r1)
            r0 = 4
            float[] r12 = new float[r0]
            r12 = {0, 1065353216, 1065353216, 0} // fill-array
            r8.mapVectors(r12)
            r0 = 0
            r3 = r12[r0]
            double r10 = (double) r3
            r0 = 1
            r2 = r12[r0]
            double r0 = (double) r2
            double r0 = java.lang.Math.hypot(r10, r0)
            float r10 = (float) r0
            r16 = r10
            r0 = 2
            r13 = r12[r0]
            double r10 = (double) r13
            r0 = 3
            r12 = r12[r0]
            double r0 = (double) r12
            double r0 = java.lang.Math.hypot(r10, r0)
            float r10 = (float) r0
            float r3 = r3 * r12
            float r2 = r2 * r13
            float r3 = r3 - r2
            r0 = r16
            float r1 = java.lang.Math.max(r0, r10)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            float r17 = java.lang.Math.abs(r3)
            float r17 = r17 / r1
            r12 = 0
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x003e
            android.graphics.Path r11 = r5.A0C
            r11.reset()
            X.07h[] r0 = r6.A03
            if (r0 == 0) goto L_0x00a5
            X.C015207h.A01(r11, r0)
        L_0x00a5:
            android.graphics.Path r10 = r5.A0D
            r10.reset()
            boolean r0 = r6.A02()
            if (r0 == 0) goto L_0x00c4
            int r0 = r6.A01
            if (r0 != 0) goto L_0x00c1
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x00b6:
            r10.setFillType(r0)
            r10.addPath(r11, r4)
            r15.clipPath(r10)
            goto L_0x003e
        L_0x00c1:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x00b6
        L_0x00c4:
            X.07e r6 = (X.C015007e) r6
            float r13 = r6.A06
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00d5
            float r0 = r6.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0108
        L_0x00d5:
            float r0 = r6.A05
            float r13 = r13 + r0
            float r13 = r13 % r1
            float r2 = r6.A04
            float r2 = r2 + r0
            float r2 = r2 % r1
            android.graphics.PathMeasure r1 = r5.A08
            if (r1 != 0) goto L_0x00e8
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            r1.<init>()
            r5.A08 = r1
        L_0x00e8:
            r0 = 0
            r1.setPath(r11, r0)
            android.graphics.PathMeasure r0 = r5.A08
            float r1 = r0.getLength()
            float r13 = r13 * r1
            float r2 = r2 * r1
            r11.reset()
            int r16 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            android.graphics.PathMeasure r0 = r5.A08
            if (r16 <= 0) goto L_0x01e4
            r0.getSegment(r13, r1, r11, r3)
            android.graphics.PathMeasure r0 = r5.A08
            r0.getSegment(r12, r2, r11, r3)
        L_0x0105:
            r11.rLineTo(r12, r12)
        L_0x0108:
            r10.addPath(r11, r4)
            X.07i r1 = r6.A09
            android.graphics.Shader r0 = r1.A02
            if (r0 != 0) goto L_0x0116
            int r0 = r1.A00
            r2 = 0
            if (r0 == 0) goto L_0x0117
        L_0x0116:
            r2 = 1
        L_0x0117:
            r16 = 1132396544(0x437f0000, float:255.0)
            r11 = 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x0153
            android.graphics.Paint r0 = r5.A06
            if (r0 != 0) goto L_0x012d
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r3)
            r5.A06 = r2
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
        L_0x012d:
            android.graphics.Paint r2 = r5.A06
            android.graphics.Shader r0 = r1.A02
            if (r0 == 0) goto L_0x01c7
            r0.setLocalMatrix(r4)
            r2.setShader(r0)
            float r0 = r6.A00
            float r0 = r0 * r16
            int r0 = java.lang.Math.round(r0)
            r2.setAlpha(r0)
        L_0x0144:
            r2.setColorFilter(r9)
            int r0 = r6.A01
            if (r0 != 0) goto L_0x01c4
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x014d:
            r10.setFillType(r0)
            r15.drawPath(r10, r2)
        L_0x0153:
            X.07i r1 = r6.A0A
            android.graphics.Shader r0 = r1.A02
            if (r0 != 0) goto L_0x015d
            int r0 = r1.A00
            if (r0 == 0) goto L_0x003e
        L_0x015d:
            android.graphics.Paint r0 = r5.A07
            if (r0 != 0) goto L_0x016d
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r3)
            r5.A07 = r2
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
        L_0x016d:
            android.graphics.Paint r3 = r5.A07
            android.graphics.Paint$Join r0 = r6.A08
            if (r0 == 0) goto L_0x0176
            r3.setStrokeJoin(r0)
        L_0x0176:
            android.graphics.Paint$Cap r0 = r6.A07
            if (r0 == 0) goto L_0x017d
            r3.setStrokeCap(r0)
        L_0x017d:
            float r0 = r6.A02
            r3.setStrokeMiter(r0)
            android.graphics.Shader r0 = r1.A02
            if (r0 == 0) goto L_0x01a8
            r0.setLocalMatrix(r4)
            r3.setShader(r0)
            float r0 = r6.A01
            float r0 = r0 * r16
            int r0 = java.lang.Math.round(r0)
            r3.setAlpha(r0)
        L_0x0197:
            r3.setColorFilter(r9)
            float r18 = r18 * r17
            float r0 = r6.A03
            float r0 = r0 * r18
            r3.setStrokeWidth(r0)
            r15.drawPath(r10, r3)
            goto L_0x003e
        L_0x01a8:
            r3.setShader(r9)
            r3.setAlpha(r11)
            int r4 = r1.A00
            float r2 = r6.A01
            int r1 = android.graphics.Color.alpha(r4)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            float r0 = (float) r1
            float r0 = r0 * r2
            int r0 = (int) r0
            int r0 = r0 << 24
            r4 = r4 | r0
            r3.setColor(r4)
            goto L_0x0197
        L_0x01c4:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x014d
        L_0x01c7:
            r2.setShader(r9)
            r2.setAlpha(r11)
            int r1 = r1.A00
            float r12 = r6.A00
            int r13 = android.graphics.Color.alpha(r1)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            float r0 = (float) r13
            float r0 = r0 * r12
            int r0 = (int) r0
            int r0 = r0 << 24
            r1 = r1 | r0
            r2.setColor(r1)
            goto L_0x0144
        L_0x01e4:
            r0.getSegment(r13, r2, r11, r3)
            goto L_0x0105
        L_0x01e9:
            r15.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07Z.A00(android.graphics.Canvas, android.graphics.Matrix, X.07a, int, int):void");
    }

    public float getAlpha() {
        return ((float) this.A05) / 255.0f;
    }

    public int getRootAlpha() {
        return this.A05;
    }

    public void setAlpha(float f2) {
        this.A05 = (int) (f2 * 255.0f);
    }

    public void setRootAlpha(int i2) {
        this.A05 = i2;
    }
}
