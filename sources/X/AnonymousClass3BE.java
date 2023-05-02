package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.net.URL;
import java.util.concurrent.FutureTask;

/* renamed from: X.3BE  reason: invalid class name */
public class AnonymousClass3BE {
    public boolean A00;
    public final C16300so A01;
    public final C16180sb A02;
    public final C18020w1 A03;
    public final C17130ua A04;
    public final C14730pf A05;
    public final C14710pd A06;
    public final C20330zs A07;
    public final C17680vT A08;
    public final C31781f1 A09;
    public final C216214u A0A;
    public final C30701co A0B;
    public final C30761cu A0C;
    public final C38241qT A0D;
    public final C30741cs A0E;
    public final C19040xf A0F;
    public final C18840xL A0G;
    public final C18820xJ A0H;
    public final C18830xK A0I;
    public final C16320sq A0J;
    public final AnonymousClass12P A0K;
    public final URL A0L;

    public AnonymousClass3BE(C16300so r2, C16180sb r3, C18020w1 r4, C17130ua r5, C14730pf r6, C14710pd r7, C20330zs r8, C17680vT r9, C31781f1 r10, C216214u r11, C30701co r12, C30761cu r13, C38241qT r14, C30741cs r15, C19040xf r16, C18840xL r17, C18820xJ r18, C18830xK r19, C16320sq r20, AnonymousClass12P r21, URL url) {
        this.A06 = r7;
        this.A01 = r2;
        this.A0J = r20;
        this.A02 = r3;
        this.A05 = r6;
        this.A0F = r16;
        this.A0H = r18;
        this.A03 = r4;
        this.A0I = r19;
        this.A0G = r17;
        this.A0K = r21;
        this.A0A = r11;
        this.A08 = r9;
        this.A07 = r8;
        this.A0L = url;
        this.A0D = r14;
        this.A0E = r15;
        this.A04 = r5;
        this.A09 = r10;
        this.A0B = r12;
        this.A0C = r13;
    }

    public static C31701et A00(C30701co r8, C84454Kp r9, C38241qT r10, File file, File file2, String str, String str2, URL url) {
        int A002 = C61973Bd.A00(r9, r10, file2, str, url);
        FutureTask futureTask = r8.A02;
        if (!futureTask.isCancelled()) {
            if (A002 != 0) {
                return new C31701et(A002, (String) null, true);
            }
            if (file.equals(file2)) {
                return new C31701et((File) null, r9.A02, 0, true);
            }
            int A012 = C61973Bd.A01(r10, str2, url);
            if (!futureTask.isCancelled()) {
                if (A012 != 0) {
                    return A012 != 1 ? new C31701et(7, (String) null, true) : new C31701et(1, (String) null, true);
                }
                String str3 = r10.A0H;
                String str4 = "enc";
                if (str3 != null) {
                    String A003 = C221516v.A00(str3);
                    if (!TextUtils.isEmpty(A003)) {
                        str4 = A003;
                    }
                }
                return new C31701et((File) null, str4, 0, true);
            }
        }
        return new C31701et(13, (String) null, false);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0081 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0077=Splitter:B:25:0x0077, B:15:0x0069=Splitter:B:15:0x0069} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C38241qT r8, java.io.File r9, java.io.File r10) {
        /*
            java.lang.String r2 = ", plain text hash: "
            X.1XK r0 = r8.A09
            X.4xp r1 = new X.4xp
            r1.<init>(r0)
            byte[] r0 = r8.A0Y
            X.AnonymousClass00B.A06(r0)
            X.1zH r6 = r1.A7u(r0)
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0082 }
            r3.<init>(r9)     // Catch:{ IOException -> 0x0082 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x007d }
            r4.<init>(r10)     // Catch:{ all -> 0x007d }
            long r0 = r9.length()     // Catch:{ all -> 0x0078 }
            X.37w r5 = new X.37w     // Catch:{ all -> 0x0078 }
            r5.<init>(r6, r4, r0)     // Catch:{ all -> 0x0078 }
            r7 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r7]     // Catch:{ all -> 0x0073 }
            r1 = 0
            int r0 = r3.read(r6, r1, r7)     // Catch:{ all -> 0x0073 }
        L_0x002e:
            if (r0 <= 0) goto L_0x0038
            r5.write(r6)     // Catch:{ all -> 0x0073 }
            int r0 = r3.read(r6, r1, r7)     // Catch:{ all -> 0x0073 }
            goto L_0x002e
        L_0x0038:
            boolean r0 = r5.A01     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0063
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "normaldownloadhandler/decryptFile Decryption failure in express path download for file "
            r1.append(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = r10.getCanonicalPath()     // Catch:{ all -> 0x0073 }
            r1.append(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = ", enc hash: "
            r1.append(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = r8.A0E     // Catch:{ all -> 0x0073 }
            r1.append(r0)     // Catch:{ all -> 0x0073 }
            r1.append(r2)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = r8.A0F     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0073 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0073 }
            goto L_0x0069
        L_0x0063:
            r10.getCanonicalPath()     // Catch:{ all -> 0x0073 }
            r10.length()     // Catch:{ all -> 0x0073 }
        L_0x0069:
            r5.close()     // Catch:{ all -> 0x0078 }
            r4.close()     // Catch:{ all -> 0x007d }
            r3.close()     // Catch:{ IOException -> 0x0082 }
            return
        L_0x0073:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0077 }
        L_0x0077:
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x007c }
        L_0x007c:
            throw r0     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0081 }
        L_0x0081:
            throw r0     // Catch:{ IOException -> 0x0082 }
        L_0x0082:
            java.lang.String r0 = "normaldownloadhandler/decryptFile Decryption failure in express path download, enc hash: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r8.A0E
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r8.A0F
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BE.A01(X.1qT, java.io.File, java.io.File):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:312|313|314|315|316|317) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:319|320|321|322|323|324) */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0633, code lost:
        if (r22.A0E == null) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x063b, code lost:
        if (r22.A0E == null) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0244, code lost:
        if (r34 > 0) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x025e, code lost:
        if (r14.A02(r13, r4.A04, r23, false, r41, r4.A0U, r4.A0T) != false) goto L_0x0260;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x02e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:260:0x050c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:293:0x0568 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:316:0x05a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:323:0x05ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:350:0x05f1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:352:0x05f2 */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0601 A[Catch:{ all -> 0x0564, all -> 0x05a6, all -> 0x06d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:426:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ff A[Catch:{ all -> 0x05f1, 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0103 A[ADDED_TO_REGION, Catch:{ all -> 0x05f1, 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0149 A[Catch:{ NumberFormatException -> 0x01bd, all -> 0x05ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ff A[Catch:{ NumberFormatException -> 0x01bd, all -> 0x05ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0227 A[Catch:{ all -> 0x0564, all -> 0x05a6, all -> 0x06d5 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:188:0x0432=Splitter:B:188:0x0432, B:207:0x0454=Splitter:B:207:0x0454, B:293:0x0568=Splitter:B:293:0x0568, B:224:0x049f=Splitter:B:224:0x049f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C31701et A02(X.C29561ap r48, java.io.File r49, java.net.URL r50, boolean r51) {
        /*
            r47 = this;
            r5 = r47
            X.1qT r4 = r5.A0D
            int r0 = r4.A00
            r34 = r0
            int r0 = r0 + 15
            int r0 = r0 >> 4
            int r33 = r0 << 4
            java.io.File r10 = r4.A0B
            java.lang.String r6 = "; url="
            r9 = r50
            if (r10 == 0) goto L_0x06e0
            long r2 = r10.length()
            X.1cs r0 = r5.A0E
            r22 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0.A0G = r1
            X.1cu r0 = r5.A0C
            r45 = r0
            r0.A0B(r2)
            if (r51 == 0) goto L_0x0075
            r0 = r33
            long r0 = (long) r0
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x0075
            X.1XK r0 = r4.A09
            X.4xp r1 = new X.4xp
            r1.<init>(r0)
            byte[] r0 = r4.A0Y
            X.AnonymousClass00B.A06(r0)
            X.1zH r14 = r1.A7u(r0)
            X.0so r9 = r5.A01
            X.0sb r8 = r5.A02
            X.0xJ r7 = r5.A0H
            X.0w1 r6 = r5.A03
            X.0xK r3 = r5.A0I
            X.0xL r2 = r5.A0G
            X.1co r1 = r5.A0B
            int r0 = r1.A0u
            r11 = r9
            r12 = r8
            r13 = r6
            r15 = r1
            r16 = r45
            r17 = r4
            r18 = r2
            r19 = r7
            r20 = r3
            r21 = r10
            r22 = r0
            r23 = r33
            X.C61973Bd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 14
            r1 = 0
            r0 = 0
            X.1et r12 = new X.1et
            r12.<init>(r2, r0, r1)
        L_0x0074:
            return r12
        L_0x0075:
            r1 = 0
            r16 = 0
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x007d
            r1 = 1
        L_0x007d:
            r5.A00 = r1     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0606 }
            java.security.MessageDigest r18 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0606 }
            r15 = r49
            long r0 = r4.A07     // Catch:{ IOException -> 0x00f3 }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x00f1
            X.0pd r12 = r5.A06     // Catch:{ IOException -> 0x00f3 }
            X.0tM r8 = X.C16620tM.A01     // Catch:{ IOException -> 0x00f3 }
            r7 = 1539(0x603, float:2.157E-42)
            boolean r7 = r12.A0E(r8, r7)     // Catch:{ IOException -> 0x00f3 }
            if (r7 == 0) goto L_0x00f1
            r7 = r18
            java.lang.String r8 = X.C37981q3.A01(r10, r7)     // Catch:{ IOException -> 0x00f3 }
            java.lang.String r7 = r4.A0E     // Catch:{ IOException -> 0x00f3 }
            boolean r12 = r8.equals(r7)     // Catch:{ IOException -> 0x00f3 }
            if (r12 == 0) goto L_0x00f1
            r10.getCanonicalPath()     // Catch:{ IOException -> 0x00f3 }
            long r13 = r15.length()     // Catch:{ IOException -> 0x00f3 }
            int r12 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x00bc
            r10.getCanonicalPath()     // Catch:{ IOException -> 0x00f3 }
            A01(r4, r10, r15)     // Catch:{ IOException -> 0x00f3 }
        L_0x00bc:
            r22.A07()     // Catch:{ IOException -> 0x00f3 }
            java.lang.String r29 = X.C37981q3.A01(r15, r11)     // Catch:{ IOException -> 0x00f3 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x00f3 }
            r0 = 0
            X.4Kp r12 = new X.4Kp     // Catch:{ IOException -> 0x00f3 }
            r12.<init>(r0, r1)     // Catch:{ IOException -> 0x00f3 }
            X.1co r13 = r5.A0B     // Catch:{ IOException -> 0x00f3 }
            r0 = r2
            r23 = r13
            r24 = r12
            r25 = r4
            r26 = r10
            r27 = r15
            r28 = r8
            r30 = r9
            X.1et r12 = A00(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ IOException -> 0x00f4 }
            r22.A06()     // Catch:{ IOException -> 0x00f4 }
            int r8 = r12.A01     // Catch:{ IOException -> 0x00f4 }
            if (r8 != 0) goto L_0x00f9
            r5.A03(r7)     // Catch:{ IOException -> 0x00f4 }
            X.0sb r7 = r5.A02     // Catch:{ IOException -> 0x00f4 }
            X.C61973Bd.A04(r7, r12, r10, r15)     // Catch:{ IOException -> 0x00f4 }
            goto L_0x0625
        L_0x00f1:
            r0 = r2
            goto L_0x00f9
        L_0x00f3:
            r0 = r2
        L_0x00f4:
            java.lang.String r7 = "normaldownloadhandler/downloadnormal error when suspect local has full data and try to return early"
            com.whatsapp.util.Log.e((java.lang.String) r7)     // Catch:{ all -> 0x06d5 }
        L_0x00f9:
            X.0zs r12 = r5.A07     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            int r7 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x0101
            r2 = 0
        L_0x0101:
            if (r51 == 0) goto L_0x0109
            if (r34 <= 0) goto L_0x0109
            int r7 = r33 + -1
            long r7 = (long) r7     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            goto L_0x010b
        L_0x0109:
            r7 = -1
        L_0x010b:
            r24 = r48
            r23 = r12
            r25 = r9
            r26 = r2
            r28 = r7
            X.1pl r30 = r23.A00(r24, r25, r26, r28)     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            r22.A05()     // Catch:{ all -> 0x05ed }
            r2 = r30
            X.1pk r2 = (X.C37791pk) r2     // Catch:{ all -> 0x05ed }
            java.lang.Boolean r3 = r2.A00     // Catch:{ all -> 0x05ed }
            r2 = r22
            r2.A09 = r3     // Catch:{ all -> 0x05ed }
            int r2 = r30.A6O()     // Catch:{ all -> 0x05ed }
            java.lang.Long r7 = X.C13690nt.A0W(r2)     // Catch:{ all -> 0x05ed }
            r2 = r22
            r2.A0M = r7     // Catch:{ all -> 0x05ed }
            java.lang.String r7 = "X-WA-Metadata"
            r2 = r30
            java.lang.String r7 = r2.AHk(r7)     // Catch:{ all -> 0x05ed }
            X.4Kp r32 = new X.4Kp     // Catch:{ all -> 0x05ed }
            r2 = r32
            r2.<init>(r7, r3)     // Catch:{ all -> 0x05ed }
            int r3 = r30.A6O()     // Catch:{ all -> 0x05ed }
            r2 = 416(0x1a0, float:5.83E-43)
            if (r3 != r2) goto L_0x01d8
            java.lang.String r3 = "Content-Range"
            r2 = r30
            java.lang.String r8 = r2.AHk(r3)     // Catch:{ all -> 0x05ed }
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x05ed }
            if (r2 != 0) goto L_0x01d8
            java.lang.String r2 = "*/"
            boolean r2 = r8.contains(r2)     // Catch:{ all -> 0x05ed }
            if (r2 == 0) goto L_0x01d8
            r2 = 47
            int r2 = r8.lastIndexOf(r2)     // Catch:{ NumberFormatException -> 0x01bd }
            int r2 = r2 + 1
            java.lang.String r2 = r8.substring(r2)     // Catch:{ NumberFormatException -> 0x01bd }
            long r12 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x01bd }
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01d8
            r10.getCanonicalPath()     // Catch:{ NumberFormatException -> 0x01bd }
            java.lang.String r7 = r4.A0E     // Catch:{ NumberFormatException -> 0x01bd }
            long r13 = r15.length()     // Catch:{ NumberFormatException -> 0x01bd }
            long r2 = r4.A07     // Catch:{ NumberFormatException -> 0x01bd }
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0188
            r10.getCanonicalPath()     // Catch:{ NumberFormatException -> 0x01bd }
            A01(r4, r10, r15)     // Catch:{ NumberFormatException -> 0x01bd }
        L_0x0188:
            r22.A07()     // Catch:{ NumberFormatException -> 0x01bd }
            r2 = r18
            java.lang.String r40 = X.C37981q3.A01(r10, r2)     // Catch:{ NumberFormatException -> 0x01bd }
            java.lang.String r41 = X.C37981q3.A01(r15, r11)     // Catch:{ NumberFormatException -> 0x01bd }
            X.1co r2 = r5.A0B     // Catch:{ NumberFormatException -> 0x01bd }
            r35 = r2
            r36 = r32
            r37 = r4
            r38 = r10
            r39 = r15
            r42 = r9
            X.1et r12 = A00(r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ NumberFormatException -> 0x01bd }
            r22.A06()     // Catch:{ NumberFormatException -> 0x01bd }
            r5.A03(r7)     // Catch:{ NumberFormatException -> 0x01bd }
            X.0sb r2 = r5.A02     // Catch:{ NumberFormatException -> 0x01bd }
            X.C61973Bd.A04(r2, r12, r10, r15)     // Catch:{ NumberFormatException -> 0x01bd }
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0602
            goto L_0x0625
        L_0x01bd:
            r7 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x05ed }
            java.lang.String r2 = "MediaDownload/MMS download parse of Content-Range response header failed; mediaHash="
            r3.append(r2)     // Catch:{ all -> 0x05ed }
            java.lang.String r2 = r4.A0F     // Catch:{ all -> 0x05ed }
            X.C13690nt.A1M(r9, r2, r6, r3)     // Catch:{ all -> 0x05ed }
            java.lang.String r2 = "; responseContentRange="
            r3.append(r2)     // Catch:{ all -> 0x05ed }
            java.lang.String r2 = X.AnonymousClass000.A0h(r8, r3)     // Catch:{ all -> 0x05ed }
            com.whatsapp.util.Log.w(r2, r7)     // Catch:{ all -> 0x05ed }
        L_0x01d8:
            long r2 = r30.getContentLength()     // Catch:{ all -> 0x05ed }
            long r20 = r0 + r2
            X.0pf r2 = r5.A05     // Catch:{ all -> 0x05ed }
            long r12 = r2.A01()     // Catch:{ all -> 0x05ed }
            X.0pd r2 = r5.A06     // Catch:{ all -> 0x05ed }
            r44 = r2
            r7 = 1291(0x50b, float:1.809E-42)
            X.0tM r31 = X.C16620tM.A02     // Catch:{ all -> 0x05ed }
            r3 = r2
            r2 = r31
            int r2 = r3.A03(r2, r7)     // Catch:{ all -> 0x05ed }
            long r2 = (long) r2     // Catch:{ all -> 0x05ed }
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r7
            long r2 = r2 + r20
            r7 = 4
            int r8 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x0227
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x05ed }
            java.lang.String r0 = "MediaDownload/MMS download failed due to insufficient space; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x05ed }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x05ed }
            r1.append(r0)     // Catch:{ all -> 0x05ed }
            java.lang.String r0 = X.AnonymousClass000.A0e(r9, r6, r1)     // Catch:{ all -> 0x05ed }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x05ed }
            boolean r1 = r5.A00     // Catch:{ all -> 0x05ed }
            r0 = 0
            X.1et r12 = new X.1et     // Catch:{ all -> 0x05ed }
            r12.<init>(r7, r0, r1)     // Catch:{ all -> 0x05ed }
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0602
            goto L_0x0625
        L_0x0227:
            r8 = 0
            X.1co r7 = r5.A0B     // Catch:{ all -> 0x05ed }
            boolean r2 = r7.A05     // Catch:{ all -> 0x05ed }
            if (r2 == 0) goto L_0x0260
            int r3 = r7.A0u     // Catch:{ all -> 0x05ed }
            r2 = 1
            if (r2 != r3) goto L_0x0260
            X.14u r2 = r5.A0A     // Catch:{ all -> 0x05ed }
            r14 = r2
            X.1XK r13 = r4.A09     // Catch:{ all -> 0x05ed }
            long r2 = r4.A07     // Catch:{ all -> 0x05ed }
            r23 = r2
            r40 = 0
            boolean r2 = r4.A0O     // Catch:{ all -> 0x05ed }
            if (r2 != 0) goto L_0x0246
            r41 = 0
            if (r34 <= 0) goto L_0x0248
        L_0x0246:
            r41 = 1
        L_0x0248:
            int r12 = r4.A04     // Catch:{ all -> 0x05ed }
            boolean r3 = r4.A0U     // Catch:{ all -> 0x05ed }
            boolean r2 = r4.A0T     // Catch:{ all -> 0x05ed }
            r35 = r14
            r36 = r13
            r37 = r12
            r38 = r23
            r42 = r3
            r43 = r2
            boolean r2 = r35.A02(r36, r37, r38, r40, r41, r42, r43)     // Catch:{ all -> 0x05ed }
            if (r2 == 0) goto L_0x05da
        L_0x0260:
            java.util.concurrent.FutureTask r2 = r7.A02     // Catch:{ all -> 0x05ed }
            boolean r2 = r2.isCancelled()     // Catch:{ all -> 0x05ed }
            if (r2 != 0) goto L_0x05da
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x027a
            long r12 = r10.length()     // Catch:{ all -> 0x05ed }
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x027a
            r10.getCanonicalPath()     // Catch:{ all -> 0x05ed }
            r7.A09(r0)     // Catch:{ all -> 0x05ed }
        L_0x027a:
            X.1XK r2 = r4.A09     // Catch:{ all -> 0x05ed }
            r41 = r2
            X.4xp r3 = new X.4xp     // Catch:{ all -> 0x05ed }
            r3.<init>(r2)     // Catch:{ all -> 0x05ed }
            byte[] r2 = r4.A0Y     // Catch:{ all -> 0x05ed }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x05ed }
            X.1zH r29 = r3.A7u(r2)     // Catch:{ all -> 0x05ed }
            r3 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x05af }
            r2.<init>(r15, r3)     // Catch:{ IOException -> 0x05af }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x05af }
            r3.<init>(r2)     // Catch:{ IOException -> 0x05af }
            X.5BH r28 = new X.5BH     // Catch:{ IOException -> 0x05af }
            r2 = r28
            r2.<init>(r3, r11)     // Catch:{ IOException -> 0x05af }
            long r2 = r30.getContentLength()     // Catch:{ all -> 0x05a6 }
            long r11 = r10.length()     // Catch:{ all -> 0x05a6 }
            long r2 = r2 + r11
            X.37w r27 = new X.37w     // Catch:{ all -> 0x05a6 }
            r13 = r28
            r12 = r27
            r11 = r29
            r12.<init>(r11, r13, r2)     // Catch:{ all -> 0x05a6 }
            boolean r2 = r10.exists()     // Catch:{ IOException -> 0x0569 }
            if (r2 == 0) goto L_0x0303
            long r11 = r10.length()     // Catch:{ IOException -> 0x0569 }
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0303
            java.io.FileInputStream r2 = X.C17970vw.A0G(r10)     // Catch:{ IOException -> 0x02ea }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x02ea }
            r3.<init>(r2)     // Catch:{ IOException -> 0x02ea }
            X.1zP r14 = new X.1zP     // Catch:{ IOException -> 0x02ea }
            r2 = r18
            r14.<init>(r3, r2)     // Catch:{ IOException -> 0x02ea }
            r13 = 8192(0x2000, float:1.14794E-41)
            byte[] r12 = new byte[r13]     // Catch:{ all -> 0x02e5 }
        L_0x02d4:
            r11 = 0
            int r3 = r14.read(r12, r11, r13)     // Catch:{ all -> 0x02e5 }
            if (r3 < 0) goto L_0x02e1
            r2 = r27
            r2.write(r12, r11, r3)     // Catch:{ all -> 0x02e5 }
            goto L_0x02d4
        L_0x02e1:
            r14.close()     // Catch:{ IOException -> 0x02ea }
            goto L_0x0303
        L_0x02e5:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x02e9 }
        L_0x02e9:
            throw r0     // Catch:{ IOException -> 0x02ea }
        L_0x02ea:
            r2 = move-exception
            java.lang.String r0 = "MediaDownload/MMS download failed in pre-download with Exception; mediaHash="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x0569 }
            java.lang.String r0 = r4.A0F     // Catch:{ IOException -> 0x0569 }
            r1.append(r0)     // Catch:{ IOException -> 0x0569 }
            r1.append(r6)     // Catch:{ IOException -> 0x0569 }
            java.net.URL r0 = r5.A0L     // Catch:{ IOException -> 0x0569 }
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)     // Catch:{ IOException -> 0x0569 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ IOException -> 0x0569 }
            throw r2     // Catch:{ IOException -> 0x0569 }
        L_0x0303:
            r2 = 1
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0569 }
            r11.<init>(r10, r2)     // Catch:{ IOException -> 0x0569 }
            java.security.DigestOutputStream r26 = new java.security.DigestOutputStream     // Catch:{ IOException -> 0x0569 }
            r3 = r26
            r2 = r18
            r3.<init>(r11, r2)     // Catch:{ IOException -> 0x0569 }
            X.0ua r12 = r5.A04     // Catch:{ IOException -> 0x050d }
            boolean r2 = r4.A0U     // Catch:{ IOException -> 0x050d }
            r3 = 0
            if (r2 == 0) goto L_0x031a
            r3 = 4
        L_0x031a:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x050d }
            java.lang.Integer r3 = X.C13680ns.A0X()     // Catch:{ IOException -> 0x050d }
            r2 = r30
            java.io.InputStream r11 = r2.A9k(r12, r11, r3)     // Catch:{ IOException -> 0x050d }
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r13 = new byte[r2]     // Catch:{ IOException -> 0x033d }
            r12 = 0
            int r14 = r11.read(r13, r12, r2)     // Catch:{ IOException -> 0x033d }
            r2 = r33
            long r2 = (long) r2
            r24 = r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r23 = X.C13700nu.A0f(r2)
            goto L_0x0373
        L_0x033d:
            r1 = move-exception
            r0 = r22
            r0.A0B(r1)     // Catch:{ all -> 0x0506 }
            java.net.URL r3 = r5.A0L     // Catch:{ all -> 0x0506 }
            java.lang.String r2 = X.C29551ao.A00(r3)     // Catch:{ all -> 0x0506 }
            r0.A0T = r2     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = "MediaDownload/MMS download failed with IOException; mediaHash="
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x0506 }
            r2.append(r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = X.AnonymousClass000.A0e(r3, r6, r2)     // Catch:{ all -> 0x0506 }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0506 }
            int r2 = X.C811246y.A00(r1)     // Catch:{ all -> 0x0506 }
            goto L_0x0366
        L_0x0362:
            if (r2 == 0) goto L_0x036a
            r2 = 20
        L_0x0366:
            if (r51 == 0) goto L_0x0446
            goto L_0x03f3
        L_0x036a:
            r7.A09(r0)     // Catch:{ IOException -> 0x033d }
            r2 = 8192(0x2000, float:1.14794E-41)
            int r14 = r11.read(r13, r12, r2)     // Catch:{ IOException -> 0x033d }
        L_0x0373:
            if (r14 < 0) goto L_0x03f0
            r2 = r22
            java.lang.Long r2 = r2.A0P     // Catch:{ IOException -> 0x033d }
            if (r2 != 0) goto L_0x037e
            r22.A08()     // Catch:{ IOException -> 0x033d }
        L_0x037e:
            r2 = r26
            r2.write(r13, r12, r14)     // Catch:{ IOException -> 0x033d }
            r2 = r27
            r2.write(r13, r12, r14)     // Catch:{ IOException -> 0x033d }
            long r2 = (long) r14     // Catch:{ IOException -> 0x033d }
            long r0 = r0 + r2
            X.1f1 r14 = r5.A09     // Catch:{ IOException -> 0x033d }
            if (r14 == 0) goto L_0x0390
            r14.A0A = r0     // Catch:{ IOException -> 0x033d }
        L_0x0390:
            r14 = r22
            r14.A0A(r0, r2)     // Catch:{ IOException -> 0x033d }
            r16 = 0
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            boolean r2 = X.AnonymousClass000.A1Q(r2)
            r5.A00 = r2     // Catch:{ IOException -> 0x033d }
            X.1XK r3 = X.AnonymousClass1XK.A0S     // Catch:{ IOException -> 0x033d }
            r2 = r41
            if (r2 != r3) goto L_0x03cb
            byte[] r2 = r4.A0X     // Catch:{ IOException -> 0x033d }
            if (r34 <= 0) goto L_0x03cb
            if (r2 == 0) goto L_0x03cb
            if (r51 != 0) goto L_0x03cb
            int r2 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r2 < 0) goto L_0x03cb
            if (r23 != 0) goto L_0x03cb
            X.0sq r3 = r5.A0J     // Catch:{ IOException -> 0x033d }
            r40 = 1
            com.facebook.redex.RunnableRunnableShape1S0301000_I1 r2 = new com.facebook.redex.RunnableRunnableShape1S0301000_I1     // Catch:{ IOException -> 0x033d }
            r35 = r2
            r36 = r5
            r37 = r29
            r38 = r10
            r39 = r33
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ IOException -> 0x033d }
            r3.Acl(r2)     // Catch:{ IOException -> 0x033d }
            r23 = 1
        L_0x03cb:
            r2 = r45
            r2.A0B(r0)     // Catch:{ IOException -> 0x033d }
            r7.A06()     // Catch:{ IOException -> 0x033d }
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.A0s     // Catch:{ IOException -> 0x033d }
            boolean r2 = r2.getAndSet(r12)     // Catch:{ IOException -> 0x033d }
            if (r2 == 0) goto L_0x036a
            long r18 = r20 - r0
            r16 = 52428800(0x3200000, double:2.5903269E-316)
            int r2 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x036a
            r14 = 488(0x1e8, float:6.84E-43)
            r3 = r44
            r2 = r31
            boolean r2 = r3.A0E(r2, r14)     // Catch:{ IOException -> 0x033d }
            goto L_0x0362
        L_0x03f0:
            r2 = 0
            goto L_0x0366
        L_0x03f3:
            monitor-enter(r22)     // Catch:{ all -> 0x0506 }
            monitor-exit(r22)     // Catch:{ all -> 0x0506 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x0424
            X.0so r14 = r5.A01     // Catch:{ all -> 0x0506 }
            X.0sb r13 = r5.A02     // Catch:{ all -> 0x0506 }
            X.0xJ r12 = r5.A0H     // Catch:{ all -> 0x0506 }
            X.0w1 r3 = r5.A03     // Catch:{ all -> 0x0506 }
            X.0xK r2 = r5.A0I     // Catch:{ all -> 0x0506 }
            X.0xL r1 = r5.A0G     // Catch:{ all -> 0x0506 }
            int r0 = r7.A0u     // Catch:{ all -> 0x0506 }
            r34 = r14
            r35 = r13
            r36 = r3
            r37 = r29
            r38 = r7
            r39 = r45
            r40 = r4
            r41 = r1
            r42 = r12
            r43 = r2
            r44 = r10
            r45 = r0
            r46 = r33
            X.C61973Bd.A02(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x0506 }
        L_0x0424:
            boolean r1 = r5.A00     // Catch:{ all -> 0x0506 }
            r0 = 14
            X.1et r12 = new X.1et     // Catch:{ all -> 0x0506 }
            r12.<init>(r0, r8, r1)     // Catch:{ all -> 0x0506 }
            if (r11 == 0) goto L_0x0432
            r11.close()     // Catch:{ IOException -> 0x050d }
        L_0x0432:
            r26.close()     // Catch:{ IOException -> 0x0569 }
            r27.close()     // Catch:{ all -> 0x05a6 }
            r28.close()     // Catch:{ IOException -> 0x05af }
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0602
            goto L_0x0625
        L_0x0446:
            if (r2 == 0) goto L_0x0462
            boolean r0 = r5.A00     // Catch:{ all -> 0x0506 }
            X.1et r1 = new X.1et     // Catch:{ all -> 0x0506 }
            r1.<init>(r2, r8, r0)     // Catch:{ all -> 0x0506 }
            if (r11 == 0) goto L_0x0454
            r11.close()     // Catch:{ IOException -> 0x050d }
        L_0x0454:
            r26.close()     // Catch:{ IOException -> 0x0569 }
            r27.close()     // Catch:{ all -> 0x05a6 }
            r28.close()     // Catch:{ IOException -> 0x05af }
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            goto L_0x062f
        L_0x0462:
            r22.A07()     // Catch:{ all -> 0x0506 }
            java.security.MessageDigest r0 = r26.getMessageDigest()     // Catch:{ all -> 0x0506 }
            byte[] r1 = r0.digest()     // Catch:{ all -> 0x0506 }
            r0 = 2
            java.lang.String r36 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0506 }
            r0 = r27
            boolean r0 = r0.A01     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x0497
            java.security.MessageDigest r0 = r28.getMessageDigest()     // Catch:{ all -> 0x0506 }
            byte[] r1 = r0.digest()     // Catch:{ all -> 0x0506 }
            r0 = 2
            java.lang.String r37 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0506 }
        L_0x0485:
            r31 = r7
            r33 = r4
            r34 = r10
            r35 = r15
            r38 = r9
            X.1et r12 = A00(r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0506 }
            r22.A06()     // Catch:{ all -> 0x0506 }
            goto L_0x049a
        L_0x0497:
            r37 = 0
            goto L_0x0485
        L_0x049a:
            if (r11 == 0) goto L_0x049f
            r11.close()     // Catch:{ IOException -> 0x050d }
        L_0x049f:
            r26.close()     // Catch:{ IOException -> 0x0569 }
            r27.close()     // Catch:{ all -> 0x05a6 }
            r28.close()     // Catch:{ IOException -> 0x05af }
            X.0tM r2 = X.C16620tM.A01     // Catch:{ all -> 0x05ed }
            r1 = 1539(0x603, float:2.157E-42)
            r0 = r44
            boolean r0 = r0.A0E(r2, r1)     // Catch:{ all -> 0x05ed }
            if (r0 == 0) goto L_0x04b9
            java.lang.String r0 = r4.A0E     // Catch:{ all -> 0x05ed }
            r5.A03(r0)     // Catch:{ all -> 0x05ed }
        L_0x04b9:
            X.0sb r2 = r5.A02     // Catch:{ all -> 0x05ed }
            X.C61973Bd.A04(r2, r12, r10, r15)     // Catch:{ all -> 0x05ed }
            java.lang.String r7 = r4.A0F     // Catch:{ all -> 0x05ed }
            java.lang.String r3 = r4.A0J     // Catch:{ all -> 0x05ed }
            X.0sc r1 = r2.A02     // Catch:{ all -> 0x05ed }
            java.lang.String r0 = ".Thumbs"
            java.io.File r1 = r1.A07(r0)     // Catch:{ all -> 0x05ed }
            java.lang.String r0 = ".prog.thumb.jpg"
            java.io.File r1 = X.C16180sb.A01(r1, r7, r3, r0)     // Catch:{ all -> 0x05ed }
            int r0 = r12.A01     // Catch:{ all -> 0x05ed }
            if (r0 != 0) goto L_0x04fb
            if (r1 == 0) goto L_0x04df
            boolean r0 = X.C31831f6.A02(r41)     // Catch:{ all -> 0x05ed }
            if (r0 == 0) goto L_0x04df
            r1.delete()     // Catch:{ all -> 0x05ed }
        L_0x04df:
            X.1XK r1 = X.AnonymousClass1XK.A0S     // Catch:{ all -> 0x05ed }
            r0 = r41
            if (r0 != r1) goto L_0x04fb
            boolean r0 = r4.A0O     // Catch:{ all -> 0x05ed }
            if (r0 == 0) goto L_0x04fb
            java.io.File r1 = r2.A0P(r7, r3)     // Catch:{ all -> 0x05ed }
            if (r1 == 0) goto L_0x04fb
            boolean r0 = r1.exists()     // Catch:{ all -> 0x05ed }
            if (r0 == 0) goto L_0x04fb
            r1.getAbsolutePath()     // Catch:{ all -> 0x05ed }
            r1.delete()     // Catch:{ all -> 0x05ed }
        L_0x04fb:
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0602
            goto L_0x0625
        L_0x0506:
            r0 = move-exception
            if (r11 == 0) goto L_0x050c
            r11.close()     // Catch:{ all -> 0x050c }
        L_0x050c:
            throw r0     // Catch:{ IOException -> 0x050d }
        L_0x050d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = "MediaDownload/MMS download failed to open url connection input stream; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x0564 }
            r1.append(r0)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = X.AnonymousClass000.A0e(r9, r6, r1)     // Catch:{ all -> 0x0564 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0564 }
            X.0vT r1 = r5.A08     // Catch:{ all -> 0x0564 }
            boolean r0 = r1.A02(r2)     // Catch:{ all -> 0x0564 }
            if (r0 == 0) goto L_0x054b
            r1.A00()     // Catch:{ all -> 0x0564 }
            r1 = 15
            boolean r0 = r5.A00     // Catch:{ all -> 0x0564 }
            X.1et r12 = new X.1et     // Catch:{ all -> 0x0564 }
            r12.<init>(r1, r8, r0)     // Catch:{ all -> 0x0564 }
            r26.close()     // Catch:{ IOException -> 0x0569 }
            r27.close()     // Catch:{ all -> 0x05a6 }
            r28.close()     // Catch:{ IOException -> 0x05af }
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0602
            goto L_0x0625
        L_0x054b:
            int r2 = X.C811246y.A00(r2)     // Catch:{ all -> 0x0564 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0564 }
            X.1et r1 = new X.1et     // Catch:{ all -> 0x0564 }
            r1.<init>(r2, r8, r0)     // Catch:{ all -> 0x0564 }
            r26.close()     // Catch:{ IOException -> 0x0569 }
            r27.close()     // Catch:{ all -> 0x05a6 }
            r28.close()     // Catch:{ IOException -> 0x05af }
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            goto L_0x0637
        L_0x0564:
            r0 = move-exception
            r26.close()     // Catch:{ all -> 0x0568 }
        L_0x0568:
            throw r0     // Catch:{ IOException -> 0x0569 }
        L_0x0569:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x059d }
            java.lang.String r0 = "MediaDownload/MMS download encountered error while dealing with server file; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x059d }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x059d }
            X.C13690nt.A1M(r9, r0, r6, r1)     // Catch:{ all -> 0x059d }
            java.lang.String r0 = "; serverFile="
            java.lang.String r0 = X.AnonymousClass000.A0e(r10, r0, r1)     // Catch:{ all -> 0x059d }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x059d }
            boolean r0 = r5.A00     // Catch:{ all -> 0x059d }
            r3 = 9
            X.1et r12 = new X.1et     // Catch:{ all -> 0x059b }
            r12.<init>(r3, r8, r0)     // Catch:{ all -> 0x059b }
            r27.close()     // Catch:{ all -> 0x05a4 }
            r28.close()     // Catch:{ IOException -> 0x05ad }
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0602
            goto L_0x0625
        L_0x059b:
            r0 = move-exception
            goto L_0x05a0
        L_0x059d:
            r0 = move-exception
            r3 = 9
        L_0x05a0:
            r27.close()     // Catch:{ all -> 0x05a3 }
        L_0x05a3:
            throw r0     // Catch:{ all -> 0x05a4 }
        L_0x05a4:
            r0 = move-exception
            goto L_0x05a9
        L_0x05a6:
            r0 = move-exception
            r3 = 9
        L_0x05a9:
            r28.close()     // Catch:{ all -> 0x05ac }
        L_0x05ac:
            throw r0     // Catch:{ IOException -> 0x05ad }
        L_0x05ad:
            r2 = move-exception
            goto L_0x05b2
        L_0x05af:
            r2 = move-exception
            r3 = 9
        L_0x05b2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x05ed }
            java.lang.String r0 = "MediaDownload/MMS download encountered error while dealing with download file; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x05ed }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x05ed }
            X.C13690nt.A1M(r9, r0, r6, r1)     // Catch:{ all -> 0x05ed }
            java.lang.String r0 = "; downloadFile="
            java.lang.String r0 = X.AnonymousClass000.A0e(r15, r0, r1)     // Catch:{ all -> 0x05ed }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x05ed }
            boolean r0 = r5.A00     // Catch:{ all -> 0x05ed }
            X.1et r12 = new X.1et     // Catch:{ all -> 0x05ed }
            r12.<init>(r3, r8, r0)     // Catch:{ all -> 0x05ed }
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0602
            goto L_0x0625
        L_0x05da:
            r1 = 13
            boolean r0 = r5.A00     // Catch:{ all -> 0x05ed }
            X.1et r12 = new X.1et     // Catch:{ all -> 0x05ed }
            r12.<init>(r1, r8, r0)     // Catch:{ all -> 0x05ed }
            r30.close()     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0602
            goto L_0x0625
        L_0x05ed:
            r0 = move-exception
            r30.close()     // Catch:{ all -> 0x05f1 }
        L_0x05f1:
            throw r0     // Catch:{ 1qB -> 0x06a6, 1q9 -> 0x066d, IllegalArgumentException -> 0x05f2, IOException -> 0x063f }
        L_0x05f2:
            boolean r2 = r5.A00     // Catch:{ all -> 0x06ca }
            r1 = 1
            r0 = 0
            X.1et r12 = new X.1et     // Catch:{ all -> 0x06ca }
            r12.<init>(r1, r0, r2)     // Catch:{ all -> 0x06ca }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0602
            goto L_0x0625
        L_0x0602:
            r22.A05()     // Catch:{ all -> 0x06d5 }
            goto L_0x0625
        L_0x0606:
            r3 = move-exception
            r2 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "MediaDownload/MMS download failed in pre-download with Exception; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x06d5 }
            r1.append(r0)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = X.AnonymousClass000.A0e(r9, r6, r1)     // Catch:{ all -> 0x06d5 }
            com.whatsapp.util.Log.w(r0, r3)     // Catch:{ all -> 0x06d5 }
            boolean r1 = r5.A00     // Catch:{ all -> 0x06d5 }
            r0 = 0
            X.1et r12 = new X.1et     // Catch:{ all -> 0x06d5 }
            r12.<init>(r2, r0, r1)     // Catch:{ all -> 0x06d5 }
        L_0x0625:
            r0 = r22
            java.lang.Long r0 = r0.A0L
            if (r0 != 0) goto L_0x0074
            r22.A09()
            return r12
        L_0x062f:
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x06bd
            goto L_0x06c0
        L_0x0637:
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x06bd
            goto L_0x06c0
        L_0x063f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x06ca }
            java.lang.String r0 = "MediaDownload/MMS download failed with IOException while retrieving response code; mediaHash="
            r1.append(r0)     // Catch:{ all -> 0x06ca }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x06ca }
            r1.append(r0)     // Catch:{ all -> 0x06ca }
            java.lang.String r0 = X.AnonymousClass000.A0e(r9, r6, r1)     // Catch:{ all -> 0x06ca }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x06ca }
            r0 = r22
            X.C29551ao.A01(r0, r2, r9)     // Catch:{ all -> 0x06ca }
            int r3 = X.C811246y.A00(r2)     // Catch:{ all -> 0x06ca }
            boolean r2 = r5.A00     // Catch:{ all -> 0x06ca }
            r0 = 0
            X.1et r1 = new X.1et     // Catch:{ all -> 0x06ca }
            r1.<init>(r3, r0, r2)     // Catch:{ all -> 0x06ca }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x06bd
            goto L_0x06c0
        L_0x066d:
            r3 = move-exception
            r22.A05()     // Catch:{ all -> 0x06ca }
            r0 = r22
            X.C29551ao.A01(r0, r3, r9)     // Catch:{ all -> 0x06ca }
            int r2 = r3.responseCode     // Catch:{ all -> 0x06ca }
            java.lang.Long r1 = X.C13690nt.A0W(r2)     // Catch:{ all -> 0x06ca }
            r0.A0M = r1     // Catch:{ all -> 0x06ca }
            X.0xf r1 = r5.A0F     // Catch:{ all -> 0x06ca }
            java.lang.String r0 = "routeselector/onmediatransfererrororresponsecode/code "
            java.lang.String r0 = X.C13680ns.A0c(r2, r0)     // Catch:{ all -> 0x06ca }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06ca }
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L_0x0692
            r0 = 403(0x193, float:5.65E-43)
            if (r2 != r0) goto L_0x0695
        L_0x0692:
            r1.A09()     // Catch:{ all -> 0x06ca }
        L_0x0695:
            int r3 = r3.downloadStatus     // Catch:{ all -> 0x06ca }
            boolean r2 = r5.A00     // Catch:{ all -> 0x06ca }
            r0 = 0
            X.1et r1 = new X.1et     // Catch:{ all -> 0x06ca }
            r1.<init>(r3, r0, r2)     // Catch:{ all -> 0x06ca }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x06bd
            goto L_0x06c0
        L_0x06a6:
            r1 = move-exception
            r0 = r22
            X.C29551ao.A01(r0, r1, r9)     // Catch:{ all -> 0x06ca }
            int r3 = r1.downloadStatus     // Catch:{ all -> 0x06ca }
            boolean r2 = r5.A00     // Catch:{ all -> 0x06ca }
            r0 = 0
            X.1et r1 = new X.1et     // Catch:{ all -> 0x06ca }
            r1.<init>(r3, r0, r2)     // Catch:{ all -> 0x06ca }
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x06bd
            goto L_0x06c0
        L_0x06bd:
            r22.A05()     // Catch:{ all -> 0x06d5 }
        L_0x06c0:
            r0 = r22
            java.lang.Long r0 = r0.A0L
            if (r0 != 0) goto L_0x06c9
            r22.A09()
        L_0x06c9:
            return r1
        L_0x06ca:
            r1 = move-exception
            r0 = r22
            java.lang.Long r0 = r0.A0E     // Catch:{ all -> 0x06d5 }
            if (r0 != 0) goto L_0x06d4
            r22.A05()     // Catch:{ all -> 0x06d5 }
        L_0x06d4:
            throw r1     // Catch:{ all -> 0x06d5 }
        L_0x06d5:
            r1 = move-exception
            r0 = r22
            java.lang.Long r0 = r0.A0L
            if (r0 != 0) goto L_0x06df
            r22.A09()
        L_0x06df:
            throw r1
        L_0x06e0:
            java.lang.String r0 = "MediaDownload/MMS download failed due to message allowed into download encrypted without sufficient information to compute a download file; mediaHash="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r4.A0F
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0e(r9, r6, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BE.A02(X.1ap, java.io.File, java.net.URL, boolean):X.1et");
    }

    public final void A03(String str) {
        if (str == null) {
            Log.e("normalDownloadHandler/cancelExpressPathFileCleanUp cancel work with empty enc hash");
        } else {
            ((AnonymousClass022) this.A0K.get()).A0A(str);
        }
    }
}
