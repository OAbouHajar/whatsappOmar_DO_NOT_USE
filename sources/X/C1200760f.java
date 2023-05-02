package X;

import android.text.TextUtils;

/* renamed from: X.60f  reason: invalid class name and case insensitive filesystem */
public class C1200760f implements AnonymousClass2H5 {
    public C16980tz A00;
    public C18300wT A01;
    public AnonymousClass1Vo A02 = C110105dW.A0Q("PaymentCommonDeviceIdManager", "infra");

    public C1200760f(C16980tz r3, C18300wT r4) {
        this.A00 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r7 = this;
            X.1Vo r2 = r7.A02
            java.lang.String r0 = "PaymentDeviceId: getid_v2()"
            r2.A04(r0)
            X.0tz r0 = r7.A00
            android.content.Context r5 = r0.A00
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x001b
            java.lang.String r0 = "PaymentDeviceId: still fallback to v1"
            r2.A04(r0)
            java.lang.String r0 = X.C110115dX.A0c(r5)
        L_0x001a:
            return r0
        L_0x001b:
            java.lang.String r0 = "PaymentDeviceId: generate id for v2"
            r2.A04(r0)
            java.lang.String r3 = X.C110115dX.A0c(r5)
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = ""
        L_0x0028:
            r4 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            java.lang.String r1 = r5.getPackageName()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            r0 = 64
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            android.content.pm.Signature[] r1 = r0.signatures     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            android.content.pm.Signature[] r1 = com.obwhatsapp.yo.yo.getYoSig()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            java.lang.String r2 = r0.toCharsString()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            if (r0 != 0) goto L_0x005a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r3)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            r1.append(r2)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
            java.lang.String r3 = r1.toString()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0070 }
        L_0x005a:
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{  }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{  }
            byte[] r0 = r3.getBytes(r0)     // Catch:{  }
            byte[] r0 = r1.digest(r0)     // Catch:{  }
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r3, r0)
            goto L_0x0075
        L_0x0070:
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r3, r4)
        L_0x0075:
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r1.second
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L_0x001a
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()
            int r4 = r6.length
            r3 = 0
            r2 = 0
        L_0x0086:
            if (r2 >= r4) goto L_0x00a0
            byte r0 = r6[r2]
            java.lang.Object[] r1 = X.C13680ns.A1b()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1[r3] = r0
            java.lang.String r0 = "%02X"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x0086
        L_0x00a0:
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1200760f.A00():java.lang.String");
    }

    public String getId() {
        AnonymousClass1Vo r2;
        StringBuilder A0o;
        String str;
        C18300wT r22 = this.A01;
        String A0E = C13700nu.A0E(r22.A01(), "payments_device_id");
        if (!TextUtils.isEmpty(A0E)) {
            r2 = this.A02;
            A0o = AnonymousClass000.A0o();
            str = "PaymentDeviceId: from cache: ";
        } else {
            A0E = A00();
            C13680ns.A0y(C110105dW.A06(r22), "payments_device_id", A0E);
            r2 = this.A02;
            A0o = AnonymousClass000.A0o();
            str = "PaymentDeviceId: generated: ";
        }
        A0o.append(str);
        r2.A04(AnonymousClass000.A0h(A0E, A0o));
        return A0E;
    }
}
