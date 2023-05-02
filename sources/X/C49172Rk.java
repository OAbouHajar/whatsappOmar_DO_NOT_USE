package X;

/* renamed from: X.2Rk  reason: invalid class name and case insensitive filesystem */
public class C49172Rk {
    public final C16300so A00;
    public final C16980tz A01;
    public final C16260sj A02;
    public final C20350zu A03;

    public C49172Rk(C16300so r1, C16980tz r2, C16260sj r3, C20350zu r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if ((r1 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        if (r2 != 3) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2BC A00(X.C35341ll r13) {
        /*
            r12 = this;
            int r2 = r13.A01
            int r1 = r13.A00
            int r10 = r13.A02
            java.lang.String r9 = r13.A03
            boolean r0 = r13.A05
            if (r0 != 0) goto L_0x011f
            X.0tz r7 = r12.A01
            android.content.Context r0 = r7.A00
            android.content.ContentResolver r0 = r0.getContentResolver()
            if (r0 == 0) goto L_0x011f
            java.lang.String r4 = android.os.Environment.getExternalStorageState()
            X.0sj r5 = r12.A02
            boolean r0 = r5.A0F(r4)
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0039
            X.0tz r0 = r5.A00
            android.content.Context r3 = r0.A00
            r0 = 0
            java.lang.String[] r0 = X.C28971Zm.A00(r3, r0, r0)
            int r0 = r5.A04(r0)
            if (r0 == 0) goto L_0x0051
        L_0x0039:
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0060
            X.0tz r0 = r5.A00
            android.content.Context r4 = r0.A00
            r3 = 0
            r0 = 1
            java.lang.String[] r0 = X.C28971Zm.A00(r4, r0, r3)
            int r0 = r5.A04(r0)
            if (r0 != 0) goto L_0x0060
        L_0x0051:
            r4 = 1
        L_0x0052:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 1
            if (r4 == 0) goto L_0x00bd
            if (r2 == r3) goto L_0x00c2
            r4 = 7
            if (r1 != r4) goto L_0x0087
            goto L_0x0062
        L_0x0060:
            r4 = 0
            goto L_0x0052
        L_0x0062:
            X.0zu r8 = r12.A03     // Catch:{ SQLiteException -> 0x0075 }
            java.lang.String r4 = "external"
            android.net.Uri r6 = android.provider.MediaStore.Files.getContentUri(r4)     // Catch:{ SQLiteException -> 0x0075 }
            boolean r11 = r13.A04     // Catch:{ SQLiteException -> 0x0075 }
            X.2b2 r5 = new X.2b2     // Catch:{ SQLiteException -> 0x0075 }
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0075 }
            r0.add(r5)     // Catch:{ SQLiteException -> 0x0075 }
            goto L_0x00bd
        L_0x0075:
            r5 = move-exception
            java.lang.String r4 = "mediamanager/makeMediaList exception"
            com.whatsapp.util.Log.e(r4, r5)
            X.0so r6 = r12.A00
            java.lang.String r5 = r5.getMessage()
            java.lang.String r4 = "mediamanager/makemedialist/sqliteexception"
            r6.AcB(r4, r5, r3)
            goto L_0x008b
        L_0x0087:
            r4 = r1 & 1
            if (r4 == 0) goto L_0x0099
        L_0x008b:
            X.0zu r8 = r12.A03
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            boolean r11 = r13.A04
            X.2b4 r5 = new X.2b4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.add(r5)
        L_0x0099:
            r4 = r1 & 4
            if (r4 == 0) goto L_0x00ab
            X.0zu r8 = r12.A03
            android.net.Uri r6 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            boolean r11 = r13.A04
            X.2b8 r5 = new X.2b8
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.add(r5)
        L_0x00ab:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x00bd
            X.0zu r8 = r12.A03
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            boolean r11 = r13.A04
            X.2b5 r5 = new X.2b5
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.add(r5)
        L_0x00bd:
            if (r2 == r3) goto L_0x00c2
            r4 = 3
            if (r2 != r4) goto L_0x00e6
        L_0x00c2:
            r2 = r1 & 1
            if (r2 == 0) goto L_0x00d4
            X.0zu r8 = r12.A03
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            boolean r11 = r13.A04
            X.2b4 r5 = new X.2b4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.add(r5)
        L_0x00d4:
            r1 = r1 & 2
            if (r1 == 0) goto L_0x00e6
            X.0zu r8 = r12.A03
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            boolean r11 = r13.A04
            X.2b5 r5 = new X.2b5
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.add(r5)
        L_0x00e6:
            java.util.Iterator r4 = r0.iterator()
        L_0x00ea:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0103
            java.lang.Object r2 = r4.next()
            X.2b3 r2 = (X.C51142b3) r2
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x00ea
            r2.close()
            r4.remove()
            goto L_0x00ea
        L_0x0103:
            int r2 = r0.size()
            r1 = 0
            if (r2 != r3) goto L_0x0111
            java.lang.Object r1 = r0.get(r1)
            X.2BC r1 = (X.AnonymousClass2BC) r1
            return r1
        L_0x0111:
            X.2BC[] r1 = new X.AnonymousClass2BC[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            X.2BC[] r0 = (X.AnonymousClass2BC[]) r0
            X.2b6 r1 = new X.2b6
            r1.<init>(r0, r10)
            return r1
        L_0x011f:
            X.2b7 r1 = new X.2b7
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49172Rk.A00(X.1ll):X.2BC");
    }
}
