package X;

import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2G5  reason: invalid class name */
public abstract class AnonymousClass2G5 extends C40971uz {
    public AnonymousClass2G6 A00;
    public final C16040sK A01;
    public final C16200sd A02;
    public final C18790xG A03;
    public final C16990u0 A04;

    public AnonymousClass2G5(C16040sK r7, AnonymousClass2G2 r8, C40961uy r9, C16200sd r10, AnonymousClass12W r11, C18790xG r12, AnonymousClass12X r13, C16990u0 r14, AnonymousClass12V r15) {
        super(r8, r9, r11, r13, r15);
        this.A01 = r7;
        this.A03 = r12;
        this.A02 = r10;
        this.A04 = r14;
    }

    public int A06() {
        return this instanceof C59402xC ? 16 : 20;
    }

    public final C61723Ab A07() {
        AnonymousClass2G2 r2 = this.A00;
        long AK8 = r2.AK8() - ((long) A06());
        InputStream ACp = r2.ACp();
        if (AK8 >= 0) {
            try {
                C30311c8.A06(ACp, AK8);
            } catch (Throwable unused) {
            }
        }
        C61723Ab A08 = A08(ACp);
        ACp.close();
        return A08;
        throw th;
    }

    public C61723Ab A08(InputStream inputStream) {
        if (this instanceof C59402xC) {
            byte[] bArr = new byte[16];
            if (inputStream.read(bArr) == 16) {
                return new C61723Ab(bArr, (byte[]) null);
            }
            Log.e("backup/cannot read footer, footer is null");
            return null;
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[4];
        int read = inputStream.read(bArr2);
        int read2 = inputStream.read(bArr3);
        if (read == 16 && read2 == 4) {
            return new C61723Ab(bArr2, bArr3);
        }
        Log.e("Backup/BackupFileCrypt12/footer is null");
        return null;
    }

    public C61723Ab A09(byte[] bArr) {
        if (this instanceof C59402xC) {
            return new C61723Ab(bArr, (byte[]) null);
        }
        String A0D = A0D();
        byte[] bArr2 = new byte[4];
        Arrays.fill(bArr2, (byte) 45);
        if (A0D != null) {
            int length = A0D.length();
            if (length < 2) {
                StringBuilder sb = new StringBuilder("BackupFooter/get-jid-suffix/unexpected-phone-number ");
                sb.append(A0D);
                sb.append(" it has less than ");
                sb.append(2);
                sb.append(" digits");
                Log.e(sb.toString());
                return new C61723Ab(bArr, bArr2);
            }
            System.arraycopy(A0D.getBytes(), length - 2, bArr2, 2, 2);
        }
        StringBuilder sb2 = new StringBuilder("BackupFooter/get-jid-suffix ");
        sb2.append(A0D);
        sb2.append(" suffix: ");
        sb2.append(new String(bArr2));
        Log.i(sb2.toString());
        return new C61723Ab(bArr, bArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.2G7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r12v3, types: [X.2G6] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2G6 A0A(java.io.InputStream r16, boolean r17) {
        /*
            r15 = this;
            r2 = r15
            boolean r0 = r15 instanceof X.C59402xC
            r3 = r16
            if (r0 == 0) goto L_0x010f
            X.2xC r2 = (X.C59402xC) r2
            boolean r1 = r2 instanceof X.C59362x8
            X.2GB r0 = X.AnonymousClass2GB.A05
            if (r1 == 0) goto L_0x0059
            X.1Wm r4 = X.C28541Wm.A0D(r0, r3)
            X.2GB r4 = (X.AnonymousClass2GB) r4
            int r1 = r4.A01
            if (r1 == 0) goto L_0x0056
            r0 = 1
            if (r1 != r0) goto L_0x0056
            X.42E r1 = X.AnonymousClass42E.A01
        L_0x001e:
            X.42E r0 = X.AnonymousClass42E.A01
            r12 = 0
            if (r1 != r0) goto L_0x0037
            X.2t0 r0 = r4.A03
            if (r0 != 0) goto L_0x0029
            X.2t0 r0 = X.AnonymousClass2t0.A02
        L_0x0029:
            X.1Ww r0 = r0.A01
            byte[] r3 = r0.A04()
            int r0 = r3.length
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "backup-file-crypt15/read-prefix/failed to read prefix"
        L_0x0034:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0037:
            return r12
        L_0x0038:
            X.0sd r0 = r2.A02
            X.0sk r0 = r0.A01
            byte[] r2 = r0.A03()
            if (r2 == 0) goto L_0x0054
            byte[] r1 = X.C16200sd.A09
            r0 = 32
            byte[] r2 = X.C40771uf.A00(r2, r1, r0)
        L_0x004a:
            java.util.Arrays.toString(r2)
            if (r17 == 0) goto L_0x00d4
            if (r2 != 0) goto L_0x00d4
            java.lang.String r0 = "backup-file-crypt15/read-prefix/no key found"
            goto L_0x0034
        L_0x0054:
            r2 = 0
            goto L_0x004a
        L_0x0056:
            X.42E r1 = X.AnonymousClass42E.A02
            goto L_0x001e
        L_0x0059:
            X.1Wm r4 = X.C28541Wm.A0D(r0, r3)
            X.2GB r4 = (X.AnonymousClass2GB) r4
            int r1 = r4.A01
            if (r1 == 0) goto L_0x00d1
            r0 = 1
            if (r1 != r0) goto L_0x00d1
            X.42E r1 = X.AnonymousClass42E.A01
        L_0x0068:
            X.42E r0 = X.AnonymousClass42E.A02
            r12 = 0
            if (r1 != r0) goto L_0x00c9
            int r0 = r4.A00
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x00c9
            X.2u8 r1 = r4.A04
            if (r1 != 0) goto L_0x007a
            X.2u8 r1 = X.AnonymousClass2u8.A06
        L_0x007a:
            X.1Ww r0 = r1.A01
            byte[] r8 = r0.A04()
            java.lang.String r7 = r1.A05
            X.1Ww r0 = r1.A04
            byte[] r9 = r0.A04()
            X.1Ww r0 = r1.A03
            byte[] r10 = r0.A04()
            X.1Ww r0 = r1.A02
            byte[] r11 = r0.A04()
            X.1ub r6 = new X.1ub
            r6.<init>(r7, r8, r9, r10, r11)
            X.0xG r5 = r2.A03
            java.lang.String r3 = r6.A00
            byte[] r0 = r6.A04
            X.1uW r1 = new X.1uW
            r1.<init>(r3, r0)
            X.0xF r0 = r5.A01
            java.util.HashMap r0 = r0.A00
            java.lang.Object r3 = r0.get(r1)
            X.1uV r3 = (X.C40671uV) r3
            if (r17 == 0) goto L_0x00e8
            if (r3 != 0) goto L_0x010c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/restore/cipher result is null for "
        L_0x00b9:
            r1.append(r0)
            X.0tx r0 = r2.A0B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0034
        L_0x00c9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/restore/failed to read cipher from the file "
            goto L_0x00b9
        L_0x00d1:
            X.42E r1 = X.AnonymousClass42E.A02
            goto L_0x0068
        L_0x00d4:
            int r0 = r4.A00
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x00e2
            X.2G7 r12 = r4.A02
            if (r12 != 0) goto L_0x00e2
            X.2G7 r12 = X.AnonymousClass2G7.A0f
        L_0x00e2:
            X.2xA r0 = new X.2xA
            r0.<init>(r12, r2, r3)
            return r0
        L_0x00e8:
            if (r3 != 0) goto L_0x010c
            r13 = r12
        L_0x00eb:
            java.util.Arrays.toString(r13)
            int r0 = r4.A00
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x010a
            X.2G7 r11 = r4.A02
            if (r11 != 0) goto L_0x00fc
            X.2G7 r11 = X.AnonymousClass2G7.A0f
        L_0x00fc:
            if (r3 == 0) goto L_0x0100
            byte[] r12 = r3.A01
        L_0x0100:
            byte[] r0 = r6.A01
            X.2x9 r9 = new X.2x9
            r10 = r6
            r14 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x010a:
            r11 = r12
            goto L_0x00fc
        L_0x010c:
            byte[] r13 = r3.A02
            goto L_0x00eb
        L_0x010f:
            X.1ub r5 = X.C40691uX.A03(r3)
            X.0xG r4 = r15.A03
            java.lang.String r3 = r5.A00
            byte[] r0 = r5.A04
            X.1uW r1 = new X.1uW
            r1.<init>(r3, r0)
            X.0xF r0 = r4.A01
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            X.1uV r0 = (X.C40671uV) r0
            r3 = 0
            if (r17 == 0) goto L_0x0143
            if (r0 != 0) goto L_0x0155
            java.lang.String r0 = "msgstore/restore/cipher result is null for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0tx r0 = r15.A0B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x0143:
            if (r0 != 0) goto L_0x0155
            r2 = r3
        L_0x0146:
            java.util.Arrays.toString(r2)
            if (r0 == 0) goto L_0x014d
            byte[] r3 = r0.A01
        L_0x014d:
            byte[] r1 = r5.A01
            X.3hq r0 = new X.3hq
            r0.<init>(r5, r3, r2, r1)
            return r0
        L_0x0155:
            byte[] r2 = r0.A02
            goto L_0x0146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2G5.A0A(java.io.InputStream, boolean):X.2G6");
    }

    public C16960tx A0B() {
        return this instanceof C59402xC ? ((C59402xC) this) instanceof C59362x8 ? C16960tx.A07 : C16960tx.A06 : C16960tx.A04;
    }

    public InputStream A0C() {
        AnonymousClass2G2 r1 = this.A00;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(r1.ACp());
        long AK8 = r1.AK8();
        int A06 = A06();
        long j2 = AK8 - ((long) A06);
        String.format(Locale.ENGLISH, "BackupFile/get-input-stream size-without-footer:%d footer-size:%d", new Object[]{Long.valueOf(j2), Integer.valueOf(A06)});
        return new C38021q7(bufferedInputStream, j2);
    }

    public final String A0D() {
        String str;
        C16040sK r2 = this.A01;
        r2.A0B();
        if (r2.A00 == null) {
            str = "backup/BackupFileCrypt12/getUserJid MeManager.me is null";
        } else {
            r2.A0B();
            AnonymousClass1ZT r0 = r2.A05;
            if (r0 != null) {
                return r0.user;
            }
            str = "backup/BackupFileCrypt12/getUserJid MeManager.getMyJidObject() is null";
        }
        Log.e(str);
        return null;
    }
}
