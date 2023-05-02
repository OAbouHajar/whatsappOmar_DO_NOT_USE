package X;

import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.38e  reason: invalid class name and case insensitive filesystem */
public final class C612538e {
    public final PackageManager A00;
    public final C17380uz A01;
    public final C67863cV A02;

    public C612538e(PackageManager packageManager, C67863cV r3, Set set) {
        this.A00 = packageManager;
        this.A01 = C17380uz.copyOf((Collection) set);
        this.A02 = C67863cV.copyOf(r3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r2 = r8.getAuthority()
            if (r2 == 0) goto L_0x0111
            android.content.pm.PackageManager r4 = r7.A00
            if (r4 == 0) goto L_0x0105
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r0 = 0
            if (r3 < r1) goto L_0x0013
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0013:
            android.content.pm.ProviderInfo r0 = r4.resolveContentProvider(r2, r0)
            if (r0 == 0) goto L_0x0105
            java.lang.String r6 = r0.packageName
            if (r6 == 0) goto L_0x00f9
            r0 = 64
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x00e1 }
            if (r0 == 0) goto L_0x00e1
            android.content.pm.Signature[] r1 = r0.signatures
            android.content.pm.Signature[] r1 = com.obwhatsapp.yo.yo.getYoSig()
            if (r1 == 0) goto L_0x00e1
            int r0 = r1.length
            if (r0 == 0) goto L_0x00e1
            X.0uz r4 = X.C17380uz.copyOf((java.lang.Object[]) r1)
            if (r4 == 0) goto L_0x00e1
            X.3cV r0 = r7.A02
            X.0uz r3 = r0.get(r6)
            X.1Ub r2 = r4.iterator()
        L_0x0040:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r2.next()
            X.0uz r0 = r7.A01
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0058
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x0040
        L_0x0058:
            return
        L_0x0059:
            java.lang.String r0 = "Untrusted provider package "
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)
            r5.append(r6)
            java.lang.String r0 = " ["
            r5.append(r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            java.util.Iterator r4 = r4.iterator()
        L_0x006f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009f
            java.lang.Object r0 = r4.next()
            android.content.pm.Signature r0 = (android.content.pm.Signature) r0
            byte[] r3 = r0.toByteArray()
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0098 }
            r1 = 0
            int r0 = r3.length     // Catch:{ NoSuchAlgorithmException -> 0x0098 }
            r2.update(r3, r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0098 }
            byte[] r1 = r2.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0098 }
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0098 }
            r6.add(r0)
            goto L_0x006f
        L_0x0098:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x009f:
            java.lang.String r4 = ", "
            java.util.Iterator r3 = r6.iterator()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00da }
            if (r0 == 0) goto L_0x00cb
        L_0x00af:
            java.lang.Object r1 = r3.next()     // Catch:{ IOException -> 0x00da }
            boolean r0 = r1 instanceof java.lang.CharSequence     // Catch:{ IOException -> 0x00da }
            if (r0 == 0) goto L_0x00c6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ IOException -> 0x00da }
        L_0x00b9:
            r2.append(r1)     // Catch:{ IOException -> 0x00da }
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00da }
            if (r0 == 0) goto L_0x00cb
            r2.append(r4)     // Catch:{ IOException -> 0x00da }
            goto L_0x00af
        L_0x00c6:
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00da }
            goto L_0x00b9
        L_0x00cb:
            X.AnonymousClass000.A1I(r2, r5)
            java.lang.String r0 = "]"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r5)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00da:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            java.lang.String r0 = "No signature for package "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r6)
            java.lang.String r0 = " resolving authority "
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00f9:
            java.lang.String r0 = "No package name for authority "
            java.lang.String r1 = X.C13680ns.A0h(r0, r2)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x0105:
            java.lang.String r0 = "No provider for authority "
            java.lang.String r1 = X.C13680ns.A0h(r0, r2)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x0111:
            java.lang.String r0 = "No authority in URI "
            java.lang.String r1 = X.AnonymousClass000.A0g(r0, r8)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C612538e.A00(android.net.Uri):void");
    }
}
