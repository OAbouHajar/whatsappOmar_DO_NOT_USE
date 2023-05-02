package X;

import com.obwhatsapp.R;

/* renamed from: X.1UQ  reason: invalid class name */
public class AnonymousClass1UQ {
    public static C33191iB A02;
    public static volatile boolean A03;
    public final C33161i8 A00;
    public final C33141i6 A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1UQ(android.content.Context r5, android.content.res.Resources r6, X.C33141i6 r7, java.util.Locale r8) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r1 = r8.getLanguage()
            java.lang.String r0 = "en"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r3 = r8.getCountry()
            java.lang.String r2 = "en-US"
            r1 = r2
            X.1aD r0 = X.C33151i7.A00     // Catch:{ IllegalArgumentException -> 0x001f }
            java.lang.Object r0 = r0.A01(r3)     // Catch:{ IllegalArgumentException -> 0x001f }
            if (r0 == 0) goto L_0x001f
            r2 = r0
        L_0x001f:
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0027
            r0 = 0
            goto L_0x003f
        L_0x0027:
            java.lang.String r2 = X.AnonymousClass1WH.A06(r8)
            java.lang.String r1 = "strings_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            r0 = 0
            X.1i8 r0 = A00(r5, r6, r1, r8, r0)
        L_0x003f:
            r4.A00 = r0
            r4.A01 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UQ.<init>(android.content.Context, android.content.res.Resources, X.1i6, java.util.Locale):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        if (A03 != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0194, code lost:
        if (r3 == false) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ef A[Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:102:0x0280=Splitter:B:102:0x0280, B:98:0x026a=Splitter:B:98:0x026a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C33161i8 A00(android.content.Context r17, android.content.res.Resources r18, java.lang.String r19, java.util.Locale r20, boolean r21) {
        /*
            java.lang.String r1 = "translations/loadData error:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r19
            r0.append(r5)
            java.lang.String r10 = ".pack"
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r13 = 0
            r2 = 1
            r0 = 0
            if (r21 == 0) goto L_0x0020
            boolean r4 = A03     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r3 = 0
            if (r4 == 0) goto L_0x0021
        L_0x0020:
            r3 = 1
        L_0x0021:
            r15 = r17
            java.io.File r7 = r15.getFilesDir()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            if (r3 == 0) goto L_0x00b1
            java.lang.Class<X.01F> r3 = X.AnonymousClass01F.class
            java.lang.Object r3 = X.AnonymousClass01I.A00(r15, r3)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            X.01F r3 = (X.AnonymousClass01F) r3     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            X.0sX r3 = (X.C16150sX) r3     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            X.01J r3 = r3.ARA     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.Object r7 = r3.get()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            X.1Hu r7 = (X.C24921Hu) r7     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r4.<init>()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r4.append(r5)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.String r3 = ".spk.br"
            r4.append(r3)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.String r6 = r4.toString()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.io.File r5 = r15.getFilesDir()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.String r4 = "decompressed"
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r3.<init>(r5, r4)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r4.<init>(r3, r6)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r3.<init>(r4, r8)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            boolean r4 = r3.exists()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            if (r4 == 0) goto L_0x0078
            X.10L r4 = r7.A03     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            boolean r4 = r4.A02(r15, r6)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            if (r4 == 0) goto L_0x0078
        L_0x006f:
            java.lang.String r5 = "r"
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            goto L_0x010c
        L_0x0078:
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0219 }
            X.10L r14 = r7.A03     // Catch:{ Exception -> 0x0219 }
            r18 = 1
            r19 = 0
            r17 = 1
            r16 = r6
            boolean r4 = r14.A04(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0219 }
            if (r4 == 0) goto L_0x00a3
            long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0219 }
            long r8 = r8 - r10
            X.1U4 r5 = new X.1U4     // Catch:{ Exception -> 0x0219 }
            r5.<init>()     // Catch:{ Exception -> 0x0219 }
            r5.A01 = r6     // Catch:{ Exception -> 0x0219 }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0219 }
            r5.A00 = r4     // Catch:{ Exception -> 0x0219 }
            X.0t9 r4 = r7.A02     // Catch:{ Exception -> 0x0219 }
            r4.A06(r5)     // Catch:{ Exception -> 0x0219 }
        L_0x00a3:
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0219 }
            if (r4 != 0) goto L_0x006f
            java.lang.String r2 = "Decompression failed: File does not exist"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0219 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0219 }
            throw r0     // Catch:{ Exception -> 0x0219 }
        L_0x00b1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r9.<init>()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r9.append(r5)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.String r3 = "_"
            r9.append(r3)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.String r4 = r15.getPackageCodePath()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            long r3 = r3.lastModified()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            r9.append(r3)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r9.append(r10)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.String r4 = r9.toString()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r3.<init>(r7, r4)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            boolean r4 = r3.exists()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            if (r4 != 0) goto L_0x006f
            java.lang.String r4 = "extracted_pack_file.pack.tmp"
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            android.content.res.AssetManager r4 = r18.getAssets()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.io.InputStream r4 = r4.open(r8)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            X.AnonymousClass1XI.A0H(r4, r5)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r5.close()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            boolean r4 = r6.renameTo(r3)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            if (r4 != 0) goto L_0x006f
            java.lang.String r0 = "Renaming temp file failed"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            goto L_0x0263
        L_0x010c:
            java.nio.channels.FileChannel r14 = r4.getChannel()     // Catch:{ IOException -> 0x0216, IndexOutOfBoundsException -> 0x0213, all -> 0x029b }
            java.nio.channels.FileChannel$MapMode r15 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            r16 = 0
            long r18 = r3.length()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.nio.MappedByteBuffer r10 = r14.map(r15, r16, r18)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r9 = r20.getLanguage()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r3 = "fil"
            boolean r3 = r3.equals(r9)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 == 0) goto L_0x01de
            java.lang.String r9 = "tl"
        L_0x012b:
            java.lang.String r8 = r20.getCountry()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r7 = X.AnonymousClass1WH.A02(r20)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            r6 = 2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r21 != 0) goto L_0x0151
            java.lang.String r3 = "en"
            boolean r3 = r3.equals(r9)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 == 0) goto L_0x0151
            java.lang.String r11 = "en-US"
            X.1aD r3 = X.C33151i7.A00     // Catch:{ IllegalArgumentException -> 0x01bc }
            java.lang.Object r3 = r3.A01(r8)     // Catch:{ IllegalArgumentException -> 0x01bc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalArgumentException -> 0x01bc }
            if (r3 == 0) goto L_0x01bc
            r11 = r3
            goto L_0x01bc
        L_0x0151:
            java.lang.String r12 = "pt"
            boolean r3 = r12.equals(r9)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 == 0) goto L_0x01a8
            X.01i r11 = X.C33171i9.A00     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r3 = r20.getCountry()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            boolean r3 = r11.contains(r3)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 != 0) goto L_0x0167
            java.lang.String r12 = "pt-BR"
        L_0x0167:
            r5.add(r12)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
        L_0x016a:
            int r3 = r8.length()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 != r6) goto L_0x01e9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            r6.<init>()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            r6.append(r9)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r3 = "-"
            r6.append(r3)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            r6.append(r8)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            boolean r3 = r5.isEmpty()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 != 0) goto L_0x0196
            java.lang.Object r3 = r5.get(r0)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            boolean r3 = r3.equals(r6)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 != 0) goto L_0x01e9
        L_0x0196:
            java.util.Locale r3 = X.AnonymousClass1WH.A09(r6)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r3 = X.AnonymousClass1WH.A02(r3)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            boolean r3 = r7.equals(r3)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 == 0) goto L_0x01e9
            r5.add(r6)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            goto L_0x01e9
        L_0x01a8:
            java.lang.String r3 = "zh"
            boolean r3 = r3.equals(r9)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 == 0) goto L_0x01cc
            java.lang.String r3 = "Hans"
            boolean r3 = r7.equals(r3)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 == 0) goto L_0x01c0
            java.lang.String r11 = "zh-CN"
        L_0x01bc:
            r5.add(r11)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            goto L_0x016a
        L_0x01c0:
            java.lang.String r3 = "Hant"
            boolean r3 = r7.equals(r3)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 == 0) goto L_0x016a
            java.lang.String r11 = "zh-TW"
            goto L_0x01bc
        L_0x01cc:
            java.util.Locale r3 = X.AnonymousClass1WH.A09(r9)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r3 = X.AnonymousClass1WH.A02(r3)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            boolean r3 = r7.equals(r3)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 == 0) goto L_0x016a
            r5.add(r9)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            goto L_0x016a
        L_0x01de:
            int r5 = r9.length()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            r3 = 3
            if (r5 != r3) goto L_0x012b
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
        L_0x01e9:
            boolean r3 = r5.isEmpty()     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            if (r3 == 0) goto L_0x0203
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r6 = "translations/loadData error: locale '%s' not supported"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r2 = X.AnonymousClass1WH.A05(r20)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            r3[r0] = r2     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            java.lang.String r0 = java.lang.String.format(r7, r6, r3)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
        L_0x0203:
            X.1i8 r0 = new X.1i8     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            r0.<init>(r10, r5)     // Catch:{ IOException -> 0x0211, IndexOutOfBoundsException -> 0x020f }
            X.C30311c8.A04(r4)
            X.C30311c8.A04(r14)
            return r0
        L_0x020f:
            r2 = move-exception
            goto L_0x026a
        L_0x0211:
            r2 = move-exception
            goto L_0x0280
        L_0x0213:
            r2 = move-exception
            r14 = r13
            goto L_0x026a
        L_0x0216:
            r2 = move-exception
            r14 = r13
            goto L_0x0280
        L_0x0219:
            r9 = move-exception
            java.lang.String r4 = r9.toString()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            X.0rz r11 = r7.A00     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r10 = "decompression_failure_reported_timestamp"
            boolean r0 = r11.A1n(r10, r2)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            if (r0 == 0) goto L_0x0249
            X.1iA r8 = new X.1iA     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r8.<init>()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r8.A01 = r6     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r8.A02 = r4     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            X.0pf r0 = r7.A01     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            long r4 = r0.A02()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            double r2 = (double) r4     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r8.A00 = r0     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            X.0t9 r0 = r7.A02     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r0.A06(r8)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r11.A0x(r10)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
        L_0x0249:
            java.lang.String r2 = "Error decompressing archive "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r0.append(r6)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            com.whatsapp.util.Log.w(r0, r9)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.lang.String r0 = r9.getMessage()     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
        L_0x0263:
            throw r2     // Catch:{ IOException -> 0x027d, IndexOutOfBoundsException -> 0x0267, all -> 0x0264 }
        L_0x0264:
            r0 = move-exception
            r14 = r13
            goto L_0x029e
        L_0x0267:
            r2 = move-exception
            r4 = r13
            r14 = r13
        L_0x026a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0299 }
            r0.<init>()     // Catch:{ all -> 0x0299 }
            r0.append(r1)     // Catch:{ all -> 0x0299 }
            r0.append(r2)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0299 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0299 }
            goto L_0x0292
        L_0x027d:
            r2 = move-exception
            r4 = r13
            r14 = r13
        L_0x0280:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0299 }
            r0.<init>()     // Catch:{ all -> 0x0299 }
            r0.append(r1)     // Catch:{ all -> 0x0299 }
            r0.append(r2)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0299 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0299 }
        L_0x0292:
            X.C30311c8.A04(r4)
            X.C30311c8.A04(r14)
            return r13
        L_0x0299:
            r0 = move-exception
            goto L_0x029d
        L_0x029b:
            r0 = move-exception
            r14 = r13
        L_0x029d:
            r13 = r4
        L_0x029e:
            X.C30311c8.A04(r13)
            X.C30311c8.A04(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UQ.A00(android.content.Context, android.content.res.Resources, java.lang.String, java.util.Locale, boolean):X.1i8");
    }

    public static void A01(C33191iB r0) {
        A02 = r0;
    }

    public static void A02(boolean z2) {
        A03 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r4 = (r7 - com.obwhatsapp.R.string.str0000) + 407;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A03(int r7) {
        /*
            r6 = this;
            X.1i8 r5 = r6.A00
            r2 = 0
            if (r5 == 0) goto L_0x0030
            r1 = 2131886080(0x7f120000, float:1.9406729E38)
            if (r7 < r1) goto L_0x0030
            r0 = 2131893164(0x7f121bac, float:1.9421097E38)
            if (r7 > r0) goto L_0x0030
            int r7 = r7 - r1
            int r4 = r7 + 407
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            if (r3 == 0) goto L_0x0030
            java.util.concurrent.ConcurrentHashMap r2 = r5.A02
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x002f
            r1 = 0
            X.1iC r0 = r5.A00
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = r0.A02(r4)
            if (r1 == 0) goto L_0x002f
            r2.put(r3, r1)
        L_0x002f:
            return r1
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UQ.A03(int):java.lang.String");
    }

    public String A04(int i2, String str) {
        C33161i8 r2 = this.A00;
        if (r2 == null) {
            return null;
        }
        int i3 = i2 - R.plurals.plurals0000;
        if (Integer.valueOf(i3) != null) {
            return r2.A00(this.A01, str, i3);
        }
        return null;
    }

    public String A05(long j2, int i2) {
        Long valueOf = Long.valueOf(j2);
        C33161i8 r3 = this.A00;
        if (r3 == null || i2 < R.plurals.plurals0000 || i2 > R.plurals.plurals0196) {
            return null;
        }
        int i3 = i2 - R.plurals.plurals0000;
        if (Integer.valueOf(i3) != null) {
            return r3.A00(this.A01, valueOf, i3);
        }
        return null;
    }
}
