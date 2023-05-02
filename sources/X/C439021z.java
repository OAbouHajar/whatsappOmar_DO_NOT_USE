package X;

import java.util.List;

/* renamed from: X.21z  reason: invalid class name and case insensitive filesystem */
public class C439021z {
    public static AnonymousClass220 A00(C33211iD r3) {
        if (r3.A0f()) {
            C59022uY r0 = r3.A0k;
            C59022uY r2 = r0;
            if (r0 == null) {
                r0 = C59022uY.A06;
            }
            if (r0.A01 == 5) {
                if (r2 == null) {
                    r2 = C59022uY.A06;
                }
                if (r2.A01 == 5) {
                    return (AnonymousClass220) r2.A04;
                }
                return AnonymousClass220.A07;
            }
        }
        AnonymousClass220 r02 = r3.A0O;
        if (r02 != null) {
            return r02;
        }
        return AnonymousClass220.A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (r4 == 2) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16740tZ A01(X.C15830rv r23, com.whatsapp.jid.UserJid r24, X.C59022uY r25, X.C222617g r26, java.lang.Long r27, java.lang.Long r28, java.lang.String r29, java.lang.String r30, int r31, int r32, long r33, boolean r35, boolean r36) {
        /*
            r7 = r25
            X.2uZ r3 = r7.A03
            if (r3 != 0) goto L_0x0008
            X.2uZ r3 = X.C59032uZ.A07
        L_0x0008:
            java.lang.String r12 = r3.A04
            int r0 = r3.A00
            r2 = 64
            r1 = r0 & 64
            r0 = 0
            if (r1 != r2) goto L_0x0014
            r0 = 1
        L_0x0014:
            r6 = 0
            if (r0 == 0) goto L_0x00ae
            java.lang.String r13 = r3.A05
        L_0x0019:
            int r1 = r3.A01
            r0 = 2
            if (r1 != r0) goto L_0x00ab
            java.lang.Object r11 = r3.A03
            java.lang.String r11 = (java.lang.String) r11
        L_0x0022:
            java.lang.String r15 = r3.A06
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1 = 0
        L_0x002a:
            X.1XE r0 = r3.A02
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00b1
            X.1XE r0 = r3.A02
            java.lang.Object r5 = r0.get(r1)
            X.2tg r5 = (X.C58552tg) r5
            int r4 = r5.A01
            r0 = 1
            if (r4 != r0) goto L_0x0094
            java.lang.Object r0 = r5.A03
            X.2tM r0 = (X.C58352tM) r0
            java.lang.String r4 = r0.A01
        L_0x0045:
            r0 = 50
            java.lang.String r17 = X.AnonymousClass1ZW.A05(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x0070
            int r4 = r5.A01
            r0 = 1
            if (r4 != r0) goto L_0x0073
            java.lang.Object r0 = r5.A03
            X.2tM r0 = (X.C58352tM) r0
            java.lang.String r5 = r0.A02
        L_0x005c:
            r19 = 1
        L_0x005e:
            r21 = 0
            X.1sy r0 = new X.1sy
            r22 = 0
            r16 = r0
            r18 = r5
            r20 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.add(r0)
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x002a
        L_0x0073:
            r0 = 2
            if (r4 != r0) goto L_0x007f
            java.lang.Object r0 = r5.A03
            X.2tN r0 = (X.C58362tN) r0
            java.lang.String r5 = r0.A02
        L_0x007c:
            r19 = 2
            goto L_0x005e
        L_0x007f:
            r0 = 3
            if (r4 != r0) goto L_0x0091
            java.lang.Object r0 = r5.A03
            X.2tL r0 = (X.C58342tL) r0
        L_0x0086:
            java.lang.String r5 = r0.A02
            r0 = 1
            if (r4 == r0) goto L_0x005c
            r0 = 2
            r19 = 3
            if (r4 != r0) goto L_0x005e
            goto L_0x007c
        L_0x0091:
            X.2tL r0 = X.C58342tL.A03
            goto L_0x0086
        L_0x0094:
            r0 = 2
            if (r4 != r0) goto L_0x009e
            java.lang.Object r0 = r5.A03
            X.2tN r0 = (X.C58362tN) r0
            java.lang.String r4 = r0.A01
            goto L_0x0045
        L_0x009e:
            r0 = 3
            if (r4 != r0) goto L_0x00a8
            java.lang.Object r0 = r5.A03
            X.2tL r0 = (X.C58342tL) r0
        L_0x00a5:
            java.lang.String r4 = r0.A01
            goto L_0x0045
        L_0x00a8:
            X.2tL r0 = X.C58342tL.A03
            goto L_0x00a5
        L_0x00ab:
            r11 = r6
            goto L_0x0022
        L_0x00ae:
            r13 = r6
            goto L_0x0019
        L_0x00b1:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00bf
            int r1 = r2.size()
            r0 = 5
            if (r1 <= r0) goto L_0x00c0
            return r6
        L_0x00bf:
            r2 = 0
        L_0x00c0:
            r5 = r23
            r23 = r36
            r6 = r24
            r8 = r26
            r9 = r27
            r10 = r28
            r14 = r29
            r16 = r30
            r18 = r31
            r19 = r32
            r20 = r33
            r22 = r35
            r17 = r2
            X.0tZ r0 = A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439021z.A01(X.0rv, com.whatsapp.jid.UserJid, X.2uY, X.17g, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, int, int, long, boolean, boolean):X.0tZ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0169, code lost:
        if (r6.A0c().A0c() == X.C800642k.A06) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01bc, code lost:
        if (r6.A0c().A0c() == X.C800642k.A04) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01be, code lost:
        r15 = (X.C38751rM) r2.A01(new X.C28381Vw(r9, r8, false), (byte) 30, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01ce, code lost:
        if (r6.A01 != 1) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d0, code lost:
        r2 = r6.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01d7, code lost:
        if (r2.A01 != 5) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01d9, code lost:
        r0 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01db, code lost:
        r0 = (X.C58982uT) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01dd, code lost:
        r15.A17(r0, r3);
        A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e4, code lost:
        r2 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e6, code lost:
        if (r2 != null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01e8, code lost:
        r2 = X.C59032uZ.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ed, code lost:
        if (r2.A01 != 5) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ef, code lost:
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01f2, code lost:
        r0 = X.C58982uT.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01fe, code lost:
        com.whatsapp.util.Log.e("HSMTemplateMessageUtil/buildFMessage/error cannot build any message.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0203, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r0.A0c() == X.C800742l.A03) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        if (r6.A0c().A0c() == X.C800642k.A01) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r6.A0c().A0c() == X.C800642k.A03) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x012d, code lost:
        if (r0.A0c() == X.C800742l.A04) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x013b, code lost:
        if (r6.A0c().A0c() == X.C800642k.A02) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x015c, code lost:
        if (r6.A0c().A0c() == X.C800642k.A05) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x017c A[Catch:{ 23S -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0193 A[Catch:{ 23S -> 0x01a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16740tZ A02(X.C15830rv r24, com.whatsapp.jid.UserJid r25, X.C59022uY r26, X.C222617g r27, java.lang.Long r28, java.lang.Long r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.List r36, int r37, int r38, long r39, boolean r41, boolean r42) {
        /*
            r6 = r26
            int r12 = r6.A01
            r0 = 1
            if (r12 == r0) goto L_0x0008
            r0 = 0
        L_0x0008:
            r11 = 1
            if (r0 == 0) goto L_0x0047
            X.2uX r0 = r6.A0c()
            X.42k r1 = r0.A0c()
            X.42k r0 = X.C800642k.A03
            if (r1 != r0) goto L_0x0056
        L_0x0017:
            r13 = 0
            r7 = 0
            r22 = r36
            r21 = r35
            r20 = r34
            r8 = r33
            r19 = r32
            r3 = r42
            r17 = r29
            r10 = r41
            r16 = r28
            r4 = r39
            r14 = r25
            r23 = r37
            r9 = r24
            r2 = r27
            r18 = r31
            if (r11 == 0) goto L_0x0080
            X.1Vw r1 = new X.1Vw
            r1.<init>(r9, r8, r7)
            r0 = 25
            X.0tZ r15 = r2.A01(r1, r0, r4)
            X.1rG r15 = (X.C38691rG) r15
            goto L_0x0058
        L_0x0047:
            X.2uZ r0 = r6.A03
            if (r0 != 0) goto L_0x004d
            X.2uZ r0 = X.C59032uZ.A07
        L_0x004d:
            X.42l r1 = r0.A0c()
            X.42l r0 = X.C800742l.A03
            if (r1 != r0) goto L_0x0056
            goto L_0x0017
        L_0x0056:
            r11 = 0
            goto L_0x0017
        L_0x0058:
            int r1 = r6.A01     // Catch:{ 23S -> 0x01ab }
            r0 = 1
            if (r1 != r0) goto L_0x006f
            X.2uX r2 = r6.A0c()     // Catch:{ 23S -> 0x01ab }
            int r1 = r2.A01     // Catch:{ 23S -> 0x01ab }
            r0 = 3
            if (r1 != r0) goto L_0x007d
            java.lang.Object r0 = r2.A05     // Catch:{ 23S -> 0x01ab }
        L_0x0068:
            X.24k r0 = (X.C445224k) r0     // Catch:{ 23S -> 0x01ab }
        L_0x006a:
            r15.A1B(r0, r10, r3)     // Catch:{ 23S -> 0x01ab }
            goto L_0x01f5
        L_0x006f:
            X.2uZ r2 = r6.A03     // Catch:{ 23S -> 0x01ab }
            if (r2 != 0) goto L_0x0075
            X.2uZ r2 = X.C59032uZ.A07     // Catch:{ 23S -> 0x01ab }
        L_0x0075:
            int r1 = r2.A01     // Catch:{ 23S -> 0x01ab }
            r0 = 3
            if (r1 != r0) goto L_0x007d
            java.lang.Object r0 = r2.A03     // Catch:{ 23S -> 0x01ab }
            goto L_0x0068
        L_0x007d:
            X.24k r0 = X.C445224k.A0R     // Catch:{ 23S -> 0x01ab }
            goto L_0x006a
        L_0x0080:
            r0 = 1
            if (r12 != r0) goto L_0x009d
            X.2uX r0 = r6.A0c()
            X.42k r1 = r0.A0c()
            X.42k r0 = X.C800642k.A01
            if (r1 != r0) goto L_0x0131
        L_0x008f:
            X.1Vw r1 = new X.1Vw
            r1.<init>(r9, r8, r7)
            r0 = 26
            X.0tZ r15 = r2.A01(r1, r0, r4)
            X.1rA r15 = (X.C38631rA) r15
            goto L_0x00e2
        L_0x009d:
            X.2uZ r0 = r6.A03
            if (r0 != 0) goto L_0x00a3
            X.2uZ r0 = X.C59032uZ.A07
        L_0x00a3:
            X.42l r1 = r0.A0c()
            X.42l r0 = X.C800742l.A01
            if (r1 == r0) goto L_0x008f
            r0 = 1
            if (r12 == r0) goto L_0x0131
            X.2uZ r0 = r6.A03
            if (r0 != 0) goto L_0x00b4
            X.2uZ r0 = X.C59032uZ.A07
        L_0x00b4:
            X.42l r1 = r0.A0c()
            X.42l r0 = X.C800742l.A02
            if (r1 == r0) goto L_0x013d
            r0 = 1
            if (r12 == r0) goto L_0x0152
            X.2uZ r0 = r6.A03
            if (r0 != 0) goto L_0x00c5
            X.2uZ r0 = X.C59032uZ.A07
        L_0x00c5:
            X.42l r1 = r0.A0c()
            X.42l r0 = X.C800742l.A05
            if (r1 == r0) goto L_0x013d
            r0 = 1
            if (r12 == r0) goto L_0x015f
            X.2uZ r0 = r6.A03
            if (r0 != 0) goto L_0x00d6
            X.2uZ r0 = X.C59032uZ.A07
        L_0x00d6:
            X.42l r11 = r0.A0c()
            X.42l r1 = X.C800742l.A06
            r0 = 1
            if (r11 != r1) goto L_0x011f
            if (r12 == r0) goto L_0x016b
            goto L_0x0111
        L_0x00e2:
            int r0 = r6.A01     // Catch:{ 23S -> 0x010c }
            r2 = 1
            if (r0 != r2) goto L_0x00f7
            X.2uX r1 = r6.A0c()     // Catch:{ 23S -> 0x010c }
            int r0 = r1.A01     // Catch:{ 23S -> 0x010c }
            if (r0 != r2) goto L_0x0104
            java.lang.Object r0 = r1.A05     // Catch:{ 23S -> 0x010c }
        L_0x00f1:
            X.24l r0 = (X.C445324l) r0     // Catch:{ 23S -> 0x010c }
        L_0x00f3:
            r15.A1B(r0, r10, r3)     // Catch:{ 23S -> 0x010c }
            goto L_0x0107
        L_0x00f7:
            X.2uZ r1 = r6.A03     // Catch:{ 23S -> 0x010c }
            if (r1 != 0) goto L_0x00fd
            X.2uZ r1 = X.C59032uZ.A07     // Catch:{ 23S -> 0x010c }
        L_0x00fd:
            int r0 = r1.A01     // Catch:{ 23S -> 0x010c }
            if (r0 != r2) goto L_0x0104
            java.lang.Object r0 = r1.A03     // Catch:{ 23S -> 0x010c }
            goto L_0x00f1
        L_0x0104:
            X.24l r0 = X.C445324l.A0L     // Catch:{ 23S -> 0x010c }
            goto L_0x00f3
        L_0x0107:
            A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x01f8
        L_0x010c:
            r1 = move-exception
            java.lang.String r0 = "HSMTemplateMessageUtil/buildFMessage/error setDocumentField, exception="
            goto L_0x01ae
        L_0x0111:
            X.2uZ r6 = r6.A03     // Catch:{ 23S -> 0x01a7 }
            if (r6 != 0) goto L_0x0117
            X.2uZ r6 = X.C59032uZ.A07     // Catch:{ 23S -> 0x01a7 }
        L_0x0117:
            int r1 = r6.A01     // Catch:{ 23S -> 0x01a7 }
            r0 = 4
            if (r1 != r0) goto L_0x01a4
            java.lang.Object r6 = r6.A03     // Catch:{ 23S -> 0x01a7 }
            goto L_0x0176
        L_0x011f:
            if (r12 == r0) goto L_0x01b2
            X.2uZ r0 = r6.A03
            if (r0 != 0) goto L_0x0127
            X.2uZ r0 = X.C59032uZ.A07
        L_0x0127:
            X.42l r1 = r0.A0c()
            X.42l r0 = X.C800742l.A04
            if (r1 != r0) goto L_0x01fe
            goto L_0x01be
        L_0x0131:
            X.2uX r0 = r6.A0c()
            X.42k r1 = r0.A0c()
            X.42k r0 = X.C800642k.A02
            if (r1 != r0) goto L_0x0152
        L_0x013d:
            X.1Vw r1 = new X.1Vw
            r1.<init>(r9, r8, r7)
            r0 = 27
            X.0tZ r15 = r2.A01(r1, r0, r4)
            r0 = r30
            r15.A0k(r0)
            A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x01f8
        L_0x0152:
            X.2uX r0 = r6.A0c()
            X.42k r1 = r0.A0c()
            X.42k r0 = X.C800642k.A05
            if (r1 != r0) goto L_0x015f
            goto L_0x013d
        L_0x015f:
            X.2uX r0 = r6.A0c()
            X.42k r1 = r0.A0c()
            X.42k r0 = X.C800642k.A06
            if (r1 != r0) goto L_0x01b2
        L_0x016b:
            X.2uX r6 = r6.A0c()     // Catch:{ 23S -> 0x01a7 }
            int r1 = r6.A01     // Catch:{ 23S -> 0x01a7 }
            r0 = 4
            if (r1 != r0) goto L_0x01a4
            java.lang.Object r6 = r6.A05     // Catch:{ 23S -> 0x01a7 }
        L_0x0176:
            X.24n r6 = (X.C445524n) r6     // Catch:{ 23S -> 0x01a7 }
        L_0x0178:
            boolean r0 = r6.A0M     // Catch:{ 23S -> 0x01a7 }
            if (r0 == 0) goto L_0x0193
            X.1Vw r1 = new X.1Vw     // Catch:{ 23S -> 0x01a7 }
            r1.<init>(r9, r8, r7)     // Catch:{ 23S -> 0x01a7 }
            r0 = 29
            X.0tZ r15 = r2.A01(r1, r0, r4)     // Catch:{ 23S -> 0x01a7 }
            X.1rK r15 = (X.C38731rK) r15     // Catch:{ 23S -> 0x01a7 }
            r15.A1C(r6, r10, r3)     // Catch:{ 23S -> 0x01a7 }
        L_0x018c:
            r15.A1B(r6)     // Catch:{ 23S -> 0x01a7 }
            A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 23S -> 0x01a7 }
            goto L_0x01f8
        L_0x0193:
            X.1Vw r1 = new X.1Vw     // Catch:{ 23S -> 0x01a7 }
            r1.<init>(r9, r8, r7)     // Catch:{ 23S -> 0x01a7 }
            r0 = 28
            X.0tZ r15 = r2.A01(r1, r0, r4)     // Catch:{ 23S -> 0x01a7 }
            X.1rK r15 = (X.C38731rK) r15     // Catch:{ 23S -> 0x01a7 }
            r15.A1C(r6, r10, r3)     // Catch:{ 23S -> 0x01a7 }
            goto L_0x018c
        L_0x01a4:
            X.24n r6 = X.C445524n.A0O     // Catch:{ 23S -> 0x01a7 }
            goto L_0x0178
        L_0x01a7:
            r1 = move-exception
            java.lang.String r0 = "HSMTemplateMessageUtil/buildFMessage/error video title init error, exception="
            goto L_0x01ae
        L_0x01ab:
            r1 = move-exception
            java.lang.String r0 = "HSMTemplateMessageUtil/buildFMessage/error setImageField, exception="
        L_0x01ae:
            com.whatsapp.util.Log.e(r0, r1)
            return r13
        L_0x01b2:
            X.2uX r0 = r6.A0c()
            X.42k r1 = r0.A0c()
            X.42k r0 = X.C800642k.A04
            if (r1 != r0) goto L_0x01fe
        L_0x01be:
            X.1Vw r1 = new X.1Vw
            r1.<init>(r9, r8, r7)
            r0 = 30
            X.0tZ r15 = r2.A01(r1, r0, r4)
            X.1rM r15 = (X.C38751rM) r15
            int r1 = r6.A01
            r0 = 1
            if (r1 != r0) goto L_0x01e4
            X.2uX r2 = r6.A0c()
            int r1 = r2.A01
            r0 = 5
            if (r1 != r0) goto L_0x01f2
            java.lang.Object r0 = r2.A05
        L_0x01db:
            X.2uT r0 = (X.C58982uT) r0
        L_0x01dd:
            r15.A17(r0, r3)
            A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x01f8
        L_0x01e4:
            X.2uZ r2 = r6.A03
            if (r2 != 0) goto L_0x01ea
            X.2uZ r2 = X.C59032uZ.A07
        L_0x01ea:
            int r1 = r2.A01
            r0 = 5
            if (r1 != r0) goto L_0x01f2
            java.lang.Object r0 = r2.A03
            goto L_0x01db
        L_0x01f2:
            X.2uT r0 = X.C58982uT.A0D
            goto L_0x01dd
        L_0x01f5:
            A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x01f8:
            r0 = r38
            r15.A0T(r0)
            return r15
        L_0x01fe:
            java.lang.String r0 = "HSMTemplateMessageUtil/buildFMessage/error cannot build any message."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439021z.A02(X.0rv, com.whatsapp.jid.UserJid, X.2uY, X.17g, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, long, boolean, boolean):X.0tZ");
    }

    public static void A03(C15830rv r6, C16740tZ r7, Long l2, Long l3, String str, String str2, String str3, String str4, List list, int i2) {
        r7.A0b(r6);
        if (l2 != null) {
            r7.A0d = l2;
        }
        r7.A0E = i2;
        ((C30591cd) r7).Aep(new C30611cf(l3, str, str2, str3, str4, list));
    }
}
