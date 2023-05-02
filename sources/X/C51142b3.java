package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.whatsapp.util.Log;

/* renamed from: X.2b3  reason: invalid class name and case insensitive filesystem */
public abstract class C51142b3 implements AnonymousClass2BC {
    public Cursor A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final int A03;
    public final ContentResolver A04;
    public final Uri A05;
    public final AnonymousClass03L A06;
    public final C20350zu A07;
    public final String A08;

    public C51142b3(Uri uri, C16980tz r15, C20350zu r16, String str, int i2, boolean z2) {
        Cursor query;
        String[] strArr;
        String[] strArr2;
        AnonymousClass03L r2 = new AnonymousClass03L(512);
        this.A06 = r2;
        this.A07 = r16;
        ContentResolver contentResolver = r15.A00.getContentResolver();
        this.A04 = contentResolver;
        this.A03 = i2;
        Uri uri2 = uri;
        this.A05 = uri;
        this.A08 = str;
        this.A02 = z2;
        if (this instanceof C51192b8) {
            C51192b8 r0 = (C51192b8) this;
            query = MediaStore.Images.Media.query(r0.A04, r0.A05, C51192b8.A00, r0.A03(), (String[]) null, r0.A02());
        } else if (this instanceof C51152b4) {
            C51152b4 r02 = (C51152b4) this;
            ContentResolver contentResolver2 = r02.A04;
            Uri uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] strArr3 = C51152b4.A01;
            String A032 = r02.A03();
            String str2 = r02.A08;
            String[] strArr4 = C51152b4.A00;
            if (str2 != null) {
                int length = strArr4.length;
                strArr2 = new String[(length + 1)];
                System.arraycopy(strArr4, 0, strArr2, 0, length);
                strArr2[length] = str2;
            } else {
                strArr2 = strArr4;
            }
            query = MediaStore.Images.Media.query(contentResolver2, uri3, strArr3, A032, strArr2, r02.A02());
        } else if (this instanceof C51162b5) {
            C51162b5 r03 = (C51162b5) this;
            ContentResolver contentResolver3 = r03.A04;
            Uri uri4 = r03.A05;
            String[] strArr5 = C51162b5.A01;
            String A033 = r03.A03();
            String str3 = r03.A08;
            String[] strArr6 = C51162b5.A00;
            if (str3 != null) {
                int length2 = strArr6.length;
                strArr = new String[(length2 + 1)];
                System.arraycopy(strArr6, 0, strArr, 0, length2);
                strArr[length2] = str3;
            } else {
                strArr = strArr6;
            }
            query = MediaStore.Images.Media.query(contentResolver3, uri4, strArr5, A033, strArr, r03.A02());
        } else if (this instanceof C51132b2) {
            C51132b2 r04 = (C51132b2) this;
            ContentResolver contentResolver4 = r04.A04;
            Uri uri5 = r04.A05;
            String[] strArr7 = C51132b2.A00;
            String A034 = r04.A03();
            String str4 = r04.A08;
            query = contentResolver4.query(uri5, strArr7, A034, str4 == null ? null : new String[]{str4}, r04.A02());
        } else {
            query = contentResolver.query(uri2, C818449y.A00, (String) null, (String[]) null, A02());
        }
        this.A00 = query;
        if (query == null) {
            Log.w("medialist/createCursor returns null");
        }
        r2.A05(0);
    }

    private Cursor A00() {
        Cursor cursor;
        synchronized (this) {
            Cursor cursor2 = this.A00;
            if (cursor2 == null) {
                cursor = null;
            } else {
                if (this.A01) {
                    cursor2.requery();
                    this.A01 = false;
                }
                cursor = this.A00;
            }
        }
        return cursor;
    }

    public Uri A01(long j2) {
        try {
            Uri uri = this.A05;
            if (ContentUris.parseId(uri) != j2) {
                Log.e("medialist/id mismatch");
            }
            return uri;
        } catch (NumberFormatException unused) {
            return ContentUris.withAppendedId(this.A05, j2);
        }
    }

    public String A02() {
        String str = this.A03 == 1 ? " ASC" : " DESC";
        StringBuilder sb = new StringBuilder("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end");
        sb.append(str);
        sb.append(", _id");
        sb.append(str);
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.2BF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: X.2BF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.2BF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: X.2BF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: X.2BF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: X.2BF} */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: type inference failed for: r24v2, types: [X.3tC] */
    /* JADX WARNING: type inference failed for: r12v19 */
    /* JADX WARNING: type inference failed for: r24v3, types: [X.3tD] */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2BF ADR(int r36) {
        /*
            r35 = this;
            r1 = r35
            X.03L r6 = r1.A06
            r2 = r36
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r12 = r6.A02(r5)
            X.2BF r12 = (X.AnonymousClass2BF) r12
            if (r12 != 0) goto L_0x01bb
            android.database.Cursor r0 = r1.A00()
            r12 = 0
            if (r0 == 0) goto L_0x01bb
            monitor-enter(r1)
            boolean r2 = r0.moveToPosition(r2)     // Catch:{ all -> 0x01b8 }
            if (r2 == 0) goto L_0x0069
            boolean r2 = r1 instanceof X.C51192b8     // Catch:{ all -> 0x01b8 }
            if (r2 == 0) goto L_0x007a
            r2 = 0
            long r2 = r0.getLong(r2)     // Catch:{ all -> 0x01b8 }
            r4 = 1
            java.lang.String r15 = r0.getString(r4)     // Catch:{ all -> 0x01b8 }
            r4 = 2
            long r19 = r0.getLong(r4)     // Catch:{ all -> 0x01b8 }
            r7 = 0
            int r4 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0042
            r4 = 6
            long r19 = r0.getLong(r4)     // Catch:{ all -> 0x01b8 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r7
        L_0x0042:
            r4 = 5
            java.lang.String r16 = r0.getString(r4)     // Catch:{ all -> 0x01b8 }
            r4 = 7
            long r21 = r0.getLong(r4)     // Catch:{ all -> 0x01b8 }
            if (r15 == 0) goto L_0x006c
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x01b8 }
            r0.<init>(r15)     // Catch:{ all -> 0x01b8 }
            boolean r0 = com.whatsapp.GifHelper.A01(r0)     // Catch:{ all -> 0x01b8 }
            if (r0 == 0) goto L_0x006c
            android.content.ContentResolver r13 = r1.A04     // Catch:{ all -> 0x01b8 }
            android.net.Uri r14 = r1.A01(r2)     // Catch:{ all -> 0x01b8 }
            X.3tC r12 = new X.3tC     // Catch:{ all -> 0x01b8 }
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r19, r21)     // Catch:{ all -> 0x01b8 }
        L_0x0066:
            r6.A06(r5, r12)     // Catch:{ all -> 0x01b8 }
        L_0x0069:
            monitor-exit(r1)     // Catch:{ all -> 0x01b8 }
            goto L_0x01b7
        L_0x006c:
            android.content.ContentResolver r13 = r1.A04     // Catch:{ all -> 0x01b8 }
            android.net.Uri r14 = r1.A01(r2)     // Catch:{ all -> 0x01b8 }
            X.3tD r12 = new X.3tD     // Catch:{ all -> 0x01b8 }
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r19, r21)     // Catch:{ all -> 0x01b8 }
            goto L_0x0066
        L_0x007a:
            boolean r2 = r1 instanceof X.C51152b4     // Catch:{ all -> 0x01b8 }
            if (r2 != 0) goto L_0x017a
            boolean r2 = r1 instanceof X.C51162b5     // Catch:{ all -> 0x01b8 }
            if (r2 != 0) goto L_0x017a
            boolean r2 = r1 instanceof X.C51132b2     // Catch:{ all -> 0x01b8 }
            if (r2 == 0) goto L_0x0135
            r2 = 0
            long r2 = r0.getLong(r2)     // Catch:{ all -> 0x01b8 }
            r4 = 1
            java.lang.String r15 = r0.getString(r4)     // Catch:{ all -> 0x01b8 }
            r4 = 5
            long r20 = r0.getLong(r4)     // Catch:{ all -> 0x01b8 }
            r7 = 0
            int r4 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x00a4
            r4 = 4
            long r20 = r0.getLong(r4)     // Catch:{ all -> 0x01b8 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r7
        L_0x00a4:
            r4 = 2
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x01b8 }
            r10 = 3
            int r9 = r0.getInt(r10)     // Catch:{ all -> 0x01b8 }
            r7 = 7
            long r22 = r0.getLong(r7)     // Catch:{ all -> 0x01b8 }
            if (r15 == 0) goto L_0x00bb
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x01b8 }
            r8.<init>(r15)     // Catch:{ all -> 0x01b8 }
            goto L_0x00bc
        L_0x00bb:
            r8 = 0
        L_0x00bc:
            if (r9 != r10) goto L_0x00de
            boolean r0 = com.whatsapp.GifHelper.A01(r8)     // Catch:{ all -> 0x01b8 }
            if (r0 != 0) goto L_0x00fe
            android.content.ContentResolver r0 = r1.A04     // Catch:{ all -> 0x01b8 }
            android.net.Uri r26 = r1.A01(r2)     // Catch:{ all -> 0x01b8 }
            X.3tD r12 = new X.3tD     // Catch:{ all -> 0x01b8 }
            r24 = r12
            r25 = r0
            r27 = r15
            r28 = r4
            r29 = r2
            r31 = r20
            r33 = r22
            r24.<init>(r25, r26, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x01b8 }
            goto L_0x0066
        L_0x00de:
            java.lang.String r7 = "image/gif"
            boolean r7 = r7.equals(r4)     // Catch:{ all -> 0x01b8 }
            if (r7 == 0) goto L_0x011f
            if (r8 == 0) goto L_0x011f
            X.C41911wr.A04(r8)     // Catch:{ IOException -> 0x011f }
            X.1ws r7 = X.C41911wr.A04(r8)     // Catch:{ IOException -> 0x0119, OutOfMemoryError -> 0x00f8 }
            boolean r7 = r7.A02     // Catch:{ IOException -> 0x0119, OutOfMemoryError -> 0x00f8 }
            r7 = r7 ^ 1
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x011f
            goto L_0x00fe
        L_0x00f8:
            r7 = move-exception
            java.lang.String r0 = "LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/OutOfMemory"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x01b8 }
        L_0x00fe:
            android.content.ContentResolver r0 = r1.A04     // Catch:{ all -> 0x01b8 }
            android.net.Uri r26 = r1.A01(r2)     // Catch:{ all -> 0x01b8 }
            X.3tC r12 = new X.3tC     // Catch:{ all -> 0x01b8 }
            r24 = r12
            r25 = r0
            r27 = r15
            r28 = r4
            r29 = r2
            r31 = r20
            r33 = r22
            r24.<init>(r25, r26, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x01b8 }
            goto L_0x0066
        L_0x0119:
            r8 = move-exception
            java.lang.String r7 = "LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/IOException"
            com.whatsapp.util.Log.e(r7, r8)     // Catch:{ all -> 0x01b8 }
        L_0x011f:
            android.content.ContentResolver r13 = r1.A04     // Catch:{ all -> 0x01b8 }
            android.net.Uri r14 = r1.A01(r2)     // Catch:{ all -> 0x01b8 }
            r7 = 6
            int r17 = r0.getInt(r7)     // Catch:{ all -> 0x01b8 }
            X.32G r12 = new X.32G     // Catch:{ all -> 0x01b8 }
            r16 = r4
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)     // Catch:{ all -> 0x01b8 }
            goto L_0x0066
        L_0x0135:
            r11 = 1
            java.lang.String r7 = r0.getString(r11)     // Catch:{ all -> 0x01b8 }
            r9 = 0
            if (r7 == 0) goto L_0x0175
            r2 = 2
            long r2 = r0.getLong(r2)     // Catch:{ all -> 0x01b8 }
            r4 = 5
            short r10 = r0.getShort(r4)     // Catch:{ all -> 0x01b8 }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x01b8 }
            r8.<init>(r7)     // Catch:{ all -> 0x01b8 }
            if (r10 == r11) goto L_0x0170
            r4 = 3
            r7 = 6
            if (r10 == r4) goto L_0x0163
            r4 = 13
            if (r10 != r4) goto L_0x0175
            long r14 = r0.getLong(r7)     // Catch:{ all -> 0x01b8 }
            X.3t7 r9 = new X.3t7     // Catch:{ all -> 0x01b8 }
            r10 = r12
            r11 = r8
            r12 = r2
            r9.<init>(r10, r11, r12, r14)     // Catch:{ all -> 0x01b8 }
            goto L_0x0175
        L_0x0163:
            long r14 = r0.getLong(r7)     // Catch:{ all -> 0x01b8 }
            X.3t8 r9 = new X.3t8     // Catch:{ all -> 0x01b8 }
            r10 = r12
            r11 = r8
            r12 = r2
            r9.<init>(r10, r11, r12, r14)     // Catch:{ all -> 0x01b8 }
            goto L_0x0175
        L_0x0170:
            X.3t4 r9 = new X.3t4     // Catch:{ all -> 0x01b8 }
            r9.<init>(r12, r8, r2)     // Catch:{ all -> 0x01b8 }
        L_0x0175:
            r12 = r9
            if (r9 == 0) goto L_0x0069
            goto L_0x0066
        L_0x017a:
            r2 = 0
            long r2 = r0.getLong(r2)     // Catch:{ all -> 0x01b8 }
            r4 = 1
            java.lang.String r15 = r0.getString(r4)     // Catch:{ all -> 0x01b8 }
            r4 = 2
            long r20 = r0.getLong(r4)     // Catch:{ all -> 0x01b8 }
            r7 = 0
            int r4 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0198
            r4 = 7
            long r20 = r0.getLong(r4)     // Catch:{ all -> 0x01b8 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r7
        L_0x0198:
            r4 = 4
            int r17 = r0.getInt(r4)     // Catch:{ all -> 0x01b8 }
            r4 = 6
            java.lang.String r16 = r0.getString(r4)     // Catch:{ all -> 0x01b8 }
            r4 = 8
            long r22 = r0.getLong(r4)     // Catch:{ all -> 0x01b8 }
            android.content.ContentResolver r13 = r1.A04     // Catch:{ all -> 0x01b8 }
            android.net.Uri r14 = r1.A01(r2)     // Catch:{ all -> 0x01b8 }
            X.32G r12 = new X.32G     // Catch:{ all -> 0x01b8 }
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)     // Catch:{ all -> 0x01b8 }
            goto L_0x0066
        L_0x01b7:
            return r12
        L_0x01b8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b8 }
            throw r0
        L_0x01bb:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51142b3.ADR(int):X.2BF");
    }

    public void AcE() {
        Cursor cursor;
        if ((this instanceof AnonymousClass32H) && (cursor = this.A00) != null) {
            cursor.deactivate();
            this.A01 = true;
        }
    }

    public void close() {
        try {
            Cursor cursor = this.A00;
            if (cursor != null) {
                cursor.deactivate();
                this.A01 = true;
            }
        } catch (IllegalStateException e2) {
            Log.e("medialist/exception while deactivating cursor", e2);
        }
        Cursor cursor2 = this.A00;
        if (cursor2 != null) {
            cursor2.close();
            this.A00 = null;
        }
    }

    public int getCount() {
        int count;
        Cursor A002 = A00();
        if (A002 == null) {
            return 0;
        }
        synchronized (this) {
            count = A002.getCount();
        }
        return count;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof AnonymousClass32H) && (cursor = this.A00) != null) {
            cursor.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof AnonymousClass32H) && (cursor = this.A00) != null) {
            cursor.unregisterContentObserver(contentObserver);
        }
    }
}
