package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.0HB  reason: invalid class name */
public class AnonymousClass0HB extends C08330dS {
    public AnonymousClass0HF A00;
    public final int A01;
    public final RectF A02;
    public final AnonymousClass03G A03;
    public final AnonymousClass03G A04;
    public final AnonymousClass0SI A05;
    public final AnonymousClass0SI A06;
    public final AnonymousClass0SI A07;
    public final AnonymousClass0JV A08;
    public final String A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0HB(X.AnonymousClass0Ak r13, X.C08480di r14, X.C08360dV r15) {
        /*
            r12 = this;
            X.0JM r0 = r14.A08
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0084;
                case 1: goto L_0x0081;
                default: goto L_0x0009;
            }
        L_0x0009:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000b:
            X.0KT r0 = r14.A09
            android.graphics.Paint$Join r4 = r0.A00()
            float r11 = r14.A00
            X.0HU r8 = r14.A04
            X.0HT r6 = r14.A02
            java.util.List r10 = r14.A0B
            X.0HT r7 = r14.A01
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.03G r0 = new X.03G
            r0.<init>()
            r12.A03 = r0
            X.03G r0 = new X.03G
            r0.<init>()
            r12.A04 = r0
            android.graphics.RectF r0 = X.AnonymousClass000.A0K()
            r12.A02 = r0
            java.lang.String r0 = r14.A0A
            r12.A09 = r0
            X.0JV r0 = r14.A07
            r12.A08 = r0
            boolean r0 = r14.A0C
            r12.A0A = r0
            X.0Rs r0 = r13.A04
            float r1 = X.AnonymousClass0Rs.A00(r0)
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            r12.A01 = r0
            X.0HP r0 = r14.A03
            java.util.List r1 = r0.A00
            X.0HH r0 = new X.0HH
            r0.<init>(r1)
            r12.A05 = r0
            X.AnonymousClass0SI.A04(r0, r12)
            r15.A09(r0)
            X.0HQ r0 = r14.A06
            java.util.List r1 = r0.A00
            X.0HN r0 = new X.0HN
            r0.<init>(r1)
            r12.A07 = r0
            X.AnonymousClass0SI.A04(r0, r12)
            r15.A09(r0)
            X.0HQ r0 = r14.A05
            java.util.List r1 = r0.A00
            X.0HN r0 = new X.0HN
            r0.<init>(r1)
            r12.A06 = r0
            X.AnonymousClass0SI.A04(r0, r12)
            r15.A09(r0)
            return
        L_0x0081:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000b
        L_0x0084:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HB.<init>(X.0Ak, X.0di, X.0dV):void");
    }

    public final int A00() {
        float f2 = this.A07.A02;
        float f3 = (float) this.A01;
        int round = Math.round(f2 * f3);
        int round2 = Math.round(this.A06.A02 * f3);
        int round3 = Math.round(this.A05.A02 * f3);
        int i2 = 17;
        if (round != 0) {
            i2 = 527 * round;
        }
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    public final int[] A01(int[] iArr) {
        AnonymousClass0HF r0 = this.A00;
        if (r0 != null) {
            Integer[] numArr = (Integer[]) r0.A08();
            int length = iArr.length;
            int length2 = numArr.length;
            int i2 = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i2 < length2) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                while (i2 < length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    public void A4l(AnonymousClass0UV r3, Object obj) {
        super.A4l(r3, obj);
        if (obj == C13480m6.A0V) {
            AnonymousClass0HF r1 = this.A00;
            if (r1 != null) {
                this.A0A.A0O.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0HF r0 = new AnonymousClass0HF(r3, (Object) null);
            this.A00 = r0;
            AnonymousClass0SI.A04(r0, this);
            this.A0A.A09(this.A00);
        }
    }

    public void A8F(Canvas canvas, Matrix matrix, int i2) {
        Shader shader;
        if (!this.A0A) {
            Matrix matrix2 = matrix;
            AAB(matrix2, this.A02, false);
            AnonymousClass0JV r3 = this.A08;
            AnonymousClass0JV r2 = AnonymousClass0JV.LINEAR;
            int A002 = A00();
            if (r3 == r2) {
                AnonymousClass03G r5 = this.A03;
                long j2 = (long) A002;
                shader = (Shader) r5.A04(j2, (Object) null);
                if (shader == null) {
                    PointF A032 = AnonymousClass0SI.A03(this.A07);
                    PointF A033 = AnonymousClass0SI.A03(this.A06);
                    AnonymousClass0O8 r4 = (AnonymousClass0O8) this.A05.A08();
                    shader = new LinearGradient(A032.x, A032.y, A033.x, A033.y, A01(r4.A01), r4.A00, Shader.TileMode.CLAMP);
                    r5.A09(j2, shader);
                }
            } else {
                AnonymousClass03G r7 = this.A04;
                long j3 = (long) A002;
                shader = (Shader) r7.A04(j3, (Object) null);
                if (shader == null) {
                    PointF A034 = AnonymousClass0SI.A03(this.A07);
                    PointF A035 = AnonymousClass0SI.A03(this.A06);
                    AnonymousClass0O8 r22 = (AnonymousClass0O8) this.A05.A08();
                    int[] A012 = A01(r22.A01);
                    float[] fArr = r22.A00;
                    float f2 = A034.x;
                    float f3 = A034.y;
                    shader = new RadialGradient(f2, f3, (float) Math.hypot((double) (A035.x - f2), (double) (A035.y - f3)), A012, fArr, Shader.TileMode.CLAMP);
                    r7.A09(j3, shader);
                }
            }
            shader.setLocalMatrix(matrix2);
            this.A01.setShader(shader);
            super.A8F(canvas, matrix2, i2);
        }
    }

    public String getName() {
        return this.A09;
    }
}
