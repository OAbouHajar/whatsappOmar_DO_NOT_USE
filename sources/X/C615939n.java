package X;

import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/* renamed from: X.39n  reason: invalid class name and case insensitive filesystem */
public class C615939n {
    public C84454Kp A00;
    public AnonymousClass3AV A01;
    public Exception A02;
    public String A03;
    public String A04;
    public final C16300so A05;
    public final C16180sb A06;
    public final C18020w1 A07;
    public final Mp4Ops A08;
    public final C17130ua A09;
    public final C16440t3 A0A;
    public final C16980tz A0B;
    public final C14730pf A0C;
    public final C43061zH A0D;
    public final C14710pd A0E;
    public final C20330zs A0F;
    public final C216214u A0G;
    public final C30701co A0H;
    public final C30761cu A0I;
    public final C38241qT A0J;
    public final C29561ap A0K;
    public final C48642Oh A0L;
    public final C215714p A0M;
    public final File A0N;
    public final File A0O;
    public final File A0P;
    public final URL A0Q;
    public final byte[] A0R;
    public final int[] A0S;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0061, code lost:
        if (r2 == 2) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C615939n(X.C16300so r6, X.C16180sb r7, X.C18020w1 r8, com.whatsapp.Mp4Ops r9, X.C17130ua r10, X.C16440t3 r11, X.C16980tz r12, X.C14730pf r13, X.C14710pd r14, X.C20330zs r15, X.C216214u r16, X.C30701co r17, X.C30761cu r18, X.C38241qT r19, X.C29561ap r20, X.C48642Oh r21, X.C215714p r22, java.io.File r23, java.io.File r24, java.io.File r25, java.net.URL r26, byte[] r27, int[] r28) {
        /*
            r5 = this;
            r5.<init>()
            r5.A0B = r12
            r5.A0A = r11
            r5.A08 = r9
            r5.A0E = r14
            r5.A05 = r6
            r5.A06 = r7
            r5.A09 = r10
            r5.A0C = r13
            r5.A07 = r8
            r0 = r16
            r5.A0G = r0
            r0 = r22
            r5.A0M = r0
            r0 = r27
            r5.A0R = r0
            r4 = r19
            r5.A0J = r4
            r3 = r18
            r5.A0I = r3
            r0 = r28
            r5.A0S = r0
            r5.A0F = r15
            X.1XK r0 = r4.A09
            X.4xp r1 = new X.4xp
            r1.<init>(r0)
            byte[] r0 = r4.A0Y
            X.1zH r0 = r1.A7u(r0)
            r5.A0D = r0
            r0 = r17
            r5.A0H = r0
            r0 = r21
            r5.A0L = r0
            r0 = r26
            r5.A0Q = r0
            r0 = r23
            r5.A0P = r0
            r0 = r24
            r5.A0O = r0
            r0 = r25
            r5.A0N = r0
            r0 = r20
            r5.A0K = r0
            int r2 = r4.A02
            r0 = 3
            if (r2 == r0) goto L_0x0063
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0064
        L_0x0063:
            r0 = 1
        L_0x0064:
            X.AnonymousClass00B.A0G(r0)
            r0 = 3
            if (r2 != r0) goto L_0x0076
            java.lang.String r1 = r4.A0K
            r0 = 6
            if (r1 != 0) goto L_0x0070
            r0 = 4
        L_0x0070:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A08 = r0
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615939n.<init>(X.0so, X.0sb, X.0w1, com.whatsapp.Mp4Ops, X.0ua, X.0t3, X.0tz, X.0pf, X.0pd, X.0zs, X.14u, X.1co, X.1cu, X.1qT, X.1ap, X.2Oh, X.14p, java.io.File, java.io.File, java.io.File, java.net.URL, byte[], int[]):void");
    }

    public final C37801pl A00(URL url, long j2, long j3) {
        C37801pl A002 = this.A0F.A00(this.A0K, url, j2, j3);
        if (this.A00 == null) {
            this.A00 = new C84454Kp(A002.AHk("X-WA-Metadata"), ((C37791pk) A002).A00);
        }
        return A002;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r6 = this;
            X.1qT r2 = r6.A0J
            X.1XK r0 = r2.A09
            boolean r1 = r2.A0U
            boolean r0 = X.C31831f6.A02(r0)
            if (r0 == 0) goto L_0x0051
            if (r1 == 0) goto L_0x0051
            boolean r0 = r2.A0N
            if (r0 != 0) goto L_0x0051
            int[] r1 = r6.A0S
            if (r1 == 0) goto L_0x0051
            X.1cu r5 = r6.A0I
            byte[] r0 = r5.A0G()
            if (r0 != 0) goto L_0x0051
            java.io.File r2 = r6.A0O
            r0 = 0
            r0 = r1[r0]
            long r3 = (long) r0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0047 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0047 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0047 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0047 }
            X.1q7 r2 = new X.1q7     // Catch:{ IOException -> 0x0047 }
            r2.<init>(r0, r3)     // Catch:{ IOException -> 0x0047 }
            byte[] r0 = X.C17970vw.A04     // Catch:{ IOException -> 0x0047 }
            X.044 r1 = new X.044     // Catch:{ IOException -> 0x0047 }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0047 }
            byte[] r0 = X.AnonymousClass45C.A00(r1)     // Catch:{ all -> 0x0042 }
            r1.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004e
        L_0x0042:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "ProgressiveJpegUtils/generateThumbnailFromFirstScan/errorGeneratingThumbnail"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x004e:
            r5.A0F(r0)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615939n.A01():void");
    }

    public final boolean A02(long j2) {
        long j3;
        int i2 = this.A0H.A0u;
        if (i2 == 2 || i2 == 3) {
            C38241qT r1 = this.A0J;
            if (!r1.A0U || !C31831f6.A04(r1.A09) || i2 != 3) {
                int[] iArr = this.A0S;
                j3 = iArr != null ? (long) iArr[0] : 262144;
            } else {
                long j4 = r1.A07;
                long j5 = r1.A06;
                j3 = j5 == 0 ? 0 : (long) Math.ceil((double) (5.0f * (((float) j4) / ((float) j5))));
            }
            if (j2 >= j3) {
                return true;
            }
        }
        return false;
    }

    public final boolean A03(C616639u r9) {
        int[] iArr;
        String str;
        C38241qT r7 = this.A0J;
        if (r7.A02 == 3 && r9 != null && (iArr = this.A0S) != null && iArr.length == 4 && (str = r7.A0K) != null && r9.A08(0) && r9.A08(1) && r9.A08(2)) {
            try {
                if (this.A0M.A00(this.A0O, iArr[0], r7.A0U) && A04(str)) {
                    return A05(iArr);
                }
            } catch (IOException e2) {
                Log.e("StreamMediaDownloadHandler/attemptSetPartialProgressiveJpegOnDownloadFailure", e2);
            }
        }
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            java.io.File r5 = r7.A0O     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            int[] r2 = r7.A0S     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            if (r2 == 0) goto L_0x002b
            int r1 = r2.length     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            r0 = 4
            if (r1 != r0) goto L_0x002b
            r1 = r2[r6]     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            r0 = 1
            r0 = r2[r0]     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            int r1 = r1 + r0
            r0 = 2
            r0 = r2[r0]     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            int r1 = r1 + r0
            long r2 = (long) r1     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
        L_0x001c:
            java.io.FileInputStream r1 = X.C17970vw.A0G(r5)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            X.1q7 r0 = new X.1q7     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            r0.<init>(r1, r2)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            r2.<init>(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            goto L_0x002e
        L_0x002b:
            r2 = -1
            goto L_0x001c
        L_0x002e:
            X.C37981q3.A02(r2, r4)     // Catch:{ all -> 0x004b }
            byte[] r1 = r4.digest()     // Catch:{ all -> 0x004b }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x004b }
            r2.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            boolean r0 = r8.equals(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            if (r0 == 0) goto L_0x0045
            r0 = 1
            return r0
        L_0x0045:
            java.lang.String r0 = "ProgressiveJpegUtils/setPartialImageFailed plaintextHashes did not match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
            return r6
        L_0x004b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "ProgressiveJpegUtils/validatePartialHashesFailed"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615939n.A04(java.lang.String):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(int[] r7) {
        /*
            r6 = this;
            java.io.File r1 = r6.A0O
            r5 = 0
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0035 }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x0035 }
            r1 = r7[r5]     // Catch:{ all -> 0x0030 }
            r0 = 1
            r0 = r7[r0]     // Catch:{ all -> 0x0030 }
            int r1 = r1 + r0
            r0 = 2
            r0 = r7[r0]     // Catch:{ all -> 0x0030 }
            int r1 = r1 + r0
            long r2 = (long) r1     // Catch:{ all -> 0x0030 }
            r4.seek(r2)     // Catch:{ all -> 0x0030 }
            byte[] r0 = X.C17970vw.A04     // Catch:{ all -> 0x0030 }
            r4.write(r0)     // Catch:{ all -> 0x0030 }
            int r0 = r0.length     // Catch:{ all -> 0x0030 }
            long r0 = (long) r0     // Catch:{ all -> 0x0030 }
            long r2 = r2 + r0
            r4.setLength(r2)     // Catch:{ all -> 0x0030 }
            java.io.FileDescriptor r0 = r4.getFD()     // Catch:{ all -> 0x0030 }
            r0.sync()     // Catch:{ all -> 0x0030 }
            r4.close()     // Catch:{ IOException -> 0x0035 }
            r0 = 1
            goto L_0x003b
        L_0x0030:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            throw r0     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            java.lang.String r0 = "ProgressiveJpegUtils/setPartialImageToReadableFile/failed to set file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
        L_0x003b:
            r2 = 1
            X.1cu r1 = r6.A0I
            if (r0 == 0) goto L_0x004e
            monitor-enter(r1)
            r1.A0H = r2     // Catch:{ all -> 0x004b }
            monitor-exit(r1)
            X.2Oh r1 = r6.A0L
            r0 = 3
            r1.A04(r0)
            return r2
        L_0x004b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x004e:
            r1.A06()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615939n.A05(int[]):boolean");
    }
}
