package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.support.v4.view.MotionEventCompat;
import java.util.List;

/* renamed from: X.0dS  reason: invalid class name and case insensitive filesystem */
public abstract class C08330dS implements C12650kk, C13530mX, C13540mY {
    public AnonymousClass0SI A00;
    public final Paint A01;
    public final Path A02 = AnonymousClass000.A0I();
    public final Path A03 = AnonymousClass000.A0I();
    public final PathMeasure A04 = new PathMeasure();
    public final RectF A05 = AnonymousClass000.A0K();
    public final AnonymousClass0Ak A06;
    public final AnonymousClass0SI A07;
    public final AnonymousClass0SI A08;
    public final AnonymousClass0SI A09;
    public final C08360dV A0A;
    public final List A0B;
    public final List A0C = AnonymousClass000.A0u();
    public final float[] A0D;

    public C08330dS(Paint.Cap cap, Paint.Join join, AnonymousClass0Ak r7, AnonymousClass0HT r8, AnonymousClass0HT r9, AnonymousClass0HU r10, C08360dV r11, List list, float f2) {
        AnonymousClass0AR r1 = new AnonymousClass0AR(1);
        this.A01 = r1;
        this.A06 = r7;
        this.A0A = r11;
        r1.setStyle(Paint.Style.STROKE);
        r1.setStrokeCap(cap);
        r1.setStrokeJoin(join);
        r1.setStrokeMiter(f2);
        this.A08 = new AnonymousClass0HL(r10.A00);
        this.A09 = AnonymousClass0HC.A00(r8);
        this.A07 = r9 == null ? null : AnonymousClass0HC.A00(r9);
        this.A0B = AnonymousClass000.A0w(list);
        this.A0D = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.A0B.add(AnonymousClass0HC.A00((C08390dZ) list.get(i2)));
        }
        r11.A09(this.A08);
        r11.A09(this.A09);
        for (int i3 = 0; i3 < this.A0B.size(); i3++) {
            r11.A09((AnonymousClass0SI) this.A0B.get(i3));
        }
        AnonymousClass0SI r0 = this.A07;
        if (r0 != null) {
            r11.A09(r0);
        }
        AnonymousClass0SI.A04(this.A08, this);
        AnonymousClass0SI.A04(this.A09, this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            AnonymousClass0SI.A04((AnonymousClass0SI) this.A0B.get(i4), this);
        }
        AnonymousClass0SI r02 = this.A07;
        if (r02 != null) {
            AnonymousClass0SI.A04(r02, this);
        }
    }

    public void A4l(AnonymousClass0UV r3, Object obj) {
        AnonymousClass0SI r0;
        if (obj == C13480m6.A0S) {
            r0 = this.A08;
        } else if (obj == C13480m6.A0G) {
            r0 = this.A09;
        } else if (obj == C13480m6.A00) {
            AnonymousClass0SI r1 = this.A00;
            if (r1 != null) {
                this.A0A.A0O.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0HF r02 = new AnonymousClass0HF(r3, (Object) null);
            this.A00 = r02;
            AnonymousClass0SI.A04(r02, this);
            this.A0A.A09(this.A00);
            return;
        } else {
            return;
        }
        r0.A0D(r3);
    }

    public void A8F(Canvas canvas, Matrix matrix, int i2) {
        float f2;
        float[] fArr = (float[]) AnonymousClass0XD.A03.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        Matrix matrix2 = matrix;
        matrix2.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            AnonymousClass0HL r2 = (AnonymousClass0HL) this.A08;
            Paint paint = this.A01;
            int i3 = 0;
            paint.setAlpha(Math.max(0, Math.min(MotionEventCompat.ACTION_MASK, (int) ((((((float) i2) / 255.0f) * ((float) r2.A0E(AnonymousClass0NI.A00(r2), r2.A06()))) / 100.0f) * 255.0f))));
            paint.setStrokeWidth(((AnonymousClass0HM) this.A09).A0E() * AnonymousClass0XD.A02(matrix2));
            if (paint.getStrokeWidth() > 0.0f) {
                List list = this.A0B;
                if (!list.isEmpty()) {
                    float A022 = AnonymousClass0XD.A02(matrix2);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        float[] fArr2 = this.A0D;
                        float A023 = AnonymousClass0SI.A02((AnonymousClass0SI) list.get(i4));
                        fArr2[i4] = A023;
                        float f3 = 0.1f;
                        if (i4 % 2 == 0) {
                            f3 = 1.0f;
                        }
                        if (A023 < f3) {
                            fArr2[i4] = f3;
                        }
                        fArr2[i4] = fArr2[i4] * A022;
                    }
                    AnonymousClass0SI r0 = this.A07;
                    paint.setPathEffect(new DashPathEffect(this.A0D, r0 == null ? 0.0f : A022 * AnonymousClass0SI.A02(r0)));
                }
                AnonymousClass0NI.A01();
                AnonymousClass000.A13(paint, this.A00);
                while (true) {
                    List list2 = this.A0C;
                    if (i3 >= list2.size()) {
                        break;
                    }
                    AnonymousClass0O7 r9 = (AnonymousClass0O7) list2.get(i3);
                    Canvas canvas2 = canvas;
                    if (r9.A00 != null) {
                        C08240dJ r3 = r9.A00;
                        if (r3 != null) {
                            Path path = this.A02;
                            path.reset();
                            List list3 = r9.A01;
                            int size = list3.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                                AnonymousClass000.A12(matrix2, path, list3, size);
                            }
                            PathMeasure pathMeasure = this.A04;
                            pathMeasure.setPath(path, false);
                            float length = pathMeasure.getLength();
                            while (pathMeasure.nextContour()) {
                                length += pathMeasure.getLength();
                            }
                            float A024 = (AnonymousClass0SI.A02(r3.A01) * length) / 360.0f;
                            float A025 = ((AnonymousClass0SI.A02(r3.A02) * length) / 100.0f) + A024;
                            float A026 = ((AnonymousClass0SI.A02(r3.A00) * length) / 100.0f) + A024;
                            float f4 = 0.0f;
                            for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
                                Path path2 = this.A03;
                                path2.set(((C13520mW) list3.get(size2)).AEK());
                                path2.transform(matrix2);
                                pathMeasure.setPath(path2, false);
                                float length2 = pathMeasure.getLength();
                                float f5 = 1.0f;
                                if (A026 > length) {
                                    float f6 = A026 - length;
                                    if (f6 < f4 + length2 && f4 < f6) {
                                        f2 = A025 > length ? (A025 - length) / length2 : 0.0f;
                                        f5 = Math.min(f6 / length2, 1.0f);
                                        AnonymousClass0XD.A04(path2, f2, f5, 0.0f);
                                        canvas2.drawPath(path2, paint);
                                        f4 += length2;
                                    }
                                }
                                float f7 = f4 + length2;
                                if (f7 >= A025 && f4 <= A026) {
                                    if (f7 > A026 || A025 >= f4) {
                                        f2 = A025 < f4 ? 0.0f : (A025 - f4) / length2;
                                        if (A026 <= f7) {
                                            f5 = (A026 - f4) / length2;
                                        }
                                        AnonymousClass0XD.A04(path2, f2, f5, 0.0f);
                                    }
                                    canvas2.drawPath(path2, paint);
                                }
                                f4 += length2;
                            }
                        }
                    } else {
                        Path path3 = this.A02;
                        path3.reset();
                        int size3 = r9.A01.size();
                        while (true) {
                            size3--;
                            if (size3 < 0) {
                                break;
                            }
                            AnonymousClass000.A12(matrix2, path3, r9.A01, size3);
                        }
                        AnonymousClass0NI.A01();
                        canvas2.drawPath(path3, paint);
                    }
                    AnonymousClass0NI.A01();
                    i3++;
                }
            }
        }
        AnonymousClass0NI.A01();
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        Path path = this.A02;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.A0C;
            if (i2 < list.size()) {
                AnonymousClass0O7 r2 = (AnonymousClass0O7) list.get(i2);
                for (int i3 = 0; i3 < r2.A01.size(); i3++) {
                    AnonymousClass000.A12(matrix, path, r2.A01, i3);
                }
                i2++;
            } else {
                RectF rectF2 = this.A05;
                path.computeBounds(rectF2, false);
                float A0E = ((AnonymousClass0HM) this.A09).A0E() / 2.0f;
                rectF2.set(rectF2.left - A0E, rectF2.top - A0E, rectF2.right + A0E, rectF2.bottom + A0E);
                rectF.set(rectF2);
                AnonymousClass000.A14(rectF);
                AnonymousClass0NI.A01();
                return;
            }
        }
    }

    public void AZV() {
        this.A06.invalidateSelf();
    }

    public void AcW(AnonymousClass0WM r1, AnonymousClass0WM r2, List list, int i2) {
        C06560Ws.A01(this, r1, r2, list, i2);
    }

    public void Adk(List list, List list2) {
        AnonymousClass0O7 r5 = null;
        C08240dJ r6 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C13150lY r2 = (C13150lY) list.get(size);
            if (r2 instanceof C08240dJ) {
                C08240dJ r22 = (C08240dJ) r2;
                if (r22.A03 == AnonymousClass0JW.INDIVIDUALLY) {
                    r6 = r22;
                }
            }
        }
        if (r6 != null) {
            r6.A05.add(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C13150lY r3 = (C13150lY) list2.get(size2);
            if (r3 instanceof C08240dJ) {
                C08240dJ r23 = (C08240dJ) r3;
                if (r23.A03 == AnonymousClass0JW.INDIVIDUALLY) {
                    if (r5 != null) {
                        this.A0C.add(r5);
                    }
                    r5 = new AnonymousClass0O7(r23);
                    r23.A05.add(this);
                }
            }
            if (r3 instanceof C13520mW) {
                if (r5 == null) {
                    r5 = new AnonymousClass0O7(r6);
                }
                r5.A01.add(r3);
            }
        }
        if (r5 != null) {
            this.A0C.add(r5);
        }
    }
}
