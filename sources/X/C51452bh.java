package X;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2bh  reason: invalid class name and case insensitive filesystem */
public class C51452bh extends C51442bg {
    public static final Set A03 = new HashSet(Arrays.asList(new String[]{"offer", "accept", "reject", "enc_rekey"}));
    public final C16040sK A00;
    public final C16440t3 A01;
    public final C207911p A02;

    public C51452bh(C16300so r7, C16040sK r8, C16440t3 r9, C14710pd r10, C16490t9 r11, AnonymousClass2H7 r12, C207911p r13, Map map) {
        super(r7, r10, r11, r12, map);
        this.A01 = r9;
        this.A00 = r8;
        this.A02 = r13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.2em} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.2em} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: X.1dG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.2em} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.2em} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.2em} */
    /* JADX WARNING: type inference failed for: r0v144, types: [X.1dG] */
    /* JADX WARNING: type inference failed for: r2v35, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05a6, code lost:
        if ("sender".equals(r13) != false) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ff, code lost:
        if (r3.A00.A0I(X.C16030sJ.A00(r6.A01)) == false) goto L_0x0201;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01af  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C28371Vv r45) {
        /*
            r44 = this;
            long r42 = android.os.SystemClock.uptimeMillis()
            java.lang.Class<com.whatsapp.jid.Jid> r29 = com.whatsapp.jid.Jid.class
            r3 = r44
            X.0so r7 = r3.A01
            java.lang.String r2 = "from"
            r1 = r45
            r0 = r29
            com.whatsapp.jid.Jid r28 = r1.A0F(r7, r0, r2)
            java.lang.String r27 = "id"
            r6 = 0
            r0 = r27
            java.lang.String r9 = r1.A0N(r0, r6)
            java.lang.String r26 = "type"
            java.lang.String r25 = "delivery"
            r2 = r25
            r0 = r26
            java.lang.String r8 = r1.A0N(r0, r2)
            java.lang.String r24 = "sender"
            java.lang.String r23 = "category"
            r0 = r23
            java.lang.String r22 = r1.A0N(r0, r6)
            java.lang.String r13 = "participant"
            r0 = r29
            com.whatsapp.jid.Jid r20 = r1.A0F(r7, r0, r13)
            java.lang.Class<com.whatsapp.jid.UserJid> r19 = com.whatsapp.jid.UserJid.class
            java.lang.String r18 = "recipient"
            r2 = r19
            r0 = r18
            com.whatsapp.jid.Jid r0 = r1.A0F(r7, r2, r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            java.lang.String r2 = "edit"
            java.lang.String r15 = r1.A0N(r2, r6)
            java.lang.String r17 = "offline"
            r2 = r17
            java.lang.String r11 = r1.A0N(r2, r6)
            r21 = 0
            if (r11 == 0) goto L_0x005f
            r21 = 1
        L_0x005f:
            r2 = 0
            if (r11 == 0) goto L_0x0079
            java.lang.Integer r35 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x0067 }
            goto L_0x007b
        L_0x0067:
            r10 = move-exception
            java.lang.String r5 = "connection/handleReceipt: got bad offline="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.e(r4, r10)
        L_0x0079:
            r35 = r6
        L_0x007b:
            X.0rv r11 = X.C16030sJ.A00(r28)
            if (r0 == 0) goto L_0x0088
            boolean r4 = X.C16030sJ.A0L(r11)
            if (r4 != 0) goto L_0x0088
            r11 = r0
        L_0x0088:
            java.lang.String r10 = "retry"
            if (r9 == 0) goto L_0x04f5
            if (r11 == 0) goto L_0x04f5
            boolean r4 = r10.equals(r8)
            if (r4 == 0) goto L_0x00a2
            X.1Vv r5 = r1.A0K(r10)
            java.lang.String r4 = "v"
            java.lang.String r2 = "1"
            java.lang.String r2 = r5.A0N(r4, r2)
        L_0x00a2:
            int r39 = X.C18020w1.A04(r11)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r39)
            X.11p r5 = r3.A02
            if (r8 != 0) goto L_0x04f1
            java.lang.String r37 = ""
        L_0x00b0:
            java.util.concurrent.atomic.AtomicLong r4 = r5.A04
            long r11 = r4.getAndIncrement()
            X.0t3 r4 = r5.A02
            r32 = r4
            X.0so r4 = r5.A01
            r16 = r4
            X.0t9 r4 = r5.A00
            r14 = r4
            X.11o r5 = r5.A03
            X.2em r4 = new X.2em
            r30 = r4
            r31 = r16
            r33 = r14
            r34 = r5
            r36 = r9
            r38 = r2
            r40 = r11
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42)
            r5.A04(r4, r11)
            r2 = r4
            long r11 = r4.A03
        L_0x00dc:
            r5 = 2
            java.lang.Integer r32 = java.lang.Integer.valueOf(r5)
            r4 = 0
            java.lang.String r16 = "receipt"
            r37 = r4
            r38 = r8
            r30 = r3
            r31 = r35
            r33 = r4
            r34 = r6
            r35 = r16
            r36 = r8
            r30.A01(r31, r32, r33, r34, r35, r36, r37, r38)
            X.1kL r14 = new X.1kL
            r14.<init>()
            r6 = r28
            r14.A01 = r6
            r6 = r16
            r14.A05 = r6
            r14.A07 = r9
            r14.A08 = r8
            r6 = r22
            r14.A04 = r6
            r6 = r20
            r14.A02 = r6
            r14.A03 = r0
            r14.A06 = r15
            r14.A00 = r11
            X.1ci r6 = r14.A00()
            r11 = r25
            boolean r12 = r11.equals(r8)
            java.lang.String r11 = "error"
            if (r12 == 0) goto L_0x01af
            r10 = 0
            X.1Vv r12 = r1.A0I(r10)
            if (r12 == 0) goto L_0x0542
            java.util.Set r13 = A03
            java.lang.String r0 = r12.A00
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x0542
            if (r2 == 0) goto L_0x013a
            r2.A00(r5)
        L_0x013a:
            com.whatsapp.jid.Jid r5 = r6.A01
            com.whatsapp.jid.DeviceJid r9 = com.whatsapp.jid.DeviceJid.of(r5)
            if (r9 == 0) goto L_0x0515
            com.whatsapp.protocol.VoipStanzaChildNode r1 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r12)
            X.2H7 r7 = r3.A04
            java.lang.String r0 = r6.A07
            X.AnonymousClass00B.A06(r0)
            X.4Ic r5 = new X.4Ic
            r5.<init>(r9, r1)
            java.lang.String r0 = "xmpp/reader/on-call-incoming-receipt-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r5.A01
            java.lang.String r0 = r0.tag
            r1.append(r0)
            java.lang.String r0 = " from="
            r1.append(r0)
            com.whatsapp.jid.DeviceJid r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = " type=delivery"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r1 = r7.A01
            r0 = 197(0xc5, float:2.76E-43)
            android.os.Message r0 = android.os.Message.obtain(r4, r10, r0, r10, r5)
            r1.AZq(r0)
        L_0x0182:
            r5 = 0
        L_0x0183:
            if (r2 == 0) goto L_0x0189
            r0 = 4
            r2.A00(r0)
        L_0x0189:
            r0 = 2
            if (r5 != r0) goto L_0x01a9
            X.1kL r1 = r6.A02()
            java.lang.String r0 = "487"
            r1.A01(r11, r0)
            X.1ci r6 = r1.A00()
            X.3r4 r1 = new X.3r4
            r1.<init>()
            r0 = r16
            r1.A00 = r0
            r1.A01 = r8
            X.0t9 r0 = r3.A03
            r0.A06(r1)
        L_0x01a9:
            X.2H7 r0 = r3.A04
            r0.A01(r6)
            return
        L_0x01af:
            java.lang.String r12 = "inactive"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x0542
            r12 = r24
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x0542
            java.lang.String r12 = "played"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x0542
            java.lang.String r12 = "played-self"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x0542
            java.lang.String r12 = "read"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x0542
            java.lang.String r12 = "read-self"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x0542
            java.lang.String r9 = "server-error"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x02ea
            java.lang.String r0 = "rmr"
            X.1Vv r15 = r1.A0J(r0)
            r12 = 1
            if (r15 != 0) goto L_0x0201
            r12 = 0
            X.0sK r9 = r3.A00
            com.whatsapp.jid.Jid r0 = r6.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            boolean r0 = r9.A0I(r0)
            if (r0 != 0) goto L_0x0183
        L_0x0201:
            com.whatsapp.jid.Jid r10 = r6.A01
            r14 = r10
            X.AnonymousClass00B.A06(r10)
            com.whatsapp.jid.UserJid r9 = r6.A00()
            if (r12 == 0) goto L_0x02e7
            java.lang.String r9 = "jid"
            r0 = r29
            com.whatsapp.jid.Jid r14 = r15.A0F(r7, r0, r9)
            java.lang.String r0 = "from_me"
            java.lang.String r9 = r15.A0N(r0, r4)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r9)
            r9 = r19
            com.whatsapp.jid.Jid r9 = r15.A0F(r7, r9, r13)
        L_0x0228:
            if (r14 == 0) goto L_0x0183
            java.lang.String r7 = "encrypt"
            X.1Vv r15 = r1.A0J(r7)
            if (r2 == 0) goto L_0x0235
            r2.A00(r5)
        L_0x0235:
            X.2H7 r2 = r3.A04
            java.lang.String r1 = "enc_p"
            r8 = 0
            if (r15 == 0) goto L_0x02e4
            X.1Vv r1 = r15.A0J(r1)
            if (r1 == 0) goto L_0x02e4
            byte[] r11 = r1.A01
        L_0x0244:
            java.lang.String r7 = "enc_iv"
            if (r15 == 0) goto L_0x0250
            X.1Vv r1 = r15.A0J(r7)
            if (r1 == 0) goto L_0x0250
            byte[] r8 = r1.A01
        L_0x0250:
            java.lang.String r1 = "xmpp/reader/read/server-error-for-target remote_jid = "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r14)
            java.lang.String r1 = "; id = "
            r3.append(r1)
            java.lang.String r15 = r6.A07
            r3.append(r15)
            java.lang.String r1 = "; participant = "
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = "; recipient = "
            r3.append(r1)
            com.whatsapp.jid.UserJid r5 = r6.A03
            r3.append(r5)
            java.lang.String r1 = "; fromMe = "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = "; isMdRmr = "
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2H8 r1 = r2.A01
            java.lang.String r3 = r6.A04
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.AnonymousClass2RS.A01(r2, r9, r13)
            java.lang.String r9 = "msgid"
            r2.putString(r9, r15)
            java.lang.String r9 = "remote_jid"
            X.AnonymousClass2RS.A01(r2, r14, r9)
            java.lang.String r9 = "from_me"
            r2.putBoolean(r9, r0)
            r0 = r18
            X.AnonymousClass2RS.A01(r2, r5, r0)
            java.lang.String r0 = "enc_data"
            r2.putByteArray(r0, r11)
            r2.putByteArray(r7, r8)
            java.lang.String r0 = "is_md_rmr"
            r2.putBoolean(r0, r12)
            r0 = r23
            r2.putString(r0, r3)
            java.lang.String r0 = "requester"
            X.AnonymousClass2RS.A01(r2, r10, r0)
            r3 = 0
            r0 = 69
            android.os.Message r0 = android.os.Message.obtain(r4, r3, r0, r3, r2)
            r1.AZq(r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "stanzaKey"
            r2.putParcelable(r0, r6)
            r0 = 85
            android.os.Message r0 = android.os.Message.obtain(r4, r3, r0, r3, r2)
        L_0x02e0:
            r1.AZq(r0)
            return
        L_0x02e4:
            r11 = r4
            goto L_0x0244
        L_0x02e7:
            r0 = 1
            goto L_0x0228
        L_0x02ea:
            boolean r9 = r10.equals(r8)
            if (r9 == 0) goto L_0x03e5
            X.1Vv r10 = r1.A0K(r10)
            java.lang.String r7 = "registration"
            X.1Vv r7 = r1.A0K(r7)
            byte[] r9 = r7.A01
            if (r9 == 0) goto L_0x0532
            int r12 = r9.length
            r7 = 4
            if (r12 != r7) goto L_0x0532
            java.lang.String r7 = "v"
            java.lang.String r12 = "1"
            java.lang.String r7 = r10.A0N(r7, r12)
            boolean r12 = r12.equals(r7)
            r7 = 1
            if (r12 == 0) goto L_0x0183
            java.lang.String r8 = "count"
            int r28 = r10.A0A(r8, r7)
            java.lang.String r11 = "t"
            java.lang.String r8 = r10.A0M(r11)
            long r11 = r10.A0E(r8, r11)
            r29 = 1000(0x3e8, double:4.94E-321)
            long r29 = r29 * r11
            r8 = r27
            java.lang.String r8 = r10.A0M(r8)
            if (r0 != 0) goto L_0x0335
            com.whatsapp.jid.Jid r0 = r6.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
        L_0x0335:
            X.1Vw r14 = new X.1Vw
            r14.<init>(r0, r8, r7)
            java.lang.String r0 = "mediareason"
            r11 = 0
            r10.A0N(r0, r4)
            java.lang.String r0 = "keys"
            X.1Vv r12 = r1.A0J(r0)
            r13 = 0
            if (r12 == 0) goto L_0x03e1
            java.lang.String r0 = "identity"
            X.1Vv r8 = r12.A0K(r0)
            r0 = r26
            X.1Vv r0 = r12.A0K(r0)
            byte[] r0 = r0.A01
            if (r0 == 0) goto L_0x0529
            int r0 = r0.length
            if (r0 != r7) goto L_0x0529
            byte[] r15 = r8.A01
            java.lang.String r0 = "key"
            X.1Vv r7 = r12.A0K(r0)
            r0 = r27
            X.1Vv r8 = r7.A0K(r0)
            java.lang.String r0 = "value"
            X.1Vv r7 = r7.A0K(r0)
            byte[] r8 = r8.A01
            byte[] r7 = r7.A01
            X.1dG r11 = new X.1dG
            r11.<init>(r8, r7, r4)
            java.lang.String r7 = "skey"
            X.1Vv r10 = r12.A0K(r7)
            r7 = r27
            X.1Vv r8 = r10.A0K(r7)
            X.1Vv r7 = r10.A0K(r0)
            java.lang.String r0 = "signature"
            X.1Vv r0 = r10.A0K(r0)
            byte[] r10 = r8.A01
            byte[] r8 = r7.A01
            byte[] r7 = r0.A01
            X.1dG r0 = new X.1dG
            r0.<init>(r10, r8, r7)
            java.lang.String r7 = "device-identity"
            X.1Vv r7 = r12.A0J(r7)
            if (r7 == 0) goto L_0x03a7
            byte[] r13 = r7.A01
        L_0x03a7:
            r27 = r13
            r13 = r0
        L_0x03aa:
            if (r2 == 0) goto L_0x03af
            r2.A00(r5)
        L_0x03af:
            X.2H7 r2 = r3.A04
            r0 = r17
            java.lang.String r0 = r1.A0N(r0, r4)
            r31 = 0
            if (r0 == 0) goto L_0x03bd
            r31 = 1
        L_0x03bd:
            java.lang.String r0 = "xmpp/reader/on-message-retry-by-target"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r1 = r2.A01
            X.2eM r2 = new X.2eM
            r23 = r6
            r24 = r22
            r25 = r9
            r26 = r15
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31)
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r4, r0, r5, r0, r2)
            goto L_0x02e0
        L_0x03e1:
            r15 = r4
            r27 = r4
            goto L_0x03aa
        L_0x03e5:
            java.lang.String r0 = "enc_rekey_retry"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0461
            java.lang.String r0 = "registration"
            X.1Vv r0 = r1.A0K(r0)
            byte[] r9 = r0.A01
            if (r9 == 0) goto L_0x053a
            int r7 = r9.length
            r0 = 4
            if (r7 != r0) goto L_0x053a
            java.lang.String r0 = "enc_rekey"
            X.1Vv r7 = r1.A0K(r0)
            java.lang.String r0 = "call-id"
            java.lang.String r12 = r7.A0M(r0)
            java.lang.String r1 = "count"
            java.lang.String r0 = r7.A0M(r1)
            int r0 = r7.A0B(r0, r1)
            byte r1 = (byte) r0
            if (r2 == 0) goto L_0x0417
            r2.A00(r5)
        L_0x0417:
            X.2H7 r7 = r3.A04
            java.lang.String r0 = "xmpp/reader/read/on-call-rekey stanzaKey="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r0 = " callId="
            r5.append(r0)
            r5.append(r12)
            java.lang.String r0 = " retry="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r7 = r7.A01
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r0 = "stanzaKey"
            r5.putParcelable(r0, r6)
            java.lang.String r0 = "callId"
            r5.putString(r0, r12)
            java.lang.String r0 = "registrationId"
            r5.putByteArray(r0, r9)
            r5.putByte(r10, r1)
            r1 = 0
            r0 = 150(0x96, float:2.1E-43)
            android.os.Message r0 = android.os.Message.obtain(r4, r1, r0, r1, r5)
            r7.AZq(r0)
            goto L_0x0182
        L_0x0461:
            boolean r0 = r11.equals(r8)
            if (r0 == 0) goto L_0x0481
            X.1Vv r10 = r1.A0K(r11)
            r0 = r26
            java.lang.String r12 = r10.A0M(r0)
            java.lang.String r0 = "enc-v2-unknown-tags"
            boolean r0 = r0.equals(r12)
            r1 = 4
            if (r0 == 0) goto L_0x04d8
            if (r2 == 0) goto L_0x01a9
            r2.A00(r1)
            goto L_0x01a9
        L_0x0481:
            java.lang.String r0 = "peer_msg"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x04af
            if (r2 == 0) goto L_0x048e
            r2.A00(r5)
        L_0x048e:
            X.2H7 r2 = r3.A04
            java.lang.String r0 = "xmpp/reader/on-peer-message-receipt stanza-id:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r6.A07
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r1 = r2.A01
            r2 = 0
            r0 = 221(0xdd, float:3.1E-43)
        L_0x04a9:
            android.os.Message r0 = android.os.Message.obtain(r4, r2, r0, r2, r6)
            goto L_0x02e0
        L_0x04af:
            java.lang.String r0 = "hist_sync"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0183
            if (r2 == 0) goto L_0x04bc
            r2.A00(r5)
        L_0x04bc:
            X.2H7 r2 = r3.A04
            java.lang.String r0 = "xmpp/reader/on-history-sync-receipt stanza-id:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r6.A07
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r1 = r2.A01
            r2 = 0
            r0 = 212(0xd4, float:2.97E-43)
            goto L_0x04a9
        L_0x04d8:
            java.lang.String r9 = "feature-incapable"
            boolean r0 = r9.equals(r12)
            if (r0 == 0) goto L_0x0183
            if (r2 == 0) goto L_0x04e5
            r2.A00(r1)
        L_0x04e5:
            java.lang.String r0 = "reason"
            java.lang.String r1 = r10.A0N(r0, r4)
            r0 = 0
            r7.AcB(r9, r1, r0)
            goto L_0x01a9
        L_0x04f1:
            r37 = r8
            goto L_0x00b0
        L_0x04f5:
            java.lang.String r4 = "id = "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r9)
            java.lang.String r4 = "; chatJid = "
            r5.append(r4)
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            java.lang.String r5 = "LoggableStanza/cant report stanza"
            r4 = 1
            r7.AcB(r5, r11, r4)
            r11 = 0
            goto L_0x00dc
        L_0x0515:
            java.lang.String r1 = "CallReceipt from invalid jid "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0529:
            java.lang.String r0 = "type node should contain exactly 1 byte"
            X.1W9 r1 = new X.1W9
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0532:
            java.lang.String r0 = "invalid registration node"
            X.1W9 r1 = new X.1W9
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x053a:
            java.lang.String r1 = "invalid registration node"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0542:
            java.lang.String r13 = r6.A08
            X.AnonymousClass00B.A06(r13)
            int r0 = r13.hashCode()
            switch(r0) {
                case -1159650013: goto L_0x0556;
                case -985752877: goto L_0x0561;
                case -905962955: goto L_0x056c;
                case 3496342: goto L_0x0570;
                case 24665195: goto L_0x057b;
                case 110109190: goto L_0x0586;
                case 823466996: goto L_0x0591;
                default: goto L_0x054e;
            }
        L_0x054e:
            java.lang.String r1 = "invalid type"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0556:
            java.lang.String r0 = "read-self"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x054e
            r8 = 17
            goto L_0x059a
        L_0x0561:
            java.lang.String r0 = "played"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x054e
            r8 = 8
            goto L_0x059a
        L_0x056c:
            java.lang.String r0 = "sender"
            goto L_0x0593
        L_0x0570:
            java.lang.String r0 = "read"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x054e
            r8 = 13
            goto L_0x059a
        L_0x057b:
            java.lang.String r0 = "inactive"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x054e
            r8 = 15
            goto L_0x059a
        L_0x0586:
            java.lang.String r0 = "played-self"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x054e
            r8 = 18
            goto L_0x059a
        L_0x0591:
            java.lang.String r0 = "delivery"
        L_0x0593:
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x054e
            r8 = 5
        L_0x059a:
            com.whatsapp.jid.UserJid r11 = r6.A03
            r10 = 0
            if (r11 == 0) goto L_0x05a8
            r0 = r24
            boolean r0 = r0.equals(r13)
            r12 = 0
            if (r0 == 0) goto L_0x05a9
        L_0x05a8:
            r12 = 1
        L_0x05a9:
            r0 = r24
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x05c1
            if (r11 != 0) goto L_0x05c1
            com.whatsapp.jid.UserJid r0 = r6.A00()
            if (r0 != 0) goto L_0x05c1
            java.lang.String r1 = "Sender receipts must have a recipient or participant jid"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05c1:
            java.lang.String r0 = "read-self"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x05d3
            if (r11 != 0) goto L_0x05d3
            java.lang.String r1 = "Read-self receipts must have a recipient jid"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05d3:
            com.whatsapp.jid.Jid r0 = r6.A01
            r23 = r0
            X.0rv r14 = X.C16030sJ.A00(r23)
            if (r11 == 0) goto L_0x0678
            boolean r0 = X.C16030sJ.A0L(r14)
            if (r0 != 0) goto L_0x0678
            boolean r0 = X.C16030sJ.A0Q(r14)
            if (r0 != 0) goto L_0x0678
        L_0x05e9:
            X.AnonymousClass00B.A06(r11)
            r20 = 0
            r0 = r25
            boolean r0 = r0.equals(r13)
            java.lang.String r17 = "biz"
            if (r0 == 0) goto L_0x061b
            r0 = r17
            X.1Vv r14 = r1.A0J(r0)
            if (r14 == 0) goto L_0x061b
            java.lang.String r0 = "host_storage"
            java.lang.String r16 = r14.A0N(r0, r4)
            java.lang.String r0 = "actual_actors"
            java.lang.String r13 = r14.A0N(r0, r4)
            java.lang.String r0 = "privacy_mode_ts"
            java.lang.String r0 = r14.A0N(r0, r4)
            X.1ta r20 = new X.1ta
            r15 = r20
            r14 = r16
            r15.<init>((java.lang.String) r14, (java.lang.String) r13, (java.lang.String) r0)
        L_0x061b:
            X.1Vv r13 = r1.A0I(r10)
            java.lang.String r0 = "participants"
            boolean r0 = X.C28371Vv.A07(r13, r0)
            if (r0 == 0) goto L_0x06ef
            java.lang.String r0 = "key"
            java.lang.String r1 = r13.A0M(r0)
            X.1Vw r19 = new X.1Vw
            r0 = r19
            r0.<init>(r11, r1, r12)
            X.1Vv[] r12 = r13.A03
            if (r12 == 0) goto L_0x06e7
            int r0 = r12.length
            r22 = r0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            X.0t3 r0 = r3.A01
            long r0 = r0.A00()
            r17 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r17
            r13 = 0
        L_0x064b:
            r9 = r22
            if (r13 >= r9) goto L_0x067b
            r15 = r12[r13]
            java.lang.String r9 = "jid"
            r14 = r29
            com.whatsapp.jid.Jid r9 = r15.A0F(r7, r14, r9)
            if (r9 == 0) goto L_0x0675
            com.whatsapp.jid.DeviceJid r16 = com.whatsapp.jid.DeviceJid.of(r9)
            java.lang.String r9 = "t"
            long r14 = r15.A0D(r9, r0)
            long r14 = r14 * r17
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r9 = r16
            android.util.Pair r9 = android.util.Pair.create(r9, r14)
            r11.add(r9)
        L_0x0675:
            int r13 = r13 + 1
            goto L_0x064b
        L_0x0678:
            r11 = r14
            goto L_0x05e9
        L_0x067b:
            if (r2 == 0) goto L_0x0680
            r2.A00(r5)
        L_0x0680:
            X.2H7 r1 = r3.A04
            java.lang.String r0 = "xmpp/reader/read/receipt-from-multiple-targets id = "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = r19
            java.lang.String r0 = r0.A01
            r2.append(r0)
            java.lang.String r0 = "; remoteJid = "
            r2.append(r0)
            r0 = r23
            r2.append(r0)
            java.lang.String r0 = "; participant = "
            r2.append(r0)
            com.whatsapp.jid.Jid r0 = r6.A02
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r0)
            r2.append(r0)
            java.lang.String r0 = "; status = "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "; targetTimestampPairList = "
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = "; receiptPrivacyMode = "
            r2.append(r0)
            r0 = r20
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r3 = r1.A01
            X.2Qu r1 = new X.2Qu
            r12 = r1
            r13 = r23
            r14 = r19
            r15 = r20
            r16 = r6
            r17 = r11
            r18 = r8
            r19 = r21
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0 = 1
            android.os.Message r0 = android.os.Message.obtain(r4, r10, r0, r10, r1)
            goto L_0x0786
        L_0x06e7:
            java.lang.String r1 = "ReceiptStanzaHandler/handleSuccessfulMessageReceipt empty participants"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x06ef:
            r0 = r17
            boolean r0 = X.C28371Vv.A07(r13, r0)
            if (r0 == 0) goto L_0x078a
            X.1Vw r13 = new X.1Vw
            r13.<init>(r11, r9, r12)
            r0 = 1
            X.1Vw[] r7 = new X.C28381Vw[r0]
            r7[r10] = r13
        L_0x0701:
            java.lang.String r0 = "t"
            java.lang.String r9 = r1.A0N(r0, r4)
            r0 = 0
            long r0 = X.C29501aj.A01(r9, r0)
            r9 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r9
            if (r2 == 0) goto L_0x0716
            r2.A00(r5)
        L_0x0716:
            X.2H7 r3 = r3.A04
            java.lang.String r2 = "xmpp/reader/read/receipt-from-target keys = "
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            java.lang.String r2 = java.util.Arrays.toString(r7)
            r9.append(r2)
            java.lang.String r2 = "; remoteJid = "
            r9.append(r2)
            r2 = r23
            r9.append(r2)
            java.lang.String r2 = "; participant = "
            r9.append(r2)
            com.whatsapp.jid.Jid r5 = r6.A02
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r5)
            r9.append(r2)
            java.lang.String r2 = "; status = "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r2 = "; timestamp = "
            r9.append(r2)
            r9.append(r0)
            java.lang.String r2 = "; offline = "
            r9.append(r2)
            r2 = r21
            r9.append(r2)
            java.lang.String r2 = "; receiptPrivacyMode = "
            r9.append(r2)
            r2 = r20
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.2H8 r3 = r3.A01
            com.whatsapp.jid.DeviceJid r9 = com.whatsapp.jid.DeviceJid.of(r5)
            X.2Qr r2 = new X.2Qr
            r11 = r20
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r0
            r17 = r21
            r8 = r2
            r10 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            r1 = 0
            r0 = 1
            android.os.Message r0 = android.os.Message.obtain(r4, r1, r0, r1, r2)
        L_0x0786:
            r3.AZq(r0)
            return
        L_0x078a:
            X.1Vv[] r13 = r1.A03
            r15 = 0
            if (r13 == 0) goto L_0x07b9
            int r7 = r13.length
            r0 = 1
            if (r7 != r0) goto L_0x07b9
            r7 = r13[r10]
            java.lang.String r0 = "list"
            X.C28371Vv.A06(r7, r0)
            X.1Vv[] r13 = r7.A03
            if (r13 == 0) goto L_0x07b7
            int r7 = r13.length
        L_0x079f:
            int r0 = r7 + 1
            java.lang.String[] r14 = new java.lang.String[r0]
        L_0x07a3:
            r14[r15] = r9
            if (r15 >= r7) goto L_0x07be
            r9 = r13[r15]
            java.lang.String r0 = "item"
            X.C28371Vv.A06(r9, r0)
            r0 = r27
            java.lang.String r9 = r9.A0N(r0, r4)
            int r15 = r15 + 1
            goto L_0x07a3
        L_0x07b7:
            r7 = 0
            goto L_0x079f
        L_0x07b9:
            r0 = 1
            java.lang.String[] r14 = new java.lang.String[r0]
            r14[r10] = r9
        L_0x07be:
            int r13 = r14.length
            X.1Vw[] r7 = new X.C28381Vw[r13]
        L_0x07c1:
            if (r10 >= r13) goto L_0x0701
            r9 = r14[r10]
            X.1Vw r0 = new X.1Vw
            r0.<init>(r11, r9, r12)
            r7[r10] = r0
            int r10 = r10 + 1
            goto L_0x07c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51452bh.A00(X.1Vv):void");
    }
}
