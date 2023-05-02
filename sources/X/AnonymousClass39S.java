package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.39S  reason: invalid class name */
public class AnonymousClass39S {
    public final C33441ia A00 = new C99894ul(this);
    public final AnonymousClass19T A01;
    public final C211512z A02;
    public final AnonymousClass1HD A03;
    public final AnonymousClass38X A04;
    public final AnonymousClass16U A05;
    public final AnonymousClass27N A06 = new C101674xh(this);
    public final AnonymousClass1SL A07;
    public final C208211s A08;
    public final AnonymousClass16P A09;
    public final C18920xT A0A;
    public final C24911Ht A0B;
    public final AnonymousClass1HU A0C;
    public final AnonymousClass1GG A0D;
    public final AnonymousClass27O A0E = new AnonymousClass4y5(this);
    public final AnonymousClass19B A0F;
    public final AnonymousClass137 A0G;
    public final C14710pd A0H;
    public final C16490t9 A0I;
    public final C24851Hn A0J;
    public final Set A0K = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile Future A0L;

    public AnonymousClass39S(AnonymousClass19T r2, C211512z r3, AnonymousClass1HD r4, AnonymousClass38X r5, AnonymousClass16U r6, AnonymousClass1SL r7, C208211s r8, AnonymousClass16P r9, C18920xT r10, C24911Ht r11, AnonymousClass1HU r12, AnonymousClass1GG r13, AnonymousClass19B r14, AnonymousClass137 r15, C14710pd r16, C16490t9 r17, C24851Hn r18) {
        this.A0H = r16;
        this.A0I = r17;
        this.A0A = r10;
        this.A09 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
        this.A08 = r8;
        this.A0G = r15;
        this.A03 = r4;
        this.A0J = r18;
        this.A0D = r13;
        this.A07 = r7;
        this.A0F = r14;
        this.A0B = r11;
        this.A0C = r12;
        this.A04 = r5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: X.1d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: X.1d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: X.1d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: X.1d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: X.2Ip} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: X.1d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v88, resolved type: X.1d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: X.21V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: X.21V} */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.21U] */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r1v83 */
    /* JADX WARNING: type inference failed for: r1v85 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x036a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0202 A[Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C88344aL A00(X.C78093x7 r42) {
        /*
            r41 = this;
            r5 = r42
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r5.A01
            r23 = r0
            com.whatsapp.protocol.VoipStanzaChildNode[] r14 = r23.getChildrenCopy()
            if (r14 != 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "voip/encryption/decrypt-stanza no children, message.id="
        L_0x0013:
            r1.append(r0)
            java.lang.String r0 = r5.A03
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4aL r18 = X.C88344aL.A07
            return r18
        L_0x0022:
            int r0 = r14.length
            r40 = r0
            r13 = 0
            r1 = 0
            r22 = r1
            r33 = r1
            r3 = 0
        L_0x002c:
            r0 = r40
            if (r3 >= r0) goto L_0x0061
            r4 = r14[r3]
            java.lang.String r2 = r4.tag
            java.lang.String r0 = "registration"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0050
            byte[] r22 = r4.getDataCopy()
            if (r22 == 0) goto L_0x0048
            r0 = r22
            int r2 = r0.length
            r0 = 4
            if (r2 == r0) goto L_0x005e
        L_0x0048:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "voip/encryption/decrypt-stanza invalid registration, message.id="
            goto L_0x0013
        L_0x0050:
            java.lang.String r2 = r4.tag
            java.lang.String r0 = "device-identity"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005e
            byte[] r33 = r4.getDataCopy()
        L_0x005e:
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0061:
            r0 = r23
            java.lang.String r2 = r0.tag
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r21 = new com.whatsapp.protocol.VoipStanzaChildNode$Builder
            r0 = r21
            r0.<init>(r2)
            X.1lL[] r2 = r23.getAttributesCopy()
            r0.addAttributes(r2)
            r4 = r1
            r3 = r1
            r6 = r1
            r8 = 0
            r24 = 0
        L_0x0079:
            r0 = r40
            if (r13 >= r0) goto L_0x0434
            r7 = r14[r13]
            java.lang.String r2 = r7.tag
            java.lang.String r20 = "enc"
            r0 = r20
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x040c
            if (r8 == 0) goto L_0x00a0
            java.lang.String r0 = "voip/encryption/decrypt-stanza, duplicate <enc> message.id="
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r5.A03
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x009d:
            int r13 = r13 + 1
            goto L_0x0079
        L_0x00a0:
            java.lang.Byte r0 = X.C32601gl.A03(r7)
            if (r0 != 0) goto L_0x00af
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "voip/encryption/decrypt-stanza invalid retry count, message.id="
            goto L_0x0013
        L_0x00af:
            byte r24 = r0.byteValue()
            X.1Vv r0 = r7.toProtocolTreeNode()     // Catch:{ 1W9 -> 0x0421 }
            X.1d1 r6 = X.C53622g0.A00(r0)     // Catch:{ 1W9 -> 0x0421 }
            int r7 = r6.A01
            r8 = 2
            if (r7 == r8) goto L_0x00c2
            goto L_0x0413
        L_0x00c2:
            byte[] r2 = r6.A02
            r9 = 8
            if (r2 != 0) goto L_0x0101
            r12 = 8
        L_0x00ca:
            byte[] r11 = new byte[r12]
            r0 = 0
            byte r4 = (byte) r0
            r3 = 0
            r11[r0] = r4
            r0 = 1
            r11[r0] = r4
            r1 = 3
            r11[r8] = r4
            r4 = 4
            byte r0 = (byte) r7
            r11[r1] = r0
            r1 = 5
            int r6 = r6.A00
            int r0 = r6 >> 24
            byte r0 = (byte) r0
            r11[r4] = r0
            r4 = 6
            int r0 = r6 >> 16
            byte r0 = (byte) r0
            r11[r1] = r0
            r1 = 7
            int r0 = r6 >> 8
            byte r0 = (byte) r0
            r11[r4] = r0
            byte r0 = (byte) r6
            r11[r1] = r0
            if (r2 == 0) goto L_0x0105
        L_0x00f4:
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0105
            int r1 = r9 + 1
            byte r0 = r2[r3]
            r11[r9] = r0
            int r3 = r3 + 1
            r9 = r1
            goto L_0x00f4
        L_0x0101:
            int r0 = r2.length
            int r12 = r0 + 8
            goto L_0x00ca
        L_0x0105:
            com.whatsapp.jid.Jid r10 = r5.A00
            boolean r0 = r10 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x0143
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10
        L_0x010d:
            X.AnonymousClass00B.A06(r10)
            com.whatsapp.jid.DeviceJid r0 = r5.A03
            r19 = r0
            java.lang.String r0 = r5.A03
            r37 = r0
            java.lang.String r0 = r5.A02
            r34 = r0
            X.1d5 r6 = new X.1d5
            r6.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.A00 = r0
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A08 = r0
            java.lang.Long r0 = X.C13690nt.A0W(r24)
            r6.A0C = r0
            r18 = 3
            r4 = 2
            r39 = 0
            r3 = 1
            r15 = 0
            r9 = 0
            r8 = 8
            r35 = r41
            if (r12 >= r8) goto L_0x0145
            r0 = r15
            goto L_0x0194
        L_0x0143:
            r10 = 0
            goto L_0x010d
        L_0x0145:
            r7 = 0
            byte r0 = r11[r39]     // Catch:{ InterruptedException -> 0x0304 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r0 << 24
            byte r0 = r11[r3]     // Catch:{ InterruptedException -> 0x0304 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r2 = r2 | r0
            byte r0 = r11[r4]     // Catch:{ InterruptedException -> 0x0304 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r8
            r2 = r2 | r0
            r1 = 4
            byte r0 = r11[r18]     // Catch:{ InterruptedException -> 0x0304 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            r16 = 5
            byte r0 = r11[r1]     // Catch:{ InterruptedException -> 0x0304 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 24
            r17 = 6
            byte r0 = r11[r16]     // Catch:{ InterruptedException -> 0x0304 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r1 = r1 | r0
            r16 = 7
            byte r0 = r11[r17]     // Catch:{ InterruptedException -> 0x0304 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r8
            r1 = r1 | r0
            byte r0 = r11[r16]     // Catch:{ InterruptedException -> 0x0304 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            if (r12 == r8) goto L_0x018f
            int r12 = r12 - r8
            byte[] r9 = new byte[r12]     // Catch:{ InterruptedException -> 0x0304 }
        L_0x0182:
            if (r7 >= r12) goto L_0x018f
            int r16 = r8 + 1
            byte r0 = r11[r8]     // Catch:{ InterruptedException -> 0x0304 }
            r9[r7] = r0     // Catch:{ InterruptedException -> 0x0304 }
            int r7 = r7 + 1
            r8 = r16
            goto L_0x0182
        L_0x018f:
            X.1d1 r0 = new X.1d1     // Catch:{ InterruptedException -> 0x0304 }
            r0.<init>(r9, r2, r1)     // Catch:{ InterruptedException -> 0x0304 }
        L_0x0194:
            X.1Yb r30 = X.C28851Ya.A02(r10)     // Catch:{ InterruptedException -> 0x02fb }
            int r2 = r0.A01     // Catch:{ InterruptedException -> 0x02fb }
            if (r2 != r4) goto L_0x02f0
            r1 = r35
            X.16P r1 = r1.A09     // Catch:{ InterruptedException -> 0x02fb }
            X.589 r2 = new X.589     // Catch:{ InterruptedException -> 0x02fb }
            r28 = r2
            r29 = r35
            r31 = r10
            r32 = r0
            r28.<init>(r29, r30, r31, r32, r33)     // Catch:{ InterruptedException -> 0x02fb }
            java.util.concurrent.ThreadPoolExecutor r1 = r1.A00     // Catch:{ InterruptedException -> 0x02fb }
            java.util.concurrent.Future r1 = r1.submit(r2)     // Catch:{ InterruptedException -> 0x02fb }
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x02e0 }
            X.1d8 r1 = (X.C30891d8) r1     // Catch:{ ExecutionException -> 0x02e0 }
            int r7 = r1.A00     // Catch:{ InterruptedException -> 0x02fb }
            if (r7 != 0) goto L_0x026f
            byte[] r1 = r1.A01     // Catch:{ 1bD -> 0x0262 }
            X.1iD r1 = X.C33211iD.A0U(r1)     // Catch:{ 1bD -> 0x0262 }
            X.2In r10 = r1.A05     // Catch:{ 1bD -> 0x0262 }
            if (r10 != 0) goto L_0x01c9
            X.2In r10 = X.C47332In.A05     // Catch:{ 1bD -> 0x0262 }
        L_0x01c9:
            X.1Ww r1 = r10.A02     // Catch:{ 1bD -> 0x0262 }
            byte[] r17 = r1.A04()     // Catch:{ 1bD -> 0x0262 }
            X.1Ww r1 = r10.A03     // Catch:{ 1bD -> 0x025a, InterruptedException -> 0x0257 }
            byte[] r16 = r1.A04()     // Catch:{ 1bD -> 0x025a, InterruptedException -> 0x0257 }
            java.lang.String r12 = r10.A04     // Catch:{ 1bD -> 0x0255, InterruptedException -> 0x0251 }
            if (r19 == 0) goto L_0x023c
            com.whatsapp.jid.UserJid r26 = r19.getUserJid()     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            if (r26 == 0) goto L_0x023c
            int r1 = r10.A00     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            r2 = 4
            r1 = r1 & 4
            boolean r1 = X.AnonymousClass000.A1R(r1, r2)
            r11 = 0
            if (r1 == 0) goto L_0x01ec
            goto L_0x01ee
        L_0x01ec:
            r2 = r15
            goto L_0x01fc
        L_0x01ee:
            X.1Ww r1 = r10.A03     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            if (r1 == 0) goto L_0x01ec
            java.nio.charset.Charset r9 = X.C28601Wt.A03     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            int r2 = r1.A03()     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            if (r2 != 0) goto L_0x022a
            java.lang.String r2 = ""
        L_0x01fc:
            int r1 = r10.A00     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            r1 = r1 & 2
            if (r1 != r4) goto L_0x0204
            java.lang.String r11 = r10.A04     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
        L_0x0204:
            java.lang.String r29 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            if (r1 != 0) goto L_0x023c
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            if (r1 != 0) goto L_0x023c
            X.AnonymousClass00B.A06(r2)     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            long r31 = java.lang.System.currentTimeMillis()     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            r30 = -1
            X.21V r1 = new X.21V     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            r25 = r1
            r27 = r2
            r28 = r11
            r25.<init>(r26, r27, r28, r29, r30, r31)     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            goto L_0x0241
        L_0x022a:
            X.1Wu r1 = (X.C28611Wu) r1     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            byte[] r8 = r1.bytes     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            int r7 = r1.A05()     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            int r1 = r1.A03()     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            java.lang.String r2 = new java.lang.String     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            r2.<init>(r8, r7, r1, r9)     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            goto L_0x01fc
        L_0x023c:
            X.2Ip r1 = new X.2Ip     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            r1.<init>()     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
        L_0x0241:
            r15 = r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            r6.A00 = r2     // Catch:{ 1bD -> 0x024c, InterruptedException -> 0x0248 }
            goto L_0x0386
        L_0x0248:
            r2 = move-exception
            r1 = r15
            goto L_0x030f
        L_0x024c:
            r8 = move-exception
            r1 = r15
            r15 = r17
            goto L_0x0267
        L_0x0251:
            r2 = move-exception
            r12 = r15
            goto L_0x0301
        L_0x0255:
            r8 = move-exception
            goto L_0x025d
        L_0x0257:
            r2 = move-exception
            goto L_0x02fe
        L_0x025a:
            r8 = move-exception
            r16 = r15
        L_0x025d:
            r12 = r15
            r15 = r17
            r1 = r12
            goto L_0x0267
        L_0x0262:
            r8 = move-exception
            r1 = r15
            r16 = r15
            r12 = r15
        L_0x0267:
            java.lang.String r7 = "plaintext does not represent a valid protocol buffer"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ InterruptedException -> 0x030c }
            r2.<init>(r7, r8)     // Catch:{ InterruptedException -> 0x030c }
            throw r2     // Catch:{ InterruptedException -> 0x030c }
        L_0x026f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ InterruptedException -> 0x02fb }
            java.lang.String r1 = "voip/encryption/decryptCallPayload/failed_to_decrypt_e2e_key. status="
            r2.append(r1)     // Catch:{ InterruptedException -> 0x02fb }
            r2.append(r7)     // Catch:{ InterruptedException -> 0x02fb }
            X.C13680ns.A1V(r2)     // Catch:{ InterruptedException -> 0x02fb }
            r1 = -1008(0xfffffffffffffc10, float:NaN)
            if (r7 != r1) goto L_0x028b
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InterruptedException -> 0x02fb }
            r6.A05 = r1     // Catch:{ InterruptedException -> 0x02fb }
            goto L_0x02db
        L_0x028b:
            r1 = -1003(0xfffffffffffffc15, float:NaN)
            if (r7 != r1) goto L_0x0296
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)     // Catch:{ InterruptedException -> 0x02fb }
            r6.A05 = r1     // Catch:{ InterruptedException -> 0x02fb }
            goto L_0x02db
        L_0x0296:
            r1 = -1010(0xfffffffffffffc0e, float:NaN)
            r2 = 4
            if (r7 != r1) goto L_0x02ab
            java.lang.String r1 = "voip/encryption/decryptCallPayload/bad identity"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ InterruptedException -> 0x02fb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ InterruptedException -> 0x02fb }
            android.util.Pair r1 = X.C13690nt.A0I(r1, r15)     // Catch:{ InterruptedException -> 0x02fb }
            goto L_0x0362
        L_0x02ab:
            r1 = -1002(0xfffffffffffffc16, float:NaN)
            if (r7 != r1) goto L_0x02b6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ InterruptedException -> 0x02fb }
            r6.A05 = r1     // Catch:{ InterruptedException -> 0x02fb }
            goto L_0x02db
        L_0x02b6:
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            if (r7 != r1) goto L_0x02ca
            java.lang.String r1 = "voip/encryption/decryptCallPayload/duplicated e2e keys"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ InterruptedException -> 0x02fb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ InterruptedException -> 0x02fb }
            android.util.Pair r1 = X.C13690nt.A0I(r1, r15)     // Catch:{ InterruptedException -> 0x02fb }
            goto L_0x0362
        L_0x02ca:
            r1 = -1007(0xfffffffffffffc11, float:NaN)
            if (r7 != r1) goto L_0x02d5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ InterruptedException -> 0x02fb }
            r6.A05 = r1     // Catch:{ InterruptedException -> 0x02fb }
            goto L_0x02db
        L_0x02d5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r39)     // Catch:{ InterruptedException -> 0x02fb }
            r6.A05 = r1     // Catch:{ InterruptedException -> 0x02fb }
        L_0x02db:
            r1 = r15
            r16 = r15
            r12 = r15
            goto L_0x0319
        L_0x02e0:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ InterruptedException -> 0x02fb }
            boolean r1 = r2 instanceof java.lang.Error     // Catch:{ InterruptedException -> 0x02fb }
            if (r1 == 0) goto L_0x02ea
            throw r2     // Catch:{ InterruptedException -> 0x02fb }
        L_0x02ea:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ InterruptedException -> 0x02fb }
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x02fb }
            throw r1     // Catch:{ InterruptedException -> 0x02fb }
        L_0x02f0:
            java.lang.String r1 = "invalid ciphertext version; ciphertextVersion="
            java.lang.String r1 = X.C13680ns.A0c(r2, r1)     // Catch:{ InterruptedException -> 0x02fb }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0T(r1)     // Catch:{ InterruptedException -> 0x02fb }
            throw r1     // Catch:{ InterruptedException -> 0x02fb }
        L_0x02fb:
            r2 = move-exception
            r17 = r15
        L_0x02fe:
            r16 = r15
            r12 = r15
        L_0x0301:
            r15 = r0
            r1 = r12
            goto L_0x0310
        L_0x0304:
            r2 = move-exception
            r1 = r15
            r17 = r15
            r16 = r15
            r12 = r15
            goto L_0x0310
        L_0x030c:
            r2 = move-exception
            r17 = r15
        L_0x030f:
            r15 = r0
        L_0x0310:
            java.lang.String r0 = "voip/encryption/decryptCallPayload/failed_to_decrypt_e2e_key: "
            com.whatsapp.util.Log.i(r0, r2)
            r0 = r15
            r15 = r17
        L_0x0319:
            r9 = 1
            if (r0 != 0) goto L_0x0389
            java.lang.String r0 = "voip/encryption/decryptCallPayload got null e2e message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.A00 = r0
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A05 = r0
        L_0x032e:
            java.lang.Boolean r0 = r6.A00
            boolean r4 = r0.booleanValue()
            r0 = r35
            X.0t9 r2 = r0.A0I
            if (r4 == 0) goto L_0x037d
            r2.A06(r6)
        L_0x033d:
            if (r9 == 0) goto L_0x037a
            r0 = r35
            X.16P r0 = r0.A09
            com.facebook.redex.RunnableRunnableShape1S1201000_I1 r2 = new com.facebook.redex.RunnableRunnableShape1S1201000_I1
            r34 = r2
            r36 = r22
            r38 = r24
            r34.<init>(r35, r36, r37, r38, r39)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.submit(r2)
        L_0x0353:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            X.4M1 r2 = new X.4M1
            r0 = r16
            r2.<init>(r1, r12, r15, r0)
            android.util.Pair r1 = X.C13690nt.A0I(r3, r2)
        L_0x0362:
            java.lang.Object r0 = r1.first
            int r25 = X.AnonymousClass000.A0D(r0)
            if (r25 == 0) goto L_0x03f1
            r19 = 0
            r21 = r19
            r22 = r19
            r23 = r19
            X.4aL r18 = new X.4aL
            r20 = r19
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            return r18
        L_0x037a:
            r18 = 0
            goto L_0x0353
        L_0x037d:
            X.00F r0 = new X.00F
            r0.<init>(r3, r3)
            r2.A0B(r6, r0, r3)
            goto L_0x033d
        L_0x0386:
            r15 = r17
            r9 = 0
        L_0x0389:
            int r8 = r0.A00
            if (r8 != 0) goto L_0x03c8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r39)
        L_0x0391:
            r6.A03 = r2
        L_0x0393:
            int r7 = r0.A01
            if (r7 != r4) goto L_0x03a6
            r7 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r6.A0B = r0
        L_0x039f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r39)
            r6.A04 = r0
            goto L_0x032e
        L_0x03a6:
            java.lang.String r0 = "voip/encryption/decryptCallPayload doesn't know how to handle the ciphertext version received: callId="
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r0 = r34
            r2.append(r0)
            java.lang.String r0 = " v="
            java.lang.String r0 = X.C13680ns.A0i(r0, r2, r7)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.A00 = r0
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A05 = r0
            goto L_0x039f
        L_0x03c8:
            if (r8 != r3) goto L_0x03cf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x0391
        L_0x03cf:
            java.lang.String r2 = "voip/encryption/decryptCallPayload unrecognized ciphertext type; callId="
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0r(r2)
            r2 = r34
            r7.append(r2)
            java.lang.String r2 = " type="
            java.lang.String r2 = X.C13680ns.A0i(r2, r7, r8)
            com.whatsapp.util.Log.w((java.lang.String) r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r6.A00 = r2
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.A05 = r2
            goto L_0x0393
        L_0x03f1:
            java.lang.Object r0 = r1.second
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            byte[] r1 = r0.A02
            byte[] r4 = r0.A03
            java.lang.String r3 = r0.A01
            X.21U r6 = r0.A00
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r2 = new com.whatsapp.protocol.VoipStanzaChildNode$Builder
            r0 = r20
            r2.<init>(r0)
            r2.setData(r1)
            com.whatsapp.protocol.VoipStanzaChildNode r7 = r2.build()
            r8 = 1
        L_0x040c:
            r0 = r21
            r0.addChild(r7)
            goto L_0x009d
        L_0x0413:
            java.lang.String r0 = "voip/encryption/decrypt-stanza bad cipher version: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = ", message.id="
            goto L_0x0013
        L_0x0421:
            java.lang.String r0 = "voip/encryption/decrypt-stanza fail to parse enc node, message.id="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r5.A03
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4aL r0 = X.C88344aL.A07
            return r0
        L_0x0434:
            if (r8 == 0) goto L_0x043a
            com.whatsapp.protocol.VoipStanzaChildNode r23 = r21.build()
        L_0x043a:
            r12 = 0
            X.4aL r18 = new X.4aL
            r5 = r18
            r7 = r23
            r8 = r3
            r9 = r1
            r10 = r4
            r11 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39S.A00(X.3x7):X.4aL");
    }

    public boolean A01(DeviceJid deviceJid, String str, byte[] bArr, int i2) {
        if (i2 < 0 || i2 > 4) {
            Log.i(C13680ns.A0c(i2, "voip/receive_message/onPeerE2EDecryptionFailed do nothing for retry count: "));
        } else if (bArr == null || bArr.length != 4) {
            Log.i(AnonymousClass000.A0h(Arrays.toString(bArr), AnonymousClass000.A0r("voip/receive_message/onPeerE2EDecryptionFailed e2e decryption failure; invalid remote remoteRegBytes id; remoteRegistrationId=")));
            return false;
        } else {
            int A002 = C28641Wx.A00(bArr);
            StringBuilder A0r = AnonymousClass000.A0r("voip/receive_message/onPeerE2EDecryptionFailed peer e2e decryption failure; remoteRegistrationId=");
            A0r.append(A002);
            A0r.append(" retryCount: ");
            A0r.append(i2);
            A0r.append(" from: ");
            A0r.append(deviceJid);
            C13680ns.A1V(A0r);
            try {
                AnonymousClass16P r0 = this.A09;
                DeviceJid deviceJid2 = (DeviceJid) r0.A00.submit(new C63413Ib(this, deviceJid, str, A002, i2)).get();
                if (deviceJid2 != null) {
                    this.A04.A00(deviceJid2);
                    return true;
                }
            } catch (InterruptedException | ExecutionException e2) {
                Log.i("voip/receive_message/onPeerE2EDecryptionFailed session retry threw: ", e2);
                return false;
            }
        }
        return true;
    }
}
