package X;

import android.util.Pair;

/* renamed from: X.2GQ  reason: invalid class name */
public class AnonymousClass2GQ {
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
        if (r2 != false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(X.AnonymousClass013 r13, long r14, boolean r16) {
        /*
            r8 = 0
            r6 = 1
            r12 = 0
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b7
            r11 = 1
            long r3 = -r14
        L_0x000a:
            r1 = 900000(0xdbba0, double:4.44659E-318)
            java.lang.String r5 = "%.1f"
            java.lang.String r10 = "%.0f"
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0067
            float r1 = (float) r3
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            r7 = 279(0x117, float:3.91E-43)
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0026
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a0
            r10 = r5
        L_0x0026:
            r5 = r10
        L_0x0027:
            if (r11 == 0) goto L_0x002a
            float r1 = -r1
        L_0x002a:
            android.content.Context r0 = r13.A00
            java.util.Locale r3 = X.AnonymousClass013.A00(r0)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r0[r12] = r2
            java.lang.String r4 = java.lang.String.format(r3, r5, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r12] = r2
            java.lang.String r3 = java.lang.String.format(r1, r5, r0)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r12] = r4
            android.content.Context r0 = r13.A00
            java.util.Locale r1 = X.AnonymousClass013.A00(r0)
            X.1Zd r0 = r13.A04()
            X.1Ze r0 = r0.A02
            java.lang.String r0 = r0.A04(r3, r7)
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            java.lang.String r0 = r13.A0G(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
            return r0
        L_0x0067:
            r1 = 900000000(0x35a4e900, double:4.446590813E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
            float r1 = (float) r3
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r1 = r1 / r0
            r7 = 280(0x118, float:3.92E-43)
        L_0x0075:
            r2 = 0
            goto L_0x00a1
        L_0x0077:
            r1 = 900000000000(0xd18c2e2800, double:4.44659081257E-312)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0088
            float r1 = (float) r3
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            r7 = 275(0x113, float:3.85E-43)
            goto L_0x0075
        L_0x0088:
            r1 = 900000000000000(0x3328b944c4000, double:4.44659081257122E-309)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            float r1 = (float) r3
            if (r0 > 0) goto L_0x0099
            r0 = 1399379109(0x5368d4a5, float:1.0E12)
            float r1 = r1 / r0
            r7 = 289(0x121, float:4.05E-43)
            goto L_0x0075
        L_0x0099:
            r0 = 1482907561(0x58635fa9, float:9.9999999E14)
            float r1 = r1 / r0
            r7 = 286(0x11e, float:4.01E-43)
            goto L_0x0075
        L_0x00a0:
            r2 = 1
        L_0x00a1:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ab
            java.lang.String r5 = "%.2f"
            goto L_0x0027
        L_0x00ab:
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0027
            if (r16 == 0) goto L_0x0026
            if (r2 != 0) goto L_0x0026
            goto L_0x0027
        L_0x00b7:
            r11 = 0
            r3 = r14
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2GQ.A00(X.013, long, boolean):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C84354Kf A01(X.AnonymousClass013 r15, long r16) {
        /*
            r0 = r16
            double r5 = (double) r0
            r4 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r13 = 0
        L_0x0009:
            r12 = 3
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r13 >= r12) goto L_0x001a
            int r2 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            double r5 = r5 / r16
            int r13 = r13 + 1
            goto L_0x0009
        L_0x001a:
            r7 = r15
            android.content.Context r2 = r15.A00
            java.util.Locale r9 = X.AnonymousClass013.A00(r2)
            r14 = 0
            java.lang.String r11 = ""
            r10 = 279(0x117, float:3.91E-43)
            r3 = 1
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r8
            java.lang.String r6 = "%d"
            java.lang.String r5 = java.lang.String.format(r9, r6, r0)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r8
        L_0x003c:
            java.lang.String r11 = java.lang.String.format(r2, r6, r1)
        L_0x0040:
            X.1Zd r0 = r7.A04()
            X.1Ze r0 = r0.A02
            java.lang.String r6 = r0.A04(r11, r10)
            java.lang.String r0 = "%1$s"
            int r1 = r6.indexOf(r0)
            r0 = -1
            if (r1 != r0) goto L_0x0054
            r3 = 0
        L_0x0054:
            X.AnonymousClass00B.A0G(r3)
            int r0 = r1 + 4
            java.lang.String r2 = r6.substring(r4, r1)
            java.lang.String r1 = r6.substring(r0)
            X.4Kf r0 = new X.4Kf
            r0.<init>(r2, r5, r1)
            return r0
        L_0x0067:
            java.lang.String r8 = "%1$.1f"
            if (r13 == 0) goto L_0x00bb
            if (r13 == r3) goto L_0x00a6
            r0 = 2
            if (r13 == r0) goto L_0x008d
            if (r13 == r12) goto L_0x0074
            r5 = r11
            goto L_0x0040
        L_0x0074:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            r0[r4] = r2
            java.lang.String r5 = java.lang.String.format(r9, r8, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            java.lang.String r11 = java.lang.String.format(r1, r8, r0)
            r10 = 275(0x113, float:3.85E-43)
            goto L_0x0040
        L_0x008d:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            r0[r4] = r2
            java.lang.String r5 = java.lang.String.format(r9, r8, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            java.lang.String r11 = java.lang.String.format(r1, r8, r0)
            r10 = 280(0x118, float:3.92E-43)
            goto L_0x0040
        L_0x00a6:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r1[r4] = r0
            java.lang.String r6 = "%1$.0f"
            java.lang.String r5 = java.lang.String.format(r9, r6, r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r0
            goto L_0x003c
        L_0x00bb:
            double r5 = r5 / r16
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            r0[r4] = r2
            java.lang.String r5 = java.lang.String.format(r9, r8, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            java.lang.String r11 = java.lang.String.format(r1, r8, r0)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2GQ.A01(X.013, long):X.4Kf");
    }

    public static String A02(AnonymousClass013 r5, int i2, long j2, boolean z2) {
        Pair A00 = A00(r5, j2, z2);
        return String.format(AnonymousClass013.A00(r5.A00), r5.A0A(i2, (String) A00.second), new Object[]{A00.first});
    }

    public static String A03(AnonymousClass013 r1, long j2) {
        return (String) A00(r1, j2, false).first;
    }

    public static String A04(AnonymousClass013 r0, long j2) {
        C84354Kf A01 = A01(r0, j2);
        StringBuilder sb = new StringBuilder();
        sb.append(A01.A01);
        sb.append(A01.A02);
        sb.append(A01.A00);
        return sb.toString();
    }
}
