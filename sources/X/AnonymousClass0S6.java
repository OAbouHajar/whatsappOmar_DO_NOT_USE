package X;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: X.0S6  reason: invalid class name */
public class AnonymousClass0S6 {
    public AnonymousClass0SI A00;
    public AnonymousClass0SI A01;
    public AnonymousClass0SI A02;
    public AnonymousClass0SI A03;
    public AnonymousClass0SI A04;
    public AnonymousClass0SI A05;
    public AnonymousClass0SI A06;
    public AnonymousClass0HM A07;
    public AnonymousClass0HM A08;
    public final Matrix A09 = AnonymousClass000.A0H();
    public final Matrix A0A;
    public final Matrix A0B;
    public final Matrix A0C;
    public final float[] A0D;

    public AnonymousClass0S6(C08450df r4) {
        C08410db r0 = r4.A06;
        AnonymousClass0HM r2 = null;
        this.A00 = r0 == null ? null : r0.A7E();
        C13230lg r02 = r4.A08;
        this.A03 = r02 == null ? null : r02.A7E();
        AnonymousClass0HV r03 = r4.A07;
        this.A05 = r03 == null ? null : new AnonymousClass0HI(r03.A00);
        AnonymousClass0HT r04 = r4.A01;
        this.A04 = r04 == null ? null : AnonymousClass0HC.A00(r04);
        AnonymousClass0HT r05 = r4.A02;
        AnonymousClass0HM A002 = r05 == null ? null : AnonymousClass0HC.A00(r05);
        this.A07 = A002;
        if (A002 != null) {
            this.A0A = AnonymousClass000.A0H();
            this.A0B = AnonymousClass000.A0H();
            this.A0C = AnonymousClass000.A0H();
            this.A0D = new float[9];
        }
        AnonymousClass0HT r06 = r4.A03;
        this.A08 = r06 != null ? AnonymousClass0HC.A00(r06) : r2;
        AnonymousClass0HU r07 = r4.A05;
        if (r07 != null) {
            this.A02 = new AnonymousClass0HL(r07.A00);
        }
        AnonymousClass0HT r08 = r4.A04;
        if (r08 != null) {
            this.A06 = AnonymousClass0HC.A00(r08);
        }
        AnonymousClass0HT r09 = r4.A00;
        if (r09 != null) {
            this.A01 = AnonymousClass0HC.A00(r09);
        }
    }

    public Matrix A00() {
        float cos;
        float sin;
        float[] fArr;
        Matrix matrix = this.A09;
        matrix.reset();
        AnonymousClass0SI r0 = this.A03;
        if (r0 != null) {
            PointF A032 = AnonymousClass0SI.A03(r0);
            float f2 = A032.x;
            if (!(f2 == 0.0f && A032.y == 0.0f)) {
                matrix.preTranslate(f2, A032.y);
            }
        }
        AnonymousClass0SI r1 = this.A04;
        if (r1 != null) {
            float A022 = r1 instanceof AnonymousClass0HF ? AnonymousClass0SI.A02(r1) : ((AnonymousClass0HM) r1).A0E();
            if (A022 != 0.0f) {
                matrix.preRotate(A022);
            }
        }
        AnonymousClass0HM r2 = this.A07;
        if (r2 != null) {
            AnonymousClass0HM r5 = this.A08;
            if (r5 == null) {
                cos = 0.0f;
                sin = 1.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((double) ((-r5.A0E()) + 90.0f)));
                sin = (float) Math.sin(Math.toRadians((double) ((-r5.A0E()) + 90.0f)));
            }
            float tan = (float) Math.tan(Math.toRadians((double) r2.A0E()));
            int i2 = 0;
            do {
                fArr = this.A0D;
                fArr[i2] = 0.0f;
                i2++;
            } while (i2 < 9);
            fArr[0] = cos;
            fArr[1] = sin;
            float f3 = -sin;
            fArr[3] = f3;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.A0A;
            matrix2.setValues(fArr);
            int i3 = 0;
            do {
                fArr[i3] = 0.0f;
                i3++;
            } while (i3 < 9);
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.A0B;
            matrix3.setValues(fArr);
            int i4 = 0;
            do {
                fArr[i4] = 0.0f;
                i4++;
            } while (i4 < 9);
            fArr[0] = cos;
            fArr[1] = f3;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.A0C;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AnonymousClass0SI r02 = this.A05;
        if (r02 != null) {
            AnonymousClass0PT r22 = (AnonymousClass0PT) r02.A08();
            float f4 = r22.A00;
            if (!(f4 == 1.0f && r22.A01 == 1.0f)) {
                matrix.preScale(f4, r22.A01);
            }
        }
        AnonymousClass0SI r03 = this.A00;
        if (r03 != null) {
            PointF A033 = AnonymousClass0SI.A03(r03);
            float f5 = A033.x;
            if (!(f5 == 0.0f && A033.y == 0.0f)) {
                matrix.preTranslate(-f5, -A033.y);
            }
        }
        return matrix;
    }

    public Matrix A01(float f2) {
        float f3;
        AnonymousClass0SI r0 = this.A03;
        PointF pointF = null;
        PointF A032 = r0 == null ? null : AnonymousClass0SI.A03(r0);
        AnonymousClass0SI r02 = this.A05;
        AnonymousClass0PT r03 = r02 == null ? null : (AnonymousClass0PT) r02.A08();
        Matrix matrix = this.A09;
        matrix.reset();
        if (A032 != null) {
            matrix.preTranslate(A032.x * f2, A032.y * f2);
        }
        if (r03 != null) {
            double d2 = (double) f2;
            matrix.preScale((float) Math.pow((double) r03.A00, d2), (float) Math.pow((double) r03.A01, d2));
        }
        AnonymousClass0SI r04 = this.A04;
        if (r04 != null) {
            float A022 = AnonymousClass0SI.A02(r04);
            AnonymousClass0SI r05 = this.A00;
            if (r05 != null) {
                pointF = AnonymousClass0SI.A03(r05);
            }
            float f4 = A022 * f2;
            float f5 = 0.0f;
            if (pointF == null) {
                f3 = 0.0f;
            } else {
                f3 = pointF.x;
                f5 = pointF.y;
            }
            matrix.preRotate(f4, f3, f5);
        }
        return matrix;
    }

    public void A02(C12650kk r2) {
        AnonymousClass0SI r0 = this.A02;
        if (r0 != null) {
            AnonymousClass0SI.A04(r0, r2);
        }
        AnonymousClass0SI r02 = this.A06;
        if (r02 != null) {
            AnonymousClass0SI.A04(r02, r2);
        }
        AnonymousClass0SI r03 = this.A01;
        if (r03 != null) {
            AnonymousClass0SI.A04(r03, r2);
        }
        AnonymousClass0SI r04 = this.A00;
        if (r04 != null) {
            AnonymousClass0SI.A04(r04, r2);
        }
        AnonymousClass0SI r05 = this.A03;
        if (r05 != null) {
            AnonymousClass0SI.A04(r05, r2);
        }
        AnonymousClass0SI r06 = this.A05;
        if (r06 != null) {
            AnonymousClass0SI.A04(r06, r2);
        }
        AnonymousClass0SI r07 = this.A04;
        if (r07 != null) {
            AnonymousClass0SI.A04(r07, r2);
        }
        AnonymousClass0HM r08 = this.A07;
        if (r08 != null) {
            AnonymousClass0SI.A04(r08, r2);
        }
        AnonymousClass0HM r09 = this.A08;
        if (r09 != null) {
            AnonymousClass0SI.A04(r09, r2);
        }
    }

    public void A03(C08360dV r2) {
        r2.A09(this.A02);
        r2.A09(this.A06);
        r2.A09(this.A01);
        r2.A09(this.A00);
        r2.A09(this.A03);
        r2.A09(this.A05);
        r2.A09(this.A04);
        r2.A09(this.A07);
        r2.A09(this.A08);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.AnonymousClass0UV r4, java.lang.Object r5) {
        /*
            r3 = this;
            android.graphics.PointF r0 = X.C13480m6.A04
            if (r5 != r0) goto L_0x0016
            X.0SI r1 = r3.A00
            if (r1 != 0) goto L_0x009e
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.0HF r0 = new X.0HF
            r0.<init>(r4, r1)
            r3.A00 = r0
        L_0x0014:
            r0 = 1
            return r0
        L_0x0016:
            android.graphics.PointF r0 = X.C13480m6.A05
            if (r5 != r0) goto L_0x002b
            X.0SI r1 = r3.A03
            if (r1 != 0) goto L_0x009e
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.0HF r0 = new X.0HF
            r0.<init>(r4, r1)
            r3.A03 = r0
            goto L_0x0014
        L_0x002b:
            java.lang.Float r0 = X.C13480m6.A0L
            if (r5 != r0) goto L_0x0045
            X.0SI r2 = r3.A03
            boolean r0 = r2 instanceof X.AnonymousClass0HE
            if (r0 == 0) goto L_0x0045
            X.0HE r2 = (X.AnonymousClass0HE) r2
            X.0UV r1 = r2.A00
            if (r1 == 0) goto L_0x003e
            r0 = 0
            r1.A00 = r0
        L_0x003e:
            r2.A00 = r4
        L_0x0040:
            if (r4 == 0) goto L_0x0014
            r4.A00 = r2
            goto L_0x0014
        L_0x0045:
            java.lang.Float r0 = X.C13480m6.A0M
            if (r5 != r0) goto L_0x005b
            X.0SI r2 = r3.A03
            boolean r0 = r2 instanceof X.AnonymousClass0HE
            if (r0 == 0) goto L_0x005b
            X.0HE r2 = (X.AnonymousClass0HE) r2
            X.0UV r1 = r2.A01
            if (r1 == 0) goto L_0x0058
            r0 = 0
            r1.A00 = r0
        L_0x0058:
            r2.A01 = r4
            goto L_0x0040
        L_0x005b:
            X.0PT r0 = X.C13480m6.A06
            if (r5 != r0) goto L_0x0072
            X.0SI r1 = r3.A05
            if (r1 != 0) goto L_0x009e
            r0 = 1065353216(0x3f800000, float:1.0)
            X.0PT r1 = new X.0PT
            r1.<init>(r0, r0)
            X.0HF r0 = new X.0HF
            r0.<init>(r4, r1)
            r3.A05 = r0
            goto L_0x0014
        L_0x0072:
            java.lang.Float r1 = X.C13480m6.A0N
            r0 = 0
            if (r5 != r1) goto L_0x0087
            X.0SI r1 = r3.A04
            if (r1 != 0) goto L_0x009e
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            X.0HF r0 = new X.0HF
            r0.<init>(r4, r1)
            r3.A04 = r0
            goto L_0x0014
        L_0x0087:
            java.lang.Integer r1 = X.C13480m6.A0U
            r0 = 100
            if (r5 != r1) goto L_0x00a3
            X.0SI r1 = r3.A02
            if (r1 != 0) goto L_0x009e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.0HF r0 = new X.0HF
            r0.<init>(r4, r1)
            r3.A02 = r0
            goto L_0x0014
        L_0x009e:
            r1.A0D(r4)
            goto L_0x0014
        L_0x00a3:
            java.lang.Float r0 = X.C13480m6.A0Q
            if (r5 != r0) goto L_0x00b0
            X.0SI r0 = r3.A06
            if (r0 == 0) goto L_0x00b0
        L_0x00ab:
            r0.A0D(r4)
            goto L_0x0014
        L_0x00b0:
            java.lang.Float r0 = X.C13480m6.A0K
            if (r5 != r0) goto L_0x00b9
            X.0SI r0 = r3.A01
            if (r0 == 0) goto L_0x00b9
            goto L_0x00ab
        L_0x00b9:
            java.lang.Float r0 = X.C13480m6.A0O
            if (r5 != r0) goto L_0x00c2
            X.0HM r0 = r3.A07
            if (r0 == 0) goto L_0x00c2
            goto L_0x00ab
        L_0x00c2:
            java.lang.Float r0 = X.C13480m6.A0P
            if (r5 != r0) goto L_0x00cb
            X.0HM r0 = r3.A08
            if (r0 == 0) goto L_0x00cb
            goto L_0x00ab
        L_0x00cb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0S6.A04(X.0UV, java.lang.Object):boolean");
    }
}
