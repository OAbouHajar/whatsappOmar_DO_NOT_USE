package X;

/* renamed from: X.5I6  reason: invalid class name */
public class AnonymousClass5I6 extends C32061fa {
    public C32411gJ A00;

    public AnonymousClass5I6(C32411gJ r1) {
        this.A00 = r1;
    }

    public static AnonymousClass5I6 A00(Object obj) {
        if (obj instanceof AnonymousClass5I6) {
            return (AnonymousClass5I6) obj;
        }
        if (obj != null) {
            return new AnonymousClass5I6(C32411gJ.A00(obj));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.5IE[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass5IE[] A03() {
        /*
            r5 = this;
            X.1gJ r4 = r5.A00
            int r0 = r4.A0A()
            X.5IE[] r3 = new X.AnonymousClass5IE[r0]
            r1 = 0
        L_0x0009:
            int r0 = r4.A0A()
            if (r1 == r0) goto L_0x003d
            X.1fb r2 = r4.A0C(r1)
            if (r2 == 0) goto L_0x0025
            boolean r0 = r2 instanceof X.AnonymousClass5IE
            if (r0 != 0) goto L_0x0025
            boolean r0 = r2 instanceof X.C32411gJ
            if (r0 == 0) goto L_0x002a
            X.1gJ r2 = (X.C32411gJ) r2
            X.5IE r0 = new X.5IE
            r0.<init>((X.C32411gJ) r2)
            r2 = r0
        L_0x0025:
            r3[r1] = r2
            int r1 = r1 + 1
            goto L_0x0009
        L_0x002a:
            java.lang.String r0 = "Invalid DistributionPoint: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0d(r2)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5I6.A03():X.5IE[]");
    }

    public C32051fZ Agm() {
        return this.A00;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C32941ha.A00;
        stringBuffer.append("CRLDistPoint:");
        stringBuffer.append(str);
        AnonymousClass5IE[] A03 = A03();
        for (int i2 = 0; i2 != A03.length; i2++) {
            stringBuffer.append("    ");
            stringBuffer.append(A03[i2]);
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
