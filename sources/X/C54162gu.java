package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.2gu  reason: invalid class name and case insensitive filesystem */
public class C54162gu {
    public static final byte[] A06 = {69, 68, 0, 1};
    public static final byte[] A07 = {87, 65, 5, 2};
    public final C16440t3 A00;
    public final C54002ge A01;
    public final C229519x A02;
    public final C46962Gy A03;
    public final C46952Gx A04;
    public final C54172gv A05;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01c7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01cd, code lost:
        throw new X.AnonymousClass2H1(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01cf, code lost:
        r3 = r0.serverHello;
        r2 = new X.C89274bs(X.C89274bs.A04, r6);
        r2.A03.A00(r4.A02.A01);
        r2 = A01(r3, r4, r5, r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x0070, B:11:0x00cd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54162gu(X.C16440t3 r14, X.C54002ge r15, X.C229519x r16, java.io.InputStream r17, java.io.OutputStream r18, X.C31981fL r19, X.C35891mf r20) {
        /*
            r13 = this;
            r8 = 0
            r13.<init>()
            r13.A00 = r14
            r0 = r16
            r13.A02 = r0
            X.1fL r4 = X.C31981fL.A00()
            X.19x r0 = r13.A02
            X.0rz r0 = r0.A00
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "routing_info"
            java.lang.String r3 = r1.getString(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r2 = r18
            if (r0 != 0) goto L_0x0050
            r1 = 3
            byte[] r5 = android.util.Base64.decode(r3, r1)
            if (r5 == 0) goto L_0x0050
            int r6 = r5.length
            if (r6 <= 0) goto L_0x0050
            byte[] r0 = A06
            r2.write(r0)
            byte[] r3 = new byte[r1]
            r1 = 2
            byte r0 = (byte) r6
            r3[r1] = r0
            r1 = 1
            int r0 = r6 >> 8
            byte r0 = (byte) r0
            r3[r1] = r0
            r1 = 0
            int r0 = r6 >> 16
            byte r0 = (byte) r0
            r3[r1] = r0
            r2.write(r3)
            r2.write(r5)
        L_0x0050:
            byte[] r6 = A07
            r2.write(r6)
            X.AnonymousClass00B.A06(r15)
            r13.A01 = r15
            X.2Gx r0 = new X.2Gx
            r1 = r17
            r0.<init>(r1)
            r13.A04 = r0
            X.2gv r0 = new X.2gv
            r0.<init>(r2)
            r13.A05 = r0
            r5 = r19
            r1 = r20
            if (r20 != 0) goto L_0x00cd
            byte[] r0 = X.C89274bs.A05     // Catch:{ 43e -> 0x01ce }
            X.4bs r7 = new X.4bs     // Catch:{ 43e -> 0x01ce }
            r7.<init>(r0, r6)     // Catch:{ 43e -> 0x01ce }
            X.1mf r0 = r4.A02     // Catch:{ 43e -> 0x01ce }
            byte[] r2 = r0.A01     // Catch:{ 43e -> 0x01ce }
            X.4QZ r0 = r7.A03     // Catch:{ 43e -> 0x01ce }
            r0.A00(r2)     // Catch:{ 43e -> 0x01ce }
            X.2Lq r0 = X.C48042Lq.A04     // Catch:{ 43e -> 0x01ce }
            X.1Wr r3 = r0.A0U()     // Catch:{ 43e -> 0x01ce }
            int r1 = r2.length     // Catch:{ 43e -> 0x01ce }
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r2, r0, r1)     // Catch:{ 43e -> 0x01ce }
            r3.A03()     // Catch:{ 43e -> 0x01ce }
            X.1Wm r1 = r3.A00     // Catch:{ 43e -> 0x01ce }
            X.2Lq r1 = (X.C48042Lq) r1     // Catch:{ 43e -> 0x01ce }
            int r0 = r1.A00     // Catch:{ 43e -> 0x01ce }
            r0 = r0 | 1
            r1.A00 = r0     // Catch:{ 43e -> 0x01ce }
            r1.A01 = r2     // Catch:{ 43e -> 0x01ce }
            X.1Wm r3 = r3.A02()     // Catch:{ 43e -> 0x01ce }
            X.2Lq r3 = (X.C48042Lq) r3     // Catch:{ 43e -> 0x01ce }
            X.2Ll r0 = X.C47992Ll.A04     // Catch:{ 43e -> 0x01ce }
            X.1Wr r2 = r0.A0U()     // Catch:{ 43e -> 0x01ce }
            r2.A03()     // Catch:{ 43e -> 0x01ce }
            X.1Wm r1 = r2.A00     // Catch:{ 43e -> 0x01ce }
            X.2Ll r1 = (X.C47992Ll) r1     // Catch:{ 43e -> 0x01ce }
            r1.A02 = r3     // Catch:{ 43e -> 0x01ce }
            int r0 = r1.A00     // Catch:{ 43e -> 0x01ce }
            r0 = r0 | 1
            r1.A00 = r0     // Catch:{ 43e -> 0x01ce }
            X.1Wm r0 = r2.A02()     // Catch:{ 43e -> 0x01ce }
            X.2gv r1 = r13.A05     // Catch:{ 43e -> 0x01ce }
            byte[] r0 = r0.A02()     // Catch:{ 43e -> 0x01ce }
            r1.write(r0)     // Catch:{ 43e -> 0x01ce }
            X.2Lo r0 = r13.A00()     // Catch:{ 43e -> 0x01ce }
            X.2Gy r2 = r13.A01(r0, r4, r5, r7)     // Catch:{ 43e -> 0x01ce }
            goto L_0x01e5
        L_0x00cd:
            byte[] r0 = X.C89274bs.A06     // Catch:{ 2H0 -> 0x01c7 }
            X.4bs r9 = new X.4bs     // Catch:{ 2H0 -> 0x01c7 }
            r9.<init>(r0, r6)     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = r1.A01     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = r9.A01(r0)     // Catch:{ 2H0 -> 0x01c7 }
            X.1mf r7 = new X.1mf     // Catch:{ 2H0 -> 0x01c7 }
            r7.<init>(r0)     // Catch:{ 2H0 -> 0x01c7 }
            X.1mf r0 = r4.A02     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r12 = r0.A01     // Catch:{ 2H0 -> 0x01c7 }
            X.4QZ r3 = r9.A03     // Catch:{ 2H0 -> 0x01c7 }
            r3.A00(r12)     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = X.AnonymousClass48G.A00(r4, r7)     // Catch:{ 2H0 -> 0x01c7 }
            r9.A00(r0)     // Catch:{ 2H0 -> 0x01c7 }
            X.1mf r0 = r5.A02     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = r0.A01     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r2 = r9.A02(r0)     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = X.AnonymousClass48G.A00(r5, r7)     // Catch:{ 2H0 -> 0x01c7 }
            r9.A00(r0)     // Catch:{ 2H0 -> 0x01c7 }
            X.2ge r0 = r13.A01     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = r0.A02()     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r11 = r9.A02(r0)     // Catch:{ 2H0 -> 0x01c7 }
            X.2Lq r0 = X.C48042Lq.A04     // Catch:{ 2H0 -> 0x01c7 }
            X.1Wr r10 = r0.A0U()     // Catch:{ 2H0 -> 0x01c7 }
            int r1 = r12.length     // Catch:{ 2H0 -> 0x01c7 }
            r0 = 0
            X.1Ww r12 = X.C28631Ww.A01(r12, r0, r1)     // Catch:{ 2H0 -> 0x01c7 }
            r10.A03()     // Catch:{ 2H0 -> 0x01c7 }
            X.1Wm r1 = r10.A00     // Catch:{ 2H0 -> 0x01c7 }
            X.2Lq r1 = (X.C48042Lq) r1     // Catch:{ 2H0 -> 0x01c7 }
            int r0 = r1.A00     // Catch:{ 2H0 -> 0x01c7 }
            r0 = r0 | 1
            r1.A00 = r0     // Catch:{ 2H0 -> 0x01c7 }
            r1.A01 = r12     // Catch:{ 2H0 -> 0x01c7 }
            int r1 = r2.length     // Catch:{ 2H0 -> 0x01c7 }
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r2, r0, r1)     // Catch:{ 2H0 -> 0x01c7 }
            r10.A03()     // Catch:{ 2H0 -> 0x01c7 }
            X.1Wm r1 = r10.A00     // Catch:{ 2H0 -> 0x01c7 }
            X.2Lq r1 = (X.C48042Lq) r1     // Catch:{ 2H0 -> 0x01c7 }
            int r0 = r1.A00     // Catch:{ 2H0 -> 0x01c7 }
            r0 = r0 | 2
            r1.A00 = r0     // Catch:{ 2H0 -> 0x01c7 }
            r1.A03 = r2     // Catch:{ 2H0 -> 0x01c7 }
            int r1 = r11.length     // Catch:{ 2H0 -> 0x01c7 }
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r11, r0, r1)     // Catch:{ 2H0 -> 0x01c7 }
            r10.A03()     // Catch:{ 2H0 -> 0x01c7 }
            X.1Wm r1 = r10.A00     // Catch:{ 2H0 -> 0x01c7 }
            X.2Lq r1 = (X.C48042Lq) r1     // Catch:{ 2H0 -> 0x01c7 }
            int r0 = r1.A00     // Catch:{ 2H0 -> 0x01c7 }
            r0 = r0 | 4
            r1.A00 = r0     // Catch:{ 2H0 -> 0x01c7 }
            r1.A02 = r2     // Catch:{ 2H0 -> 0x01c7 }
            X.1Wm r10 = r10.A02()     // Catch:{ 2H0 -> 0x01c7 }
            X.2Lq r10 = (X.C48042Lq) r10     // Catch:{ 2H0 -> 0x01c7 }
            X.2Ll r0 = X.C47992Ll.A04     // Catch:{ 2H0 -> 0x01c7 }
            X.1Wr r2 = r0.A0U()     // Catch:{ 2H0 -> 0x01c7 }
            r2.A03()     // Catch:{ 2H0 -> 0x01c7 }
            X.1Wm r1 = r2.A00     // Catch:{ 2H0 -> 0x01c7 }
            X.2Ll r1 = (X.C47992Ll) r1     // Catch:{ 2H0 -> 0x01c7 }
            r1.A02 = r10     // Catch:{ 2H0 -> 0x01c7 }
            int r0 = r1.A00     // Catch:{ 2H0 -> 0x01c7 }
            r0 = r0 | 1
            r1.A00 = r0     // Catch:{ 2H0 -> 0x01c7 }
            X.1Wm r0 = r2.A02()     // Catch:{ 2H0 -> 0x01c7 }
            X.2gv r1 = r13.A05     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = r0.A02()     // Catch:{ 2H0 -> 0x01c7 }
            r1.write(r0)     // Catch:{ 2H0 -> 0x01c7 }
            X.2Lo r2 = r13.A00()     // Catch:{ 2H0 -> 0x01c7 }
            int r0 = r2.A00     // Catch:{ 2H0 -> 0x01c7 }
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0186
            X.43e r0 = new X.43e     // Catch:{ 2H0 -> 0x01c7 }
            r0.<init>(r2)     // Catch:{ 2H0 -> 0x01c7 }
            throw r0     // Catch:{ 2H0 -> 0x01c7 }
        L_0x0186:
            X.1Ww r0 = r2.A01     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = r0.A04()     // Catch:{ 2H0 -> 0x01c7 }
            r3.A00(r0)     // Catch:{ 2H0 -> 0x01c7 }
            X.1mf r1 = new X.1mf     // Catch:{ 2H0 -> 0x01c7 }
            r1.<init>(r0)     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = X.AnonymousClass48G.A00(r4, r1)     // Catch:{ 2H0 -> 0x01c7 }
            r9.A00(r0)     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = X.AnonymousClass48G.A00(r5, r1)     // Catch:{ 2H0 -> 0x01c7 }
            r9.A00(r0)     // Catch:{ 2H0 -> 0x01c7 }
            X.1Ww r0 = r2.A02     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r0 = r0.A04()     // Catch:{ 2H0 -> 0x01c7 }
            r9.A01(r0)     // Catch:{ 2H0 -> 0x01c7 }
            r3 = 0
            byte[] r2 = new byte[r3]     // Catch:{ 2H0 -> 0x01c7 }
            byte[] r1 = r9.A02     // Catch:{ 2H0 -> 0x01c7 }
            r0 = 64
            byte[] r1 = X.C40771uf.A01(r2, r1, r8, r0)     // Catch:{ 2H0 -> 0x01c7 }
            r0 = 32
            byte[][] r2 = X.C28641Wx.A05(r1, r0, r0)     // Catch:{ 2H0 -> 0x01c7 }
            r0 = 1
            r1 = r2[r3]     // Catch:{ 2H0 -> 0x01c7 }
            r0 = r2[r0]     // Catch:{ 2H0 -> 0x01c7 }
            X.2Gy r2 = new X.2Gy     // Catch:{ 2H0 -> 0x01c7 }
            r2.<init>(r7, r1, r0)     // Catch:{ 2H0 -> 0x01c7 }
            goto L_0x01e5
        L_0x01c7:
            r1 = move-exception
            X.2H1 r0 = new X.2H1     // Catch:{ 43e -> 0x01ce }
            r0.<init>(r1)     // Catch:{ 43e -> 0x01ce }
            throw r0     // Catch:{ 43e -> 0x01ce }
        L_0x01ce:
            r0 = move-exception
            X.2Lo r3 = r0.serverHello
            byte[] r0 = X.C89274bs.A04
            X.4bs r2 = new X.4bs
            r2.<init>(r0, r6)
            X.1mf r0 = r4.A02
            byte[] r1 = r0.A01
            X.4QZ r0 = r2.A03
            r0.A00(r1)
            X.2Gy r2 = r13.A01(r3, r4, r5, r2)
        L_0x01e5:
            r13.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54162gu.<init>(X.0t3, X.2ge, X.19x, java.io.InputStream, java.io.OutputStream, X.1fL, X.1mf):void");
    }

    public final C48022Lo A00() {
        C46952Gx r2 = this.A04;
        byte[] A002 = r2.A00(3);
        if (!Arrays.equals(C46952Gx.A01, A002)) {
            C47992Ll r22 = (C47992Ll) C28541Wm.A0E(C47992Ll.A04, r2.A00(C28641Wx.A01(A002)));
            if ((r22.A00 & 2) == 2) {
                C48022Lo r0 = r22.A03;
                return r0 == null ? C48022Lo.A04 : r0;
            }
            throw new IOException("Handshake message does not contain server hello!");
        }
        throw new C55332jL();
    }

    public final C46962Gy A01(C48022Lo r11, C31981fL r12, C31981fL r13, C89274bs r14) {
        String str;
        String obj;
        StringBuilder sb;
        String str2;
        try {
            byte[] A042 = r11.A01.A04();
            r14.A03.A00(A042);
            C35891mf r2 = new C35891mf(A042);
            C31991fM r1 = r12.A01;
            C36471nb A002 = C36471nb.A00();
            byte[] bArr = r2.A01;
            byte[] bArr2 = r1.A01;
            r14.A00(A002.A02(bArr, bArr2));
            C35891mf r4 = new C35891mf(r14.A01(r11.A03.A04()));
            C36471nb A003 = C36471nb.A00();
            byte[] bArr3 = r4.A01;
            r14.A00(A003.A02(bArr3, bArr2));
            byte[] A012 = r14.A01(r11.A02.A04());
            C16440t3 r6 = this.A00;
            try {
                C58322tJ r22 = (C58322tJ) C28541Wm.A0E(C58322tJ.A03, A012);
                byte[] A043 = r22.A01.A04();
                try {
                    C58802u9 r5 = (C58802u9) C28541Wm.A0E(C58802u9.A06, A043);
                    C35891mf r8 = (C35891mf) AnonymousClass4AJ.A00.get(r5.A04);
                    if (r8 == null) {
                        sb = new StringBuilder();
                        str2 = "noise certificate issued by unknown source; issuer=";
                    } else {
                        if (!C36471nb.A00().A01(r8.A01, A043, r22.A02.A04())) {
                            sb = new StringBuilder();
                            str2 = "invalid signature on noise certificate; issuer=";
                        } else if (!Arrays.equals(r5.A03.A04(), bArr3)) {
                            sb = new StringBuilder();
                            str2 = "noise certificate key does not match proposed server static key; issuer=";
                        } else if ((r5.A00 & 4) != 4 || r5.A02 >= r6.A00() / 1000) {
                            byte[] A022 = r14.A02(r13.A02.A01);
                            r14.A00(C36471nb.A00().A02(bArr, r13.A01.A01));
                            byte[] A023 = r14.A02(this.A01.A02());
                            C28581Wr A0U = C48002Lm.A03.A0U();
                            C28631Ww A013 = C28631Ww.A01(A022, 0, A022.length);
                            A0U.A03();
                            C48002Lm r15 = (C48002Lm) A0U.A00;
                            r15.A00 |= 1;
                            r15.A02 = A013;
                            C28631Ww A014 = C28631Ww.A01(A023, 0, A023.length);
                            A0U.A03();
                            C48002Lm r16 = (C48002Lm) A0U.A00;
                            r16.A00 |= 2;
                            r16.A01 = A014;
                            C28581Wr A0U2 = C47992Ll.A04.A0U();
                            A0U2.A03();
                            C47992Ll r17 = (C47992Ll) A0U2.A00;
                            r17.A01 = (C48002Lm) A0U.A02();
                            r17.A00 |= 4;
                            this.A05.write(A0U2.A02().A02());
                            byte[][] A052 = C28641Wx.A05(C40771uf.A01(new byte[0], r14.A02, (byte[]) null, 64), 32, 32);
                            return new C46962Gy(r4, A052[0], A052[1]);
                        } else {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
                            StringBuilder sb2 = new StringBuilder("noise certificate expired; issuer=");
                            sb2.append(r5.A04);
                            sb2.append("; expires=");
                            sb2.append(simpleDateFormat.format(new Date(r5.A02 * 1000)));
                            obj = sb2.toString();
                            Log.e(obj);
                            throw new C54212gz(this);
                        }
                    }
                    sb.append(str2);
                    sb.append(r5.A04);
                    obj = sb.toString();
                    Log.e(obj);
                } catch (C29791bD e2) {
                    e = e2;
                    str = "noise certificate details parsing failed";
                    Log.e(str, e);
                    throw new C54212gz(this);
                }
            } catch (C29791bD e3) {
                e = e3;
                str = "noise certificate parsing failed";
                Log.e(str, e);
                throw new C54212gz(this);
            }
            throw new C54212gz(this);
        } catch (AnonymousClass2H0 e4) {
            throw new AnonymousClass2H1(e4);
        }
    }
}
