package X;

/* renamed from: X.1GI  reason: invalid class name */
public class AnonymousClass1GI {
    public final C16180sb A00;
    public final C16920ts A01;
    public final C16900tq A02;
    public final C17340uv A03;
    public final C23351Bq A04;
    public final C16370sv A05;
    public final C16350st A06;

    public AnonymousClass1GI(C16180sb r1, C16920ts r2, C16900tq r3, C17340uv r4, C23351Bq r5, C16370sv r6, C16350st r7) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|(3:21|22|(10:24|25|26|27|28|29|30|31|32|77)(1:76))(1:75)|74|17|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00d4 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d A[Catch:{ all -> 0x00c6, all -> 0x00ca, all -> 0x00cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A00(X.C108895Px r14) {
        /*
            r13 = this;
            X.0sv r2 = r13.A05
            r2.A04()
            android.os.CancellationSignal r1 = new android.os.CancellationSignal     // Catch:{ IOException -> 0x00dd }
            r1.<init>()     // Catch:{ IOException -> 0x00dd }
            X.1Bq r10 = r13.A04     // Catch:{ IOException -> 0x00dd }
            java.lang.String r0 = "messages"
            java.io.File r3 = r10.A00(r0)     // Catch:{ IOException -> 0x00dd }
            X.0uv r0 = r13.A03     // Catch:{ IOException -> 0x00dd }
            r0.A0G(r1, r14, r3)     // Catch:{ IOException -> 0x00dd }
            java.lang.String r0 = "ChatExporter/doExport()/data-exported"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x00dd }
            java.lang.String r1 = "migration/messages_export.zip"
            r0 = 1
            long r5 = r2.A02(r3, r1, r0)     // Catch:{ IOException -> 0x00dd }
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00d5
            X.0sb r0 = r13.A00     // Catch:{ IOException -> 0x00dd }
            X.0tz r0 = r0.A03     // Catch:{ IOException -> 0x00dd }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x00dd }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ IOException -> 0x00dd }
            java.lang.String r0 = "export"
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x00dd }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x00dd }
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x00dd }
            if (r0 != 0) goto L_0x0043
            r4.mkdir()     // Catch:{ IOException -> 0x00dd }
        L_0x0043:
            java.lang.String r3 = "messages_archive.zip"
            java.lang.String r1 = "[?:\\\\/*\"<>|]"
            java.lang.String r0 = ""
            java.lang.String r0 = r3.replaceAll(r1, r0)     // Catch:{ IOException -> 0x00dd }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x00dd }
            r9.<init>(r4, r0)     // Catch:{ IOException -> 0x00dd }
            boolean r0 = r9.exists()     // Catch:{ IOException -> 0x00dd }
            if (r0 == 0) goto L_0x005b
            r9.delete()     // Catch:{ IOException -> 0x00dd }
        L_0x005b:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00dd }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00dd }
            java.util.zip.ZipOutputStream r7 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x00d0 }
            r7.<init>(r8)     // Catch:{ all -> 0x00d0 }
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x00cb }
            android.os.CancellationSignal r6 = new android.os.CancellationSignal     // Catch:{ all -> 0x00cb }
            r6.<init>()     // Catch:{ all -> 0x00cb }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x00cb }
            r5.<init>()     // Catch:{ all -> 0x00cb }
            X.57f r12 = r2.A03()     // Catch:{ all -> 0x00cb }
        L_0x0077:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x00c6 }
            X.4No r0 = (X.C85214No) r0     // Catch:{ all -> 0x00c6 }
            java.io.File r4 = r0.A02     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = r0.A04     // Catch:{ all -> 0x00c6 }
            boolean r0 = r5.contains(r3)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x0077
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x0077 }
            if (r0 == 0) goto L_0x0077
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ IOException -> 0x0077 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0077 }
            r7.putNextEntry(r0)     // Catch:{ IOException -> 0x0077 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b2 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x00b2 }
            X.C16350st.A01(r6, r1, r7, r11)     // Catch:{ all -> 0x00ad }
            r1.close()     // Catch:{ IOException -> 0x00b2 }
            r7.closeEntry()     // Catch:{ IOException -> 0x00b2 }
            r5.add(r3)     // Catch:{ IOException -> 0x0077 }
            goto L_0x0077
        L_0x00ad:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            throw r0     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            r7.closeEntry()     // Catch:{ IOException -> 0x0077 }
            goto L_0x0077
        L_0x00b6:
            r12.close()     // Catch:{ all -> 0x00cb }
            r7.close()     // Catch:{ all -> 0x00d0 }
            r8.close()     // Catch:{ IOException -> 0x00dd }
            r2.A04()
            r10.A01()
            return r9
        L_0x00c6:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            throw r0     // Catch:{ IOException -> 0x00dd }
        L_0x00d5:
            java.lang.String r1 = "Failed to register master file."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00dd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00dd }
            throw r0     // Catch:{ IOException -> 0x00dd }
        L_0x00dd:
            r1 = move-exception
            java.lang.String r0 = "ChatExporter/Failed to export and assemble data."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00ed }
            r9 = 0
            r2.A04()
            X.1Bq r0 = r13.A04
            r0.A01()
            return r9
        L_0x00ed:
            r1 = move-exception
            r2.A04()
            X.1Bq r0 = r13.A04
            r0.A01()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GI.A00(X.5Px):java.io.File");
    }
}
