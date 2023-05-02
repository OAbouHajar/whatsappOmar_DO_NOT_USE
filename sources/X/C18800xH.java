package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.0xH  reason: invalid class name and case insensitive filesystem */
public class C18800xH {
    public final C16300so A00;
    public final C16600tK A01;
    public final C16980tz A02;
    public final C18780xF A03;
    public final C17190ug A04;

    public C18800xH(C16300so r1, C16600tK r2, C16980tz r3, C18780xF r4, C17190ug r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (java.lang.Byte.parseByte(r6) < 0) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.Runnable r21, java.lang.String r22, byte[] r23, byte[] r24) {
        /*
            r20 = this;
            r15 = r20
            X.0so r3 = r15.A00
            r4 = r24
            X.C40691uX.A0C(r3, r4)
            r5 = r23
            int r2 = r5.length
            r0 = 32
            if (r2 == r0) goto L_0x0024
            java.lang.String r1 = ""
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1 = 1
            java.lang.String r0 = "crypto-iq-incorrect-server-salt-size"
            r3.AcB(r0, r2, r1)
        L_0x0024:
            r6 = r22
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0032
            byte r0 = java.lang.Byte.parseByte(r6)     // Catch:{ NumberFormatException -> 0x0032 }
            if (r0 >= 0) goto L_0x0038
        L_0x0032:
            r1 = 1
            java.lang.String r0 = "crypto-iq-incorrect-key-version"
            r3.AcB(r0, r6, r1)
        L_0x0038:
            java.lang.String r1 = "BackupSendMethods/sendGetCipherKey/v="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ug r3 = r15.A04
            java.lang.String r2 = r3.A02()
            r11 = 2
            X.1lL[] r12 = new X.C35081lL[r11]
            java.lang.String r1 = "action"
            java.lang.String r10 = "get"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r10)
            r14 = 0
            r12[r14] = r0
            java.lang.String r1 = "version"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r6)
            r13 = 1
            r12[r13] = r0
            X.1Vv[] r9 = new X.C28371Vv[r11]
            java.lang.String r1 = "google"
            r7 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (byte[]) r4, (X.C35081lL[]) r7)
            r9[r14] = r0
            java.lang.String r1 = "code"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (byte[]) r5, (X.C35081lL[]) r7)
            r9[r13] = r0
            java.lang.String r0 = "crypto"
            X.1Vv r8 = new X.1Vv
            r8.<init>((java.lang.String) r0, (X.C35081lL[]) r12, (X.C28371Vv[]) r9)
            r0 = 4
            X.1lL[] r7 = new X.C35081lL[r0]
            X.1ks r9 = X.C34791ks.A00
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r9, (java.lang.String) r1)
            r7[r14] = r0
            java.lang.String r9 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r9, (java.lang.String) r1)
            r7[r13] = r0
            java.lang.String r1 = "type"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r10)
            r7[r11] = r0
            java.lang.String r0 = "id"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r0, (java.lang.String) r2)
            r0 = 3
            r7[r0] = r1
            java.lang.String r1 = "iq"
            X.1Vv r0 = new X.1Vv
            r0.<init>((X.C28371Vv) r8, (java.lang.String) r1, (X.C35081lL[]) r7)
            X.1uZ r14 = new X.1uZ
            r16 = r21
            r19 = r4
            r18 = r5
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r7 = 75
            r8 = 32000(0x7d00, double:1.581E-319)
            r4 = r14
            r5 = r0
            r6 = r2
            r3.A0B(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18800xH.A00(java.lang.Runnable, java.lang.String, byte[], byte[]):void");
    }

    public boolean A01(Runnable runnable, byte[] bArr, byte[] bArr2, int i2) {
        if (!this.A01.A05) {
            return false;
        }
        Log.i("sendmethods/sendcreatecipherkey");
        C16300so r3 = this.A00;
        byte[] bArr3 = bArr;
        C40691uX.A0C(r3, bArr3);
        byte[] bArr4 = bArr2;
        int length = bArr4.length;
        if (length != 16) {
            StringBuilder sb = new StringBuilder("");
            sb.append(length);
            r3.AcB("crypto-iq-incorrect-account-salt-size", sb.toString(), true);
        }
        C17190ug r14 = this.A04;
        String A022 = r14.A02();
        r14.A0B(new C40701uY(this, runnable, bArr3, bArr4, i2), new C28371Vv(new C28371Vv("crypto", new C35081lL[]{new C35081lL("action", "create")}, new C28371Vv[]{new C28371Vv("google", bArr3, (C35081lL[]) null)}), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("xmlns", "urn:xmpp:whatsapp:account"), new C35081lL("type", "get"), new C35081lL("id", A022)}), A022, 74, 32000);
        return true;
    }
}
