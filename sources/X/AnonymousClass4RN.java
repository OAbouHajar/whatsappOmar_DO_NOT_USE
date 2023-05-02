package X;

import android.util.Log;

/* renamed from: X.4RN  reason: invalid class name */
public class AnonymousClass4RN {
    public final int A00;
    public final C14380p4 A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0015 A[LOOP:0: B:4:0x0015->B:7:0x0020, LOOP_START, PHI: r1 
      PHI: (r1v3 int) = (r1v2 int), (r1v5 int) binds: [B:3:0x0005, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4RN(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r5 = r8.length
            if (r5 != 0) goto L_0x0023
            java.lang.String r0 = ""
        L_0x0005:
            r6.<init>()
            r6.A03 = r0
            r6.A02 = r7
            r1 = 0
            X.0p4 r0 = new X.0p4
            r0.<init>(r7, r1)
            r6.A01 = r0
            r1 = 2
        L_0x0015:
            java.lang.String r0 = r6.A02
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x0046
            int r1 = r1 + 1
            r0 = 7
            if (r1 > r0) goto L_0x0046
            goto L_0x0015
        L_0x0023:
            java.lang.String r0 = "["
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r0)
            r3 = 0
        L_0x002a:
            r2 = r8[r3]
            int r1 = r4.length()
            r0 = 1
            if (r1 <= r0) goto L_0x0038
            java.lang.String r0 = ","
            r4.append(r0)
        L_0x0038:
            r4.append(r2)
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x002a
            java.lang.String r0 = "] "
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r4)
            goto L_0x0005
        L_0x0046:
            r6.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RN.<init>(java.lang.String, java.lang.String[]):void");
    }

    public void A00(String str, Object... objArr) {
        if (this.A00 <= 3) {
            String str2 = this.A02;
            if (objArr.length > 0) {
                str = AnonymousClass3K4.A0b(str, objArr);
            }
            Log.d(str2, this.A03.concat(str));
        }
    }
}
