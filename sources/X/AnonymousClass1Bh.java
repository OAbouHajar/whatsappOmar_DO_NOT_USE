package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.1Bh  reason: invalid class name */
public class AnonymousClass1Bh extends C23271Bi {
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        if (r2.equals("reverse") == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011d, code lost:
        if (r2.equals("radial") == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0140, code lost:
        if (r0 == false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4PG A00(X.C616439s r8, X.C14990q7 r9, X.C31201dg r10) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass3U2
            r5 = 0
            if (r0 == 0) goto L_0x0032
            r0 = 38
            X.1dg r2 = r10.A0G(r0)
            r0 = 50
            X.1dg r4 = r10.A0G(r0)
            if (r2 == 0) goto L_0x0015
            if (r4 != 0) goto L_0x0149
        L_0x0015:
            java.lang.String r1 = "ShimmerDrawableUtils"
            java.lang.String r0 = "Base Color or highlight color were null for a Color highlight Shimmer Drawable"
            X.C29691b2.A00(r1, r0)
            if (r2 != 0) goto L_0x0149
            r3 = 0
        L_0x001f:
            X.4PG r2 = r8.A00
            int r1 = r2.A05
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r0
            r3 = r3 | r1
            r2.A05 = r3
            if (r4 != 0) goto L_0x0143
            r0 = 0
        L_0x0030:
            r2.A09 = r0
        L_0x0032:
            r1 = 40
            r0 = 1
            boolean r0 = r10.A0P(r1, r0)
            X.4PG r3 = r8.A00
            r3.A0H = r0
            r1 = 36
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r0 = r10.A08(r1, r0)
            r8.A02(r0)
            r0 = 49
            r4 = 1065353216(0x3f800000, float:1.0)
            float r0 = r10.A08(r0, r4)
            r8.A03(r0)
            r1 = 44
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = r10.A0A(r1, r0)
            long r1 = (long) r0
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0192
            r3.A0D = r1
            r1 = 52
            r0 = -1
            int r0 = r10.A0A(r1, r0)
            r3.A0A = r0
            r0 = 53
            int r0 = r10.A0A(r0, r5)
            long r1 = (long) r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0195
            r3.A0E = r1
            r1 = 43
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r10.A08(r1, r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x017d
            r3.A00 = r1
            r0 = 46
            int r2 = r10.A0A(r0, r5)
            if (r2 < 0) goto L_0x0169
            r3.A08 = r2
            r0 = 45
            int r2 = r10.A0A(r0, r5)
            if (r2 < 0) goto L_0x0155
            r3.A07 = r2
            r0 = 51
            r2 = 0
            float r1 = r10.A08(r0, r2)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0152
            r3.A02 = r1
            r0 = 57
            float r1 = r10.A08(r0, r4)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x014f
            r3.A04 = r1
            r0 = 48
            float r1 = r10.A08(r0, r4)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0180
            r3.A01 = r1
            r0 = 56
            float r0 = r10.A08(r0, r2)
            r3.A03 = r0
            r0 = 42
            java.lang.String r1 = r10.A0J(r0)
            if (r1 == 0) goto L_0x00da
            int r0 = r1.hashCode()
            switch(r0) {
                case -1118360059: goto L_0x0130;
                case -1085344219: goto L_0x0139;
                case -87315416: goto L_0x0127;
                default: goto L_0x00da;
            }
        L_0x00da:
            r1 = 0
        L_0x00db:
            r3.A06 = r1
            r0 = 54
            java.lang.String r2 = r10.A0J(r0)
            if (r2 == 0) goto L_0x00fd
            int r1 = r2.hashCode()
            r0 = 1097506319(0x416a9e0f, float:14.663589)
            if (r1 == r0) goto L_0x00fd
            r0 = 1099846370(0x418e52e2, float:17.79047)
            if (r1 != r0) goto L_0x00fd
            java.lang.String r0 = "reverse"
            boolean r0 = r2.equals(r0)
            r1 = 2
            if (r0 != 0) goto L_0x00fe
        L_0x00fd:
            r1 = 1
        L_0x00fe:
            r3.A0B = r1
            r0 = 55
            java.lang.String r2 = r10.A0J(r0)
            if (r2 == 0) goto L_0x011f
            int r1 = r2.hashCode()
            r0 = -1102672091(0xffffffffbe468f25, float:-0.19390543)
            if (r1 == r0) goto L_0x011f
            r0 = -938579425(0xffffffffc80e6a1f, float:-145832.48)
            if (r1 != r0) goto L_0x011f
            java.lang.String r0 = "radial"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0120
        L_0x011f:
            r1 = 0
        L_0x0120:
            r3.A0C = r1
            X.4PG r0 = r8.A01()
            return r0
        L_0x0127:
            java.lang.String r0 = "right_to_left"
            boolean r0 = r1.equals(r0)
            r1 = 2
            goto L_0x0140
        L_0x0130:
            java.lang.String r0 = "top_to_bottom"
            boolean r0 = r1.equals(r0)
            r1 = 1
            goto L_0x0140
        L_0x0139:
            java.lang.String r0 = "bottom_to_top"
            boolean r0 = r1.equals(r0)
            r1 = 3
        L_0x0140:
            if (r0 != 0) goto L_0x00db
            goto L_0x00da
        L_0x0143:
            int r0 = X.C87564Xk.A01(r9, r4, r5)
            goto L_0x0030
        L_0x0149:
            int r3 = X.C87564Xk.A01(r9, r2, r5)
            goto L_0x001f
        L_0x014f:
            java.lang.String r0 = "Given invalid width ratio: "
            goto L_0x0182
        L_0x0152:
            java.lang.String r0 = "Given invalid intensity value: "
            goto L_0x0182
        L_0x0155:
            java.lang.String r1 = "Given invalid height: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0169:
            java.lang.String r1 = "Given invalid width: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x017d:
            java.lang.String r0 = "Given invalid dropoff value: "
            goto L_0x0182
        L_0x0180:
            java.lang.String r0 = "Given invalid height ratio: "
        L_0x0182:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0192:
            java.lang.String r0 = "Given a negative duration: "
            goto L_0x0197
        L_0x0195:
            java.lang.String r0 = "Given a negative repeat delay: "
        L_0x0197:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.C13680ns.A0j(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Bh.A00(X.39s, X.0q7, X.1dg):X.4PG");
    }

    public Drawable A01(C14990q7 r9, C31201dg r10, C31201dg r11) {
        int i2 = r10.A01;
        C14990q7 r5 = r9;
        if (i2 == 13761) {
            C56322nS r2 = new C56322nS();
            r2.A02(r10.A0P(41, false) ? A00(new AnonymousClass3U2(), r9, r10) : A00(new AnonymousClass3U1(), r9, r10));
            return r2;
        } else if (i2 != 15775) {
            return super.A01(r9, r10, r11);
        } else {
            String A0K = r10.A0K(38, "primary");
            if ("circular".equals(A0K)) {
                return new C02180Ad(r9.A00, r9);
            }
            AnonymousClass0KS r4 = "elevated".equals(A0K) ? AnonymousClass0KS.ELEVATED : "persistent".equals(A0K) ? AnonymousClass0KS.PERSISTENT : AnonymousClass0KS.PRIMARY;
            C31201dg A0G = r10.A0G(36);
            int A01 = A0G != null ? C87564Xk.A01(r9, A0G, 0) : 0;
            int i3 = 0;
            for (String str : r10.A0N(35)) {
                switch (str.hashCode()) {
                    case -1383228885:
                        if (!str.equals("bottom")) {
                            break;
                        } else {
                            i3 |= 8;
                            break;
                        }
                    case 96673:
                        if (!str.equals("all")) {
                            break;
                        } else {
                            i3 |= 15;
                            break;
                        }
                    case 115029:
                        if (!str.equals("top")) {
                            break;
                        } else {
                            i3 |= 1;
                            break;
                        }
                    case 3317767:
                        if (!str.equals("left")) {
                            break;
                        } else {
                            i3 |= 2;
                            break;
                        }
                    case 108511772:
                        if (!str.equals("right")) {
                            break;
                        } else {
                            i3 |= 4;
                            break;
                        }
                }
            }
            return new C02190Ae(r9.A00, r4, r5, A01, i3);
        }
    }
}
