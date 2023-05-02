package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1xh  reason: invalid class name and case insensitive filesystem */
public final class C42381xh implements C42371xg {
    public Set ADX(C16740tZ r5) {
        String str;
        if (r5.A0n == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("");
        AnonymousClass1Vt r2 = r5.A0L;
        if (r2 != null) {
            hashSet.add(C218315p.A09(r2) ? "c" : "i");
            if (r2.A0E()) {
                int i2 = r2.A02;
                if (i2 == 12) {
                    str = "n";
                } else if (i2 == 17) {
                    str = "q";
                }
                hashSet.add(str);
            }
            hashSet.add(r2.A0Q ? "s" : "r");
        }
        return hashSet;
    }

    public String ADr() {
        return "p";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42401xj ADs(X.C42391xi r6) {
        /*
            r5 = this;
            java.lang.Boolean r0 = r6.A07
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0018
            r0 = 0
            return r0
        L_0x0018:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.1tL r4 = r6.A05
            if (r4 == 0) goto L_0x0061
            boolean r0 = r4.A04
            java.lang.String r1 = "n"
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "q"
            r2.add(r0)
            r2.add(r1)
        L_0x0034:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "s"
            r1.add(r0)
        L_0x0043:
            X.1tM r0 = r4.A00
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "r"
            r1.add(r0)
        L_0x004c:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "c"
            r1.add(r0)
        L_0x0055:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "i"
            r1.add(r0)
        L_0x005e:
            r3.addAll(r1)
        L_0x0061:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = ""
            r3.add(r0)
        L_0x006c:
            X.1xj r0 = new X.1xj
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r2
            return r0
        L_0x0076:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0034
            r3.add(r1)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42381xh.ADs(X.1xi):X.1xj");
    }
}
