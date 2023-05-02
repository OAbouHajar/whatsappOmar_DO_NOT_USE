package com.whatsapp.util;

import X.AnonymousClass1D1;
import X.AnonymousClass1WA;
import X.AnonymousClass1WB;
import X.AnonymousClass1WD;
import X.AnonymousClass1WF;
import X.AnonymousClass1WG;
import X.C17380uz;
import X.C18930xU;
import X.C28131Um;
import java.util.Map;

public class RunnableTRunnableShape1S0200000_I0 extends C28131Um {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableTRunnableShape1S0200000_I0(C17380uz r2, AnonymousClass1WB r3) {
        this.A02 = 3;
        this.A00 = r3;
        this.A01 = r2;
    }

    public RunnableTRunnableShape1S0200000_I0(C18930xU r2, Map map) {
        this.A02 = 2;
        this.A00 = r2;
        this.A01 = map;
    }

    public RunnableTRunnableShape1S0200000_I0(AnonymousClass1D1 r2, AnonymousClass1WG r3) {
        this.A02 = 4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public RunnableTRunnableShape1S0200000_I0(AnonymousClass1WA r1, Runnable runnable, int i2) {
        this.A02 = i2;
        this.A00 = r1;
        this.A01 = runnable;
    }

    public RunnableTRunnableShape1S0200000_I0(AnonymousClass1WD r2, C18930xU r3) {
        this.A02 = 1;
        this.A00 = r3;
        this.A01 = r2;
    }

    public RunnableTRunnableShape1S0200000_I0(AnonymousClass1WF r2, C18930xU r3) {
        this.A02 = 0;
        this.A00 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02bc, code lost:
        if (r2.A03 <= 0) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02be, code lost:
        if (r26 == null) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c0, code lost:
        if (r25 != false) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ca, code lost:
        if (r8 >= r34.A03(r4, 1375)) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02cc, code lost:
        r13 = r34.A03(r4, 1376) - r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d7, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d8, code lost:
        if (r25 != false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02da, code lost:
        if (r30 != false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02dc, code lost:
        r13 = java.lang.Math.max(java.lang.Math.min(r2.A00, 50), 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ea, code lost:
        r12 = r5.A0A;
        r11 = r26.A11;
        r24 = r13 + 1;
        r10 = r12.A00;
        r15 = r10.A03(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f8, code lost:
        if (r15 == null) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0300, code lost:
        if (r15.A13 == 0) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0302, code lost:
        r0 = r15.A13;
        r20 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030a, code lost:
        if (r0 == 1) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030c, code lost:
        X.AnonymousClass00B.A06(r11);
        r33 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x031a, code lost:
        if (X.C16030sJ.A0G(r33) != false) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x031c, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0321, code lost:
        if (X.C16030sJ.A0L(r33) == false) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0323, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0324, code lost:
        r18 = r12.A02.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(X.AnonymousClass1WW.A0H);
        X.C224417y.A02(r1, r15);
        r1.append(" ");
        r1.append(" AND _id < ? ");
        r1.append(" ORDER BY _id DESC");
        r1.append(" LIMIT ");
        r1.append(r24);
        r15 = r1.toString();
        r12 = r12.A01;
        X.AnonymousClass00B.A06(r33);
        r1 = r18.A02.A08(r15, new java.lang.String[]{java.lang.String.valueOf(r12.A02(r33)), java.lang.String.valueOf(r20)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r12 = new java.util.LinkedList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037f, code lost:
        if (r1.moveToNext() == false) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0381, code lost:
        r0 = r10.A02(r1, r33, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0387, code lost:
        if (r0 == null) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0389, code lost:
        r12.addFirst(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0397, code lost:
        if (r12.size() <= r13) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0399, code lost:
        r12.get(0);
        r12.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03a4, code lost:
        if (r12.isEmpty() != false) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03a6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03a7, code lost:
        r9.addAll(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03ab, code lost:
        r0 = new java.lang.StringBuilder("msgstore/get/previous no id for ");
        r0.append(r11);
        com.whatsapp.util.Log.i(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03bd, code lost:
        if (r0 != false) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03bf, code lost:
        if (r25 != false) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03c1, code lost:
        if (r26 == null) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03c3, code lost:
        r9.add(r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03c8, code lost:
        r3 = r3 + r9.size();
        java.util.Collections.reverse(r9);
        r29.add(new X.AnonymousClass1WX(r2, r9));
        r8 = r8 + 1;
        r16 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03e0, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03ea, code lost:
        if (r9.equals(r15.A01) == false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03ec, code lost:
        r2.A07 = r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03f3, code lost:
        if (r1 != null) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03fe, code lost:
        r1 = new java.lang.StringBuilder("history-sync-manager/create-initial-bootstrap-data end, msgCount=");
        r1.append(r3);
        r1.append("; chatCount=");
        r1.append(r29.size());
        r1.append("; optimizationEnabled=");
        r1.append(r14);
        com.whatsapp.util.Log.i(r1.toString());
        r29 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0424, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0425, code lost:
        com.whatsapp.util.Log.e("history-sync-manager/create-initial-bootstrap-data: aborting data creation", r1);
        r29 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x013c, code lost:
        if (r32 > 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x013e, code lost:
        r31 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0140, code lost:
        r9 = r0.A03(r4, 1420);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0146, code lost:
        if (r9 > 0) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0148, code lost:
        r9 = Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x014b, code lost:
        r11 = r3.iterator();
        r10 = 0;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0155, code lost:
        if (r11.hasNext() == false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0157, code lost:
        r3 = (X.C15830rv) r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0c61, code lost:
        if (r0 == false) goto L_0x0bfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015d, code lost:
        if (r10 >= r9) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0161, code lost:
        if ((r3 instanceof X.AnonymousClass1WP) != false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0163, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0166, code lost:
        if (r8 < r31) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016c, code lost:
        if (X.C16030sJ.A0G(r3) == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016e, code lost:
        r1 = r5.A07.A00(r3);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0176, code lost:
        r2.put(r3, r1);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018a, code lost:
        if (r32 > 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018d, code lost:
        if (r14 == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018f, code lost:
        r1 = r34.A03(r4, 1318);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0197, code lost:
        if (r1 <= 0) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0199, code lost:
        r16 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019b, code lost:
        if (r1 <= 0) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019d, code lost:
        r30 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a3, code lost:
        if (r2.size() >= r1) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a5, code lost:
        r30 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a7, code lost:
        r29 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ad, code lost:
        r1 = r34.A03(r4, 1119);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r22 = java.lang.System.currentTimeMillis();
        r27 = r2.entrySet().iterator();
        r3 = 0;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c8, code lost:
        if (r27.hasNext() == false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ca, code lost:
        r0 = (java.util.Map.Entry) r27.next();
        r9 = (X.C15830rv) r0.getKey();
        r26 = (X.C16740tZ) r0.getValue();
        r11 = r5.A0F;
        r2 = new X.AnonymousClass1WQ(r11.A00);
        r10 = r11.A02;
        r2.A04 = r10.A05(r9);
        r2.A06 = r9;
        r1 = r11.A06;
        r1.A07(r9.getRawString()).A00();
        r2.A00 = r10.A00(r9);
        r2.A0E = r10.A0G(r9);
        r13 = r11.A03.A01(r9);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x021b, code lost:
        if (android.text.TextUtils.isEmpty(r13.A09()) != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x021d, code lost:
        r0 = r13.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0221, code lost:
        r2.A0B = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0227, code lost:
        if (r13.A0J() == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0229, code lost:
        r2.A0G = !r11.A04.A09((com.whatsapp.jid.GroupJid) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0236, code lost:
        r12 = com.whatsapp.jid.UserJid.of(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x023a, code lost:
        if (r12 == null) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x023c, code lost:
        r15 = r11.A01.A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0242, code lost:
        if (r15 == null) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x024a, code lost:
        if (r9.equals(r15.A00) == false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x024c, code lost:
        r2.A08 = r15.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0250, code lost:
        r1 = r1.A07(r9.getRawString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025a, code lost:
        if (r1.A0G == false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x025c, code lost:
        r0 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x025e, code lost:
        r2.A03 = r0;
        r1 = r11.A07.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0267, code lost:
        if (r1 == -1) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0269, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x026b, code lost:
        if (r1 != -2) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x026d, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026e, code lost:
        r2.A0F = !r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0272, code lost:
        if (r12 == null) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0274, code lost:
        r1 = r10.A08(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0278, code lost:
        if (r1 == null) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x027a, code lost:
        r2.A01 = r1.expiration;
        r2.A02 = r1.ephemeralSettingTimestamp / 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0286, code lost:
        r2.A01 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x028a, code lost:
        r0 = (X.C15840rx) r10.A0C().get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0294, code lost:
        if (r0 != null) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0296, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0298, code lost:
        r0 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029a, code lost:
        r2.A00 = r0;
        r9 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a1, code lost:
        if (r32 <= 0) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a3, code lost:
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a7, code lost:
        if (r3 >= r31) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a9, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b4, code lost:
        if ((r22 - 86400000) < r2.A04) goto L_0x02be;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x03f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x03fd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:207:0x055b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:283:0x0766 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:288:0x076b */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0776 A[Catch:{ 1X5 | 1X7 -> 0x09eb, all -> 0x076b, 1X6 -> 0x0b71 }, LOOP:14: B:291:0x0770->B:293:0x0776, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x07cc A[Catch:{ 1X5 | 1X7 -> 0x09eb, all -> 0x076b, 1X6 -> 0x0b71 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0b61  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r38 = this;
            r7 = r38
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x055f;
                case 2: goto L_0x056f;
                case 3: goto L_0x0ba5;
                case 4: goto L_0x0013;
                case 5: goto L_0x0c78;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r7.A00
            X.1WA r1 = (X.AnonymousClass1WA) r1
            java.lang.Object r0 = r7.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.execute(r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r7.A00
            X.1D1 r0 = (X.AnonymousClass1D1) r0
            X.0xU r2 = r0.A01
            boolean r0 = r2.A0X()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r7.A01
            X.1WG r1 = (X.AnonymousClass1WG) r1
            X.0sK r0 = r1.A00
            boolean r0 = r0.A0G()
            r0 = r0 ^ 1
            X.AnonymousClass00B.A0G(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r6 = X.AnonymousClass1WH.A05(r0)
            X.0t3 r0 = r1.A01
            long r7 = r0.A00()
            r4 = 0
            X.1WI r3 = new X.1WI
            r5 = r4
            r3.<init>(r4, r5, r6, r7)
            java.util.Set r0 = java.util.Collections.singleton(r3)
            r2.A0S(r0)
            r2.A0N()
            return
        L_0x004e:
            java.lang.Object r0 = r7.A00
            r28 = r0
            r0 = r28
            X.0xU r0 = (X.C18930xU) r0
            r28 = r0
            X.0yJ r6 = r0.A0O
            java.lang.Object r3 = r7.A01
            X.1WF r3 = (X.AnonymousClass1WF) r3
            X.19E r0 = r6.A05
            r37 = r0
            java.lang.String r2 = r3.A02
            X.1WL r1 = r3.A00
            X.1WM r7 = r0.A05(r1, r2)
            java.lang.String r1 = "SyncdBootstrapManager/prepareCriticalDataUpload bootstrapId: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1RP r4 = r6.A04
            X.1WN r0 = r3.A01
            r36 = r0
            com.whatsapp.jid.DeviceJid r0 = r0.A06
            r35 = r0
            X.0sq r3 = r4.A06
            r2 = 21
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r1 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r1.<init>(r4, r2, r0)
            r3.Aco(r1)
            X.1CY r5 = r6.A03
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            X.0rs r3 = r5.A05
            X.0sf r1 = r5.A0H
            X.0rt r0 = r3.A00
            r0.A0C()
            java.util.ArrayList r4 = r3.A01
            int r0 = r4.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Set r8 = r1.A0A()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            monitor-enter(r4)
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x055c }
        L_0x00ba:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x055c }
            X.0ru r0 = (X.C15820ru) r0     // Catch:{ all -> 0x055c }
            X.0rv r0 = r0.A01     // Catch:{ all -> 0x055c }
            r9.add(r0)     // Catch:{ all -> 0x055c }
            goto L_0x00ba
        L_0x00cc:
            monitor-exit(r4)     // Catch:{ all -> 0x055c }
            java.util.Iterator r4 = r9.iterator()
        L_0x00d1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r1 = r4.next()
            boolean r0 = r8.contains(r1)
            if (r0 != 0) goto L_0x00d1
            r3.add(r1)
            goto L_0x00d1
        L_0x00e5:
            r8.retainAll(r9)
            r0 = 0
            r3.addAll(r0, r8)
            java.lang.String r0 = "history-sync-manager/create-initial-bootstrap-data start: conversation list size is "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.139 r0 = r5.A04
            android.content.SharedPreferences r8 = r0.A01()
            java.lang.String r4 = "syncd_bootstrap_fail_time"
            r0 = 0
            long r8 = r8.getLong(r4, r0)
            r14 = 0
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x017c
            X.0pd r0 = r5.A0D
            r34 = r0
            r1 = 1324(0x52c, float:1.855E-42)
            X.0tM r4 = X.C16620tM.A02
            int r1 = r0.A03(r4, r1)
            if (r1 <= 0) goto L_0x017c
            X.0t3 r0 = r5.A06
            long r10 = r0.A00()
            long r10 = r10 - r8
            long r0 = (long) r1
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r8
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x017c
            r14 = 1
            r1 = 1317(0x525, float:1.846E-42)
            r0 = r34
            int r32 = r0.A03(r4, r1)
            if (r32 <= 0) goto L_0x017c
        L_0x013e:
            r31 = r32
        L_0x0140:
            r1 = 1420(0x58c, float:1.99E-42)
            int r9 = r0.A03(r4, r1)
            if (r9 > 0) goto L_0x014b
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x014b:
            java.util.Iterator r11 = r3.iterator()
            r10 = 0
            r8 = 0
        L_0x0151:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r3 = r11.next()
            X.0rv r3 = (X.C15830rv) r3
            if (r10 >= r9) goto L_0x018d
            boolean r0 = r3 instanceof X.AnonymousClass1WP
            if (r0 != 0) goto L_0x0151
            r1 = 0
            r0 = r31
            if (r8 < r0) goto L_0x016e
            boolean r0 = X.C16030sJ.A0G(r3)
            if (r0 == 0) goto L_0x0176
        L_0x016e:
            X.0yz r0 = r5.A07
            X.0tZ r1 = r0.A00(r3)
            int r8 = r8 + 1
        L_0x0176:
            r2.put(r3, r1)
            int r10 = r10 + 1
            goto L_0x0151
        L_0x017c:
            X.0pd r0 = r5.A0D
            r34 = r0
            r1 = 1170(0x492, float:1.64E-42)
            X.0tM r4 = X.C16620tM.A02
            int r32 = r0.A03(r4, r1)
            r31 = 1000(0x3e8, float:1.401E-42)
            if (r32 <= 0) goto L_0x0140
            goto L_0x013e
        L_0x018d:
            if (r14 == 0) goto L_0x01ad
            r1 = 1318(0x526, float:1.847E-42)
            r0 = r34
            int r1 = r0.A03(r4, r1)
            if (r1 <= 0) goto L_0x01ad
        L_0x0199:
            r16 = 1
            if (r1 <= 0) goto L_0x01a5
            int r0 = r2.size()
            r30 = 1
            if (r0 >= r1) goto L_0x01a7
        L_0x01a5:
            r30 = 0
        L_0x01a7:
            java.util.ArrayList r29 = new java.util.ArrayList
            r29.<init>()
            goto L_0x01b6
        L_0x01ad:
            r1 = 1119(0x45f, float:1.568E-42)
            r0 = r34
            int r1 = r0.A03(r4, r1)
            goto L_0x0199
        L_0x01b6:
            long r22 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0424 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ Exception -> 0x0424 }
            java.util.Iterator r27 = r0.iterator()     // Catch:{ Exception -> 0x0424 }
            r3 = 0
            r8 = 0
        L_0x01c4:
            boolean r0 = r27.hasNext()     // Catch:{ Exception -> 0x0424 }
            if (r0 == 0) goto L_0x03fe
            java.lang.Object r0 = r27.next()     // Catch:{ Exception -> 0x0424 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x0424 }
            java.lang.Object r9 = r0.getKey()     // Catch:{ Exception -> 0x0424 }
            X.0rv r9 = (X.C15830rv) r9     // Catch:{ Exception -> 0x0424 }
            java.lang.Object r26 = r0.getValue()     // Catch:{ Exception -> 0x0424 }
            r0 = r26
            X.0tZ r0 = (X.C16740tZ) r0     // Catch:{ Exception -> 0x0424 }
            r26 = r0
            X.1Rs r11 = r5.A0F     // Catch:{ Exception -> 0x0424 }
            X.0so r0 = r11.A00     // Catch:{ Exception -> 0x0424 }
            X.1WQ r2 = new X.1WQ     // Catch:{ Exception -> 0x0424 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0424 }
            X.0rt r10 = r11.A02     // Catch:{ Exception -> 0x0424 }
            long r0 = r10.A05(r9)     // Catch:{ Exception -> 0x0424 }
            r2.A04 = r0     // Catch:{ Exception -> 0x0424 }
            r2.A06 = r9     // Catch:{ Exception -> 0x0424 }
            X.0sf r1 = r11.A06     // Catch:{ Exception -> 0x0424 }
            java.lang.String r0 = r9.getRawString()     // Catch:{ Exception -> 0x0424 }
            X.1WS r0 = r1.A07(r0)     // Catch:{ Exception -> 0x0424 }
            r0.A00()     // Catch:{ Exception -> 0x0424 }
            int r0 = r10.A00(r9)     // Catch:{ Exception -> 0x0424 }
            r2.A00 = r0     // Catch:{ Exception -> 0x0424 }
            boolean r0 = r10.A0G(r9)     // Catch:{ Exception -> 0x0424 }
            r2.A0E = r0     // Catch:{ Exception -> 0x0424 }
            X.14t r0 = r11.A03     // Catch:{ Exception -> 0x0424 }
            X.0sH r13 = r0.A01(r9)     // Catch:{ Exception -> 0x0424 }
            java.lang.String r0 = r13.A09()     // Catch:{ Exception -> 0x0424 }
            boolean r12 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0424 }
            r0 = 0
            if (r12 != 0) goto L_0x0221
            java.lang.String r0 = r13.A09()     // Catch:{ Exception -> 0x0424 }
        L_0x0221:
            r2.A0B = r0     // Catch:{ Exception -> 0x0424 }
            boolean r0 = r13.A0J()     // Catch:{ Exception -> 0x0424 }
            if (r0 == 0) goto L_0x0236
            X.0sO r12 = r11.A04     // Catch:{ Exception -> 0x0424 }
            r0 = r9
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ Exception -> 0x0424 }
            boolean r0 = r12.A09(r0)     // Catch:{ Exception -> 0x0424 }
            r0 = r0 ^ 1
            r2.A0G = r0     // Catch:{ Exception -> 0x0424 }
        L_0x0236:
            com.whatsapp.jid.UserJid r12 = com.whatsapp.jid.UserJid.of(r9)     // Catch:{ Exception -> 0x0424 }
            if (r12 == 0) goto L_0x0250
            X.1Rr r0 = r11.A01     // Catch:{ Exception -> 0x0424 }
            X.1WT r15 = r0.A00(r12)     // Catch:{ Exception -> 0x0424 }
            if (r15 == 0) goto L_0x0250
            com.whatsapp.jid.UserJid r0 = r15.A00     // Catch:{ Exception -> 0x0424 }
            boolean r0 = r9.equals(r0)     // Catch:{ Exception -> 0x0424 }
            if (r0 == 0) goto L_0x03e4
            com.whatsapp.jid.UserJid r0 = r15.A01     // Catch:{ Exception -> 0x0424 }
            r2.A08 = r0     // Catch:{ Exception -> 0x0424 }
        L_0x0250:
            java.lang.String r0 = r9.getRawString()     // Catch:{ Exception -> 0x0424 }
            X.1WS r1 = r1.A07(r0)     // Catch:{ Exception -> 0x0424 }
            boolean r0 = r1.A0G     // Catch:{ Exception -> 0x0424 }
            if (r0 == 0) goto L_0x03e0
            long r0 = r1.A04     // Catch:{ Exception -> 0x0424 }
        L_0x025e:
            r2.A03 = r0     // Catch:{ Exception -> 0x0424 }
            X.14s r0 = r11.A07     // Catch:{ Exception -> 0x0424 }
            int r1 = r0.A00(r9)     // Catch:{ Exception -> 0x0424 }
            r0 = -1
            if (r1 == r0) goto L_0x026d
            r0 = -2
            r11 = 0
            if (r1 != r0) goto L_0x026e
        L_0x026d:
            r11 = 1
        L_0x026e:
            r0 = r11 ^ 1
            r2.A0F = r0     // Catch:{ Exception -> 0x0424 }
            if (r12 == 0) goto L_0x0286
            X.1WV r1 = r10.A08(r12)     // Catch:{ Exception -> 0x0424 }
            if (r1 == 0) goto L_0x028a
            int r0 = r1.expiration     // Catch:{ Exception -> 0x0424 }
            r2.A01 = r0     // Catch:{ Exception -> 0x0424 }
            long r0 = r1.ephemeralSettingTimestamp     // Catch:{ Exception -> 0x0424 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r11
            r2.A02 = r0     // Catch:{ Exception -> 0x0424 }
            goto L_0x028a
        L_0x0286:
            int r0 = r13.A01     // Catch:{ Exception -> 0x0424 }
            r2.A01 = r0     // Catch:{ Exception -> 0x0424 }
        L_0x028a:
            java.util.concurrent.ConcurrentHashMap r0 = r10.A0C()     // Catch:{ Exception -> 0x0424 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ Exception -> 0x0424 }
            X.0rx r0 = (X.C15840rx) r0     // Catch:{ Exception -> 0x0424 }
            if (r0 != 0) goto L_0x0298
            r0 = 0
            goto L_0x029a
        L_0x0298:
            int r0 = r0.A04     // Catch:{ Exception -> 0x0424 }
        L_0x029a:
            r2.A00 = r0     // Catch:{ Exception -> 0x0424 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x0424 }
            r9.<init>()     // Catch:{ Exception -> 0x0424 }
            if (r32 <= 0) goto L_0x02a9
            r25 = 1
            r0 = r31
            if (r3 >= r0) goto L_0x02ab
        L_0x02a9:
            r25 = 0
        L_0x02ab:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r22 - r0
            long r0 = r2.A04     // Catch:{ Exception -> 0x0424 }
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x02be
            long r0 = r2.A03     // Catch:{ Exception -> 0x0424 }
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x03bf
        L_0x02be:
            if (r26 == 0) goto L_0x03bf
            if (r25 != 0) goto L_0x02d7
            r1 = 1375(0x55f, float:1.927E-42)
            r0 = r34
            int r0 = r0.A03(r4, r1)     // Catch:{ Exception -> 0x0424 }
            if (r8 >= r0) goto L_0x02d7
            r1 = 1376(0x560, float:1.928E-42)
            r0 = r34
            int r13 = r0.A03(r4, r1)     // Catch:{ Exception -> 0x0424 }
            int r13 = r13 - r16
            goto L_0x02da
        L_0x02d7:
            r13 = 0
            if (r25 != 0) goto L_0x02ea
        L_0x02da:
            if (r30 != 0) goto L_0x02ea
            int r1 = r2.A00     // Catch:{ Exception -> 0x0424 }
            r0 = 50
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ Exception -> 0x0424 }
            r0 = 30
            int r13 = java.lang.Math.max(r1, r0)     // Catch:{ Exception -> 0x0424 }
        L_0x02ea:
            X.1Rt r12 = r5.A0A     // Catch:{ Exception -> 0x0424 }
            r0 = r26
            X.1Vw r11 = r0.A11     // Catch:{ Exception -> 0x0424 }
            int r24 = r13 + 1
            X.0th r10 = r12.A00     // Catch:{ Exception -> 0x0424 }
            X.0tZ r15 = r10.A03(r11)     // Catch:{ Exception -> 0x0424 }
            if (r15 == 0) goto L_0x03ab
            long r0 = r15.A13     // Catch:{ Exception -> 0x0424 }
            r17 = 0
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 == 0) goto L_0x03ab
            long r0 = r15.A13     // Catch:{ Exception -> 0x0424 }
            r20 = r0
            r15 = 1
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x03ab
            X.AnonymousClass00B.A06(r11)     // Catch:{ Exception -> 0x0424 }
            X.0rv r0 = r11.A00     // Catch:{ Exception -> 0x0424 }
            r33 = r0
            boolean r0 = X.C16030sJ.A0G(r33)     // Catch:{ Exception -> 0x0424 }
            r19 = 1
            r11 = 0
            if (r0 != 0) goto L_0x0323
            boolean r0 = X.C16030sJ.A0L(r33)     // Catch:{ Exception -> 0x0424 }
            r15 = 1
            if (r0 == 0) goto L_0x0324
        L_0x0323:
            r15 = 0
        L_0x0324:
            X.0tq r0 = r12.A02     // Catch:{ Exception -> 0x0424 }
            X.0tf r18 = r0.get()     // Catch:{ Exception -> 0x0424 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f9 }
            r1.<init>()     // Catch:{ all -> 0x03f9 }
            java.lang.String r0 = X.AnonymousClass1WW.A0H     // Catch:{ all -> 0x03f9 }
            r1.append(r0)     // Catch:{ all -> 0x03f9 }
            X.C224417y.A02(r1, r15)     // Catch:{ all -> 0x03f9 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x03f9 }
            java.lang.String r0 = " AND _id < ? "
            r1.append(r0)     // Catch:{ all -> 0x03f9 }
            java.lang.String r0 = " ORDER BY _id DESC"
            r1.append(r0)     // Catch:{ all -> 0x03f9 }
            java.lang.String r0 = " LIMIT "
            r1.append(r0)     // Catch:{ all -> 0x03f9 }
            r0 = r24
            r1.append(r0)     // Catch:{ all -> 0x03f9 }
            java.lang.String r15 = r1.toString()     // Catch:{ all -> 0x03f9 }
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x03f9 }
            X.0ts r12 = r12.A01     // Catch:{ all -> 0x03f9 }
            X.AnonymousClass00B.A06(r33)     // Catch:{ all -> 0x03f9 }
            r0 = r33
            long r16 = r12.A02(r0)     // Catch:{ all -> 0x03f9 }
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x03f9 }
            r1[r11] = r0     // Catch:{ all -> 0x03f9 }
            java.lang.String r0 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x03f9 }
            r1[r19] = r0     // Catch:{ all -> 0x03f9 }
            r0 = r18
            X.0tg r0 = r0.A02     // Catch:{ all -> 0x03f9 }
            android.database.Cursor r1 = r0.A08(r15, r1)     // Catch:{ all -> 0x03f9 }
            java.util.LinkedList r12 = new java.util.LinkedList     // Catch:{ all -> 0x03f2 }
            r12.<init>()     // Catch:{ all -> 0x03f2 }
        L_0x037b:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x03f2 }
            if (r0 == 0) goto L_0x038d
            r0 = r33
            X.0tZ r0 = r10.A02(r1, r0, r11)     // Catch:{ all -> 0x03f2 }
            if (r0 == 0) goto L_0x037b
            r12.addFirst(r0)     // Catch:{ all -> 0x03f2 }
            goto L_0x037b
        L_0x038d:
            r1.close()     // Catch:{ all -> 0x03f9 }
            r18.close()     // Catch:{ Exception -> 0x0424 }
            int r0 = r12.size()     // Catch:{ Exception -> 0x0424 }
            if (r0 <= r13) goto L_0x039f
            r12.get(r11)     // Catch:{ Exception -> 0x0424 }
            r12.remove(r11)     // Catch:{ Exception -> 0x0424 }
        L_0x039f:
            boolean r1 = r12.isEmpty()     // Catch:{ Exception -> 0x0424 }
            r0 = 0
            if (r1 != 0) goto L_0x03a7
            r0 = 1
        L_0x03a7:
            r9.addAll(r12)     // Catch:{ Exception -> 0x0424 }
            goto L_0x03bd
        L_0x03ab:
            java.lang.String r1 = "msgstore/get/previous no id for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0424 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0424 }
            r0.append(r11)     // Catch:{ Exception -> 0x0424 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0424 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0424 }
            goto L_0x03bf
        L_0x03bd:
            if (r0 != 0) goto L_0x03c3
        L_0x03bf:
            if (r25 != 0) goto L_0x03c8
            if (r26 == 0) goto L_0x03c8
        L_0x03c3:
            r0 = r26
            r9.add(r0)     // Catch:{ Exception -> 0x0424 }
        L_0x03c8:
            int r0 = r9.size()     // Catch:{ Exception -> 0x0424 }
            int r3 = r3 + r0
            java.util.Collections.reverse(r9)     // Catch:{ Exception -> 0x0424 }
            X.1WX r1 = new X.1WX     // Catch:{ Exception -> 0x0424 }
            r1.<init>(r2, r9)     // Catch:{ Exception -> 0x0424 }
            r0 = r29
            r0.add(r1)     // Catch:{ Exception -> 0x0424 }
            int r8 = r8 + 1
            r16 = 1
            goto L_0x01c4
        L_0x03e0:
            r0 = 0
            goto L_0x025e
        L_0x03e4:
            com.whatsapp.jid.UserJid r0 = r15.A01     // Catch:{ Exception -> 0x0424 }
            boolean r0 = r9.equals(r0)     // Catch:{ Exception -> 0x0424 }
            if (r0 == 0) goto L_0x0250
            com.whatsapp.jid.UserJid r0 = r15.A00     // Catch:{ Exception -> 0x0424 }
            r2.A07 = r0     // Catch:{ Exception -> 0x0424 }
            goto L_0x0250
        L_0x03f2:
            r0 = move-exception
            if (r1 == 0) goto L_0x03f8
            r1.close()     // Catch:{ all -> 0x03f8 }
        L_0x03f8:
            throw r0     // Catch:{ all -> 0x03f9 }
        L_0x03f9:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x03fd }
        L_0x03fd:
            throw r0     // Catch:{ Exception -> 0x0424 }
        L_0x03fe:
            java.lang.String r0 = "history-sync-manager/create-initial-bootstrap-data end, msgCount="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = "; chatCount="
            r1.append(r0)
            int r0 = r29.size()
            r1.append(r0)
            java.lang.String r0 = "; optimizationEnabled="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x042e
        L_0x0424:
            r1 = move-exception
            java.lang.String r0 = "history-sync-manager/create-initial-bootstrap-data: aborting data creation"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.List r29 = java.util.Collections.emptyList()
        L_0x042e:
            X.0sq r1 = r5.A0I
            r13 = 15
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0
            r8 = r0
            r9 = r5
            r10 = r36
            r11 = r29
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r1.Aco(r0)
            X.19W r4 = r6.A07
            java.lang.String r0 = "SyncdKeyManager/shareAllKeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19V r3 = r4.A08
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            X.19K r0 = r3.A00
            X.0tf r8 = r0.get()
            X.0tg r2 = r8.A02     // Catch:{ all -> 0x0c73 }
            java.lang.String r1 = "SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info"
            r0 = 0
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x0c73 }
        L_0x045e:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0555 }
            if (r0 == 0) goto L_0x046c
            X.1WY r0 = r3.A02(r1)     // Catch:{ all -> 0x0555 }
            r5.add(r0)     // Catch:{ all -> 0x0555 }
            goto L_0x045e
        L_0x046c:
            r1.close()     // Catch:{ all -> 0x0c73 }
            r8.close()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x04b0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x0481:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0493
            java.lang.Object r1 = r2.next()
            X.1WY r1 = (X.AnonymousClass1WY) r1
            X.1WK r0 = r1.A01
            r3.put(r0, r1)
            goto L_0x0481
        L_0x0493:
            r1 = 0
            r0 = r35
            r4.A08(r0, r3, r1)
            X.19E r4 = r4.A03
            int r0 = r3.size()
            long r2 = (long) r0
            X.1WZ r1 = new X.1WZ
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.0t9 r0 = r4.A06
            r0.A06(r1)
        L_0x04b0:
            X.139 r2 = r6.A06
            android.content.SharedPreferences r3 = r2.A01()
            java.lang.String r1 = "syncd_bootstrap_state"
            r0 = 0
            int r0 = r3.getInt(r1, r0)
            if (r0 != 0) goto L_0x0540
            if (r7 == 0) goto L_0x04d0
            X.1Wa r0 = new X.1Wa
            r0.<init>(r7)
            r6.A02(r0)
            r1 = 1
            r0 = r37
            r0.A09(r7, r1)
        L_0x04d0:
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap triggered for release"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.15h r6 = r6.A08
            java.util.Set r0 = r6.A03()
            java.util.Iterator r8 = r0.iterator()
        L_0x04e9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0547
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r7 = r6.A02(r3)
            X.0zx r7 = (X.C20380zx) r7
            if (r7 != 0) goto L_0x0503
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap handler not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x04e9
        L_0x0503:
            java.util.Set r1 = X.AnonymousClass1WJ.A09
            java.lang.String r0 = r7.A00()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x04e9
            boolean r0 = r7 instanceof X.C28431Wb
            if (r0 == 0) goto L_0x053a
            r1 = r7
            X.1Wb r1 = (X.C28431Wb) r1
            java.util.List r0 = r1.A0B(r11)
        L_0x051a:
            r4.addAll(r0)
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap adding mutations for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.add(r3)
            goto L_0x04e9
        L_0x053a:
            r0 = 0
            java.util.List r0 = r7.A02(r0)
            goto L_0x051a
        L_0x0540:
            X.16Q r1 = r6.A0A
            r0 = 1
            r1.A02(r0)
            goto L_0x0551
        L_0x0547:
            r6.A09(r4)
            r2.A07(r5)
            r0 = 1
            r2.A04(r0)
        L_0x0551:
            r28.A0O()
            return
        L_0x0555:
            r0 = move-exception
            if (r1 == 0) goto L_0x055b
            r1.close()     // Catch:{ all -> 0x055b }
        L_0x055b:
            throw r0     // Catch:{ all -> 0x0c73 }
        L_0x055c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x055c }
            throw r0
        L_0x055f:
            java.lang.String r0 = "sync-manager/doPreCompanionLogoutTask timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r7.A01
            X.1WD r1 = (X.AnonymousClass1WD) r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A02(r0)
            return
        L_0x056f:
            java.lang.Object r9 = r7.A00
            X.0xU r9 = (X.C18930xU) r9
            monitor-enter(r9)
            X.1Wc r1 = r9.A00     // Catch:{ all -> 0x0ba2 }
            if (r1 != 0) goto L_0x059c
            X.0sK r8 = r9.A07     // Catch:{ all -> 0x0ba2 }
            X.0sq r6 = r9.A0n     // Catch:{ all -> 0x0ba2 }
            X.0ug r5 = r9.A0i     // Catch:{ all -> 0x0ba2 }
            X.19E r4 = r9.A0N     // Catch:{ all -> 0x0ba2 }
            X.0yJ r3 = r9.A0O     // Catch:{ all -> 0x0ba2 }
            X.11P r2 = r9.A0e     // Catch:{ all -> 0x0ba2 }
            X.1Cg r0 = r9.A0L     // Catch:{ all -> 0x0ba2 }
            X.1Wd r12 = r9.A0A()     // Catch:{ all -> 0x0ba2 }
            X.1Wc r1 = new X.1Wc     // Catch:{ all -> 0x0ba2 }
            r10 = r1
            r11 = r8
            r13 = r0
            r14 = r4
            r15 = r3
            r16 = r2
            r17 = r5
            r18 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0ba2 }
            r9.A00 = r1     // Catch:{ all -> 0x0ba2 }
        L_0x059c:
            monitor-exit(r9)
            java.lang.Object r3 = r7.A01
            java.util.Map r3 = (java.util.Map) r3
            boolean r0 = r3.isEmpty()
            r2 = r0 ^ 1
            java.lang.String r0 = "sync-request-handler/sendRequest: mutation map is empty"
            X.AnonymousClass00B.A0C(r0, r2)
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x05ba:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0b85
            java.lang.Object r2 = r16.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            X.1Cg r0 = r1.A03
            r34 = r0
            java.lang.Object r5 = r2.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r2.getValue()
            java.util.List r9 = (java.util.List) r9
            X.1WD r2 = new X.1WD
            r2.<init>()
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x05f8
            java.util.List r4 = java.util.Collections.emptyList()
            r3 = 0
            X.1We r0 = new X.1We
            r0.<init>(r5, r4, r3)
            X.1Wf r0 = r0.A00()
            r2.A02(r0)
        L_0x05f2:
            r0 = r17
            r0.add(r2)
            goto L_0x05ba
        L_0x05f8:
            r0 = r34
            X.1Ca r4 = r0.A02     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations for collectionName: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 1X6 -> 0x0b71 }
            r3.<init>(r0)     // Catch:{ 1X6 -> 0x0b71 }
            r3.append(r5)     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r0 = "; size="
            r3.append(r0)     // Catch:{ 1X6 -> 0x0b71 }
            int r0 = r9.size()     // Catch:{ 1X6 -> 0x0b71 }
            r3.append(r0)     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r0 = r3.toString()     // Catch:{ 1X6 -> 0x0b71 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1X6 -> 0x0b71 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ 1X6 -> 0x0b71 }
            r8.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            X.19W r0 = r4.A06     // Catch:{ 1X6 -> 0x0b71 }
            r24 = r0
            X.1WY r27 = r24.A01()     // Catch:{ 1X6 -> 0x0b71 }
            if (r27 != 0) goto L_0x062c
            X.1WY r27 = r24.A00()     // Catch:{ 1X6 -> 0x0b71 }
        L_0x062c:
            r3 = 0
            if (r27 == 0) goto L_0x0b69
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ 1X6 -> 0x0b71 }
            r6.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ 1X6 -> 0x0b71 }
            r7.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r27
            X.1WK r0 = r0.A01     // Catch:{ 1X6 -> 0x0b71 }
            r33 = r0
            r6.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            java.util.Iterator r13 = r9.iterator()     // Catch:{ 1X6 -> 0x0b71 }
        L_0x0646:
            boolean r0 = r13.hasNext()     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 == 0) goto L_0x06ca
            java.lang.Object r12 = r13.next()     // Catch:{ 1X6 -> 0x0b71 }
            X.1WJ r12 = (X.AnonymousClass1WJ) r12     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r0 = r12.A00     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 != 0) goto L_0x065a
            r0 = r33
            r12.A00 = r0     // Catch:{ 1X6 -> 0x0b71 }
        L_0x065a:
            X.0zv r9 = r4.A0A     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r0 = r12.A03()     // Catch:{ 1X6 -> 0x0b71 }
            X.1WJ r0 = r9.A06(r0)     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 == 0) goto L_0x06ab
            X.1WK r10 = r0.A00     // Catch:{ 1X6 -> 0x0b71 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r9 = r12.A00     // Catch:{ 1X6 -> 0x0b71 }
            boolean r9 = r10.equals(r9)     // Catch:{ 1X6 -> 0x0b71 }
            if (r9 != 0) goto L_0x06ab
            X.1Wg r10 = r12.A05     // Catch:{ 1X6 -> 0x0b71 }
            X.1Wg r9 = X.C28481Wg.A03     // Catch:{ 1X6 -> 0x0b71 }
            if (r10 != r9) goto L_0x06be
            java.lang.String[] r22 = r0.A07()     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r20 = r0.A03()     // Catch:{ 1X6 -> 0x0b71 }
            int r11 = r0.A03     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r10 = r0.A00     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r9 = r0.A06     // Catch:{ 1X6 -> 0x0b71 }
            X.1Wh r0 = new X.1Wh     // Catch:{ 1X6 -> 0x0b71 }
            r18 = r0
            r19 = r10
            r21 = r9
            r23 = r11
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r9 = r0.A00     // Catch:{ 1X6 -> 0x0b71 }
            r7.add(r9)     // Catch:{ 1X6 -> 0x0b71 }
            X.1Wi r10 = new X.1Wi     // Catch:{ 1X6 -> 0x0b71 }
            r10.<init>(r0)     // Catch:{ 1X6 -> 0x0b71 }
            X.01Q r9 = new X.01Q     // Catch:{ 1X6 -> 0x0b71 }
            r9.<init>(r0, r10)     // Catch:{ 1X6 -> 0x0b71 }
            r8.add(r9)     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r0 = r0.A00     // Catch:{ 1X6 -> 0x0b71 }
            r6.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
        L_0x06ab:
            X.1Wi r9 = new X.1Wi     // Catch:{ 1X6 -> 0x0b71 }
            r9.<init>(r12)     // Catch:{ 1X6 -> 0x0b71 }
            X.01Q r0 = new X.01Q     // Catch:{ 1X6 -> 0x0b71 }
            r0.<init>(r12, r9)     // Catch:{ 1X6 -> 0x0b71 }
            r8.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r0 = r9.A02     // Catch:{ 1X6 -> 0x0b71 }
            r6.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            goto L_0x0646
        L_0x06be:
            java.lang.String r9 = r12.A03()     // Catch:{ 1X6 -> 0x0b71 }
            r7.add(r9)     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r0 = r0.A00     // Catch:{ 1X6 -> 0x0b71 }
            r12.A00 = r0     // Catch:{ 1X6 -> 0x0b71 }
            goto L_0x06ab
        L_0x06ca:
            X.0pd r10 = r4.A0B     // Catch:{ 1X6 -> 0x0b71 }
            r9 = 2777(0xad9, float:3.891E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ 1X6 -> 0x0b71 }
            int r12 = r10.A03(r0, r9)     // Catch:{ 1X6 -> 0x0b71 }
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ 1X6 -> 0x0b71 }
            r19.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            r18 = 0
        L_0x06db:
            int r0 = r19.size()     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 >= r12) goto L_0x076c
            X.0zv r14 = r4.A0A     // Catch:{ 1X6 -> 0x0b71 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ 1X6 -> 0x0b71 }
            r13.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ 1X6 -> 0x0b71 }
            r15.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            r15.add(r5)     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ 1X6 -> 0x0b71 }
            r15.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ 1X6 -> 0x0b71 }
            r15.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            X.19K r0 = r14.A01     // Catch:{ 1X6 -> 0x0b71 }
            X.0tf r11 = r0.get()     // Catch:{ 1X6 -> 0x0b71 }
            X.0tg r10 = r11.A02     // Catch:{ all -> 0x0767 }
            java.lang.String r9 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE collection_name = ?  ORDER BY epoch ASC, device_id DESC  LIMIT ?, ? "
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x0767 }
            java.lang.Object[] r0 = r15.toArray(r0)     // Catch:{ all -> 0x0767 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0767 }
            android.database.Cursor r9 = r10.A08(r9, r0)     // Catch:{ all -> 0x0767 }
            int r0 = r9.getCount()     // Catch:{ all -> 0x0760 }
            if (r0 != 0) goto L_0x071c
            r13 = 0
            goto L_0x072c
        L_0x071c:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0760 }
            if (r0 == 0) goto L_0x072c
            X.1WJ r0 = r14.A04(r9)     // Catch:{ all -> 0x0760 }
            if (r0 == 0) goto L_0x071c
            r13.add(r0)     // Catch:{ all -> 0x0760 }
            goto L_0x071c
        L_0x072c:
            r9.close()     // Catch:{ all -> 0x0767 }
            r11.close()     // Catch:{ 1X6 -> 0x0b71 }
            if (r13 == 0) goto L_0x076c
            int r18 = r18 + r12
            java.util.Iterator r11 = r13.iterator()     // Catch:{ 1X6 -> 0x0b71 }
        L_0x073a:
            boolean r0 = r11.hasNext()     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 == 0) goto L_0x06db
            java.lang.Object r9 = r11.next()     // Catch:{ 1X6 -> 0x0b71 }
            X.1WJ r9 = (X.AnonymousClass1WJ) r9     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r10 = r9.A00     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r33
            boolean r0 = r0.equals(r10)     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 != 0) goto L_0x076c
            java.lang.String r0 = r9.A03()     // Catch:{ 1X6 -> 0x0b71 }
            boolean r0 = r7.contains(r0)     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 != 0) goto L_0x073a
            r0 = r19
            r0.add(r9)     // Catch:{ 1X6 -> 0x0b71 }
            goto L_0x073a
        L_0x0760:
            r0 = move-exception
            if (r9 == 0) goto L_0x0766
            r9.close()     // Catch:{ all -> 0x0766 }
        L_0x0766:
            throw r0     // Catch:{ all -> 0x0767 }
        L_0x0767:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x076b }
        L_0x076b:
            throw r0     // Catch:{ 1X6 -> 0x0b71 }
        L_0x076c:
            java.util.Iterator r12 = r19.iterator()     // Catch:{ 1X6 -> 0x0b71 }
        L_0x0770:
            boolean r0 = r12.hasNext()     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 == 0) goto L_0x07bb
            java.lang.Object r9 = r12.next()     // Catch:{ 1X6 -> 0x0b71 }
            X.1WJ r9 = (X.AnonymousClass1WJ) r9     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String[] r22 = r9.A07()     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r20 = r9.A03()     // Catch:{ 1X6 -> 0x0b71 }
            int r11 = r9.A03     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r7 = r9.A00     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r0 = r9.A06     // Catch:{ 1X6 -> 0x0b71 }
            X.1Wh r10 = new X.1Wh     // Catch:{ 1X6 -> 0x0b71 }
            r18 = r10
            r19 = r7
            r21 = r0
            r23 = r11
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ 1X6 -> 0x0b71 }
            X.1Wi r7 = new X.1Wi     // Catch:{ 1X6 -> 0x0b71 }
            r7.<init>(r10)     // Catch:{ 1X6 -> 0x0b71 }
            X.01Q r0 = new X.01Q     // Catch:{ 1X6 -> 0x0b71 }
            r0.<init>(r10, r7)     // Catch:{ 1X6 -> 0x0b71 }
            r8.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r0 = r7.A02     // Catch:{ 1X6 -> 0x0b71 }
            r6.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r33
            r9.A00 = r0     // Catch:{ 1X6 -> 0x0b71 }
            X.1Wi r7 = new X.1Wi     // Catch:{ 1X6 -> 0x0b71 }
            r7.<init>(r9)     // Catch:{ 1X6 -> 0x0b71 }
            X.01Q r0 = new X.01Q     // Catch:{ 1X6 -> 0x0b71 }
            r0.<init>(r9, r7)     // Catch:{ 1X6 -> 0x0b71 }
            r8.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            goto L_0x0770
        L_0x07bb:
            r6.size()     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r24
            java.util.HashMap r26 = r0.A02(r5, r6)     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r26
            boolean r0 = r0.containsValue(r3)     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 != 0) goto L_0x0b61
            java.util.ArrayList r25 = new java.util.ArrayList     // Catch:{ 1X6 -> 0x0b71 }
            r25.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            java.util.ArrayList r24 = new java.util.ArrayList     // Catch:{ 1X6 -> 0x0b71 }
            r24.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            java.util.ArrayList r23 = new java.util.ArrayList     // Catch:{ 1X6 -> 0x0b71 }
            r23.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ 1X6 -> 0x0b71 }
            r22.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            java.util.HashMap r21 = new java.util.HashMap     // Catch:{ 1X6 -> 0x0b71 }
            r21.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            r12 = 0
        L_0x07e6:
            int r0 = r8.size()     // Catch:{ 1X6 -> 0x0b71 }
            if (r12 >= r0) goto L_0x09f9
            java.lang.Object r0 = r8.get(r12)     // Catch:{ 1X6 -> 0x0b71 }
            X.01Q r0 = (X.AnonymousClass01Q) r0     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.Object r0 = r0.A00     // Catch:{ 1X6 -> 0x0b71 }
            r20 = r0
            X.AnonymousClass00B.A06(r20)     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r20
            X.1WJ r0 = (X.AnonymousClass1WJ) r0     // Catch:{ 1X6 -> 0x0b71 }
            r20 = r0
            r3 = r24
            r3.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.Object r0 = r8.get(r12)     // Catch:{ 1X6 -> 0x0b71 }
            X.01Q r0 = (X.AnonymousClass01Q) r0     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.Object r11 = r0.A01     // Catch:{ 1X6 -> 0x0b71 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ 1X6 -> 0x0b71 }
            X.1Wi r11 = (X.C28501Wi) r11     // Catch:{ 1X6 -> 0x0b71 }
            X.1WK r3 = r11.A02     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r26
            java.lang.Object r3 = r0.get(r3)     // Catch:{ 1X6 -> 0x0b71 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ 1X6 -> 0x0b71 }
            X.1WY r3 = (X.AnonymousClass1WY) r3     // Catch:{ 1X6 -> 0x0b71 }
            X.1Cc r0 = r4.A08     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r28 = r0
            X.1RR r6 = r0.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wj r0 = r3.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wk r10 = r6.A00(r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            java.lang.String r7 = r11.A04     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            java.nio.charset.Charset r0 = X.AnonymousClass01S.A0A     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r19 = r7.getBytes(r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wl r13 = r11.A03     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            if (r13 == 0) goto L_0x0896
            byte[] r9 = r13.A02()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
        L_0x083a:
            r0 = 16
            byte[] r6 = X.C004101u.A0E(r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r19
            int r0 = r0.length     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r14 = r9.length     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r9 = 0
            int r0 = -r0
            int r0 = r0 - r14
            int r0 = java.lang.Math.max(r9, r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r9 = X.C004101u.A0E(r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wq r0 = X.C28571Wq.A05     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wr r14 = r0.A0U()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            java.nio.charset.Charset r0 = X.C28601Wt.A03     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r0 = r7.getBytes(r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wu r15 = new X.1Wu     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r15.<init>(r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r14.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r7 = r14.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wq r7 = (X.C28571Wq) r7     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r7.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 1
            r7.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r7.A02 = r15     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r7 = r9.length     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = 0
            X.1Ww r9 = X.C28631Ww.A01(r9, r0, r7)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r14.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r7 = r14.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wq r7 = (X.C28571Wq) r7     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r7.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 4
            r7.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r7.A03 = r9     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r9 = r11.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r14.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r7 = r14.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wq r7 = (X.C28571Wq) r7     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r7.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 8
            r7.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r7.A01 = r9     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            goto L_0x0899
        L_0x0896:
            byte[] r9 = X.C23471Cc.A01     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            goto L_0x083a
        L_0x0899:
            if (r13 == 0) goto L_0x08aa
            r14.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r7 = r14.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wq r7 = (X.C28571Wq) r7     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r7.A04 = r13     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r7.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 2
            r7.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
        L_0x08aa:
            X.1Wm r0 = r14.A02()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r7 = r0.A02()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r0 = r10.A03     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r9 = 1
            byte[] r7 = X.C23471Cc.A01(r6, r7, r0, r9)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r18 = 2
            r0 = r18
            byte[][] r0 = new byte[r0][]     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r13 = 0
            r0[r13] = r6     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0[r9] = r7     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r7 = X.C28641Wx.A04(r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1WK r6 = r3.A01     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wg r3 = r11.A01     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r0 = r3.A01     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r14 = r0
            byte[] r0 = r10.A04     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r15 = r28
            byte[] r14 = r15.A04(r6, r14, r0, r7)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r18
            byte[][] r0 = new byte[r0][]     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0[r13] = r7     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0[r9] = r14     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r9 = X.C28641Wx.A04(r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r10 = r10.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            java.lang.String r7 = "HmacSHA256"
            r0 = r19
            byte[] r0 = X.C23471Cc.A00(r7, r0, r10)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wy r7 = new X.1Wy     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r7.<init>(r3, r6, r0, r9)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wz r0 = X.C28661Wz.A02     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wr r14 = r0.A0U()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r6 = r7.A03     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r6.length     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Ww r9 = X.C28631Ww.A01(r6, r13, r0)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r14.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r3 = r14.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wz r3 = (X.C28661Wz) r3     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r3.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 1
            r3.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r3.A01 = r9     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X0 r0 = X.AnonymousClass1X0.A02     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wr r13 = r0.A0U()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r9 = r7.A02     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r3 = r9.length     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = 0
            X.1Ww r9 = X.C28631Ww.A01(r9, r0, r3)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r13.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r3 = r13.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X0 r3 = (X.AnonymousClass1X0) r3     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r3.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 1
            r3.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r3.A01 = r9     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X1 r0 = X.AnonymousClass1X1.A02     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wr r9 = r0.A0U()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1WK r0 = r7.A01     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r10 = r0.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r3 = r10.length     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = 0
            X.1Ww r10 = X.C28631Ww.A01(r10, r0, r3)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r9.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r3 = r9.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X1 r3 = (X.AnonymousClass1X1) r3     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r3.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 1
            r3.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r3.A01 = r10     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X2 r0 = X.AnonymousClass1X2.A04     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wr r10 = r0.A0U()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r10.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r3 = r10.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X2 r3 = (X.AnonymousClass1X2) r3     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r0 = r14.A02()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wz r0 = (X.C28661Wz) r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r3.A02 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r3.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 1
            r3.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r10.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r3 = r10.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X2 r3 = (X.AnonymousClass1X2) r3     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r0 = r13.A02()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X0 r0 = (X.AnonymousClass1X0) r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r3.A03 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r3.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 2
            r3.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r10.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r3 = r10.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X2 r3 = (X.AnonymousClass1X2) r3     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r0 = r9.A02()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X1 r0 = (X.AnonymousClass1X1) r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r3.A01 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r3.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 4
            r3.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X3 r0 = X.AnonymousClass1X3.A03     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wr r9 = r0.A0U()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wg r0 = r7.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X4 r13 = r0.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r9.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r3 = r9.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X3 r3 = (X.AnonymousClass1X3) r3     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r3.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 1
            r3.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r13.value     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r3.A01 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r9.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r3 = r9.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X3 r3 = (X.AnonymousClass1X3) r3     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r0 = r10.A02()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1X2 r0 = (X.AnonymousClass1X2) r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r3.A02 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r0 = r3.A00     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r0 | 2
            r3.A00 = r0     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wm r3 = r9.A02()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r25
            r0.add(r3)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            byte[] r7 = r7.A04     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r20
            r0.A02 = r7     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wg r3 = r11.A01     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            X.1Wg r0 = X.C28481Wg.A03     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            if (r3 != r0) goto L_0x09de
            r0 = r23
            r0.add(r7)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r22
            r0.add(r6)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
        L_0x09de:
            java.lang.String r3 = r20.A03()     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            r0 = r21
            r0.put(r3, r6)     // Catch:{ 1X5 | 1X7 -> 0x09eb }
            int r12 = r12 + 1
            goto L_0x07e6
        L_0x09eb:
            r3 = move-exception
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations: "
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ 1X6 -> 0x0b71 }
            r3 = 10
            X.1X9 r0 = new X.1X9     // Catch:{ 1X6 -> 0x0b71 }
            r0.<init>(r3, r5)     // Catch:{ 1X6 -> 0x0b71 }
            throw r0     // Catch:{ 1X6 -> 0x0b71 }
        L_0x09f9:
            r3 = 0
            java.lang.String[] r6 = X.AnonymousClass1XA.A02(r24)     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r23
            byte[] r8 = r4.A02(r5, r0, r6)     // Catch:{ 1X6 -> 0x0b71 }
            boolean r0 = r25.isEmpty()     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 == 0) goto L_0x0a21
            X.0so r9 = r4.A00     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r6 = "name="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 1X6 -> 0x0b71 }
            r0.<init>(r6)     // Catch:{ 1X6 -> 0x0b71 }
            r0.append(r5)     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r7 = r0.toString()     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.String r6 = "syncd_empty_patch"
            r0 = 0
            r9.AcB(r6, r7, r0)     // Catch:{ 1X6 -> 0x0b71 }
        L_0x0a21:
            X.11P r0 = r4.A09     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.Long r0 = r0.A00(r5)     // Catch:{ 1X6 -> 0x0b71 }
            r31 = 1
            if (r0 == 0) goto L_0x0a31
            long r6 = r0.longValue()     // Catch:{ 1X6 -> 0x0b71 }
            long r31 = r31 + r6
        L_0x0a31:
            X.1Cc r10 = r4.A08     // Catch:{ 1X6 -> 0x0b71 }
            r11 = r27
            r12 = r5
            r13 = r8
            r14 = r31
            byte[] r9 = r10.A02(r11, r12, r13, r14)     // Catch:{ 1X6 -> 0x0b71 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ 1X6 -> 0x0b71 }
            r7.<init>()     // Catch:{ 1X6 -> 0x0b71 }
            java.util.Iterator r6 = r24.iterator()     // Catch:{ 1X6 -> 0x0b71 }
        L_0x0a46:
            boolean r0 = r6.hasNext()     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 == 0) goto L_0x0a58
            java.lang.Object r0 = r6.next()     // Catch:{ 1X6 -> 0x0b71 }
            X.1WJ r0 = (X.AnonymousClass1WJ) r0     // Catch:{ 1X6 -> 0x0b71 }
            byte[] r0 = r0.A02     // Catch:{ 1X6 -> 0x0b71 }
            r7.add(r0)     // Catch:{ 1X6 -> 0x0b71 }
            goto L_0x0a46
        L_0x0a58:
            byte[] r29 = X.C28641Wx.A03(r7)     // Catch:{ 1X6 -> 0x0b71 }
            r26 = r10
            r28 = r5
            r30 = r9
            byte[] r7 = r26.A03(r27, r28, r29, r30, r31)     // Catch:{ 1X6 -> 0x0b71 }
            X.1We r6 = new X.1We     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r24
            r6.<init>(r5, r0, r8)     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r25
            r6.A03 = r0     // Catch:{ 1X6 -> 0x0b71 }
            r6.A01 = r3     // Catch:{ 1X6 -> 0x0b71 }
            r6.A05 = r9     // Catch:{ 1X6 -> 0x0b71 }
            r6.A04 = r7     // Catch:{ 1X6 -> 0x0b71 }
            r0 = r33
            r6.A00 = r0     // Catch:{ 1X6 -> 0x0b71 }
            X.0s5 r5 = r4.A02     // Catch:{ 1X6 -> 0x0b71 }
            X.0s8 r0 = X.C15910s6.A0Z     // Catch:{ 1X6 -> 0x0b71 }
            boolean r0 = r5.A05(r0)     // Catch:{ 1X6 -> 0x0b71 }
            if (r0 == 0) goto L_0x0a92
            X.0sK r0 = r4.A01     // Catch:{ 1X6 -> 0x0b71 }
            int r0 = r0.A00()     // Catch:{ 1X6 -> 0x0b71 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1X6 -> 0x0b71 }
        L_0x0a8f:
            r6.A02 = r0     // Catch:{ 1X6 -> 0x0b71 }
            goto L_0x0a94
        L_0x0a92:
            r0 = 0
            goto L_0x0a8f
        L_0x0a94:
            X.1Wf r10 = r6.A00()
            r0 = r34
            X.0s5 r4 = r0.A00
            X.0tC r0 = X.C15910s6.A1U
            int r11 = r4.A02(r0)
            X.0tC r0 = X.C15910s6.A1Y
            int r0 = r4.A02(r0)
            long r7 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r4
            X.1XC r9 = r10.A00
            X.AnonymousClass00B.A06(r9)
            java.util.List r0 = r10.A02
            int r0 = r0.size()
            if (r0 > r11) goto L_0x0ac7
            int r0 = r9.AFw()
            long r4 = (long) r0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0ac7
            r2.A02(r10)
            goto L_0x05f2
        L_0x0ac7:
            X.1XD r0 = X.AnonymousClass1XD.A01
            X.1Wr r8 = r0.A0U()
            X.1XE r7 = r9.A04
            r8.A03()
            X.1Wm r5 = r8.A00
            X.1XD r5 = (X.AnonymousClass1XD) r5
            X.1XE r4 = r5.A00
            r0 = r4
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0ae5
            X.1XE r4 = X.C28541Wm.A0G(r4)
            r5.A00 = r4
        L_0x0ae5:
            X.C28591Ws.A01(r7, r4)
            X.1XG r7 = new X.1XG
            r0 = r34
            r7.<init>(r2, r0, r6)
            X.1RO r9 = r0.A01
            X.1Wm r5 = r8.A02()
            X.1XD r5 = (X.AnonymousClass1XD) r5
            X.12X r0 = r9.A01     // Catch:{ IOException -> 0x0b73 }
            X.1XH r4 = r0.A00     // Catch:{ IOException -> 0x0b73 }
            java.lang.String r0 = ""
            java.io.File r8 = r4.A00(r0)     // Catch:{ IOException -> 0x0b73 }
            byte[] r0 = r5.A02()     // Catch:{ IOException -> 0x0b73 }
            X.AnonymousClass1XI.A0G(r8, r0)     // Catch:{ IOException -> 0x0b73 }
            r8.getAbsolutePath()     // Catch:{ IOException -> 0x0b73 }
            X.1XE r0 = r5.A00     // Catch:{ IOException -> 0x0b73 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0b73 }
            r4 = 0
            if (r0 != 0) goto L_0x0b21
            java.lang.String r0 = "external-mutations-uploader: empty external patch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0b73 }
            X.0so r5 = r9.A00     // Catch:{ IOException -> 0x0b73 }
            java.lang.String r0 = "syncd_empty_external_patch"
            r5.AcB(r0, r3, r4)     // Catch:{ IOException -> 0x0b73 }
        L_0x0b21:
            r5 = 1
            X.1XJ r0 = new X.1XJ     // Catch:{ IOException -> 0x0b73 }
            r0.<init>(r4, r4, r5)     // Catch:{ IOException -> 0x0b73 }
            X.1XK r22 = X.AnonymousClass1XK.A0J     // Catch:{ IOException -> 0x0b73 }
            android.net.Uri r18 = android.net.Uri.fromFile(r8)     // Catch:{ IOException -> 0x0b73 }
            r20 = r3
            r23 = r3
            r24 = r3
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 1
            r19 = r3
            r21 = r0
            X.1XL r0 = X.AnonymousClass1XL.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IOException -> 0x0b73 }
            X.0wL r6 = r9.A02     // Catch:{ IOException -> 0x0b73 }
            X.1XP r5 = r6.A03(r0, r4)     // Catch:{ IOException -> 0x0b73 }
            java.lang.String r0 = "mms"
            r5.A0U = r0     // Catch:{ IOException -> 0x0b73 }
            X.1XR r4 = new X.1XR     // Catch:{ IOException -> 0x0b73 }
            r4.<init>(r9, r7, r5, r8)     // Catch:{ IOException -> 0x0b73 }
            X.1XS r0 = r5.A0A     // Catch:{ IOException -> 0x0b73 }
            r0.A03(r4, r3)     // Catch:{ IOException -> 0x0b73 }
            r6.A0D(r5, r3)     // Catch:{ IOException -> 0x0b73 }
            java.lang.String r0 = "external-mutations-uploader start media upload"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0b73 }
            goto L_0x05f2
        L_0x0b61:
            java.lang.String r4 = "Missing keys exception"
            X.1XT r0 = new X.1XT     // Catch:{ 1X6 -> 0x0b71 }
            r0.<init>(r4, r3)     // Catch:{ 1X6 -> 0x0b71 }
            throw r0     // Catch:{ 1X6 -> 0x0b71 }
        L_0x0b69:
            java.lang.String r4 = "Missing active key exception"
            X.1XT r0 = new X.1XT     // Catch:{ 1X6 -> 0x0b71 }
            r0.<init>(r4, r3)     // Catch:{ 1X6 -> 0x0b71 }
            throw r0     // Catch:{ 1X6 -> 0x0b71 }
        L_0x0b71:
            r0 = move-exception
            goto L_0x0b80
        L_0x0b73:
            r4 = move-exception
            java.lang.String r0 = "external-mutations-uploader"
            com.whatsapp.util.Log.e(r0, r4)
            java.lang.String r4 = "prepare-syncd-mutations-helper/startPrepareJob/onError: IOException"
            X.1XT r0 = new X.1XT
            r0.<init>(r4, r3)
        L_0x0b80:
            r2.A03(r0)
            goto L_0x05f2
        L_0x0b85:
            X.1XU r3 = new X.1XU
            r0 = r17
            r3.<init>(r0)
            r2 = 0
            com.facebook.redex.IDxNConsumerShape152S0100000_1_I1 r0 = new com.facebook.redex.IDxNConsumerShape152S0100000_1_I1
            r0.<init>(r1, r2)
            r3.A00(r0)
            r0 = 2
            com.facebook.redex.IDxNConsumerShape154S0100000_2_I1 r2 = new com.facebook.redex.IDxNConsumerShape154S0100000_2_I1
            r2.<init>(r1, r0)
            X.1XS r1 = r3.A00
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x0ba2:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0ba5:
            java.lang.Object r0 = r7.A00
            X.1WB r0 = (X.AnonymousClass1WB) r0
            X.0xU r4 = r0.A00
            X.1CY r5 = r4.A0I
            java.lang.Object r0 = r7.A01
            X.0v0 r0 = (X.C17390v0) r0
            X.1Ub r3 = r0.iterator()
        L_0x0bb5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0be1
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            java.lang.String r0 = "history-sync-manager/stopMessageHistorySync for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1RS r1 = r5.A0B
            r0 = 2
            r1.A04(r2, r0)
            r0 = 3
            r1.A04(r2, r0)
            goto L_0x0bb5
        L_0x0be1:
            X.0s5 r1 = r4.A08
            X.0tC r0 = X.C15910s6.A1V
            int r1 = r1.A02(r0)
            X.0yO r0 = r4.A0c
            java.util.List r0 = r0.A07()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r1 != 0) goto L_0x0c61
            if (r0 != 0) goto L_0x0c30
            r0 = 3
            r4.A0P(r0)
        L_0x0bfd:
            X.19E r9 = r4.A0N
            X.0t3 r0 = r9.A02
            long r2 = r0.A00()
            X.139 r10 = r9.A01
            android.content.SharedPreferences r0 = r10.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_last_companion_dereg_logging_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            android.content.SharedPreferences r0 = r10.A01()
            java.lang.String r1 = "syncd_first_companion_reg_logging_time"
            r7 = 0
            long r5 = r0.getLong(r1, r7)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0c40
            java.lang.String r0 = "syncStatsManager/onLastCompanionDeregistration, first registerTs is 0L"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0c30:
            X.19W r1 = r4.A0S
            java.lang.String r0 = "SyncdKeyManager/unblockAllCollections"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19L r0 = r1.A09
            X.19K r0 = r0.A00
            X.0tf r8 = r0.get()
            goto L_0x0c64
        L_0x0c40:
            android.content.SharedPreferences r0 = r10.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            X.1XV r1 = new X.1XV
            r1.<init>()
            long r2 = r2 - r5
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.0t9 r0 = r9.A06
            r0.A06(r1)
            goto L_0x0c30
        L_0x0c61:
            if (r0 != 0) goto L_0x0c30
            goto L_0x0bfd
        L_0x0c64:
            X.0tg r2 = r8.A02     // Catch:{ all -> 0x0c73 }
            java.lang.String r1 = "missing_keys"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0c73 }
            r8.close()
            r4.A0N()
            return
        L_0x0c73:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0c77 }
        L_0x0c77:
            throw r0
        L_0x0c78:
            java.lang.Object r2 = r7.A00     // Catch:{ all -> 0x0c9c }
            X.1WA r2 = (X.AnonymousClass1WA) r2     // Catch:{ all -> 0x0c9c }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0c9c }
            long r0 = r0.getId()     // Catch:{ all -> 0x0c9c }
            r2.A05 = r0     // Catch:{ all -> 0x0c9c }
            java.lang.Object r1 = r2.A02     // Catch:{ all -> 0x0c9c }
            monitor-enter(r1)     // Catch:{ all -> 0x0c9c }
            java.lang.Object r0 = r7.A01     // Catch:{ all -> 0x0c99 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0c99 }
            r0.run()     // Catch:{ all -> 0x0c99 }
            monitor-exit(r1)     // Catch:{ all -> 0x0c99 }
            r0 = -1
            r2.A05 = r0
            r2.A01()
            return
        L_0x0c99:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0c99 }
            throw r0     // Catch:{ all -> 0x0c9c }
        L_0x0c9c:
            r3 = move-exception
            java.lang.Object r2 = r7.A00
            X.1WA r2 = (X.AnonymousClass1WA) r2
            r0 = -1
            r2.A05 = r0
            r2.A01()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.RunnableTRunnableShape1S0200000_I0.run():void");
    }
}
