package X;

import java.util.Collections;

/* renamed from: X.1xf  reason: invalid class name and case insensitive filesystem */
public final class C42361xf implements C42371xg {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r5 != 29) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set ADX(X.C16740tZ r7) {
        /*
            r6 = this;
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            byte r5 = r7.A10
            r4 = 23
            r2 = 1
            if (r5 == r2) goto L_0x0075
            r0 = 2
            r1 = 97
            if (r5 == r0) goto L_0x007a
            r0 = 3
            if (r5 == r0) goto L_0x0072
            r0 = 9
            if (r5 == r0) goto L_0x0078
            r0 = 13
            if (r5 == r0) goto L_0x006f
            if (r5 == r4) goto L_0x0075
            r0 = 37
            if (r5 == r0) goto L_0x0075
            r0 = 66
            r1 = 111(0x6f, float:1.56E-43)
            if (r5 == r0) goto L_0x007a
            r0 = 25
            if (r5 == r0) goto L_0x0075
            r0 = 26
            if (r5 == r0) goto L_0x0078
            r0 = 28
            if (r5 == r0) goto L_0x0072
            r0 = 29
            if (r5 == r0) goto L_0x006f
        L_0x0038:
            java.lang.String r0 = X.AnonymousClass17N.A00(r7)
            java.util.ArrayList r0 = X.C30931dC.A05(r0, r2)
            if (r0 == 0) goto L_0x004b
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r0 = java.lang.Character.toString(r0)
            r3.add(r0)
        L_0x004b:
            X.0tZ r1 = r7.A0D()
            boolean r0 = r1 instanceof X.C38891ra
            if (r0 == 0) goto L_0x006d
            X.1Vw r0 = r1.A11
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "product_inquiry"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x006d
        L_0x005f:
            if (r5 == r4) goto L_0x0063
            if (r2 == 0) goto L_0x006c
        L_0x0063:
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r0 = java.lang.Character.toString(r0)
            r3.add(r0)
        L_0x006c:
            return r3
        L_0x006d:
            r2 = 0
            goto L_0x005f
        L_0x006f:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x007a
        L_0x0072:
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x007a
        L_0x0075:
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x007a
        L_0x0078:
            r1 = 100
        L_0x007a:
            java.lang.String r0 = java.lang.Character.toString(r1)
            r3.add(r0)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42361xf.ADX(X.0tZ):java.util.Set");
    }

    public String ADr() {
        return "f";
    }

    public C42401xj ADs(C42391xi r3) {
        if (r3.A02 == 0) {
            return null;
        }
        C42401xj r1 = new C42401xj();
        r1.A00 = Collections.singleton(Character.toString((char) r3.A02));
        return r1;
    }
}
