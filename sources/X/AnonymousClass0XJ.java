package X;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.0XJ  reason: invalid class name */
public class AnonymousClass0XJ {
    public static HashSet A06;
    public Canvas A00;
    public AnonymousClass0Rz A01;
    public AnonymousClass0UF A02;
    public Stack A03;
    public Stack A04;
    public Stack A05;

    public AnonymousClass0XJ(Canvas canvas) {
        this.A00 = canvas;
    }

    public static float A00(C09150f1 r0, AnonymousClass0XJ r1) {
        if (r0 != null) {
            return r0.A03(r1);
        }
        return 0.0f;
    }

    public static float A01(C09150f1 r0, AnonymousClass0XJ r1) {
        if (r0 != null) {
            return r0.A02(r1);
        }
        return 0.0f;
    }

    public static float A02(AnonymousClass0IG r3, AnonymousClass0XJ r4) {
        List list = r3.A01;
        if (list == null || list.size() == 0) {
            return 0.0f;
        }
        return ((C09150f1) r3.A01.get(0)).A03(r4);
    }

    public static float A03(AnonymousClass0XJ r1, List list) {
        return ((C09150f1) list.get(0)).A02(r1);
    }

    public static int A04(int i2, float f2) {
        int i3 = MotionEventCompat.ACTION_MASK;
        int round = Math.round(((float) ((i2 >> 24) & MotionEventCompat.ACTION_MASK)) * f2);
        if (round < 0) {
            i3 = 0;
        } else if (round <= 255) {
            i3 = round;
        }
        return (i2 & ViewCompat.MEASURED_SIZE_MASK) | (i3 << 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        r3 = r3 - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r4 = r4 - r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Matrix A05(X.C06170Uo r12, X.AnonymousClass0UX r13, X.AnonymousClass0UX r14) {
        /*
            android.graphics.Matrix r5 = X.AnonymousClass000.A0H()
            X.0KG r11 = r12.A00
            if (r11 == 0) goto L_0x002f
            float r9 = r13.A03
            float r8 = r14.A03
            float r10 = r9 / r8
            float r7 = r13.A00
            float r6 = r14.A00
            float r2 = r7 / r6
            float r0 = r14.A01
            float r4 = -r0
            float r0 = r14.A02
            float r3 = -r0
            X.0Uo r0 = X.C06170Uo.A03
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0030
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r10, r2)
        L_0x002c:
            r5.preTranslate(r4, r3)
        L_0x002f:
            return r5
        L_0x0030:
            X.0Jd r1 = r12.A01
            X.0Jd r0 = X.C03600Jd.slice
            if (r1 != r0) goto L_0x005f
            float r2 = java.lang.Math.max(r10, r2)
        L_0x003a:
            float r9 = r9 / r2
            float r7 = r7 / r2
            int r1 = r11.ordinal()
            r0 = 1073741824(0x40000000, float:2.0)
            switch(r1) {
                case 2: goto L_0x005b;
                case 3: goto L_0x0059;
                case 4: goto L_0x0045;
                case 5: goto L_0x005b;
                case 6: goto L_0x0059;
                case 7: goto L_0x0045;
                case 8: goto L_0x005b;
                case 9: goto L_0x0059;
                default: goto L_0x0045;
            }
        L_0x0045:
            switch(r1) {
                case 4: goto L_0x0055;
                case 5: goto L_0x0055;
                case 6: goto L_0x0055;
                case 7: goto L_0x0053;
                case 8: goto L_0x0053;
                case 9: goto L_0x0053;
                default: goto L_0x0048;
            }
        L_0x0048:
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r2, r2)
            goto L_0x002c
        L_0x0053:
            float r6 = r6 - r7
            goto L_0x0057
        L_0x0055:
            float r6 = r6 - r7
            float r6 = r6 / r0
        L_0x0057:
            float r3 = r3 - r6
            goto L_0x0048
        L_0x0059:
            float r8 = r8 - r9
            goto L_0x005d
        L_0x005b:
            float r8 = r8 - r9
            float r8 = r8 / r0
        L_0x005d:
            float r4 = r4 - r8
            goto L_0x0045
        L_0x005f:
            float r2 = java.lang.Math.min(r10, r2)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A05(X.0Uo, X.0UX, X.0UX):android.graphics.Matrix");
    }

    public static Matrix A06(AnonymousClass0UX r3, AnonymousClass0PV r4, AnonymousClass0XJ r5, boolean z2) {
        r5.A0W();
        AnonymousClass0UF r1 = new AnonymousClass0UF(r5);
        r5.A0k(AnonymousClass0f0.A00(), r1);
        r5.A0r(r4, r1);
        r5.A02 = r1;
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(r3.A01, r3.A02);
            matrix.preScale(r3.A03, r3.A00);
        }
        return matrix;
    }

    public static final Typeface A07(C03720Jp r2, Integer num, String str) {
        int i2;
        Typeface typeface;
        String str2;
        boolean A1Y = AnonymousClass000.A1Y(r2, C03720Jp.Italic);
        if (num.intValue() > 500) {
            i2 = 1;
            if (A1Y) {
                i2 = 3;
            }
        } else {
            i2 = 0;
            if (A1Y) {
                i2 = 2;
            }
        }
        switch (str.hashCode()) {
            case -1536685117:
                str2 = "sans-serif";
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    typeface = Typeface.MONOSPACE;
                    break;
                } else {
                    return null;
                }
            case -1081737434:
                str2 = "fantasy";
                break;
            case 109326717:
                if (str.equals("serif")) {
                    typeface = Typeface.SERIF;
                    break;
                } else {
                    return null;
                }
            case 1126973893:
                str2 = "cursive";
                break;
            default:
                return null;
        }
        if (!str.equals(str2)) {
            return null;
        }
        typeface = Typeface.SANS_SERIF;
        return Typeface.create(typeface, i2);
    }

    public static final AnonymousClass0UX A08(Path path) {
        RectF A0K = AnonymousClass000.A0K();
        path.computeBounds(A0K, true);
        return new AnonymousClass0UX(A0K.left, A0K.top, A0K.width(), A0K.height());
    }

    public static AnonymousClass0UX A09(C03250Hu r1, AnonymousClass0XJ r2, float f2, float f3) {
        AnonymousClass0IQ r0 = new AnonymousClass0IQ(r2, f2, f3);
        r2.A0s(r1, r0);
        RectF rectF = r0.A02;
        return new AnonymousClass0UX(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static AnonymousClass0UF A0A(AnonymousClass0PV r2, AnonymousClass0XJ r3) {
        AnonymousClass0UF r1 = new AnonymousClass0UF(r3);
        r3.A0k(AnonymousClass0f0.A00(), r1);
        r3.A0r(r2, r1);
        return r1;
    }

    public static AnonymousClass0UF A0B(AnonymousClass0XJ r2) {
        r2.A05.push(r2.A02);
        return new AnonymousClass0UF(r2.A02, r2);
    }

    public static void A0C(Matrix matrix, AnonymousClass0XJ r2) {
        if (matrix != null) {
            r2.A00.concat(matrix);
        }
    }

    public static void A0D(Path path, AnonymousClass0XJ r2) {
        if (r2.A02.A06) {
            r2.A0a(path);
        }
    }

    public static void A0E(AnonymousClass0UX r4, AnonymousClass0UF r5, AnonymousClass0XJ r6) {
        if (!r5.A04.A0M.booleanValue()) {
            r6.A0Y(r4.A01, r4.A02, r4.A03, r4.A00);
        }
    }

    public static void A0F(C13320lq r29, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
        double d2;
        float f9 = f7;
        float f10 = f2;
        float f11 = f8;
        if (f2 != f7 || f3 != f8) {
            C13320lq r30 = r29;
            if (f4 == 0.0f || f5 == 0.0f) {
                r30.AK9(f9, f11);
                return;
            }
            float abs = Math.abs(f4);
            float abs2 = Math.abs(f5);
            float f12 = f6;
            double radians = (double) ((float) Math.toRadians(((double) f12) % 360.0d));
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f13 = (f10 - f7) / 2.0f;
            float f14 = (f3 - f8) / 2.0f;
            float f15 = (cos * f13) + (sin * f14);
            float f16 = ((-sin) * f13) + (f14 * cos);
            float f17 = abs * abs;
            float f18 = abs2 * abs2;
            float f19 = f15 * f15;
            float f20 = f16 * f16;
            float f21 = (f19 / f17) + (f20 / f18);
            if (f21 > 1.0f) {
                float sqrt = (float) Math.sqrt((double) f21);
                abs *= sqrt;
                abs2 *= sqrt;
                f17 = abs * abs;
                f18 = abs2 * abs2;
            }
            float f22 = 1.0f;
            if (z2 == z3) {
                f22 = -1.0f;
            }
            float f23 = f17 * f18;
            float f24 = f17 * f20;
            float f25 = f18 * f19;
            float f26 = ((f23 - f24) - f25) / (f24 + f25);
            if (f26 < 0.0f) {
                f26 = 0.0f;
            }
            float sqrt2 = (float) (((double) f22) * Math.sqrt((double) f26));
            float f27 = ((abs * f16) / abs2) * sqrt2;
            float f28 = sqrt2 * (-((abs2 * f15) / abs));
            float f29 = ((f10 + f7) / 2.0f) + ((cos * f27) - (sin * f28));
            float f30 = ((f3 + f8) / 2.0f) + (sin * f27) + (cos * f28);
            float f31 = (f15 - f27) / abs;
            float f32 = (f16 - f28) / abs2;
            float f33 = ((-f15) - f27) / abs;
            float f34 = ((-f16) - f28) / abs2;
            float f35 = (f31 * f31) + (f32 * f32);
            float sqrt3 = (float) Math.sqrt((double) f35);
            float f36 = 1.0f;
            if (f32 < 0.0f) {
                f36 = -1.0f;
            }
            float degrees = (float) Math.toDegrees(((double) f36) * Math.acos((double) (f31 / sqrt3)));
            float sqrt4 = (float) Math.sqrt((double) (f35 * ((f33 * f33) + (f34 * f34))));
            float f37 = (f31 * f33) + (f32 * f34);
            float f38 = 1.0f;
            if ((f31 * f34) - (f32 * f33) < 0.0f) {
                f38 = -1.0f;
            }
            double degrees2 = Math.toDegrees(((double) f38) * Math.acos((double) (f37 / sqrt4)));
            if (z3 || degrees2 <= 0.0d) {
                d2 = 360.0d;
                if (z3 && degrees2 < 0.0d) {
                    degrees2 += 360.0d;
                }
            } else {
                d2 = 360.0d;
                degrees2 -= 360.0d;
            }
            double d3 = degrees2 % d2;
            double d4 = (double) (degrees % 360.0f);
            int ceil = (int) Math.ceil(Math.abs(d3) / 90.0d);
            int i2 = ceil;
            double radians2 = Math.toRadians(d4);
            float radians3 = (float) (Math.toRadians(d3) / ((double) ceil));
            float f39 = radians3;
            double d5 = (double) radians3;
            double d6 = d5 / 2.0d;
            double sin2 = (Math.sin(d6) * 1.3333333333333333d) / (Math.cos(d6) + 1.0d);
            int i3 = i2 * 6;
            float[] fArr = new float[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                double d7 = ((double) (((float) i5) * f39)) + radians2;
                double cos2 = Math.cos(d7);
                double sin3 = Math.sin(d7);
                int i6 = i4 + 1;
                fArr[i4] = (float) (cos2 - (sin2 * sin3));
                int i7 = i6 + 1;
                fArr[i6] = (float) (sin3 + (cos2 * sin2));
                double d8 = d7 + d5;
                double cos3 = Math.cos(d8);
                double sin4 = Math.sin(d8);
                int i8 = i7 + 1;
                fArr[i7] = (float) ((sin2 * sin4) + cos3);
                int i9 = i8 + 1;
                fArr[i8] = (float) (sin4 - (sin2 * cos3));
                int i10 = i9 + 1;
                fArr[i9] = (float) cos3;
                i4 = i10 + 1;
                fArr[i10] = (float) sin4;
            }
            Matrix A0H = AnonymousClass000.A0H();
            A0H.postScale(abs, abs2);
            A0H.postRotate(f12);
            A0H.postTranslate(f29, f30);
            A0H.mapPoints(fArr);
            fArr[i3 - 2] = f7;
            fArr[i3 - 1] = f8;
            for (int i11 = 0; i11 < i3; i11 += 6) {
                r30.A7g(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]);
            }
        }
    }

    public static final void A0G(AnonymousClass0ez r3, AnonymousClass0UF r4, boolean z2) {
        AnonymousClass0I5 r32;
        AnonymousClass0f0 r2 = r4.A04;
        float floatValue = (z2 ? r2.A0O : r2.A0T).floatValue();
        if (r3 instanceof AnonymousClass0I5) {
            r32 = (AnonymousClass0I5) r3;
        } else if (r3 instanceof AnonymousClass0I4) {
            r32 = r2.A02;
        } else {
            return;
        }
        (z2 ? r4.A00 : r4.A01).setColor(A04(r32.A00, floatValue));
    }

    public static void A0H(AnonymousClass0XJ r1) {
        r1.A02 = (AnonymousClass0UF) r1.A05.pop();
    }

    public static void A0I(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static boolean A0J(Path path, AnonymousClass0IK r3, AnonymousClass0XJ r4) {
        r4.A0m(r3);
        r4.A0e(r3.A00, r3);
        boolean A0v = r4.A0v();
        if (r4.A02.A05) {
            r4.A0b(path, r3);
        }
        return A0v;
    }

    public static final boolean A0K(AnonymousClass0f0 r2, long j2) {
        return AnonymousClass000.A1O(((j2 & r2.A00) > 0 ? 1 : ((j2 & r2.A00) == 0 ? 0 : -1)));
    }

    public static boolean A0L(AnonymousClass0IL r1, AnonymousClass0XJ r2) {
        r2.A0p(r1, r2.A02);
        return r2.A0u();
    }

    public final Path A0M(AnonymousClass0UX r8, AnonymousClass0IK r9) {
        Path A0R;
        AnonymousClass0PV A042 = r9.A01.A04(this.A02.A04.A0W);
        boolean z2 = false;
        if (A042 == null) {
            A0I("ClipPath reference '%s' not found", this.A02.A04.A0W);
            return null;
        }
        C03230Hs r5 = (C03230Hs) A042;
        this.A05.push(this.A02);
        this.A02 = A0A(r5, this);
        Boolean bool = r5.A00;
        if (bool == null || bool.booleanValue()) {
            z2 = true;
        }
        Matrix A0H = AnonymousClass000.A0H();
        if (!z2) {
            A0H.preTranslate(r8.A01, r8.A02);
            A0H.preScale(r8.A03, r8.A00);
        }
        Matrix matrix = r5.A00;
        if (matrix != null) {
            A0H.preConcat(matrix);
        }
        Path A0I = AnonymousClass000.A0I();
        for (AnonymousClass0PV r1 : r5.A01) {
            if ((r1 instanceof AnonymousClass0IK) && (A0R = A0R((AnonymousClass0IK) r1, true)) != null) {
                A0I.op(A0R, Path.Op.UNION);
            }
        }
        if (this.A02.A04.A0W != null) {
            AnonymousClass0UX r0 = r5.A00;
            if (r0 == null) {
                r0 = A08(A0I);
                r5.A00 = r0;
            }
            Path A0M = A0M(r0, r5);
            if (A0M != null) {
                A0I.op(A0M, Path.Op.INTERSECT);
            }
        }
        A0I.transform(A0H);
        A0H(this);
        return A0I;
    }

    public final Path A0N(C03160Hl r24) {
        C03160Hl r4 = r24;
        float f2 = 0.0f;
        float A012 = A01(r4.A00, this);
        C09150f1 r0 = r4.A01;
        if (r0 != null) {
            f2 = r0.A03(this);
        }
        float A013 = r4.A02.A01(this);
        float f3 = A012 - A013;
        float f4 = f2 - A013;
        float f5 = A012 + A013;
        float f6 = f2 + A013;
        if (r4.A00 == null) {
            float f7 = 2.0f * A013;
            r4.A00 = new AnonymousClass0UX(f3, f4, f7, f7);
        }
        float f8 = 0.5522848f * A013;
        Path A0I = AnonymousClass000.A0I();
        A0I.moveTo(A012, f4);
        float f9 = A012 + f8;
        float f10 = f2 - f8;
        A0I.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        A0I.cubicTo(f5, f11, f9, f6, A012, f6);
        float f12 = A012 - f8;
        A0I.cubicTo(f12, f6, f3, f11, f3, f2);
        A0I.cubicTo(f3, f10, f12, f4, A012, f4);
        A0I.close();
        return A0I;
    }

    public final Path A0O(C03170Hm r27) {
        C03170Hm r7 = r27;
        float f2 = 0.0f;
        float A012 = A01(r7.A00, this);
        C09150f1 r0 = r7.A01;
        if (r0 != null) {
            f2 = r0.A03(this);
        }
        float A022 = r7.A02.A02(this);
        float A032 = r7.A03.A03(this);
        float f3 = A012 - A022;
        float f4 = f2 - A032;
        float f5 = A012 + A022;
        float f6 = f2 + A032;
        if (r7.A00 == null) {
            r7.A00 = new AnonymousClass0UX(f3, f4, A022 * 2.0f, 2.0f * A032);
        }
        float f7 = A022 * 0.5522848f;
        float f8 = 0.5522848f * A032;
        Path A0I = AnonymousClass000.A0I();
        A0I.moveTo(A012, f4);
        float f9 = A012 + f7;
        float f10 = f2 - f8;
        A0I.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f8 + f2;
        A0I.cubicTo(f5, f11, f9, f6, A012, f6);
        float f12 = A012 - f7;
        A0I.cubicTo(f12, f6, f3, f11, f3, f2);
        A0I.cubicTo(f3, f10, f12, f4, A012, f4);
        A0I.close();
        return A0I;
    }

    public final Path A0P(C03150Hk r6) {
        Path A0I = AnonymousClass000.A0I();
        float[] fArr = r6.A00;
        A0I.moveTo(fArr[0], fArr[1]);
        int i2 = 2;
        while (true) {
            float[] fArr2 = r6.A00;
            if (i2 >= fArr2.length) {
                break;
            }
            A0I.lineTo(fArr2[i2], fArr2[i2 + 1]);
            i2 += 2;
        }
        if (r6 instanceof C03240Ht) {
            A0I.close();
        }
        if (r6.A00 == null) {
            r6.A00 = A08(A0I);
        }
        return A0I;
    }

    public final Path A0Q(C03190Ho r25) {
        float f2;
        float f3;
        C03190Ho r3 = r25;
        C09150f1 r1 = r3.A01;
        C09150f1 r0 = r3.A02;
        if (r1 != null) {
            f2 = r1.A02(this);
            if (r0 != null) {
                f3 = r3.A02.A03(this);
            }
            f3 = f2;
        } else if (r0 == null) {
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            f2 = r0.A03(this);
            f3 = f2;
        }
        float min = Math.min(f2, r3.A03.A02(this) / 2.0f);
        float min2 = Math.min(f3, r3.A00.A03(this) / 2.0f);
        float A012 = A01(r3.A04, this);
        float A002 = A00(r3.A05, this);
        float A022 = r3.A03.A02(this);
        float A032 = r3.A00.A03(this);
        if (r3.A00 == null) {
            r3.A00 = new AnonymousClass0UX(A012, A002, A022, A032);
        }
        float f4 = A012 + A022;
        float f5 = A002 + A032;
        Path A0I = AnonymousClass000.A0I();
        if (min == 0.0f || min2 == 0.0f) {
            A0I.moveTo(A012, A002);
            A0I.lineTo(f4, A002);
            A0I.lineTo(f4, f5);
            A0I.lineTo(A012, f5);
            A0I.lineTo(A012, A002);
        } else {
            float f6 = min * 0.5522848f;
            float f7 = 0.5522848f * min2;
            float f8 = A002 + min2;
            A0I.moveTo(A012, f8);
            float f9 = f8 - f7;
            float f10 = A012 + min;
            float f11 = f10 - f6;
            A0I.cubicTo(A012, f9, f11, A002, f10, A002);
            float f12 = f4 - min;
            A0I.lineTo(f12, A002);
            float f13 = f12 + f6;
            float f14 = f4;
            A0I.cubicTo(f13, A002, f14, f9, f4, f8);
            float f15 = f5 - min2;
            A0I.lineTo(f4, f15);
            float f16 = f15 + f7;
            A0I.cubicTo(f14, f16, f13, f5, f12, f5);
            A0I.lineTo(f10, f5);
            A0I.cubicTo(f11, f5, A012, f16, A012, f15);
            A0I.lineTo(A012, f8);
        }
        A0I.close();
        return A0I;
    }

    public final Path A0R(AnonymousClass0IK r9, boolean z2) {
        Path path;
        Path A0M;
        Matrix matrix;
        AnonymousClass0UF A0B = A0B(this);
        this.A02 = A0B;
        A0p(r9, A0B);
        if (A0u() && A0w()) {
            if (r9 instanceof C03210Hq) {
                if (!z2) {
                    A0I("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                C03210Hq r3 = (C03210Hq) r9;
                AnonymousClass0PV A042 = r9.A01.A04(r3.A04);
                if (A042 == null) {
                    A0I("Use reference '%s' not found", r3.A04);
                } else if (A042 instanceof AnonymousClass0IK) {
                    path = A0R((AnonymousClass0IK) A042, false);
                    if (path != null) {
                        if (r3.A00 == null) {
                            r3.A00 = A08(path);
                        }
                        Matrix matrix2 = r3.A00;
                        if (matrix2 != null) {
                            path.transform(matrix2);
                        }
                    }
                    return null;
                }
            } else {
                if (r9 instanceof C03280Hx) {
                    C03280Hx r1 = (C03280Hx) r9;
                    if (r9 instanceof C03140Hj) {
                        path = new C08720eB(((C03140Hj) r9).A00, this).A02;
                        if (r9.A00 == null) {
                            r9.A00 = A08(path);
                        }
                    } else if (r9 instanceof C03190Ho) {
                        path = A0Q((C03190Ho) r9);
                    } else if (r9 instanceof C03160Hl) {
                        path = A0N((C03160Hl) r9);
                    } else if (r9 instanceof C03170Hm) {
                        path = A0O((C03170Hm) r9);
                    } else {
                        if (r9 instanceof C03150Hk) {
                            path = A0P((C03150Hk) r9);
                        }
                        return null;
                    }
                    if (r1.A00 == null) {
                        r1.A00 = A08(path);
                    }
                    matrix = r1.A00;
                } else if (r9 instanceof AnonymousClass0IE) {
                    AnonymousClass0IE r32 = (AnonymousClass0IE) r9;
                    List list = r32.A02;
                    float A032 = (list == null || list.size() == 0) ? 0.0f : A03(this, r32.A02);
                    List list2 = r32.A03;
                    float A033 = (list2 == null || list2.size() == 0) ? 0.0f : ((C09150f1) r32.A03.get(0)).A03(this);
                    List list3 = r32.A00;
                    float A034 = (list3 == null || list3.size() == 0) ? 0.0f : A03(this, r32.A00);
                    float A022 = A02(r32, this);
                    if (this.A02.A04.A0C != C03760Jt.Start) {
                        AnonymousClass0IN r0 = new AnonymousClass0IN(this);
                        A0s(r32, r0);
                        float f2 = r0.A00;
                        if (this.A02.A04.A0C == C03760Jt.Middle) {
                            f2 /= 2.0f;
                        }
                        A032 -= f2;
                    }
                    if (r32.A00 == null) {
                        r32.A00 = A09(r32, this, A032, A033);
                    }
                    path = AnonymousClass000.A0I();
                    A0s(r32, new AnonymousClass0IP(path, this, A032 + A034, A033 + A022));
                    matrix = r32.A00;
                } else {
                    A0I("Invalid %s element found in clipPath definition", r9.A00());
                    return null;
                }
                if (matrix != null) {
                    path.transform(matrix);
                }
                C03620Jf r12 = this.A02.A04.A06;
                path.setFillType((r12 == null || r12 != C03620Jf.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            if (!(this.A02.A04.A0W == null || (A0M = A0M(r9.A00, r9)) == null)) {
                path.op(A0M, Path.Op.INTERSECT);
            }
            A0H(this);
            return path;
        }
        A0H(this);
        return null;
    }

    public final AnonymousClass0UX A0S(C09150f1 r6, C09150f1 r7, C09150f1 r8, C09150f1 r9) {
        float f2 = 0.0f;
        float A012 = A01(r6, this);
        if (r7 != null) {
            f2 = r7.A03(this);
        }
        AnonymousClass0UF r1 = this.A02;
        AnonymousClass0UX r0 = r1.A02;
        if (r0 == null) {
            r0 = r1.A03;
        }
        return new AnonymousClass0UX(A012, f2, r8 != null ? r8.A02(this) : r0.A03, r9 != null ? r9.A03(this) : r0.A00);
    }

    public final C03760Jt A0T() {
        C03760Jt r1;
        AnonymousClass0f0 r2 = this.A02.A04;
        if (r2.A0E == C03630Jg.LTR || (r1 = r2.A0C) == C03760Jt.Middle) {
            return r2.A0C;
        }
        C03760Jt r0 = C03760Jt.Start;
        return r1 == r0 ? C03760Jt.End : r0;
    }

    public final String A0U(String str, boolean z2, boolean z3) {
        String str2;
        if (this.A02.A07) {
            str2 = "[\\n\\t]";
        } else {
            str = str.replaceAll("\\n", "").replaceAll("\\t", " ");
            if (z2) {
                str = str.replaceAll("^\\s+", "");
            }
            if (z3) {
                str = str.replaceAll("\\s+$", "");
            }
            str2 = "\\s{2,}";
        }
        return str.replaceAll(str2, " ");
    }

    public final void A0V() {
        this.A00.restore();
        A0H(this);
    }

    public final void A0W() {
        this.A00.save();
        this.A02 = A0B(this);
    }

    public final void A0X() {
        AnonymousClass0I5 r1;
        AnonymousClass0f0 r2 = this.A02.A04;
        AnonymousClass0ez r12 = r2.A0K;
        if (r12 instanceof AnonymousClass0I5) {
            r1 = (AnonymousClass0I5) r12;
        } else if (r12 instanceof AnonymousClass0I4) {
            r1 = r2.A02;
        } else {
            return;
        }
        int i2 = r1.A00;
        Float f2 = r2.A0U;
        if (f2 != null) {
            i2 = A04(i2, f2.floatValue());
        }
        this.A00.drawColor(i2);
    }

    public final void A0Y(float f2, float f3, float f4, float f5) {
        float f6 = f4 + f2;
        float f7 = f5 + f3;
        C04900Ol r0 = this.A02.A04.A01;
        if (r0 != null) {
            f2 += r0.A01.A02(this);
            f3 += this.A02.A04.A01.A03.A03(this);
            f6 -= this.A02.A04.A01.A02.A02(this);
            f7 -= this.A02.A04.A01.A00.A03(this);
        }
        this.A00.clipRect(f2, f3, f6, f7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Z(android.graphics.Matrix r9, android.graphics.Path r10, X.AnonymousClass0PV r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = r8.A0u()
            if (r0 == 0) goto L_0x004c
            android.graphics.Canvas r3 = r8.A00
            r3.save()
            X.0UF r1 = A0B(r8)
            r8.A02 = r1
            boolean r0 = r11 instanceof X.C03210Hq
            r2 = 0
            if (r0 == 0) goto L_0x005b
            if (r12 == 0) goto L_0x0056
            X.0Hq r11 = (X.C03210Hq) r11
            r8.A0p(r11, r1)
            boolean r0 = r8.A0u()
            if (r0 == 0) goto L_0x0046
            boolean r0 = r8.A0w()
            if (r0 == 0) goto L_0x0046
            android.graphics.Matrix r0 = r11.A00
            if (r0 == 0) goto L_0x0030
            r9.preConcat(r0)
        L_0x0030:
            X.0Rz r1 = r11.A01
            java.lang.String r0 = r11.A04
            X.0PV r1 = r1.A04(r0)
            if (r1 != 0) goto L_0x004d
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r11.A04
            r1[r2] = r0
            java.lang.String r0 = "Use reference '%s' not found"
        L_0x0043:
            A0I(r0, r1)
        L_0x0046:
            r3.restore()
            A0H(r8)
        L_0x004c:
            return
        L_0x004d:
            X.0UX r0 = r11.A00
            r8.A0e(r0, r11)
            r8.A0Z(r9, r10, r1, r2)
            goto L_0x0046
        L_0x0056:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "<use> elements inside a <clipPath> cannot reference another <use>"
            goto L_0x0043
        L_0x005b:
            boolean r0 = r11 instanceof X.C03140Hj
            if (r0 == 0) goto L_0x00a5
            X.0Hj r11 = (X.C03140Hj) r11
            r8.A0p(r11, r1)
            boolean r0 = r8.A0u()
            if (r0 == 0) goto L_0x0046
            boolean r0 = r8.A0w()
            if (r0 == 0) goto L_0x0046
            android.graphics.Matrix r0 = r11.A00
            if (r0 == 0) goto L_0x0077
            r9.preConcat(r0)
        L_0x0077:
            X.0eD r1 = r11.A00
            X.0eB r0 = new X.0eB
            r0.<init>(r1, r8)
            android.graphics.Path r2 = r0.A02
            X.0UX r0 = r11.A00
            if (r0 != 0) goto L_0x008a
            X.0UX r0 = A08(r2)
            r11.A00 = r0
        L_0x008a:
            r8.A0e(r0, r11)
        L_0x008d:
            X.0UF r0 = r8.A02
            X.0f0 r0 = r0.A04
            X.0Jf r1 = r0.A06
            if (r1 == 0) goto L_0x00a2
            X.0Jf r0 = X.C03620Jf.EvenOdd
            if (r1 != r0) goto L_0x00a2
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x009b:
            r10.setFillType(r0)
            r10.addPath(r2, r9)
            goto L_0x0046
        L_0x00a2:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x009b
        L_0x00a5:
            boolean r0 = r11 instanceof X.AnonymousClass0IE
            if (r0 == 0) goto L_0x013a
            X.0IE r11 = (X.AnonymousClass0IE) r11
            r8.A0p(r11, r1)
            boolean r0 = r8.A0u()
            if (r0 == 0) goto L_0x0046
            android.graphics.Matrix r0 = r11.A00
            if (r0 == 0) goto L_0x00bb
            r9.preConcat(r0)
        L_0x00bb:
            java.util.List r1 = r11.A02
            if (r1 == 0) goto L_0x0138
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0138
            java.util.List r0 = r11.A02
            float r4 = A03(r8, r0)
        L_0x00cb:
            java.util.List r0 = r11.A03
            if (r0 == 0) goto L_0x0136
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0136
            java.util.List r0 = r11.A03
            java.lang.Object r0 = r0.get(r2)
            X.0f1 r0 = (X.C09150f1) r0
            float r5 = r0.A03(r8)
        L_0x00e1:
            java.util.List r0 = r11.A00
            if (r0 == 0) goto L_0x0134
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0134
            java.util.List r0 = r11.A00
            float r7 = A03(r8, r0)
        L_0x00f1:
            float r6 = A02(r11, r8)
            X.0UF r0 = r8.A02
            X.0f0 r0 = r0.A04
            X.0Jt r1 = r0.A0C
            X.0Jt r0 = X.C03760Jt.Start
            if (r1 == r0) goto L_0x0117
            X.0IN r0 = new X.0IN
            r0.<init>(r8)
            r8.A0s(r11, r0)
            float r2 = r0.A00
            X.0UF r0 = r8.A02
            X.0f0 r0 = r0.A04
            X.0Jt r1 = r0.A0C
            X.0Jt r0 = X.C03760Jt.Middle
            if (r1 != r0) goto L_0x0116
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
        L_0x0116:
            float r4 = r4 - r2
        L_0x0117:
            X.0UX r0 = r11.A00
            if (r0 != 0) goto L_0x0121
            X.0UX r0 = A09(r11, r8, r4, r5)
            r11.A00 = r0
        L_0x0121:
            r8.A0e(r0, r11)
            android.graphics.Path r2 = X.AnonymousClass000.A0I()
            float r4 = r4 + r7
            float r5 = r5 + r6
            X.0IP r0 = new X.0IP
            r0.<init>(r2, r8, r4, r5)
            r8.A0s(r11, r0)
            goto L_0x008d
        L_0x0134:
            r7 = 0
            goto L_0x00f1
        L_0x0136:
            r5 = 0
            goto L_0x00e1
        L_0x0138:
            r4 = 0
            goto L_0x00cb
        L_0x013a:
            boolean r0 = r11 instanceof X.C03280Hx
            if (r0 == 0) goto L_0x0189
            X.0Hx r11 = (X.C03280Hx) r11
            r8.A0p(r11, r1)
            boolean r0 = r8.A0u()
            if (r0 == 0) goto L_0x0046
            boolean r0 = r8.A0w()
            if (r0 == 0) goto L_0x0046
            android.graphics.Matrix r0 = r11.A00
            if (r0 == 0) goto L_0x0156
            r9.preConcat(r0)
        L_0x0156:
            boolean r0 = r11 instanceof X.C03190Ho
            if (r0 == 0) goto L_0x0165
            r0 = r11
            X.0Ho r0 = (X.C03190Ho) r0
            android.graphics.Path r2 = r8.A0Q(r0)
        L_0x0161:
            X.0UX r0 = r11.A00
            goto L_0x008a
        L_0x0165:
            boolean r0 = r11 instanceof X.C03160Hl
            if (r0 == 0) goto L_0x0171
            r0 = r11
            X.0Hl r0 = (X.C03160Hl) r0
            android.graphics.Path r2 = r8.A0N(r0)
            goto L_0x0161
        L_0x0171:
            boolean r0 = r11 instanceof X.C03170Hm
            if (r0 == 0) goto L_0x017d
            r0 = r11
            X.0Hm r0 = (X.C03170Hm) r0
            android.graphics.Path r2 = r8.A0O(r0)
            goto L_0x0161
        L_0x017d:
            boolean r0 = r11 instanceof X.C03150Hk
            if (r0 == 0) goto L_0x0046
            r0 = r11
            X.0Hk r0 = (X.C03150Hk) r0
            android.graphics.Path r2 = r8.A0P(r0)
            goto L_0x0161
        L_0x0189:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r11.toString()
            r1[r2] = r0
            java.lang.String r0 = "Invalid %s element found in clipPath definition"
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0Z(android.graphics.Matrix, android.graphics.Path, X.0PV, boolean):void");
    }

    public final void A0a(Path path) {
        AnonymousClass0UF r2 = this.A02;
        if (r2.A04.A0F == C03640Jh.NonScalingStroke) {
            Canvas canvas = this.A00;
            Matrix matrix = canvas.getMatrix();
            Path A0I = AnonymousClass000.A0I();
            path.transform(matrix, A0I);
            canvas.setMatrix(AnonymousClass000.A0H());
            Shader shader = this.A02.A01.getShader();
            Matrix A0H = AnonymousClass000.A0H();
            if (shader != null) {
                shader.getLocalMatrix(A0H);
                Matrix matrix2 = new Matrix(A0H);
                matrix2.postConcat(matrix);
                shader.setLocalMatrix(matrix2);
            }
            canvas.drawPath(A0I, this.A02.A01);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(A0H);
                return;
            }
            return;
        }
        this.A00.drawPath(path, r2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0175, code lost:
        if (r4 != false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r0.booleanValue() == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0b(android.graphics.Path r20, X.AnonymousClass0IK r21) {
        /*
            r19 = this;
            r10 = r19
            X.0UF r0 = r10.A02
            X.0f0 r0 = r0.A04
            X.0ez r2 = r0.A0G
            boolean r0 = r2 instanceof X.AnonymousClass0I3
            r6 = r20
            if (r0 == 0) goto L_0x01cf
            X.0Rz r1 = r10.A01
            X.0I3 r2 = (X.AnonymousClass0I3) r2
            java.lang.String r0 = r2.A01
            X.0PV r9 = r1.A04(r0)
            boolean r0 = r9 instanceof X.AnonymousClass0IA
            if (r0 == 0) goto L_0x01cf
            X.0IA r9 = (X.AnonymousClass0IA) r9
            java.lang.Boolean r0 = r9.A06
            r18 = 0
            r17 = 1
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            java.lang.String r0 = r9.A07
            if (r0 == 0) goto L_0x0035
            r10.A0j(r9, r0)
        L_0x0035:
            r8 = 0
            X.0f1 r0 = r9.A03
            r11 = r21
            if (r1 == 0) goto L_0x0189
            float r16 = A01(r0, r10)
            X.0f1 r0 = r9.A04
            float r2 = A00(r0, r10)
            X.0f1 r0 = r9.A02
            float r1 = A01(r0, r10)
            X.0f1 r0 = r9.A01
            float r0 = A00(r0, r10)
        L_0x0052:
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01d8
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01d8
            X.0Uo r8 = r9.A00
            if (r8 != 0) goto L_0x0060
            X.0Uo r8 = X.C06170Uo.A02
        L_0x0060:
            r10.A0W()
            android.graphics.Canvas r7 = r10.A00
            r7.clipPath(r6)
            X.0UF r5 = new X.0UF
            r5.<init>(r10)
            X.0f0 r3 = X.AnonymousClass0f0.A00()
            r10.A0k(r3, r5)
            X.0f0 r4 = r5.A04
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.A0M = r3
            r10.A0r(r9, r5)
            r10.A02 = r5
            X.0UX r6 = r11.A00
            android.graphics.Matrix r3 = r9.A00
            if (r3 == 0) goto L_0x0105
            r7.concat(r3)
            android.graphics.Matrix r5 = X.AnonymousClass000.A0H()
            android.graphics.Matrix r3 = r9.A00
            boolean r3 = r3.invert(r5)
            if (r3 == 0) goto L_0x0105
            r3 = 8
            float[] r15 = new float[r3]
            X.0UX r13 = r11.A00
            float r12 = r13.A01
            r15[r18] = r12
            float r6 = r13.A02
            r15[r17] = r6
            float r3 = r13.A03
            float r4 = r12 + r3
            r3 = 2
            r15[r3] = r4
            r3 = 3
            r15[r3] = r6
            r3 = 4
            r15[r3] = r4
            r4 = 5
            float r3 = r13.A00
            float r6 = r6 + r3
            r15[r4] = r6
            r14 = 6
            r15[r14] = r12
            r3 = 7
            r15[r3] = r6
            r5.mapPoints(r15)
            r4 = r15[r18]
            r3 = r15[r17]
            android.graphics.RectF r13 = new android.graphics.RectF
            r13.<init>(r4, r3, r4, r3)
            r6 = 2
        L_0x00c8:
            r3 = r15[r6]
            float r12 = r13.left
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x00d4
            r12 = r15[r6]
            r13.left = r12
        L_0x00d4:
            r3 = r15[r6]
            float r5 = r13.right
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e0
            r5 = r15[r6]
            r13.right = r5
        L_0x00e0:
            int r18 = r6 + 1
            r3 = r15[r18]
            float r4 = r13.top
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ee
            r4 = r15[r18]
            r13.top = r4
        L_0x00ee:
            r17 = r15[r18]
            float r3 = r13.bottom
            int r17 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r17 <= 0) goto L_0x00fa
            r3 = r15[r18]
            r13.bottom = r3
        L_0x00fa:
            int r6 = r6 + 2
            if (r6 <= r14) goto L_0x00c8
            float r5 = r5 - r12
            float r3 = r3 - r4
            X.0UX r6 = new X.0UX
            r6.<init>(r12, r4, r5, r3)
        L_0x0105:
            float r5 = r6.A01
            float r3 = r5 - r16
            float r3 = r3 / r1
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r12 = (float) r3
            float r12 = r12 * r1
            float r16 = r16 + r12
            float r12 = r6.A02
            float r3 = r12 - r2
            float r3 = r3 / r0
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r13 = (float) r3
            float r13 = r13 * r0
            float r2 = r2 + r13
            float r3 = r6.A03
            float r5 = r5 + r3
            float r3 = r6.A00
            float r12 = r12 + r3
            r3 = 0
            X.0UX r13 = new X.0UX
            r13.<init>(r3, r3, r1, r0)
            boolean r14 = r10.A0v()
        L_0x0130:
            int r3 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x01c6
            r6 = r16
        L_0x0136:
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0187
            r13.A01 = r6
            r13.A02 = r2
            r10.A0W()
            X.0UF r3 = r10.A02
            A0E(r13, r3, r10)
            X.0UX r3 = r9.A00
            if (r3 == 0) goto L_0x016c
            android.graphics.Matrix r3 = A05(r8, r13, r3)
            r7.concat(r3)
        L_0x0151:
            java.util.List r3 = r9.A01
            java.util.Iterator r4 = r3.iterator()
        L_0x0157:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0167
            java.lang.Object r3 = r4.next()
            X.0PV r3 = (X.AnonymousClass0PV) r3
            r10.A0q(r3)
            goto L_0x0157
        L_0x0167:
            r10.A0V()
            float r6 = r6 + r1
            goto L_0x0136
        L_0x016c:
            java.lang.Boolean r3 = r9.A05
            if (r3 == 0) goto L_0x0177
            boolean r4 = r3.booleanValue()
            r3 = 0
            if (r4 == 0) goto L_0x0178
        L_0x0177:
            r3 = 1
        L_0x0178:
            r7.translate(r6, r2)
            if (r3 != 0) goto L_0x0151
            X.0UX r3 = r11.A00
            float r4 = r3.A03
            float r3 = r3.A00
            r7.scale(r4, r3)
            goto L_0x0151
        L_0x0187:
            float r2 = r2 + r0
            goto L_0x0130
        L_0x0189:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01c3
            float r16 = r0.A04(r10, r3)
        L_0x0191:
            X.0f1 r0 = r9.A04
            if (r0 == 0) goto L_0x01c1
            float r2 = r0.A04(r10, r3)
        L_0x0199:
            X.0f1 r0 = r9.A02
            if (r0 == 0) goto L_0x01bf
            float r1 = r0.A04(r10, r3)
        L_0x01a1:
            X.0f1 r0 = r9.A01
            if (r0 == 0) goto L_0x01bd
            float r0 = r0.A04(r10, r3)
        L_0x01a9:
            X.0UX r7 = r11.A00
            float r3 = r7.A01
            float r5 = r7.A03
            float r16 = r16 * r5
            float r16 = r16 + r3
            float r4 = r7.A02
            float r3 = r7.A00
            float r2 = r2 * r3
            float r2 = r2 + r4
            float r1 = r1 * r5
            float r0 = r0 * r3
            goto L_0x0052
        L_0x01bd:
            r0 = 0
            goto L_0x01a9
        L_0x01bf:
            r1 = 0
            goto L_0x01a1
        L_0x01c1:
            r2 = 0
            goto L_0x0199
        L_0x01c3:
            r16 = 0
            goto L_0x0191
        L_0x01c6:
            if (r14 == 0) goto L_0x01cb
            r10.A0n(r9)
        L_0x01cb:
            r10.A0V()
            return
        L_0x01cf:
            android.graphics.Canvas r1 = r10.A00
            X.0UF r0 = r10.A02
            android.graphics.Paint r0 = r0.A00
            r1.drawPath(r6, r0)
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0b(android.graphics.Path, X.0IK):void");
    }

    public final void A0c(C06170Uo r4, AnonymousClass0UX r5, AnonymousClass0UX r6, AnonymousClass0I6 r7) {
        if (r5.A03 != 0.0f && r5.A00 != 0.0f) {
            if (r4 == null && (r4 = r7.A00) == null) {
                r4 = C06170Uo.A02;
            }
            if (A0L(r7, this)) {
                AnonymousClass0UF r0 = this.A02;
                r0.A03 = r5;
                A0E(r5, r0, this);
                A0e(this.A02.A03, r7);
                Canvas canvas = this.A00;
                AnonymousClass0UX r02 = this.A02.A03;
                if (r6 != null) {
                    canvas.concat(A05(r4, r02, r6));
                    this.A02.A02 = r7.A00;
                } else {
                    canvas.translate(r02.A01, r02.A02);
                }
                boolean A0v = A0v();
                A0X();
                A0l(r7, true);
                if (A0v) {
                    A0n(r7);
                }
                A0o(r7);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r0.booleanValue() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00de, code lost:
        if (r0.booleanValue() == false) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d(X.AnonymousClass0UX r23, X.AnonymousClass0I3 r24, boolean r25) {
        /*
            r22 = this;
            r2 = r22
            X.0Rz r0 = r2.A01
            r6 = r24
            java.lang.String r4 = r6.A01
            X.0PV r5 = r0.A04(r4)
            r8 = r25
            if (r5 != 0) goto L_0x002f
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            if (r25 == 0) goto L_0x002c
            java.lang.String r0 = "Fill"
        L_0x0017:
            r3 = 0
            r1[r3] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r0 = "%s reference '%s' not found"
            A0I(r0, r1)
            X.0ez r1 = r6.A00
            X.0UF r0 = r2.A02
            if (r1 == 0) goto L_0x01d2
            A0G(r1, r0, r8)
        L_0x002b:
            return
        L_0x002c:
            java.lang.String r0 = "Stroke"
            goto L_0x0017
        L_0x002f:
            boolean r0 = r5 instanceof X.C03120Hh
            r4 = r23
            if (r0 == 0) goto L_0x00c7
            X.0Hh r5 = (X.C03120Hh) r5
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x003e
            r2.A0f(r5, r0)
        L_0x003e:
            java.lang.Boolean r0 = r5.A02
            r3 = 1
            r10 = 0
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.booleanValue()
            r9 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r9 = 0
        L_0x004c:
            X.0UF r1 = r2.A02
            if (r25 == 0) goto L_0x00c4
            android.graphics.Paint r0 = r1.A00
        L_0x0052:
            if (r9 == 0) goto L_0x0096
            X.0UX r6 = r1.A02
            if (r6 != 0) goto L_0x005a
            X.0UX r6 = r1.A03
        L_0x005a:
            X.0f1 r1 = r5.A00
            float r15 = A01(r1, r2)
            X.0f1 r1 = r5.A02
            float r16 = A00(r1, r2)
            X.0f1 r1 = r5.A01
            if (r1 == 0) goto L_0x0093
            float r6 = r1.A02(r2)
        L_0x006e:
            X.0f1 r1 = r5.A03
            if (r1 == 0) goto L_0x00c1
            float r18 = r1.A03(r2)
        L_0x0076:
            android.graphics.Matrix r7 = A06(r4, r5, r2, r9)
            android.graphics.Matrix r1 = r5.A00
            if (r1 == 0) goto L_0x0081
            r7.preConcat(r1)
        L_0x0081:
            java.util.List r1 = r5.A04
            int r9 = r1.size()
            if (r9 != 0) goto L_0x01dd
            r2.A0V()
            X.0UF r0 = r2.A02
            if (r25 == 0) goto L_0x01da
            r0.A05 = r10
            return
        L_0x0093:
            float r6 = r6.A03
            goto L_0x006e
        L_0x0096:
            X.0f1 r1 = r5.A00
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x00bf
            float r15 = r1.A04(r2, r7)
        L_0x00a0:
            X.0f1 r1 = r5.A02
            if (r1 == 0) goto L_0x00bc
            float r16 = r1.A04(r2, r7)
        L_0x00a8:
            X.0f1 r1 = r5.A01
            if (r1 == 0) goto L_0x00b9
            float r6 = r1.A04(r2, r7)
        L_0x00b0:
            X.0f1 r1 = r5.A03
            if (r1 == 0) goto L_0x00c1
            float r18 = r1.A04(r2, r7)
            goto L_0x0076
        L_0x00b9:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b0
        L_0x00bc:
            r16 = 0
            goto L_0x00a8
        L_0x00bf:
            r15 = 0
            goto L_0x00a0
        L_0x00c1:
            r18 = 0
            goto L_0x0076
        L_0x00c4:
            android.graphics.Paint r0 = r1.A01
            goto L_0x0052
        L_0x00c7:
            boolean r0 = r5 instanceof X.C03130Hi
            if (r0 == 0) goto L_0x015d
            X.0Hi r5 = (X.C03130Hi) r5
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x00d4
            r2.A0f(r5, r0)
        L_0x00d4:
            java.lang.Boolean r0 = r5.A02
            r7 = 0
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 != 0) goto L_0x00e1
        L_0x00e0:
            r6 = 0
        L_0x00e1:
            X.0UF r0 = r2.A02
            if (r25 == 0) goto L_0x015a
            android.graphics.Paint r0 = r0.A00
        L_0x00e7:
            if (r6 == 0) goto L_0x0136
            r9 = 1112014848(0x42480000, float:50.0)
            X.0Ju r1 = X.C03770Ju.percent
            X.0f1 r3 = new X.0f1
            r3.<init>(r1, r9)
            X.0f1 r1 = r5.A00
            if (r1 == 0) goto L_0x0131
            float r11 = r1.A02(r2)
        L_0x00fa:
            X.0f1 r1 = r5.A01
            if (r1 == 0) goto L_0x012c
            float r12 = r1.A03(r2)
        L_0x0102:
            X.0f1 r1 = r5.A04
            if (r1 == 0) goto L_0x0127
            float r13 = r1.A01(r2)
        L_0x010a:
            android.graphics.Matrix r4 = A06(r4, r5, r2, r6)
            android.graphics.Matrix r1 = r5.A00
            if (r1 == 0) goto L_0x0115
            r4.preConcat(r1)
        L_0x0115:
            java.util.List r1 = r5.A04
            int r3 = r1.size()
            if (r3 != 0) goto L_0x0238
            r2.A0V()
            X.0UF r0 = r2.A02
            if (r25 == 0) goto L_0x0235
            r0.A05 = r7
            return
        L_0x0127:
            float r13 = r3.A01(r2)
            goto L_0x010a
        L_0x012c:
            float r12 = r3.A03(r2)
            goto L_0x0102
        L_0x0131:
            float r11 = r3.A02(r2)
            goto L_0x00fa
        L_0x0136:
            X.0f1 r1 = r5.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0154
            float r11 = r1.A04(r2, r3)
        L_0x0140:
            X.0f1 r1 = r5.A01
            if (r1 == 0) goto L_0x0151
            float r12 = r1.A04(r2, r3)
        L_0x0148:
            X.0f1 r1 = r5.A04
            if (r1 == 0) goto L_0x0157
            float r13 = r1.A04(r2, r3)
            goto L_0x010a
        L_0x0151:
            r12 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0148
        L_0x0154:
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0140
        L_0x0157:
            r13 = 1056964608(0x3f000000, float:0.5)
            goto L_0x010a
        L_0x015a:
            android.graphics.Paint r0 = r0.A01
            goto L_0x00e7
        L_0x015d:
            boolean r0 = r5 instanceof X.AnonymousClass0I0
            if (r0 == 0) goto L_0x002b
            X.0IL r5 = (X.AnonymousClass0IL) r5
            r10 = 1
            r6 = 6442450944(0x180000000, double:3.1829936864E-314)
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            X.0f0 r9 = r5.A00
            boolean r0 = A0K(r9, r0)
            if (r25 == 0) goto L_0x01a8
            if (r0 == 0) goto L_0x018a
            X.0UF r5 = r2.A02
            X.0f0 r1 = r5.A04
            X.0ez r0 = r9.A0H
            r1.A0G = r0
            if (r0 != 0) goto L_0x0188
            r10 = 0
        L_0x0188:
            r5.A05 = r10
        L_0x018a:
            boolean r0 = A0K(r9, r3)
            if (r0 == 0) goto L_0x0198
            X.0UF r0 = r2.A02
            X.0f0 r1 = r0.A04
            java.lang.Float r0 = r9.A0Q
            r1.A0O = r0
        L_0x0198:
            boolean r0 = A0K(r9, r6)
            if (r0 == 0) goto L_0x002b
            X.0UF r1 = r2.A02
            X.0f0 r0 = r1.A04
            X.0ez r0 = r0.A0G
        L_0x01a4:
            A0G(r0, r1, r8)
            return
        L_0x01a8:
            if (r0 == 0) goto L_0x01b7
            X.0UF r5 = r2.A02
            X.0f0 r1 = r5.A04
            X.0ez r0 = r9.A0H
            r1.A0J = r0
            if (r0 != 0) goto L_0x01b5
            r10 = 0
        L_0x01b5:
            r5.A06 = r10
        L_0x01b7:
            boolean r0 = A0K(r9, r3)
            if (r0 == 0) goto L_0x01c5
            X.0UF r0 = r2.A02
            X.0f0 r1 = r0.A04
            java.lang.Float r0 = r9.A0Q
            r1.A0T = r0
        L_0x01c5:
            boolean r0 = A0K(r9, r6)
            if (r0 == 0) goto L_0x002b
            X.0UF r1 = r2.A02
            X.0f0 r0 = r1.A04
            X.0ez r0 = r0.A0J
            goto L_0x01a4
        L_0x01d2:
            if (r25 == 0) goto L_0x01d7
            r0.A05 = r3
            return
        L_0x01d7:
            r0.A06 = r3
            return
        L_0x01da:
            r0.A06 = r10
            return
        L_0x01dd:
            int[] r8 = new int[r9]
            float[] r4 = new float[r9]
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r1 = r5.A04
            java.util.Iterator r13 = r1.iterator()
        L_0x01e9:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x02b8
            java.lang.Object r11 = r13.next()
            X.0PV r11 = (X.AnonymousClass0PV) r11
            X.0I1 r11 = (X.AnonymousClass0I1) r11
            java.lang.Float r1 = r11.A00
            if (r1 == 0) goto L_0x0233
            float r12 = r1.floatValue()
        L_0x01ff:
            if (r10 == 0) goto L_0x022f
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x022f
            r4[r10] = r14
        L_0x0207:
            r2.A0W()
            X.0UF r1 = r2.A02
            r2.A0p(r11, r1)
            X.0UF r1 = r2.A02
            X.0f0 r12 = r1.A04
            X.0ez r1 = r12.A0I
            X.0I5 r1 = (X.AnonymousClass0I5) r1
            if (r1 != 0) goto L_0x021b
            X.0I5 r1 = X.AnonymousClass0I5.A01
        L_0x021b:
            int r11 = r1.A00
            java.lang.Float r1 = r12.A0R
            float r1 = r1.floatValue()
            int r1 = A04(r11, r1)
            r8[r10] = r1
            int r10 = r10 + 1
            r2.A0V()
            goto L_0x01e9
        L_0x022f:
            r4[r10] = r12
            r14 = r12
            goto L_0x0207
        L_0x0233:
            r12 = 0
            goto L_0x01ff
        L_0x0235:
            r0.A06 = r7
            return
        L_0x0238:
            int[] r14 = new int[r3]
            float[] r15 = new float[r3]
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r1 = r5.A04
            java.util.Iterator r9 = r1.iterator()
        L_0x0244:
            boolean r1 = r9.hasNext()
            r8 = 0
            if (r1 == 0) goto L_0x028f
            java.lang.Object r6 = r9.next()
            X.0PV r6 = (X.AnonymousClass0PV) r6
            X.0I1 r6 = (X.AnonymousClass0I1) r6
            java.lang.Float r1 = r6.A00
            if (r1 == 0) goto L_0x025b
            float r8 = r1.floatValue()
        L_0x025b:
            if (r7 == 0) goto L_0x028b
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x028b
            r15[r7] = r10
        L_0x0263:
            r2.A0W()
            X.0UF r1 = r2.A02
            r2.A0p(r6, r1)
            X.0UF r1 = r2.A02
            X.0f0 r8 = r1.A04
            X.0ez r1 = r8.A0I
            X.0I5 r1 = (X.AnonymousClass0I5) r1
            if (r1 != 0) goto L_0x0277
            X.0I5 r1 = X.AnonymousClass0I5.A01
        L_0x0277:
            int r6 = r1.A00
            java.lang.Float r1 = r8.A0R
            float r1 = r1.floatValue()
            int r1 = A04(r6, r1)
            r14[r7] = r1
            int r7 = r7 + 1
            r2.A0V()
            goto L_0x0244
        L_0x028b:
            r15[r7] = r8
            r10 = r8
            goto L_0x0263
        L_0x028f:
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0305
            r1 = 1
            if (r3 == r1) goto L_0x0305
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
            X.0Je r3 = r5.A01
            if (r3 == 0) goto L_0x02a2
            X.0Je r1 = X.C03610Je.reflect
            if (r3 != r1) goto L_0x02b1
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.MIRROR
        L_0x02a2:
            r2.A0V()
            android.graphics.RadialGradient r10 = new android.graphics.RadialGradient
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r10.setLocalMatrix(r4)
            r0.setShader(r10)
            goto L_0x02e2
        L_0x02b1:
            X.0Je r1 = X.C03610Je.repeat
            if (r3 != r1) goto L_0x02a2
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x02a2
        L_0x02b8:
            int r1 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x02c0
            int r1 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x030d
        L_0x02c0:
            if (r9 == r3) goto L_0x030d
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.CLAMP
            X.0Je r3 = r5.A01
            if (r3 == 0) goto L_0x02ce
            X.0Je r1 = X.C03610Je.reflect
            if (r3 != r1) goto L_0x02fe
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.MIRROR
        L_0x02ce:
            r2.A0V()
            android.graphics.LinearGradient r14 = new android.graphics.LinearGradient
            r19 = r8
            r20 = r4
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r14.setLocalMatrix(r7)
            r0.setShader(r14)
        L_0x02e2:
            X.0UF r1 = r2.A02
            X.0f0 r1 = r1.A04
            java.lang.Float r1 = r1.A0O
            float r2 = r1.floatValue()
            r1 = 1132462080(0x43800000, float:256.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 >= 0) goto L_0x02f9
            r2 = 0
        L_0x02f5:
            r0.setAlpha(r2)
            return
        L_0x02f9:
            if (r2 <= r1) goto L_0x02f5
            r2 = 255(0xff, float:3.57E-43)
            goto L_0x02f5
        L_0x02fe:
            X.0Je r1 = X.C03610Je.repeat
            if (r3 != r1) goto L_0x02ce
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x02ce
        L_0x0305:
            r2.A0V()
            r1 = 1
            int r3 = r3 - r1
            r1 = r14[r3]
            goto L_0x0313
        L_0x030d:
            r2.A0V()
            int r9 = r9 - r3
            r1 = r8[r9]
        L_0x0313:
            r0.setColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0d(X.0UX, X.0I3, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r0.booleanValue() != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e(X.AnonymousClass0UX r8, X.AnonymousClass0IK r9) {
        /*
            r7 = this;
            X.0UF r0 = r7.A02
            X.0f0 r0 = r0.A04
            java.lang.String r2 = r0.A0W
            if (r2 == 0) goto L_0x0019
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x001a
            android.graphics.Path r1 = r7.A0M(r8, r9)
            if (r1 == 0) goto L_0x0019
            android.graphics.Canvas r0 = r7.A00
            r0.clipPath(r1)
        L_0x0019:
            return
        L_0x001a:
            X.0Rz r0 = r9.A01
            X.0PV r6 = r0.A04(r2)
            r4 = 1
            r2 = 0
            if (r6 != 0) goto L_0x0034
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.0UF r0 = r7.A02
            X.0f0 r0 = r0.A04
            java.lang.String r0 = r0.A0W
            r1[r2] = r0
            java.lang.String r0 = "ClipPath reference '%s' not found"
            A0I(r0, r1)
            return
        L_0x0034:
            X.0Hs r6 = (X.C03230Hs) r6
            java.util.List r0 = r6.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0044
            android.graphics.Canvas r0 = r7.A00
            r0.clipRect(r2, r2, r2, r2)
            return
        L_0x0044:
            java.lang.Boolean r0 = r6.A00
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            r1 = 1
        L_0x0050:
            boolean r0 = r9 instanceof X.C03260Hv
            if (r0 == 0) goto L_0x006a
            if (r1 != 0) goto L_0x006a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r9.A00()
            r1[r2] = r0
            java.lang.String r0 = "<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "SVGAndroidRenderer"
            android.util.Log.w(r0, r1)
            return
        L_0x006a:
            android.graphics.Canvas r5 = r7.A00
            r5.save()
            X.0UF r0 = A0B(r7)
            r7.A02 = r0
            if (r1 != 0) goto L_0x008c
            android.graphics.Matrix r2 = X.AnonymousClass000.A0H()
            float r1 = r8.A01
            float r0 = r8.A02
            r2.preTranslate(r1, r0)
            float r1 = r8.A03
            float r0 = r8.A00
            r2.preScale(r1, r0)
            r5.concat(r2)
        L_0x008c:
            android.graphics.Matrix r0 = r6.A00
            if (r0 == 0) goto L_0x0093
            r5.concat(r0)
        L_0x0093:
            X.0UF r0 = A0A(r6, r7)
            r7.A02 = r0
            X.0UX r0 = r6.A00
            r7.A0e(r0, r6)
            android.graphics.Path r3 = X.AnonymousClass000.A0I()
            java.util.List r0 = r6.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x00a8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r1 = r2.next()
            X.0PV r1 = (X.AnonymousClass0PV) r1
            android.graphics.Matrix r0 = X.AnonymousClass000.A0H()
            r7.A0Z(r0, r3, r1, r4)
            goto L_0x00a8
        L_0x00bc:
            r5.clipPath(r3)
            r5.restore()
            A0H(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0e(X.0UX, X.0IK):void");
    }

    public final void A0f(C03300Hz r5, String str) {
        Object[] objArr;
        String str2;
        AnonymousClass0PV A042 = r5.A01.A04(str);
        if (A042 == null) {
            Log.w("SVGAndroidRenderer", String.format("Gradient reference '%s' not found", new Object[]{str}));
            return;
        }
        if (!(A042 instanceof C03300Hz)) {
            objArr = new Object[0];
            str2 = "Gradient href attributes must point to other gradient elements";
        } else if (A042 == r5) {
            objArr = new Object[]{str};
            str2 = "Circular reference in gradient href attribute '%s'";
        } else {
            C03300Hz r2 = (C03300Hz) A042;
            if (r5.A02 == null) {
                r5.A02 = r2.A02;
            }
            if (r5.A00 == null) {
                r5.A00 = r2.A00;
            }
            if (r5.A01 == null) {
                r5.A01 = r2.A01;
            }
            if (r5.A04.isEmpty()) {
                r5.A04 = r2.A04;
            }
            try {
                if (r5 instanceof C03120Hh) {
                    C03120Hh r1 = (C03120Hh) r5;
                    C03120Hh r3 = (C03120Hh) A042;
                    if (r1.A00 == null) {
                        r1.A00 = r3.A00;
                    }
                    if (r1.A02 == null) {
                        r1.A02 = r3.A02;
                    }
                    if (r1.A01 == null) {
                        r1.A01 = r3.A01;
                    }
                    if (r1.A03 == null) {
                        r1.A03 = r3.A03;
                    }
                } else {
                    C03130Hi r12 = (C03130Hi) r5;
                    C03130Hi r32 = (C03130Hi) A042;
                    if (r12.A00 == null) {
                        r12.A00 = r32.A00;
                    }
                    if (r12.A01 == null) {
                        r12.A01 = r32.A01;
                    }
                    if (r12.A04 == null) {
                        r12.A04 = r32.A04;
                    }
                    if (r12.A02 == null) {
                        r12.A02 = r32.A02;
                    }
                    if (r12.A03 == null) {
                        r12.A03 = r32.A03;
                    }
                }
            } catch (ClassCastException unused) {
            }
            String str3 = r2.A03;
            if (str3 != null) {
                A0f(r5, str3);
                return;
            }
            return;
        }
        A0I(str2, objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0g(X.C03280Hx r25) {
        /*
            r24 = this;
            r8 = r25
            r1 = r24
            X.0UF r0 = r1.A02
            X.0f0 r2 = r0.A04
            java.lang.String r4 = r2.A0Z
            if (r4 != 0) goto L_0x0015
            java.lang.String r0 = r2.A0Y
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = r2.A0X
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            java.lang.String r6 = "Marker reference '%s' not found"
            r16 = 0
            r2 = 0
            r3 = 1
            if (r4 == 0) goto L_0x01cb
            X.0Rz r0 = r8.A01
            X.0PV r7 = r0.A04(r4)
            if (r7 == 0) goto L_0x01be
            X.0I9 r7 = (X.AnonymousClass0I9) r7
        L_0x0027:
            X.0UF r0 = r1.A02
            X.0f0 r0 = r0.A04
            java.lang.String r4 = r0.A0Y
            if (r4 == 0) goto L_0x01ba
            X.0Rz r0 = r8.A01
            X.0PV r5 = r0.A04(r4)
            if (r5 == 0) goto L_0x01ad
            X.0I9 r5 = (X.AnonymousClass0I9) r5
        L_0x0039:
            X.0UF r0 = r1.A02
            X.0f0 r0 = r0.A04
            java.lang.String r4 = r0.A0X
            if (r4 == 0) goto L_0x01a9
            X.0Rz r0 = r8.A01
            X.0PV r4 = r0.A04(r4)
            if (r4 == 0) goto L_0x019c
            X.0I9 r4 = (X.AnonymousClass0I9) r4
        L_0x004b:
            boolean r0 = r8 instanceof X.C03140Hj
            if (r0 == 0) goto L_0x00db
            X.0Hj r8 = (X.C03140Hj) r8
            X.0eD r6 = r8.A00
            X.0eC r0 = new X.0eC
            r0.<init>(r6, r1)
            java.util.List r0 = r0.A04
        L_0x005a:
            int r8 = r0.size()
            if (r8 == 0) goto L_0x0014
            X.0UF r6 = r1.A02
            X.0f0 r9 = r6.A04
            r6 = r16
            r9.A0X = r6
            r9.A0Y = r6
            r9.A0Z = r6
            if (r7 == 0) goto L_0x0077
            java.lang.Object r6 = r0.get(r2)
            X.0Rd r6 = (X.C05410Rd) r6
            r1.A0h(r7, r6)
        L_0x0077:
            if (r5 == 0) goto L_0x01cf
            int r7 = r0.size()
            r6 = 2
            if (r7 <= r6) goto L_0x01cf
            java.lang.Object r13 = r0.get(r2)
            X.0Rd r13 = (X.C05410Rd) r13
            java.lang.Object r9 = r0.get(r3)
            X.0Rd r9 = (X.C05410Rd) r9
            r7 = 1
        L_0x008d:
            int r2 = r8 + -1
            if (r7 >= r2) goto L_0x01cf
            int r7 = r7 + 1
            java.lang.Object r6 = r0.get(r7)
            X.0Rd r6 = (X.C05410Rd) r6
            boolean r2 = r9.A04
            if (r2 == 0) goto L_0x00ce
            float r11 = r9.A00
            float r10 = r9.A01
            float r15 = r9.A02
            float r2 = r13.A02
            float r12 = r15 - r2
            float r14 = r9.A03
            float r2 = r13.A03
            float r2 = r14 - r2
            float r12 = r12 * r11
            float r2 = r2 * r10
            float r12 = r12 + r2
            r13 = 0
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00be
            float r12 = r6.A02
            float r12 = r12 - r15
            float r2 = r6.A03
            float r2 = r2 - r14
            float r12 = r12 * r11
            float r2 = r2 * r10
            float r12 = r12 + r2
        L_0x00be:
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x00ce
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00d4
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x00ce
            int r2 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00d4
        L_0x00ce:
            r13 = r9
            r1.A0h(r5, r9)
            r9 = r6
            goto L_0x008d
        L_0x00d4:
            float r2 = -r11
            r9.A00 = r2
            float r2 = -r10
            r9.A01 = r2
            goto L_0x00ce
        L_0x00db:
            boolean r0 = r8 instanceof X.C03180Hn
            if (r0 == 0) goto L_0x011e
            X.0Hn r8 = (X.C03180Hn) r8
            X.0f1 r0 = r8.A00
            float r10 = A01(r0, r1)
            X.0f1 r0 = r8.A02
            float r11 = A00(r0, r1)
            X.0f1 r0 = r8.A01
            float r19 = A01(r0, r1)
            X.0f1 r0 = r8.A03
            float r20 = A00(r0, r1)
            r6 = 2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            float r12 = r19 - r10
            float r13 = r20 - r11
            X.0Rd r8 = new X.0Rd
            r9 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r0.add(r8)
            X.0Rd r6 = new X.0Rd
            r17 = r6
            r18 = r1
            r21 = r12
            r22 = r13
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x0119:
            r0.add(r6)
            goto L_0x005a
        L_0x011e:
            X.0Hk r8 = (X.C03150Hk) r8
            float[] r11 = r8.A00
            int r0 = r11.length
            r23 = r0
            r10 = 2
            if (r0 < r10) goto L_0x0014
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r14 = r11[r2]
            r9 = r11[r3]
            r21 = 0
            X.0Rd r6 = new X.0Rd
            r22 = 0
            r19 = r14
            r20 = r9
            r17 = r6
            r18 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            r13 = 0
            r12 = 0
        L_0x0143:
            r15 = r23
            if (r10 >= r15) goto L_0x0169
            r13 = r11[r10]
            int r12 = r10 + 1
            r12 = r11[r12]
            r6.A00(r13, r12)
            r0.add(r6)
            float r15 = r6.A02
            float r21 = r13 - r15
            float r6 = r6.A03
            float r22 = r12 - r6
            X.0Rd r6 = new X.0Rd
            r19 = r13
            r20 = r12
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            int r10 = r10 + 2
            goto L_0x0143
        L_0x0169:
            boolean r8 = r8 instanceof X.C03240Ht
            if (r8 == 0) goto L_0x0119
            int r8 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x005a
            int r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x005a
            r6.A00(r14, r9)
            r0.add(r6)
            float r8 = r6.A02
            float r12 = r14 - r8
            float r6 = r6.A03
            float r13 = r9 - r6
            X.0Rd r8 = new X.0Rd
            r10 = r14
            r11 = r9
            r9 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Object r6 = r0.get(r2)
            X.0Rd r6 = (X.C05410Rd) r6
            r8.A01(r6)
            r0.add(r8)
            r0.set(r2, r8)
            goto L_0x005a
        L_0x019c:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.0UF r0 = r1.A02
            X.0f0 r0 = r0.A04
            java.lang.String r0 = r0.A0X
            r4[r2] = r0
            A0I(r6, r4)
        L_0x01a9:
            r4 = r16
            goto L_0x004b
        L_0x01ad:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.0UF r0 = r1.A02
            X.0f0 r0 = r0.A04
            java.lang.String r0 = r0.A0Y
            r4[r2] = r0
            A0I(r6, r4)
        L_0x01ba:
            r5 = r16
            goto L_0x0039
        L_0x01be:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.0UF r0 = r1.A02
            X.0f0 r0 = r0.A04
            java.lang.String r0 = r0.A0Z
            r4[r2] = r0
            A0I(r6, r4)
        L_0x01cb:
            r7 = r16
            goto L_0x0027
        L_0x01cf:
            if (r4 == 0) goto L_0x0014
            int r8 = r8 - r3
            java.lang.Object r0 = r0.get(r8)
            X.0Rd r0 = (X.C05410Rd) r0
            r1.A0h(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0g(X.0Hx):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        if (r9 != 8) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0h(X.AnonymousClass0I9 r14, X.C05410Rd r15) {
        /*
            r13 = this;
            r13.A0W()
            java.lang.Float r0 = r14.A04
            r4 = 0
            if (r0 == 0) goto L_0x012b
            float r3 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L_0x002b
            float r1 = r15.A00
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            float r0 = r15.A01
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x012b
        L_0x001e:
            float r0 = r15.A01
            double r2 = (double) r0
            double r0 = (double) r1
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = java.lang.Math.toDegrees(r0)
            float r3 = (float) r0
        L_0x002b:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x011f
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0031:
            X.0UF r0 = A0A(r14, r13)
            r13.A02 = r0
            android.graphics.Matrix r5 = X.AnonymousClass000.A0H()
            float r1 = r15.A02
            float r0 = r15.A03
            r5.preTranslate(r1, r0)
            r5.preRotate(r3)
            r5.preScale(r2, r2)
            X.0f1 r0 = r14.A02
            float r10 = A01(r0, r13)
            X.0f1 r0 = r14.A03
            float r8 = A00(r0, r13)
            X.0f1 r0 = r14.A01
            r3 = 1077936128(0x40400000, float:3.0)
            if (r0 == 0) goto L_0x011b
            float r2 = r0.A02(r13)
        L_0x005e:
            X.0f1 r0 = r14.A00
            if (r0 == 0) goto L_0x0066
            float r3 = r0.A03(r13)
        L_0x0066:
            X.0UX r1 = r14.A00
            if (r1 == 0) goto L_0x0101
            float r0 = r1.A03
            float r7 = r2 / r0
            float r0 = r1.A00
            float r6 = r3 / r0
            X.0Uo r9 = r14.A00
            if (r9 != 0) goto L_0x0078
            X.0Uo r9 = X.C06170Uo.A02
        L_0x0078:
            X.0Uo r0 = X.C06170Uo.A03
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x008b
            X.0Jd r1 = r9.A01
            X.0Jd r0 = X.C03600Jd.slice
            if (r1 != r0) goto L_0x00fc
            float r6 = java.lang.Math.max(r7, r6)
        L_0x008a:
            r7 = r6
        L_0x008b:
            float r1 = -r10
            float r1 = r1 * r7
            float r0 = -r8
            float r0 = r0 * r6
            r5.preTranslate(r1, r0)
            android.graphics.Canvas r1 = r13.A00
            r1.concat(r5)
            X.0UX r0 = r14.A00
            float r12 = r0.A03
            float r12 = r12 * r7
            float r10 = r0.A00
            float r10 = r10 * r6
            int[] r8 = X.AnonymousClass0N2.A00
            X.0KG r0 = r9.A00
            int r0 = r0.ordinal()
            r9 = r8[r0]
            r11 = 1073741824(0x40000000, float:2.0)
            switch(r0) {
                case 2: goto L_0x00f3;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00f3;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00ae;
                case 8: goto L_0x00f3;
                case 9: goto L_0x00f7;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            r8 = 0
        L_0x00af:
            r0 = 2
            if (r9 == r0) goto L_0x00eb
            r0 = 3
            if (r9 == r0) goto L_0x00ef
            r0 = 5
            if (r9 == r0) goto L_0x00eb
            r0 = 6
            if (r9 == r0) goto L_0x00ef
            r0 = 7
            if (r9 == r0) goto L_0x00eb
            r0 = 8
            if (r9 == r0) goto L_0x00ef
        L_0x00c2:
            X.0UF r0 = r13.A02
            X.0f0 r0 = r0.A04
            java.lang.Boolean r0 = r0.A0M
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d1
            r13.A0Y(r8, r4, r2, r3)
        L_0x00d1:
            r5.reset()
            r5.preScale(r7, r6)
            r1.concat(r5)
        L_0x00da:
            boolean r1 = r13.A0v()
            r0 = 0
            r13.A0l(r14, r0)
            if (r1 == 0) goto L_0x00e7
            r13.A0n(r14)
        L_0x00e7:
            r13.A0V()
            return
        L_0x00eb:
            float r0 = r3 - r10
            float r0 = r0 / r11
            goto L_0x00f1
        L_0x00ef:
            float r0 = r3 - r10
        L_0x00f1:
            float r4 = r4 - r0
            goto L_0x00c2
        L_0x00f3:
            float r0 = r2 - r12
            float r0 = r0 / r11
            goto L_0x00f9
        L_0x00f7:
            float r0 = r2 - r12
        L_0x00f9:
            float r8 = r4 - r0
            goto L_0x00af
        L_0x00fc:
            float r6 = java.lang.Math.min(r7, r6)
            goto L_0x008a
        L_0x0101:
            float r1 = -r10
            float r0 = -r8
            r5.preTranslate(r1, r0)
            android.graphics.Canvas r0 = r13.A00
            r0.concat(r5)
            X.0UF r0 = r13.A02
            X.0f0 r0 = r0.A04
            java.lang.Boolean r0 = r0.A0M
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00da
            r13.A0Y(r4, r4, r2, r3)
            goto L_0x00da
        L_0x011b:
            r2 = 1077936128(0x40400000, float:3.0)
            goto L_0x005e
        L_0x011f:
            X.0UF r0 = r13.A02
            X.0f0 r0 = r0.A04
            X.0f1 r0 = r0.A05
            float r2 = r0.A00()
            goto L_0x0031
        L_0x012b:
            r3 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0h(X.0I9, X.0Rd):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.booleanValue() == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0i(X.C03270Hw r7, X.AnonymousClass0IK r8) {
        /*
            r6 = this;
            r4 = 0
            java.lang.Boolean r0 = r7.A05
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r5 = 1065353216(0x3f800000, float:1.0)
            X.0f1 r0 = r7.A01
            if (r1 == 0) goto L_0x006a
            if (r0 == 0) goto L_0x0065
            float r2 = r0.A02(r6)
        L_0x0019:
            X.0f1 r0 = r7.A00
            if (r0 == 0) goto L_0x0060
            float r3 = r0.A03(r6)
        L_0x0021:
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            r6.A0W()
            X.0UF r0 = A0A(r7, r6)
            r6.A02 = r0
            X.0f0 r1 = r0.A04
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r1.A0P = r0
            java.lang.Boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0059
            android.graphics.Canvas r2 = r6.A00
            X.0UX r0 = r8.A00
            float r1 = r0.A01
            float r0 = r0.A02
            r2.translate(r1, r0)
            X.0UX r0 = r8.A00
            float r1 = r0.A03
            float r0 = r0.A00
            r2.scale(r1, r0)
        L_0x0059:
            r6.A0l(r7, r4)
            r6.A0V()
        L_0x005f:
            return
        L_0x0060:
            X.0UX r0 = r8.A00
            float r3 = r0.A00
            goto L_0x0021
        L_0x0065:
            X.0UX r0 = r8.A00
            float r2 = r0.A03
            goto L_0x0019
        L_0x006a:
            r3 = 1067030938(0x3f99999a, float:1.2)
            if (r0 == 0) goto L_0x0084
            float r2 = r0.A04(r6, r5)
        L_0x0073:
            X.0f1 r0 = r7.A00
            if (r0 == 0) goto L_0x007b
            float r3 = r0.A04(r6, r5)
        L_0x007b:
            X.0UX r1 = r8.A00
            float r0 = r1.A03
            float r2 = r2 * r0
            float r0 = r1.A00
            float r3 = r3 * r0
            goto L_0x0021
        L_0x0084:
            r2 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0i(X.0Hw, X.0IK):void");
    }

    public final void A0j(AnonymousClass0IA r5, String str) {
        Object[] objArr;
        String str2;
        AnonymousClass0PV A042 = r5.A01.A04(str);
        if (A042 == null) {
            Log.w("SVGAndroidRenderer", String.format("Pattern reference '%s' not found", new Object[]{str}));
            return;
        }
        if (!(A042 instanceof AnonymousClass0IA)) {
            objArr = new Object[0];
            str2 = "Pattern href attributes must point to other pattern elements";
        } else if (A042 == r5) {
            objArr = new Object[]{str};
            str2 = "Circular reference in pattern href attribute '%s'";
        } else {
            AnonymousClass0IA r1 = (AnonymousClass0IA) A042;
            if (r5.A06 == null) {
                r5.A06 = r1.A06;
            }
            if (r5.A05 == null) {
                r5.A05 = r1.A05;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            if (r5.A03 == null) {
                r5.A03 = r1.A03;
            }
            if (r5.A04 == null) {
                r5.A04 = r1.A04;
            }
            if (r5.A02 == null) {
                r5.A02 = r1.A02;
            }
            if (r5.A01 == null) {
                r5.A01 = r1.A01;
            }
            if (r5.A01.isEmpty()) {
                r5.A01 = r1.A01;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            String str3 = r1.A07;
            if (str3 != null) {
                A0j(r5, str3);
                return;
            }
            return;
        }
        A0I(str2, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r4 == X.AnonymousClass0I5.A02) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r4 == X.AnonymousClass0I5.A02) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0k(X.AnonymousClass0f0 r13, X.AnonymousClass0UF r14) {
        /*
            r12 = this;
            r0 = 4096(0x1000, double:2.0237E-320)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x000e
            X.0f0 r1 = r14.A04
            X.0I5 r0 = r13.A02
            r1.A02 = r0
        L_0x000e:
            r0 = 2048(0x800, double:1.0118E-320)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x001c
            X.0f0 r1 = r14.A04
            java.lang.Float r0 = r13.A0P
            r1.A0P = r0
        L_0x001c:
            r0 = 1
            boolean r0 = A0K(r13, r0)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0038
            X.0f0 r1 = r14.A04
            X.0ez r0 = r13.A0G
            r1.A0G = r0
            X.0ez r4 = r13.A0G
            if (r4 == 0) goto L_0x0035
            X.0I5 r1 = X.AnonymousClass0I5.A02
            r0 = 1
            if (r4 != r1) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r14.A05 = r0
        L_0x0038:
            r0 = 4
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0046
            X.0f0 r1 = r14.A04
            java.lang.Float r0 = r13.A0O
            r1.A0O = r0
        L_0x0046:
            r0 = 6149(0x1805, double:3.038E-320)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0055
            X.0f0 r0 = r14.A04
            X.0ez r0 = r0.A0G
            A0G(r0, r14, r3)
        L_0x0055:
            r0 = 2
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0063
            X.0f0 r1 = r14.A04
            X.0Jf r0 = r13.A07
            r1.A07 = r0
        L_0x0063:
            r0 = 8
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x007d
            X.0f0 r1 = r14.A04
            X.0ez r0 = r13.A0J
            r1.A0J = r0
            X.0ez r4 = r13.A0J
            if (r4 == 0) goto L_0x007a
            X.0I5 r1 = X.AnonymousClass0I5.A02
            r0 = 1
            if (r4 != r1) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r14.A06 = r0
        L_0x007d:
            r0 = 16
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x008b
            X.0f0 r1 = r14.A04
            java.lang.Float r0 = r13.A0T
            r1.A0T = r0
        L_0x008b:
            r0 = 6168(0x1818, double:3.0474E-320)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x009a
            X.0f0 r0 = r14.A04
            X.0ez r0 = r0.A0J
            A0G(r0, r14, r2)
        L_0x009a:
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x00ab
            X.0f0 r1 = r14.A04
            X.0Jh r0 = r13.A0F
            r1.A0F = r0
        L_0x00ab:
            r0 = 32
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x00c2
            X.0f0 r1 = r14.A04
            X.0f1 r0 = r13.A05
            r1.A05 = r0
            android.graphics.Paint r1 = r14.A01
            float r0 = r0.A01(r12)
            r1.setStrokeWidth(r0)
        L_0x00c2:
            r0 = 64
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x00d9
            X.0f0 r1 = r14.A04
            X.0Jq r0 = r13.A09
            r1.A09 = r0
            X.0Jq r0 = r13.A09
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x016a;
                case 1: goto L_0x0165;
                case 2: goto L_0x016f;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            r0 = 128(0x80, double:6.32E-322)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x00f0
            X.0f0 r1 = r14.A04
            X.0Jr r0 = r13.A0A
            r1.A0A = r0
            X.0Jr r0 = r13.A0A
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0158;
                case 1: goto L_0x0153;
                case 2: goto L_0x015d;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            r0 = 256(0x100, double:1.265E-321)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0109
            X.0f0 r1 = r14.A04
            java.lang.Float r0 = r13.A0S
            r1.A0S = r0
            android.graphics.Paint r1 = r14.A01
            java.lang.Float r0 = r13.A0S
            float r0 = r0.floatValue()
            r1.setStrokeMiter(r0)
        L_0x0109:
            r0 = 512(0x200, double:2.53E-321)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0117
            X.0f0 r1 = r14.A04
            X.0f1[] r0 = r13.A0c
            r1.A0c = r0
        L_0x0117:
            r0 = 1024(0x400, double:5.06E-321)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0125
            X.0f0 r1 = r14.A04
            X.0f1 r0 = r13.A04
            r1.A04 = r0
        L_0x0125:
            r0 = 1536(0x600, double:7.59E-321)
            boolean r0 = A0K(r13, r0)
            r9 = 0
            if (r0 == 0) goto L_0x0192
            X.0f0 r8 = r14.A04
            X.0f1[] r0 = r8.A0c
            if (r0 == 0) goto L_0x03a1
            int r10 = r0.length
            int r0 = r10 % 2
            int r7 = r10 << 1
            if (r0 != 0) goto L_0x013c
            r7 = r10
        L_0x013c:
            float[] r5 = new float[r7]
            r11 = 0
            r4 = 0
            r6 = 0
        L_0x0141:
            if (r4 >= r7) goto L_0x0178
            X.0f1[] r1 = r8.A0c
            int r0 = r4 % r10
            r0 = r1[r0]
            float r0 = r0.A01(r12)
            r5[r4] = r0
            float r6 = r6 + r0
            int r4 = r4 + 1
            goto L_0x0141
        L_0x0153:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L_0x0161
        L_0x0158:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L_0x0161
        L_0x015d:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
        L_0x0161:
            r1.setStrokeJoin(r0)
            goto L_0x00f0
        L_0x0165:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L_0x0173
        L_0x016a:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L_0x0173
        L_0x016f:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        L_0x0173:
            r1.setStrokeCap(r0)
            goto L_0x00d9
        L_0x0178:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x03a1
            X.0f1 r0 = r8.A04
            float r4 = r0.A01(r12)
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0188
            float r4 = r4 % r6
            float r4 = r4 + r6
        L_0x0188:
            android.graphics.Paint r1 = r14.A01
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r5, r4)
            r1.setPathEffect(r0)
        L_0x0192:
            r0 = 16384(0x4000, double:8.0948E-320)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x01be
            X.0UF r0 = r12.A02
            android.graphics.Paint r0 = r0.A00
            float r4 = r0.getTextSize()
            X.0f0 r1 = r14.A04
            X.0f1 r0 = r13.A03
            r1.A03 = r0
            android.graphics.Paint r1 = r14.A00
            X.0f1 r0 = r13.A03
            float r0 = r0.A04(r12, r4)
            r1.setTextSize(r0)
            android.graphics.Paint r1 = r14.A01
            X.0f1 r0 = r13.A03
            float r0 = r0.A04(r12, r4)
            r1.setTextSize(r0)
        L_0x01be:
            r0 = 8192(0x2000, double:4.0474E-320)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x01cc
            X.0f0 r1 = r14.A04
            java.util.List r0 = r13.A0b
            r1.A0b = r0
        L_0x01cc:
            r0 = 32768(0x8000, double:1.61895E-319)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x01f1
            java.lang.Integer r5 = r13.A0V
            int r1 = r5.intValue()
            r0 = -1
            r4 = 100
            if (r1 != r0) goto L_0x0383
            X.0f0 r1 = r14.A04
            java.lang.Integer r0 = r1.A0V
            int r0 = r0.intValue()
            if (r0 <= r4) goto L_0x039b
            int r0 = r0 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0V = r0
        L_0x01f1:
            r0 = 65536(0x10000, double:3.2379E-319)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0200
            X.0f0 r1 = r14.A04
            X.0Jp r0 = r13.A08
            r1.A08 = r0
        L_0x0200:
            r0 = 106496(0x1a000, double:5.2616E-319)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x022f
            X.0f0 r5 = r14.A04
            java.util.List r1 = r5.A0b
            if (r1 == 0) goto L_0x0377
            X.0Rz r0 = r12.A01
            if (r0 == 0) goto L_0x0377
            java.util.Iterator r4 = r1.iterator()
        L_0x0217:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0377
            java.lang.String r3 = X.AnonymousClass000.A0m(r4)
            java.lang.Integer r1 = r5.A0V
            X.0Jp r0 = r5.A08
            android.graphics.Typeface r1 = A07(r0, r1, r3)
            if (r1 == 0) goto L_0x0217
        L_0x022b:
            android.graphics.Paint r0 = r14.A00
            android.graphics.Paint r0 = r14.A01
        L_0x022f:
            r0 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x026f
            X.0f0 r1 = r14.A04
            X.0K6 r0 = r13.A0D
            r1.A0D = r0
            android.graphics.Paint r1 = r14.A00
            X.0K6 r0 = r13.A0D
            X.0K6 r4 = X.AnonymousClass0K6.LineThrough
            boolean r0 = X.AnonymousClass000.A1Y(r0, r4)
            r1.setStrikeThruText(r0)
            X.0K6 r0 = r13.A0D
            X.0K6 r3 = X.AnonymousClass0K6.Underline
            boolean r0 = X.AnonymousClass000.A1Y(r0, r3)
            r1.setUnderlineText(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x026f
            android.graphics.Paint r1 = r14.A01
            X.0K6 r0 = r13.A0D
            boolean r0 = X.AnonymousClass000.A1Y(r0, r4)
            r1.setStrikeThruText(r0)
            X.0K6 r0 = r13.A0D
            if (r0 != r3) goto L_0x026c
            r2 = 1
        L_0x026c:
            r1.setUnderlineText(r2)
        L_0x026f:
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0280
            X.0f0 r1 = r14.A04
            X.0Jg r0 = r13.A0E
            r1.A0E = r0
        L_0x0280:
            r0 = 262144(0x40000, double:1.295163E-318)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x028f
            X.0f0 r1 = r14.A04
            X.0Jt r0 = r13.A0C
            r1.A0C = r0
        L_0x028f:
            r0 = 524288(0x80000, double:2.590327E-318)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x029e
            X.0f0 r1 = r14.A04
            java.lang.Boolean r0 = r13.A0M
            r1.A0M = r0
        L_0x029e:
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x02ad
            X.0f0 r1 = r14.A04
            java.lang.String r0 = r13.A0Z
            r1.A0Z = r0
        L_0x02ad:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x02bc
            X.0f0 r1 = r14.A04
            java.lang.String r0 = r13.A0Y
            r1.A0Y = r0
        L_0x02bc:
            r0 = 8388608(0x800000, double:4.144523E-317)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x02cb
            X.0f0 r1 = r14.A04
            java.lang.String r0 = r13.A0X
            r1.A0X = r0
        L_0x02cb:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x02da
            X.0f0 r1 = r14.A04
            java.lang.Boolean r0 = r13.A0L
            r1.A0L = r0
        L_0x02da:
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x02e9
            X.0f0 r1 = r14.A04
            java.lang.Boolean r0 = r13.A0N
            r1.A0N = r0
        L_0x02e9:
            r0 = 1048576(0x100000, double:5.180654E-318)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x02f8
            X.0f0 r1 = r14.A04
            X.0Ol r0 = r13.A01
            r1.A01 = r0
        L_0x02f8:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0307
            X.0f0 r1 = r14.A04
            java.lang.String r0 = r13.A0W
            r1.A0W = r0
        L_0x0307:
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0316
            X.0f0 r1 = r14.A04
            X.0Jf r0 = r13.A06
            r1.A06 = r0
        L_0x0316:
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0325
            X.0f0 r1 = r14.A04
            java.lang.String r0 = r13.A0a
            r1.A0a = r0
        L_0x0325:
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0334
            X.0f0 r1 = r14.A04
            X.0ez r0 = r13.A0I
            r1.A0I = r0
        L_0x0334:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0343
            X.0f0 r1 = r14.A04
            java.lang.Float r0 = r13.A0R
            r1.A0R = r0
        L_0x0343:
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0354
            X.0f0 r1 = r14.A04
            X.0ez r0 = r13.A0K
            r1.A0K = r0
        L_0x0354:
            r0 = 17179869184(0x400000000, double:8.4879831639E-314)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0365
            X.0f0 r1 = r14.A04
            java.lang.Float r0 = r13.A0U
            r1.A0U = r0
        L_0x0365:
            r0 = 137438953472(0x2000000000, double:6.7903865311E-313)
            boolean r0 = A0K(r13, r0)
            if (r0 == 0) goto L_0x0376
            X.0f0 r1 = r14.A04
            X.0Js r0 = r13.A0B
            r1.A0B = r0
        L_0x0376:
            return
        L_0x0377:
            java.lang.Integer r3 = r5.A0V
            X.0Jp r1 = r5.A08
            java.lang.String r0 = "serif"
            android.graphics.Typeface r1 = A07(r1, r3, r0)
            goto L_0x022b
        L_0x0383:
            if (r1 != r3) goto L_0x039b
            X.0f0 r3 = r14.A04
            java.lang.Integer r0 = r3.A0V
            int r1 = r0.intValue()
            r0 = 900(0x384, float:1.261E-42)
            if (r1 >= r0) goto L_0x039b
            int r0 = r1 + 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0V = r0
            goto L_0x01f1
        L_0x039b:
            X.0f0 r0 = r14.A04
            r0.A0V = r5
            goto L_0x01f1
        L_0x03a1:
            android.graphics.Paint r0 = r14.A01
            r0.setPathEffect(r9)
            goto L_0x0192
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0k(X.0f0, X.0UF):void");
    }

    public final void A0l(C13170la r3, boolean z2) {
        if (z2) {
            this.A04.push(r3);
            this.A03.push(this.A00.getMatrix());
        }
        for (AnonymousClass0PV A0q : r3.AAc()) {
            A0q(A0q);
        }
        if (z2) {
            this.A04.pop();
            this.A03.pop();
        }
    }

    public final void A0m(AnonymousClass0IK r4) {
        AnonymousClass0ez r2 = this.A02.A04.A0G;
        if (r2 instanceof AnonymousClass0I3) {
            A0d(r4.A00, (AnonymousClass0I3) r2, true);
        }
        AnonymousClass0ez r22 = this.A02.A04.A0J;
        if (r22 instanceof AnonymousClass0I3) {
            A0d(r4.A00, (AnonymousClass0I3) r22, false);
        }
    }

    public final void A0n(AnonymousClass0IK r8) {
        if (this.A02.A04.A0a != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Canvas canvas = this.A00;
            canvas.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer((RectF) null, paint2, 31);
            C03270Hw r3 = (C03270Hw) this.A01.A04(this.A02.A04.A0a);
            A0i(r3, r8);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.saveLayer((RectF) null, paint3, 31);
            A0i(r3, r8);
            canvas.restore();
            canvas.restore();
        }
        A0V();
    }

    public final void A0o(AnonymousClass0IK r11) {
        if (r11.A00 != null && r11.A00 != null) {
            Matrix A0H = AnonymousClass000.A0H();
            if (((Matrix) this.A03.peek()).invert(A0H)) {
                AnonymousClass0UX r3 = r11.A00;
                float f2 = r3.A01;
                float f3 = r3.A02;
                float f4 = f2 + r3.A03;
                int i2 = 2;
                float f5 = f3 + r3.A00;
                float[] fArr = {f2, f3, f4, f3, f4, f5, f2, f5};
                A0H.preConcat(this.A00.getMatrix());
                A0H.mapPoints(fArr);
                float f6 = fArr[0];
                float f7 = fArr[1];
                RectF rectF = new RectF(f6, f7, f6, f7);
                do {
                    if (fArr[i2] < rectF.left) {
                        rectF.left = fArr[i2];
                    }
                    if (fArr[i2] > rectF.right) {
                        rectF.right = fArr[i2];
                    }
                    int i3 = i2 + 1;
                    if (fArr[i3] < rectF.top) {
                        rectF.top = fArr[i3];
                    }
                    if (fArr[i3] > rectF.bottom) {
                        rectF.bottom = fArr[i3];
                    }
                    i2 += 2;
                } while (i2 <= 6);
                AnonymousClass0IK r5 = (AnonymousClass0IK) this.A04.peek();
                AnonymousClass0UX r32 = r5.A00;
                float f8 = rectF.left;
                if (r32 == null) {
                    float f9 = rectF.top;
                    r5.A00 = new AnonymousClass0UX(f8, f9, rectF.right - f8, rectF.bottom - f9);
                    return;
                }
                float f10 = rectF.top;
                AnonymousClass0UX r52 = new AnonymousClass0UX(f8, f10, rectF.right - f8, rectF.bottom - f10);
                float f11 = r52.A01;
                float f12 = r32.A01;
                if (f11 < f12) {
                    r32.A01 = f11;
                    f12 = f11;
                }
                float f13 = r52.A02;
                float f14 = r32.A02;
                if (f13 < f14) {
                    r32.A02 = f13;
                    f14 = f13;
                }
                float f15 = r52.A01 + r52.A03;
                if (f15 > r32.A03 + f12) {
                    r32.A03 = f15 - f12;
                }
                float f16 = r52.A02 + r52.A00;
                if (f16 > r32.A00 + f14) {
                    r32.A00 = f16 - f14;
                }
            }
        }
    }

    public final void A0p(AnonymousClass0IL r5, AnonymousClass0UF r6) {
        boolean A1W = AnonymousClass000.A1W(r5.A00);
        AnonymousClass0f0 r3 = r6.A04;
        Boolean bool = Boolean.TRUE;
        r3.A0L = bool;
        if (!A1W) {
            bool = Boolean.FALSE;
        }
        r3.A0M = bool;
        r3.A01 = null;
        r3.A0W = null;
        Float valueOf = Float.valueOf(1.0f);
        r3.A0P = valueOf;
        r3.A0I = AnonymousClass0I5.A01;
        r3.A0R = valueOf;
        r3.A0a = null;
        r3.A0H = null;
        r3.A0Q = valueOf;
        r3.A0K = null;
        r3.A0U = valueOf;
        r3.A0F = C03640Jh.None;
        AnonymousClass0f0 r0 = r5.A00;
        if (r0 != null) {
            A0k(r0, r6);
        }
        List list = this.A01.A00.A00;
        if (list != null && !list.isEmpty()) {
            for (C05090Pf r2 : this.A01.A00.A00) {
                if (AnonymousClass0XF.A02((C04000Ks) null, r2.A00, r5)) {
                    A0k(r2.A02, r6);
                }
            }
        }
        AnonymousClass0f0 r02 = r5.A01;
        if (r02 != null) {
            A0k(r02, r6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0270, code lost:
        if (r8 != false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c9, code lost:
        if (r7 == false) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x025e, code lost:
        if (r1 != false) goto L_0x0272;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0q(X.AnonymousClass0PV r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C12160jw
            if (r0 != 0) goto L_0x0036
            r11.A0W()
            boolean r0 = r12 instanceof X.AnonymousClass0IL
            if (r0 == 0) goto L_0x001a
            r0 = r12
            X.0IL r0 = (X.AnonymousClass0IL) r0
            java.lang.Boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001a
            X.0UF r1 = r11.A02
            boolean r0 = r0.booleanValue()
            r1.A07 = r0
        L_0x001a:
            boolean r0 = r12 instanceof X.AnonymousClass0I6
            if (r0 == 0) goto L_0x0037
            X.0I6 r12 = (X.AnonymousClass0I6) r12
            X.0f1 r3 = r12.A02
            X.0f1 r2 = r12.A03
            X.0f1 r1 = r12.A01
            X.0f1 r0 = r12.A00
            X.0UX r2 = r11.A0S(r3, r2, r1, r0)
            X.0UX r1 = r12.A00
            X.0Uo r0 = r12.A00
            r11.A0c(r0, r2, r1, r12)
        L_0x0033:
            r11.A0V()
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r12 instanceof X.C03210Hq
            if (r0 == 0) goto L_0x0144
            X.0Hq r12 = (X.C03210Hq) r12
            r2 = 0
            X.0f1 r0 = r12.A01
            if (r0 == 0) goto L_0x004a
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            goto L_0x0033
        L_0x004a:
            X.0f1 r0 = r12.A00
            if (r0 == 0) goto L_0x0056
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
            goto L_0x0033
        L_0x0056:
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            X.0Rz r1 = r12.A01
            java.lang.String r0 = r12.A04
            X.0PV r3 = r1.A04(r0)
            if (r3 != 0) goto L_0x0073
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r12.A04
            r1[r2] = r0
            java.lang.String r0 = "Use reference '%s' not found"
            A0I(r0, r1)
            goto L_0x0033
        L_0x0073:
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            X.0f1 r0 = r12.A02
            r2 = 0
            float r1 = A01(r0, r11)
            X.0f1 r0 = r12.A03
            if (r0 == 0) goto L_0x0087
            float r2 = r0.A03(r11)
        L_0x0087:
            android.graphics.Canvas r4 = r11.A00
            r4.translate(r1, r2)
            X.0UX r0 = r12.A00
            r11.A0e(r0, r12)
            boolean r7 = r11.A0v()
            java.util.Stack r0 = r11.A04
            r0.push(r12)
            java.util.Stack r1 = r11.A03
            android.graphics.Matrix r0 = r4.getMatrix()
            r1.push(r0)
            boolean r0 = r3 instanceof X.AnonymousClass0I6
            r6 = 0
            if (r0 == 0) goto L_0x00cd
            X.0I6 r3 = (X.AnonymousClass0I6) r3
            X.0f1 r1 = r12.A01
            X.0f1 r0 = r12.A00
            X.0UX r2 = r11.A0S(r6, r6, r1, r0)
            r11.A0W()
            X.0UX r1 = r3.A00
            X.0Uo r0 = r3.A00
            r11.A0c(r0, r2, r1, r3)
        L_0x00bc:
            r11.A0V()
        L_0x00bf:
            java.util.Stack r0 = r11.A04
            r0.pop()
            java.util.Stack r0 = r11.A03
            r0.pop()
            if (r7 == 0) goto L_0x0275
            goto L_0x0272
        L_0x00cd:
            boolean r0 = r3 instanceof X.AnonymousClass0I7
            if (r0 == 0) goto L_0x013f
            X.0f1 r5 = r12.A01
            r2 = 1120403456(0x42c80000, float:100.0)
            if (r5 != 0) goto L_0x00de
            X.0Ju r0 = X.C03770Ju.percent
            X.0f1 r5 = new X.0f1
            r5.<init>(r0, r2)
        L_0x00de:
            X.0f1 r1 = r12.A00
            if (r1 != 0) goto L_0x00e9
            X.0Ju r0 = X.C03770Ju.percent
            X.0f1 r1 = new X.0f1
            r1.<init>(r0, r2)
        L_0x00e9:
            X.0UX r5 = r11.A0S(r6, r6, r5, r1)
            r11.A0W()
            X.0IB r3 = (X.AnonymousClass0IB) r3
            float r0 = r5.A03
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            float r0 = r5.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            X.0Uo r2 = r3.A00
            if (r2 != 0) goto L_0x0105
            X.0Uo r2 = X.C06170Uo.A02
        L_0x0105:
            X.0UF r0 = r11.A02
            r11.A0p(r3, r0)
            X.0UF r0 = r11.A02
            r0.A03 = r5
            A0E(r5, r0, r11)
            X.0UX r1 = r3.A00
            X.0UF r0 = r11.A02
            X.0UX r0 = r0.A03
            if (r1 == 0) goto L_0x0137
            android.graphics.Matrix r0 = A05(r2, r0, r1)
            r4.concat(r0)
            X.0UF r1 = r11.A02
            X.0UX r0 = r3.A00
            r1.A02 = r0
        L_0x0126:
            boolean r1 = r11.A0v()
            r0 = 1
            r11.A0l(r3, r0)
            if (r1 == 0) goto L_0x0133
            r11.A0n(r3)
        L_0x0133:
            r11.A0o(r3)
            goto L_0x00bc
        L_0x0137:
            float r1 = r0.A01
            float r0 = r0.A02
            r4.translate(r1, r0)
            goto L_0x0126
        L_0x013f:
            r11.A0q(r3)
            goto L_0x00bf
        L_0x0144:
            boolean r0 = r12 instanceof X.C03200Hp
            if (r0 == 0) goto L_0x0240
            X.0Hv r12 = (X.C03260Hv) r12
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            X.0UX r0 = r12.A00
            r11.A0e(r0, r12)
            boolean r8 = r11.A0v()
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r4 = r0.getLanguage()
            java.util.List r0 = r12.A01
            java.util.Iterator r7 = r0.iterator()
        L_0x016c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0270
            java.lang.Object r3 = r7.next()
            X.0PV r3 = (X.AnonymousClass0PV) r3
            boolean r0 = r3 instanceof X.C13380lw
            if (r0 == 0) goto L_0x016c
            r2 = r3
            X.0lw r2 = (X.C13380lw) r2
            java.lang.String r0 = r2.AFT()
            if (r0 != 0) goto L_0x016c
            java.util.Set r1 = r2.AGP()
            if (r1 == 0) goto L_0x0198
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x016c
            boolean r0 = r1.contains(r4)
            if (r0 != 0) goto L_0x0198
            goto L_0x016c
        L_0x0198:
            java.util.Set r5 = r2.AFU()
            if (r5 == 0) goto L_0x0261
            java.util.HashSet r0 = A06
            if (r0 != 0) goto L_0x0230
            java.lang.Class<X.0XJ> r6 = X.AnonymousClass0XJ.class
            monitor-enter(r6)
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0647 }
            r1.<init>()     // Catch:{ all -> 0x0647 }
            A06 = r1     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "Structure"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "BasicStructure"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "ConditionalProcessing"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "Image"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "Style"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "ViewportAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "Shape"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "BasicText"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "PaintAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "BasicPaintAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "OpacityAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "BasicGraphicsAttribute"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "Marker"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "Gradient"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "Pattern"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "Clip"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "BasicClip"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "Mask"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "View"
            r1.add(r0)     // Catch:{ all -> 0x0647 }
            monitor-exit(r6)
        L_0x0230:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x016c
            java.util.HashSet r0 = A06
            boolean r0 = r0.containsAll(r5)
            if (r0 != 0) goto L_0x0261
            goto L_0x016c
        L_0x0240:
            boolean r0 = r12 instanceof X.C03260Hv
            if (r0 == 0) goto L_0x027f
            X.0Hv r12 = (X.C03260Hv) r12
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            X.0UX r0 = r12.A00
            r11.A0e(r0, r12)
            boolean r1 = r11.A0v()
            r0 = 1
            r11.A0l(r12, r0)
            if (r1 == 0) goto L_0x0275
            goto L_0x0272
        L_0x0261:
            java.util.Set r0 = r2.AFW()
            if (r0 != 0) goto L_0x027a
            java.util.Set r0 = r2.AFV()
            if (r0 != 0) goto L_0x027a
            r11.A0q(r3)
        L_0x0270:
            if (r8 == 0) goto L_0x0275
        L_0x0272:
            r11.A0n(r12)
        L_0x0275:
            r11.A0o(r12)
            goto L_0x0033
        L_0x027a:
            r0.isEmpty()
            goto L_0x016c
        L_0x027f:
            boolean r0 = r12 instanceof X.AnonymousClass0IC
            if (r0 == 0) goto L_0x0368
            X.0IC r12 = (X.AnonymousClass0IC) r12
            r6 = 0
            X.0f1 r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            float r0 = r0.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            X.0f1 r0 = r12.A01
            if (r0 == 0) goto L_0x0033
            float r0 = r0.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            java.lang.String r3 = r12.A05
            if (r3 == 0) goto L_0x0033
            X.0Uo r8 = r12.A00
            if (r8 != 0) goto L_0x02a5
            X.0Uo r8 = X.C06170Uo.A02
        L_0x02a5:
            java.lang.String r0 = "data:"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0033
            int r1 = r3.length()
            r0 = 14
            if (r1 < r0) goto L_0x0033
            r0 = 44
            int r2 = r3.indexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0033
            r0 = 12
            if (r2 < r0) goto L_0x0033
            int r0 = r2 + -7
            java.lang.String r1 = r3.substring(r0, r2)
            java.lang.String r0 = ";base64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0033
            int r0 = r2 + 1
            java.lang.String r0 = r3.substring(r0)
            byte[] r1 = android.util.Base64.decode(r0, r6)
            int r0 = r1.length
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r1, r6, r0)
            if (r5 == 0) goto L_0x0033
            int r0 = r5.getWidth()
            float r1 = (float) r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            r4 = 0
            X.0UX r7 = new X.0UX
            r7.<init>(r4, r4, r1, r0)
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0w()
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            X.0f1 r0 = r12.A03
            float r10 = A01(r0, r11)
            X.0f1 r0 = r12.A04
            float r9 = A00(r0, r11)
            X.0f1 r0 = r12.A02
            float r3 = r0.A02(r11)
            X.0f1 r0 = r12.A01
            float r2 = r0.A02(r11)
            X.0UF r1 = r11.A02
            X.0UX r0 = new X.0UX
            r0.<init>(r10, r9, r3, r2)
            r1.A03 = r0
            A0E(r0, r1, r11)
            X.0UF r0 = r11.A02
            X.0UX r0 = r0.A03
            r12.A00 = r0
            r11.A0o(r12)
            X.0UX r0 = r12.A00
            r11.A0e(r0, r12)
            boolean r3 = r11.A0v()
            r11.A0X()
            android.graphics.Canvas r2 = r11.A00
            r2.save()
            X.0UF r0 = r11.A02
            X.0UX r0 = r0.A03
            android.graphics.Matrix r0 = A05(r8, r0, r7)
            r2.concat(r0)
            X.0UF r0 = r11.A02
            X.0f0 r0 = r0.A04
            X.0Js r1 = r0.A0B
            X.0Js r0 = X.C03750Js.optimizeSpeed
            if (r1 == r0) goto L_0x0356
            r6 = 2
        L_0x0356:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r6)
            r2.drawBitmap(r5, r4, r4, r0)
            r2.restore()
            if (r3 == 0) goto L_0x0033
            r11.A0n(r12)
            goto L_0x0033
        L_0x0368:
            boolean r0 = r12 instanceof X.C03140Hj
            if (r0 == 0) goto L_0x03d9
            X.0Hj r12 = (X.C03140Hj) r12
            X.0eD r0 = r12.A00
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0w()
            if (r0 == 0) goto L_0x0033
            X.0UF r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x038a
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x038a
            goto L_0x0033
        L_0x038a:
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            X.0eD r1 = r12.A00
            X.0eB r0 = new X.0eB
            r0.<init>(r1, r11)
            android.graphics.Path r3 = r0.A02
            X.0UX r0 = r12.A00
            if (r0 != 0) goto L_0x03a2
            X.0UX r0 = A08(r3)
            r12.A00 = r0
        L_0x03a2:
            r11.A0o(r12)
            r11.A0m(r12)
            X.0UX r0 = r12.A00
            r11.A0e(r0, r12)
            boolean r2 = r11.A0v()
            X.0UF r1 = r11.A02
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x03c9
            X.0f0 r0 = r1.A04
            X.0Jf r1 = r0.A07
            if (r1 == 0) goto L_0x03d6
            X.0Jf r0 = X.C03620Jf.EvenOdd
            if (r1 != r0) goto L_0x03d6
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x03c3:
            r3.setFillType(r0)
            r11.A0b(r3, r12)
        L_0x03c9:
            A0D(r3, r11)
            r11.A0g(r12)
            if (r2 == 0) goto L_0x0033
            r11.A0n(r12)
            goto L_0x0033
        L_0x03d6:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x03c3
        L_0x03d9:
            boolean r0 = r12 instanceof X.C03190Ho
            if (r0 == 0) goto L_0x041a
            X.0Ho r12 = (X.C03190Ho) r12
            X.0f1 r0 = r12.A03
            if (r0 == 0) goto L_0x0033
            X.0f1 r2 = r12.A00
            if (r2 == 0) goto L_0x0033
            float r0 = r0.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0w()
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            android.graphics.Path r1 = r11.A0Q(r12)
            r11.A0o(r12)
            boolean r0 = A0J(r1, r12, r11)
            A0D(r1, r11)
            if (r0 == 0) goto L_0x0033
            r11.A0n(r12)
            goto L_0x0033
        L_0x041a:
            boolean r0 = r12 instanceof X.C03160Hl
            if (r0 == 0) goto L_0x0451
            X.0Hl r12 = (X.C03160Hl) r12
            X.0f1 r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0w()
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            android.graphics.Path r1 = r11.A0N(r12)
            r11.A0o(r12)
            boolean r0 = A0J(r1, r12, r11)
            A0D(r1, r11)
            if (r0 == 0) goto L_0x0033
            r11.A0n(r12)
            goto L_0x0033
        L_0x0451:
            boolean r0 = r12 instanceof X.C03170Hm
            if (r0 == 0) goto L_0x0492
            X.0Hm r12 = (X.C03170Hm) r12
            X.0f1 r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            X.0f1 r2 = r12.A03
            if (r2 == 0) goto L_0x0033
            float r0 = r0.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0w()
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            android.graphics.Path r1 = r11.A0O(r12)
            r11.A0o(r12)
            boolean r0 = A0J(r1, r12, r11)
            A0D(r1, r11)
            if (r0 == 0) goto L_0x0033
            r11.A0n(r12)
            goto L_0x0033
        L_0x0492:
            boolean r0 = r12 instanceof X.C03180Hn
            if (r0 == 0) goto L_0x051b
            X.0Hn r12 = (X.C03180Hn) r12
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0w()
            if (r0 == 0) goto L_0x0033
            X.0UF r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            X.0f1 r0 = r12.A00
            r8 = 0
            if (r0 != 0) goto L_0x0516
            r7 = 0
        L_0x04b5:
            X.0f1 r0 = r12.A02
            if (r0 != 0) goto L_0x0511
            r6 = 0
        L_0x04ba:
            X.0f1 r0 = r12.A01
            if (r0 != 0) goto L_0x050c
            r5 = 0
        L_0x04bf:
            X.0f1 r0 = r12.A03
            if (r0 == 0) goto L_0x04c7
            float r8 = r0.A03(r11)
        L_0x04c7:
            X.0UX r0 = r12.A00
            if (r0 != 0) goto L_0x04e6
            float r4 = java.lang.Math.min(r7, r5)
            float r3 = java.lang.Math.min(r6, r8)
            float r0 = r5 - r7
            float r2 = java.lang.Math.abs(r0)
            float r0 = r8 - r6
            float r1 = java.lang.Math.abs(r0)
            X.0UX r0 = new X.0UX
            r0.<init>(r4, r3, r2, r1)
            r12.A00 = r0
        L_0x04e6:
            android.graphics.Path r1 = X.AnonymousClass000.A0I()
            r1.moveTo(r7, r6)
            r1.lineTo(r5, r8)
            r11.A0o(r12)
            r11.A0m(r12)
            X.0UX r0 = r12.A00
            r11.A0e(r0, r12)
            boolean r0 = r11.A0v()
            r11.A0a(r1)
            r11.A0g(r12)
            if (r0 == 0) goto L_0x0033
            r11.A0n(r12)
            goto L_0x0033
        L_0x050c:
            float r5 = r0.A02(r11)
            goto L_0x04bf
        L_0x0511:
            float r6 = r0.A03(r11)
            goto L_0x04ba
        L_0x0516:
            float r7 = r0.A02(r11)
            goto L_0x04b5
        L_0x051b:
            boolean r0 = r12 instanceof X.C03240Ht
            if (r0 == 0) goto L_0x055c
            X.0Hk r12 = (X.C03150Hk) r12
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0w()
            if (r0 == 0) goto L_0x0033
            X.0UF r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0539
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0539
            goto L_0x0033
        L_0x0539:
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            float[] r0 = r12.A00
            int r1 = r0.length
            r0 = 2
            if (r1 < r0) goto L_0x0033
            android.graphics.Path r1 = r11.A0P(r12)
            r11.A0o(r12)
            boolean r0 = A0J(r1, r12, r11)
            A0D(r1, r11)
            r11.A0g(r12)
            if (r0 == 0) goto L_0x0033
            r11.A0n(r12)
            goto L_0x0033
        L_0x055c:
            boolean r0 = r12 instanceof X.C03150Hk
            if (r0 == 0) goto L_0x05b1
            X.0Hk r12 = (X.C03150Hk) r12
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0w()
            if (r0 == 0) goto L_0x0033
            X.0UF r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x057a
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x057a
            goto L_0x0033
        L_0x057a:
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            float[] r0 = r12.A00
            int r1 = r0.length
            r0 = 2
            if (r1 < r0) goto L_0x0033
            android.graphics.Path r2 = r11.A0P(r12)
            r11.A0o(r12)
            X.0UF r0 = r11.A02
            X.0f0 r0 = r0.A04
            X.0Jf r1 = r0.A07
            if (r1 == 0) goto L_0x05ae
            X.0Jf r0 = X.C03620Jf.EvenOdd
            if (r1 != r0) goto L_0x05ae
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x059a:
            r2.setFillType(r0)
            boolean r0 = A0J(r2, r12, r11)
            A0D(r2, r11)
            r11.A0g(r12)
            if (r0 == 0) goto L_0x0033
            r11.A0n(r12)
            goto L_0x0033
        L_0x05ae:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x059a
        L_0x05b1:
            boolean r0 = r12 instanceof X.AnonymousClass0IE
            if (r0 == 0) goto L_0x0033
            X.0IE r12 = (X.AnonymousClass0IE) r12
            r3 = 0
            boolean r0 = A0L(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0C(r0, r11)
            java.util.List r1 = r12.A02
            if (r1 == 0) goto L_0x0645
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0645
            java.util.List r0 = r12.A02
            float r2 = A03(r11, r0)
        L_0x05d3:
            java.util.List r0 = r12.A03
            if (r0 == 0) goto L_0x0643
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0643
            java.util.List r0 = r12.A03
            java.lang.Object r0 = r0.get(r3)
            X.0f1 r0 = (X.C09150f1) r0
            float r4 = r0.A03(r11)
        L_0x05e9:
            java.util.List r0 = r12.A00
            if (r0 == 0) goto L_0x0641
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0641
            java.util.List r0 = r12.A00
            float r6 = A03(r11, r0)
        L_0x05f9:
            float r5 = A02(r12, r11)
            X.0Jt r3 = r11.A0T()
            X.0Jt r0 = X.C03760Jt.Start
            if (r3 == r0) goto L_0x0617
            X.0IN r0 = new X.0IN
            r0.<init>(r11)
            r11.A0s(r12, r0)
            float r1 = r0.A00
            X.0Jt r0 = X.C03760Jt.Middle
            if (r3 != r0) goto L_0x0616
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x0616:
            float r2 = r2 - r1
        L_0x0617:
            X.0UX r0 = r12.A00
            if (r0 != 0) goto L_0x0621
            X.0UX r0 = A09(r12, r11, r2, r4)
            r12.A00 = r0
        L_0x0621:
            r11.A0o(r12)
            r11.A0m(r12)
            X.0UX r0 = r12.A00
            r11.A0e(r0, r12)
            boolean r1 = r11.A0v()
            float r2 = r2 + r6
            float r4 = r4 + r5
            X.0IO r0 = new X.0IO
            r0.<init>(r11, r2, r4)
            r11.A0s(r12, r0)
            if (r1 == 0) goto L_0x0033
            r11.A0n(r12)
            goto L_0x0033
        L_0x0641:
            r6 = 0
            goto L_0x05f9
        L_0x0643:
            r4 = 0
            goto L_0x05e9
        L_0x0645:
            r2 = 0
            goto L_0x05d3
        L_0x0647:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0q(X.0PV):void");
    }

    public final void A0r(AnonymousClass0PV r3, AnonymousClass0UF r4) {
        ArrayList A0u = AnonymousClass000.A0u();
        while (true) {
            if (r3 instanceof AnonymousClass0IL) {
                A0u.add(0, r3);
            }
            C13170la r32 = r3.A00;
            if (r32 == null) {
                break;
            }
            r3 = (AnonymousClass0PV) r32;
        }
        Iterator it = A0u.iterator();
        while (it.hasNext()) {
            A0p((AnonymousClass0IL) it.next(), r4);
        }
        AnonymousClass0UF r1 = this.A02;
        r4.A02 = r1.A02;
        r4.A03 = r1.A03;
    }

    public final void A0s(C03250Hu r12, AnonymousClass0QD r13) {
        float f2;
        float f3;
        float f4;
        C03760Jt A0T;
        if (A0u()) {
            Iterator it = r12.A01.iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                AnonymousClass0PV r1 = (AnonymousClass0PV) it.next();
                if (r1 instanceof AnonymousClass0I2) {
                    r13.A00(A0U(((AnonymousClass0I2) r1).A00, z2, !it.hasNext()));
                } else if (r13.A01((C03250Hu) r1)) {
                    if (r1 instanceof AnonymousClass0II) {
                        A0W();
                        AnonymousClass0II r14 = (AnonymousClass0II) r1;
                        if (A0L(r14, this) && A0w()) {
                            AnonymousClass0PV A042 = r14.A01.A04(r14.A02);
                            if (A042 == null) {
                                A0I("TextPath reference '%s' not found", r14.A02);
                            } else {
                                C03140Hj r3 = (C03140Hj) A042;
                                Path path = new C08720eB(r3.A00, this).A02;
                                Matrix matrix = r3.A00;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                C09150f1 r2 = r14.A00;
                                float A043 = r2 != null ? r2.A04(this, pathMeasure.getLength()) : 0.0f;
                                C03760Jt A0T2 = A0T();
                                if (A0T2 != C03760Jt.Start) {
                                    AnonymousClass0IN r0 = new AnonymousClass0IN(this);
                                    A0s(r14, r0);
                                    float f5 = r0.A00;
                                    if (A0T2 == C03760Jt.Middle) {
                                        f5 /= 2.0f;
                                    }
                                    A043 -= f5;
                                }
                                A0m(r14.A01);
                                boolean A0v = A0v();
                                A0s(r14, new AnonymousClass0IM(path, this, A043));
                                if (A0v) {
                                    A0n(r14);
                                }
                            }
                        }
                    } else {
                        boolean z3 = true;
                        if (r1 instanceof AnonymousClass0IF) {
                            A0W();
                            AnonymousClass0IF r15 = (AnonymousClass0IF) r1;
                            if (A0L(r15, this)) {
                                List list = r15.A02;
                                if (list == null || list.size() <= 0) {
                                    z3 = false;
                                }
                                boolean z4 = r13 instanceof AnonymousClass0IO;
                                float f6 = 0.0f;
                                if (z4) {
                                    f6 = !z3 ? ((AnonymousClass0IO) r13).A00 : A03(this, r15.A02);
                                    List list2 = r15.A03;
                                    f3 = (list2 == null || list2.size() == 0) ? ((AnonymousClass0IO) r13).A01 : ((C09150f1) r15.A03.get(0)).A03(this);
                                    List list3 = r15.A00;
                                    f4 = (list3 == null || list3.size() == 0) ? 0.0f : A03(this, r15.A00);
                                    f2 = A02(r15, this);
                                } else {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                    f4 = 0.0f;
                                }
                                if (z3 && (A0T = A0T()) != C03760Jt.Start) {
                                    AnonymousClass0IN r02 = new AnonymousClass0IN(this);
                                    A0s(r15, r02);
                                    float f7 = r02.A00;
                                    if (A0T == C03760Jt.Middle) {
                                        f7 /= 2.0f;
                                    }
                                    f6 -= f7;
                                }
                                A0m(r15.A00);
                                if (z4) {
                                    AnonymousClass0IO r03 = (AnonymousClass0IO) r13;
                                    r03.A00 = f6 + f4;
                                    r03.A01 = f3 + f2;
                                }
                                boolean A0v2 = A0v();
                                A0s(r15, r13);
                                if (A0v2) {
                                    A0n(r15);
                                }
                            }
                        } else if (r1 instanceof AnonymousClass0IH) {
                            A0W();
                            AnonymousClass0IH r32 = (AnonymousClass0IH) r1;
                            if (A0L(r32, this)) {
                                A0m(r32.A00);
                                AnonymousClass0PV A044 = r1.A01.A04(r32.A01);
                                if (A044 == null || !(A044 instanceof C03250Hu)) {
                                    A0I("Tref reference '%s' not found", r32.A01);
                                } else {
                                    StringBuilder A0o = AnonymousClass000.A0o();
                                    A0t((C03250Hu) A044, A0o);
                                    if (A0o.length() > 0) {
                                        r13.A00(A0o.toString());
                                    }
                                }
                            }
                        }
                    }
                    A0V();
                }
                z2 = false;
            }
        }
    }

    public final void A0t(C03250Hu r5, StringBuilder sb) {
        Iterator it = r5.A01.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            AnonymousClass0PV r1 = (AnonymousClass0PV) it.next();
            if (r1 instanceof C03250Hu) {
                A0t((C03250Hu) r1, sb);
            } else if (r1 instanceof AnonymousClass0I2) {
                sb.append(A0U(((AnonymousClass0I2) r1).A00, z2, !it.hasNext()));
            }
            z2 = false;
        }
    }

    public final boolean A0u() {
        Boolean bool = this.A02.A04.A0L;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1.A0a != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0v() {
        /*
            r5 = this;
            X.0UF r0 = r5.A02
            X.0f0 r1 = r0.A04
            java.lang.Float r0 = r1.A0P
            float r3 = r0.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            java.lang.String r1 = r1.A0a
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r4 = 0
            if (r0 != 0) goto L_0x001a
            return r4
        L_0x001a:
            android.graphics.Canvas r2 = r5.A00
            r0 = 1132462080(0x43800000, float:256.0)
            float r3 = r3 * r0
            int r1 = (int) r3
            r0 = 255(0xff, float:3.57E-43)
            if (r1 >= 0) goto L_0x005a
            r1 = 0
        L_0x0025:
            r0 = 31
            r3 = 0
            r2.saveLayerAlpha(r3, r1, r0)
            X.0UF r0 = A0B(r5)
            r5.A02 = r0
            X.0f0 r0 = r0.A04
            java.lang.String r1 = r0.A0a
            r2 = 1
            if (r1 == 0) goto L_0x0059
            X.0Rz r0 = r5.A01
            X.0PV r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0 instanceof X.C03270Hw
            if (r0 != 0) goto L_0x0059
        L_0x0044:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.0UF r0 = r5.A02
            X.0f0 r0 = r0.A04
            java.lang.String r0 = r0.A0a
            r1[r4] = r0
            java.lang.String r0 = "Mask reference '%s' not found"
            A0I(r0, r1)
            X.0UF r0 = r5.A02
            X.0f0 r0 = r0.A04
            r0.A0a = r3
        L_0x0059:
            return r2
        L_0x005a:
            if (r1 <= r0) goto L_0x0025
            r1 = 255(0xff, float:3.57E-43)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XJ.A0v():boolean");
    }

    public final boolean A0w() {
        Boolean bool = this.A02.A04.A0N;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
