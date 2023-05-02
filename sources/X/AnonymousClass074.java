package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.074  reason: invalid class name */
public final class AnonymousClass074 implements AnonymousClass075 {
    public float A00 = 21.0f;
    public float A01 = 2.0f;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public AnonymousClass077 A07;
    public C12770kw A08;
    public C12780kx A09;
    public C12790ky A0A;
    public C12800kz A0B;
    public C12810l0 A0C;
    public C12820l1 A0D;
    public AnonymousClass0VB A0E;
    public AnonymousClass0IV A0F;
    public AnonymousClass0IW A0G;
    public AnonymousClass0IY A0H;
    public AnonymousClass0WR A0I;
    public AnonymousClass0WR A0J;
    public AnonymousClass0WR A0K;
    public AnonymousClass0WR A0L;
    public boolean A0M = false;
    public boolean A0N;
    public final int A0O;
    public final Context A0P;
    public final Matrix A0Q = new Matrix();
    public final AnonymousClass09W A0R;
    public final C06540Wn A0S;
    public final C05140Pl A0T;
    public final C03430Im A0U;
    public final C06080Ud A0V;
    public final ArrayList A0W = new ArrayList();
    public final List A0X = new ArrayList();
    public final float[] A0Y = new float[2];

    public AnonymousClass074(AnonymousClass0P5 r6, AnonymousClass09W r7) {
        PorterDuffColorFilter porterDuffColorFilter;
        this.A0R = r7;
        Context applicationContext = r7.getContext().getApplicationContext();
        this.A0P = applicationContext;
        this.A0S = new C06540Wn(this);
        C05140Pl r4 = new C05140Pl(this);
        this.A0T = r4;
        C008103s.A00(applicationContext);
        int i2 = applicationContext.getResources().getDisplayMetrics().densityDpi >= 320 ? 512 : 256;
        this.A0O = i2;
        C03430Im r2 = new C03430Im(this, new C03310Ia(applicationContext, r6, i2));
        A0B(r2);
        this.A0U = r2;
        C06080Ud r3 = new C06080Ud(r7.getContext());
        this.A0V = r3;
        C04630Nh r1 = new C04630Nh(this);
        r3.A01 = r1;
        if (r3.A00 != null && r3.A04) {
            r1.A00.A0R.invalidate();
        }
        if (r6 != null) {
            boolean z2 = r6.A03;
            AnonymousClass074 r12 = r4.A00;
            AnonymousClass0IV r0 = r12.A0F;
            if (z2) {
                if (r0 == null) {
                    AnonymousClass0IV r02 = new AnonymousClass0IV(r12);
                    r12.A0F = r02;
                    r12.A0B(r02);
                }
            } else if (r0 != null) {
                r12.A0C(r0);
                r12.A0F = null;
            }
            r4.A02 = r6.A05;
            r4.A03 = r6.A06;
            this.A00 = Math.min(Math.max(21.0f, 2.0f), 21.0f);
            this.A01 = Math.min(Math.max(2.0f, 2.0f), 21.0f);
            boolean z3 = r6.A04;
            Paint paint = r2.A01;
            if (z3) {
                porterDuffColorFilter = C03430Im.A04;
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(-526345, PorterDuff.Mode.SRC_ATOP);
                    C03430Im.A04 = porterDuffColorFilter;
                }
            } else {
                porterDuffColorFilter = null;
            }
            paint.setColorFilter(porterDuffColorFilter);
        }
    }

    public final float A00() {
        return ((float) 0) + (((float) (this.A0R.A0F - this.A05)) / 2.0f);
    }

    public final float A01() {
        int i2 = this.A06;
        return ((float) i2) + (((float) ((this.A0R.A0D - i2) - this.A04)) / 2.0f);
    }

    public final AnonymousClass0YG A02() {
        float[] fArr = this.A0Y;
        AnonymousClass09W r7 = this.A0R;
        fArr[0] = r7.A04 - A00();
        fArr[1] = r7.A05 - A01();
        r7.A0h.mapVectors(fArr);
        double d2 = r7.A02;
        float f2 = fArr[0];
        float f3 = (float) r7.A0J;
        return new AnonymousClass0YG(new AnonymousClass020(C06540Wn.A02(r7.A03 - ((double) (fArr[1] / f3))), ((d2 - ((double) (f2 / f3))) * 360.0d) - 180.0d), r7.getZoom(), 0.0f, r7.A0A);
    }

    public final AnonymousClass0IS A03(AnonymousClass0UE r2) {
        AnonymousClass0IS r0 = new AnonymousClass0IS(this, r2);
        A0B(r0);
        r0.A0H = this;
        return r0;
    }

    public void A04() {
        if (this.A09 != null || !this.A0W.isEmpty()) {
            AnonymousClass0YG A022 = A02();
            C12780kx r0 = this.A09;
            if (r0 != null) {
                r0.ANx(A022);
            }
            ArrayList arrayList = this.A0W;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C12780kx) it.next()).ANx(A022);
                }
            }
        }
    }

    public final void A05() {
        Iterator it = this.A0X.iterator();
        while (it.hasNext()) {
            int i2 = ((AnonymousClass0VB) it.next()).A03;
            if (i2 == 1 || i2 == 2 || i2 == 4) {
                it.remove();
            }
        }
        this.A0R.invalidate();
    }

    public final void A06() {
        AnonymousClass0WR r0 = this.A0J;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass0WR r02 = this.A0K;
        if (r02 != null) {
            r02.A01();
        }
        AnonymousClass0WR r03 = this.A0L;
        if (r03 != null) {
            r03.A01();
        }
        AnonymousClass0WR r04 = this.A0I;
        if (r04 != null) {
            r04.A01();
        }
    }

    public final void A07(int i2, int i3, int i4) {
        AnonymousClass09W r6 = this.A0R;
        double d2 = r6.A02;
        long j2 = r6.A0J << 1;
        r6.A0A(d2 + ((double) (((long) ((0 - this.A05) - (-i3))) / j2)), r6.A03 + ((double) (((long) ((this.A06 - this.A04) - (i2 - i4))) / j2)));
        this.A06 = i2;
        this.A05 = i3;
        this.A04 = i4;
        r6.requestLayout();
        r6.invalidate();
    }

    public final void A08(AnonymousClass076 r3) {
        A0A(r3, (AnonymousClass077) null, 1500);
    }

    public final void A09(AnonymousClass076 r3) {
        A0A(r3, (AnonymousClass077) null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.AnonymousClass076 r22, X.AnonymousClass077 r23, int r24) {
        /*
            r21 = this;
            r8 = r21
            X.09W r7 = r8.A0R
            boolean r0 = r7.A0b
            if (r0 != 0) goto L_0x010d
            r3 = 1
            r11 = r24
            if (r24 == 0) goto L_0x0018
            X.0Im r0 = r8.A0U
            r2 = -1
            X.0S2 r1 = r0.A0A
            int r0 = r1.A03
            if (r0 != r2) goto L_0x0018
            r1.A03 = r3
        L_0x0018:
            r8.A06()
            r8.A0M = r3
            float r13 = r8.A00()
            float r12 = r8.A01()
            float r2 = r7.getZoom()
            r8.A02 = r13
            r8.A03 = r12
            r10 = r22
            float r1 = r10.A01
            r6 = 0
            r20 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x01ac
            r2 = r1
        L_0x0039:
            float r1 = r8.A01
            float r0 = r8.A00
            float r0 = java.lang.Math.min(r0, r2)
            float r9 = java.lang.Math.max(r1, r0)
            double r4 = r7.A02
            double r2 = r7.A03
            X.020 r14 = r10.A06
            if (r14 != 0) goto L_0x0055
            X.0YH r0 = r10.A07
            if (r0 == 0) goto L_0x00a0
            X.020 r14 = r0.A00()
        L_0x0055:
            double r0 = r14.A01
            double r4 = X.C06540Wn.A01(r0)
            double r0 = r14.A00
            double r2 = X.C06540Wn.A00(r0)
            float[] r14 = r8.A0Y
            float r0 = r7.A04
            float r0 = r0 - r13
            r14[r6] = r0
            float r15 = r7.A05
            float r15 = r15 - r12
            r1 = 1
            r14[r1] = r15
            r0 = r14[r6]
            r16 = 0
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
            int r0 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00a0
        L_0x007a:
            int r0 = (int) r9
            int r1 = r1 << r0
            int r0 = r8.A0O
            int r1 = r1 * r0
            r15 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9 % r15
            float r0 = r0 + r15
            android.graphics.Matrix r15 = r8.A0Q
            r15.setScale(r0, r0)
            float r0 = r7.A0A
            r15.postRotate(r0)
            r15.invert(r15)
            r15.mapVectors(r14)
            r0 = r14[r6]
            float r6 = (float) r1
            float r0 = r0 / r6
            double r0 = (double) r0
            double r4 = r4 + r0
            r0 = 1
            r0 = r14[r0]
            float r0 = r0 / r6
            double r0 = (double) r0
            double r2 = r2 + r0
        L_0x00a0:
            float r6 = r7.A0A
            float r10 = r10.A00
            int r0 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00b5
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 % r14
            float r0 = r6 - r10
            r1 = 1127481344(0x43340000, float:180.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x019f
            float r6 = r10 + r14
        L_0x00b5:
            double r4 = X.AnonymousClass09W.A00(r4)
            int r0 = (int) r9
            r1 = 1
            int r1 = r1 << r0
            int r0 = r8.A0O
            int r1 = r1 * r0
            long r0 = (long) r1
            double r2 = r7.A03(r2, r0)
            r10 = r23
            if (r24 > 0) goto L_0x010e
            float r0 = r7.getZoom()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            float r1 = r8.A02
            float r0 = r8.A03
            r7.A0H(r9, r1, r0)
        L_0x00d7:
            double r0 = r7.A02
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x00e3
            double r0 = r7.A03
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00e6
        L_0x00e3:
            r7.A0A(r4, r2)
        L_0x00e6:
            float r0 = r7.A0A
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            r7.A0B(r6, r13, r12)
        L_0x00ef:
            r7.invalidate()
            r8.A04()
        L_0x00f5:
            X.0WR r0 = r8.A0J
            if (r0 != 0) goto L_0x010d
            X.0WR r0 = r8.A0K
            if (r0 != 0) goto L_0x010d
            X.0WR r0 = r8.A0L
            if (r0 != 0) goto L_0x010d
            X.0WR r0 = r8.A0I
            if (r0 != 0) goto L_0x010d
            if (r23 == 0) goto L_0x010d
            r0 = 0
            r8.A07 = r0
            r10.ARM()
        L_0x010d:
            return
        L_0x010e:
            r8.A07 = r10
            float r1 = r7.getZoom()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0128
            X.0WR r9 = X.AnonymousClass0WR.A00(r1, r9)
            r8.A0L = r9
            r9.A06(r8)
            r9.A07(r8)
            long r0 = (long) r11
            r9.A05(r0)
        L_0x0128:
            double r0 = r7.A02
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x014b
            double r16 = r4 - r0
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x0197
            double r4 = r4 - r14
        L_0x0139:
            float r9 = (float) r0
            float r0 = (float) r4
            X.0WR r4 = X.AnonymousClass0WR.A00(r9, r0)
            r8.A0J = r4
            r4.A06(r8)
            r4.A07(r8)
            long r0 = (long) r11
            r4.A05(r0)
        L_0x014b:
            double r0 = r7.A03
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0163
            float r4 = (float) r0
            float r0 = (float) r2
            X.0WR r2 = X.AnonymousClass0WR.A00(r4, r0)
            r8.A0K = r2
            r2.A06(r8)
            r2.A07(r8)
            long r0 = (long) r11
            r2.A05(r0)
        L_0x0163:
            float r1 = r7.A0A
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0179
            X.0WR r2 = X.AnonymousClass0WR.A00(r1, r6)
            r8.A0I = r2
            r2.A06(r8)
            r2.A07(r8)
            long r0 = (long) r11
            r2.A05(r0)
        L_0x0179:
            X.0WR r0 = r8.A0J
            if (r0 == 0) goto L_0x0180
            r0.A03()
        L_0x0180:
            X.0WR r0 = r8.A0K
            if (r0 == 0) goto L_0x0187
            r0.A03()
        L_0x0187:
            X.0WR r0 = r8.A0L
            if (r0 == 0) goto L_0x018e
            r0.A03()
        L_0x018e:
            X.0WR r0 = r8.A0I
            if (r0 == 0) goto L_0x00f5
            r0.A03()
            goto L_0x00f5
        L_0x0197:
            r12 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r9 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x0139
            double r4 = r4 + r14
            goto L_0x0139
        L_0x019f:
            float r0 = r10 - r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a9
            float r6 = r10 - r14
            goto L_0x00b5
        L_0x01a9:
            r6 = r10
            goto L_0x00b5
        L_0x01ac:
            float r1 = r10.A02
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x01c7
            float r2 = r2 + r1
            float r1 = r10.A03
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x01bf
            float r0 = r10.A04
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
        L_0x01bf:
            r8.A02 = r1
            float r0 = r10.A04
            r8.A03 = r0
            goto L_0x0039
        L_0x01c7:
            X.0YH r5 = r10.A07
            if (r5 == 0) goto L_0x0039
            int r2 = r7.A0F
            int r0 = r8.A05
            int r2 = r2 - r0
            int r3 = r7.A0D
            int r0 = r8.A06
            int r3 = r3 - r0
            int r0 = r8.A04
            int r3 = r3 - r0
            if (r2 != 0) goto L_0x01e4
            if (r3 != 0) goto L_0x01e4
            java.lang.String r1 = "Error using newLatLngBounds(LatLngBounds, int): Map size can't be 0. Most likely, layout has not yet occured for the map view.  Either wait until layout has occurred or use newLatLngBounds(LatLngBounds, int, int, int) which allows you to specify the map's dimensions."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01e4:
            int r0 = r10.A05
            int r1 = r0 << 1
            int r0 = r2 + r1
            if (r0 <= r2) goto L_0x01ed
            int r2 = r2 - r1
        L_0x01ed:
            int r0 = r3 + r1
            if (r0 <= r3) goto L_0x01f2
            int r3 = r3 - r1
        L_0x01f2:
            int r2 = java.lang.Math.max(r6, r2)
            int r4 = java.lang.Math.max(r6, r3)
            X.020 r3 = r5.A00
            double r0 = r3.A01
            double r14 = X.C06540Wn.A01(r0)
            X.020 r5 = r5.A01
            double r0 = r5.A01
            double r0 = X.C06540Wn.A01(r0)
            double r14 = r14 - r0
            double r18 = java.lang.Math.abs(r14)
            double r0 = r5.A00
            double r14 = X.C06540Wn.A00(r0)
            double r0 = r3.A00
            double r0 = X.C06540Wn.A00(r0)
            double r14 = r14 - r0
            double r16 = java.lang.Math.abs(r14)
            double r0 = (double) r2
            double r0 = r0 / r18
            int r2 = r8.A0O
            double r2 = (double) r2
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r14 = X.AnonymousClass09W.A0n
            double r0 = r0 / r14
            float r5 = (float) r0
            double r0 = (double) r4
            double r0 = r0 / r16
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r14
            float r2 = (float) r0
            float r2 = java.lang.Math.min(r5, r2)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass074.A0A(X.076, X.077, int):void");
    }

    public final void A0B(AnonymousClass0VB r3) {
        List list = this.A0X;
        int binarySearch = Collections.binarySearch(list, r3, AnonymousClass0VB.A0E);
        if (binarySearch <= 0) {
            list.add(-1 - binarySearch, r3);
            r3.A03();
            this.A0R.invalidate();
        }
    }

    public final void A0C(AnonymousClass0VB r2) {
        r2.A05();
        this.A0X.remove(r2);
        this.A0R.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.AnonymousClass00T.A01(r1, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(boolean r3) {
        /*
            r2 = this;
            android.content.Context r1 = r2.A0P
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = X.AnonymousClass00T.A01(r1, r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = X.AnonymousClass00T.A01(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r2.A0N = r0
            r3 = r3 & r0
            X.0Ud r0 = r2.A0V
            r0.A01(r3)
            if (r3 == 0) goto L_0x003d
            X.0IY r0 = r2.A0H
            if (r0 != 0) goto L_0x0037
            X.0IY r0 = new X.0IY
            r0.<init>(r2)
            r2.A0H = r0
            r2.A0B(r0)
            X.0IY r0 = r2.A0H
            X.0WR r1 = r0.A0E
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0037
            r1.A03()
        L_0x0037:
            X.0Pl r0 = r2.A0T
            r0.A00()
            return
        L_0x003d:
            X.0IY r1 = r2.A0H
            if (r1 == 0) goto L_0x0037
            X.0WR r0 = r1.A0E
            r0.A01()
            r1.A02()
            X.0IY r0 = r2.A0H
            r2.A0C(r0)
            r0 = 0
            r2.A0H = r0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass074.A0D(boolean):void");
    }

    public void AMU(AnonymousClass0WR r7) {
        AnonymousClass09W r3;
        double d2;
        double d3;
        AnonymousClass0WR r0 = this.A0J;
        if (r7 == r0) {
            r3 = this.A0R;
            d2 = (double) r0.A00;
            d3 = r3.A03;
        } else {
            AnonymousClass0WR r02 = this.A0K;
            if (r7 == r02) {
                r3 = this.A0R;
                d2 = r3.A02;
                d3 = (double) r02.A00;
            } else {
                if (r7 == this.A0L) {
                    r3 = this.A0R;
                    if (r3.A0H(r7.A00, this.A02, this.A03)) {
                        r3.A0M.A04();
                    }
                } else if (r7 == this.A0I) {
                    r3 = this.A0R;
                    r3.A0B(r7.A00, A00(), A01());
                } else {
                    return;
                }
                r3.invalidate();
            }
        }
        r3.A0A(d2, d3);
        r3.invalidate();
    }
}
