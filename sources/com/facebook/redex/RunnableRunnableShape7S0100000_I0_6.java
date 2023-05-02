package com.facebook.redex;

public class RunnableRunnableShape7S0100000_I0_6 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape7S0100000_I0_6(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x025e, code lost:
        if (r5 <= 1800000) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0348, code lost:
        if (r38 > 0) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0467, code lost:
        if (r40 > 1800000) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x046b, code lost:
        if (r44 == false) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x046d, code lost:
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0471, code lost:
        if (r38 <= 1800000) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0473, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0475, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0479, code lost:
        if (r36 > 1800000) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x047b, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x047d, code lost:
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0481, code lost:
        if (r6 > 1800000) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0483, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0485, code lost:
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0489, code lost:
        if (r34 > 1800000) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x048b, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x048d, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0491, code lost:
        if (r31 > 1800000) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0493, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0495, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0499, code lost:
        if (r29 > 1800000) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x049b, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x049d, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04a1, code lost:
        if (r27 > 1800000) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04a3, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04a5, code lost:
        if (r44 != false) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04a7, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04ab, code lost:
        if (r2 <= 1800000) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04ad, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04af, code lost:
        r6 = new java.lang.StringBuilder("contactsyncmethods/getProtocolsForFullSync/sync: ");
        r6.append("contactSyncDue=");
        r6.append(r8);
        r6.append(" (");
        r6.append(r40 / 60000);
        r6.append("min)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04d4, code lost:
        if (r8 != false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04d6, code lost:
        if (r26 == false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04d8, code lost:
        r6.append(" (soon)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04db, code lost:
        r6.append("sidelistSyncDue=");
        r6.append(r9);
        r6.append(" (");
        r6.append(r38 / 60000);
        r6.append("min)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04f1, code lost:
        if (r9 != false) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04f3, code lost:
        if (r25 == false) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04f5, code lost:
        r6.append(" (soon)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04f8, code lost:
        r6.append(", statusSyncDue=");
        r6.append(r11);
        r6.append(" (");
        r6.append(r36 / 60000);
        r6.append("min)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x050d, code lost:
        if (r11 != false) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x050f, code lost:
        if (r24 == false) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0511, code lost:
        r6.append(" (soon)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0514, code lost:
        if (r42 != false) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0516, code lost:
        if (r23 == false) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0518, code lost:
        r6.append(" (soon)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x051b, code lost:
        r6.append(", businessSyncDue=");
        r6.append(r33);
        r6.append(" (");
        r6.append(r34 / 60000);
        r6.append("min)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0532, code lost:
        if (r33 != false) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0534, code lost:
        if (r22 == false) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0536, code lost:
        r6.append(" (soon)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0539, code lost:
        r6.append(", devicesSyncDue=");
        r6.append(r14);
        r6.append(" (");
        r6.append(r31 / 60000);
        r6.append("min)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x054e, code lost:
        if (r14 != false) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0550, code lost:
        if (r21 == false) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0552, code lost:
        r6.append(" (soon)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0555, code lost:
        r6.append(", paymentSyncDue=");
        r6.append(r13);
        r6.append(" (");
        r6.append(r29 / 60000);
        r6.append("min)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x056a, code lost:
        if (r13 != false) goto L_0x0571;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x056c, code lost:
        if (r20 == false) goto L_0x0571;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x056e, code lost:
        r6.append(" (soon)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0571, code lost:
        r6.append(", disappearingModeSyncDue=");
        r6.append(r15);
        r6.append(" (");
        r6.append(r27 / 60000);
        r6.append("min)");
        r6.append("lidSyncDue=");
        r6.append(r12);
        r6.append(" (");
        r6.append(r2 / 60000);
        r6.append("min)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0599, code lost:
        if (r12 != false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x059b, code lost:
        if (r18 == false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x059d, code lost:
        r6.append(" (soon)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05a0, code lost:
        com.whatsapp.util.Log.i(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05a7, code lost:
        if (r8 != false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05a9, code lost:
        r27 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05ab, code lost:
        if (r26 == false) goto L_0x05af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05ad, code lost:
        r27 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05af, code lost:
        if (r9 != false) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05b1, code lost:
        r28 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05b3, code lost:
        if (r25 == false) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05b5, code lost:
        r28 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05b7, code lost:
        if (r11 != false) goto L_0x05bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05b9, code lost:
        r29 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05bb, code lost:
        if (r24 == false) goto L_0x05bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05bd, code lost:
        r29 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05bf, code lost:
        if (r42 != false) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05c1, code lost:
        r30 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05c3, code lost:
        if (r23 == false) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05c5, code lost:
        r30 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05c7, code lost:
        if (r33 != false) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05c9, code lost:
        r31 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05cb, code lost:
        if (r22 == false) goto L_0x05cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05cd, code lost:
        r31 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05cf, code lost:
        if (r14 != false) goto L_0x05d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05d1, code lost:
        r32 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05d3, code lost:
        if (r21 == false) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05d5, code lost:
        r32 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05d7, code lost:
        if (r13 != false) goto L_0x05dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05d9, code lost:
        r33 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05db, code lost:
        if (r20 == false) goto L_0x05df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05dd, code lost:
        r33 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05df, code lost:
        if (r15 != false) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05e1, code lost:
        r34 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05e3, code lost:
        if (r19 == false) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x05e5, code lost:
        r34 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x05e7, code lost:
        if (r12 != false) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x05e9, code lost:
        r35 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x05eb, code lost:
        if (r18 == false) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x05ed, code lost:
        r35 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x05ef, code lost:
        r26 = new X.C453027w(r27, r28, r29, r30, r31, r32, r33, r34, r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05f6, code lost:
        if (r44 == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015f, code lost:
        if (r4.A06.A0I(r2.A0L.A0E) == false) goto L_0x0161;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:497:0x0a81 */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:564:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r45 = this;
            r1 = r45
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0a65;
                case 1: goto L_0x0a52;
                case 2: goto L_0x0683;
                case 3: goto L_0x0632;
                case 4: goto L_0x0202;
                case 5: goto L_0x0a38;
                case 6: goto L_0x0a27;
                case 7: goto L_0x01e6;
                case 8: goto L_0x0178;
                case 9: goto L_0x09c9;
                case 10: goto L_0x0996;
                case 11: goto L_0x098e;
                case 12: goto L_0x0986;
                case 13: goto L_0x08e8;
                case 14: goto L_0x013e;
                case 15: goto L_0x097e;
                case 16: goto L_0x0972;
                case 17: goto L_0x010a;
                case 18: goto L_0x00ef;
                case 19: goto L_0x00d4;
                case 20: goto L_0x00b1;
                case 21: goto L_0x0952;
                case 22: goto L_0x090d;
                case 23: goto L_0x0900;
                case 24: goto L_0x08f9;
                case 25: goto L_0x0085;
                case 26: goto L_0x08f0;
                case 27: goto L_0x08e8;
                case 28: goto L_0x08dd;
                case 29: goto L_0x08c7;
                case 30: goto L_0x08bf;
                case 31: goto L_0x0048;
                case 32: goto L_0x08b7;
                case 33: goto L_0x0035;
                case 34: goto L_0x08ab;
                case 35: goto L_0x0843;
                case 36: goto L_0x0836;
                case 37: goto L_0x082e;
                case 38: goto L_0x0803;
                case 39: goto L_0x0007;
                case 40: goto L_0x07f3;
                case 41: goto L_0x07e5;
                case 42: goto L_0x07b4;
                case 43: goto L_0x07a4;
                case 44: goto L_0x0776;
                case 45: goto L_0x076a;
                case 46: goto L_0x0007;
                case 47: goto L_0x0015;
                case 48: goto L_0x075e;
                case 49: goto L_0x073f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.1yj r0 = (X.C42821yj) r0
            X.1yV r0 = r0.A22
            X.0pP r0 = (X.C14570pP) r0
            X.10F r0 = r0.A02
            r0.A00()
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r1.A00
            X.1yj r0 = (X.C42821yj) r0
            X.1wN r3 = r0.A2D
            X.1ZR r1 = r3.A01
            boolean r0 = r1 instanceof X.C41691wO
            if (r0 == 0) goto L_0x0014
            X.1wO r1 = (X.C41691wO) r1
            com.whatsapp.jid.UserJid r2 = r1.A00
            X.0uc r0 = r3.A0I
            java.lang.String r1 = r0.A01(r2)
            if (r1 == 0) goto L_0x0031
            X.1ZR r0 = r3.A01
            r0.A0H = r1
        L_0x0031:
            r3.A09(r2)
            return
        L_0x0035:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity r1 = (com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity) r1
            X.29I r0 = r1.A0G
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0014
            X.29I r1 = r1.A0G
            r0 = 1
            r1.A00(r0)
            return
        L_0x0048:
            java.lang.Object r0 = r1.A00
            X.1bb r0 = (X.C30011bb) r0
            X.0z1 r3 = r0.A1H
            X.0tZ r2 = r0.getFMessage()
            X.1Vw r0 = r2.A11
            X.0rv r1 = r0.A00
            java.util.List r0 = r3.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0014
            X.0sG r0 = r3.A00
            X.0sH r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0I()
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A01(r2)
            if (r0 == 0) goto L_0x0014
            X.1cd r2 = (X.C30591cd) r2
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1vc r1 = r3.A00(r1, r2, r0)
            X.0t9 r0 = r3.A03
            r0.A06(r1)
            return
        L_0x0085:
            java.lang.Object r4 = r1.A00
            X.2Qc r4 = (X.C48962Qc) r4
            X.0sO r2 = r4.A0J
            X.0sL r1 = r4.A0O
            boolean r0 = r2.A0A(r1)
            if (r0 == 0) goto L_0x00aa
            int r0 = r2.A01(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x009b:
            if (r3 == 0) goto L_0x0014
            X.0pt r2 = r4.A0M
            r1 = 11
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r4, r1, r3)
            r2.Acq(r0)
            return
        L_0x00aa:
            X.18Q r0 = r4.A0E
            java.lang.Integer r3 = r0.A00(r1)
            goto L_0x009b
        L_0x00b1:
            java.lang.Object r3 = r1.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
        L_0x00b6:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0014
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass31G
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r1 instanceof X.AnonymousClass31E
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r1 instanceof X.AnonymousClass31F
            if (r0 == 0) goto L_0x00d1
        L_0x00cc:
            X.1bb r1 = (X.C30011bb) r1
            r1.A10()
        L_0x00d1:
            int r2 = r2 + 1
            goto L_0x00b6
        L_0x00d4:
            java.lang.Object r3 = r1.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
        L_0x00d9:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0014
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass31E
            if (r0 == 0) goto L_0x00ec
            X.1bb r1 = (X.C30011bb) r1
            r1.A10()
        L_0x00ec:
            int r2 = r2 + 1
            goto L_0x00d9
        L_0x00ef:
            java.lang.Object r3 = r1.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
        L_0x00f4:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0014
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass2QF
            if (r0 == 0) goto L_0x0107
            X.1bb r1 = (X.C30011bb) r1
            r1.A10()
        L_0x0107:
            int r2 = r2 + 1
            goto L_0x00f4
        L_0x010a:
            java.lang.Object r5 = r1.A00
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r4 = 0
        L_0x010f:
            int r0 = r5.getChildCount()
            if (r4 >= r0) goto L_0x0014
            android.view.View r3 = r5.getChildAt(r4)
            boolean r0 = r3 instanceof X.C30011bb
            if (r0 == 0) goto L_0x013b
            r2 = r3
            X.1bb r2 = (X.C30011bb) r2
            X.0tZ r0 = r2.getFMessage()
            X.0tZ r1 = r0.A0D()
            boolean r0 = r3 instanceof X.AnonymousClass31E
            if (r0 != 0) goto L_0x0138
            if (r1 == 0) goto L_0x013b
            X.1Vt r0 = r1.A0L
            if (r0 == 0) goto L_0x013b
            X.1lo r0 = r0.A01()
            if (r0 == 0) goto L_0x013b
        L_0x0138:
            r2.A10()
        L_0x013b:
            int r4 = r4 + 1
            goto L_0x010f
        L_0x013e:
            java.lang.Object r4 = r1.A00
            X.2jf r4 = (X.C55472jf) r4
            X.1yW r3 = r4.A0I
            X.0tZ r2 = r3.AFJ()
            if (r2 == 0) goto L_0x0161
            X.1Vt r0 = r2.A0L
            if (r0 == 0) goto L_0x0161
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0161
            X.0sK r1 = r4.A06
            X.1Vt r0 = r2.A0L
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0I(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0162
        L_0x0161:
            r1 = 0
        L_0x0162:
            com.obwhatsapp.mentions.MentionableEntry r0 = r4.A0V
            java.lang.String r0 = r0.getStringText()
            java.lang.String r0 = X.C40651uT.A05(r0)
            if (r1 != 0) goto L_0x0174
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0014
        L_0x0174:
            r3.AcQ()
            return
        L_0x0178:
            java.lang.Object r2 = r1.A00
            X.0yh r2 = (X.C19600yh) r2
            X.27r r3 = r2.A0F
            monitor-enter(r3)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0a89 }
            r4.<init>()     // Catch:{ all -> 0x0a89 }
            X.12D r6 = r3.A03     // Catch:{ all -> 0x0a89 }
            android.content.SharedPreferences r1 = r6.A01()     // Catch:{ all -> 0x0a89 }
            java.lang.String r0 = "current_running_sync"
            r5 = 0
            java.lang.String r0 = r1.getString(r0, r5)     // Catch:{ all -> 0x0a89 }
            if (r0 == 0) goto L_0x01a3
            X.27t r0 = X.C452727t.A00(r0)     // Catch:{ ClassCastException | JSONException -> 0x019d }
            if (r0 == 0) goto L_0x01a3
            r4.add(r0)     // Catch:{ ClassCastException | JSONException -> 0x019d }
            goto L_0x01a3
        L_0x019d:
            r1 = move-exception
            java.lang.String r0 = "SyncRequestStorage/restore/current_failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0a89 }
        L_0x01a3:
            android.content.SharedPreferences r1 = r6.A01()     // Catch:{ ClassCastException | JSONException -> 0x01cb }
            java.lang.String r0 = "queued_running_sync_set"
            java.util.Set r0 = r1.getStringSet(r0, r5)     // Catch:{ ClassCastException | JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x01d1
            java.util.Iterator r1 = r0.iterator()     // Catch:{ ClassCastException | JSONException -> 0x01cb }
        L_0x01b3:
            boolean r0 = r1.hasNext()     // Catch:{ ClassCastException | JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r0 = r1.next()     // Catch:{ ClassCastException | JSONException -> 0x01cb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException | JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x01b3
            X.27t r0 = X.C452727t.A00(r0)     // Catch:{ ClassCastException | JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x01b3
            r4.add(r0)     // Catch:{ ClassCastException | JSONException -> 0x01cb }
            goto L_0x01b3
        L_0x01cb:
            r1 = move-exception
            java.lang.String r0 = "SyncRequestStorage/restore/queue_failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0a89 }
        L_0x01d1:
            monitor-exit(r3)
            java.util.Iterator r1 = r4.iterator()
        L_0x01d6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.27t r0 = (X.C452727t) r0
            r2.A01(r0)
            goto L_0x01d6
        L_0x01e6:
            java.lang.Object r0 = r1.A00
            X.0tJ r0 = (X.C16590tJ) r0
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x01f2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1iY r0 = (X.C33421iY) r0
            r0.A00()
            goto L_0x01f2
        L_0x0202:
            java.lang.Object r0 = r1.A00
            r43 = r0
            r0 = r43
            X.0xz r0 = (X.C19230xz) r0
            r43 = r0
            X.0sK r0 = r0.A01
            boolean r44 = r0.A0G()
            r10 = 1
            r16 = 0
            r0 = r43
            X.12D r4 = r0.A07
            android.content.SharedPreferences r3 = r4.A01()
            if (r44 == 0) goto L_0x062e
            java.lang.String r2 = "last_status_full_sync"
        L_0x0221:
            r0 = -1
            long r1 = r3.getLong(r2, r0)
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x022c
            r10 = 0
        L_0x022c:
            r0 = r43
            X.0pd r2 = r0.A0D
            r1 = 1784(0x6f8, float:2.5E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r1 = r2.A0E(r0, r1)
            r0 = r43
            X.0t3 r0 = r0.A09
            if (r1 == 0) goto L_0x0303
            long r11 = r0.A00()
            r8 = 1800000(0x1b7740, double:8.89318E-318)
            if (r44 != 0) goto L_0x02de
            long r5 = r4.A00()
            long r5 = r5 - r11
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_contact_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r5 = r5 + r0
            if (r10 != 0) goto L_0x0260
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r7 = 0
            if (r0 > 0) goto L_0x0261
        L_0x0260:
            r7 = 1
        L_0x0261:
            android.content.SharedPreferences r3 = r4.A01()
            long r1 = r4.A00()
            java.lang.String r0 = "sidelist_full_sync_wait"
            long r5 = r3.getLong(r0, r1)
            long r5 = r5 - r11
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_sidelist_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r5 = r5 + r0
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x0284
            r0 = 1
        L_0x0284:
            if (r7 == 0) goto L_0x02d9
            X.27w r2 = X.C453027w.A0F
        L_0x0288:
            X.1kz r3 = X.C34861kz.A03
            java.util.Set r1 = java.util.Collections.emptySet()
            r0 = r43
            r0.A08(r2, r3, r1, r10)
        L_0x0293:
            if (r10 == 0) goto L_0x0014
            java.lang.String r0 = "contactsyncmethods/fullSyncAndInitialize/fullsync/neversynced"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r44 != 0) goto L_0x02a3
            r0 = r43
            X.0wn r0 = r0.A0E
            r0.A00()
        L_0x02a3:
            r0 = r43
            X.138 r1 = r0.A02
            r0 = 0
            r1.A00(r0)
            r0 = r43
            X.16m r0 = r0.A0C
            r0.A00()
            r0 = r43
            X.0ww r0 = r0.A0A
            X.0tq r0 = r0.A00
            r0.A04()
            java.io.File r0 = r0.A06
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0014
            r0 = r43
            X.11G r0 = r0.A0B
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0014
            r0 = r43
            X.0xb r1 = r0.A03
            com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob r0 = com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob.A00()
            r1.A00(r0)
            return
        L_0x02d9:
            if (r0 == 0) goto L_0x0293
            X.27w r2 = X.C453027w.A0G
            goto L_0x0288
        L_0x02de:
            android.content.SharedPreferences r3 = r4.A01()
            long r1 = r4.A00()
            java.lang.String r0 = "status_full_sync_wait"
            long r5 = r3.getLong(r0, r1)
            long r5 = r5 - r11
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_status_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r5 = r5 + r0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0293
            X.27w r2 = X.C453027w.A0A
            goto L_0x05f8
        L_0x0303:
            long r18 = r0.A00()
            long r40 = r4.A00()
            long r40 = r40 - r18
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_contact_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r40 = r40 + r0
            if (r44 != 0) goto L_0x0622
            if (r10 != 0) goto L_0x0323
            int r0 = (r40 > r16 ? 1 : (r40 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0622
        L_0x0323:
            r8 = 1
        L_0x0324:
            android.content.SharedPreferences r3 = r4.A01()
            long r0 = r4.A00()
            java.lang.String r2 = "sidelist_full_sync_wait"
            long r38 = r3.getLong(r2, r0)
            long r38 = r38 - r18
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_sidelist_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r38 = r38 + r0
            if (r44 != 0) goto L_0x034a
            int r0 = (r38 > r16 ? 1 : (r38 == r16 ? 0 : -1))
            r9 = 1
            if (r0 <= 0) goto L_0x034b
        L_0x034a:
            r9 = 0
        L_0x034b:
            android.content.SharedPreferences r3 = r4.A01()
            long r0 = r4.A00()
            java.lang.String r2 = "status_full_sync_wait"
            long r36 = r3.getLong(r2, r0)
            long r36 = r36 - r18
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_status_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r36 = r36 + r0
            int r0 = (r36 > r16 ? 1 : (r36 == r16 ? 0 : -1))
            r11 = 0
            if (r0 > 0) goto L_0x0370
            r11 = 1
        L_0x0370:
            android.content.SharedPreferences r3 = r4.A01()
            long r0 = r4.A00()
            java.lang.String r2 = "picture_full_sync_wait"
            long r6 = r3.getLong(r2, r0)
            long r6 = r6 - r18
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_picture_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r6 = r6 + r0
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r42 = 0
            if (r0 > 0) goto L_0x0395
            r42 = 1
        L_0x0395:
            android.content.SharedPreferences r3 = r4.A01()
            long r0 = r4.A00()
            java.lang.String r2 = "business_full_sync_wait"
            long r34 = r3.getLong(r2, r0)
            long r34 = r34 - r18
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_business_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r34 = r34 + r0
            int r0 = (r34 > r16 ? 1 : (r34 == r16 ? 0 : -1))
            r33 = 0
            if (r0 > 0) goto L_0x03bb
            r33 = 1
        L_0x03bb:
            android.content.SharedPreferences r3 = r4.A01()
            long r0 = r4.A00()
            java.lang.String r2 = "devices_full_sync_wait"
            long r31 = r3.getLong(r2, r0)
            long r31 = r31 - r18
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_devices_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r31 = r31 + r0
            int r0 = (r31 > r16 ? 1 : (r31 == r16 ? 0 : -1))
            r14 = 0
            if (r0 > 0) goto L_0x03df
            r14 = 1
        L_0x03df:
            android.content.SharedPreferences r3 = r4.A01()
            long r0 = r4.A00()
            java.lang.String r2 = "payment_full_sync_wait"
            long r29 = r3.getLong(r2, r0)
            long r29 = r29 - r18
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_payment_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r29 = r29 + r0
            int r0 = (r29 > r16 ? 1 : (r29 == r16 ? 0 : -1))
            r13 = 0
            if (r0 > 0) goto L_0x0403
            r13 = 1
        L_0x0403:
            android.content.SharedPreferences r3 = r4.A01()
            long r0 = r4.A00()
            java.lang.String r2 = "disappearing_mode_full_sync_wait"
            long r27 = r3.getLong(r2, r0)
            long r27 = r27 - r18
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "last_disappearing_mode_full_sync"
            r0 = -1
            long r0 = r3.getLong(r2, r0)
            long r27 = r27 + r0
            int r0 = (r27 > r16 ? 1 : (r27 == r16 ? 0 : -1))
            r15 = 0
            if (r0 > 0) goto L_0x0427
            r15 = 1
        L_0x0427:
            android.content.SharedPreferences r3 = r4.A01()
            java.lang.String r2 = "contact_lid_sync_wait"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r3.getLong(r2, r0)
            long r2 = r2 - r18
            android.content.SharedPreferences r5 = r4.A01()
            java.lang.String r4 = "last_lid_full_sync"
            r0 = -1
            long r0 = r5.getLong(r4, r0)
            long r2 = r2 + r0
            if (r44 != 0) goto L_0x061f
            if (r10 != 0) goto L_0x044b
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x061f
        L_0x044b:
            r12 = 1
        L_0x044c:
            if (r8 != 0) goto L_0x045e
            if (r9 != 0) goto L_0x045e
            if (r11 != 0) goto L_0x045e
            if (r42 != 0) goto L_0x045e
            if (r33 != 0) goto L_0x045e
            if (r14 != 0) goto L_0x045e
            if (r13 != 0) goto L_0x045e
            if (r15 != 0) goto L_0x045e
            if (r12 == 0) goto L_0x0293
        L_0x045e:
            r4 = 1800000(0x1b7740, double:8.89318E-318)
            if (r44 != 0) goto L_0x0469
            int r0 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            r26 = 1
            if (r0 <= 0) goto L_0x046d
        L_0x0469:
            r26 = 0
            if (r44 != 0) goto L_0x0473
        L_0x046d:
            int r0 = (r38 > r4 ? 1 : (r38 == r4 ? 0 : -1))
            r25 = 1
            if (r0 <= 0) goto L_0x0475
        L_0x0473:
            r25 = 0
        L_0x0475:
            int r0 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            r24 = 0
            if (r0 > 0) goto L_0x047d
            r24 = 1
        L_0x047d:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r23 = 0
            if (r0 > 0) goto L_0x0485
            r23 = 1
        L_0x0485:
            int r0 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            r22 = 0
            if (r0 > 0) goto L_0x048d
            r22 = 1
        L_0x048d:
            int r0 = (r31 > r4 ? 1 : (r31 == r4 ? 0 : -1))
            r21 = 0
            if (r0 > 0) goto L_0x0495
            r21 = 1
        L_0x0495:
            int r0 = (r29 > r4 ? 1 : (r29 == r4 ? 0 : -1))
            r20 = 0
            if (r0 > 0) goto L_0x049d
            r20 = 1
        L_0x049d:
            int r0 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            r19 = 0
            if (r0 > 0) goto L_0x04a5
            r19 = 1
        L_0x04a5:
            if (r44 != 0) goto L_0x04ad
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r18 = 1
            if (r0 <= 0) goto L_0x04af
        L_0x04ad:
            r18 = 0
        L_0x04af:
            java.lang.String r0 = "contactsyncmethods/getProtocolsForFullSync/sync: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r0 = "contactSyncDue="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r7 = " ("
            r6.append(r7)
            r16 = 60000(0xea60, double:2.9644E-319)
            long r40 = r40 / r16
            r0 = r40
            r6.append(r0)
            java.lang.String r5 = "min)"
            r6.append(r5)
            java.lang.String r4 = " (soon)"
            if (r8 != 0) goto L_0x04db
            if (r26 == 0) goto L_0x04db
            r6.append(r4)
        L_0x04db:
            java.lang.String r0 = "sidelistSyncDue="
            r6.append(r0)
            r6.append(r9)
            r6.append(r7)
            long r38 = r38 / r16
            r0 = r38
            r6.append(r0)
            r6.append(r5)
            if (r9 != 0) goto L_0x04f8
            if (r25 == 0) goto L_0x04f8
            r6.append(r4)
        L_0x04f8:
            java.lang.String r0 = ", statusSyncDue="
            r6.append(r0)
            r6.append(r11)
            r6.append(r7)
            long r36 = r36 / r16
            r0 = r36
            r6.append(r0)
            r6.append(r5)
            if (r11 != 0) goto L_0x0514
            if (r24 == 0) goto L_0x0514
            r6.append(r4)
        L_0x0514:
            if (r42 != 0) goto L_0x051b
            if (r23 == 0) goto L_0x051b
            r6.append(r4)
        L_0x051b:
            java.lang.String r0 = ", businessSyncDue="
            r6.append(r0)
            r0 = r33
            r6.append(r0)
            r6.append(r7)
            long r34 = r34 / r16
            r0 = r34
            r6.append(r0)
            r6.append(r5)
            if (r33 != 0) goto L_0x0539
            if (r22 == 0) goto L_0x0539
            r6.append(r4)
        L_0x0539:
            java.lang.String r0 = ", devicesSyncDue="
            r6.append(r0)
            r6.append(r14)
            r6.append(r7)
            long r31 = r31 / r16
            r0 = r31
            r6.append(r0)
            r6.append(r5)
            if (r14 != 0) goto L_0x0555
            if (r21 == 0) goto L_0x0555
            r6.append(r4)
        L_0x0555:
            java.lang.String r0 = ", paymentSyncDue="
            r6.append(r0)
            r6.append(r13)
            r6.append(r7)
            long r29 = r29 / r16
            r0 = r29
            r6.append(r0)
            r6.append(r5)
            if (r13 != 0) goto L_0x0571
            if (r20 == 0) goto L_0x0571
            r6.append(r4)
        L_0x0571:
            java.lang.String r0 = ", disappearingModeSyncDue="
            r6.append(r0)
            r6.append(r15)
            r6.append(r7)
            long r27 = r27 / r16
            r0 = r27
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = "lidSyncDue="
            r6.append(r0)
            r6.append(r12)
            r6.append(r7)
            long r2 = r2 / r16
            r6.append(r2)
            r6.append(r5)
            if (r12 != 0) goto L_0x05a0
            if (r18 == 0) goto L_0x05a0
            r6.append(r4)
        L_0x05a0:
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r8 != 0) goto L_0x05ad
            r27 = 0
            if (r26 == 0) goto L_0x05af
        L_0x05ad:
            r27 = 1
        L_0x05af:
            if (r9 != 0) goto L_0x05b5
            r28 = 0
            if (r25 == 0) goto L_0x05b7
        L_0x05b5:
            r28 = 1
        L_0x05b7:
            if (r11 != 0) goto L_0x05bd
            r29 = 0
            if (r24 == 0) goto L_0x05bf
        L_0x05bd:
            r29 = 1
        L_0x05bf:
            if (r42 != 0) goto L_0x05c5
            r30 = 0
            if (r23 == 0) goto L_0x05c7
        L_0x05c5:
            r30 = 1
        L_0x05c7:
            if (r33 != 0) goto L_0x05cd
            r31 = 0
            if (r22 == 0) goto L_0x05cf
        L_0x05cd:
            r31 = 1
        L_0x05cf:
            if (r14 != 0) goto L_0x05d5
            r32 = 0
            if (r21 == 0) goto L_0x05d7
        L_0x05d5:
            r32 = 1
        L_0x05d7:
            if (r13 != 0) goto L_0x05dd
            r33 = 0
            if (r20 == 0) goto L_0x05df
        L_0x05dd:
            r33 = 1
        L_0x05df:
            if (r15 != 0) goto L_0x05e5
            r34 = 0
            if (r19 == 0) goto L_0x05e7
        L_0x05e5:
            r34 = 1
        L_0x05e7:
            if (r12 != 0) goto L_0x05ed
            r35 = 0
            if (r18 == 0) goto L_0x05ef
        L_0x05ed:
            r35 = 1
        L_0x05ef:
            X.27w r2 = new X.27w
            r26 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            if (r44 == 0) goto L_0x0288
        L_0x05f8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = r43
            X.0sG r0 = r0.A05
            java.util.ArrayList r0 = r0.A0F()
            java.util.Iterator r3 = r0.iterator()
        L_0x0609:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0625
            java.lang.Object r1 = r3.next()
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            r4.add(r0)
            goto L_0x0609
        L_0x061f:
            r12 = 0
            goto L_0x044c
        L_0x0622:
            r8 = 0
            goto L_0x0324
        L_0x0625:
            X.1kz r1 = X.C34861kz.A04
            r0 = r43
            r0.A08(r2, r1, r4, r10)
            goto L_0x0293
        L_0x062e:
            java.lang.String r2 = "last_contact_full_sync"
            goto L_0x0221
        L_0x0632:
            java.lang.Object r5 = r1.A00
            X.10w r5 = (X.C206210w) r5
            X.0pd r2 = r5.A06
            r1 = 1144(0x478, float:1.603E-42)
            X.0tM r0 = X.C16620tM.A02
            int r1 = r2.A03(r0, r1)
            r0 = -1
            if (r1 == r0) goto L_0x0014
            X.0sK r0 = r5.A00
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0014
            X.12D r4 = r5.A04
            android.content.SharedPreferences r1 = r4.A01()
            java.lang.String r0 = "last_out_contact_sync_time"
            r6 = -1
            long r2 = r1.getLong(r0, r6)
            android.content.SharedPreferences r1 = r4.A01()
            java.lang.String r0 = "last_contact_full_sync"
            long r0 = r1.getLong(r0, r6)
            long r1 = java.lang.Math.max(r2, r0)
            X.0t3 r0 = r5.A05
            long r3 = r0.A00()
            long r3 = r3 - r1
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0014
            X.0sq r2 = r5.A07
            r0 = 2
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r1 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6
            r1.<init>(r5, r0)
            java.lang.String r0 = "ContactDiscoverySyncHelper/syncOutContact"
            r2.Acm(r1, r0)
            return
        L_0x0683:
            java.lang.Object r4 = r1.A00
            X.10w r4 = (X.C206210w) r4
            X.12D r1 = r4.A04
            X.0t3 r0 = r4.A05
            long r2 = r0.A00()
            android.content.SharedPreferences r0 = r1.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "last_out_contact_sync_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            X.0xz r7 = r4.A03
            X.0sK r0 = r7.A01
            boolean r0 = r0.A0G()
            r1 = r0 ^ 1
            java.lang.String r0 = "ContactSyncMethods/syncOutContact/out contacts should not be synced in companion mode"
            X.AnonymousClass00B.A0D(r0, r1)
            X.0sG r0 = r7.A05
            java.util.List r0 = r0.A0H()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x06be:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06d2
            java.lang.Object r1 = r2.next()
            X.0sH r1 = (X.C16010sH) r1
            boolean r0 = r1.A0i
            if (r0 != 0) goto L_0x06be
            r3.add(r1)
            goto L_0x06be
        L_0x06d2:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x06db:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06f3
            java.lang.Object r1 = r2.next()
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x06db
            r10.add(r0)
            goto L_0x06db
        L_0x06f3:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0014
            X.1kz r9 = X.C34861kz.A0I
            X.27w r8 = X.C453027w.A0C
            r11 = 0
            r12 = 0
            X.1kE r0 = r7.A02(r8, r9, r10, r11, r12)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r3)
            java.lang.Object r0 = r1.first
            X.1kE r0 = (X.C34421kE) r0
            java.lang.Object r6 = r1.second
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            X.284 r0 = (X.AnonymousClass284) r0     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            boolean r0 = r0.A00()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            if (r0 == 0) goto L_0x0014
            X.0sG r0 = r4.A01     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            java.util.List r0 = r0.A0H()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            r3.<init>()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
        L_0x072b:
            boolean r0 = r2.hasNext()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            if (r0 == 0) goto L_0x0a8c
            java.lang.Object r1 = r2.next()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            boolean r0 = r1.A0i     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            if (r0 != 0) goto L_0x072b
            r3.add(r1)     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            goto L_0x072b
        L_0x073f:
            java.lang.Object r0 = r1.A00
            X.4E7 r0 = (X.AnonymousClass4E7) r0
            X.1yj r3 = r0.A00
            X.0sH r2 = r3.A2l
            X.0sK r1 = r3.A10
            X.0rv r0 = r2.A0E
            boolean r0 = r1.A0I(r0)
            com.obwhatsapp.dialogs.CreateOrAddToContactsDialog r2 = com.obwhatsapp.dialogs.CreateOrAddToContactsDialog.A01(r2, r0)
            X.1yV r0 = r3.A22
            X.02C r1 = r0.AGM()
            r0 = 0
            r2.A1G(r1, r0)
            return
        L_0x075e:
            java.lang.Object r0 = r1.A00
            X.1yj r0 = (X.C42821yj) r0
            X.17F r1 = r0.A2f
            X.1xi r0 = r0.A2g
            r1.A0M(r0)
            return
        L_0x076a:
            java.lang.Object r1 = r1.A00
            X.1yj r1 = (X.C42821yj) r1
            r0 = 1
            r1.A0n(r0)
            r0 = 0
            r1.A01 = r0
            return
        L_0x0776:
            java.lang.Object r2 = r1.A00
            X.1yj r2 = (X.C42821yj) r2
            X.1yV r0 = r2.A22
            boolean r0 = r0.AJX()
            if (r0 != 0) goto L_0x0788
            X.2Jn r1 = r2.A2v
            X.3ps r0 = X.C42821yj.A5L
            r1.A09 = r0
        L_0x0788:
            com.obwhatsapp.conversation.ConversationListView r1 = r2.A1n
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x0792
            r0 = 2
            r1.setTranscriptMode(r0)
        L_0x0792:
            X.2Jm r0 = r2.A2w
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x07a0
            X.2Jm r1 = r2.A2w
            r0 = 1
            r1.A00(r0)
        L_0x07a0:
            r2.A0L()
            return
        L_0x07a4:
            java.lang.Object r1 = r1.A00
            X.1yj r1 = (X.C42821yj) r1
            r0 = -1
            r1.A01 = r0
            r0 = 1
            int r0 = r1.A04(r0)
            r1.A0R(r0)
            return
        L_0x07b4:
            java.lang.Object r2 = r1.A00
            X.1yj r2 = (X.C42821yj) r2
            X.1yV r0 = r2.A22
            X.1yR r0 = (X.AnonymousClass1yR) r0
            X.2DF r0 = r0.A00
            com.obwhatsapp.reactions.ReactionsTrayViewModel r0 = r0.A0j
            X.0tZ r4 = r0.A02
            X.AnonymousClass00B.A06(r4)
            com.obwhatsapp.conversation.ConversationListView r0 = r2.A1n
            X.2Qa r1 = r0.getConversationCursorAdapter()
            X.1kZ r3 = r2.A2C
            int r7 = r1.A01()
            com.obwhatsapp.conversation.ConversationListView r0 = r2.A1n
            int r8 = r0.getFirstVisiblePosition()
            int r9 = r1.getCount()
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = 0
            r10 = 0
            r3.A0K(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x07e5:
            java.lang.Object r0 = r1.A00
            X.1yj r0 = (X.C42821yj) r0
            X.0wL r2 = r0.A36
            X.1wN r1 = r0.A2D
            X.1ZR r0 = r1.A01
            r2.A05(r0, r1)
            return
        L_0x07f3:
            java.lang.Object r0 = r1.A00
            X.1yj r0 = (X.C42821yj) r0
            X.1BZ r2 = r0.A1h
            java.lang.String r1 = "community-no-longer-available"
            X.1yV r0 = r0.A22
            X.00l r0 = (X.C001000l) r0
            r2.A00(r0, r1)
            return
        L_0x0803:
            java.lang.Object r4 = r1.A00
            X.1yj r4 = (X.C42821yj) r4
            X.1yV r1 = r4.A22
            android.content.Context r1 = (android.content.Context) r1
            X.0sH r0 = r4.A2l
            X.0rv r3 = r0.A0E
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.group.GroupAdminPickerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = X.C16030sJ.A03(r3)
            java.lang.String r0 = "gid"
            r2.putExtra(r0, r1)
            X.1yV r1 = r4.A22
            r0 = 42
            r1.Ag3(r2, r0)
            return
        L_0x082e:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.conversation.ConversationListView r0 = (com.obwhatsapp.conversation.ConversationListView) r0
            r0.A04()
            return
        L_0x0836:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = (com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity) r1
            android.widget.BaseAdapter r0 = r1.A01
            r0.notifyDataSetChanged()
            r1.A36()
            return
        L_0x0843:
            java.lang.Object r6 = r1.A00
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r6 = (com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity) r6
            X.391 r7 = new X.391
            r7.<init>(r6)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A05 = r0
            X.0tZ r1 = r6.A0M
            X.1Vw r0 = r1.A11
            X.0rv r0 = r0.A00
            r7.A01 = r0
            byte r0 = r1.A10
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Set r1 = java.util.Collections.singleton(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r7.A0R = r0
            X.0tZ r5 = r6.A0M
            byte r4 = r5.A10
            r0 = 3
            if (r4 != r0) goto L_0x08a8
            r0 = r5
            X.0tY r0 = (X.C16730tY) r0
            int r0 = r0.A00
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
        L_0x0884:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r7.A0L = r0
            if (r4 != 0) goto L_0x08a6
            java.lang.String r0 = r5.A0I()
            X.AnonymousClass00B.A06(r0)
            int r0 = r0.length()
        L_0x0897:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A0J = r0
            android.content.Intent r1 = r7.A00()
            r0 = 2
            r6.startActivityForResult(r1, r0)
            return
        L_0x08a6:
            r0 = 0
            goto L_0x0897
        L_0x08a8:
            r2 = 0
            goto L_0x0884
        L_0x08ab:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            X.0s5 r1 = r2.A06
            X.0tZ r0 = r2.A0M
            com.obwhatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment.A01(r2, r1, r0)
            return
        L_0x08b7:
            java.lang.Object r1 = r1.A00
            X.2DF r1 = (X.AnonymousClass2DF) r1
            r0 = 0
            r1.A0n = r0
            return
        L_0x08bf:
            java.lang.Object r0 = r1.A00
            X.1bb r0 = (X.C30011bb) r0
            r0.A0t()
            return
        L_0x08c7:
            java.lang.Object r2 = r1.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x08d5
            r0 = 1
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x08d5:
            r2.cancelLongPress()
            r0 = 0
            r2.setPressed(r0)
            return
        L_0x08dd:
            java.lang.Object r0 = r1.A00
            X.1Fu r0 = (X.C24401Fu) r0
            X.0rz r1 = r0.A01
            r0 = 1
            r1.A1H(r0)
            return
        L_0x08e8:
            java.lang.Object r0 = r1.A00
            X.1cT r0 = (X.C30511cT) r0
            r0.A05()
            return
        L_0x08f0:
            java.lang.Object r1 = r1.A00
            X.04N r1 = (X.AnonymousClass04N) r1
            r0 = 0
            r1.accept(r0)
            return
        L_0x08f9:
            java.lang.Object r0 = r1.A00
            X.2ks r0 = (X.C56052ks) r0
            X.15I r5 = r0.A09
            goto L_0x0913
        L_0x0900:
            java.lang.Object r0 = r1.A00
            X.2AK r0 = (X.AnonymousClass2AK) r0
            X.0tb r2 = r0.A06
            X.0rv r1 = r0.A0Y
            r0 = 3
            r2.A0D(r1, r0)
            return
        L_0x090d:
            java.lang.Object r0 = r1.A00
            X.2AK r0 = (X.AnonymousClass2AK) r0
            X.15I r5 = r0.A0J
        L_0x0913:
            X.0rv r0 = r0.A0Y
            monitor-enter(r5)
            android.content.SharedPreferences r6 = r5.A05()     // Catch:{ all -> 0x094f }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x094f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x094f }
            r1.<init>()     // Catch:{ all -> 0x094f }
            r1.append(r0)     // Catch:{ all -> 0x094f }
            java.lang.String r0 = "_actions"
            r1.append(r0)     // Catch:{ all -> 0x094f }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x094f }
            java.lang.String r0 = "0"
            java.lang.String r2 = r6.getString(r4, r0)     // Catch:{ all -> 0x094f }
            r0 = 0
            long r2 = X.C29501aj.A01(r2, r0)     // Catch:{ all -> 0x094f }
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r1 = r6.edit()     // Catch:{ all -> 0x094f }
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x094f }
            android.content.SharedPreferences$Editor r0 = r1.putString(r4, r0)     // Catch:{ all -> 0x094f }
            r0.apply()     // Catch:{ all -> 0x094f }
            monitor-exit(r5)
            return
        L_0x094f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0952:
            java.lang.Object r3 = r1.A00
            X.2AK r3 = (X.AnonymousClass2AK) r3
            X.0tb r2 = r3.A06
            X.0rv r1 = r3.A0Y
            r0 = 1
            r2.A0I(r1, r0)
            X.0vJ r0 = r3.A0R
            X.1ZT r1 = (X.AnonymousClass1ZT) r1
            X.1ZX r2 = r0.A00(r1)
            X.0ph r0 = r3.A0X
            X.00k r1 = r3.A01
            android.content.Intent r0 = r0.A0x(r1, r2)
            r1.startActivity(r0)
            return
        L_0x0972:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.conversation.ConversationListView r1 = (com.obwhatsapp.conversation.ConversationListView) r1
            r0 = 2
            r1.setTranscriptMode(r0)
            r1.A02()
            return
        L_0x097e:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.conversation.ConversationListView r0 = (com.obwhatsapp.conversation.ConversationListView) r0
            r0.A05()
            return
        L_0x0986:
            java.lang.Object r0 = r1.A00
            X.2Vb r0 = (X.C49692Vb) r0
            r0.A00()
            return
        L_0x098e:
            java.lang.Object r0 = r1.A00
            X.289 r0 = (X.AnonymousClass289) r0
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6.super.dismiss()
            return
        L_0x0996:
            java.lang.Object r2 = r1.A00
            X.16U r2 = (X.AnonymousClass16U) r2
            monitor-enter(r2)
            java.util.Set r1 = r2.A00()     // Catch:{ all -> 0x09c6 }
            r1.size()     // Catch:{ all -> 0x09c6 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x09c6 }
            if (r0 != 0) goto L_0x09c4
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]     // Catch:{ all -> 0x09c6 }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x09c6 }
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1     // Catch:{ all -> 0x09c6 }
            r0 = 3
            r2.A01(r1, r0)     // Catch:{ all -> 0x09c6 }
            X.0rz r0 = r2.A05     // Catch:{ all -> 0x09c6 }
            android.content.SharedPreferences$Editor r1 = r0.A0K()     // Catch:{ all -> 0x09c6 }
            java.lang.String r0 = "pending_users_to_sync_device"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x09c6 }
            r0.apply()     // Catch:{ all -> 0x09c6 }
        L_0x09c4:
            monitor-exit(r2)
            return
        L_0x09c6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x09c9:
            java.lang.Object r7 = r1.A00
            X.0yh r7 = (X.C19600yh) r7
            java.util.concurrent.atomic.AtomicBoolean r5 = r7.A0U
            monitor-enter(r5)
            X.27r r6 = r7.A0F     // Catch:{ all -> 0x0a24 }
            monitor-enter(r6)     // Catch:{ all -> 0x0a24 }
            java.util.Set r4 = r6.A02     // Catch:{ all -> 0x0a21 }
            monitor-exit(r6)     // Catch:{ all -> 0x0a24 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0a24 }
        L_0x09da:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0a24 }
            if (r0 == 0) goto L_0x09fa
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0a24 }
            X.27t r2 = (X.C452727t) r2     // Catch:{ all -> 0x0a24 }
            android.os.Handler r1 = r7.A00()     // Catch:{ all -> 0x0a24 }
            monitor-enter(r6)     // Catch:{ all -> 0x0a24 }
            java.util.Map r0 = r6.A01     // Catch:{ all -> 0x0a21 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0a21 }
            X.27u r0 = (X.C452827u) r0     // Catch:{ all -> 0x0a21 }
            java.lang.Runnable r0 = r0.A01     // Catch:{ all -> 0x0a21 }
            monitor-exit(r6)     // Catch:{ all -> 0x0a24 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0a24 }
            goto L_0x09da
        L_0x09fa:
            r6.A01()     // Catch:{ all -> 0x0a24 }
            X.27s r1 = r7.A0E     // Catch:{ all -> 0x0a24 }
            monitor-enter(r1)     // Catch:{ all -> 0x0a24 }
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x0a1e }
            r0.<init>()     // Catch:{ all -> 0x0a1e }
            r1.A00 = r0     // Catch:{ all -> 0x0a1e }
            monitor-exit(r1)     // Catch:{ all -> 0x0a24 }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x0a24 }
        L_0x0a0c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0a24 }
            if (r0 == 0) goto L_0x0a1c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0a24 }
            X.27t r0 = (X.C452727t) r0     // Catch:{ all -> 0x0a24 }
            r7.A01(r0)     // Catch:{ all -> 0x0a24 }
            goto L_0x0a0c
        L_0x0a1c:
            monitor-exit(r5)     // Catch:{ all -> 0x0a24 }
            return
        L_0x0a1e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0a24 }
            goto L_0x0a23
        L_0x0a21:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0a24 }
        L_0x0a23:
            throw r0     // Catch:{ all -> 0x0a24 }
        L_0x0a24:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0a24 }
            throw r0
        L_0x0a27:
            java.lang.Object r0 = r1.A00
            X.120 r0 = (X.AnonymousClass120) r0
            X.1Cv r0 = r0.A02
            X.1kk r0 = r0.A01()
            r1 = 0
            X.1km r0 = r0.A02
            r0.A05(r1)
            return
        L_0x0a38:
            java.lang.Object r1 = r1.A00
            X.0xz r1 = (X.C19230xz) r1
            r1.A06()     // Catch:{ RuntimeException -> 0x0a40 }
            goto L_0x0a51
        L_0x0a40:
            r0 = move-exception
            java.lang.String r3 = "contactsyncmethods/forceSyncIfNeeded"
            com.whatsapp.util.Log.e(r3, r0)
            X.0so r2 = r1.A00
            java.lang.String r1 = r0.getMessage()
            r0 = 1
            r2.AcB(r3, r1, r0)
            return
        L_0x0a51:
            return
        L_0x0a52:
            java.lang.Object r2 = r1.A00
            X.1V8 r2 = (X.AnonymousClass1V8) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A09
            X.28C r0 = r2.A0e
            int r0 = r0.A0C()
            r1.A0a(r0)
            r2.A3I()
            return
        L_0x0a65:
            java.lang.Object r0 = r1.A00
            X.12A r0 = (X.AnonymousClass12A) r0
            X.10K r0 = r0.A09
            java.lang.String r2 = "user_profile_photo"
            X.0tq r0 = r0.A01     // Catch:{ SQLException -> 0x0a82 }
            X.0tf r1 = r0.A02()     // Catch:{ SQLException -> 0x0a82 }
            X.0tg r0 = r1.A02     // Catch:{ all -> 0x0a7d }
            X.C33971jU.A01(r0, r2)     // Catch:{ all -> 0x0a7d }
            r1.close()     // Catch:{ SQLException -> 0x0a82 }
            return
        L_0x0a7d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0a81 }
        L_0x0a81:
            throw r0     // Catch:{ SQLException -> 0x0a82 }
        L_0x0a82:
            r1 = move-exception
            java.lang.String r0 = "UserSettingsStore/updatePushName/Error updating push name"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0a89:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0a8c:
            r6.removeAll(r3)     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            X.16l r5 = r4.A02     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            X.0pd r2 = r5.A04     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            r1 = 1666(0x682, float:2.335E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            if (r0 == 0) goto L_0x0ab8
            int r0 = r6.size()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            long r3 = (long) r0     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0ab8
            X.28P r1 = new X.28P     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            r1.A00 = r0     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            X.0t9 r0 = r5.A05     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            r0.A06(r1)     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
        L_0x0ab8:
            r7.A0A(r6)     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            r5.A01(r6, r0)     // Catch:{ InterruptedException -> 0x0ad6, ExecutionException -> 0x0ac3 }
            return
        L_0x0ac3:
            r2 = move-exception
            java.lang.String r1 = "ContactDiscoverySyncHelper/syncOutContact/ExecutionException="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0ad6:
            r2 = move-exception
            java.lang.String r1 = "ContactDiscoverySyncHelper/syncOutContact/InterruptedException="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape7S0100000_I0_6.run():void");
    }
}
