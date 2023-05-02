package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.view.MotionEventCompat;
import java.util.List;

/* renamed from: X.0dU  reason: invalid class name and case insensitive filesystem */
public class C08350dU implements C12650kk, C13530mX, C13540mY {
    public AnonymousClass0SI A00;
    public AnonymousClass0HF A01;
    public final int A02;
    public final Paint A03;
    public final Path A04;
    public final RectF A05;
    public final AnonymousClass03G A06 = new AnonymousClass03G();
    public final AnonymousClass03G A07 = new AnonymousClass03G();
    public final AnonymousClass0Ak A08;
    public final AnonymousClass0SI A09;
    public final AnonymousClass0SI A0A;
    public final AnonymousClass0SI A0B;
    public final AnonymousClass0SI A0C;
    public final AnonymousClass0JV A0D;
    public final C08360dV A0E;
    public final String A0F;
    public final List A0G;
    public final boolean A0H;

    public C08350dU(AnonymousClass0Ak r4, C08440de r5, C08360dV r6) {
        Path A0I = AnonymousClass000.A0I();
        this.A04 = A0I;
        this.A03 = new AnonymousClass0AR(1);
        this.A05 = AnonymousClass000.A0K();
        this.A0G = AnonymousClass000.A0u();
        this.A0E = r6;
        this.A0F = r5.A06;
        this.A0H = r5.A07;
        this.A08 = r4;
        this.A0D = r5.A05;
        A0I.setFillType(r5.A00);
        this.A02 = (int) (AnonymousClass0Rs.A00(r4.A04) / 32.0f);
        AnonymousClass0HH r0 = new AnonymousClass0HH(r5.A01.A00);
        this.A09 = r0;
        AnonymousClass0SI.A04(r0, this);
        r6.A09(r0);
        AnonymousClass0HL r02 = new AnonymousClass0HL(r5.A02.A00);
        this.A0B = r02;
        AnonymousClass0SI.A04(r02, this);
        r6.A09(r02);
        AnonymousClass0HN r03 = new AnonymousClass0HN(r5.A04.A00);
        this.A0C = r03;
        AnonymousClass0SI.A04(r03, this);
        r6.A09(r03);
        AnonymousClass0HN r04 = new AnonymousClass0HN(r5.A03.A00);
        this.A0A = r04;
        AnonymousClass0SI.A04(r04, this);
        r6.A09(r04);
    }

    public final int A00() {
        float f2 = this.A0C.A02;
        float f3 = (float) this.A02;
        int round = Math.round(f2 * f3);
        int round2 = Math.round(this.A0A.A02 * f3);
        int round3 = Math.round(this.A09.A02 * f3);
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
        AnonymousClass0HF r0 = this.A01;
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

    public void A4l(AnonymousClass0UV r4, Object obj) {
        C08360dV r1;
        AnonymousClass0SI r0;
        if (obj == C13480m6.A0S) {
            this.A0B.A0D(r4);
            return;
        }
        if (obj == C13480m6.A00) {
            AnonymousClass0SI r12 = this.A00;
            if (r12 != null) {
                this.A0E.A0O.remove(r12);
            }
            if (r4 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0HF r02 = new AnonymousClass0HF(r4, (Object) null);
            this.A00 = r02;
            AnonymousClass0SI.A04(r02, this);
            r1 = this.A0E;
            r0 = this.A00;
        } else if (obj == C13480m6.A0V) {
            AnonymousClass0HF r13 = this.A01;
            if (r13 != null) {
                this.A0E.A0O.remove(r13);
            }
            if (r4 == null) {
                this.A01 = null;
                return;
            }
            this.A06.A05();
            this.A07.A05();
            AnonymousClass0HF r03 = new AnonymousClass0HF(r4, (Object) null);
            this.A01 = r03;
            AnonymousClass0SI.A04(r03, this);
            r1 = this.A0E;
            r0 = this.A01;
        } else {
            return;
        }
        r1.A09(r0);
    }

    public void A8F(Canvas canvas, Matrix matrix, int i2) {
        Matrix matrix2;
        Shader shader;
        if (!this.A0H) {
            Path path = this.A04;
            path.reset();
            int i3 = 0;
            while (true) {
                List list = this.A0G;
                matrix2 = matrix;
                if (i3 >= list.size()) {
                    break;
                }
                AnonymousClass000.A12(matrix2, path, list, i3);
                i3++;
            }
            path.computeBounds(this.A05, false);
            AnonymousClass0JV r3 = this.A0D;
            AnonymousClass0JV r1 = AnonymousClass0JV.LINEAR;
            int A002 = A00();
            if (r3 == r1) {
                AnonymousClass03G r5 = this.A06;
                long j2 = (long) A002;
                shader = (Shader) r5.A04(j2, (Object) null);
                if (shader == null) {
                    PointF A032 = AnonymousClass0SI.A03(this.A0C);
                    PointF A033 = AnonymousClass0SI.A03(this.A0A);
                    AnonymousClass0O8 r4 = (AnonymousClass0O8) this.A09.A08();
                    int[] A012 = A01(r4.A01);
                    float[] fArr = r4.A00;
                    float f2 = A032.x;
                    float f3 = A032.y;
                    float f4 = A033.x;
                    float f5 = A033.y;
                    shader = new LinearGradient(f2, f3, f4, f5, A012, fArr, Shader.TileMode.CLAMP);
                    r5.A09(j2, shader);
                }
            } else {
                AnonymousClass03G r7 = this.A07;
                long j3 = (long) A002;
                shader = (Shader) r7.A04(j3, (Object) null);
                if (shader == null) {
                    PointF A034 = AnonymousClass0SI.A03(this.A0C);
                    PointF A035 = AnonymousClass0SI.A03(this.A0A);
                    AnonymousClass0O8 r12 = (AnonymousClass0O8) this.A09.A08();
                    int[] A013 = A01(r12.A01);
                    float[] fArr2 = r12.A00;
                    float f6 = A034.x;
                    float f7 = A034.y;
                    float hypot = (float) Math.hypot((double) (A035.x - f6), (double) (A035.y - f7));
                    if (hypot <= 0.0f) {
                        hypot = 0.001f;
                    }
                    shader = new RadialGradient(f6, f7, hypot, A013, fArr2, Shader.TileMode.CLAMP);
                    r7.A09(j3, shader);
                }
            }
            shader.setLocalMatrix(matrix2);
            Paint paint = this.A03;
            paint.setShader(shader);
            AnonymousClass000.A13(paint, this.A00);
            paint.setAlpha(Math.max(0, Math.min(MotionEventCompat.ACTION_MASK, (int) ((((((float) i2) / 255.0f) * ((float) AnonymousClass000.A0D(this.A0B.A08()))) / 100.0f) * 255.0f))));
            canvas.drawPath(path, paint);
            AnonymousClass0NI.A01();
        }
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        Path path = this.A04;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.A0G;
            if (i2 < list.size()) {
                AnonymousClass000.A12(matrix, path, list, i2);
                i2++;
            } else {
                path.computeBounds(rectF, false);
                AnonymousClass000.A14(rectF);
                return;
            }
        }
    }

    public void AZV() {
        this.A08.invalidateSelf();
    }

    public void AcW(AnonymousClass0WM r1, AnonymousClass0WM r2, List list, int i2) {
        C06560Ws.A01(this, r1, r2, list, i2);
    }

    public void Adk(List list, List list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Object obj = list2.get(i2);
            if (obj instanceof C13520mW) {
                this.A0G.add(obj);
            }
        }
    }

    public String getName() {
        return this.A0F;
    }
}
