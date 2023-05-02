package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* renamed from: X.0Wf  reason: invalid class name */
public class AnonymousClass0Wf {
    public static AnonymousClass07U A00;
    public static C06000Tv A01;
    public static C06000Tv A02;
    public static final Interpolator A03 = new LinearInterpolator();

    static {
        String[] strArr = new String[8];
        strArr[0] = "t";
        strArr[1] = "s";
        strArr[2] = "e";
        strArr[3] = "o";
        strArr[4] = "i";
        strArr[5] = "h";
        strArr[6] = "to";
        A02 = C06000Tv.A00("ti", strArr, 7);
        String[] strArr2 = new String[2];
        strArr2[0] = "x";
        A01 = C06000Tv.A00("y", strArr2, 1);
    }

    public static Interpolator A00(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        pointF.x = AnonymousClass000.A02(1.0f, pointF.x, -1.0f);
        pointF.y = AnonymousClass000.A02(100.0f, pointF.y, -100.0f);
        float A022 = AnonymousClass000.A02(1.0f, pointF2.x, -1.0f);
        pointF2.x = A022;
        float A023 = AnonymousClass000.A02(100.0f, pointF2.y, -100.0f);
        pointF2.y = A023;
        float f2 = pointF.x;
        float f3 = pointF.y;
        int i2 = f2 != 0.0f ? (int) (((float) 527) * f2) : 17;
        if (f3 != 0.0f) {
            i2 = (int) (((float) (i2 * 31)) * f3);
        }
        if (A022 != 0.0f) {
            i2 = (int) (((float) (i2 * 31)) * A022);
        }
        if (A023 != 0.0f) {
            i2 = (int) (((float) (i2 * 31)) * A023);
        }
        Class<AnonymousClass0Wf> cls = AnonymousClass0Wf.class;
        synchronized (cls) {
            AnonymousClass07U r0 = A00;
            if (r0 == null) {
                r0 = new AnonymousClass07U();
                A00 = r0;
            }
            weakReference = (WeakReference) r0.A01(i2);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference == null || interpolator == null) {
            try {
                interpolator = C04240Lt.A00(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e2) {
                interpolator = "The Path cannot loop back on itself.".equals(e2.getMessage()) ? C04240Lt.A00(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            try {
                WeakReference weakReference2 = new WeakReference(interpolator);
                synchronized (cls) {
                    A00.A03(i2, weakReference2);
                }
                return interpolator;
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0136, code lost:
        r6.A0H();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C06520Wl A01(X.AnonymousClass0Rs r16, X.C12670km r17, X.C09090et r18, float r19, boolean r20, boolean r21) {
        /*
            r7 = r17
            r6 = r18
            r5 = r19
            if (r20 == 0) goto L_0x0204
            r17 = r16
            if (r21 == 0) goto L_0x0193
            r6.A0F()
            r14 = 0
            r15 = 0
            r11 = 0
            r10 = 0
            r12 = 0
            r19 = 0
            r9 = 0
            r1 = 0
            r4 = 0
            r21 = 0
            r13 = 0
            r20 = 0
        L_0x001e:
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x0153
            X.0Tv r0 = A02
            int r0 = r6.A09(r0)
            r2 = 1
            switch(r0) {
                case 0: goto L_0x014d;
                case 1: goto L_0x0147;
                case 2: goto L_0x0141;
                case 3: goto L_0x00c1;
                case 4: goto L_0x0045;
                case 5: goto L_0x003c;
                case 6: goto L_0x0037;
                case 7: goto L_0x0032;
                default: goto L_0x002e;
            }
        L_0x002e:
            r6.A0J()
            goto L_0x001e
        L_0x0032:
            android.graphics.PointF r14 = X.C06550Wr.A02(r6, r5)
            goto L_0x001e
        L_0x0037:
            android.graphics.PointF r13 = X.C06550Wr.A02(r6, r5)
            goto L_0x001e
        L_0x003c:
            int r0 = r6.A08()
            boolean r15 = X.AnonymousClass000.A1R(r0, r2)
            goto L_0x001e
        L_0x0045:
            X.0KF r2 = r6.A0A()
            X.0KF r0 = X.AnonymousClass0KF.BEGIN_OBJECT
            if (r2 != r0) goto L_0x00bb
            r6.A0F()
            r8 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x0054:
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x00b0
            X.0Tv r0 = A01
            int r1 = r6.A09(r0)
            if (r1 == 0) goto L_0x0077
            r0 = 1
            if (r1 == r0) goto L_0x0069
            r6.A0J()
            goto L_0x0054
        L_0x0069:
            X.0KF r0 = r6.A0A()
            X.0KF r1 = X.AnonymousClass0KF.NUMBER
            if (r0 != r1) goto L_0x0099
            float r2 = X.C09090et.A05(r6)
            r4 = r2
            goto L_0x0054
        L_0x0077:
            X.0KF r0 = r6.A0A()
            X.0KF r1 = X.AnonymousClass0KF.NUMBER
            if (r0 != r1) goto L_0x0085
            float r3 = X.C09090et.A05(r6)
            r8 = r3
            goto L_0x0054
        L_0x0085:
            r6.A0E()
            float r8 = X.C09090et.A05(r6)
            X.0KF r0 = r6.A0A()
            if (r0 != r1) goto L_0x0097
            float r3 = X.C09090et.A05(r6)
            goto L_0x00aa
        L_0x0097:
            r3 = r8
            goto L_0x00aa
        L_0x0099:
            r6.A0E()
            float r4 = X.C09090et.A05(r6)
            X.0KF r0 = r6.A0A()
            if (r0 != r1) goto L_0x00ae
            float r2 = X.C09090et.A05(r6)
        L_0x00aa:
            r6.A0G()
            goto L_0x0054
        L_0x00ae:
            r2 = r4
            goto L_0x00aa
        L_0x00b0:
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r8, r4)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r3, r2)
            goto L_0x0136
        L_0x00bb:
            android.graphics.PointF r10 = X.C06550Wr.A02(r6, r5)
            goto L_0x001e
        L_0x00c1:
            X.0KF r2 = r6.A0A()
            X.0KF r0 = X.AnonymousClass0KF.BEGIN_OBJECT
            if (r2 != r0) goto L_0x013b
            r6.A0F()
            r9 = 0
            r8 = 0
            r3 = 0
            r2 = 0
        L_0x00d0:
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x012c
            X.0Tv r0 = A01
            int r12 = r6.A09(r0)
            if (r12 == 0) goto L_0x0107
            r0 = 1
            if (r12 == r0) goto L_0x00e5
            r6.A0J()
            goto L_0x00d0
        L_0x00e5:
            X.0KF r0 = r6.A0A()
            X.0KF r2 = X.AnonymousClass0KF.NUMBER
            if (r0 != r2) goto L_0x00f3
            float r2 = X.C09090et.A05(r6)
            r8 = r2
            goto L_0x00d0
        L_0x00f3:
            r6.A0E()
            float r8 = X.C09090et.A05(r6)
            X.0KF r0 = r6.A0A()
            if (r0 != r2) goto L_0x0105
            float r2 = X.C09090et.A05(r6)
            goto L_0x0126
        L_0x0105:
            r2 = r8
            goto L_0x0126
        L_0x0107:
            X.0KF r0 = r6.A0A()
            X.0KF r3 = X.AnonymousClass0KF.NUMBER
            if (r0 != r3) goto L_0x0115
            float r3 = X.C09090et.A05(r6)
            r9 = r3
            goto L_0x00d0
        L_0x0115:
            r6.A0E()
            float r9 = X.C09090et.A05(r6)
            X.0KF r0 = r6.A0A()
            if (r0 != r3) goto L_0x012a
            float r3 = X.C09090et.A05(r6)
        L_0x0126:
            r6.A0G()
            goto L_0x00d0
        L_0x012a:
            r3 = r9
            goto L_0x0126
        L_0x012c:
            android.graphics.PointF r12 = new android.graphics.PointF
            r12.<init>(r9, r8)
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r3, r2)
        L_0x0136:
            r6.A0H()
            goto L_0x001e
        L_0x013b:
            android.graphics.PointF r11 = X.C06550Wr.A02(r6, r5)
            goto L_0x001e
        L_0x0141:
            java.lang.Object r20 = r7.AaC(r6, r5)
            goto L_0x001e
        L_0x0147:
            java.lang.Object r19 = r7.AaC(r6, r5)
            goto L_0x001e
        L_0x014d:
            float r21 = X.C09090et.A05(r6)
            goto L_0x001e
        L_0x0153:
            r6.A0H()
            if (r15 == 0) goto L_0x0168
            android.view.animation.Interpolator r16 = A03
            r20 = r19
        L_0x015c:
            r18 = 0
            X.0Wl r15 = new X.0Wl
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass0Rs) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
        L_0x0163:
            r15.A06 = r13
            r15.A07 = r14
            return r15
        L_0x0168:
            if (r11 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            android.view.animation.Interpolator r16 = A00(r11, r10)
            goto L_0x015c
        L_0x0171:
            if (r12 == 0) goto L_0x0190
            if (r9 == 0) goto L_0x0190
            if (r1 == 0) goto L_0x0190
            if (r4 == 0) goto L_0x0190
            android.view.animation.Interpolator r1 = A00(r12, r1)
            android.view.animation.Interpolator r2 = A00(r9, r4)
            X.0Wl r15 = new X.0Wl
            r0 = r15
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r0.<init>((android.view.animation.Interpolator) r1, (android.view.animation.Interpolator) r2, (X.AnonymousClass0Rs) r3, (java.lang.Object) r4, (java.lang.Object) r5, (float) r6)
            goto L_0x0163
        L_0x0190:
            android.view.animation.Interpolator r16 = A03
            goto L_0x015c
        L_0x0193:
            r6.A0F()
            r8 = 0
            r4 = r8
            r20 = r8
            r19 = r8
            r3 = r8
            r2 = r8
            r9 = 0
            r21 = 0
        L_0x01a1:
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x01e3
            X.0Tv r0 = A02
            int r1 = r6.A09(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 0: goto L_0x01de;
                case 1: goto L_0x01d9;
                case 2: goto L_0x01d4;
                case 3: goto L_0x01cf;
                case 4: goto L_0x01ca;
                case 5: goto L_0x01c0;
                case 6: goto L_0x01bb;
                case 7: goto L_0x01b6;
                default: goto L_0x01b2;
            }
        L_0x01b2:
            r6.A0J()
            goto L_0x01a1
        L_0x01b6:
            android.graphics.PointF r2 = X.C06550Wr.A02(r6, r5)
            goto L_0x01a1
        L_0x01bb:
            android.graphics.PointF r3 = X.C06550Wr.A02(r6, r5)
            goto L_0x01a1
        L_0x01c0:
            int r1 = r6.A08()
            r0 = 1
            boolean r9 = X.AnonymousClass000.A1R(r1, r0)
            goto L_0x01a1
        L_0x01ca:
            android.graphics.PointF r4 = X.C06550Wr.A02(r6, r0)
            goto L_0x01a1
        L_0x01cf:
            android.graphics.PointF r8 = X.C06550Wr.A02(r6, r0)
            goto L_0x01a1
        L_0x01d4:
            java.lang.Object r20 = r7.AaC(r6, r5)
            goto L_0x01a1
        L_0x01d9:
            java.lang.Object r19 = r7.AaC(r6, r5)
            goto L_0x01a1
        L_0x01de:
            float r21 = X.C09090et.A05(r6)
            goto L_0x01a1
        L_0x01e3:
            r6.A0H()
            if (r9 == 0) goto L_0x01f8
            android.view.animation.Interpolator r16 = A03
            r20 = r19
        L_0x01ec:
            r18 = 0
            X.0Wl r15 = new X.0Wl
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass0Rs) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r15.A06 = r3
            r15.A07 = r2
            return r15
        L_0x01f8:
            if (r8 == 0) goto L_0x0201
            if (r4 == 0) goto L_0x0201
            android.view.animation.Interpolator r16 = A00(r8, r4)
            goto L_0x01ec
        L_0x0201:
            android.view.animation.Interpolator r16 = A03
            goto L_0x01ec
        L_0x0204:
            java.lang.Object r0 = r7.AaC(r6, r5)
            X.0Wl r15 = new X.0Wl
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Wf.A01(X.0Rs, X.0km, X.0et, float, boolean, boolean):X.0Wl");
    }
}
