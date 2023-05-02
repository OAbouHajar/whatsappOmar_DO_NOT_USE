package X;

/* renamed from: X.12Z  reason: invalid class name */
public class AnonymousClass12Z implements C16240sh {
    public final C16040sK A00;
    public final C16200sd A01;
    public final C16190sc A02;
    public final AnonymousClass12W A03;
    public final C16980tz A04;
    public final C16260sj A05;
    public final C18790xG A06;
    public final AnonymousClass12X A07;
    public final AnonymousClass12Y A08;
    public final C16230sg A09;
    public final C16990u0 A0A;
    public final AnonymousClass12V A0B;

    public AnonymousClass12Z(C16040sK r1, C16200sd r2, C16190sc r3, AnonymousClass12W r4, C16980tz r5, C16260sj r6, C18790xG r7, AnonymousClass12X r8, AnonymousClass12Y r9, C16230sg r10, C16990u0 r11, AnonymousClass12V r12) {
        this.A04 = r5;
        this.A0B = r12;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A09 = r10;
        this.A0A = r11;
        this.A08 = r9;
        this.A07 = r8;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:52|(2:54|55)|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        com.whatsapp.util.Log.w("wallpaper/v2/backup/error ", r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0133 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x013a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0185 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A5J() {
        /*
            r15 = this;
            X.0sd r7 = r15.A01
            X.0tx r12 = X.C40691uX.A06(r7)
            X.12Y r0 = r15.A08
            r0.A00(r12)
            X.0sj r1 = r15.A05
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r0 = r1.A0F(r0)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "wallpaper/v2/backup/sdcard_unavailable "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x002f:
            X.0sg r0 = r15.A09
            java.util.Set r1 = r0.A9v()
            int r0 = r1.size()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r1.getPath()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0042
            r3.add(r1)
            goto L_0x0042
        L_0x006b:
            X.0sc r5 = r15.A02
            java.util.List r6 = X.C16210se.A02(r5)
            X.0tx r4 = X.C16960tx.A08
            java.io.File r2 = r5.A02()
            if (r12 != r4) goto L_0x00a0
            java.lang.String r0 = "Wallpapers"
        L_0x007b:
            java.io.File r14 = new java.io.File
            r14.<init>(r2, r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x0084:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r1 = r2.next()
            java.io.File r1 = (java.io.File) r1
            boolean r0 = r1.equals(r14)
            if (r0 != 0) goto L_0x0084
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0084
            X.AnonymousClass1XI.A0O(r1)
            goto L_0x0084
        L_0x00a0:
            java.lang.String r0 = "wallpapers.backup.crypt"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r12.version
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x007b
        L_0x00b2:
            if (r4 != r12) goto L_0x0143
            java.io.File r1 = r5.A02()
            java.lang.String r0 = "Wallpapers"
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r0)
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x00c8
            r4.mkdirs()
        L_0x00c8:
            java.util.Iterator r7 = r3.iterator()
        L_0x00cc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r6 = r7.next()
            java.io.File r6 = (java.io.File) r6
            java.lang.String r0 = r6.getName()
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r0)
            java.io.File r1 = r2.getAbsoluteFile()
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x00ee
            r1.mkdirs()
        L_0x00ee:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x013b }
            r0.<init>(r6)     // Catch:{ Exception -> 0x013b }
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch:{ Exception -> 0x013b }
            X.12W r0 = r15.A03     // Catch:{ all -> 0x0134 }
            X.1XH r1 = r0.A00()     // Catch:{ all -> 0x0134 }
            X.1uh r0 = new X.1uh     // Catch:{ all -> 0x0134 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0134 }
            java.nio.channels.WritableByteChannel r3 = java.nio.channels.Channels.newChannel(r0)     // Catch:{ all -> 0x0134 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r2.<init>()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "wallpaper/v2/backup/size "
            r2.append(r0)     // Catch:{ all -> 0x012d }
            long r0 = r6.length()     // Catch:{ all -> 0x012d }
            r2.append(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x012d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x012d }
            X.AnonymousClass1XI.A0I(r5, r3)     // Catch:{ all -> 0x012d }
            if (r3 == 0) goto L_0x0127
            r3.close()     // Catch:{ all -> 0x0134 }
        L_0x0127:
            if (r5 == 0) goto L_0x00cc
            r5.close()     // Catch:{ Exception -> 0x013b }
            goto L_0x00cc
        L_0x012d:
            r0 = move-exception
            if (r3 == 0) goto L_0x0133
            r3.close()     // Catch:{ all -> 0x0133 }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            if (r5 == 0) goto L_0x013a
            r5.close()     // Catch:{ all -> 0x013a }
        L_0x013a:
            throw r0     // Catch:{ Exception -> 0x013b }
        L_0x013b:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/backup/error "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x00cc
        L_0x0143:
            X.12V r13 = r15.A0B     // Catch:{ Exception -> 0x0186 }
            X.0sK r5 = r15.A00     // Catch:{ Exception -> 0x0186 }
            X.0xG r9 = r15.A06     // Catch:{ Exception -> 0x0186 }
            X.12W r8 = r15.A03     // Catch:{ Exception -> 0x0186 }
            X.0u0 r11 = r15.A0A     // Catch:{ Exception -> 0x0186 }
            X.12X r10 = r15.A07     // Catch:{ Exception -> 0x0186 }
            r6 = 0
            X.1uz r1 = X.C40951ux.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0186 }
            X.0tz r0 = r15.A04     // Catch:{ Exception -> 0x0186 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0186 }
            X.5Uj r2 = r1.A02(r0)     // Catch:{ Exception -> 0x0186 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x017f }
        L_0x0160:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0179
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x017f }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x017f }
            if (r2 != 0) goto L_0x0175
            java.lang.String r0 = "wallpaper/v2/backup failed to create writer"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x017f }
            goto L_0x018d
        L_0x0175:
            r2.AiC(r0)     // Catch:{ all -> 0x017f }
            goto L_0x0160
        L_0x0179:
            if (r2 == 0) goto L_0x018d
            r2.close()     // Catch:{ Exception -> 0x0186 }
            goto L_0x018d
        L_0x017f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0185
            r2.close()     // Catch:{ all -> 0x0185 }
        L_0x0185:
            throw r0     // Catch:{ Exception -> 0x0186 }
        L_0x0186:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/backup failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x018d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12Z.A5J():boolean");
    }

    public String AA3() {
        return "wallpaper-v2";
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0134 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0146 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Aca(android.content.Context r15) {
        /*
            r14 = this;
            X.0sc r0 = r14.A02
            java.util.List r1 = X.C16210se.A02(r0)
            boolean r0 = r1.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x000e
            return r3
        L_0x000e:
            java.lang.Object r13 = r1.get(r3)
            java.io.File r13 = (java.io.File) r13
            java.lang.String r0 = "wallpaper/v2/restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tz r0 = r14.A04     // Catch:{ IOException -> 0x0151 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0151 }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ IOException -> 0x0151 }
            java.lang.String r1 = "Wallpapers"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0151 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0151 }
            java.lang.String r5 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0151 }
            X.0sg r0 = r14.A09     // Catch:{ IOException -> 0x0151 }
            java.util.Set r0 = r0.A9v()     // Catch:{ IOException -> 0x0151 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ IOException -> 0x0151 }
            r2.<init>()     // Catch:{ IOException -> 0x0151 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ IOException -> 0x0151 }
        L_0x003c:
            boolean r0 = r4.hasNext()     // Catch:{ IOException -> 0x0151 }
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r4.next()     // Catch:{ IOException -> 0x0151 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0151 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ IOException -> 0x0151 }
            java.lang.String r0 = r0.getPath()     // Catch:{ IOException -> 0x0151 }
            if (r0 == 0) goto L_0x003c
            X.AnonymousClass00B.A06(r0)     // Catch:{ IOException -> 0x0151 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0151 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0151 }
            java.lang.String r0 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0151 }
            boolean r0 = r0.startsWith(r5)     // Catch:{ IOException -> 0x0151 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r1.getName()     // Catch:{ IOException -> 0x0151 }
            r2.put(r0, r1)     // Catch:{ IOException -> 0x0151 }
            goto L_0x003c
        L_0x006c:
            java.lang.String r0 = "wallpaper/v2/restore wallpaper file outside of the wallpaper directory"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0151 }
            goto L_0x003c
        L_0x0073:
            boolean r0 = r2.isEmpty()     // Catch:{ IOException -> 0x0151 }
            if (r0 != 0) goto L_0x0158
            X.0tx r4 = X.C16960tx.A08     // Catch:{ IOException -> 0x0151 }
            java.lang.String r0 = r13.getName()     // Catch:{ IOException -> 0x0151 }
            java.lang.String r1 = "wallpapers.backup"
            int r0 = X.C40691uX.A01(r0, r1)     // Catch:{ IOException -> 0x0151 }
            if (r0 <= 0) goto L_0x00c9
            X.0tx r0 = X.C16960tx.A02(r0)     // Catch:{ IOException -> 0x0151 }
            if (r0 == 0) goto L_0x00c9
            if (r4 == r0) goto L_0x00c9
            java.lang.String r0 = r13.getName()     // Catch:{ Exception -> 0x00c0 }
            int r0 = X.C40691uX.A01(r0, r1)     // Catch:{ Exception -> 0x00c0 }
            if (r0 <= 0) goto L_0x00be
            X.0tx r11 = X.C16960tx.A02(r0)     // Catch:{ Exception -> 0x00c0 }
            if (r11 == 0) goto L_0x00be
        L_0x00a0:
            X.12V r12 = r14.A0B     // Catch:{ Exception -> 0x00c0 }
            X.0sK r4 = r14.A00     // Catch:{ Exception -> 0x00c0 }
            X.0xG r8 = r14.A06     // Catch:{ Exception -> 0x00c0 }
            X.0sd r6 = r14.A01     // Catch:{ Exception -> 0x00c0 }
            X.12W r7 = r14.A03     // Catch:{ Exception -> 0x00c0 }
            X.0u0 r10 = r14.A0A     // Catch:{ Exception -> 0x00c0 }
            X.12X r9 = r14.A07     // Catch:{ Exception -> 0x00c0 }
            r5 = 0
            X.1uz r4 = X.C40951ux.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00c0 }
            r1 = 2
            com.facebook.redex.IDxFunctionShape361S0100000_2_I0 r0 = new com.facebook.redex.IDxFunctionShape361S0100000_2_I0     // Catch:{ Exception -> 0x00c0 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00c0 }
            r4.A05(r0, r3)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x0158
        L_0x00be:
            r11 = r4
            goto L_0x00a0
        L_0x00c0:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/restore/failed "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ IOException -> 0x0151 }
            goto L_0x0158
        L_0x00c9:
            boolean r0 = r13.isDirectory()     // Catch:{ IOException -> 0x0151 }
            if (r0 == 0) goto L_0x0158
            java.io.File[] r7 = r13.listFiles()     // Catch:{ IOException -> 0x0151 }
            if (r7 == 0) goto L_0x0158
            int r6 = r7.length     // Catch:{ IOException -> 0x0151 }
            r5 = 0
        L_0x00d7:
            if (r5 >= r6) goto L_0x0158
            r8 = r7[r5]     // Catch:{ IOException -> 0x0151 }
            java.lang.String r0 = r8.getName()     // Catch:{ IOException -> 0x0151 }
            java.lang.Object r9 = r2.get(r0)     // Catch:{ IOException -> 0x0151 }
            java.io.File r9 = (java.io.File) r9     // Catch:{ IOException -> 0x0151 }
            if (r9 == 0) goto L_0x014e
            java.io.File r1 = r9.getParentFile()     // Catch:{ IOException -> 0x0151 }
            if (r1 == 0) goto L_0x00f6
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x0151 }
            if (r0 != 0) goto L_0x00f6
            r1.mkdirs()     // Catch:{ IOException -> 0x0151 }
        L_0x00f6:
            java.lang.String r0 = "wallpaper/v2/restore/copy "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0151 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0151 }
            java.lang.String r0 = r9.getName()     // Catch:{ IOException -> 0x0151 }
            r4.append(r0)     // Catch:{ IOException -> 0x0151 }
            java.lang.String r0 = " "
            r4.append(r0)     // Catch:{ IOException -> 0x0151 }
            long r0 = r8.length()     // Catch:{ IOException -> 0x0151 }
            r4.append(r0)     // Catch:{ IOException -> 0x0151 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0151 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0151 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0147 }
            r0.<init>(r9, r3)     // Catch:{ IOException -> 0x0147 }
            java.nio.channels.WritableByteChannel r4 = java.nio.channels.Channels.newChannel(r0)     // Catch:{ IOException -> 0x0147 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0140 }
            r0.<init>(r8)     // Catch:{ all -> 0x0140 }
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch:{ all -> 0x0140 }
            X.AnonymousClass1XI.A0I(r1, r4)     // Catch:{ all -> 0x012e }
            goto L_0x0135
        L_0x012e:
            r0 = move-exception
            if (r1 == 0) goto L_0x0134
            r1.close()     // Catch:{ all -> 0x0134 }
        L_0x0134:
            throw r0     // Catch:{ all -> 0x0140 }
        L_0x0135:
            if (r1 == 0) goto L_0x013a
            r1.close()     // Catch:{ all -> 0x0140 }
        L_0x013a:
            if (r4 == 0) goto L_0x014e
            r4.close()     // Catch:{ IOException -> 0x0147 }
            goto L_0x014e
        L_0x0140:
            r0 = move-exception
            if (r4 == 0) goto L_0x0146
            r4.close()     // Catch:{ all -> 0x0146 }
        L_0x0146:
            throw r0     // Catch:{ IOException -> 0x0147 }
        L_0x0147:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/restore/ioerror "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ IOException -> 0x0151 }
        L_0x014e:
            int r5 = r5 + 1
            goto L_0x00d7
        L_0x0151:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/restore failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0158:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12Z.Aca(android.content.Context):boolean");
    }
}
