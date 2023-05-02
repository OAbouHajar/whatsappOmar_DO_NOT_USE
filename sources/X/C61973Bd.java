package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.net.URL;

/* renamed from: X.3Bd  reason: invalid class name and case insensitive filesystem */
public class C61973Bd {
    public static int A00(C84454Kp r4, C38241qT r5, File file, String str, URL url) {
        String str2 = r5.A0E;
        if (str2 == null) {
            Log.w(AnonymousClass000.A0h(r5.A0F, AnonymousClass000.A0r("MediaDownload/checkMediaHash/message-supplied media hash is null mediaHash=")));
            str2 = r4.A01;
        }
        if (str == null) {
            StringBuilder A0r = AnonymousClass000.A0r("MediaDownload/MMS download failed to calculate hash; mediaHash=");
            C13690nt.A1M(url, r5.A0F, "; url=", A0r);
            A0r.append("; downloadFile=");
            A0r.append(file.getAbsolutePath());
            A0r.append("; downloadFile.exists?=");
            A0r.append(file.exists());
            Log.w(A0r.toString());
            return 1;
        } else if (str.equals(str2)) {
            return 0;
        } else {
            StringBuilder A0r2 = AnonymousClass000.A0r("MediaDownload/MMS download failed due to hash mismatch; mediaHash=");
            C13690nt.A1M(url, r5.A0F, "; url=", A0r2);
            A0r2.append("; receivedHash=");
            A0r2.append(str2);
            A0r2.append("; localHash=");
            Log.w(AnonymousClass000.A0h(str, A0r2));
            return 7;
        }
    }

    public static int A01(C38241qT r7, String str, URL url) {
        if (str == null) {
            StringBuilder A0r = AnonymousClass000.A0r("MediaDownload/MMS download failed during media decryption due to plaintext hash not calculated properly; mediaHash=");
            String str2 = r7.A0F;
            C13690nt.A1M(url, str2, "; url=", A0r);
            C13680ns.A1Y("; mediaHash=", str2, "; calculatedHash=", A0r);
            A0r.append(str);
            A0r.append("; mediaSize=");
            Log.w(C13680ns.A0j(A0r, r7.A07));
            return 1;
        }
        String str3 = r7.A0F;
        if (str.equals(str3)) {
            return 0;
        }
        StringBuilder A0r2 = AnonymousClass000.A0r("MediaDownload/MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=");
        C13690nt.A1M(url, str3, "; url=", A0r2);
        C13680ns.A1Y("; mediaHash=", str3, "; calculatedHash=", A0r2);
        A0r2.append(str);
        A0r2.append("; mediaSize=");
        Log.w(C13680ns.A0j(A0r2, r7.A07));
        return 2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00f4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0124 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:85:0x0124=Splitter:B:85:0x0124, B:79:0x011c=Splitter:B:79:0x011c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C16300so r24, X.C16180sb r25, X.C18020w1 r26, X.C43061zH r27, X.C30701co r28, X.C30761cu r29, X.C38241qT r30, X.C18840xL r31, X.C18820xJ r32, X.C18830xK r33, java.io.File r34, int r35, int r36) {
        /*
            r8 = r30
            byte[] r10 = r8.A0X
            java.lang.String r4 = r8.A0F
            java.lang.String r6 = r8.A0J
            int r9 = r8.A00
            long r0 = r8.A07
            X.1XK r3 = r8.A09
            if (r9 <= 0) goto L_0x013e
            if (r10 == 0) goto L_0x013e
            X.1XK r2 = X.AnonymousClass1XK.A0S
            r7 = r25
            r12 = r26
            r13 = r27
            r14 = r34
            r19 = r36
            if (r3 != r2) goto L_0x006f
            java.io.File r15 = r7.A0P(r4, r6)
            if (r15 == 0) goto L_0x013e
            boolean r5 = r15.exists()
            if (r5 != 0) goto L_0x013e
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0064 }
            r5.<init>(r9)     // Catch:{ IOException -> 0x0064 }
            r21 = 16
            r22 = r0
            r20 = r9
            r18 = r10
            r17 = r4
            r16 = r5
            boolean r0 = X.AnonymousClass1A9.A0S(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005b
            byte[] r1 = r5.toByteArray()     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r15.getAbsolutePath()     // Catch:{ all -> 0x005f }
            com.whatsapp.stickers.WebpUtils.createFirstThumbnail(r1, r9, r0)     // Catch:{ all -> 0x005f }
            boolean r0 = r15.exists()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005b
            r15.length()     // Catch:{ all -> 0x005f }
            r5.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x00ad
        L_0x005b:
            r5.close()     // Catch:{ IOException -> 0x0064 }
            return
        L_0x005f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r0     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            java.lang.String r0 = "CreateStickerThumbnail failed; mediaHash="
            java.lang.String r0 = X.C13680ns.A0h(r0, r4)
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x006f:
            X.0sc r11 = r7.A02
            java.lang.String r5 = ".Thumbs"
            java.io.File r11 = r11.A07(r5)
            java.lang.String r5 = ".prog.thumb.jpg"
            java.io.File r15 = X.C16180sb.A01(r11, r4, r6, r5)
            if (r15 == 0) goto L_0x013e
            boolean r5 = r15.exists()
            if (r5 != 0) goto L_0x013e
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x012d }
            r5.<init>(r15)     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x012d }
            r21 = 2
            r22 = r0
            r20 = r9
            r18 = r10
            r17 = r4
            r16 = r5
            boolean r0 = X.AnonymousClass1A9.A0S(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x011c
            byte[] r0 = X.C17970vw.A04     // Catch:{ all -> 0x0120 }
            r5.write(r0)     // Catch:{ all -> 0x0120 }
            boolean r0 = r15.exists()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x011c
            r15.length()     // Catch:{ all -> 0x0120 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x012d }
        L_0x00ad:
            boolean r0 = X.C221516v.A01(r3)
            r5 = r29
            if (r0 != 0) goto L_0x00f5
            if (r3 == r2) goto L_0x00f5
            boolean r1 = r8.A0U
            boolean r0 = X.C31831f6.A02(r3)
            if (r0 == 0) goto L_0x010e
            if (r1 == 0) goto L_0x010e
            boolean r0 = r8.A0N
            if (r0 != 0) goto L_0x010e
            byte[] r0 = r5.A0G()
            if (r0 != 0) goto L_0x010e
            X.0sc r1 = r7.A02
            java.lang.String r0 = ".Thumbs"
            java.io.File r1 = r1.A07(r0)
            java.lang.String r0 = ".prog.thumb.jpg"
            java.io.File r1 = X.C16180sb.A01(r1, r4, r6, r0)
            if (r1 == 0) goto L_0x010e
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0108 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0108 }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0108 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0108 }
            byte[] r0 = X.AnonymousClass45C.A00(r1)     // Catch:{ all -> 0x00f0 }
            r5.A0F(r0)     // Catch:{ all -> 0x00f0 }
            r1.close()     // Catch:{ IOException -> 0x0108 }
            goto L_0x010e
        L_0x00f0:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            throw r0     // Catch:{ IOException -> 0x0108 }
        L_0x00f5:
            java.io.File r12 = r7.A0P(r4, r6)
            if (r12 == 0) goto L_0x010e
            r6 = r24
            r9 = r31
            r10 = r32
            r11 = r33
            r7 = r5
            A03(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x010e
        L_0x0108:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/createProgressiveThumbnail/created progressive/thumbnail could not be read"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x010e:
            r28.A08()
            if (r3 != r2) goto L_0x013e
            r0 = 2
            r1 = r35
            if (r1 != r0) goto L_0x013e
            r5.A05()
            return
        L_0x011c:
            r5.close()     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x012d }
            return
        L_0x0120:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0124 }
        L_0x0124:
            throw r0     // Catch:{ FileNotFoundException -> 0x0125, IOException -> 0x012d }
        L_0x0125:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "CreateProgressiveThumbnail failed could not find file progressive jpeg thumbnail; mediaHash="
            goto L_0x0134
        L_0x012d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "CreateProgressiveThumbnail failed;mediaHash="
        L_0x0134:
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r1)
            com.whatsapp.util.Log.e(r0, r2)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61973Bd.A02(X.0so, X.0sb, X.0w1, X.1zH, X.1co, X.1cu, X.1qT, X.0xL, X.0xJ, X.0xK, java.io.File, int, int):void");
    }

    public static void A03(C16300so r4, C30761cu r5, C38241qT r6, C18840xL r7, C18820xJ r8, C18830xK r9, File file) {
        AnonymousClass1XK r3;
        C42051x9 A00;
        if ((r5.A00() != 1 || !C31831f6.A04(r6.A09)) && (r3 = r6.A09) != AnonymousClass1XK.A0P && (A00 = new C18850xM(r4, r7, r8, r9).A00(new C42031x7(r3, file, r6.A0H, r6.A0N))) != null) {
            byte[] bArr = A00.A02;
            if (bArr != null) {
                r5.A0F(bArr);
            }
            Pair pair = A00.A01;
            if (pair != null) {
                r5.A0A(AnonymousClass000.A0D(pair.first));
                r5.A08(AnonymousClass000.A0D(pair.second));
            }
            Pair pair2 = A00.A00;
            if (pair2 != null) {
                int A0D = AnonymousClass000.A0D(pair2.first);
                synchronized (r5) {
                    r5.A09 = Integer.valueOf(A0D);
                }
                int A0D2 = AnonymousClass000.A0D(pair2.second);
                synchronized (r5) {
                    r5.A0A = Integer.valueOf(A0D2);
                }
            }
            byte[] bArr2 = A00.A03;
            synchronized (r5) {
                r5.A0K = bArr2;
            }
        }
    }

    public static void A04(C16180sb r2, C31701et r3, File file, File file2) {
        int i2 = r3.A01;
        if (i2 == 0 && !file.equals(file2)) {
            file.delete();
        } else if (i2 == 1) {
            file.delete();
            C30701co.A02(r2, file2);
        }
    }
}
