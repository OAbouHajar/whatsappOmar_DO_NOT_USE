package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.view.MotionEventCompat;
import java.util.List;

/* renamed from: X.0Ha  reason: invalid class name and case insensitive filesystem */
public class C03050Ha extends C08360dV {
    public Paint A00 = new Paint();
    public AnonymousClass0SI A01;
    public final RectF A02 = AnonymousClass000.A0K();
    public final RectF A03 = AnonymousClass000.A0K();
    public final List A04 = AnonymousClass000.A0u();

    public C03050Ha(AnonymousClass0Rs r10, AnonymousClass0Ak r11, C05320Qf r12, List list) {
        super(r11, r12);
        C08360dV r0;
        C08360dV r2;
        AnonymousClass0HT r02 = r12.A0A;
        if (r02 != null) {
            AnonymousClass0HM A002 = AnonymousClass0HC.A00(r02);
            this.A01 = A002;
            A09(A002);
            AnonymousClass0SI.A04(this.A01, this);
        } else {
            this.A01 = null;
        }
        AnonymousClass03G r4 = new AnonymousClass03G(r10.A07.size());
        int size = list.size() - 1;
        C08360dV r6 = null;
        while (true) {
            if (size >= 0) {
                C05320Qf r8 = (C05320Qf) list.get(size);
                C03680Jl r1 = r8.A0E;
                switch (r1.ordinal()) {
                    case 0:
                        r2 = new C03050Ha(r10, r11, r8, (List) r10.A0B.get(r8.A0H));
                        break;
                    case 1:
                        r2 = new AnonymousClass0HY(r11, r8);
                        break;
                    case 2:
                        r2 = new AnonymousClass0HZ(r11, r8);
                        break;
                    case 3:
                        r2 = new AnonymousClass0HW(r11, r8);
                        break;
                    case 4:
                        r2 = new AnonymousClass0HX(r11, r8);
                        break;
                    case 5:
                        r2 = new C03060Hb(r11, r8);
                        break;
                    default:
                        C05770Sy.A00(AnonymousClass000.A0g("Unknown layer type ", r1));
                        continue;
                }
                r4.A09(r2.A0M.A07, r2);
                if (r6 == null) {
                    this.A04.add(0, r2);
                    switch (r8.A0F.ordinal()) {
                        case 1:
                        case 2:
                            r6 = r2;
                            break;
                    }
                } else {
                    r6.A03 = r2;
                    r6 = null;
                }
                size--;
            } else {
                for (int i2 = 0; i2 < r4.A00(); i2++) {
                    C08360dV r22 = (C08360dV) r4.A04(r4.A01(i2), (Object) null);
                    if (!(r22 == null || (r0 = (C08360dV) r4.A04(r22.A0M.A08, (Object) null)) == null)) {
                        r22.A04 = r0;
                    }
                }
                return;
            }
        }
    }

    public void A06(float f2) {
        super.A06(f2);
        AnonymousClass0SI r3 = this.A01;
        if (r3 != null) {
            AnonymousClass0Rs r0 = this.A0K.A04;
            AnonymousClass0Rs r02 = this.A0M.A09;
            f2 = ((AnonymousClass0SI.A02(r3) * r02.A01) - r02.A02) / ((r0.A00 - r0.A02) + 0.01f);
        }
        if (this.A01 == null) {
            C05320Qf r03 = this.A0M;
            float f3 = r03.A00;
            AnonymousClass0Rs r04 = r03.A09;
            f2 -= f3 / (r04.A00 - r04.A02);
        }
        float f4 = this.A0M.A01;
        if (f4 != 0.0f) {
            f2 /= f4;
        }
        List list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C08360dV) list.get(size)).A06(f2);
            } else {
                return;
            }
        }
    }

    public void A08(Canvas canvas, Matrix matrix, int i2) {
        RectF rectF = this.A02;
        C05320Qf r1 = this.A0M;
        rectF.set(0.0f, 0.0f, (float) r1.A03, (float) r1.A02);
        matrix.mapRect(rectF);
        if (!this.A0K.A0C || this.A04.size() <= 1 || i2 == 255) {
            canvas.save();
        } else {
            Paint paint = this.A00;
            paint.setAlpha(i2);
            AnonymousClass0XD.A03(canvas, paint, rectF, 31);
            i2 = MotionEventCompat.ACTION_MASK;
        }
        List list = this.A04;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((C08360dV) list.get(size)).A8F(canvas, matrix, i2);
            }
        }
        canvas.restore();
        AnonymousClass0NI.A01();
    }

    public void A0A(AnonymousClass0WM r4, AnonymousClass0WM r5, List list, int i2) {
        int i3 = 0;
        while (true) {
            List list2 = this.A04;
            if (i3 < list2.size()) {
                ((C08360dV) list2.get(i3)).AcW(r4, r5, list, i2);
                i3++;
            } else {
                return;
            }
        }
    }

    public void A0B(boolean z2) {
        super.A0B(z2);
        for (C08360dV A0B : this.A04) {
            A0B.A0B(z2);
        }
    }

    public void A4l(AnonymousClass0UV r3, Object obj) {
        super.A4l(r3, obj);
        if (obj != C13480m6.A0J) {
            return;
        }
        if (r3 == null) {
            AnonymousClass0SI r1 = this.A01;
            if (r1 != null) {
                r1.A0D((AnonymousClass0UV) null);
                return;
            }
            return;
        }
        AnonymousClass0HF r0 = new AnonymousClass0HF(r3, (Object) null);
        this.A01 = r0;
        AnonymousClass0SI.A04(r0, this);
        A09(this.A01);
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        super.AAB(matrix, rectF, z2);
        List list = this.A04;
        for (int size = list.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.A03;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((C08360dV) list.get(size)).AAB(this.A08, rectF2, true);
            rectF.union(rectF2);
        }
    }
}
