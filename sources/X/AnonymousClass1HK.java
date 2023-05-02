package X;

import com.facebook.redex.RunnableRunnableShape0S0301000_I0;
import java.util.Map;

/* renamed from: X.1HK  reason: invalid class name */
public class AnonymousClass1HK {
    public final C16300so A00;
    public final C16040sK A01;
    public final C18020w1 A02;
    public final C16440t3 A03;
    public final AnonymousClass126 A04;
    public final C16820th A05;
    public final C18910xS A06;
    public final C15810rt A07;
    public final C16460t6 A08;
    public final AnonymousClass17E A09;
    public final C16900tq A0A;
    public final C216414w A0B;
    public final AnonymousClass16V A0C;
    public final AnonymousClass1HF A0D;
    public final AnonymousClass180 A0E;
    public final C218615s A0F;
    public final C19790z0 A0G;
    public final C222517f A0H;
    public final AnonymousClass124 A0I;
    public final C14770pj A0J;
    public final C26941Pv A0K;
    public final Map A0L;

    public AnonymousClass1HK(C16300so r2, C16040sK r3, C18020w1 r4, C16440t3 r5, AnonymousClass126 r6, C16820th r7, C18910xS r8, C15810rt r9, C16460t6 r10, AnonymousClass17E r11, AnonymousClass17H r12, C16900tq r13, C216414w r14, AnonymousClass16V r15, AnonymousClass1HF r16, AnonymousClass180 r17, C218615s r18, C19790z0 r19, C222517f r20, AnonymousClass124 r21, C14770pj r22, C26941Pv r23) {
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = r9;
        this.A06 = r8;
        this.A0I = r21;
        this.A0H = r20;
        this.A0K = r23;
        this.A09 = r11;
        this.A02 = r4;
        this.A0D = r16;
        this.A08 = r10;
        this.A0G = r19;
        this.A04 = r6;
        this.A05 = r7;
        this.A0F = r18;
        this.A0A = r13;
        this.A0J = r22;
        this.A0B = r14;
        this.A0C = r15;
        this.A0E = r17;
        this.A0L = r12.A02;
        r10.A00 = this;
    }

    public static boolean A00(C28381Vw r0, int i2) {
        if (!r0.A02) {
            return i2 == 13 || i2 == 16 || i2 == 17;
        }
        return false;
    }

    public void A01(AnonymousClass2C0 r9, C28381Vw r10, int i2) {
        this.A04.A01(new RunnableRunnableShape0S0301000_I0(this, r10, r9, i2, 7), 36);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x018b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.util.List r21) {
        /*
            r20 = this;
            r10 = r20
            X.126 r0 = r10.A04
            r0.A00()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Iterator r6 = r21.iterator()
        L_0x0010:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r2 = r6.next()
            X.1Vw r2 = (X.C28381Vw) r2
            X.0rv r1 = r2.A00
            X.AnonymousClass00B.A06(r1)
            X.0th r0 = r10.A05
            X.0tZ r5 = r0.A03(r2)
            if (r5 == 0) goto L_0x0010
            boolean r0 = X.C16030sJ.A0Q(r1)
            if (r0 == 0) goto L_0x004f
            X.1Pv r4 = r10.A0K
            X.128 r1 = r4.A03
            X.0rv r0 = r5.A0B()
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            java.util.List r3 = r1.A01(r0)
            X.126 r2 = r4.A02
            r0 = 10
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r1 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r1.<init>(r4, r3, r5, r0)
            r0 = 51
            r2.A01(r1, r0)
            goto L_0x0010
        L_0x004f:
            java.lang.Object r0 = r11.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x005f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.put(r1, r0)
        L_0x005f:
            r0.add(r5)
            goto L_0x0010
        L_0x0063:
            java.util.Set r0 = r11.entrySet()
            java.util.Iterator r19 = r0.iterator()
        L_0x006b:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0191
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getKey()
            X.0rv r9 = (X.C15830rv) r9
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            r8 = 20
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r8)
            java.util.Collections.sort(r1, r0)
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r7 = r1.get(r0)
            X.0tZ r7 = (X.C16740tZ) r7
            X.0xS r6 = r10.A06
            long r4 = r7.A13
            long r2 = r7.A14
            X.126 r0 = r6.A07
            r0.A00()
            X.0rt r0 = r6.A0A
            X.0rx r12 = r0.A06(r9)
            if (r12 != 0) goto L_0x00c6
            java.lang.String r0 = "msgstore/setchatseenonasynccommitthread/nochat/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
        L_0x00b6:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00bd:
            X.0pj r0 = r10.A0J
            r0.A0A(r9, r7)
            r0.A09(r9)
            goto L_0x006b
        L_0x00c6:
            java.lang.String r14 = "msgstore/setchatseenonasynccommitthread/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r14)
            r1.append(r9)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = r12.A07()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r12.A0O
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 < 0) goto L_0x00fa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r9)
            java.lang.String r0 = "/message already read"
            r1.append(r0)
            goto L_0x00b6
        L_0x00fa:
            X.15B r13 = r6.A0I
            X.0tq r0 = r13.A04
            X.0tf r18 = r0.get()
            r0 = r18
            X.0tg r14 = r0.A02     // Catch:{ all -> 0x018c }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ? AND (message_type != '7') AND from_me = 0"
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x018c }
            X.0ts r15 = r13.A01     // Catch:{ all -> 0x018c }
            long r15 = r15.A02(r9)     // Catch:{ all -> 0x018c }
            java.lang.String r16 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x018c }
            r15 = 0
            r0[r15] = r16     // Catch:{ all -> 0x018c }
            r17 = 1
            java.lang.String r16 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x018c }
            r0[r17] = r16     // Catch:{ all -> 0x018c }
            android.database.Cursor r1 = r14.A08(r1, r0)     // Catch:{ all -> 0x018c }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0185 }
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0185 }
            int r15 = r1.getInt(r0)     // Catch:{ all -> 0x0185 }
            goto L_0x0149
        L_0x0135:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0185 }
            r14.<init>()     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = "msgstore/getnewercount/db no message for "
            r14.append(r0)     // Catch:{ all -> 0x0185 }
            r14.append(r9)     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x0185 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0185 }
        L_0x0149:
            r1.close()     // Catch:{ all -> 0x018c }
            r18.close()
            int r14 = r13.A01(r9, r2)
            X.1Pr r0 = r6.A0D
            int r13 = r0.A00(r9, r2)
            int r1 = r15 - r14
            int r0 = r12.A06
            if (r1 >= r0) goto L_0x00bd
            r12.A0C(r1, r14, r15, r13)
            r12.A0N = r4
            r12.A0O = r2
            X.0z0 r0 = r6.A0Q
            boolean r0 = r0.A01(r9)
            if (r0 == 0) goto L_0x0172
            r12.A0P = r4
            r12.A0Q = r2
        L_0x0172:
            X.0ts r0 = r6.A09
            r0.A0C(r12)
            X.17E r0 = r6.A0C
            android.os.Handler r1 = r0.A02
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r6, r8, r9)
            r1.post(r0)
            goto L_0x00bd
        L_0x0185:
            r0 = move-exception
            if (r1 == 0) goto L_0x018b
            r1.close()     // Catch:{ all -> 0x018b }
        L_0x018b:
            throw r0     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x0190 }
        L_0x0190:
            throw r0
        L_0x0191:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x019c
            X.0pj r0 = r10.A0J
            r0.A08()
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HK.A02(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r9 == 8) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.AnonymousClass2C0 r7, X.C28381Vw r8, int r9) {
        /*
            r6 = this;
            X.126 r0 = r6.A04
            r0.A00()
            X.0th r0 = r6.A05
            X.0tZ r5 = r0.A03(r8)
            r3 = 0
            if (r5 != 0) goto L_0x0020
            java.lang.String r0 = "msgstore/update/nosuchmessage: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r8)
        L_0x0018:
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r3
        L_0x0020:
            int r0 = r5.A0C
            boolean r0 = X.C42881yp.A02(r0, r9)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "msgstore/update/statusdowngrade: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r8)
            java.lang.String r0 = " current:"
            r2.append(r0)
            int r0 = r5.A0C
            r2.append(r0)
            java.lang.String r0 = " new:"
            r2.append(r0)
            r2.append(r9)
            goto L_0x0018
        L_0x0045:
            r0 = 9
            if (r9 == r0) goto L_0x0052
            r0 = 10
            if (r9 == r0) goto L_0x0052
            r0 = 8
            r2 = 0
            if (r9 != r0) goto L_0x0079
        L_0x0052:
            r2 = 1
            byte r1 = r5.A10
            r0 = 2
            if (r1 != r0) goto L_0x005c
            int r0 = r5.A08
            if (r0 == r2) goto L_0x0079
        L_0x005c:
            boolean r0 = X.C30921dB.A00(r1)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "msgstore/update/status-played-non-ptt or view-once: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r8)
            java.lang.String r0 = " type="
            r2.append(r0)
            java.lang.String r0 = X.C38621r6.A0H(r1)
            r2.append(r0)
            goto L_0x0018
        L_0x0079:
            r5.A0W(r9)
            if (r2 == 0) goto L_0x0083
            X.180 r0 = r6.A0E
            r0.A02(r5)
        L_0x0083:
            long r2 = r5.A0I
            r0 = 4
            if (r9 != r0) goto L_0x009e
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.lang.String r3 = "msgstore/update/receipt/server/delay "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x009e:
            r0 = 11
            r1 = -1
            if (r9 == r0) goto L_0x00b4
            r0 = 12
            if (r9 == r0) goto L_0x00b4
            r0 = 16
            if (r9 == r0) goto L_0x00b4
            r0 = 17
            if (r9 == r0) goto L_0x00b4
            X.17E r0 = r6.A09
            r0.A00(r5, r1)
        L_0x00b4:
            X.0t6 r0 = r6.A08
            boolean r0 = r0.A0y(r5, r1)
            if (r0 == 0) goto L_0x00dc
            if (r7 == 0) goto L_0x00dc
            X.0yD r1 = r7.A00
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x00dc
            X.124 r4 = r1.A0f
            r3 = 0
            X.15s r0 = r4.A03
            X.0pd r2 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00de
            java.util.Set r0 = java.util.Collections.singleton(r5)
            r4.A05(r0, r3)
        L_0x00dc:
            r0 = 1
            return r0
        L_0x00de:
            X.0xb r1 = r4.A00
            com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob r0 = new com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob
            r0.<init>(r5)
            r1.A00(r0)
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HK.A03(X.2C0, X.1Vw, int):boolean");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r1.A04(r34) < r9.A13) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c7, code lost:
        if (r8 == 13) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x025b, code lost:
        if (r32 != false) goto L_0x025d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x03e3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x03e8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:210:0x0565 */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0470 A[Catch:{ all -> 0x0561 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x048c A[Catch:{ all -> 0x0561 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x048f A[Catch:{ all -> 0x0561 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0499 A[Catch:{ all -> 0x0561 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04ce A[Catch:{ all -> 0x0561 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x048a A[EDGE_INSN: B:218:0x048a->B:180:0x048a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020b A[Catch:{ all -> 0x0561 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(com.whatsapp.jid.DeviceJid r36, X.C16740tZ r37, int r38, long r39) {
        /*
            r35 = this;
            r8 = r38
            boolean r0 = X.C42881yp.A01(r8)
            X.AnonymousClass00B.A0F(r0)
            r11 = r36
            com.whatsapp.jid.UserJid r7 = r11.getUserJid()
            r9 = r37
            X.1Vw r6 = r9.A11
            r16 = 0
            r1 = 0
            r3 = r39
            int r0 = (r39 > r1 ? 1 : (r39 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0037
            java.lang.String r0 = "msgstore/updatetargetstatus/invalidtimestamp: key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = ", timestamp="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return r16
        L_0x0037:
            r5 = r35
            X.0z0 r1 = r5.A0G
            X.0rv r0 = r6.A00
            r34 = r0
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0060
            r0 = 13
            if (r8 == r0) goto L_0x005f
            r0 = 8
            if (r8 != r0) goto L_0x0060
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0060
            X.15s r0 = r5.A0F
            X.0pd r2 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0060
        L_0x005f:
            r8 = 5
        L_0x0060:
            boolean r12 = r6.A02
            r10 = 0
            if (r12 != 0) goto L_0x009a
            X.0sK r0 = r5.A01
            boolean r0 = X.C38621r6.A0T(r0, r9)
            if (r0 != 0) goto L_0x009a
            r0 = 8
            if (r8 == r0) goto L_0x007c
            r0 = 13
            r7 = 16
            if (r8 == r0) goto L_0x007e
            r7 = 17
            if (r8 == r7) goto L_0x007e
            return r16
        L_0x007c:
            r7 = 10
        L_0x007e:
            boolean r0 = A00(r6, r7)
            if (r0 == 0) goto L_0x0095
            X.0rt r1 = r5.A07
            X.AnonymousClass00B.A06(r34)
            r0 = r34
            long r3 = r1.A04(r0)
            long r1 = r9.A13
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
        L_0x0095:
            boolean r0 = r5.A03(r10, r6, r7)
            return r0
        L_0x009a:
            int r1 = r9.A0C
            r0 = 6
            if (r1 != r0) goto L_0x00b1
            java.lang.String r1 = "msgstore/updatetargetstatus/invalidmessage: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r16
        L_0x00b1:
            r0 = 15
            if (r8 == r0) goto L_0x00c4
            r0 = 5
            if (r8 != r0) goto L_0x00ca
            X.0sK r1 = r5.A01
            com.whatsapp.jid.UserJid r0 = r11.getUserJid()
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x00ca
        L_0x00c4:
            X.16V r0 = r5.A0C
            r0.A01(r11, r9, r3)
            return r16
        L_0x00ca:
            boolean r33 = X.C16030sJ.A0L(r34)
            boolean r32 = X.C16030sJ.A0Q(r34)
            boolean r31 = X.C16030sJ.A0G(r34)
            boolean r30 = X.C16030sJ.A0H(r34)
            java.lang.String r29 = " new:"
            java.lang.String r28 = " current:"
            java.lang.String r2 = "msgstore/updatetargetstatus/statusdowngrade: "
            if (r32 != 0) goto L_0x016c
            if (r31 == 0) goto L_0x012c
            X.0th r10 = r5.A05
            X.AnonymousClass00B.A06(r7)
            java.lang.String r1 = r6.A01
            X.1Vw r0 = new X.1Vw
            r0.<init>(r7, r1, r12)
            X.0tZ r10 = r10.A03(r0)
            if (r10 != 0) goto L_0x0111
            java.lang.String r0 = "msgstore/updatetargetstatus/nosuchmessage for broadcast: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r6)
            java.lang.String r0 = " "
            r3.append(r0)
            r3.append(r11)
        L_0x0108:
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x010f:
            r0 = 0
            return r0
        L_0x0111:
            int r0 = r10.A0C
            boolean r0 = X.C42881yp.A02(r0, r8)
            if (r0 == 0) goto L_0x0163
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            r0 = r28
            r3.append(r0)
            int r1 = r10.A0C
            goto L_0x01a3
        L_0x012c:
            if (r33 != 0) goto L_0x016c
            int r10 = r9.A0C
            boolean r0 = X.C42881yp.A02(r10, r8)
            if (r0 == 0) goto L_0x01b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r6)
            r0 = r28
            r1.append(r0)
            int r0 = r9.A0C
            r1.append(r0)
            r0 = r29
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.16V r0 = r5.A0C
            X.AnonymousClass00B.A06(r11)
            r0.A01(r11, r9, r3)
            goto L_0x010f
        L_0x0163:
            r10.A0W(r8)
            X.17E r1 = r5.A09
            r0 = -1
            r1.A00(r10, r0)
        L_0x016c:
            r10 = 1
            if (r33 != 0) goto L_0x0171
            if (r32 == 0) goto L_0x01fd
        L_0x0171:
            X.1HF r0 = r5.A0D
            X.21M r0 = r0.A00(r9)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r7)
            X.21N r0 = (X.AnonymousClass21N) r0
            if (r0 == 0) goto L_0x01fd
            int r1 = r0.A00()
            boolean r0 = X.C42881yp.A02(r1, r8)
            if (r0 == 0) goto L_0x01fd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            java.lang.String r0 = " remoteUser:"
            r3.append(r0)
            r3.append(r7)
            r0 = r28
            r3.append(r0)
        L_0x01a3:
            r3.append(r1)
            r0 = r29
            r3.append(r0)
            r3.append(r8)
            goto L_0x0108
        L_0x01b0:
            r9.A0W(r8)
            X.17E r1 = r5.A09
            r0 = -1
            r1.A00(r9, r0)
            X.0sK r0 = r5.A01
            boolean r0 = r0.A0J(r11)
            if (r0 != 0) goto L_0x016c
            r0 = 5
            if (r8 == r0) goto L_0x01c9
            r0 = 13
            r1 = 0
            if (r8 != r0) goto L_0x01ca
        L_0x01c9:
            r1 = 1
        L_0x01ca:
            r0 = 4
            if (r10 != r0) goto L_0x016c
            if (r1 == 0) goto L_0x016c
            X.0t3 r0 = r5.A03
            long r12 = r0.A00()
            long r0 = r9.A0I
            long r12 = r12 - r0
            X.0w1 r2 = r5.A02
            r10 = 1
            X.2C1 r1 = new X.2C1
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r1.A02 = r0
            X.0w2 r0 = r2.A09
            int r0 = X.C18020w1.A02(r0, r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.A01 = r0
            X.0t9 r0 = r2.A0C
            r0.A06(r1)
        L_0x01fd:
            X.0tq r0 = r5.A0A
            X.0tf r27 = r0.A02()
            X.1cj r26 = r27.A00()     // Catch:{ all -> 0x0566 }
            boolean r0 = r9.A15     // Catch:{ all -> 0x0561 }
            if (r0 != 0) goto L_0x024f
            X.1HF r2 = r5.A0D     // Catch:{ all -> 0x0561 }
            java.util.Set r0 = r2.A08     // Catch:{ all -> 0x0561 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x0561 }
            if (r0 != 0) goto L_0x024f
            java.lang.String r0 = "receiptmanager/addMessageReceipt: key="
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0561 }
            r12.<init>(r0)     // Catch:{ all -> 0x0561 }
            r12.append(r6)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = ", remoteDevice="
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            r12.append(r11)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = ", status="
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            r12.append(r8)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = ", ts="
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            r12.append(r3)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = ", rowId="
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            long r0 = r9.A13     // Catch:{ all -> 0x0561 }
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0561 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0561 }
            long r24 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0561 }
            if (r33 != 0) goto L_0x025d
            goto L_0x025a
        L_0x024f:
            r26.A00()     // Catch:{ all -> 0x0561 }
            r26.close()     // Catch:{ all -> 0x0566 }
            r27.close()
            goto L_0x010f
        L_0x025a:
            r14 = 0
            if (r32 == 0) goto L_0x025e
        L_0x025d:
            r14 = 1
        L_0x025e:
            X.16V r0 = r2.A05     // Catch:{ all -> 0x0561 }
            r0.A01(r11, r9, r3)     // Catch:{ all -> 0x0561 }
            com.whatsapp.jid.UserJid r11 = r11.getUserJid()     // Catch:{ all -> 0x0561 }
            X.1Pq r12 = r2.A06     // Catch:{ all -> 0x0561 }
            long r0 = r9.A13     // Catch:{ all -> 0x0561 }
            r17 = r12
            r18 = r11
            r19 = r8
            r20 = r0
            r22 = r3
            r17.A01(r18, r19, r20, r22)     // Catch:{ all -> 0x0561 }
            if (r31 == 0) goto L_0x0295
            X.0t6 r13 = r2.A02     // Catch:{ all -> 0x0561 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x0561 }
            X.1Vw r1 = new X.1Vw     // Catch:{ all -> 0x0561 }
            r1.<init>(r11, r0, r10)     // Catch:{ all -> 0x0561 }
            X.0th r0 = r13.A0K     // Catch:{ all -> 0x0561 }
            X.0tZ r0 = r0.A03(r1)     // Catch:{ all -> 0x0561 }
            if (r0 == 0) goto L_0x0295
            long r0 = r0.A13     // Catch:{ all -> 0x0561 }
            r20 = r0
            r17.A01(r18, r19, r20, r22)     // Catch:{ all -> 0x0561 }
        L_0x0295:
            if (r14 != 0) goto L_0x029c
            if (r31 != 0) goto L_0x029c
        L_0x0299:
            r1 = 0
            goto L_0x040d
        L_0x029c:
            X.11I r12 = r12.A03     // Catch:{ all -> 0x0561 }
            java.lang.String r1 = "receipt_user_ready"
            r0 = 0
            int r0 = r12.A00(r1, r0)     // Catch:{ all -> 0x0561 }
            r1 = 2
            if (r0 != r1) goto L_0x02bf
            X.15t r0 = r2.A07     // Catch:{ all -> 0x0561 }
            if (r14 == 0) goto L_0x02ba
            X.21M r0 = r0.A01(r6)     // Catch:{ all -> 0x0561 }
        L_0x02b0:
            X.AnonymousClass00B.A06(r11)     // Catch:{ all -> 0x0561 }
            boolean r0 = r0.A00(r11, r8, r3)     // Catch:{ all -> 0x0561 }
            if (r0 == 0) goto L_0x0299
            goto L_0x02c4
        L_0x02ba:
            X.21M r0 = r0.A00(r9)     // Catch:{ all -> 0x0561 }
            goto L_0x02b0
        L_0x02bf:
            X.21M r0 = r2.A00(r9)     // Catch:{ all -> 0x0561 }
            goto L_0x02b0
        L_0x02c4:
            if (r14 == 0) goto L_0x03f3
            X.15t r12 = r2.A07     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "receiptmessagestore/writeReceipt/key="
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0561 }
            r13.<init>(r0)     // Catch:{ all -> 0x0561 }
            r13.append(r6)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "; status="
            r13.append(r0)     // Catch:{ all -> 0x0561 }
            r13.append(r8)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "; timestamp="
            r13.append(r0)     // Catch:{ all -> 0x0561 }
            r13.append(r3)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0561 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0561 }
            long r22 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0561 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x0561 }
            r13.<init>(r10)     // Catch:{ all -> 0x0561 }
            r0 = 5
            java.lang.String r21 = " "
            if (r8 == r0) goto L_0x032a
            r0 = 8
            if (r8 == r0) goto L_0x0331
            r0 = 13
            if (r8 != r0) goto L_0x0306
            java.lang.Long r14 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "read_device_timestamp"
            goto L_0x0337
        L_0x0306:
            java.lang.String r0 = "Unexpected status "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0561 }
            r1.<init>(r0)     // Catch:{ all -> 0x0561 }
            r1.append(r8)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = " for message "
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            r1.append(r6)     // Catch:{ all -> 0x0561 }
            r0 = r21
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            r1.append(r11)     // Catch:{ all -> 0x0561 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0561 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0561 }
            r0.<init>(r1)     // Catch:{ all -> 0x0561 }
            throw r0     // Catch:{ all -> 0x0561 }
        L_0x032a:
            java.lang.Long r14 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "receipt_device_timestamp"
            goto L_0x0337
        L_0x0331:
            java.lang.Long r14 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "played_device_timestamp"
        L_0x0337:
            r13.put(r0, r14)     // Catch:{ all -> 0x0561 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ all -> 0x0561 }
            java.lang.String r20 = r11.getRawString()     // Catch:{ all -> 0x0561 }
            X.AnonymousClass00B.A06(r34)     // Catch:{ all -> 0x0561 }
            java.lang.String r19 = r34.getRawString()     // Catch:{ all -> 0x0561 }
            r0 = 3
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ all -> 0x0561 }
            r15[r16] = r19     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x0561 }
            r16 = r0
            r15[r10] = r0     // Catch:{ all -> 0x0561 }
            r15[r1] = r20     // Catch:{ all -> 0x0561 }
            X.0tq r0 = r12.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x03e9 }
            X.0tf r18 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x03e9 }
            X.1cj r17 = r18.A00()     // Catch:{ all -> 0x03e4 }
            r0 = r18
            X.0tg r14 = r0.A02     // Catch:{ all -> 0x03df }
            java.lang.String r1 = "receipts"
            java.lang.String r0 = "key_remote_jid = ? AND key_id = ? AND remote_resource = ?"
            int r0 = r14.A00(r1, r13, r0, r15)     // Catch:{ all -> 0x03df }
            if (r0 != 0) goto L_0x03c8
            java.lang.String r15 = "key_remote_jid"
            r0 = r19
            r13.put(r15, r0)     // Catch:{ all -> 0x03df }
            java.lang.String r15 = "key_id"
            r0 = r16
            r13.put(r15, r0)     // Catch:{ all -> 0x03df }
            java.lang.String r15 = "remote_resource"
            r0 = r20
            r13.put(r15, r0)     // Catch:{ all -> 0x03df }
            long r15 = r14.A02(r13, r1)     // Catch:{ all -> 0x03df }
            r13 = -1
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x03c8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03df }
            r1.<init>()     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "msgstore/updatemessagetargetstatusinbackground/insert/failed "
            r1.append(r0)     // Catch:{ all -> 0x03df }
            r1.append(r6)     // Catch:{ all -> 0x03df }
            r0 = r21
            r1.append(r0)     // Catch:{ all -> 0x03df }
            r1.append(r11)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03df }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03df }
            X.0so r13 = r12.A00     // Catch:{ all -> 0x03df }
            java.lang.String r1 = "ReceiptsMessageStore: update or insert failed"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x03df }
            r14.<init>()     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "key="
            r14.append(r0)     // Catch:{ all -> 0x03df }
            r14.append(r6)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = " participant="
            r14.append(r0)     // Catch:{ all -> 0x03df }
            r14.append(r11)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x03df }
            r13.AcB(r1, r0, r10)     // Catch:{ all -> 0x03df }
        L_0x03c8:
            r17.A00()     // Catch:{ all -> 0x03df }
            X.0vN r13 = r12.A03     // Catch:{ all -> 0x03df }
            java.lang.String r11 = "ReceiptsMessageStore/writeReceipt"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03df }
            long r0 = r0 - r22
            r13.A00(r11, r0)     // Catch:{ all -> 0x03df }
            r17.close()     // Catch:{ all -> 0x03e4 }
            r18.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x03e9 }
            goto L_0x03ff
        L_0x03df:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x03e3 }
        L_0x03e3:
            throw r0     // Catch:{ all -> 0x03e4 }
        L_0x03e4:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x03e8 }
        L_0x03e8:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x03e9 }
        L_0x03e9:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0561 }
            X.0ym r0 = r12.A04     // Catch:{ all -> 0x0561 }
            r0.A02()     // Catch:{ all -> 0x0561 }
            goto L_0x03ff
        L_0x03f3:
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x0561 }
            X.1Vw r1 = new X.1Vw     // Catch:{ all -> 0x0561 }
            r1.<init>(r11, r0, r10)     // Catch:{ all -> 0x0561 }
            X.03L r0 = r2.A00     // Catch:{ all -> 0x0561 }
            r0.A03(r1)     // Catch:{ all -> 0x0561 }
        L_0x03ff:
            X.0vN r12 = r2.A03     // Catch:{ all -> 0x0561 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0561 }
            long r0 = r0 - r24
            java.lang.String r11 = "ReceiptManager/addMessageReceipt"
            r12.A00(r11, r0)     // Catch:{ all -> 0x0561 }
            r1 = 1
        L_0x040d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0561 }
            r12.<init>()     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "msgstore/updatetargetstatus/added="
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            r12.append(r1)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "; remoteChatJid="
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            r0 = r34
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "; status="
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            r12.append(r8)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "; key.id="
            r12.append(r0)     // Catch:{ all -> 0x0561 }
            java.lang.String r11 = r6.A01     // Catch:{ all -> 0x0561 }
            r12.append(r11)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0561 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0561 }
            if (r1 == 0) goto L_0x044b
            if (r30 == 0) goto L_0x044b
            X.0t6 r1 = r5.A08     // Catch:{ all -> 0x0561 }
            X.1Vw r0 = new X.1Vw     // Catch:{ all -> 0x0561 }
            r0.<init>(r7, r11, r10)     // Catch:{ all -> 0x0561 }
            r1.A0i(r0, r8, r3)     // Catch:{ all -> 0x0561 }
        L_0x044b:
            if (r33 != 0) goto L_0x0451
            if (r32 != 0) goto L_0x0451
            if (r31 == 0) goto L_0x0529
        L_0x0451:
            X.AnonymousClass00B.A0F(r10)     // Catch:{ all -> 0x0561 }
            X.21M r0 = r2.A00(r9)     // Catch:{ all -> 0x0561 }
            int r14 = r9.A0A     // Catch:{ all -> 0x0561 }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00     // Catch:{ all -> 0x0561 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0561 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0561 }
            r13 = 0
            r12 = 0
            r11 = 0
        L_0x0467:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x0561 }
            r8 = 13
            r15 = 5
            if (r1 == 0) goto L_0x048a
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x0561 }
            X.21N r0 = (X.AnonymousClass21N) r0     // Catch:{ all -> 0x0561 }
            int r1 = r0.A00()     // Catch:{ all -> 0x0561 }
            if (r1 == r15) goto L_0x0487
            r0 = 8
            if (r1 == r0) goto L_0x0483
            if (r1 == r8) goto L_0x0485
            goto L_0x0467
        L_0x0483:
            int r13 = r13 + 1
        L_0x0485:
            int r12 = r12 + 1
        L_0x0487:
            int r11 = r11 + 1
            goto L_0x0467
        L_0x048a:
            if (r13 < r14) goto L_0x048f
            r8 = 8
            goto L_0x0495
        L_0x048f:
            if (r12 >= r14) goto L_0x0495
            r8 = 4
            if (r11 < r14) goto L_0x0495
            r8 = 5
        L_0x0495:
            int r0 = r9.A0C     // Catch:{ all -> 0x0561 }
            if (r8 == r0) goto L_0x04ce
            int r0 = X.C42881yp.A00(r0, r8)     // Catch:{ all -> 0x0561 }
            if (r0 <= 0) goto L_0x0526
            X.21M r0 = r2.A00(r9)     // Catch:{ all -> 0x0561 }
            java.util.concurrent.ConcurrentHashMap r1 = r0.A00     // Catch:{ all -> 0x0561 }
            int r0 = r1.size()     // Catch:{ all -> 0x0561 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0561 }
            r2.<init>(r0)     // Catch:{ all -> 0x0561 }
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x0561 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0561 }
        L_0x04b6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0561 }
            if (r0 == 0) goto L_0x04d0
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0561 }
            X.21N r0 = (X.AnonymousClass21N) r0     // Catch:{ all -> 0x0561 }
            int r0 = r0.A00()     // Catch:{ all -> 0x0561 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0561 }
            r2.add(r0)     // Catch:{ all -> 0x0561 }
            goto L_0x04b6
        L_0x04ce:
            r10 = 0
            goto L_0x053f
        L_0x04d0:
            java.lang.String r0 = "MessageStatusStore/statusDowngrade: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0561 }
            r1.<init>(r0)     // Catch:{ all -> 0x0561 }
            r1.append(r6)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = " fMessage:"
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            int r0 = java.lang.System.identityHashCode(r9)     // Catch:{ all -> 0x0561 }
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = " remoteUser:"
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            r1.append(r7)     // Catch:{ all -> 0x0561 }
            r0 = r28
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            int r0 = r9.A0C     // Catch:{ all -> 0x0561 }
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            r0 = r29
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            r1.append(r8)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = " recipientCount:"
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            int r0 = r9.A0A     // Catch:{ all -> 0x0561 }
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = " statuses:"
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r2)     // Catch:{ all -> 0x0561 }
            r1.append(r0)     // Catch:{ all -> 0x0561 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0561 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0561 }
            X.0so r1 = r5.A00     // Catch:{ all -> 0x0561 }
            java.lang.String r0 = "MessageStatusStore/statusDowngrade"
            r1.AcB(r0, r2, r10)     // Catch:{ all -> 0x0561 }
        L_0x0526:
            r9.A0W(r8)     // Catch:{ all -> 0x0561 }
        L_0x0529:
            X.0t6 r0 = r5.A08     // Catch:{ all -> 0x0561 }
            r0.A0i(r6, r8, r3)     // Catch:{ all -> 0x0561 }
            X.180 r0 = r5.A0E     // Catch:{ all -> 0x0561 }
            r0.A02(r9)     // Catch:{ all -> 0x0561 }
            r0 = 39
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r1 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ all -> 0x0561 }
            r1.<init>(r5, r0, r9)     // Catch:{ all -> 0x0561 }
            r0 = r27
            r0.A03(r1)     // Catch:{ all -> 0x0561 }
        L_0x053f:
            r26.A00()     // Catch:{ all -> 0x0561 }
            r26.close()     // Catch:{ all -> 0x0566 }
            r27.close()
            if (r10 == 0) goto L_0x0559
            X.17E r0 = r5.A09
            android.os.Handler r3 = r0.A02
            r2 = 2
            r1 = -1
        L_0x0550:
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r3, r2, r1, r0, r9)
            r0.sendToTarget()
            return r10
        L_0x0559:
            r1 = -1
            X.17E r0 = r5.A09
            android.os.Handler r3 = r0.A02
            r2 = 10
            goto L_0x0550
        L_0x0561:
            r0 = move-exception
            r26.close()     // Catch:{ all -> 0x0565 }
        L_0x0565:
            throw r0     // Catch:{ all -> 0x0566 }
        L_0x0566:
            r0 = move-exception
            r27.close()     // Catch:{ all -> 0x056a }
        L_0x056a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HK.A04(com.whatsapp.jid.DeviceJid, X.0tZ, int, long):boolean");
    }
}
