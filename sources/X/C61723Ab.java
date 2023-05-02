package X;

import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.3Ab  reason: invalid class name and case insensitive filesystem */
public class C61723Ab {
    public final byte[] A00;
    public final byte[] A01;

    public C61723Ab(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(byte[] r4) {
        /*
            r3 = 0
        L_0x0001:
            int r2 = r4.length
            if (r3 >= r2) goto L_0x000d
            byte r1 = r4[r3]
            r0 = 45
            if (r1 != r0) goto L_0x000d
            int r3 = r3 + 1
            goto L_0x0001
        L_0x000d:
            if (r3 != r2) goto L_0x0017
            java.lang.String r0 = "BackupFooter/verify-jid/empty-suffix"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = ""
            return r0
        L_0x0017:
            int r2 = r2 - r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3, r2)
            java.lang.String r0 = r0.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61723Ab.A00(byte[]):java.lang.String");
    }

    public C41021v4 A01(C16990u0 r6, String str, String str2) {
        int i2;
        Log.i(C13680ns.A0h("BackupFooter/verify-integrity/actual-digest/  ", str));
        String A05 = C004101u.A05(this.A00);
        Log.i(C13680ns.A0h("BackupFooter/verify-integrity/expected-digest/", A05));
        if (str.equals(A05)) {
            Log.i("BackupFooter/verify-integrity/digest-matches/success");
            if (this.A01 == null || str2 == null || !A02(str2)) {
                i2 = 1;
            } else {
                r6.A00("BackupFooter/verify-integrity/jid-mismatch", 4);
                return new C41021v4(4, (String) null);
            }
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("BackupFooter/verify-integrity/failed expected-digest:");
            A0r.append(A05);
            A0r.append(" actual-digest:");
            r6.A00(AnonymousClass000.A0h(str, A0r), 4);
            i2 = 2;
        }
        return new C41021v4(i2, (String) null);
    }

    public boolean A02(String str) {
        byte[] bArr = this.A01;
        if (bArr == null) {
            return false;
        }
        String A002 = A00(bArr);
        if (str.endsWith(A002)) {
            return false;
        }
        StringBuilder A0r = AnonymousClass000.A0r("BackupFooter/has-jid-user-mismatch/expected-jid-user-ends-with: ");
        A0r.append(A002);
        A0r.append("  actual-jid-user: ");
        Log.e(AnonymousClass000.A0h(str, A0r));
        return true;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BackupFooter{digest=");
        A0r.append(Arrays.toString(this.A00));
        A0r.append(", jidSuffix=");
        byte[] bArr = this.A01;
        A0r.append(bArr != null ? Arrays.toString(bArr) : "null");
        return AnonymousClass000.A0k(A0r);
    }
}
