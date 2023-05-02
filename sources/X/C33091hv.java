package X;

/* renamed from: X.1hv  reason: invalid class name and case insensitive filesystem */
public class C33091hv extends C32061fa {
    public C33051hr A00 = C33051hr.A01;
    public C33041hq A01;

    public C33091hv(C32411gJ r4) {
        if (r4.A0A() == 0) {
            this.A00 = null;
            return;
        }
        if (r4.A0C(0) instanceof C33051hr) {
            this.A00 = C33051hr.A00(r4.A0C(0));
        } else {
            this.A00 = null;
            this.A01 = C33041hq.A00(r4.A0C(0));
        }
        if (r4.A0A() <= 1) {
            return;
        }
        if (this.A00 != null) {
            this.A01 = C33041hq.A00(r4.A0C(1));
            return;
        }
        throw new IllegalArgumentException("wrong sequence in constructor");
    }

    public static C33091hv A00(Object obj) {
        if (obj instanceof C33091hv) {
            return (C33091hv) obj;
        }
        if (obj != null) {
            return new C33091hv(C32411gJ.A00(obj));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            X.1hq r3 = r4.A01
            java.lang.String r0 = "BasicConstraints: isCa("
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            X.1hr r0 = r4.A00
            if (r0 == 0) goto L_0x0015
            byte r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x0025
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
        L_0x0020:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0025:
            r2.append(r0)
            java.lang.String r0 = "), pathLenConstraint = "
            r2.append(r0)
            byte[] r1 = r3.A01
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r2.append(r0)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33091hv.toString():java.lang.String");
    }
}
