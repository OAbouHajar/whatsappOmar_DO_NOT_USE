package com.facebook.redex;

public class RunnableRunnableShape4S0200000_I0_2 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape4S0200000_I0_2(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0429, code lost:
        r3.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x042c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0652, code lost:
        r0.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0655, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0704, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0707, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        if (r10 != null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0195, code lost:
        if (r5.A05 != -1) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019c, code lost:
        if (r5.A05 == 0) goto L_0x019e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:373:0x09b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:378:0x09be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:383:0x09c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:388:0x09c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:445:0x0b04 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:445:0x0b04=Splitter:B:445:0x0b04, B:63:0x014d=Splitter:B:63:0x014d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r6 = r17
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x0ab3;
                case 1: goto L_0x0a95;
                case 2: goto L_0x04af;
                case 3: goto L_0x0499;
                case 4: goto L_0x0475;
                case 5: goto L_0x044f;
                case 6: goto L_0x042d;
                case 7: goto L_0x042d;
                case 8: goto L_0x0a87;
                case 9: goto L_0x0a75;
                case 10: goto L_0x0a5c;
                case 11: goto L_0x0401;
                case 12: goto L_0x0a38;
                case 13: goto L_0x03dd;
                case 14: goto L_0x03ba;
                case 15: goto L_0x0a2c;
                case 16: goto L_0x0a17;
                case 17: goto L_0x0369;
                case 18: goto L_0x0778;
                case 19: goto L_0x076a;
                case 20: goto L_0x0745;
                case 21: goto L_0x06f0;
                case 22: goto L_0x0352;
                case 23: goto L_0x030c;
                case 24: goto L_0x029d;
                case 25: goto L_0x0694;
                case 26: goto L_0x0278;
                case 27: goto L_0x0254;
                case 28: goto L_0x067e;
                case 29: goto L_0x0230;
                case 30: goto L_0x0670;
                case 31: goto L_0x0007;
                case 32: goto L_0x0007;
                case 33: goto L_0x020c;
                case 34: goto L_0x01e8;
                case 35: goto L_0x0664;
                case 36: goto L_0x0656;
                case 37: goto L_0x01c6;
                case 38: goto L_0x0631;
                case 39: goto L_0x0621;
                case 40: goto L_0x0606;
                case 41: goto L_0x05eb;
                case 42: goto L_0x017e;
                case 43: goto L_0x0015;
                case 44: goto L_0x05d5;
                case 45: goto L_0x05a8;
                case 46: goto L_0x057d;
                case 47: goto L_0x056a;
                case 48: goto L_0x04fc;
                case 49: goto L_0x04c5;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r6.A00
            X.0sG r0 = (X.C16000sG) r0
            java.lang.Object r1 = r6.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.0ub r0 = r0.A07
            r0.A07(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r4 = r6.A00
            X.12A r4 = (X.AnonymousClass12A) r4
            java.lang.Object r8 = r6.A01
            X.277 r8 = (X.AnonymousClass277) r8
            X.0sG r1 = r4.A03
            X.0rv r0 = r8.A03
            X.0sH r3 = r1.A0A(r0)
            int r12 = r8.A02
            r6 = 0
            r11 = 1
            if (r12 != r11) goto L_0x00fb
            byte[] r5 = r8.A00
        L_0x002d:
            r10 = 2
            if (r12 != r10) goto L_0x0032
            byte[] r6 = r8.A00
        L_0x0032:
            r4.A02(r3, r5, r6)
            int r13 = r3.A04
            java.lang.String r9 = " should be >= "
            r2 = 0
            if (r5 == 0) goto L_0x00b4
            int r13 = r8.A01
            r7 = r13
        L_0x003f:
            int r14 = r3.A05
            if (r6 == 0) goto L_0x0071
            r2 = r7
        L_0x0044:
            r4.A01(r3, r13, r2)
            X.0vc r0 = r4.A0A
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r3.A08(r2)
            if (r12 != r11) goto L_0x006e
            X.1ui r0 = r0.A01
        L_0x0053:
            r0.A01(r1)
            boolean r0 = r3.A0J()
            if (r0 == 0) goto L_0x016d
            if (r12 != r10) goto L_0x016d
            X.0yz r12 = r4.A08
            com.whatsapp.jid.Jid r2 = r3.A08(r2)
            X.0rv r2 = (X.C15830rv) r2
            X.0tq r0 = r12.A09
            X.0tf r9 = r0.get()
            goto L_0x00fe
        L_0x006e:
            X.1ui r0 = r0.A02
            goto L_0x0053
        L_0x0071:
            if (r14 == r7) goto L_0x008c
            if (r7 >= r14) goto L_0x008e
            java.lang.String r1 = "ContactPhotoUpdater/writeProfilePhotoToDb received photo_thumb_id invalid, "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            r0.append(r9)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x008c:
            r2 = r14
            goto L_0x0044
        L_0x008e:
            X.120 r0 = r4.A05
            java.io.File r9 = r0.A01(r3)
            if (r9 == 0) goto L_0x0044
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x0044
            boolean r0 = r9.delete()
            if (r0 != 0) goto L_0x0044
            java.lang.String r1 = "ContactPhotoUpdater/writeProfilePhotoToDb failed to delete; file="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0044
        L_0x00b4:
            int r7 = r8.A01
            if (r13 == r7) goto L_0x003f
            if (r7 >= r13) goto L_0x00d3
            java.lang.String r1 = "received photo_full_id invalid, "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            r0.append(r9)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x003f
        L_0x00d3:
            X.120 r0 = r4.A05
            java.io.File r13 = r0.A00(r3)
            if (r13 == 0) goto L_0x00f8
            boolean r0 = r13.exists()
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r13.delete()
            if (r0 != 0) goto L_0x00f8
            java.lang.String r1 = "failed to delete; file="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00f8:
            r13 = 0
            goto L_0x003f
        L_0x00fb:
            r5 = r6
            goto L_0x002d
        L_0x00fe:
            java.lang.String[] r10 = new java.lang.String[r11]     // Catch:{ all -> 0x0b05 }
            r11 = 0
            X.0ts r0 = r12.A03     // Catch:{ all -> 0x0b05 }
            long r0 = r0.A02(r2)     // Catch:{ all -> 0x0b05 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0b05 }
            r10[r11] = r0     // Catch:{ all -> 0x0b05 }
            X.17r r0 = r12.A0A     // Catch:{ all -> 0x0b05 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0b05 }
            if (r0 == 0) goto L_0x0120
            java.lang.String r1 = X.C39511sb.A02     // Catch:{ all -> 0x0b05 }
        L_0x0117:
            X.0tg r0 = r9.A02     // Catch:{ all -> 0x0b05 }
            android.database.Cursor r10 = r0.A08(r1, r10)     // Catch:{ all -> 0x0b05 }
            if (r10 == 0) goto L_0x0145
            goto L_0x0123
        L_0x0120:
            java.lang.String r1 = X.C39511sb.A01     // Catch:{ all -> 0x0b05 }
            goto L_0x0117
        L_0x0123:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0afe }
            if (r0 == 0) goto L_0x0130
            X.0th r0 = r12.A02     // Catch:{ all -> 0x0afe }
            X.0tZ r2 = r0.A02(r10, r2, r11)     // Catch:{ all -> 0x0afe }
            goto L_0x014d
        L_0x0130:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0afe }
            r1.<init>()     // Catch:{ all -> 0x0afe }
            java.lang.String r0 = "msgstore/last-photo-change/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x0afe }
            r1.append(r2)     // Catch:{ all -> 0x0afe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0afe }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0afe }
            goto L_0x014a
        L_0x0145:
            java.lang.String r0 = "msgstore/last-photo-change/db/cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0afe }
        L_0x014a:
            r2 = 0
            if (r10 == 0) goto L_0x0150
        L_0x014d:
            r10.close()     // Catch:{ all -> 0x0b05 }
        L_0x0150:
            r9.close()
            X.1WU r2 = (X.AnonymousClass1WU) r2
            boolean r0 = r2 instanceof X.C39321sH
            if (r0 == 0) goto L_0x016d
            r0 = r2
            X.1sH r0 = (X.C39321sH) r0
            com.obwhatsapp.data.ProfilePhotoChange r1 = r0.A00
            if (r1 == 0) goto L_0x016d
            int r0 = r1.newPhotoId
            if (r0 != r7) goto L_0x016d
            byte[] r0 = r8.A00
            r1.newPhoto = r0
            X.0t6 r0 = r4.A07
            r0.A0a(r2)
        L_0x016d:
            if (r5 != 0) goto L_0x0171
            if (r6 == 0) goto L_0x0014
        L_0x0171:
            X.0pt r2 = r4.A01
            r1 = 41
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r4, r1, r3)
            r2.A0K(r0)
            return
        L_0x017e:
            java.lang.Object r4 = r6.A00
            X.12A r4 = (X.AnonymousClass12A) r4
            java.lang.Object r6 = r6.A01
            X.0rv r6 = (X.C15830rv) r6
            X.0sG r0 = r4.A03
            X.0sH r5 = r0.A0A(r6)
            int r2 = r5.A04
            r8 = 1
            r1 = -1
            if (r2 != r1) goto L_0x0197
            int r0 = r5.A05
            r3 = 1
            if (r0 == r1) goto L_0x01c4
        L_0x0197:
            r3 = 0
            if (r2 != 0) goto L_0x01c4
            int r0 = r5.A05
            if (r0 != 0) goto L_0x01c4
        L_0x019e:
            r4.A00(r5)
            r4.A01(r5, r1, r1)
            X.0vc r2 = r4.A0A
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r5.A08(r0)
            X.1ui r0 = r2.A01
            r0.A01(r1)
            X.1ui r0 = r2.A02
            r0.A01(r1)
            if (r3 != 0) goto L_0x0014
            X.0pt r0 = r4.A01
            r7 = 0
            com.facebook.redex.RunnableRunnableShape0S0310000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0310000_I0
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0K(r3)
            return
        L_0x01c4:
            r8 = 0
            goto L_0x019e
        L_0x01c6:
            java.lang.Object r0 = r6.A00
            X.18c r0 = (X.C224818c) r0
            java.lang.Object r2 = r6.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.1iU r0 = r0.A02
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x01d8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1iT r0 = (X.C33371iT) r0
            r0.A00(r2)
            goto L_0x01d8
        L_0x01e8:
            java.lang.Object r0 = r6.A00
            X.1iS r0 = (X.C33361iS) r0
            java.lang.Object r2 = r6.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.0sG r0 = r0.A00
            X.0ub r0 = r0.A07
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x01fc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1ie r0 = (X.C33481ie) r0
            r0.A05(r2)
            goto L_0x01fc
        L_0x020c:
            java.lang.Object r0 = r6.A00
            X.1iS r0 = (X.C33361iS) r0
            java.lang.Object r2 = r6.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.0sG r0 = r0.A00
            X.0ub r0 = r0.A07
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0220:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1ie r0 = (X.C33481ie) r0
            r0.A07(r2)
            goto L_0x0220
        L_0x0230:
            java.lang.Object r0 = r6.A00
            X.0sG r0 = (X.C16000sG) r0
            java.lang.Object r1 = r6.A01
            X.0ub r0 = r0.A07
            java.util.Set r2 = java.util.Collections.singleton(r1)
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0244:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1ie r0 = (X.C33481ie) r0
            r0.A08(r2)
            goto L_0x0244
        L_0x0254:
            java.lang.Object r1 = r6.A00
            X.1j1 r1 = (X.AnonymousClass1j1) r1
            java.lang.Object r0 = r6.A01
            X.14W r1 = r1.A04
            java.util.Collections.singleton(r0)
            r2 = 1
            java.lang.Iterable r0 = r1.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0268:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1we r0 = (X.C41781we) r0
            r0.A09(r2)
            goto L_0x0268
        L_0x0278:
            java.lang.Object r0 = r6.A00
            X.1j1 r0 = (X.AnonymousClass1j1) r0
            java.lang.Object r1 = r6.A01
            X.14W r0 = r0.A04
            java.util.Set r3 = java.util.Collections.singleton(r1)
            r2 = 1
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x028d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1we r0 = (X.C41781we) r0
            r0.A08(r3, r2)
            goto L_0x028d
        L_0x029d:
            java.lang.Object r0 = r6.A00
            X.1D1 r0 = (X.AnonymousClass1D1) r0
            java.lang.Object r4 = r6.A01
            X.19G r4 = (X.AnonymousClass19G) r4
            X.0xU r1 = r0.A01
            boolean r0 = r1.A0X()
            if (r0 == 0) goto L_0x0014
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r0 = "time_format"
            r3[r2] = r0
            java.lang.String r2 = X.AnonymousClass1WJ.A00(r3)
            X.0zv r0 = r4.A00
            X.1WJ r3 = r0.A05(r2)
            if (r3 != 0) goto L_0x02c8
            X.1WJ r3 = r0.A06(r2)
            if (r3 == 0) goto L_0x02e1
        L_0x02c8:
            X.013 r0 = r4.A02
            X.1Zd r0 = r0.A04()
            boolean r2 = r0.A00
            X.1Wl r0 = r3.A02()
            X.AnonymousClass00B.A06(r0)
            X.1oX r0 = r0.A0U
            if (r0 != 0) goto L_0x02dd
            X.1oX r0 = X.C37051oX.A02
        L_0x02dd:
            boolean r0 = r0.A01
            if (r2 == r0) goto L_0x0014
        L_0x02e1:
            X.0sK r0 = r4.A00
            boolean r0 = r0.A0G()
            r0 = r0 ^ 1
            X.AnonymousClass00B.A0G(r0)
            X.013 r0 = r4.A02
            X.1Zd r0 = r0.A04()
            boolean r7 = r0.A00
            X.0t3 r0 = r4.A01
            long r5 = r0.A00()
            r3 = 0
            X.1oY r2 = new X.1oY
            r4 = r3
            r2.<init>(r3, r4, r5, r7)
            java.util.Set r0 = java.util.Collections.singleton(r2)
            r1.A0S(r0)
            r1.A0N()
            return
        L_0x030c:
            java.lang.Object r5 = r6.A00
            X.0xU r5 = (X.C18930xU) r5
            java.lang.Object r4 = r6.A01
            X.1jm r4 = (X.C34151jm) r4
            X.1CX r3 = r5.A0l
            java.lang.String r1 = r4.A0D
            X.AnonymousClass00B.A06(r1)
            X.01Z r0 = r3.A06
            java.io.File r2 = r0.A03(r1)
            r1 = 0
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0334
            java.io.File r0 = r3.A05(r4, r2)
            if (r0 == 0) goto L_0x0335
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0335
        L_0x0334:
            r1 = 1
        L_0x0335:
            java.lang.String r3 = r4.A0D
            if (r1 == 0) goto L_0x0014
            X.15h r2 = r5.A0T
            java.lang.String r0 = "[\"favoriteSticker\",\""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = "\"]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.A07(r0)
            return
        L_0x0352:
            java.lang.Object r2 = r6.A00
            X.0xU r2 = (X.C18930xU) r2
            java.lang.Object r1 = r6.A01
            X.0tZ r1 = (X.C16740tZ) r1
            boolean r0 = r2.A0X()
            if (r0 == 0) goto L_0x0014
            X.15h r6 = r2.A0T
            X.1Vw r0 = r1.A11
            X.0rv r5 = r0.A00
            monitor-enter(r6)
            goto L_0x0b0a
        L_0x0369:
            java.lang.Object r1 = r6.A00
            X.2UO r1 = (X.AnonymousClass2UO) r1
            java.lang.Object r8 = r6.A01
            X.1WN r8 = (X.AnonymousClass1WN) r8
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0014
            if (r8 == 0) goto L_0x0b40
            X.4M6 r0 = r1.A00
            if (r0 == 0) goto L_0x0b40
            X.1WL r7 = r0.A00
            if (r7 == 0) goto L_0x0b40
            X.2UP r6 = r1.A06
            java.lang.String r2 = r0.A01
            X.27J r0 = r1.A01
            if (r0 == 0) goto L_0x03b7
            long r3 = r0.A04
        L_0x0389:
            X.2Ui r5 = r6.A00
            X.2UO r1 = r5.A01
            if (r1 == 0) goto L_0x0392
            r0 = 0
            r1.A02 = r0
        L_0x0392:
            X.1WF r0 = new X.1WF
            r0.<init>(r7, r8, r2)
            r5.A00 = r0
            X.2Uf r0 = r5.A0G
            r0.onSuccess()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a9
            X.27H r0 = r5.A04
            r0.A05(r3)
        L_0x03a9:
            X.133 r0 = r5.A0H
            X.1WA r2 = r0.A00
            r1 = 6
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r0.<init>(r6, r1)
            r2.execute(r0)
            return
        L_0x03b7:
            r3 = -1
            goto L_0x0389
        L_0x03ba:
            java.lang.Object r3 = r6.A00
            X.2Uk r3 = (X.C49622Uk) r3
            java.lang.Object r2 = r6.A01
            X.0rv r2 = (X.C15830rv) r2
            boolean r0 = r2 instanceof X.C16050sL
            if (r0 == 0) goto L_0x0014
            X.0sL r2 = (X.C16050sL) r2
            r1 = 3
            X.0rt r0 = r3.A04
            int r0 = r0.A02(r2)
            if (r1 != r0) goto L_0x0014
            X.0uk r0 = r3.A02
            X.0sL r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x0014
            r3.A00(r0)
            return
        L_0x03dd:
            java.lang.Object r3 = r6.A00
            X.2AS r3 = (X.AnonymousClass2AS) r3
            java.lang.Object r2 = r6.A01
            java.util.List r0 = r3.A12
            java.util.Iterator r1 = r0.iterator()
        L_0x03e9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1sW r0 = (X.C39461sW) r0
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03e9
            r1.remove()
            goto L_0x0429
        L_0x0401:
            java.lang.Object r3 = r6.A00
            X.2AS r3 = (X.AnonymousClass2AS) r3
            java.lang.Object r1 = r6.A01
            java.util.List r2 = r3.A13
            boolean r0 = r2.remove(r1)
            if (r0 != 0) goto L_0x0417
            java.util.List r0 = r3.A12
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x0014
        L_0x0417:
            java.util.List r1 = r3.A10
            r1.clear()
            r1.addAll(r2)
            java.util.List r0 = r3.A12
            r1.addAll(r0)
            X.2OJ r0 = r3.A0o
            r0.A09(r1)
        L_0x0429:
            r3.A07()
            return
        L_0x042d:
            java.lang.Object r0 = r6.A00
            X.28n r0 = (X.C454128n) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.15g r0 = r0.A05
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x043f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.2Bm r0 = (X.C45882Bm) r0
            r0.A01(r2)
            goto L_0x043f
        L_0x044f:
            java.lang.Object r0 = r6.A00
            X.0uk r0 = (X.C17230uk) r0
            java.lang.Object r1 = r6.A01
            X.0rx r1 = (X.C15840rx) r1
            X.15g r0 = r0.A0E
            X.0rv r2 = r1.A05()
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0465:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.2Bm r0 = (X.C45882Bm) r0
            r0.A00(r2)
            goto L_0x0465
        L_0x0475:
            java.lang.Object r4 = r6.A00
            com.obwhatsapp.chatinfo.ListChatInfoActivity r4 = (com.obwhatsapp.chatinfo.ListChatInfoActivity) r4
            java.lang.Object r3 = r6.A01
            X.0sN r3 = (X.C16060sN) r3
            X.0pd r2 = r4.A0C
            r1 = 1071(0x42f, float:1.501E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0014
            X.0sO r0 = r4.A0C
            boolean r0 = r0.A0C(r3)
            if (r0 != 0) goto L_0x0014
            X.1BL r2 = r4.A0S
            r1 = 5
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0499:
            java.lang.Object r2 = r6.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.Object r1 = r6.A01
            X.0rv r1 = (X.C15830rv) r1
            X.0vJ r0 = r2.A0y
            X.1ZX r1 = (X.AnonymousClass1ZX) r1
            X.1ZT r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0014
            r2.A3c(r0)
            return
        L_0x04af:
            java.lang.Object r2 = r6.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.Object r1 = r6.A01
            X.0rv r1 = (X.C15830rv) r1
            X.0vJ r0 = r2.A0y
            X.1ZX r1 = (X.AnonymousClass1ZX) r1
            X.1ZT r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0014
            r2.A3b(r0)
            return
        L_0x04c5:
            java.lang.Object r3 = r6.A00
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r2 = r6.A01
            X.2XL r2 = (X.AnonymousClass2XL) r2
            X.01V r1 = r3.A01
            X.0sj r0 = r3.A02
            java.lang.Integer r0 = X.AnonymousClass46T.A00(r1, r0)
            if (r0 == 0) goto L_0x04e1
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
        L_0x04e1:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.0sG r0 = r3.A00
            r0.A0U(r1)
            int r0 = r1.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            X.0t9 r0 = r3.A03
            r0.A06(r2)
            return
        L_0x04fc:
            java.lang.Object r5 = r6.A00
            com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment r5 = (com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment) r5
            java.lang.Object r2 = r6.A01
            X.29I r2 = (X.AnonymousClass29I) r2
            X.00l r0 = r5.A0C()
            android.view.Window r0 = r0.getWindow()
            r6 = 1
            r0.setSoftInputMode(r6)
            boolean r0 = r2.A01()
            r4 = 0
            if (r0 == 0) goto L_0x052b
            X.01V r0 = r5.A0C
            android.view.inputmethod.InputMethodManager r1 = r0.A0Q()
            if (r1 == 0) goto L_0x0528
            com.obwhatsapp.mentions.MentionableEntry r0 = r5.A0D
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r4)
        L_0x0528:
            r2.A00(r6)
        L_0x052b:
            com.obwhatsapp.mentions.MentionableEntry r0 = r5.A0D
            int r3 = r0.getSelectionStart()
            com.obwhatsapp.mentions.MentionableEntry r0 = r5.A0D
            int r2 = r0.getSelectionEnd()
            com.obwhatsapp.mentions.MentionableEntry r1 = r5.A0D
            java.lang.String r0 = r1.getStringText()
            r1.setText(r0)
            com.obwhatsapp.mentions.MentionableEntry r0 = r5.A0D
            r0.setSelection(r3, r2)
            r0 = 2
            int[] r2 = new int[r0]
            int[] r1 = new int[r0]
            com.obwhatsapp.mentions.MentionableEntry r0 = r5.A0D
            r0.getLocationOnScreen(r2)
            android.widget.RelativeLayout r0 = r5.A06
            r0.getLocationOnScreen(r1)
            com.obwhatsapp.mentions.MentionableEntry r5 = r5.A0D
            r4 = r2[r4]
            r3 = r2[r6]
            int r0 = r5.getWidth()
            int r2 = r4 + r0
            r1 = r1[r6]
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r3, r2, r1)
            r5.A00 = r0
            return
        L_0x056a:
            java.lang.Object r2 = r6.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r2 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r2
            java.lang.Object r1 = r6.A01
            X.25G r1 = (X.AnonymousClass25G) r1
            X.1QZ r0 = r2.A26
            r0.A02(r1)
            X.4uj r0 = r2.A0x
            r0.A00()
            return
        L_0x057d:
            java.lang.Object r2 = r6.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r2 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r2
            java.lang.Object r1 = r6.A01
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r4 = r1.A08(r0)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "contact_search"
            java.lang.String r6 = "whatsapp"
            X.1vW r3 = new X.1vW
            r3.<init>(r4, r5, r6, r7, r9)
            X.1vV r1 = new X.1vV
            r1.<init>(r3)
            X.0z3 r0 = r2.A1J
            goto L_0x0652
        L_0x05a8:
            java.lang.Object r1 = r6.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r1 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r1
            java.lang.Object r0 = r6.A01
            X.27a r0 = (X.C450927a) r0
            X.156 r4 = r1.A0p
            com.whatsapp.jid.UserJid r3 = r0.A0C
            if (r3 == 0) goto L_0x05d2
            java.lang.String r0 = r1.A2A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05d2
            java.lang.String r0 = r1.A2I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05d2
            java.lang.String r2 = "ctwa"
        L_0x05c8:
            r1 = 0
            X.26U r0 = new X.26U
            r0.<init>(r3, r2, r1)
            r4.A01(r0)
            return
        L_0x05d2:
            java.lang.String r2 = "click_to_chat_link"
            goto L_0x05c8
        L_0x05d5:
            java.lang.Object r3 = r6.A00
            X.12A r3 = (X.AnonymousClass12A) r3
            java.lang.Object r1 = r6.A01
            byte[] r1 = (byte[]) r1
            r0 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
            X.10K r1 = r3.A09
            java.lang.String r0 = "user_profile_photo"
            r1.A01(r0, r2)
            return
        L_0x05eb:
            java.lang.Object r1 = r6.A00
            X.12A r1 = (X.AnonymousClass12A) r1
            java.lang.Object r2 = r6.A01
            X.0sH r2 = (X.C16010sH) r2
            X.120 r0 = r1.A05
            r0.A04(r2)
            X.0ub r1 = r1.A04
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            r1.A04(r0)
            return
        L_0x0606:
            java.lang.Object r3 = r6.A00
            X.1L6 r3 = (X.AnonymousClass1L6) r3
            java.lang.Object r2 = r6.A01
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            X.0xU r1 = r3.A02
            r0 = 0
            r1.A0T(r2, r0)
            X.0pt r2 = r3.A00
            r1 = 49
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r0.<init>(r3, r1)
            r2.A0K(r0)
            return
        L_0x0621:
            java.lang.Object r0 = r6.A00
            X.1L6 r0 = (X.AnonymousClass1L6) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1Au r1 = r0.A07
            X.1kz r0 = X.C34861kz.A0D
            r1.A01(r0, r2)
            return
        L_0x0631:
            java.lang.Object r0 = r6.A00
            X.1L6 r0 = (X.AnonymousClass1L6) r0
            java.lang.Object r3 = r6.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "contact_card"
            java.lang.String r5 = "whatsapp"
            X.1vW r2 = new X.1vW
            r2.<init>(r3, r4, r5, r6, r8)
            X.1vV r1 = new X.1vV
            r1.<init>(r2)
            X.0z3 r0 = r0.A0B
        L_0x0652:
            r0.A00(r1)
            return
        L_0x0656:
            java.lang.Object r0 = r6.A00
            X.18c r0 = (X.C224818c) r0
            java.lang.Object r1 = r6.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.1iU r0 = r0.A02
            r0.A04(r1)
            return
        L_0x0664:
            java.lang.Object r1 = r6.A00
            X.18c r1 = (X.C224818c) r1
            java.lang.Object r0 = r6.A01
            X.0sH r0 = (X.C16010sH) r0
            r1.A0K(r0)
            return
        L_0x0670:
            java.lang.Object r0 = r6.A00
            X.0sG r0 = (X.C16000sG) r0
            java.lang.Object r1 = r6.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.0ub r0 = r0.A07
            r0.A06(r1)
            return
        L_0x067e:
            java.lang.Object r0 = r6.A00
            X.0sG r0 = (X.C16000sG) r0
            java.lang.Object r2 = r6.A01
            X.0sH r2 = (X.C16010sH) r2
            X.0ub r1 = r0.A07
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r1.A06(r0)
            return
        L_0x0694:
            java.lang.Object r5 = r6.A00
            X.1j1 r5 = (X.AnonymousClass1j1) r5
            java.lang.Object r4 = r6.A01
            X.1oL r4 = (X.C36931oL) r4
            X.1jm r2 = r5.A0A(r4)
            if (r2 == 0) goto L_0x06ab
            long r0 = r4.A04
            r5.A0B(r2, r0)
            r5.A04(r4)
            return
        L_0x06ab:
            int r3 = r4.A00
            if (r3 < 0) goto L_0x06e1
            X.0sK r1 = r5.A01
            int r0 = r1.A00()
            if (r0 == r3) goto L_0x06e1
            X.1Gq r2 = r5.A03     // Catch:{ 1W4 -> 0x06ce }
            r1.A0B()     // Catch:{ 1W4 -> 0x06ce }
            X.1ZT r0 = r1.A05     // Catch:{ 1W4 -> 0x06ce }
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getFromUserJidAndDeviceId(r0, r3)     // Catch:{ 1W4 -> 0x06ce }
            X.1oK r0 = r4.A01     // Catch:{ 1W4 -> 0x06ce }
            java.lang.String r0 = r0.A07     // Catch:{ 1W4 -> 0x06ce }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ 1W4 -> 0x06ce }
            r2.A00(r1, r0)     // Catch:{ 1W4 -> 0x06ce }
            return
        L_0x06ce:
            r2 = move-exception
            java.lang.String r1 = "FavoriteStickerHandler/sendRmrRequest invalid setter ex="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06e1:
            java.lang.String r1 = "FavoriteStickerHandler/sendRmrRequest invalid setter id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x0704
        L_0x06f0:
            java.lang.Object r7 = r6.A00
            X.1RP r7 = (X.AnonymousClass1RP) r7
            java.lang.Object r6 = r6.A01
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            X.0sK r0 = r7.A00
            r0.A0B()
            X.1ZT r5 = r0.A05
            if (r5 != 0) goto L_0x0708
            java.lang.String r0 = "security-notification-setting-manager/my user id is null (unregistered?)."
        L_0x0704:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0708:
            X.0rz r0 = r7.A03
            boolean r4 = r0.A1Y()
            X.17g r3 = r7.A05
            X.0t3 r0 = r7.A02
            long r1 = r0.A00()
            X.18b r3 = r3.A05
            r0 = 1
            X.1Vw r0 = r3.A02(r5, r0)
            X.1pM r5 = new X.1pM
            r5.<init>(r0, r1)
            r5.A00 = r6
            r5.A00 = r4
            X.19M r0 = r7.A04
            long r3 = r0.A01(r5)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0738
            java.lang.String r0 = "security-notification-setting-manager/failed to add peer message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0738:
            X.0xb r3 = r7.A01
            r2 = 0
            r1 = 0
            com.obwhatsapp.jobqueue.job.SendPeerMessageJob r0 = new com.obwhatsapp.jobqueue.job.SendPeerMessageJob
            r0.<init>(r6, r5, r2, r1)
            r3.A00(r0)
            return
        L_0x0745:
            java.lang.Object r0 = r6.A00
            com.obwhatsapp.companiondevice.sync.HistorySyncWorker r0 = (com.obwhatsapp.companiondevice.sync.HistorySyncWorker) r0
            java.lang.Object r4 = r6.A01
            X.1bW r4 = (X.C29961bW) r4
            X.1Hv r1 = r0.A05
            java.util.Map r0 = r0.A02
            java.lang.String r0 = r1.A01(r0)
            X.03l r0 = r1.A00(r0)
            android.app.Notification r3 = r0.A01()
            r2 = 230176025(0xdb83519, float:1.1352658E-30)
            r1 = 0
            X.0RE r0 = new X.0RE
            r0.<init>(r2, r3, r1)
            r4.A04(r0)
            return
        L_0x076a:
            java.lang.Object r0 = r6.A00
            X.1Wc r0 = (X.C28441Wc) r0
            java.lang.Object r1 = r6.A01
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            X.1Wd r0 = r0.A02
            r0.A05(r1)
            return
        L_0x0778:
            java.lang.Object r7 = r6.A00
            X.1Wc r7 = (X.C28441Wc) r7
            java.lang.Object r6 = r6.A01
            X.3Ba r6 = (X.C61943Ba) r6
            X.28L r5 = r7.A00()
            X.19E r8 = r7.A04
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r4 = r5.A04
            java.util.Collection r0 = r4.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0795:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07a5
            java.lang.Object r0 = r1.next()
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            goto L_0x0795
        L_0x07a5:
            java.util.Iterator r9 = r2.iterator()
        L_0x07a9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x07de
            java.lang.Object r1 = r9.next()
            X.1WJ r1 = (X.AnonymousClass1WJ) r1
            boolean r0 = r1 instanceof X.C36831oB
            if (r0 == 0) goto L_0x07a9
            X.1oB r1 = (X.C36831oB) r1
            X.3qV r3 = new X.3qV
            r3.<init>()
            X.1o8 r2 = r1.ADZ()
            java.util.Set r0 = r2.A02
            int r1 = r0.size()
            java.util.Set r0 = r2.A03
            int r0 = r0.size()
            int r1 = r1 + r0
            long r0 = (long) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A00 = r0
            X.0t9 r0 = r8.A06
            r0.A06(r3)
            goto L_0x07a9
        L_0x07de:
            X.1Wd r3 = r7.A02
            java.util.List r0 = r6.A01     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x07e6:
            boolean r0 = r11.hasNext()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x088c
            java.lang.Object r8 = r11.next()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.4RY r8 = (X.AnonymousClass4RY) r8     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r1 = "SyncResponseHandler/handleErrors "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.<init>(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.append(r8)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r0 = r0.toString()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            int r7 = r8.A00     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0 = 400(0x190, float:5.6E-43)
            if (r7 == r0) goto L_0x0882
            r0 = 404(0x194, float:5.66E-43)
            if (r7 == r0) goto L_0x0878
            r0 = 409(0x199, float:5.73E-43)
            r2 = 1
            if (r7 == r0) goto L_0x0813
            goto L_0x0831
        L_0x0813:
            X.19E r0 = r3.A05     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.139 r10 = r0.A01     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r9 = "upload_conflict_counter"
            r0 = 1
            r10.A06(r9, r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.4M7 r1 = r8.A01     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.util.List r0 = r1.A02     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            boolean r0 = r0.isEmpty()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 != 0) goto L_0x0864
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r3.A06(r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            goto L_0x07e6
        L_0x0831:
            java.lang.String r1 = "SyncResponseHandler/handleErrors error code: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.<init>(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.append(r7)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r0 = r0.toString()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r0 = "Retriable error with "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r1.<init>(r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r0 = r8.A03     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 != 0) goto L_0x084f
            java.lang.String r0 = ""
        L_0x084f:
            r1.append(r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r1.append(r7)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r1 = r1.toString()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.259 r0 = new X.259     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.<init>(r1, r2)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            throw r0     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x0864:
            java.lang.String r1 = "Received a collection conflict with no patches, code "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.<init>(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.append(r7)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r1 = r0.toString()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.259 r0 = new X.259     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.<init>(r1, r2)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            throw r0     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x0878:
            r2 = 63
            java.lang.String r1 = r8.A02     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.1X9 r0 = new X.1X9     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.<init>(r2, r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            throw r0     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x0882:
            r2 = 62
            java.lang.String r1 = r8.A02     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.1X9 r0 = new X.1X9     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.<init>(r2, r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            throw r0     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x088c:
            java.util.List r2 = r6.A00     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r1 = "SyncResponseHandler/handleAlreadySyncedCollections: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.<init>(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.append(r2)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r0 = r0.toString()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x08a3:
            boolean r0 = r2.hasNext()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x08b5
            java.lang.Object r1 = r2.next()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.11P r0 = r3.A0F     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.A02(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            goto L_0x08a3
        L_0x08b5:
            java.util.List r0 = r6.A03     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x08bb:
            boolean r0 = r16.hasNext()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x09c9
            java.lang.Object r8 = r16.next()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.4Hd r8 = (X.C83554Hd) r8     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r1 = "SyncResponseHandler/handleNewCollectionVersions: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.<init>(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r2 = r8.A01     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.append(r2)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r0 = r0.toString()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.Object r7 = r4.get(r2)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r7 == 0) goto L_0x09ae
            java.util.Iterator r10 = r7.iterator()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r9 = 0
            r12 = 0
        L_0x08e8:
            boolean r0 = r10.hasNext()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x090a
            java.lang.Object r1 = r10.next()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.1WJ r1 = (X.AnonymousClass1WJ) r1     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            boolean r0 = r1 instanceof X.C37021oU     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x0903
            r0 = r1
            X.1oU r0 = (X.C37021oU) r0     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            boolean r0 = r0.AJo()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x0903
            int r9 = r9 + 1
        L_0x0903:
            boolean r0 = r1 instanceof X.C28491Wh     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x08e8
            int r12 = r12 + 1
            goto L_0x08e8
        L_0x090a:
            X.19E r11 = r3.A05     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r9 <= 0) goto L_0x0917
            X.139 r10 = r11.A01     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            long r0 = (long) r9     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r9 = "unset_action_mutation_counter"
            r10.A06(r9, r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x0917:
            if (r12 <= 0) goto L_0x0921
            X.139 r10 = r11.A01     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            long r0 = (long) r12     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r9 = "key_rotation_remove_counter"
            r10.A06(r9, r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x0921:
            java.util.Map r0 = r5.A03     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.Object r9 = r0.get(r2)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            byte[] r9 = (byte[]) r9     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.19K r0 = r3.A0D     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.0tf r15 = r0.A02()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.1cj r14 = r15.A00()     // Catch:{ all -> 0x09c4 }
            X.0zv r10 = r3.A0G     // Catch:{ all -> 0x09bf }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x09bf }
            if (r0 != 0) goto L_0x0979
            X.19K r0 = r10.A01     // Catch:{ all -> 0x09bf }
            X.0tf r1 = r0.A02()     // Catch:{ all -> 0x09bf }
            X.1cj r13 = r1.A00()     // Catch:{ all -> 0x09ba }
            X.0tg r11 = r1.A02     // Catch:{ all -> 0x09b5 }
            r10.A0D(r11, r7)     // Catch:{ all -> 0x09b5 }
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet     // Catch:{ all -> 0x09b5 }
            r12.<init>()     // Catch:{ all -> 0x09b5 }
            java.util.Iterator r10 = r7.iterator()     // Catch:{ all -> 0x09b5 }
        L_0x0953:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x09b5 }
            if (r0 == 0) goto L_0x0965
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x09b5 }
            X.1WJ r0 = (X.AnonymousClass1WJ) r0     // Catch:{ all -> 0x09b5 }
            java.lang.String r0 = r0.A07     // Catch:{ all -> 0x09b5 }
            r12.add(r0)     // Catch:{ all -> 0x09b5 }
            goto L_0x0953
        L_0x0965:
            java.lang.String[] r0 = X.AnonymousClass1XA.A00     // Catch:{ all -> 0x09b5 }
            java.lang.Object[] r0 = r12.toArray(r0)     // Catch:{ all -> 0x09b5 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x09b5 }
            X.C20360zv.A01(r11, r0)     // Catch:{ all -> 0x09b5 }
            r13.A00()     // Catch:{ all -> 0x09b5 }
            r13.close()     // Catch:{ all -> 0x09ba }
            r1.close()     // Catch:{ all -> 0x09bf }
        L_0x0979:
            X.11P r10 = r3.A0F     // Catch:{ all -> 0x09bf }
            long r0 = r8.A00     // Catch:{ all -> 0x09bf }
            r10.A05(r2, r9, r0)     // Catch:{ all -> 0x09bf }
            r14.A00()     // Catch:{ all -> 0x09bf }
            r14.close()     // Catch:{ all -> 0x09c4 }
            r15.close()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x098d:
            boolean r0 = r7.hasNext()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x09ae
            java.lang.Object r1 = r7.next()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.1WJ r1 = (X.AnonymousClass1WJ) r1     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            boolean r0 = r1.A06()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x098d
            X.15h r0 = r3.A09     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.A06(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.0zx r0 = r0.A00(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x098d
            r0.A03(r1)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            goto L_0x098d
        L_0x09ae:
            X.11P r0 = r3.A0F     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.A02(r2)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            goto L_0x08bb
        L_0x09b5:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x09b9 }
        L_0x09b9:
            throw r0     // Catch:{ all -> 0x09ba }
        L_0x09ba:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x09be }
        L_0x09be:
            throw r0     // Catch:{ all -> 0x09bf }
        L_0x09bf:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x09c3 }
        L_0x09c3:
            throw r0     // Catch:{ all -> 0x09c4 }
        L_0x09c4:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x09c8 }
        L_0x09c8:
            throw r0     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x09c9:
            java.util.List r0 = r6.A02     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r3.A06(r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.25D r1 = r3.A04     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r0 = "sync-manager/onSuccessHandled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.0xU r2 = r1.A00     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.11Q r0 = r2.A0C     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.Iterable r0 = r0.A01()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
        L_0x09e2:
            boolean r0 = r1.hasNext()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            if (r0 == 0) goto L_0x09f2
            java.lang.Object r0 = r1.next()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.0yK r0 = (X.C19370yK) r0     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.AYh()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            goto L_0x09e2
        L_0x09f2:
            r0 = 1
            X.C18930xU.A00(r2, r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r2.A0W()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.139 r0 = r3.A06     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            android.content.SharedPreferences r0 = r0.A01()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            java.lang.String r0 = "first_transient_server_failure_timestamp"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.apply()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            X.1ue r0 = r3.A0J     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            r0.A01()     // Catch:{ 1X9 | 1XT | 259 | SQLiteFullException -> 0x0a12 }
            return
        L_0x0a12:
            r0 = move-exception
            r3.A05(r0)
            return
        L_0x0a17:
            java.lang.Object r0 = r6.A00
            X.2Ug r0 = (X.AnonymousClass2Ug) r0
            java.lang.Object r3 = r6.A01
            X.4M6 r3 = (X.AnonymousClass4M6) r3
            X.2Ui r2 = r0.A01
            X.2UO r1 = r2.A01
            if (r1 == 0) goto L_0x0a28
            r0 = 0
            r1.A02 = r0
        L_0x0a28:
            r2.A01(r3)
            return
        L_0x0a2c:
            java.lang.Object r1 = r6.A00
            X.2Uk r1 = (X.C49622Uk) r1
            java.lang.Object r0 = r6.A01
            X.0sL r0 = (X.C16050sL) r0
            r1.A00(r0)
            return
        L_0x0a38:
            java.lang.Object r0 = r6.A00
            X.2AS r0 = (X.AnonymousClass2AS) r0
            java.lang.Object r5 = r6.A01
            X.0sH r5 = (X.C16010sH) r5
            java.lang.String r8 = r0.A06
            X.4yz r7 = new X.4yz
            r7.<init>(r0)
            X.0t3 r3 = r0.A0S
            X.0pt r1 = r0.A0H
            X.0sK r2 = r0.A0I
            X.0vd r6 = r0.A0e
            X.11A r4 = r0.A0W
            X.AnonymousClass37S.A03(r1, r2, r3, r4, r5, r6, r7, r8)
            X.2OJ r1 = r0.A0p
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A09(r0)
            return
        L_0x0a5c:
            java.lang.Object r3 = r6.A00
            com.obwhatsapp.community.CommunitySubgroupsBottomSheet r3 = (com.obwhatsapp.community.CommunitySubgroupsBottomSheet) r3
            java.lang.Object r2 = r6.A01
            X.0sL r2 = (X.C16050sL) r2
            X.0va r1 = r3.A0D
            r0 = 2
            r1.A00(r2, r0)
            r3.A1C()
            X.00l r0 = r3.A0D()
            r0.finish()
            return
        L_0x0a75:
            java.lang.Object r3 = r6.A00
            com.obwhatsapp.community.CommunitySubgroupsBottomSheet r3 = (com.obwhatsapp.community.CommunitySubgroupsBottomSheet) r3
            java.lang.Object r2 = r6.A01
            X.0sL r2 = (X.C16050sL) r2
            X.0va r1 = r3.A0D
            r0 = 2
            r1.A00(r2, r0)
            r3.A1C()
            return
        L_0x0a87:
            java.lang.Object r0 = r6.A00
            com.obwhatsapp.community.CommunityFragment r0 = (com.obwhatsapp.community.CommunityFragment) r0
            java.lang.Object r1 = r6.A01
            java.util.List r1 = (java.util.List) r1
            X.2AH r0 = r0.A0E
            r0.A0J(r1)
            return
        L_0x0a95:
            java.lang.Object r3 = r6.A00
            X.1vT r3 = (X.C41241vT) r3
            java.lang.Object r2 = r6.A01
            X.1ZX r2 = (X.AnonymousClass1ZX) r2
            r0 = 1
            X.C18450wi.A0H(r2, r0)
            X.15H r0 = r3.A01
            java.lang.Boolean r1 = r0.A01(r2)
            if (r1 != 0) goto L_0x0aad
            r0.A04(r2)
            return
        L_0x0aad:
            X.027 r0 = r3.A00
            r0.A09(r1)
            return
        L_0x0ab3:
            java.lang.Object r3 = r6.A00
            X.2Qp r3 = (X.C49062Qp) r3
            java.lang.Object r1 = r6.A01
            android.view.SurfaceHolder r1 = (android.view.SurfaceHolder) r1
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x0afb }
            if (r0 == 0) goto L_0x0af9
            r2 = 0
            boolean r0 = r1.isCreating()     // Catch:{ RuntimeException -> 0x0ae9, IOException -> 0x0ad8 }
            if (r0 != 0) goto L_0x0acf
            android.hardware.Camera r0 = r3.A07     // Catch:{ RuntimeException -> 0x0ae9, IOException -> 0x0ad8 }
            r0.stopPreview()     // Catch:{ RuntimeException -> 0x0ae9, IOException -> 0x0ad8 }
            r0 = 0
            r3.A0M = r0     // Catch:{ RuntimeException -> 0x0ae9, IOException -> 0x0ad8 }
        L_0x0acf:
            android.hardware.Camera r0 = r3.A07     // Catch:{ RuntimeException -> 0x0ae9, IOException -> 0x0ad8 }
            r0.setPreviewDisplay(r1)     // Catch:{ RuntimeException -> 0x0ae9, IOException -> 0x0ad8 }
            r3.A06()     // Catch:{ RuntimeException -> 0x0ae9, IOException -> 0x0ad8 }
            goto L_0x0af9
        L_0x0ad8:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x0afb }
            r0.release()     // Catch:{ all -> 0x0afb }
            r3.A07 = r2     // Catch:{ all -> 0x0afb }
            java.lang.String r0 = "cameraview/restart-preview: error setting preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0afb }
            r3.A08(r1)     // Catch:{ all -> 0x0afb }
            goto L_0x0af9
        L_0x0ae9:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x0afb }
            r0.release()     // Catch:{ all -> 0x0afb }
            r3.A07 = r2     // Catch:{ all -> 0x0afb }
            java.lang.String r0 = "cameraview/restart-preview "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0afb }
            r3.A08(r1)     // Catch:{ all -> 0x0afb }
        L_0x0af9:
            monitor-exit(r3)
            return
        L_0x0afb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0afe:
            r0 = move-exception
            if (r10 == 0) goto L_0x0b04
            r10.close()     // Catch:{ all -> 0x0b04 }
        L_0x0b04:
            throw r0     // Catch:{ all -> 0x0b05 }
        L_0x0b05:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0b09 }
        L_0x0b09:
            throw r0
        L_0x0b0a:
            X.0zv r4 = r6.A03     // Catch:{ all -> 0x0b3d }
            r3 = 0
            com.facebook.redex.IDxIFilterShape43S0000000_2_I1 r2 = new com.facebook.redex.IDxIFilterShape43S0000000_2_I1     // Catch:{ all -> 0x0b3d }
            r2.<init>(r3)     // Catch:{ all -> 0x0b3d }
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0b3d }
            java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x0b3d }
            r1[r3] = r0     // Catch:{ all -> 0x0b3d }
            java.lang.String r0 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid == ? AND are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.List r0 = r4.A07(r2, r0, r1)     // Catch:{ all -> 0x0b3d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0b3d }
        L_0x0b25:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0b3d }
            if (r0 == 0) goto L_0x0b3b
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0b3d }
            X.1WJ r1 = (X.AnonymousClass1WJ) r1     // Catch:{ all -> 0x0b3d }
            X.0zx r0 = r6.A00(r1)     // Catch:{ all -> 0x0b3d }
            if (r0 == 0) goto L_0x0b25
            r0.A03(r1)     // Catch:{ all -> 0x0b3d }
            goto L_0x0b25
        L_0x0b3b:
            monitor-exit(r6)     // Catch:{ all -> 0x0b3d }
            return
        L_0x0b3d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0b3d }
            throw r0
        L_0x0b40:
            X.2UP r1 = r1.A06
            r0 = 500(0x1f4, float:7.0E-43)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape4S0200000_I0_2.run():void");
    }
}
