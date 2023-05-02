package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0dV  reason: invalid class name and case insensitive filesystem */
public abstract class C08360dV implements C12650kk, C13160lZ, C13530mX {
    public Paint A00;
    public AnonymousClass0HM A01;
    public AnonymousClass0OQ A02;
    public C08360dV A03;
    public C08360dV A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public final Matrix A08;
    public final Matrix A09 = AnonymousClass000.A0H();
    public final Paint A0A;
    public final Paint A0B = new AnonymousClass0AR(1);
    public final Paint A0C = new AnonymousClass0AR(1, PorterDuff.Mode.DST_IN);
    public final Paint A0D = new AnonymousClass0AR(1, PorterDuff.Mode.DST_OUT);
    public final Paint A0E;
    public final Path A0F = AnonymousClass000.A0I();
    public final RectF A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final AnonymousClass0Ak A0K;
    public final AnonymousClass0S6 A0L;
    public final C05320Qf A0M;
    public final String A0N;
    public final List A0O;

    public C08360dV(AnonymousClass0Ak r6, C05320Qf r7) {
        AnonymousClass0AR r2 = new AnonymousClass0AR(1);
        this.A0E = r2;
        this.A0A = new AnonymousClass0AR(PorterDuff.Mode.CLEAR);
        this.A0I = AnonymousClass000.A0K();
        this.A0G = AnonymousClass000.A0K();
        this.A0H = AnonymousClass000.A0K();
        this.A0J = AnonymousClass000.A0K();
        this.A08 = AnonymousClass000.A0H();
        this.A0O = AnonymousClass000.A0u();
        this.A07 = true;
        this.A0K = r6;
        this.A0M = r7;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(r7.A0G);
        this.A0N = AnonymousClass000.A0h("#draw", A0o);
        r2.setXfermode(new PorterDuffXfermode(r7.A0F == AnonymousClass0JX.INVERT ? PorterDuff.Mode.DST_OUT : PorterDuff.Mode.DST_IN));
        AnonymousClass0S6 r0 = new AnonymousClass0S6(r7.A0D);
        this.A0L = r0;
        r0.A02(this);
        List list = r7.A0J;
        if (list != null && !list.isEmpty()) {
            AnonymousClass0OQ r02 = new AnonymousClass0OQ(list);
            this.A02 = r02;
            for (AnonymousClass0SI A042 : r02.A00) {
                AnonymousClass0SI.A04(A042, this);
            }
            for (AnonymousClass0SI r03 : this.A02.A02) {
                A09(r03);
                AnonymousClass0SI.A04(r03, this);
            }
        }
        List list2 = this.A0M.A0I;
        boolean z2 = true;
        if (!list2.isEmpty()) {
            AnonymousClass0HM r1 = new AnonymousClass0HM(list2);
            this.A01 = r1;
            r1.A05 = true;
            AnonymousClass0SI.A04(r1, new C08320dR(this));
            z2 = AnonymousClass0SI.A02(this.A01) != 1.0f ? false : z2;
            if (z2 != this.A07) {
                this.A07 = z2;
                this.A0K.invalidateSelf();
            }
            A09(this.A01);
        } else if (true != this.A07) {
            this.A07 = true;
            this.A0K.invalidateSelf();
        }
    }

    public static Path A04(Matrix matrix, Paint paint, AnonymousClass0SI r5, AnonymousClass0SI r6, C08360dV r7) {
        Path path = r7.A0F;
        path.set((Path) r5.A08());
        path.transform(matrix);
        paint.setAlpha((int) (((float) ((Number) r6.A08()).intValue()) * 2.55f));
        return path;
    }

    public final void A05() {
        if (this.A05 == null) {
            C08360dV r1 = this.A04;
            if (r1 == null) {
                this.A05 = Collections.emptyList();
                return;
            }
            this.A05 = AnonymousClass000.A0u();
            do {
                this.A05.add(r1);
                r1 = r1.A04;
            } while (r1 != null);
        }
    }

    public void A06(float f2) {
        AnonymousClass0S6 r1 = this.A0L;
        AnonymousClass0SI r0 = r1.A02;
        if (r0 != null) {
            r0.A0C(f2);
        }
        AnonymousClass0SI r02 = r1.A06;
        if (r02 != null) {
            r02.A0C(f2);
        }
        AnonymousClass0SI r03 = r1.A01;
        if (r03 != null) {
            r03.A0C(f2);
        }
        AnonymousClass0SI r04 = r1.A00;
        if (r04 != null) {
            r04.A0C(f2);
        }
        AnonymousClass0SI r05 = r1.A03;
        if (r05 != null) {
            r05.A0C(f2);
        }
        AnonymousClass0SI r06 = r1.A05;
        if (r06 != null) {
            r06.A0C(f2);
        }
        AnonymousClass0SI r07 = r1.A04;
        if (r07 != null) {
            r07.A0C(f2);
        }
        AnonymousClass0HM r08 = r1.A07;
        if (r08 != null) {
            r08.A0C(f2);
        }
        AnonymousClass0HM r09 = r1.A08;
        if (r09 != null) {
            r09.A0C(f2);
        }
        AnonymousClass0OQ r4 = this.A02;
        int i2 = 0;
        if (r4 != null) {
            int i3 = 0;
            while (true) {
                List list = r4.A00;
                if (i3 >= list.size()) {
                    break;
                }
                ((AnonymousClass0SI) list.get(i3)).A0C(f2);
                i3++;
            }
        }
        float f3 = this.A0M.A01;
        if (f3 != 0.0f) {
            f2 /= f3;
        }
        AnonymousClass0HM r12 = this.A01;
        if (r12 != null) {
            r12.A0C(f2 / f3);
        }
        C08360dV r13 = this.A03;
        if (r13 != null) {
            r13.A06(r13.A0M.A01 * f2);
        }
        while (true) {
            List list2 = this.A0O;
            if (i2 < list2.size()) {
                ((AnonymousClass0SI) list2.get(i2)).A0C(f2);
                i2++;
            } else {
                return;
            }
        }
    }

    public final void A07(Canvas canvas) {
        RectF rectF = this.A0I;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.A0A);
        AnonymousClass0NI.A01();
    }

    public abstract void A08(Canvas canvas, Matrix matrix, int i2);

    public void A09(AnonymousClass0SI r2) {
        if (r2 != null) {
            this.A0O.add(r2);
        }
    }

    public void A0A(AnonymousClass0WM r1, AnonymousClass0WM r2, List list, int i2) {
    }

    public void A0B(boolean z2) {
        if (z2 && this.A00 == null) {
            this.A00 = new AnonymousClass0AR();
        }
        this.A06 = z2;
    }

    public void A4l(AnonymousClass0UV r2, Object obj) {
        this.A0L.A04(r2, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00db, code lost:
        r0 = r8.A0J;
        r12.computeBounds(r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        if (r3 != 0) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e2, code lost:
        r2.set(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e8, code lost:
        r2.set(java.lang.Math.min(r2.left, r0.left), java.lang.Math.min(r2.top, r0.top), java.lang.Math.max(r2.right, r0.right), java.lang.Math.max(r2.bottom, r0.bottom));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A8F(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            r20 = this;
            r8 = r20
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x032e
            X.0Qf r7 = r8.A0M
            boolean r0 = r7.A0L
            if (r0 != 0) goto L_0x032e
            r8.A05()
            android.graphics.Matrix r6 = r8.A09
            r6.reset()
            r19 = r22
            r0 = r19
            r6.set(r0)
            java.util.List r0 = r8.A05
            int r1 = r0.size()
        L_0x0021:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0037
            java.util.List r0 = r8.A05
            java.lang.Object r0 = r0.get(r1)
            X.0dV r0 = (X.C08360dV) r0
            X.0S6 r0 = r0.A0L
            android.graphics.Matrix r0 = r0.A00()
            r6.preConcat(r0)
            goto L_0x0021
        L_0x0037:
            X.AnonymousClass0NI.A01()
            X.0S6 r12 = r8.A0L
            X.0SI r0 = r12.A02
            if (r0 != 0) goto L_0x0256
            r0 = 100
        L_0x0042:
            r1 = r23
            float r2 = (float) r1
            r1 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 / r1
            float r0 = (float) r0
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            float r2 = r2 * r1
            int r5 = (int) r2
            X.0dV r0 = r8.A03
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r9 = r21
            if (r0 != 0) goto L_0x0065
            X.0OQ r0 = r8.A02
            if (r0 == 0) goto L_0x02c7
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02c7
        L_0x0065:
            android.graphics.RectF r4 = r8.A0I
            r10 = 0
            r8.AAB(r6, r4, r10)
            X.0dV r0 = r8.A03
            if (r0 == 0) goto L_0x008c
            X.0JX r1 = r7.A0F
            X.0JX r0 = X.AnonymousClass0JX.INVERT
            if (r1 == r0) goto L_0x008c
            android.graphics.RectF r11 = r8.A0H
            r3 = 0
            r11.set(r3, r3, r3, r3)
            X.0dV r2 = r8.A03
            r1 = 1
            r0 = r19
            r2.AAB(r0, r11, r1)
            boolean r0 = r4.intersect(r11)
            if (r0 != 0) goto L_0x008c
            r4.set(r3, r3, r3, r3)
        L_0x008c:
            android.graphics.Matrix r0 = r12.A00()
            r6.preConcat(r0)
            android.graphics.RectF r2 = r8.A0G
            r1 = 0
            r2.set(r1, r1, r1, r1)
            X.0OQ r11 = r8.A02
            if (r11 == 0) goto L_0x011a
            java.util.List r0 = r11.A00
            r18 = r0
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x011a
            java.util.List r0 = r11.A01
            r17 = r0
            int r16 = r17.size()
            r3 = 0
        L_0x00b0:
            r0 = r16
            if (r3 >= r0) goto L_0x010c
            r0 = r17
            java.lang.Object r13 = r0.get(r3)
            X.0Oj r13 = (X.C04880Oj) r13
            r0 = r18
            java.lang.Object r0 = r0.get(r3)
            X.0SI r0 = (X.AnonymousClass0SI) r0
            java.lang.Object r0 = r0.A08()
            android.graphics.Path r0 = (android.graphics.Path) r0
            android.graphics.Path r12 = r8.A0F
            r12.set(r0)
            r12.transform(r6)
            X.0Jz r0 = r13.A02
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0116;
                case 1: goto L_0x011a;
                case 2: goto L_0x0116;
                case 3: goto L_0x011a;
                default: goto L_0x00db;
            }
        L_0x00db:
            android.graphics.RectF r0 = r8.A0J
            r12.computeBounds(r0, r10)
            if (r3 != 0) goto L_0x00e8
            r2.set(r0)
        L_0x00e5:
            int r3 = r3 + 1
            goto L_0x00b0
        L_0x00e8:
            float r13 = r2.left
            float r12 = r0.left
            float r14 = java.lang.Math.min(r13, r12)
            float r13 = r2.top
            float r12 = r0.top
            float r13 = java.lang.Math.min(r13, r12)
            float r15 = r2.right
            float r12 = r0.right
            float r12 = java.lang.Math.max(r15, r12)
            float r15 = r2.bottom
            float r0 = r0.bottom
            float r0 = java.lang.Math.max(r15, r0)
            r2.set(r14, r13, r12, r0)
            goto L_0x00e5
        L_0x010c:
            boolean r0 = r4.intersect(r2)
            if (r0 != 0) goto L_0x011a
            r4.set(r1, r1, r1, r1)
            goto L_0x011a
        L_0x0116:
            boolean r0 = r13.A03
            if (r0 == 0) goto L_0x00db
        L_0x011a:
            int r0 = r9.getWidth()
            float r2 = (float) r0
            int r0 = r9.getHeight()
            float r0 = (float) r0
            boolean r0 = r4.intersect(r1, r1, r2, r0)
            if (r0 != 0) goto L_0x012d
            r4.set(r1, r1, r1, r1)
        L_0x012d:
            X.AnonymousClass0NI.A01()
            float r0 = r4.width()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0291
            float r0 = r4.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0291
            android.graphics.Paint r12 = r8.A0B
            r3 = 255(0xff, float:3.57E-43)
            r12.setAlpha(r3)
            r2 = 31
            X.AnonymousClass0XD.A03(r9, r12, r4, r2)
            X.AnonymousClass0NI.A01()
            r8.A07(r9)
            r8.A08(r9, r6, r5)
            X.AnonymousClass0NI.A01()
            if (r11 == 0) goto L_0x0266
            java.util.List r0 = r11.A00
            r17 = r0
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x0266
            android.graphics.Paint r1 = r8.A0C
            r0 = 19
            X.AnonymousClass0XD.A03(r9, r1, r4, r0)
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r13 >= r0) goto L_0x0176
            r8.A07(r9)
        L_0x0176:
            X.AnonymousClass0NI.A01()
        L_0x0179:
            java.util.List r0 = r11.A01
            r16 = r0
            int r0 = r16.size()
            if (r10 >= r0) goto L_0x0260
            r0 = r16
            java.lang.Object r14 = r0.get(r10)
            X.0Oj r14 = (X.C04880Oj) r14
            r0 = r17
            java.lang.Object r15 = r0.get(r10)
            X.0SI r15 = (X.AnonymousClass0SI) r15
            java.util.List r0 = r11.A02
            java.lang.Object r13 = r0.get(r10)
            X.0SI r13 = (X.AnonymousClass0SI) r13
            X.0Jz r0 = r14.A02
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x0201;
                case 2: goto L_0x01c4;
                case 3: goto L_0x01dc;
                default: goto L_0x01a4;
            }
        L_0x01a4:
            int r10 = r10 + 1
            goto L_0x0179
        L_0x01a7:
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x01bc
            X.AnonymousClass0XD.A03(r9, r12, r4, r2)
            r9.drawRect(r4, r12)
            android.graphics.Path r13 = A04(r6, r12, r15, r13, r8)
            android.graphics.Paint r0 = r8.A0D
            r9.drawPath(r13, r0)
            goto L_0x023c
        L_0x01bc:
            android.graphics.Path r0 = A04(r6, r12, r15, r13, r8)
            r9.drawPath(r0, r12)
            goto L_0x01a4
        L_0x01c4:
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x01d1
            X.AnonymousClass0XD.A03(r9, r1, r4, r2)
            r9.drawRect(r4, r12)
            android.graphics.Paint r14 = r8.A0D
            goto L_0x021a
        L_0x01d1:
            X.AnonymousClass0XD.A03(r9, r1, r4, r2)
            android.graphics.Path r0 = A04(r6, r12, r15, r13, r8)
            r9.drawPath(r0, r12)
            goto L_0x023c
        L_0x01dc:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x01a4
            r14 = 0
        L_0x01e3:
            int r0 = r16.size()
            if (r14 >= r0) goto L_0x01fa
            r0 = r16
            java.lang.Object r0 = r0.get(r14)
            X.0Oj r0 = (X.C04880Oj) r0
            X.0Jz r13 = r0.A02
            X.0Jz r0 = X.C03820Jz.MASK_MODE_NONE
            if (r13 != r0) goto L_0x01a4
            int r14 = r14 + 1
            goto L_0x01e3
        L_0x01fa:
            r12.setAlpha(r3)
            r9.drawRect(r4, r12)
            goto L_0x01a4
        L_0x0201:
            if (r10 != 0) goto L_0x020e
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12.setColor(r0)
            r12.setAlpha(r3)
            r9.drawRect(r4, r12)
        L_0x020e:
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x0241
            android.graphics.Paint r14 = r8.A0D
            X.AnonymousClass0XD.A03(r9, r14, r4, r2)
            r9.drawRect(r4, r12)
        L_0x021a:
            java.lang.Object r0 = r13.A08()
            int r0 = X.AnonymousClass000.A0D(r0)
            float r13 = (float) r0
            r0 = 1076048691(0x40233333, float:2.55)
            float r13 = r13 * r0
            int r0 = (int) r13
            r14.setAlpha(r0)
            java.lang.Object r13 = r15.A08()
            android.graphics.Path r13 = (android.graphics.Path) r13
            android.graphics.Path r0 = r8.A0F
            r0.set(r13)
            r0.transform(r6)
            r9.drawPath(r0, r14)
        L_0x023c:
            r9.restore()
            goto L_0x01a4
        L_0x0241:
            java.lang.Object r0 = r15.A08()
            android.graphics.Path r0 = (android.graphics.Path) r0
            android.graphics.Path r13 = r8.A0F
            r13.set(r0)
            r13.transform(r6)
            android.graphics.Paint r0 = r8.A0D
            r9.drawPath(r13, r0)
            goto L_0x01a4
        L_0x0256:
            java.lang.Object r0 = r0.A08()
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x0042
        L_0x0260:
            r9.restore()
            X.AnonymousClass0NI.A01()
        L_0x0266:
            X.0dV r0 = r8.A03
            boolean r0 = X.AnonymousClass000.A1V(r0)
            if (r0 == 0) goto L_0x028b
            android.graphics.Paint r1 = r8.A0E
            r0 = 19
            X.AnonymousClass0XD.A03(r9, r1, r4, r0)
            X.AnonymousClass0NI.A01()
            r8.A07(r9)
            X.0dV r1 = r8.A03
            r0 = r19
            r1.A8F(r9, r0, r5)
            r9.restore()
            X.AnonymousClass0NI.A01()
            X.AnonymousClass0NI.A01()
        L_0x028b:
            r9.restore()
            X.AnonymousClass0NI.A01()
        L_0x0291:
            boolean r0 = r8.A06
            if (r0 == 0) goto L_0x02d4
            android.graphics.Paint r1 = r8.A00
            if (r1 == 0) goto L_0x02d4
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r0)
            android.graphics.Paint r1 = r8.A00
            r0 = -251901(0xfffffffffffc2803, float:NaN)
            r1.setColor(r0)
            android.graphics.Paint r1 = r8.A00
            r0 = 1082130432(0x40800000, float:4.0)
            r1.setStrokeWidth(r0)
            android.graphics.Paint r0 = r8.A00
            r9.drawRect(r4, r0)
            android.graphics.Paint r1 = r8.A00
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            android.graphics.Paint r1 = r8.A00
            r0 = 1357638635(0x50ebebeb, float:3.1664855E10)
            r1.setColor(r0)
            android.graphics.Paint r0 = r8.A00
            r9.drawRect(r4, r0)
            goto L_0x02d4
        L_0x02c7:
            android.graphics.Matrix r0 = r12.A00()
            r6.preConcat(r0)
            r8.A08(r9, r6, r5)
            X.AnonymousClass0NI.A01()
        L_0x02d4:
            X.AnonymousClass0NI.A01()
            X.0Ak r0 = r8.A0K
            X.0Rs r0 = r0.A04
            X.0Oh r5 = r0.A0D
            java.lang.String r4 = r7.A0G
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0331
            java.util.Map r0 = r5.A02
            java.lang.Object r3 = r0.get(r4)
            X.0OA r3 = (X.AnonymousClass0OA) r3
            if (r3 != 0) goto L_0x02f5
            X.0OA r3 = new X.0OA
            r3.<init>()
            r0.put(r4, r3)
        L_0x02f5:
            r0 = 0
            float r2 = r3.A00
            float r2 = r2 + r0
            r3.A00 = r2
            int r0 = r3.A01
            int r1 = r0 + 1
            r3.A01 = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0310
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            r3.A00 = r2
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r3.A01 = r0
        L_0x0310:
            java.lang.String r0 = "__container"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0331
            java.util.Set r0 = r5.A03
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0331
            r1.next()
            java.lang.String r0 = "onFrameRendered"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x032e:
            X.AnonymousClass0NI.A01()
        L_0x0331:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08360dV.A8F(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        this.A0I.set(0.0f, 0.0f, 0.0f, 0.0f);
        A05();
        Matrix matrix2 = this.A08;
        matrix2.set(matrix);
        if (z2) {
            List list = this.A05;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(((C08360dV) this.A05.get(size)).A0L.A00());
                }
            } else {
                C08360dV r0 = this.A04;
                if (r0 != null) {
                    matrix2.preConcat(r0.A0L.A00());
                }
            }
        }
        matrix2.preConcat(this.A0L.A00());
    }

    public void AZV() {
        this.A0K.invalidateSelf();
    }

    public void AcW(AnonymousClass0WM r4, AnonymousClass0WM r5, List list, int i2) {
        C08360dV r0 = this.A03;
        if (r0 != null) {
            String str = r0.A0M.A0G;
            AnonymousClass0WM r2 = new AnonymousClass0WM(r5);
            r2.A01.add(str);
            if (r4.A01(this.A03.A0M.A0G, i2)) {
                C08360dV r1 = this.A03;
                AnonymousClass0WM r02 = new AnonymousClass0WM(r2);
                r02.A00 = r1;
                list.add(r02);
            }
            if (r4.A03(this.A0M.A0G, i2)) {
                this.A03.A0A(r4, r2, list, r4.A00(this.A03.A0M.A0G, i2) + i2);
            }
        }
        String str2 = this.A0M.A0G;
        if (r4.A02(str2, i2)) {
            if (!"__container".equals(str2)) {
                AnonymousClass0WM r12 = new AnonymousClass0WM(r5);
                r12.A01.add(str2);
                r5 = r12;
                if (r4.A01(str2, i2)) {
                    AnonymousClass0WM r03 = new AnonymousClass0WM(r12);
                    r03.A00 = this;
                    list.add(r03);
                }
            }
            if (r4.A03(str2, i2)) {
                A0A(r4, r5, list, i2 + r4.A00(str2, i2));
            }
        }
    }

    public void Adk(List list, List list2) {
    }

    public String getName() {
        return this.A0M.A0G;
    }
}
