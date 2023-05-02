package X;

import android.util.Pair;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: X.1Qe  reason: invalid class name and case insensitive filesystem */
public class C27031Qe {
    public final C16300so A00;
    public final AnonymousClass1HW A01;
    public final C16980tz A02;
    public final AnonymousClass12X A03;

    public C27031Qe(C16300so r1, AnonymousClass1HW r2, C16980tz r3, AnonymousClass12X r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public static Pair A00(String str) {
        int indexOf = str.indexOf(" ");
        if (indexOf < 0) {
            return null;
        }
        return new Pair(URLDecoder.decode(str.substring(0, indexOf)), str.substring(indexOf + 1));
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(URLEncoder.encode(str));
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00df */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A02(android.content.Context r9, X.C37771pi r10) {
        /*
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ IOException | IllegalArgumentException -> 0x00f7, Exception -> 0x00e0 }
            java.lang.String r0 = r10.A0L     // Catch:{ IOException | IllegalArgumentException -> 0x00f7, Exception -> 0x00e0 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x00f7, Exception -> 0x00e0 }
            java.io.InputStream r2 = r1.openInputStream(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x00f7, Exception -> 0x00e0 }
            if (r2 == 0) goto L_0x00c0
            r3 = 51201(0xc801, float:7.1748E-41)
            byte[] r9 = new byte[r3]     // Catch:{ all -> 0x00d9 }
            r1 = 0
            int r0 = r2.read(r9, r1, r3)     // Catch:{ all -> 0x00d9 }
            if (r0 == r3) goto L_0x00a6
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r9, r1, r0)     // Catch:{ all -> 0x00d9 }
            int r0 = r8.getWidth()     // Catch:{ all -> 0x00d9 }
            java.lang.String r7 = " pixels, sticker pack: "
            java.lang.String r6 = " and "
            java.lang.String r5 = ", should be between "
            r4 = 24
            r3 = 512(0x200, float:7.175E-43)
            if (r0 > r3) goto L_0x0076
            int r0 = r8.getHeight()     // Catch:{ all -> 0x00d9 }
            if (r0 < r4) goto L_0x0076
            int r0 = r8.getHeight()     // Catch:{ all -> 0x00d9 }
            if (r0 > r3) goto L_0x0046
            int r0 = r8.getHeight()     // Catch:{ all -> 0x00d9 }
            if (r0 < r4) goto L_0x0046
            r2.close()     // Catch:{ IOException | IllegalArgumentException -> 0x00f7, Exception -> 0x00e0 }
            return r9
        L_0x0046:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r1.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "tray icon height incorrect, it is currently "
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            int r0 = r8.getHeight()     // Catch:{ all -> 0x00d9 }
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            r1.append(r5)     // Catch:{ all -> 0x00d9 }
            r1.append(r4)     // Catch:{ all -> 0x00d9 }
            r1.append(r6)     // Catch:{ all -> 0x00d9 }
            r1.append(r3)     // Catch:{ all -> 0x00d9 }
            r1.append(r7)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = r10.A0F     // Catch:{ all -> 0x00d9 }
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d9 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x00a5
        L_0x0076:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r1.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "tray icon width incorrect, it is currently "
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            int r0 = r8.getWidth()     // Catch:{ all -> 0x00d9 }
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            r1.append(r5)     // Catch:{ all -> 0x00d9 }
            r1.append(r4)     // Catch:{ all -> 0x00d9 }
            r1.append(r6)     // Catch:{ all -> 0x00d9 }
            r1.append(r3)     // Catch:{ all -> 0x00d9 }
            r1.append(r7)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = r10.A0F     // Catch:{ all -> 0x00d9 }
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d9 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d9 }
        L_0x00a5:
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00a6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r1.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "tray icon file size too big, limit is 50 KB, sticker pack: "
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = r10.A0F     // Catch:{ all -> 0x00d9 }
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d9 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00c0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r1.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "failed to fetch sticker tray icon, inputstream is null: "
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = r10.A0F     // Catch:{ all -> 0x00d9 }
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d9 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            if (r2 == 0) goto L_0x00df
            r2.close()     // Catch:{ all -> 0x00df }
        L_0x00df:
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x00f7, Exception -> 0x00e0 }
        L_0x00e0:
            r2 = move-exception
            java.lang.String r0 = "failed to fetch sticker tray icon, sticker pack:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r10.A0F
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x00f7:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27031Qe.A02(android.content.Context, X.1pi):byte[]");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0181 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37771pi A03(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r15 = r29
            r9 = r30
            r8 = r31
            X.1pi r7 = r15.A04(r9, r8)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r6 = A01(r9, r8)
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r5 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r5)
            android.net.Uri$Builder r1 = r0.authority(r9)
            java.lang.String r0 = "stickers"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendPath(r8)
            android.net.Uri r20 = r0.build()
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r25 = 0
            java.lang.String r4 = "sticker_file_name"
            r1[r25] = r4
            r0 = 1
            java.lang.String r3 = "sticker_emoji"
            r1[r0] = r3
            X.0tz r0 = r15.A02
            android.content.Context r0 = r0.A00
            r28 = r0
            android.content.ContentResolver r19 = r28.getContentResolver()
            r23 = 0
            r24 = r23
            r21 = r1
            r22 = r23
            android.database.Cursor r11 = r19.query(r20, r21, r22, r23, r24)
            if (r11 == 0) goto L_0x0201
            int r1 = r11.getCount()     // Catch:{ all -> 0x021c }
            r0 = 3
            if (r1 < r0) goto L_0x01dd
            int r1 = r11.getCount()     // Catch:{ all -> 0x021c }
            r0 = 30
            if (r1 > r0) goto L_0x01dd
            r11.moveToFirst()     // Catch:{ all -> 0x021c }
        L_0x006b:
            int r0 = r11.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x021c }
            java.lang.String r12 = r11.getString(r0)     // Catch:{ all -> 0x021c }
            int r0 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r2 = r11.getString(r0)     // Catch:{ all -> 0x021c }
            boolean r0 = X.AnonymousClass1XI.A0S(r12)     // Catch:{ all -> 0x021c }
            if (r0 != 0) goto L_0x01b5
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x021c }
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = ","
            java.lang.String[] r10 = r2.split(r0)     // Catch:{ all -> 0x021c }
            int r2 = r10.length     // Catch:{ all -> 0x021c }
            X.1pj[] r1 = new X.C37781pj[r2]     // Catch:{ all -> 0x021c }
            r0 = 0
        L_0x0092:
            if (r0 >= r2) goto L_0x009f
            r13 = r10[r0]     // Catch:{ all -> 0x021c }
            X.1pj r13 = X.C37941pz.A00(r13)     // Catch:{ all -> 0x021c }
            r1[r0] = r13     // Catch:{ all -> 0x021c }
            int r0 = r0 + 1
            goto L_0x0092
        L_0x009f:
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ all -> 0x021c }
            r0.<init>()     // Catch:{ all -> 0x021c }
            android.net.Uri$Builder r0 = r0.scheme(r5)     // Catch:{ all -> 0x021c }
            android.net.Uri$Builder r2 = r0.authority(r9)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = "stickers_asset"
            android.net.Uri$Builder r0 = r2.appendPath(r0)     // Catch:{ all -> 0x021c }
            android.net.Uri$Builder r0 = r0.appendPath(r8)     // Catch:{ all -> 0x021c }
            android.net.Uri$Builder r0 = r0.appendPath(r12)     // Catch:{ all -> 0x021c }
            android.net.Uri r16 = r0.build()     // Catch:{ all -> 0x021c }
            java.lang.String r13 = r7.A0H     // Catch:{ all -> 0x021c }
            java.lang.String r12 = r7.A0J     // Catch:{ all -> 0x021c }
            java.lang.String r2 = r7.A0I     // Catch:{ all -> 0x021c }
            java.lang.String r0 = r7.A0E     // Catch:{ all -> 0x021c }
            X.1XO r10 = new X.1XO     // Catch:{ all -> 0x021c }
            r26 = 0
            r27 = 0
            r19 = r13
            r20 = r12
            r21 = r2
            r22 = r0
            r24 = r1
            r17 = r10
            r18 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x021c }
            android.content.ContentResolver r1 = r28.getContentResolver()     // Catch:{ IOException -> 0x0182 }
            r0 = r16
            java.io.InputStream r2 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x0182 }
            if (r2 == 0) goto L_0x018c
            X.12X r12 = r15.A03     // Catch:{ all -> 0x017d }
            r0 = 32
            byte[] r1 = X.C004101u.A0E(r0)     // Catch:{ all -> 0x017d }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = X.AnonymousClass1ZW.A0C(r0)     // Catch:{ all -> 0x017d }
            X.1XH r1 = r12.A00     // Catch:{ all -> 0x017d }
            java.io.File r13 = r1.A00(r0)     // Catch:{ all -> 0x017d }
            boolean r0 = X.AnonymousClass1XI.A0Q(r13, r2)     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x0179
            r2.close()     // Catch:{ IOException -> 0x0182 }
            java.lang.String r12 = r16.getPath()     // Catch:{ IOException -> 0x0172 }
            boolean r0 = r7.A0P     // Catch:{ IOException -> 0x0172 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0172 }
            X.1pj[] r0 = r10.A09     // Catch:{ IOException -> 0x0172 }
            if (r0 == 0) goto L_0x0130
            int r1 = r0.length     // Catch:{ IOException -> 0x0172 }
            r0 = 3
            if (r1 <= r0) goto L_0x0130
            java.lang.String r1 = "emoji count exceed limit, sticker name:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0172 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0172 }
            r0.append(r12)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException -> 0x0172 }
            X.1q0 r0 = new X.1q0     // Catch:{ IOException -> 0x0172 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0172 }
            throw r0     // Catch:{ IOException -> 0x0172 }
        L_0x0130:
            X.C37971q2.A00(r13, r2, r12)     // Catch:{ IOException -> 0x0172 }
            byte[] r0 = r10.A01()     // Catch:{ IOException -> 0x0172 }
            boolean r0 = com.whatsapp.stickers.WebpUtils.A01(r13, r0)     // Catch:{ IOException -> 0x0172 }
            if (r0 == 0) goto L_0x016c
            java.lang.String r2 = X.C37981q3.A00(r13)     // Catch:{ IOException -> 0x0172 }
            if (r2 == 0) goto L_0x0189
            X.1jm r12 = new X.1jm     // Catch:{ IOException -> 0x0172 }
            r12.<init>()     // Catch:{ IOException -> 0x0172 }
            r12.A0F = r6     // Catch:{ IOException -> 0x0172 }
            java.lang.String r1 = r16.toString()     // Catch:{ IOException -> 0x0172 }
            r0 = 3
            r12.A09 = r1     // Catch:{ IOException -> 0x0172 }
            r12.A01 = r0     // Catch:{ IOException -> 0x0172 }
            r12.A0D = r2     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = com.whatsapp.stickers.WebpUtils.A00(r13)     // Catch:{ IOException -> 0x0172 }
            r12.A0A = r0     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = "image/webp"
            r12.A0C = r0     // Catch:{ IOException -> 0x0172 }
            long r1 = r13.length()     // Catch:{ IOException -> 0x0172 }
            int r0 = (int) r1     // Catch:{ IOException -> 0x0172 }
            r12.A00 = r0     // Catch:{ IOException -> 0x0172 }
            r12.A04 = r10     // Catch:{ IOException -> 0x0172 }
            r14.add(r12)     // Catch:{ IOException -> 0x0172 }
            goto L_0x0189
        L_0x016c:
            java.lang.String r0 = "ThirdPartyStickerFetcher/calculatePlainTextHash/failed to insert metadata"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0172 }
            goto L_0x0189
        L_0x0172:
            r1 = move-exception
            java.lang.String r0 = "ThirdPartyStickerFetcher/fetchStickersForStickerPack/exception when operating on sticker file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0193 }
            goto L_0x0189
        L_0x0179:
            r2.close()     // Catch:{ IOException -> 0x0182 }
            goto L_0x018c
        L_0x017d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0181 }
        L_0x0181:
            throw r0     // Catch:{ IOException -> 0x0182 }
        L_0x0182:
            r1 = move-exception
            java.lang.String r0 = "ThirdPartyStickerFetcher/saveStickerFileToTempLocation/io exception when fetching sticker"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021c }
            goto L_0x018c
        L_0x0189:
            X.AnonymousClass1XI.A0N(r13)     // Catch:{ all -> 0x021c }
        L_0x018c:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x021c }
            if (r0 != 0) goto L_0x006b
            goto L_0x0196
        L_0x0193:
            r1 = move-exception
            goto L_0x0218
        L_0x0196:
            r11.close()
            java.util.Iterator r4 = r14.iterator()
            r2 = 0
        L_0x019f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r0 = r4.next()
            X.1jm r0 = (X.C34151jm) r0
            int r0 = r0.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            goto L_0x019f
        L_0x01b0:
            r7.A04 = r14
            r7.A01 = r2
            return r7
        L_0x01b5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021c }
            r1.<init>()     // Catch:{ all -> 0x021c }
            java.lang.String r0 = "sticker file name: "
            r1.append(r0)     // Catch:{ all -> 0x021c }
            r1.append(r12)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = " is invalid, authority: "
            r1.append(r0)     // Catch:{ all -> 0x021c }
            r1.append(r9)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = ",identifier: "
            r1.append(r0)     // Catch:{ all -> 0x021c }
            r1.append(r8)     // Catch:{ all -> 0x021c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x021c }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x021c }
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x01dd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021c }
            r1.<init>()     // Catch:{ all -> 0x021c }
            java.lang.String r0 = "sticker count should be between 3 to 30 inclusive, it currently has "
            r1.append(r0)     // Catch:{ all -> 0x021c }
            int r0 = r11.getCount()     // Catch:{ all -> 0x021c }
            r1.append(r0)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = ", sticker pack: "
            r1.append(r0)     // Catch:{ all -> 0x021c }
            r1.append(r8)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x021c }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x021c }
            r1.<init>(r0)     // Catch:{ all -> 0x021c }
            goto L_0x021b
        L_0x0201:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021c }
            r1.<init>()     // Catch:{ all -> 0x021c }
            java.lang.String r0 = "could not find stickers for sticker pack: "
            r1.append(r0)     // Catch:{ all -> 0x021c }
            r1.append(r6)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x021c }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x021c }
            r1.<init>(r0)     // Catch:{ all -> 0x021c }
            goto L_0x021b
        L_0x0218:
            X.AnonymousClass1XI.A0N(r13)     // Catch:{ all -> 0x021c }
        L_0x021b:
            throw r1     // Catch:{ all -> 0x021c }
        L_0x021c:
            r0 = move-exception
            if (r11 == 0) goto L_0x0222
            r11.close()     // Catch:{ all -> 0x0222 }
        L_0x0222:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27031Qe.A03(java.lang.String, java.lang.String):X.1pi");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0201, code lost:
        if (r15.getShort(r3) <= 0) goto L_0x0203;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37771pi A04(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r13 = r28
            boolean r0 = X.AnonymousClass1XI.A0S(r13)
            if (r0 != 0) goto L_0x03d5
            r12 = r29
            boolean r0 = X.AnonymousClass1XI.A0S(r12)
            if (r0 != 0) goto L_0x03c1
            int r3 = r12.length()
            r2 = 128(0x80, float:1.794E-43)
            if (r3 > r2) goto L_0x03a5
            r14 = r27
            X.0tz r0 = r14.A02
            android.content.Context r0 = r0.A00
            r26 = r0
            android.content.pm.PackageManager r4 = r26.getPackageManager()
            if (r4 == 0) goto L_0x005a
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r2 = r4.resolveContentProvider(r13, r2)
            if (r2 == 0) goto L_0x005a
            java.lang.String r1 = r2.readPermission
            java.lang.String r0 = "com.whatsapp.sticker.READ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005a
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0045 }
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x0045 }
            java.lang.String r11 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0045 }
            goto L_0x0060
        L_0x0045:
            java.lang.String r0 = "StickerContentProviderFetcher/getThirdPartyAppVersionCode/package name not found, content provider:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r13.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005a:
            java.lang.String r0 = "StickerContentProviderFetcher/getThirdPartyAppVersionCode/app may have been deleted"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r11 = 0
        L_0x0060:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x033e
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r19 = "content"
            r0 = r19
            android.net.Uri$Builder r0 = r1.scheme(r0)
            android.net.Uri$Builder r1 = r0.authority(r13)
            java.lang.String r0 = "metadata"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendPath(r12)
            android.net.Uri r21 = r0.build()
            r0 = 9
            java.lang.String[] r10 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r9 = "sticker_pack_identifier"
            r10[r0] = r9
            r0 = 1
            java.lang.String r8 = "sticker_pack_name"
            r10[r0] = r8
            r0 = 2
            java.lang.String r7 = "sticker_pack_publisher"
            r10[r0] = r7
            r0 = 3
            java.lang.String r6 = "sticker_pack_icon"
            r10[r0] = r6
            r0 = 4
            java.lang.String r18 = "android_play_store_link"
            r10[r0] = r18
            r0 = 5
            java.lang.String r5 = "ios_app_download_link"
            r10[r0] = r5
            r0 = 6
            java.lang.String r4 = "image_data_version"
            r10[r0] = r4
            r0 = 7
            java.lang.String r3 = "whatsapp_will_not_cache_stickers"
            r10[r0] = r3
            r0 = 8
            java.lang.String r2 = "animated_sticker_pack"
            r10[r0] = r2
            java.lang.String r1 = "/"
            android.content.ContentResolver r20 = r26.getContentResolver()
            r0 = 0
            r24 = r0
            r25 = r0
            r23 = r0
            r22 = r10
            android.database.Cursor r15 = r20.query(r21, r22, r23, r24, r25)
            r10 = 0
            if (r15 == 0) goto L_0x033e
            int r16 = r15.getCount()     // Catch:{ all -> 0x0336 }
            if (r16 <= 0) goto L_0x033b
            r15.moveToFirst()     // Catch:{ all -> 0x0336 }
            int r9 = r15.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0336 }
            java.lang.String r9 = r15.getString(r9)     // Catch:{ all -> 0x0336 }
            boolean r14 = r12.equals(r9)     // Catch:{ all -> 0x0336 }
            if (r14 == 0) goto L_0x0311
            int r8 = r15.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0336 }
            java.lang.String r17 = r15.getString(r8)     // Catch:{ all -> 0x0336 }
            int r7 = r15.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0336 }
            java.lang.String r16 = r15.getString(r7)     // Catch:{ all -> 0x0336 }
            int r6 = r15.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0336 }
            java.lang.String r7 = r15.getString(r6)     // Catch:{ all -> 0x0336 }
            boolean r6 = X.AnonymousClass1XI.A0S(r7)     // Catch:{ all -> 0x0336 }
            java.lang.String r8 = ", identifier: "
            java.lang.String r14 = "ThirdPartyStickerFetcher/tray image name: ("
            if (r6 == 0) goto L_0x0143
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r1.<init>()     // Catch:{ all -> 0x0336 }
            r1.append(r14)     // Catch:{ all -> 0x0336 }
            r1.append(r7)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = ") contains invalid characters, from authority: "
        L_0x0118:
            r1.append(r0)     // Catch:{ all -> 0x0336 }
            r1.append(r13)     // Catch:{ all -> 0x0336 }
            r1.append(r8)     // Catch:{ all -> 0x0336 }
            r1.append(r12)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0336 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0336 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r1.<init>()     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = "tray image name invalid, tray image name: "
            r1.append(r0)     // Catch:{ all -> 0x0336 }
            r1.append(r7)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0336 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
        L_0x0142:
            throw r1     // Catch:{ all -> 0x0336 }
        L_0x0143:
            int r9 = r7.length()     // Catch:{ all -> 0x0336 }
            r6 = 128(0x80, float:1.794E-43)
            if (r9 <= r6) goto L_0x0169
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r1.<init>()     // Catch:{ all -> 0x0336 }
            r1.append(r14)     // Catch:{ all -> 0x0336 }
            r1.append(r7)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = ") has "
            r1.append(r0)     // Catch:{ all -> 0x0336 }
            r1.append(r9)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = " characters, limit is: "
            r1.append(r0)     // Catch:{ all -> 0x0336 }
            r1.append(r6)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = ", from authority: "
            goto L_0x0118
        L_0x0169:
            r6 = r18
            int r8 = r15.getColumnIndex(r6)     // Catch:{ all -> 0x0336 }
            java.lang.String r6 = " is invalid"
            if (r8 <= 0) goto L_0x019f
            java.lang.String r0 = r15.getString(r8)     // Catch:{ all -> 0x0336 }
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0336 }
            if (r8 != 0) goto L_0x019f
            java.lang.String r8 = "play.google.com"
            boolean r8 = X.C37971q2.A01(r0, r8)     // Catch:{ all -> 0x0336 }
            if (r8 != 0) goto L_0x019f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r2.<init>()     // Catch:{ all -> 0x0336 }
            java.lang.String r1 = "play link: "
            r2.append(r1)     // Catch:{ all -> 0x0336 }
            r2.append(r0)     // Catch:{ all -> 0x0336 }
            r2.append(r6)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0336 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x0142
        L_0x019f:
            int r5 = r15.getColumnIndex(r5)     // Catch:{ all -> 0x0336 }
            if (r5 <= 0) goto L_0x01da
            java.lang.String r10 = r15.getString(r5)     // Catch:{ all -> 0x0336 }
            boolean r5 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0336 }
            if (r5 != 0) goto L_0x01da
            java.lang.String r5 = "itunes.apple.com"
            boolean r5 = X.C37971q2.A01(r10, r5)     // Catch:{ all -> 0x0336 }
            if (r5 != 0) goto L_0x01da
            java.lang.String r5 = "apps.apple.com"
            boolean r5 = X.C37971q2.A01(r10, r5)     // Catch:{ all -> 0x0336 }
            if (r5 != 0) goto L_0x01da
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r1.<init>()     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = "apple store link: "
            r1.append(r0)     // Catch:{ all -> 0x0336 }
            r1.append(r10)     // Catch:{ all -> 0x0336 }
            r1.append(r6)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0336 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x0142
        L_0x01da:
            java.lang.String r5 = ""
            int r4 = r15.getColumnIndex(r4)     // Catch:{ all -> 0x0336 }
            if (r4 <= 0) goto L_0x01f5
            java.lang.String r5 = r15.getString(r4)     // Catch:{ all -> 0x0336 }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0336 }
            if (r4 == 0) goto L_0x01f5
            java.lang.String r0 = "image_data_version should not be empty"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x0142
        L_0x01f5:
            int r3 = r15.getColumnIndex(r3)     // Catch:{ all -> 0x0336 }
            r8 = 0
            if (r3 <= 0) goto L_0x0203
            short r3 = r15.getShort(r3)     // Catch:{ all -> 0x0336 }
            r6 = 1
            if (r3 > 0) goto L_0x0204
        L_0x0203:
            r6 = 0
        L_0x0204:
            int r2 = r15.getColumnIndex(r2)     // Catch:{ all -> 0x0336 }
            if (r2 <= 0) goto L_0x0211
            short r2 = r15.getShort(r2)     // Catch:{ all -> 0x0336 }
            if (r2 <= 0) goto L_0x0211
            r8 = 1
        L_0x0211:
            X.1ph r3 = new X.1ph     // Catch:{ all -> 0x0336 }
            r3.<init>()     // Catch:{ all -> 0x0336 }
            java.lang.String r4 = A01(r13, r12)     // Catch:{ all -> 0x0336 }
            r3.A0P = r8     // Catch:{ all -> 0x0336 }
            r3.A0O = r6     // Catch:{ all -> 0x0336 }
            r3.A0D = r4     // Catch:{ all -> 0x0336 }
            r2 = r17
            r3.A0F = r2     // Catch:{ all -> 0x0336 }
            r2 = r16
            r3.A0H = r2     // Catch:{ all -> 0x0336 }
            android.net.Uri$Builder r6 = new android.net.Uri$Builder     // Catch:{ all -> 0x0336 }
            r6.<init>()     // Catch:{ all -> 0x0336 }
            r2 = r19
            android.net.Uri$Builder r2 = r6.scheme(r2)     // Catch:{ all -> 0x0336 }
            android.net.Uri$Builder r6 = r2.authority(r13)     // Catch:{ all -> 0x0336 }
            java.lang.String r2 = "stickers_asset"
            android.net.Uri$Builder r2 = r6.appendPath(r2)     // Catch:{ all -> 0x0336 }
            android.net.Uri$Builder r2 = r2.appendPath(r12)     // Catch:{ all -> 0x0336 }
            android.net.Uri$Builder r2 = r2.appendPath(r7)     // Catch:{ all -> 0x0336 }
            android.net.Uri r2 = r2.build()     // Catch:{ all -> 0x0336 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0336 }
            r3.A0J = r2     // Catch:{ all -> 0x0336 }
            r2 = 1
            r3.A0S = r2     // Catch:{ all -> 0x0336 }
            r3.A0G = r0     // Catch:{ all -> 0x0336 }
            r3.A0C = r10     // Catch:{ all -> 0x0336 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r0.<init>()     // Catch:{ all -> 0x0336 }
            r0.append(r4)     // Catch:{ all -> 0x0336 }
            r0.append(r1)     // Catch:{ all -> 0x0336 }
            r0.append(r11)     // Catch:{ all -> 0x0336 }
            r0.append(r1)     // Catch:{ all -> 0x0336 }
            r0.append(r5)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = X.C004101u.A03(r0)     // Catch:{ all -> 0x0336 }
            r3.A0E = r0     // Catch:{ all -> 0x0336 }
            X.1pi r4 = r3.A00()     // Catch:{ all -> 0x0336 }
            java.lang.String r2 = r4.A0F     // Catch:{ all -> 0x0336 }
            java.lang.String r1 = r4.A0J     // Catch:{ all -> 0x0336 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0336 }
            if (r0 != 0) goto L_0x02fc
            int r0 = r1.length()     // Catch:{ all -> 0x0336 }
            r3 = 128(0x80, float:1.794E-43)
            if (r0 > r3) goto L_0x02e7
            java.lang.String r1 = r4.A0H     // Catch:{ all -> 0x0336 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0336 }
            if (r0 != 0) goto L_0x02d2
            int r0 = r1.length()     // Catch:{ all -> 0x0336 }
            if (r0 > r3) goto L_0x02bd
            java.lang.String r0 = r4.A0L     // Catch:{ all -> 0x0336 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0336 }
            if (r0 != 0) goto L_0x02a8
            r0 = r26
            A02(r0, r4)     // Catch:{ all -> 0x0336 }
            goto L_0x0332
        L_0x02a8:
            java.lang.String r1 = "Third party sticker pack tray id is empty,"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r0.<init>(r1)     // Catch:{ all -> 0x0336 }
            r0.append(r2)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0336 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x0142
        L_0x02bd:
            java.lang.String r1 = "Third party sticker pack name cannot exceed 128 characters,"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r0.<init>(r1)     // Catch:{ all -> 0x0336 }
            r0.append(r2)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0336 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x0142
        L_0x02d2:
            java.lang.String r1 = "Third party sticker pack name is empty,"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r0.<init>(r1)     // Catch:{ all -> 0x0336 }
            r0.append(r2)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0336 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x0142
        L_0x02e7:
            java.lang.String r1 = "Third party sticker pack publisher cannot exceed 128 characters,"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r0.<init>(r1)     // Catch:{ all -> 0x0336 }
            r0.append(r2)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0336 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x0142
        L_0x02fc:
            java.lang.String r1 = "Third party sticker pack publisher is empty,"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r0.<init>(r1)     // Catch:{ all -> 0x0336 }
            r0.append(r2)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0336 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x0142
        L_0x0311:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r1.<init>()     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = "the pack returned was not what was requested, request identifier: "
            r1.append(r0)     // Catch:{ all -> 0x0336 }
            r1.append(r12)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = ",result identifier: "
            r1.append(r0)     // Catch:{ all -> 0x0336 }
            r1.append(r9)     // Catch:{ all -> 0x0336 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0336 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0336 }
            r1.<init>(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x0142
        L_0x0332:
            r15.close()
            return r4
        L_0x0336:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x033a }
        L_0x033a:
            throw r0
        L_0x033b:
            r15.close()
        L_0x033e:
            java.lang.String r0 = "ThirdPartyStickerFetcher/fetchStickerPackMetadata/fetched sticker pack is null, authority: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r13.hashCode()
            r1.append(r0)
            java.lang.String r0 = ", thirdPartyAppVersionCode: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r2 < r0) goto L_0x0383
            X.1HW r0 = r14.A01
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0383
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0383
            java.lang.String r1 = "Third party pack cannot be found, phone not in power saving mode, sdk: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            X.1q4 r0 = new X.1q4
            r0.<init>(r1)
            throw r0
        L_0x0383:
            java.lang.String r0 = "Third party pack cannot be found likely because the corresponding app is restricted, sdk: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " ,power saving mode: "
            r1.append(r0)
            X.1HW r0 = r14.A01
            boolean r0 = r0.A05()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1q5 r0 = new X.1q5
            r0.<init>(r1)
            throw r0
        L_0x03a5:
            java.lang.String r0 = "identifier length is: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ", limit is: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03c1:
            java.lang.String r1 = "identifier contains invalid characters: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03d5:
            java.lang.String r1 = "authority contains invalid characters: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27031Qe.A04(java.lang.String, java.lang.String):X.1pi");
    }
}
