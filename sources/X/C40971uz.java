package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.1uz  reason: invalid class name and case insensitive filesystem */
public abstract class C40971uz {
    public final AnonymousClass2G2 A00;
    public final C40961uy A01;
    public final AnonymousClass12W A02;
    public final AnonymousClass12X A03;
    public final AnonymousClass12V A04;

    public C40971uz(AnonymousClass2G2 r1, C40961uy r2, AnonymousClass12W r3, AnonymousClass12X r4, AnonymousClass12V r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public C41021v4 A00() {
        int i2;
        String str;
        String str2;
        AnonymousClass2G6 r0;
        if (this instanceof C59352x7) {
            i2 = 1;
        } else {
            AnonymousClass2G5 r5 = (AnonymousClass2G5) this;
            StringBuilder sb = new StringBuilder("EncryptedBackupFile/verifyIntegrity/");
            C16960tx A0B = r5.A0B();
            sb.append(A0B);
            Log.i(sb.toString());
            C28921Zf r6 = new C28921Zf("BackupFile/getFileDigestWithoutFooter/calculating-actual-digest");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            StringBuilder sb2 = new StringBuilder("BackupFile/getFileDigestWithoutFooter/initial digest = ");
            sb2.append(C004101u.A05(instance.digest()));
            Log.i(sb2.toString());
            AnonymousClass2G2 r7 = r5.A00;
            String ACX = r7.ACX(instance, r7.AK8() - ((long) r5.A06()));
            r6.A01();
            StringBuilder sb3 = new StringBuilder("msgstore-integrity-checker/verify-integrity/actual-digest/  ");
            sb3.append(ACX);
            Log.i(sb3.toString());
            C61723Ab A07 = r5.A07();
            C16990u0 r2 = r5.A04;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("EncryptedBackupFile/verifyIntegrity/");
            sb4.append(A0B);
            sb4.append(" ");
            sb4.append(r7);
            sb4.append(" size=");
            sb4.append(r7.AK8());
            sb4.append(" modification time = ");
            sb4.append(r7.AK4());
            sb4.append("footer: ");
            sb4.append(A07);
            sb4.append("actualDigest: ");
            sb4.append(ACX);
            String obj = sb4.toString();
            i2 = 2;
            r2.A00(obj, 2);
            if (A07 != null) {
                if (ACX == null) {
                    byte[] bArr = A07.A01;
                    str2 = bArr != null ? Arrays.toString(bArr) : "null";
                } else {
                    String A0D = r5.A0D();
                    if (A0D == null || (r0 = r5.A00) == null || !r0.A04(A0D)) {
                        boolean z2 = r5 instanceof C59402xC;
                        byte[] bArr2 = A07.A01;
                        if (z2) {
                            if (bArr2 != null) {
                                str2 = C61723Ab.A00(bArr2);
                            } else {
                                str = null;
                            }
                        } else if (bArr2 == null) {
                            Log.e("BackupFileCrypt12/verifyFooterIntegrity/jidSuffix is null");
                            str2 = null;
                        } else {
                            str = r5.A0D();
                        }
                        return A07.A01(r2, ACX, str);
                    }
                    i2 = 4;
                    str2 = r5.A00.A01();
                }
                return new C41021v4(i2, str2);
            }
        }
        str2 = null;
        return new C41021v4(i2, str2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0138 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0147 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x0147=Splitter:B:75:0x0147, B:68:0x013c=Splitter:B:68:0x013c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C41021v4 A01(X.C41011v3 r25, X.C16980tz r26, java.io.File r27, int r28, int r29, boolean r30) {
        /*
            r24 = this;
            r7 = r24
            boolean r0 = r7 instanceof X.C59352x7
            r11 = r25
            r1 = r27
            r12 = r28
            r13 = r29
            if (r0 == 0) goto L_0x0068
            X.12X r0 = r7.A03
            X.1XH r0 = r0.A00
            X.1uh r4 = new X.1uh
            r4.<init>(r0, r1)
            X.2G2 r0 = r7.A00     // Catch:{ all -> 0x0148 }
            java.io.FileInputStream r5 = r0.ACG()     // Catch:{ all -> 0x0148 }
            java.nio.channels.FileChannel r18 = r5.getChannel()     // Catch:{ all -> 0x0062 }
            java.nio.channels.WritableByteChannel r23 = java.nio.channels.Channels.newChannel(r4)     // Catch:{ all -> 0x0062 }
            r19 = 0
            r14 = 0
        L_0x0029:
            long r1 = r18.size()     // Catch:{ all -> 0x0062 }
            int r0 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
            long r0 = r18.size()     // Catch:{ all -> 0x0062 }
            long r0 = r0 - r19
            r2 = 131072(0x20000, double:6.47582E-319)
            long r21 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0062 }
            long r0 = r18.transferTo(r19, r21, r23)     // Catch:{ all -> 0x0062 }
            long r14 = r14 + r0
            if (r25 == 0) goto L_0x004e
            if (r29 <= 0) goto L_0x004e
            long r16 = r18.size()     // Catch:{ all -> 0x0062 }
            r11.A00(r12, r13, r14, r16)     // Catch:{ all -> 0x0062 }
        L_0x004e:
            long r19 = r19 + r2
            goto L_0x0029
        L_0x0051:
            r4.flush()     // Catch:{ all -> 0x0062 }
            r2 = 1
            r1 = 0
            X.1v4 r0 = new X.1v4     // Catch:{ all -> 0x0062 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0062 }
            r5.close()     // Catch:{ all -> 0x0148 }
            r4.close()
            return r0
        L_0x0062:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0147 }
            goto L_0x0147
        L_0x0068:
            X.2G5 r7 = (X.AnonymousClass2G5) r7
            X.12X r0 = r7.A03
            X.1XH r0 = r0.A00
            X.1uh r4 = new X.1uh
            r4.<init>(r0, r1)
            java.io.InputStream r3 = r7.A0C()     // Catch:{ all -> 0x0148 }
            r1 = 1
            X.2G6 r0 = r7.A0A(r3, r1)     // Catch:{ all -> 0x0143 }
            r7.A00 = r0     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x0089
            r1 = 5
            r0 = 0
            X.1v4 r6 = new X.1v4     // Catch:{ all -> 0x0143 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0143 }
            goto L_0x013c
        L_0x0089:
            X.1v4 r6 = r7.A00()     // Catch:{ all -> 0x0143 }
            int r0 = r6.A00     // Catch:{ all -> 0x0143 }
            if (r0 != r1) goto L_0x013c
            java.lang.String r0 = "BackupFile/restoreSingleFileBackup/file-integrity-check/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r1.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "BackupFile/restoreSingleFileBackup/key "
            r1.append(r0)     // Catch:{ all -> 0x0143 }
            X.0tx r9 = r7.A0B()     // Catch:{ all -> 0x0143 }
            r1.append(r9)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0143 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0143 }
            X.2G2 r0 = r7.A00     // Catch:{ all -> 0x0143 }
            r0.AK8()     // Catch:{ all -> 0x0143 }
            X.12V r1 = r7.A04     // Catch:{ all -> 0x0143 }
            long r16 = r0.AK8()     // Catch:{ all -> 0x0143 }
            X.2G6 r0 = r7.A00     // Catch:{ all -> 0x0143 }
            byte[] r5 = r0.A06()     // Catch:{ all -> 0x0143 }
            byte[] r2 = r0.A05()     // Catch:{ all -> 0x0143 }
            r1.A05()     // Catch:{ all -> 0x0143 }
            java.util.concurrent.atomic.AtomicLong r8 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0143 }
            r8.<init>()     // Catch:{ all -> 0x0143 }
            monitor-enter(r1)     // Catch:{ all -> 0x0143 }
            int[] r10 = X.C40611uP.A00     // Catch:{ all -> 0x0139 }
            int r0 = r9.ordinal()     // Catch:{ all -> 0x0139 }
            r10 = r10[r0]     // Catch:{ all -> 0x0139 }
            r0 = 1
            if (r10 == r0) goto L_0x0103
            r0 = 2
            if (r10 == r0) goto L_0x00fc
            r0 = 3
            if (r10 != r0) goto L_0x00e4
            javax.crypto.Cipher r0 = r1.A02     // Catch:{ all -> 0x0139 }
            java.io.InputStream r5 = X.AnonymousClass12V.A00(r3, r8, r0, r5, r2)     // Catch:{ all -> 0x0139 }
            goto L_0x0109
        L_0x00e4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r2.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "unsupported key selector "
            r2.append(r0)     // Catch:{ all -> 0x0139 }
            r2.append(r9)     // Catch:{ all -> 0x0139 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0139 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0139 }
            r0.<init>(r2)     // Catch:{ all -> 0x0139 }
            throw r0     // Catch:{ all -> 0x0139 }
        L_0x00fc:
            javax.crypto.Cipher r0 = r1.A01     // Catch:{ all -> 0x0139 }
            java.io.InputStream r5 = X.AnonymousClass12V.A00(r3, r8, r0, r5, r2)     // Catch:{ all -> 0x0139 }
            goto L_0x0109
        L_0x0103:
            javax.crypto.Cipher r0 = r1.A00     // Catch:{ all -> 0x0139 }
            java.io.InputStream r5 = X.AnonymousClass12V.A00(r3, r8, r0, r5, r2)     // Catch:{ all -> 0x0139 }
        L_0x0109:
            monitor-exit(r1)     // Catch:{ all -> 0x0143 }
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0134 }
        L_0x010e:
            int r1 = r5.read(r2)     // Catch:{ all -> 0x0134 }
            if (r1 < 0) goto L_0x0124
            r0 = 0
            r4.write(r2, r0, r1)     // Catch:{ all -> 0x0134 }
            if (r25 == 0) goto L_0x010e
            if (r29 <= 0) goto L_0x010e
            long r14 = r8.get()     // Catch:{ all -> 0x0134 }
            r11.A00(r12, r13, r14, r16)     // Catch:{ all -> 0x0134 }
            goto L_0x010e
        L_0x0124:
            r5.close()     // Catch:{ all -> 0x0143 }
            r4.flush()     // Catch:{ all -> 0x0143 }
            if (r30 == 0) goto L_0x013c
            X.2G6 r0 = r7.A00     // Catch:{ all -> 0x0143 }
            r1 = r26
            r0.A02(r1)     // Catch:{ all -> 0x0143 }
            goto L_0x013c
        L_0x0134:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0138 }
        L_0x0138:
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0139:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x013c:
            r3.close()     // Catch:{ all -> 0x0148 }
            r4.close()
            return r6
        L_0x0143:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0147 }
        L_0x0147:
            throw r0     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x014c }
        L_0x014c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40971uz.A01(X.1v3, X.0tz, java.io.File, int, int, boolean):X.1v4");
    }

    public AnonymousClass5Uj A02(Context context) {
        if (this instanceof C59352x7) {
            return new C62683En((C59352x7) this);
        }
        AnonymousClass2G5 r1 = (AnonymousClass2G5) this;
        if (r1.A04(context)) {
            return new C62673Em(r1);
        }
        Log.e("EncryptedBackupFile/failed to prepare for backup");
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x016a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0172 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0023=Splitter:B:14:0x0023, B:30:0x003a=Splitter:B:30:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C17000u1 r15, java.io.File r16) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C59352x7
            r7 = r16
            if (r0 == 0) goto L_0x0047
            X.2G2 r1 = r14.A00
            X.12W r0 = r14.A02
            X.1uh r4 = r1.AC6(r0)
            java.nio.channels.WritableByteChannel r3 = java.nio.channels.Channels.newChannel(r4)     // Catch:{ all -> 0x0042 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x003b }
            r2.<init>(r7)     // Catch:{ all -> 0x003b }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0036 }
            X.AnonymousClass1XI.A0I(r1, r3)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0023
            r1.close()     // Catch:{ all -> 0x0036 }
        L_0x0023:
            r2.close()     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x002b
            r3.close()     // Catch:{ all -> 0x0042 }
        L_0x002b:
            r4.close()
            return
        L_0x002f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            if (r3 == 0) goto L_0x0041
            r3.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0177 }
            throw r0
        L_0x0047:
            r6 = r14
            X.2G5 r6 = (X.AnonymousClass2G5) r6
            X.2G6 r0 = r6.A00
            r1 = 0
            if (r0 == 0) goto L_0x0050
            r1 = 1
        L_0x0050:
            java.lang.String r0 = "prefix has not been initialized"
            X.AnonymousClass00B.A0D(r0, r1)
            X.12W r0 = r6.A02
            X.1XH r1 = r0.A00()
            java.lang.String r0 = ""
            java.io.File r5 = r1.A00(r0)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r5)
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)
            java.lang.String r0 = "BackupFile/get-output-stream/initial digest = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            byte[] r0 = r2.digest()
            java.lang.String r0 = X.C004101u.A05(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.reset()
            X.3If r4 = new X.3If
            r4.<init>(r6, r5, r3, r2)
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0173 }
            r3.<init>(r7)     // Catch:{ all -> 0x0173 }
            X.2G6 r0 = r6.A00     // Catch:{ all -> 0x016e }
            r0.A03(r4)     // Catch:{ all -> 0x016e }
            X.12V r5 = r6.A04     // Catch:{ all -> 0x016e }
            X.0tx r9 = r6.A0B()     // Catch:{ all -> 0x016e }
            X.2G6 r0 = r6.A00     // Catch:{ all -> 0x016e }
            byte[] r8 = r0.A06()     // Catch:{ all -> 0x016e }
            byte[] r2 = r0.A05()     // Catch:{ all -> 0x016e }
            monitor-enter(r5)     // Catch:{ all -> 0x016e }
            r5.A05()     // Catch:{ all -> 0x016b }
            int[] r1 = X.C40611uP.A00     // Catch:{ all -> 0x016b }
            int r0 = r9.ordinal()     // Catch:{ all -> 0x016b }
            r1 = r1[r0]     // Catch:{ all -> 0x016b }
            r6 = 1
            if (r1 == r6) goto L_0x00fc
            r0 = 2
            if (r1 == r0) goto L_0x00ea
            r0 = 3
            if (r1 != r0) goto L_0x00ce
            javax.crypto.Cipher r0 = r5.A05     // Catch:{ all -> 0x016b }
            javax.crypto.CipherOutputStream r2 = X.AnonymousClass12V.A02(r4, r0, r8, r2)     // Catch:{ all -> 0x016b }
            r1 = 0
            java.util.zip.Deflater r0 = new java.util.zip.Deflater     // Catch:{ all -> 0x016b }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x016b }
            java.util.zip.DeflaterOutputStream r6 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x016b }
            r6.<init>(r2, r0)     // Catch:{ all -> 0x016b }
            goto L_0x010d
        L_0x00ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016b }
            r1.<init>()     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "Unexpected key selector ("
            r1.append(r0)     // Catch:{ all -> 0x016b }
            r1.append(r9)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x016b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x016b }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x016b }
            r0.<init>(r1)     // Catch:{ all -> 0x016b }
            throw r0     // Catch:{ all -> 0x016b }
        L_0x00ea:
            javax.crypto.Cipher r0 = r5.A04     // Catch:{ all -> 0x016b }
            javax.crypto.CipherOutputStream r2 = X.AnonymousClass12V.A02(r4, r0, r8, r2)     // Catch:{ all -> 0x016b }
            r1 = 0
            java.util.zip.Deflater r0 = new java.util.zip.Deflater     // Catch:{ all -> 0x016b }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x016b }
            java.util.zip.DeflaterOutputStream r6 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x016b }
            r6.<init>(r2, r0)     // Catch:{ all -> 0x016b }
            goto L_0x010d
        L_0x00fc:
            javax.crypto.Cipher r0 = r5.A03     // Catch:{ all -> 0x016b }
            javax.crypto.CipherOutputStream r2 = X.AnonymousClass12V.A02(r4, r0, r8, r2)     // Catch:{ all -> 0x016b }
            r1 = 0
            java.util.zip.Deflater r0 = new java.util.zip.Deflater     // Catch:{ all -> 0x016b }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x016b }
            java.util.zip.DeflaterOutputStream r6 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x016b }
            r6.<init>(r2, r0)     // Catch:{ all -> 0x016b }
        L_0x010d:
            monitor-exit(r5)     // Catch:{ all -> 0x016e }
            long r12 = r7.length()     // Catch:{ all -> 0x0166 }
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x0166 }
            r10 = 0
            r2 = -1
        L_0x0119:
            int r0 = r3.read(r7)     // Catch:{ all -> 0x0166 }
            if (r0 < 0) goto L_0x015c
            r5 = 0
            r6.write(r7, r5, r0)     // Catch:{ all -> 0x0166 }
            long r0 = (long) r0     // Catch:{ all -> 0x0166 }
            long r10 = r10 + r0
            r0 = 100
            long r0 = r0 * r10
            long r0 = r0 / r12
            int r8 = (int) r0     // Catch:{ all -> 0x0166 }
            if (r2 == r8) goto L_0x0119
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0166 }
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0166 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0166 }
            r2[r5] = r0     // Catch:{ all -> 0x0166 }
            r1 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0166 }
            r2[r1] = r0     // Catch:{ all -> 0x0166 }
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0166 }
            r2[r1] = r0     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "encrypter/encrypt %d/%d (%d%%)"
            java.lang.String.format(r9, r0, r2)     // Catch:{ all -> 0x0166 }
            if (r15 == 0) goto L_0x015a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0166 }
            X.2Gb r1 = r15.A00     // Catch:{ all -> 0x0166 }
            r0 = 1
            java.lang.Integer[] r0 = new java.lang.Integer[r0]     // Catch:{ all -> 0x0166 }
            r0[r5] = r2     // Catch:{ all -> 0x0166 }
            r1.A07(r0)     // Catch:{ all -> 0x0166 }
        L_0x015a:
            r2 = r8
            goto L_0x0119
        L_0x015c:
            r6.close()     // Catch:{ all -> 0x016e }
            r3.close()     // Catch:{ all -> 0x0173 }
            r4.close()
            return
        L_0x0166:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x016a }
        L_0x016a:
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0172 }
        L_0x0172:
            throw r0     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0177 }
        L_0x0177:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40971uz.A03(X.0u1, java.io.File):void");
    }

    public boolean A04(Context context) {
        AnonymousClass2G6 r6;
        byte[] A032;
        byte[] A002;
        if (!(this instanceof C59352x7)) {
            AnonymousClass2G5 r4 = (AnonymousClass2G5) this;
            if (r4 instanceof C59402xC) {
                C59402xC r3 = (C59402xC) r4;
                if (r3 instanceof C59362x8) {
                    C16200sd r1 = r3.A02;
                    r6 = null;
                    if (!(!r1.A03.A1f() || (A032 = r1.A01.A03()) == null || (A002 = C40771uf.A00(A032, C16200sd.A09, 32)) == null)) {
                        r6 = new C59382xA(r3.A0E(), A002, C004101u.A0E(16));
                    }
                } else {
                    r6 = null;
                    try {
                        AnonymousClass2Fy A05 = C40691uX.A05(context);
                        if (A05 == null) {
                            r3.A04.A00("msgstore/backupDatabase/key is null", 3);
                        } else {
                            StringBuilder sb = new StringBuilder("msgstore/backupDatabase/key v=");
                            C40731ub r7 = A05.A00;
                            sb.append(r7.A00);
                            Log.i(sb.toString());
                            r6 = new C59372x9(r7, r3.A0E(), A05.A02, A05.A01, r7.A01);
                        }
                    } catch (Exception e2) {
                        Log.w("msgstore/backupDatabase/key/error", e2);
                    }
                }
            } else {
                AnonymousClass00B.A0G(!r4.A02.A03.A1f());
                r6 = null;
                AnonymousClass2Fy A052 = C40691uX.A05(context);
                if (A052 == null) {
                    r4.A04.A00("msgstore/backupDatabase/key is null", 3);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("msgstore/backupDatabase/createPrefix v=");
                    C40731ub r5 = A052.A00;
                    sb2.append(r5.A00);
                    Log.i(sb2.toString());
                    r6 = new C70853hq(r5, A052.A02, A052.A01, r5.A01);
                }
            }
            r4.A00 = r6;
            return r6 != null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0072 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00ec */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x010b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.C108455Ob r11, boolean r12) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C59352x7
            if (r0 == 0) goto L_0x0078
            X.2G2 r0 = r10.A00
            java.io.InputStream r0 = r0.ACp()
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            r4.<init>(r0)
            java.util.concurrent.atomic.AtomicLong r5 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0073 }
            r5.<init>()     // Catch:{ all -> 0x0073 }
            X.12V r2 = r10.A04     // Catch:{ all -> 0x0073 }
            X.0tx r3 = X.C16960tx.A08     // Catch:{ all -> 0x0073 }
            r6 = 0
            r7 = r6
            java.util.zip.ZipInputStream r3 = r2.A03(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0073 }
            java.util.zip.ZipEntry r0 = r3.getNextEntry()     // Catch:{ Exception -> 0x0062 }
        L_0x0022:
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r2 = r11.apply(r0)     // Catch:{ Exception -> 0x0062 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x004d
            if (r12 == 0) goto L_0x003e
            X.12W r0 = r10.A02     // Catch:{ Exception -> 0x0062 }
            X.1XH r0 = r0.A00()     // Catch:{ Exception -> 0x0062 }
            X.1uh r1 = new X.1uh     // Catch:{ Exception -> 0x0062 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0047
        L_0x003e:
            X.12X r0 = r10.A03     // Catch:{ Exception -> 0x0062 }
            X.1XH r0 = r0.A00     // Catch:{ Exception -> 0x0062 }
            X.1uh r1 = new X.1uh     // Catch:{ Exception -> 0x0062 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0062 }
        L_0x0047:
            X.AnonymousClass1XI.A0H(r3, r1)     // Catch:{ all -> 0x0055 }
            r1.close()     // Catch:{ Exception -> 0x0062 }
        L_0x004d:
            r3.closeEntry()     // Catch:{ Exception -> 0x0062 }
            java.util.zip.ZipEntry r0 = r3.getNextEntry()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0022
        L_0x0055:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0     // Catch:{ Exception -> 0x0062 }
        L_0x005a:
            r0 = 1
            r3.close()     // Catch:{ all -> 0x0073 }
            r4.close()
            return r0
        L_0x0062:
            r1 = move-exception
            java.lang.String r0 = "unencrypted-backup-file/restore-multi-file-backup/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x006e }
            r3.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0102
        L_0x006e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0072 }
        L_0x0072:
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0110 }
            throw r0
        L_0x0078:
            r3 = r10
            X.2G5 r3 = (X.AnonymousClass2G5) r3
            X.2G2 r1 = r3.A00
            java.io.InputStream r0 = r1.ACp()
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream
            r6.<init>(r0)
            r0 = 1
            X.2G6 r0 = r3.A0A(r6, r0)     // Catch:{ all -> 0x010c }
            r3.A00 = r0     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "EncryptedBackupFile/restore-multi-file-backup/restore/failed to read prefix"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x010c }
            goto L_0x00fe
        L_0x0095:
            r1.AK8()     // Catch:{ all -> 0x010c }
            java.util.concurrent.atomic.AtomicLong r7 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x010c }
            r7.<init>()     // Catch:{ all -> 0x010c }
            X.12V r4 = r3.A04     // Catch:{ all -> 0x010c }
            X.0tx r5 = r3.A0B()     // Catch:{ all -> 0x010c }
            X.2G6 r0 = r3.A00     // Catch:{ all -> 0x010c }
            byte[] r8 = r0.A06()     // Catch:{ all -> 0x010c }
            byte[] r9 = r0.A05()     // Catch:{ all -> 0x010c }
            java.util.zip.ZipInputStream r4 = r4.A03(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x010c }
            java.util.zip.ZipEntry r0 = r4.getNextEntry()     // Catch:{ Exception -> 0x00f5 }
        L_0x00b5:
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object r2 = r11.apply(r0)     // Catch:{ Exception -> 0x00f5 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ Exception -> 0x00f5 }
            if (r2 == 0) goto L_0x00e0
            if (r12 == 0) goto L_0x00d1
            X.12W r0 = r3.A02     // Catch:{ Exception -> 0x00f5 }
            X.1XH r0 = r0.A00()     // Catch:{ Exception -> 0x00f5 }
            X.1uh r1 = new X.1uh     // Catch:{ Exception -> 0x00f5 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00da
        L_0x00d1:
            X.12X r0 = r3.A03     // Catch:{ Exception -> 0x00f5 }
            X.1XH r0 = r0.A00     // Catch:{ Exception -> 0x00f5 }
            X.1uh r1 = new X.1uh     // Catch:{ Exception -> 0x00f5 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x00f5 }
        L_0x00da:
            X.AnonymousClass1XI.A0H(r4, r1)     // Catch:{ all -> 0x00e8 }
            r1.close()     // Catch:{ Exception -> 0x00f5 }
        L_0x00e0:
            r4.closeEntry()     // Catch:{ Exception -> 0x00f5 }
            java.util.zip.ZipEntry r0 = r4.getNextEntry()     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00b5
        L_0x00e8:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            throw r0     // Catch:{ Exception -> 0x00f5 }
        L_0x00ed:
            r4.close()     // Catch:{ all -> 0x010c }
            r6.close()
            r0 = 1
            return r0
        L_0x00f5:
            r1 = move-exception
            java.lang.String r0 = "EncryptedBackupFile/restore-multi-file-backup/restore"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0107 }
            r4.close()     // Catch:{ all -> 0x010c }
        L_0x00fe:
            r6.close()
            goto L_0x0105
        L_0x0102:
            r4.close()
        L_0x0105:
            r0 = 0
            return r0
        L_0x0107:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x010b }
        L_0x010b:
            throw r0     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0110 }
        L_0x0110:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40971uz.A05(X.5Ob, boolean):boolean");
    }
}
