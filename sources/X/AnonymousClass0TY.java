package X;

/* renamed from: X.0TY  reason: invalid class name */
public class AnonymousClass0TY {
    public static final C06000Tv A00 = C06000Tv.A00("k", new String[1], 0);
    public static final C06000Tv A01;

    static {
        String[] strArr = new String[10];
        strArr[0] = "a";
        strArr[1] = "p";
        strArr[2] = "s";
        strArr[3] = "rz";
        strArr[4] = "r";
        strArr[5] = "o";
        strArr[6] = "so";
        strArr[7] = "eo";
        strArr[8] = "sk";
        A01 = C06000Tv.A00("sa", strArr, 9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0149, code lost:
        if (r3.A01 == 1.0f) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C08450df A00(X.AnonymousClass0Rs r22, X.C09090et r23) {
        /*
            r2 = r23
            X.0KF r3 = r2.A0A()
            X.0KF r1 = X.AnonymousClass0KF.BEGIN_OBJECT
            r0 = 0
            r5 = 0
            if (r3 != r1) goto L_0x0010
            r5 = 1
            r2.A0F()
        L_0x0010:
            r6 = 0
            r12 = 0
            r14 = 0
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = 0
            r8 = 0
        L_0x0019:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x00d2
            X.0Tv r1 = A01
            int r3 = r2.A09(r1)
            r1 = r22
            switch(r3) {
                case 0: goto L_0x0031;
                case 1: goto L_0x0052;
                case 2: goto L_0x00c3;
                case 3: goto L_0x0057;
                case 4: goto L_0x005c;
                case 5: goto L_0x00a5;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00b7;
                case 9: goto L_0x00bd;
                default: goto L_0x002a;
            }
        L_0x002a:
            r2.A0I()
            r2.A0J()
            goto L_0x0019
        L_0x0031:
            r2.A0F()
        L_0x0034:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x004e
            X.0Tv r3 = A00
            int r3 = r2.A09(r3)
            if (r3 == 0) goto L_0x0049
            r2.A0I()
            r2.A0J()
            goto L_0x0034
        L_0x0049:
            X.0db r12 = X.C06350Vj.A00(r1, r2)
            goto L_0x0034
        L_0x004e:
            r2.A0H()
            goto L_0x0019
        L_0x0052:
            X.0lg r14 = X.C06350Vj.A01(r1, r2)
            goto L_0x0019
        L_0x0057:
            java.lang.String r3 = "Lottie doesn't support 3D layers."
            X.AnonymousClass0Rs.A01(r1, r3)
        L_0x005c:
            X.0HT r6 = X.C06270Vb.A01(r1, r2, r0)
            java.util.List r3 = r6.A00
            boolean r4 = r3.isEmpty()
            r21 = 0
            if (r4 == 0) goto L_0x0083
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            r16 = 0
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            r17 = r1
            X.0Wl r15 = new X.0Wl
            r20 = r19
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass0Rs) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.add(r15)
            goto L_0x0019
        L_0x0083:
            X.0Wl r4 = X.AnonymousClass000.A0R(r3, r0)
            java.lang.Object r4 = r4.A0F
            if (r4 != 0) goto L_0x0019
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            r16 = 0
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            r17 = r1
            X.0Wl r15 = new X.0Wl
            r20 = r19
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass0Rs) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.set(r0, r15)
            goto L_0x0019
        L_0x00a5:
            X.0HU r11 = X.C06270Vb.A02(r1, r2)
            goto L_0x0019
        L_0x00ab:
            X.0HT r7 = X.C06270Vb.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00b1:
            X.0HT r8 = X.C06270Vb.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00b7:
            X.0HT r9 = X.C06270Vb.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00bd:
            X.0HT r10 = X.C06270Vb.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00c3:
            X.0dv r4 = X.C08610dv.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            java.util.List r1 = X.C06370Vl.A00(r1, r4, r2, r3, r0)
            X.0HV r13 = new X.0HV
            r13.<init>(r1)
            goto L_0x0019
        L_0x00d2:
            if (r5 == 0) goto L_0x00d7
            r2.A0H()
        L_0x00d7:
            if (r12 == 0) goto L_0x00f0
            boolean r1 = r12.AJi()
            if (r1 == 0) goto L_0x00f1
            java.util.List r1 = r12.A00
            X.0Wl r1 = X.AnonymousClass000.A0R(r1, r0)
            java.lang.Object r2 = r1.A0F
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x00f1
        L_0x00f0:
            r12 = 0
        L_0x00f1:
            if (r14 == 0) goto L_0x0110
            boolean r1 = r14 instanceof X.C08400da
            if (r1 != 0) goto L_0x0111
            boolean r1 = r14.AJi()
            if (r1 == 0) goto L_0x0111
            java.util.List r1 = r14.AD1()
            X.0Wl r1 = X.AnonymousClass000.A0R(r1, r0)
            java.lang.Object r2 = r1.A0F
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x0111
        L_0x0110:
            r14 = 0
        L_0x0111:
            if (r6 == 0) goto L_0x012a
            boolean r1 = r6.AJi()
            if (r1 == 0) goto L_0x012b
            java.util.List r1 = r6.A00
            X.0Wl r1 = X.AnonymousClass000.A0R(r1, r0)
            java.lang.Object r1 = r1.A0F
            float r2 = X.AnonymousClass000.A04(r1)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x012b
        L_0x012a:
            r6 = 0
        L_0x012b:
            if (r13 == 0) goto L_0x014b
            boolean r1 = r13.AJi()
            if (r1 == 0) goto L_0x014c
            java.util.List r1 = r13.A00
            X.0Wl r1 = X.AnonymousClass000.A0R(r1, r0)
            java.lang.Object r3 = r1.A0F
            X.0PT r3 = (X.AnonymousClass0PT) r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3.A00
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x014c
            float r1 = r3.A01
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x014c
        L_0x014b:
            r13 = 0
        L_0x014c:
            if (r9 == 0) goto L_0x0165
            boolean r1 = r9.AJi()
            if (r1 == 0) goto L_0x0166
            java.util.List r1 = r9.A00
            X.0Wl r1 = X.AnonymousClass000.A0R(r1, r0)
            java.lang.Object r1 = r1.A0F
            float r2 = X.AnonymousClass000.A04(r1)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0166
        L_0x0165:
            r9 = 0
        L_0x0166:
            if (r10 == 0) goto L_0x017f
            boolean r1 = r10.AJi()
            if (r1 == 0) goto L_0x0180
            java.util.List r1 = r10.A00
            X.0Wl r0 = X.AnonymousClass000.A0R(r1, r0)
            java.lang.Object r0 = r0.A0F
            float r1 = X.AnonymousClass000.A04(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0180
        L_0x017f:
            r10 = 0
        L_0x0180:
            X.0df r5 = new X.0df
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0TY.A00(X.0Rs, X.0et):X.0df");
    }
}
