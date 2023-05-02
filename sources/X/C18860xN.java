package X;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: X.0xN  reason: invalid class name and case insensitive filesystem */
public class C18860xN {
    public final C16920ts A00;
    public final AnonymousClass17I A01;
    public final C16900tq A02;
    public final AnonymousClass11I A03;

    public C18860xN(C16920ts r1, AnonymousClass17I r2, C16900tq r3, AnonymousClass11I r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static final void A00(C16740tZ r8) {
        boolean z2 = false;
        boolean z3 = false;
        if (r8.A13 > 0) {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder("ThumbnailMessageStore/isThumbnailV2Ready/message must have row_id set; key=");
        C28381Vw r2 = r8.A11;
        sb.append(r2);
        AnonymousClass00B.A0C(sb.toString(), z3);
        if (r8.A08() == 1) {
            z2 = true;
        }
        StringBuilder sb2 = new StringBuilder("ThumbnailMessageStore/isThumbnailV2Ready/message must be in main storage; key=");
        sb2.append(r2);
        AnonymousClass00B.A0C(sb2.toString(), z2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0083 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0050=Splitter:B:17:0x0050, B:38:0x0083=Splitter:B:38:0x0083} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16740tZ r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C38641rB
            if (r0 == 0) goto L_0x0089
            X.0tY r10 = (X.C16730tY) r10
            java.lang.String r6 = r10.A05
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00bd
            X.17I r3 = r9.A01
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = r10.A05
            r8 = 0
            r2[r8] = r0
            long r0 = r10.A13
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1
            r2[r0] = r1
            boolean r0 = r3.A09()
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = "SELECT COUNT(1) as count FROM message_media WHERE file_hash = ? AND message_row_id != ?"
        L_0x0029:
            X.0tq r0 = r3.A02
            X.0tf r7 = r0.get()
            goto L_0x0033
        L_0x0030:
            java.lang.String r1 = "SELECT COUNT(1) as count FROM messages WHERE media_hash = ? AND _id != ?"
            goto L_0x0029
        L_0x0033:
            X.0tg r0 = r7.A02     // Catch:{ all -> 0x0084 }
            android.database.Cursor r5 = r0.A08(r1, r2)     // Catch:{ all -> 0x0084 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = "count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007d }
            long r3 = r5.getLong(r0)     // Catch:{ all -> 0x007d }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0050
            r8 = 1
        L_0x0050:
            r5.close()     // Catch:{ all -> 0x0084 }
            r7.close()
            if (r8 != 0) goto L_0x005f
            return
        L_0x0059:
            r5.close()     // Catch:{ all -> 0x0084 }
            r7.close()
        L_0x005f:
            X.0tq r0 = r9.A02
            X.0tf r5 = r0.A02()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = "media_hash_thumbnail"
            java.lang.String r2 = "media_hash = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0078 }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x0078 }
            r4.A01(r3, r2, r1)     // Catch:{ all -> 0x0078 }
            r5.close()
            return
        L_0x0078:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00b7 }
            throw r0
        L_0x007d:
            r0 = move-exception
            if (r5 == 0) goto L_0x0083
            r5.close()     // Catch:{ all -> 0x0083 }
        L_0x0083:
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00b7 }
            throw r0
        L_0x0089:
            long r0 = r10.A13
            boolean r0 = r9.A08(r0)
            if (r0 == 0) goto L_0x00b8
            A00(r10)
            long r4 = r10.A13
            X.0tq r0 = r9.A02
            X.0tf r8 = r0.A02()
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x00b3 }
            java.lang.String r6 = "message_thumbnail"
            java.lang.String r3 = "message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00b3 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b3 }
            r2[r1] = r0     // Catch:{ all -> 0x00b3 }
            r7.A01(r6, r3, r2)     // Catch:{ all -> 0x00b3 }
            r8.close()
            return
        L_0x00b3:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            throw r0
        L_0x00b8:
            X.1Vw r0 = r10.A11
            r9.A03(r0)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18860xN.A01(X.0tZ):void");
    }

    public void A02(C16740tZ r5, byte[] bArr) {
        if (r5 instanceof C38641rB) {
            String str = ((C16730tY) r5).A05;
            if (!TextUtils.isEmpty(str) && A0A(str) == null) {
                C16800tf A022 = this.A02.A02();
                try {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("media_hash", str);
                    contentValues.put("thumbnail", bArr);
                    A022.A02.A02(contentValues, "media_hash_thumbnail");
                    A022.close();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                return;
            }
        } else if (A08(r5.A13)) {
            A00(r5);
            if (bArr != null) {
                A07(bArr, r5.A13);
                return;
            }
            return;
        } else {
            A04(r5.A11, bArr);
            return;
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C28381Vw r10) {
        /*
            r9 = this;
            X.0tq r0 = r9.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0056 }
            X.0tf r5 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0056 }
            X.0rv r0 = r10.A00     // Catch:{ all -> 0x0051 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0051 }
            X.0tg r8 = r5.A02     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = "message_thumbnails"
            java.lang.String r6 = "key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0051 }
            r2 = 0
            r4[r2] = r1     // Catch:{ all -> 0x0051 }
            boolean r0 = r10.A02     // Catch:{ all -> 0x0051 }
            r1 = 1
            if (r0 == 0) goto L_0x0021
            r2 = 1
        L_0x0021:
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0051 }
            r4[r1] = r0     // Catch:{ all -> 0x0051 }
            r0 = 2
            java.lang.String r3 = r10.A01     // Catch:{ all -> 0x0051 }
            r4[r0] = r3     // Catch:{ all -> 0x0051 }
            int r2 = r8.A01(r7, r6, r4)     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r1.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "thumbnailmsgstore/deleteMessageThumbnail/"
            r1.append(r0)     // Catch:{ all -> 0x0051 }
            r1.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x0051 }
            r1.append(r2)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0051 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0051 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0056 }
            return
        L_0x0051:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0056 }
        L_0x0056:
            r1 = move-exception
            java.lang.String r0 = "thumbnailmsgstore/deleteMessageThumbnail"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18860xN.A03(X.1Vw):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C28381Vw r8, byte[] r9) {
        /*
            r7 = this;
            X.0tq r0 = r7.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x005b, Error | RuntimeException -> 0x0056 }
            X.0tf r5 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005b, Error | RuntimeException -> 0x0056 }
            X.0rv r0 = r8.A00     // Catch:{ all -> 0x0051 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0051 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0051 }
            r6.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "thumbnail"
            r6.put(r0, r9)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "key_remote_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "key_from_me"
            boolean r1 = r8.A02     // Catch:{ all -> 0x0051 }
            r0 = 0
            if (r1 == 0) goto L_0x0027
            r0 = 1
        L_0x0027:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0051 }
            r6.put(r2, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0051 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = "timestamp"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0051 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0051 }
            r6.put(r4, r0)     // Catch:{ all -> 0x0051 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "message_thumbnails"
            r1.A04(r6, r0)     // Catch:{ all -> 0x0051 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005b, Error | RuntimeException -> 0x0056 }
            return
        L_0x0051:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x005b, Error | RuntimeException -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = "thumbnailmsgstore/insertOrUpdateMessageThumbnail"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18860xN.A04(X.1Vw, byte[]):void");
    }

    public void A05(C28381Vw r4, byte[] bArr, long j2) {
        if (A08(j2)) {
            boolean z2 = false;
            if (j2 > 0) {
                z2 = true;
            }
            StringBuilder sb = new StringBuilder("ThumbnailMessageStore/insertOrUpdateMessageThumbnail/message must have row_id set; key=");
            sb.append(r4);
            AnonymousClass00B.A0C(sb.toString(), z2);
            if (bArr != null) {
                A07(bArr, j2);
                return;
            }
            return;
        }
        A04(r4, bArr);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0082 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.util.Collection r13) {
        /*
            r12 = this;
            X.0tq r0 = r12.A02
            X.0tf r5 = r0.A02()
            X.1cj r11 = r5.A00()     // Catch:{ all -> 0x0083 }
            java.util.Iterator r10 = r13.iterator()     // Catch:{ all -> 0x007e }
        L_0x000e:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0074
            java.lang.Object r6 = r10.next()     // Catch:{ all -> 0x007e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x007e }
            X.17I r3 = r12.A01     // Catch:{ all -> 0x007e }
            r9 = 1
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ all -> 0x007e }
            r0 = 0
            r2[r0] = r6     // Catch:{ all -> 0x007e }
            boolean r0 = r3.A09()     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = "SELECT COUNT(1) as count FROM message_media WHERE file_hash=?"
        L_0x002a:
            X.0tq r0 = r3.A02     // Catch:{ all -> 0x007e }
            X.0tf r8 = r0.get()     // Catch:{ all -> 0x007e }
            X.0tg r0 = r8.A02     // Catch:{ all -> 0x006f }
            android.database.Cursor r7 = r0.A08(r1, r2)     // Catch:{ all -> 0x006f }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "count"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0068 }
            long r3 = r7.getLong(r0)     // Catch:{ all -> 0x0068 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            r9 = 0
        L_0x004d:
            r7.close()     // Catch:{ all -> 0x006f }
            r8.close()     // Catch:{ all -> 0x007e }
            if (r9 != 0) goto L_0x000e
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "media_hash_thumbnail"
            java.lang.String r2 = "media_hash = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x007e }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x007e }
            r4.A01(r3, r2, r1)     // Catch:{ all -> 0x007e }
            goto L_0x000e
        L_0x0065:
            java.lang.String r1 = "SELECT COUNT(1) as count FROM messages WHERE media_hash = ?"
            goto L_0x002a
        L_0x0068:
            r0 = move-exception
            if (r7 == 0) goto L_0x006e
            r7.close()     // Catch:{ all -> 0x006e }
        L_0x006e:
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0073 }
        L_0x0073:
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0074:
            r11.A00()     // Catch:{ all -> 0x007e }
            r11.close()     // Catch:{ all -> 0x0083 }
            r5.close()
            return
        L_0x007e:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0082 }
        L_0x0082:
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0087 }
        L_0x0087:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18860xN.A06(java.util.Collection):void");
    }

    public final void A07(byte[] bArr, long j2) {
        C16800tf A022 = this.A02.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("thumbnail", bArr);
            boolean z2 = false;
            if (A022.A02.A06(contentValues, "message_thumbnail", 5) == j2) {
                z2 = true;
            }
            AnonymousClass00B.A0D("ThumbnailMessageStore/insertOrUpdateThumbnailV2/inserted row should has same row_id", z2);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final boolean A08(long j2) {
        AnonymousClass11I r3 = this.A03;
        if (r3.A00("thumbnail_ready", 0) != 2) {
            return j2 > 0 && r3.A01("migration_message_thumbnail_index", 0) >= j2;
        }
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0098 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00ee */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0098=Splitter:B:33:0x0098, B:25:0x008b=Splitter:B:25:0x008b} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x00e1=Splitter:B:50:0x00e1, B:58:0x00ee=Splitter:B:58:0x00ee} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A09(X.C16740tZ r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L_0x000f
            boolean r0 = r9 instanceof X.C38641rB
            if (r0 == 0) goto L_0x0010
            X.0tY r9 = (X.C16730tY) r9
            java.lang.String r0 = r9.A05
            byte[] r7 = r8.A0A(r0)
        L_0x000f:
            return r7
        L_0x0010:
            long r0 = r9.A13
            boolean r0 = r8.A08(r0)
            if (r0 == 0) goto L_0x009e
            long r1 = r9.A13
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0037
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ThumbnailMessageStore/getMessageThumbnail/message must have row_id set; key="
        L_0x0027:
            r1.append(r0)
            X.1Vw r0 = r9.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x0037:
            int r0 = r9.A08()
            r3 = 1
            if (r0 == r3) goto L_0x0046
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ThumbnailMessageStore/getMessageThumbnail/message must be in main storage; key="
            goto L_0x0027
        L_0x0046:
            long r1 = r9.A13
            r4 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x004f
            r2 = 1
        L_0x004f:
            java.lang.String r0 = "ThumbnailMessageStore/getThumbnailV2/message must have row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r9.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            java.lang.String[] r3 = new java.lang.String[r3]
            long r0 = r9.A13
            java.lang.String r0 = java.lang.Long.toString(r0)
            r3[r4] = r0
            X.0tq r0 = r8.A02
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "SELECT thumbnail FROM message_thumbnail WHERE message_row_id = ?"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x0099 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "thumbnail"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0092 }
            byte[] r7 = r1.getBlob(r0)     // Catch:{ all -> 0x0092 }
        L_0x008b:
            r1.close()     // Catch:{ all -> 0x0099 }
            r2.close()
            return r7
        L_0x0092:
            r0 = move-exception
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ all -> 0x0098 }
        L_0x0098:
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00f3 }
            throw r0
        L_0x009e:
            X.1Vw r7 = r9.A11
            X.0rv r0 = r7.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = r0.getRawString()
            X.0tq r0 = r8.A02
            X.0tf r4 = r0.get()
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x00ef }
            java.lang.String r5 = "SELECT thumbnail FROM message_thumbnails WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00ef }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x00ef }
            boolean r2 = r7.A02     // Catch:{ all -> 0x00ef }
            r1 = 1
            if (r2 == 0) goto L_0x00bf
            r0 = 1
        L_0x00bf:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ef }
            r3[r1] = r0     // Catch:{ all -> 0x00ef }
            r1 = 2
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x00ef }
            r3[r1] = r0     // Catch:{ all -> 0x00ef }
            android.database.Cursor r1 = r6.A08(r5, r3)     // Catch:{ all -> 0x00ef }
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = "thumbnail"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            byte[] r7 = r1.getBlob(r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00e1
        L_0x00e0:
            r7 = 0
        L_0x00e1:
            r1.close()     // Catch:{ all -> 0x00ef }
            r4.close()
            return r7
        L_0x00e8:
            r0 = move-exception
            if (r1 == 0) goto L_0x00ee
            r1.close()     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18860xN.A09(X.0tZ):byte[]");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0039=Splitter:B:17:0x0039, B:9:0x002c=Splitter:B:9:0x002c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A0A(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r4 = 0
            if (r0 != 0) goto L_0x003f
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            r3[r0] = r6
            X.0tq r0 = r5.A02
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "SELECT thumbnail FROM media_hash_thumbnail WHERE media_hash = ?"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x003a }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "thumbnail"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0033 }
            byte[] r4 = r1.getBlob(r0)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            r1.close()     // Catch:{ all -> 0x003a }
            r2.close()
            return r4
        L_0x0033:
            r0 = move-exception
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        L_0x003f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18860xN.A0A(java.lang.String):byte[]");
    }
}
