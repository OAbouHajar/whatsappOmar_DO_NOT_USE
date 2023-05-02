package X;

import java.util.Arrays;

/* renamed from: X.2Iv  reason: invalid class name and case insensitive filesystem */
public class C47402Iv {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r3 == 2) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r4 != 1) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r4 == 0) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(int r3, int r4) {
        /*
            r2 = 1
            if (r3 != r2) goto L_0x000b
            if (r4 == r2) goto L_0x000f
        L_0x0005:
            r0 = 2
            if (r3 != r2) goto L_0x0010
            if (r4 != r0) goto L_0x001c
            return r0
        L_0x000b:
            if (r3 != 0) goto L_0x0005
            if (r4 != 0) goto L_0x001c
        L_0x000f:
            return r2
        L_0x0010:
            if (r3 != r0) goto L_0x0016
            if (r4 != r2) goto L_0x0018
            r0 = 3
            return r0
        L_0x0016:
            if (r3 != r0) goto L_0x001c
        L_0x0018:
            if (r4 != r0) goto L_0x001c
            r0 = 4
            return r0
        L_0x001c:
            java.lang.String r0 = "getProviderCategory unexpected arguments hostStorage: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ". actualActors:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47402Iv.A00(int, int):int");
    }

    public static boolean A01(C40111ta r4, C40111ta r5) {
        if (r5 == null) {
            return false;
        }
        if ((r4 == null ? 1 : A00(r4.hostStorage, r4.actualActors)) == A00(r5.hostStorage, r5.actualActors)) {
            return false;
        }
        Arrays.toString(Thread.currentThread().getStackTrace());
        return true;
    }
}
