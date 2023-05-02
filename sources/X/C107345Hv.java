package X;

import java.util.Enumeration;

/* renamed from: X.5Hv  reason: invalid class name and case insensitive filesystem */
public class C107345Hv extends C32061fa {
    public C107385Hz[] A00;
    public C107385Hz[] A01;

    public C107345Hv(C32411gJ r6) {
        Enumeration A0B = r6.A0B();
        while (A0B.hasMoreElements()) {
            C107525In A012 = C107525In.A01(A0B.nextElement());
            int i2 = A012.A00;
            if (i2 == 0) {
                this.A01 = A00(C32411gJ.A01(A012, false));
            } else if (i2 == 1) {
                this.A00 = A00(C32411gJ.A01(A012, false));
            } else {
                throw AnonymousClass000.A0T(C13680ns.A0c(i2, "Unknown tag encountered: "));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.5Hz[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C107385Hz[] A00(X.C32411gJ r5) {
        /*
            int r4 = r5.A0A()
            X.5Hz[] r3 = new X.C107385Hz[r4]
            r2 = 0
        L_0x0007:
            if (r2 == r4) goto L_0x0023
            X.1fb r1 = r5.A0C(r2)
            if (r1 != 0) goto L_0x0015
            r1 = 0
        L_0x0010:
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0015:
            boolean r0 = r1 instanceof X.C107385Hz
            if (r0 != 0) goto L_0x0010
            X.1gJ r0 = X.C32411gJ.A00(r1)
            X.5Hz r1 = new X.5Hz
            r1.<init>(r0)
            goto L_0x0010
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107345Hv.A00(X.1gJ):X.5Hz[]");
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        C107385Hz[] r1 = this.A01;
        if (r1 != null) {
            C107525In.A04(new C32401gI((C32071fb[]) r1), A0v, false);
        }
        C107385Hz[] r2 = this.A00;
        if (r2 != null) {
            C107525In.A03(new C32401gI((C32071fb[]) r2), A0v, 1, false);
        }
        return new C32401gI(A0v);
    }
}
