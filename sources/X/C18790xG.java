package X;

/* renamed from: X.0xG  reason: invalid class name and case insensitive filesystem */
public class C18790xG {
    public final C18800xH A00;
    public final C18780xF A01;

    public C18790xG(C18800xH r1, C18780xF r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00b2 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077 A[SYNTHETIC, Splitter:B:33:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.Runnable r9, java.util.List r10) {
        /*
            r8 = this;
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r7 = r10.iterator()
        L_0x0009:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r5 = r7.next()
            java.io.File r5 = (java.io.File) r5
            r5.getPath()
            java.lang.String r0 = r5.getName()
            X.0tx r1 = X.C40721ua.A00(r0)
            X.0tx r0 = X.C16960tx.A04
            if (r1 != r0) goto L_0x0080
            java.lang.String r4 = "backupcipher/db/get/ioerror "
            boolean r1 = r5.exists()
            r0 = 0
            if (r1 != 0) goto L_0x0038
            java.lang.String r0 = "backupkey/db/getparams/does-not-exist"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0032:
            java.lang.String r0 = "backupencryption/getkeysforbackups/no-cipher/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0009
        L_0x0038:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ 03R -> 0x006e, FileNotFoundException -> 0x0053, IOException -> 0x004b, all -> 0x00c7 }
            r6.<init>(r5)     // Catch:{ 03R -> 0x006e, FileNotFoundException -> 0x0053, IOException -> 0x004b, all -> 0x00c7 }
            X.1ub r5 = X.C40691uX.A03(r6)     // Catch:{ 03R -> 0x0049, FileNotFoundException -> 0x0047, IOException -> 0x0045 }
            r6.close()     // Catch:{ Exception -> 0x0091 }
            goto L_0x0095
        L_0x0045:
            r1 = move-exception
            goto L_0x004d
        L_0x0047:
            r3 = move-exception
            goto L_0x0055
        L_0x0049:
            r1 = move-exception
            goto L_0x0070
        L_0x004b:
            r1 = move-exception
            r6 = r0
        L_0x004d:
            java.lang.String r0 = "backupcipher/db/get/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00bb }
            goto L_0x0075
        L_0x0053:
            r3 = move-exception
            r6 = r0
        L_0x0055:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r1.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "backupcipher/db/get/can't find "
            r1.append(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x00bb }
            r1.append(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bb }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x00bb }
            goto L_0x0075
        L_0x006e:
            r1 = move-exception
            r6 = r0
        L_0x0070:
            java.lang.String r0 = "backupcipher/header-mismatch"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00bb }
        L_0x0075:
            if (r6 == 0) goto L_0x0032
            r6.close()     // Catch:{ Exception -> 0x007b }
            goto L_0x0032
        L_0x007b:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
            goto L_0x0032
        L_0x0080:
            X.0tx r0 = X.C16960tx.A06
            if (r1 != r0) goto L_0x0032
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b3 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x00b3 }
            X.1ub r5 = X.C40691uX.A04(r1)     // Catch:{ all -> 0x00ae }
            r1.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x0095
        L_0x0091:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x0095:
            if (r5 == 0) goto L_0x0032
            byte[] r0 = r5.A02
            byte[] r4 = X.C40691uX.A0G(r0)
            java.lang.String r3 = r5.A00
            byte[] r1 = r5.A04
            X.1uc r0 = new X.1uc
            r0.<init>(r3, r1, r4)
            r2.contains(r0)
            r2.add(r0)
            goto L_0x0009
        L_0x00ae:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            throw r0     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            java.lang.String r0 = "readProtobufBackupCipher/failed"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0032
        L_0x00bb:
            r1 = move-exception
            if (r6 == 0) goto L_0x00c8
            r6.close()     // Catch:{ Exception -> 0x00c2 }
            throw r1
        L_0x00c2:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
            throw r1
        L_0x00c7:
            r1 = move-exception
        L_0x00c8:
            throw r1
        L_0x00c9:
            int r7 = r2.size()
            java.lang.String r0 = "backupencryption/getkeys/size "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = " (backups="
            r1.append(r0)
            int r0 = r10.size()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xF r0 = r8.A01
            java.util.HashMap r0 = r0.A00
            r0.clear()
            java.util.Iterator r6 = r2.iterator()
        L_0x00fa:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r2 = r6.next()
            X.1uc r2 = (X.C40741uc) r2
            java.lang.String r1 = "backupencryption/getkeysforencryptedbackups/v="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r5 = r2.A00
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r4 = r2.A02
            java.util.Arrays.toString(r4)
            byte[] r3 = r2.A01
            java.util.Arrays.toString(r3)
            X.0xH r2 = r8.A00
            r1 = 16
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r0.<init>((java.lang.Object) r8, (int) r7, (java.lang.Object) r9, (int) r1)
            r2.A00(r0, r5, r4, r3)
            goto L_0x00fa
        L_0x0130:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18790xG.A00(java.lang.Runnable, java.util.List):int");
    }
}
