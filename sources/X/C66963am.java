package X;

/* renamed from: X.3am  reason: invalid class name and case insensitive filesystem */
public class C66963am extends C66973an {
    public final byte[] zzb;

    public C66963am(byte[] bArr) {
        this.zzb = bArr;
    }

    public static AnonymousClass557 A00(C66963am r2, int i2) {
        int A01 = AnonymousClass557.A01(0, i2, r2.A02());
        return A01 == 0 ? AnonymousClass557.A00 : new C66953al(r2.zzb, r2.A03(), A01);
    }

    public int A03() {
        if (this instanceof C66953al) {
            return ((C66953al) this).zzc;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.AnonymousClass557) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = 1
            if (r9 == r8) goto L_0x008d
            boolean r0 = r9 instanceof X.AnonymousClass557
            r4 = 0
            if (r0 == 0) goto L_0x0025
            int r2 = r8.A02()
            r7 = r9
            X.557 r7 = (X.AnonymousClass557) r7
            int r3 = r7.A02()
            if (r2 != r3) goto L_0x0025
            if (r2 == 0) goto L_0x008d
            boolean r0 = r9 instanceof X.C66963am
            if (r0 == 0) goto L_0x0088
            int r1 = r8.zzc
            int r0 = r7.zzc
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            if (r2 > r3) goto L_0x005c
            if (r2 > r3) goto L_0x006f
            boolean r0 = r7 instanceof X.C66963am
            X.3am r7 = (X.C66963am) r7
            if (r0 == 0) goto L_0x004f
            byte[] r6 = r8.zzb
            byte[] r5 = r7.zzb
            int r4 = r8.A03()
            int r3 = r4 + r2
            int r2 = r7.A03()
        L_0x003e:
            if (r4 >= r3) goto L_0x004d
            byte r1 = r6[r4]
            byte r0 = r5[r2]
            if (r1 == r0) goto L_0x0048
            r0 = 0
            return r0
        L_0x0048:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x003e
        L_0x004d:
            r0 = 1
            return r0
        L_0x004f:
            X.557 r1 = A00(r7, r2)
            X.557 r0 = A00(r8, r2)
            boolean r0 = r1.equals(r0)
            return r0
        L_0x005c:
            r0 = 40
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Length too large: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r2)
            goto L_0x0083
        L_0x006f:
            r0 = 59
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Ran off end of other: 0, "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r3)
        L_0x0083:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0088:
            boolean r0 = r9.equals(r8)
            return r0
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66963am.equals(java.lang.Object):boolean");
    }
}
