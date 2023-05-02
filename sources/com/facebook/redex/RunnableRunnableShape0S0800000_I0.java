package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass137;
import X.AnonymousClass27J;
import X.C16040sK;
import X.C16300so;
import X.C17930vs;
import X.C18390wc;
import X.C19810z2;
import X.C37401p6;
import X.C52712eK;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

public class RunnableRunnableShape0S0800000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;

    public RunnableRunnableShape0S0800000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i2) {
        this.A08 = i2;
        this.A01 = obj;
        this.A05 = obj2;
        this.A06 = obj3;
        this.A00 = obj4;
        this.A04 = obj5;
        this.A07 = obj6;
        this.A03 = obj7;
        this.A02 = obj8;
    }

    public final void A00(C17930vs r8, C52712eK r9) {
        UserJid userJid = r9.A06;
        if (r8.isEmpty()) {
            return;
        }
        if (!((C16040sK) this.A05).A0I(userJid)) {
            C19810z2 r5 = (C19810z2) this.A07;
            C18390wc r6 = new C18390wc();
            for (Map.Entry entry : r5.A0A(userJid).entrySet()) {
                if (r8.containsKey(entry.getKey()) && r8.get(entry.getKey()) == entry.getValue()) {
                    r6.add(entry.getKey());
                }
            }
            r5.A0E(r6.build(), userJid, false, false);
            return;
        }
        StringBuilder sb = new StringBuilder("Remove self device, userJid=");
        sb.append(userJid);
        sb.append("; toAdd=");
        sb.append(r8);
        ((C16300so) this.A01).AcB("invalid-device-notification", sb.toString(), false);
    }

    public final boolean A01(C17930vs r19, UserJid userJid, C52712eK r21) {
        String obj;
        C17930vs r4 = r19;
        if (!r4.isEmpty()) {
            UserJid userJid2 = userJid;
            if (!((C16040sK) this.A05).A0I(userJid2)) {
                C52712eK r9 = r21;
                byte[] bArr = r9.A0A;
                if (bArr == null) {
                    obj = "SyncDeviceNotificationRunnable/verifyADVIndexList/no key index list in device add notification";
                } else {
                    UserJid userJid3 = r9.A06;
                    AnonymousClass137 r42 = (AnonymousClass137) this.A03;
                    AnonymousClass27J A052 = r42.A05(userJid3, bArr);
                    long j2 = r9.A00;
                    if (!r42.A0D(userJid3, A052, j2)) {
                        StringBuilder sb = new StringBuilder("SyncDeviceNotificationRunnable/verifyADVIndexList/validate indexList fail, userJid=");
                        sb.append(userJid3);
                        obj = sb.toString();
                    } else {
                        AnonymousClass00B.A06(A052);
                        C19810z2 r2 = (C19810z2) this.A07;
                        HashMap hashMap = new HashMap(r2.A0A(userJid3));
                        hashMap.putAll(r9.A02);
                        C37401p6 A09 = r2.A09(userJid3);
                        if (A09 == null) {
                            A09 = new C37401p6(A052.A02, 0, 0, 0, 0);
                        }
                        r2.A0I(C17930vs.copyOf(r42.A06(A052.A05, r2.A0A(userJid3), hashMap, A052.A01)), r2.A08(A09, j2), userJid3, false);
                        return false;
                    }
                }
                Log.e(obj);
                Log.e("SyncDeviceNotificationRunnable/handleUserDeviceUpdate/invalid adv data");
                return true;
            }
            StringBuilder sb2 = new StringBuilder("Add self device, userJid=");
            sb2.append(userJid2);
            sb2.append("; toAdd=");
            sb2.append(r4);
            ((C16300so) this.A01).AcB("invalid-device-notification", sb2.toString(), false);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03db, code lost:
        if (r0 == false) goto L_0x03dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r24 = this;
            r5 = r24
            int r0 = r5.A08
            switch(r0) {
                case 0: goto L_0x0376;
                case 1: goto L_0x02a7;
                case 2: goto L_0x014c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r5.A00
            X.0wQ r4 = (X.C18270wQ) r4
            java.lang.Object r12 = r5.A01
            X.1jm r12 = (X.C34151jm) r12
            java.lang.Object r10 = r5.A02
            X.0rv r10 = (X.C15830rv) r10
            java.lang.Object r9 = r5.A03
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.Object r8 = r5.A04
            X.0tZ r8 = (X.C16740tZ) r8
            java.lang.Object r7 = r5.A05
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r3 = r5.A06
            X.1lo r3 = (X.C35361lo) r3
            java.lang.Object r6 = r5.A07
            X.1WD r6 = (X.AnonymousClass1WD) r6
            X.2Ic r2 = new X.2Ic
            r2.<init>()
            r0 = 2
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch
            r11.<init>(r0)
            if (r12 != 0) goto L_0x00b4
            r0 = 6
        L_0x0035:
            r2.A01 = r0
            r11.countDown()
        L_0x003a:
            X.0pd r10 = r4.A04
            r9 = 1084(0x43c, float:1.519E-42)
            X.0tM r8 = X.C16620tM.A02
            boolean r1 = r10.A0E(r8, r9)
            r0 = 7
            if (r1 == 0) goto L_0x005a
            if (r3 == 0) goto L_0x005a
            X.0sb r0 = r4.A00
            java.io.File r0 = r0.A0A()
            java.io.File r17 = r3.A02(r0)
            boolean r0 = r17.exists()
            if (r0 != 0) goto L_0x0061
            r0 = 4
        L_0x005a:
            r2.A00 = r0
        L_0x005c:
            r11.countDown()
            goto L_0x0135
        L_0x0061:
            X.0wO r1 = r4.A03
            java.lang.String r0 = r3.A0F
            X.1lo r7 = r1.A01(r0)
            r5 = 1
            if (r7 == 0) goto L_0x00f6
            byte[] r12 = r7.A08
            if (r12 == 0) goto L_0x00f6
            long r0 = r7.A00
            X.1XM r13 = new X.1XM
            r13.<init>(r12, r0)
            X.0t3 r12 = r4.A02
            long r0 = r12.A00()
            boolean r0 = X.AnonymousClass1XM.A00(r13, r0)
            if (r0 == 0) goto L_0x00f6
            long r0 = r7.A00
            long r15 = r12.A00()
            r12 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r0 = r0 + r12
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x00f6
            int r12 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x00f6
            byte[] r14 = r7.A08
            long r0 = r7.A00
            java.lang.String r13 = r7.A04
            java.lang.String r12 = r7.A03
            java.lang.String r7 = r7.A02
            boolean r4 = r10.A0E(r8, r9)
            r3.A08 = r14
            r3.A00 = r0
            r3.A04 = r13
            r3.A03 = r12
            r3.A02 = r7
            r3.A07 = r4
            r2.A00 = r5
            goto L_0x005c
        L_0x00b4:
            int r0 = r12.A00
            long r0 = (long) r0
            r13 = 1048576(0x100000, double:5.180654E-318)
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x00f3
            r13 = 0
            X.1XL r1 = X.C18270wQ.A00(r12, r13)
            if (r1 != 0) goto L_0x00c8
            r0 = 4
            goto L_0x0035
        L_0x00c8:
            X.0wL r5 = r4.A06
            r0 = 1
            X.1XP r1 = r5.A03(r1, r0)
            java.lang.String r0 = "mms"
            r1.A0U = r0
            X.52w r14 = new X.52w
            r15 = r10
            r16 = r9
            r17 = r1
            r18 = r2
            r19 = r4
            r20 = r8
            r21 = r12
            r22 = r7
            r23 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.1XS r0 = r1.A0A
            r0.A03(r14, r13)
            r5.A0D(r1, r13)
            goto L_0x003a
        L_0x00f3:
            r0 = 2
            goto L_0x0035
        L_0x00f6:
            r13 = 0
            r0 = 0
            X.1XJ r15 = new X.1XJ
            r15.<init>(r5, r0, r5)
            X.1XK r16 = X.AnonymousClass1XK.A0P
            android.net.Uri r12 = android.net.Uri.fromFile(r17)
            r17 = r13
            r18 = r13
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r14 = r13
            X.1XL r0 = X.AnonymousClass1XL.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.0wL r7 = r4.A06
            X.1XP r5 = r7.A03(r0, r5)
            java.lang.String r0 = "mms"
            r5.A0U = r0
            X.52v r1 = new X.52v
            r14 = r1
            r15 = r3
            r16 = r5
            r17 = r2
            r18 = r4
            r19 = r11
            r14.<init>(r15, r16, r17, r18, r19)
            X.1XS r0 = r5.A0A
            r0.A03(r1, r13)
            r7.A0D(r5, r13)
        L_0x0135:
            r11.await()     // Catch:{ InterruptedException -> 0x013a }
            goto L_0x02a3
        L_0x013a:
            r1 = move-exception
            java.lang.String r0 = "Payment Media upload interrupted"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0147 }
            r0 = 3
            r2.A01 = r0     // Catch:{ all -> 0x0147 }
            r2.A00 = r0     // Catch:{ all -> 0x0147 }
            goto L_0x02a3
        L_0x0147:
            r0 = move-exception
            r6.A02(r2)
            throw r0
        L_0x014c:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.lang.Object r3 = r5.A02
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r11 = r3.iterator()
        L_0x0159:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x026d
            java.lang.Object r6 = r11.next()
            X.2eK r6 = (X.C52712eK) r6
            java.lang.String r0 = r6.A09
            if (r0 == 0) goto L_0x01c9
            X.AnonymousClass00B.A06(r0)
            byte[] r1 = r0.getBytes()
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x01af }
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r2 = java.util.Collections.singletonList(r1)
            java.lang.Object r0 = r5.A00
            X.0sG r0 = (X.C16000sG) r0
            X.18c r1 = r0.A06
            r0 = 1
            java.util.Collection r0 = r1.A0C(r0)
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.AnonymousClass288.A01(r7, r2, r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0199:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r0 = r2.next()
            X.0sH r0 = (X.C16010sH) r0
            X.0rv r1 = r0.A0E
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0199
            r6.add(r1)
            goto L_0x0199
        L_0x01af:
            r0 = move-exception
            java.lang.Object r6 = r5.A01
            X.0so r6 = (X.C16300so) r6
            java.lang.String r2 = r0.toString()
            r1 = 1
            java.lang.String r0 = "SyncDeviceNotificationRunnable/getSidelistContactsMatchingHash NoSuchAlgorithmException"
            r6.AcB(r0, r2, r1)
            java.lang.String r0 = "SyncDeviceNotificationRunnable/onRun/NoSuchAlgorithmException."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.util.List r6 = java.util.Collections.EMPTY_LIST
        L_0x01c5:
            r4.addAll(r6)
            goto L_0x0159
        L_0x01c9:
            com.whatsapp.jid.UserJid r2 = r6.A06
            X.AnonymousClass00B.A06(r2)
            java.lang.Object r7 = r5.A07
            X.0z2 r7 = (X.C19810z2) r7
            long r9 = r7.A04(r2)
            long r0 = r6.A00
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0212
            java.lang.String r0 = "SyncDeviceNotificationRunnable/handleUserDeviceUpdate/local ts is larger than notification one"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.01Q r7 = new X.01Q
            r7.<init>(r0, r0)
        L_0x01e8:
            java.lang.Object r0 = r7.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01f8
            X.AnonymousClass00B.A06(r2)
            r4.add(r2)
        L_0x01f8:
            java.lang.Object r0 = r7.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0159
            X.01Q r0 = r6.A01
            if (r0 == 0) goto L_0x0159
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x0159
            X.AnonymousClass00B.A06(r0)
            r4.add(r0)
            goto L_0x0159
        L_0x0212:
            X.0vs r0 = r6.A02
            boolean r10 = r5.A01(r0, r2, r6)
            X.01Q r9 = r6.A01
            r8 = 0
            if (r9 == 0) goto L_0x026b
            X.0vs r1 = r6.A04
            java.lang.Object r0 = r9.A00
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r5.A01(r1, r0, r6)
        L_0x0227:
            if (r10 != 0) goto L_0x0262
            if (r0 != 0) goto L_0x0262
            X.0vs r0 = r6.A03
            r5.A00(r0, r6)
            if (r9 == 0) goto L_0x0249
            X.0vs r0 = r6.A05
            r5.A00(r0, r6)
            java.lang.Object r1 = r9.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r9.A01
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r7.A0J(r1, r0)
            if (r0 != 0) goto L_0x0249
            r8 = 1
        L_0x0249:
            java.lang.String r0 = r6.A08
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r7.A0J(r2, r0)
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
        L_0x025c:
            X.01Q r7 = new X.01Q
            r7.<init>(r1, r0)
            goto L_0x01e8
        L_0x0262:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x025c
        L_0x026b:
            r0 = 0
            goto L_0x0227
        L_0x026d:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0287
            java.lang.Object r2 = r5.A04
            X.16U r2 = (X.AnonymousClass16U) r2
            int r0 = r4.size()
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r1 = r4.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            r0 = 2
            r2.A01(r1, r0)
        L_0x0287:
            java.util.Iterator r2 = r3.iterator()
        L_0x028b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02a6
            java.lang.Object r0 = r2.next()
            X.2eK r0 = (X.C52712eK) r0
            X.1ci r1 = r0.A07
            if (r1 == 0) goto L_0x028b
            java.lang.Object r0 = r5.A06
            X.124 r0 = (X.AnonymousClass124) r0
            r0.A02(r1)
            goto L_0x028b
        L_0x02a3:
            r6.A02(r2)
        L_0x02a6:
            return
        L_0x02a7:
            java.lang.Object r9 = r5.A00
            com.obwhatsapp.community.CommunityTabViewModel r9 = (com.obwhatsapp.community.CommunityTabViewModel) r9
            java.lang.Object r2 = r5.A01
            X.0pt r2 = (X.C14870pt) r2
            java.lang.Object r11 = r5.A02
            java.lang.Object r10 = r5.A03
            java.lang.Object r14 = r5.A04
            java.lang.Object r12 = r5.A05
            java.lang.Object r15 = r5.A06
            java.lang.Object r13 = r5.A07
            X.0uk r0 = r9.A01
            X.15m r1 = r0.A07
            java.lang.String r0 = "CommunityChatStore/getCommunityChats"
            X.1Zf r7 = new X.1Zf
            r7.<init>((java.lang.String) r0)
            X.0ts r6 = r1.A00
            r0 = 1
            java.util.List r1 = r6.A07(r0)
            int r0 = r1.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x02da:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0306
            java.lang.Object r0 = r8.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.0rv r3 = r6.A05(r0)
            if (r3 != 0) goto L_0x0302
            java.lang.String r4 = "CommunityChatStore/failed to find chatJid by row id: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x02da
        L_0x0302:
            r5.add(r3)
            goto L_0x02da
        L_0x0306:
            r7.A01()
            java.util.Iterator r6 = r5.iterator()
        L_0x030d:
            boolean r0 = r6.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x0368
            java.lang.Object r1 = r6.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0rt r0 = r9.A06
            X.0rx r3 = r0.A06(r1)
            if (r3 == 0) goto L_0x030d
            java.util.Map r0 = r9.A0P
            java.util.List r1 = r9.A06(r3, r0)
            if (r1 == 0) goto L_0x033a
            java.util.Comparator r0 = r9.A0N
            java.util.Collections.sort(r1, r0)
            java.util.Map r0 = r9.A0O
            r0.put(r3, r1)
            int r0 = r1.size()
            if (r0 != r5) goto L_0x030d
        L_0x033a:
            X.15l r4 = r9.A0H
            int r1 = r3.A01
            r0 = 3
            if (r1 == r0) goto L_0x0343
            if (r1 != r5) goto L_0x030d
        L_0x0343:
            X.0sG r1 = r4.A00
            X.0rv r0 = r3.A05()
            X.0sH r0 = r1.A0A(r0)
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x030d
            java.util.Set r0 = r9.A0Q
            r0.add(r3)
            java.util.Map r1 = r9.A0O
            java.lang.Object r0 = r1.get(r3)
            if (r0 != 0) goto L_0x030d
            java.util.List r0 = java.util.Collections.emptyList()
            r1.put(r3, r0)
            goto L_0x030d
        L_0x0368:
            r9.A07(r5)
            r16 = 1
            com.facebook.redex.RunnableRunnableShape0S0700000_I0 r8 = new com.facebook.redex.RunnableRunnableShape0S0700000_I0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r2.A0K(r8)
            return
        L_0x0376:
            java.lang.Object r0 = r5.A02
            X.0rs r0 = (X.C15800rs) r0
            java.util.List r0 = r0.A08()
            java.util.Iterator r9 = r0.iterator()
            r2 = 0
        L_0x0383:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0412
            java.lang.Object r6 = r9.next()
            X.0rv r6 = (X.C15830rv) r6
            java.lang.Object r0 = r5.A01
            X.0rt r0 = (X.C15810rt) r0
            int r4 = r0.A00(r6)
            if (r4 <= 0) goto L_0x0383
            java.lang.Object r3 = r5.A00
            X.0sf r3 = (X.C16220sf) r3
            java.lang.String r0 = r6.getRawString()
            X.1WS r0 = r3.A07(r0)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x040d
            java.lang.Object r1 = r5.A03
            X.0yz r1 = (X.C19780yz) r1
            r0 = 7
            int r0 = java.lang.Math.min(r4, r0)
            java.util.ArrayList r0 = r1.A03(r6, r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x03bc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0383
            java.lang.Object r7 = r8.next()
            X.0tZ r7 = (X.C16740tZ) r7
            java.util.List r1 = r7.A0q
            r6 = 1
            if (r1 == 0) goto L_0x03dd
            java.lang.Object r0 = r5.A04
            X.0sK r0 = (X.C16040sK) r0
            r0.A0B()
            X.1ZT r0 = r0.A05
            boolean r0 = r1.contains(r0)
            r1 = 1
            if (r0 != 0) goto L_0x03de
        L_0x03dd:
            r1 = 0
        L_0x03de:
            X.0tZ r0 = r7.A0D()
            if (r0 == 0) goto L_0x0410
            X.0rv r0 = r0.A0B()
            if (r0 != 0) goto L_0x0410
        L_0x03ea:
            X.1Vw r0 = r7.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x03bc
            if (r6 != 0) goto L_0x03f8
            if (r1 == 0) goto L_0x03bc
        L_0x03f8:
            X.0rv r0 = r7.A0B()
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.getRawString()
            X.1WS r0 = r3.A07(r0)
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x03bc
        L_0x040d:
            int r2 = r2 + r4
            goto L_0x0383
        L_0x0410:
            r6 = 0
            goto L_0x03ea
        L_0x0412:
            java.lang.Object r0 = r5.A05
            X.0pi r0 = (X.C14760pi) r0
            r0.A03()
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            int r2 = r2 + r0
            java.lang.String r1 = "widgetprovider/updatebadgecount:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r5.A06
            X.1vD r1 = (X.C41091vD) r1
            java.lang.Object r0 = r5.A07
            X.0tz r0 = (X.C16980tz) r0
            android.content.Context r0 = r0.A00
            r1.A02(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0800000_I0.run():void");
    }
}
