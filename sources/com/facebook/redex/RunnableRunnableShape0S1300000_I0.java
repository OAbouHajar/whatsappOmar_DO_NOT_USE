package com.facebook.redex;

import X.C16740tZ;
import X.C16760tb;
import X.C34151jm;
import X.C37511pH;
import X.C52522dw;
import java.util.List;

public class RunnableRunnableShape0S1300000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape0S1300000_I0(int i2, String str, Object obj, Object obj2, Object obj3) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = str;
    }

    public RunnableRunnableShape0S1300000_I0(C16760tb r2, C16740tZ r3, String str, List list) {
        this.A04 = 0;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = str;
        this.A02 = list;
    }

    public RunnableRunnableShape0S1300000_I0(C52522dw r2, C37511pH r3, C34151jm r4, String str) {
        this.A04 = 7;
        this.A00 = r2;
        this.A03 = str;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x026f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x022f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x023a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:80:0x0227=Splitter:B:80:0x0227, B:85:0x022f=Splitter:B:85:0x022f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:87:0x0230=Splitter:B:87:0x0230, B:94:0x023a=Splitter:B:94:0x023a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r43 = this;
            r6 = r43
            int r0 = r6.A04
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x00a0;
                case 2: goto L_0x00dc;
                case 3: goto L_0x0115;
                case 4: goto L_0x0129;
                case 5: goto L_0x017d;
                case 6: goto L_0x0295;
                case 7: goto L_0x049d;
                case 8: goto L_0x04b0;
                case 9: goto L_0x0502;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r6.A00
            X.1Jf r4 = (X.C25291Jf) r4
            java.lang.Object r3 = r6.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.Object r5 = r6.A02
            X.1Z6 r5 = (X.AnonymousClass1Z6) r5
            java.lang.String r2 = r6.A03
            X.0uc r0 = r4.A02
            X.235 r0 = r0.A0A
            X.1mD r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0032
            X.1Je r1 = r4.A00
            X.4vm r0 = new X.4vm
            r0.<init>(r5, r3, r4, r2)
            X.2yR r0 = r1.A00(r0, r3, r2)
            r0.A06()
            return
        L_0x0032:
            java.lang.String r3 = "success"
            X.1Z8 r6 = X.AnonymousClass1Z8.A00
            X.0pt r0 = r4.A01
            r2 = 9
            com.facebook.redex.RunnableRunnableShape0S1300000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S1300000_I0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0K(r1)
            return
        L_0x0044:
            java.lang.Object r4 = r6.A00
            X.0tb r4 = (X.C16760tb) r4
            java.lang.Object r3 = r6.A01
            X.0tZ r3 = (X.C16740tZ) r3
            java.lang.String r11 = r6.A03
            r5 = 0
            java.lang.Object r12 = r6.A02
            java.util.List r12 = (java.util.List) r12
            r13 = 0
            X.1Vw r2 = r3.A11
            X.0rv r7 = r2.A00
            r8 = r5
            r9 = r5
            r10 = r5
            r14 = 0
            r15 = 0
            r6 = r5
            X.1cc r1 = r4.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.1sC r0 = r3.A0G()
            if (r0 == 0) goto L_0x006e
            X.1sC r0 = r3.A0G()
            X.1Vw r2 = r0.A02
        L_0x006e:
            X.0t3 r0 = r4.A0Q
            long r8 = r0.A00()
            long r10 = r0.A00()
            X.1sC r6 = new X.1sC
            r7 = r2
            r6.<init>(r7, r8, r10)
            r1.A0g(r6)
            r0 = 131072(0x20000, float:1.83671E-40)
            r1.A0S(r0)
            X.1Sc r2 = r4.A0g
            r0 = 1
            r2.A01(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0092 }
            X.0y3 r0 = r2.A0K     // Catch:{ IllegalArgumentException -> 0x0092 }
            r0.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0092 }
            return
        L_0x0092:
            r1 = move-exception
            java.lang.String r0 = "EditMessageManager/handleOutgoingEditedMessage"
            com.whatsapp.util.Log.e(r0, r1)
            X.0so r1 = r2.A00
            java.lang.String r0 = "EditMessageManager/handleOutgoingEditedMessage/invalidMessage"
            r1.AcB(r0, r5, r13)
            return
        L_0x00a0:
            java.lang.Object r5 = r6.A00
            X.1ZR r5 = (X.AnonymousClass1ZR) r5
            java.lang.Object r1 = r6.A01
            X.013 r1 = (X.AnonymousClass013) r1
            java.lang.Object r4 = r6.A02
            X.0pt r4 = (X.C14870pt) r4
            java.lang.String r3 = r6.A03
            r0 = 5
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x00ce }
            java.lang.String r0 = r1.A06()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x00ce }
            r5.A0B(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x00ce }
            boolean r0 = r5.A0F()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x00ce }
            if (r0 == 0) goto L_0x00cb
            r1 = 0
            com.facebook.redex.RunnableRunnableShape0S1110000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1110000_I0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x00ce }
            r0.<init>(r5, r3, r1, r1)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x00ce }
            r4.A0K(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x00ce }
            r5.A09()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x00ce }
        L_0x00cb:
            r5.A08()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x00ce }
        L_0x00ce:
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = 1
            r1 = 0
            com.facebook.redex.RunnableRunnableShape0S1110000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1110000_I0
            r0.<init>(r5, r3, r1, r2)
            r4.A0K(r0)
            return
        L_0x00dc:
            java.lang.Object r5 = r6.A00
            X.01Y r5 = (X.AnonymousClass01Y) r5
            java.lang.Object r1 = r6.A01
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r4 = r6.A03
            java.lang.Object r3 = r6.A02
            monitor-enter(r5)
            java.util.Set r0 = r5.A0Z     // Catch:{ all -> 0x0112 }
            r0.clear()     // Catch:{ all -> 0x0112 }
            r0.addAll(r1)     // Catch:{ all -> 0x0112 }
            X.15K r0 = r5.A0B     // Catch:{ all -> 0x0112 }
            r0.A00(r1)     // Catch:{ all -> 0x0112 }
            X.0rz r2 = r5.A0J     // Catch:{ all -> 0x0112 }
            X.0t3 r0 = r5.A0I     // Catch:{ all -> 0x0112 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0112 }
            r2.A0m(r0)     // Catch:{ all -> 0x0112 }
            r2.A0r(r4)     // Catch:{ all -> 0x0112 }
            X.0pt r2 = r5.A07     // Catch:{ all -> 0x0112 }
            r1 = 25
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1     // Catch:{ all -> 0x0112 }
            r0.<init>(r5, r1, r3)     // Catch:{ all -> 0x0112 }
            r2.A0K(r0)     // Catch:{ all -> 0x0112 }
            monitor-exit(r5)     // Catch:{ all -> 0x0112 }
            return
        L_0x0112:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0112 }
            throw r0
        L_0x0115:
            java.lang.Object r0 = r6.A00
            X.2Df r0 = (X.C46262Df) r0
            java.lang.Object r3 = r6.A01
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r2 = r6.A03
            java.lang.Object r1 = r6.A02
            java.util.Map r1 = (java.util.Map) r1
            X.01Y r0 = r0.A02
            r0.A0O(r2, r1, r3)
            return
        L_0x0129:
            java.lang.Object r9 = r6.A00
            com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r9 = (com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r9
            java.lang.String r8 = r6.A03
            java.lang.Object r7 = r6.A01
            X.4Wg r7 = (X.C87314Wg) r7
            java.lang.Object r5 = r6.A02
            X.4Vm r5 = (X.C87124Vm) r5
            java.util.LinkedList r4 = r9.A0e
            monitor-enter(r4)
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = r9.A07()     // Catch:{ all -> 0x017a }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0178
            android.os.Handler r1 = r9.A0C     // Catch:{ all -> 0x017a }
            java.lang.Runnable r0 = r9.A06     // Catch:{ all -> 0x017a }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x017a }
            java.util.List r0 = r7.A07     // Catch:{ all -> 0x017a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0161
            java.util.List r0 = r7.A04     // Catch:{ all -> 0x017a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x017a }
            if (r0 != 0) goto L_0x016f
        L_0x0161:
            X.26x r3 = r9.A0U     // Catch:{ all -> 0x017a }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x017a }
            X.1mF r0 = new X.1mF     // Catch:{ all -> 0x017a }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x017a }
            r3.A01(r0)     // Catch:{ all -> 0x017a }
        L_0x016f:
            X.3FH r1 = r9.A0T     // Catch:{ all -> 0x017a }
            X.4P1 r0 = r1.A09     // Catch:{ all -> 0x017a }
            r0.A06 = r5     // Catch:{ all -> 0x017a }
            r1.ANq(r7)     // Catch:{ all -> 0x017a }
        L_0x0178:
            monitor-exit(r4)     // Catch:{ all -> 0x017a }
            return
        L_0x017a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x017a }
            throw r0
        L_0x017d:
            java.lang.Object r0 = r6.A00
            X.1CY r0 = (X.AnonymousClass1CY) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            java.lang.String r1 = r6.A03
            java.lang.Object r5 = r6.A02
            X.1ci r5 = (X.C30641ci) r5
            X.19M r7 = r0.A0C
            X.AnonymousClass00B.A06(r1)
            X.1bL r1 = r7.A03(r2, r1)
            X.1bM r1 = (X.C29871bM) r1
            if (r1 == 0) goto L_0x028f
            int r3 = r1.A03
            r4 = 2
            if (r3 == 0) goto L_0x01ac
            if (r3 != r4) goto L_0x027f
            int r6 = r1.A01
            X.0s5 r4 = r0.A00
            X.0tC r3 = X.C15910s6.A1P
            int r3 = r4.A02(r3)
            if (r6 <= r3) goto L_0x027f
            r4 = 3
        L_0x01ac:
            java.lang.String r3 = "history-sync-manager/activate sync phase "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r4)
            java.lang.String r3 = " for "
            r6.append(r3)
            r6.append(r2)
            java.lang.String r3 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.1RS r3 = r0.A0B
            X.AnonymousClass00B.A00()
            android.content.ContentValues r14 = new android.content.ContentValues
            r14.<init>()
            r19 = 1
            java.lang.String r8 = "1"
            java.lang.String r6 = "status"
            r14.put(r6, r8)
            X.19K r15 = r3.A02
            X.0tf r6 = r15.A02()
            X.1cj r18 = r6.A00()     // Catch:{ all -> 0x0270 }
            X.0tg r13 = r6.A02     // Catch:{ all -> 0x026b }
            java.lang.String r12 = "msg_history_sync"
            java.lang.String r11 = "device_id=?  AND sync_type=?  AND status=?"
            r8 = 3
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x026b }
            java.lang.String r8 = r2.getRawString()     // Catch:{ all -> 0x026b }
            r17 = 0
            r10[r17] = r8     // Catch:{ all -> 0x026b }
            java.lang.String r16 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x026b }
            r10[r19] = r16     // Catch:{ all -> 0x026b }
            r9 = 2
            java.lang.String r8 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x026b }
            r10[r9] = r8     // Catch:{ all -> 0x026b }
            int r14 = r13.A00(r12, r14, r11, r10)     // Catch:{ all -> 0x026b }
            if (r14 != 0) goto L_0x0261
            X.0tf r11 = r15.get()     // Catch:{ all -> 0x026b }
            X.0tg r13 = r11.A02     // Catch:{ all -> 0x0236 }
            java.lang.String r12 = "SELECT status FROM msg_history_sync WHERE device_id=? AND sync_type=? LIMIT 1"
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x0236 }
            java.lang.String r8 = r2.getRawString()     // Catch:{ all -> 0x0236 }
            r10 = 0
            r9[r17] = r8     // Catch:{ all -> 0x0236 }
            r9[r19] = r16     // Catch:{ all -> 0x0236 }
            android.database.Cursor r9 = r13.A08(r12, r9)     // Catch:{ all -> 0x0236 }
            if (r9 == 0) goto L_0x0230
            int r8 = r9.getCount()     // Catch:{ all -> 0x022b }
            if (r8 <= 0) goto L_0x0227
            r10 = 1
        L_0x0227:
            r9.close()     // Catch:{ all -> 0x0236 }
            goto L_0x0230
        L_0x022b:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x022f }
        L_0x022f:
            throw r0     // Catch:{ all -> 0x0236 }
        L_0x0230:
            r11.close()     // Catch:{ all -> 0x026b }
            if (r10 != 0) goto L_0x0261
            goto L_0x023b
        L_0x0236:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x023a }
        L_0x023a:
            throw r0     // Catch:{ all -> 0x026b }
        L_0x023b:
            r25 = -1
            r23 = -1
            r24 = 2
            r20 = 0
            X.1bK r8 = new X.1bK     // Catch:{ all -> 0x026b }
            r27 = -1
            r29 = -1
            r31 = -1
            r33 = -1
            r35 = -1
            r37 = -1
            r39 = -1
            r41 = -1
            r19 = r8
            r21 = r2
            r22 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41)     // Catch:{ all -> 0x026b }
            r3.A02(r8)     // Catch:{ all -> 0x026b }
        L_0x0261:
            r18.A00()     // Catch:{ all -> 0x026b }
            r3.A01(r6, r2)     // Catch:{ all -> 0x026b }
            r18.close()     // Catch:{ all -> 0x0270 }
            goto L_0x0275
        L_0x026b:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x026f }
        L_0x026f:
            throw r0     // Catch:{ all -> 0x0270 }
        L_0x0270:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0274 }
        L_0x0274:
            throw r0
        L_0x0275:
            r6.close()
            if (r14 <= 0) goto L_0x027f
            X.1Cb r2 = r0.A02
            r2.A02()
        L_0x027f:
            long r1 = r1.A13
            X.AnonymousClass00B.A00()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r7.A06(r1)
        L_0x028f:
            X.124 r0 = r0.A0E
            r0.A02(r5)
            return
        L_0x0295:
            java.lang.Object r10 = r6.A00
            X.1Ci r10 = (X.C23531Ci) r10
            java.lang.Object r9 = r6.A01
            java.util.Set r9 = (java.util.Set) r9
            java.lang.Object r8 = r6.A02
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8
            java.lang.String r7 = r6.A03
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r17 = r9.iterator()
            r18 = 0
            r19 = 0
            r21 = 0
        L_0x02b2:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x041f
            java.lang.Object r12 = r17.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r11 = X.C30931dC.A02(r12)
            X.0ua r0 = r10.A03
            X.013 r1 = r10.A07
            r5 = 0
            if (r11 == 0) goto L_0x02e2
            java.lang.String[] r2 = X.C30931dC.A03
            java.lang.String r2 = X.C30931dC.A03(r11, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x02e2
            X.1ZR r3 = X.C87664Ya.A00(r2)
            if (r3 == 0) goto L_0x03d2
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x02dd:
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r3, r0)
        L_0x02e2:
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest load result="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r1 = 1
            r0 = 0
            if (r5 == 0) goto L_0x02ee
            r0 = 1
        L_0x02ee:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 0
            if (r5 != 0) goto L_0x0308
            X.1pH r1 = X.C37511pH.A03
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r4)
            r6.put(r12, r0)
            int r21 = r21 + 1
            goto L_0x02b2
        L_0x0308:
            java.lang.Object r0 = r5.first
            X.1ZR r0 = (X.AnonymousClass1ZR) r0
            X.1pH r16 = X.C37511pH.A04
            java.lang.String r13 = r0.A0K
            java.lang.String r14 = r0.A0H
            byte[] r3 = r0.A0T
            java.lang.String r15 = r0.A0D
            int r0 = r0.A02
            if (r0 != r1) goto L_0x031d
            java.lang.String r4 = "video"
        L_0x031d:
            X.1pL r0 = X.C37551pL.A08
            X.1Wr r2 = r0.A0U()
            r2.A03()
            X.1Wm r1 = r2.A00
            X.1pL r1 = (X.C37551pL) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A07 = r12
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x0347
            r2.A03()
            X.1Wm r1 = r2.A00
            X.1pL r1 = (X.C37551pL) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A06 = r13
        L_0x0347:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x035c
            r2.A03()
            X.1Wm r1 = r2.A00
            X.1pL r1 = (X.C37551pL) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A03 = r14
        L_0x035c:
            if (r3 == 0) goto L_0x0373
            int r1 = r3.length
            r0 = 0
            X.1Ww r3 = X.C28631Ww.A01(r3, r0, r1)
            r2.A03()
            X.1Wm r1 = r2.A00
            X.1pL r1 = (X.C37551pL) r1
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            r1.A01 = r3
        L_0x0373:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0388
            r2.A03()
            X.1Wm r1 = r2.A00
            X.1pL r1 = (X.C37551pL) r1
            int r0 = r1.A00
            r0 = r0 | 16
            r1.A00 = r0
            r1.A02 = r15
        L_0x0388:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x039d
            r2.A03()
            X.1Wm r1 = r2.A00
            X.1pL r1 = (X.C37551pL) r1
            int r0 = r1.A00
            r0 = r0 | 32
            r1.A00 = r0
            r1.A04 = r11
        L_0x039d:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x03b2
            r2.A03()
            X.1Wm r1 = r2.A00
            X.1pL r1 = (X.C37551pL) r1
            int r0 = r1.A00
            r0 = r0 | 64
            r1.A00 = r0
            r1.A05 = r4
        L_0x03b2:
            X.1Wm r2 = r2.A02()
            android.util.Pair r1 = new android.util.Pair
            r0 = r16
            r1.<init>(r0, r2)
            r6.put(r12, r1)
            java.lang.Object r0 = r5.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03ce
            int r18 = r18 + 1
            goto L_0x02b2
        L_0x03ce:
            int r19 = r19 + 1
            goto L_0x02b2
        L_0x03d2:
            r4 = 0
            X.1ZR r3 = new X.1ZR
            r3.<init>(r0, r2)
            r0 = 5
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r0 = r1.A06()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x03fc }
            r3.A0B(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x03fc }
            boolean r0 = r3.A0F()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x03fc }
            if (r0 == 0) goto L_0x03f8
            X.197 r1 = X.C87664Ya.A00     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x03fc }
            monitor-enter(r1)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x03fc }
            r1.put(r2, r3)     // Catch:{ all -> 0x03f5 }
            monitor-exit(r1)     // Catch:{ all -> 0x03f5 }
            r3.A09()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x03fc }
            r4 = 1
            goto L_0x03f8
        L_0x03f5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03f5 }
            throw r0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x03fc }
        L_0x03f8:
            r3.A08()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x03fc }
            goto L_0x0411
        L_0x03fc:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x041a }
            r1.<init>()     // Catch:{ all -> 0x041a }
            java.lang.String r0 = "WebPageLoader/loadPage/ex="
            r1.append(r0)     // Catch:{ all -> 0x041a }
            r1.append(r2)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x041a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x041a }
        L_0x0411:
            android.net.TrafficStats.clearThreadStatsTag()
            if (r4 == 0) goto L_0x02e2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x02dd
        L_0x041a:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x041f:
            X.1Gq r3 = r10.A05
            java.lang.String r0 = "NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage link preview stanzaId="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = "; remoteDeviceJid"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; linkPreviewSize="
            r1.append(r0)
            int r0 = r6.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0461
            java.lang.String r0 = "NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage link preview result is empty"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0451:
            X.1RL r0 = r10.A04
            r16 = 2
            int r17 = r9.size()
            r20 = 0
            r14 = r0
            r15 = r7
            r14.A00(r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0461:
            X.0sK r0 = r3.A00
            r0.A0B()
            X.1ZT r5 = r0.A05
            X.18b r4 = r3.A06
            X.0t3 r0 = r3.A03
            long r0 = r0.A00()
            r2 = 1
            X.1Vw r2 = r4.A02(r5, r2)
            X.1pK r4 = new X.1pK
            r4.<init>(r2, r7, r0)
            r4.A00 = r8
            r4.A00 = r6
            X.19M r0 = r3.A04
            long r5 = r0.A01(r4)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0490
            java.lang.String r0 = "NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage unable to add link preview peer message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0451
        L_0x0490:
            X.0xb r3 = r3.A01
            r2 = 0
            r1 = 0
            com.obwhatsapp.jobqueue.job.SendPeerMessageJob r0 = new com.obwhatsapp.jobqueue.job.SendPeerMessageJob
            r0.<init>(r8, r4, r2, r1)
            r3.A00(r0)
            goto L_0x0451
        L_0x049d:
            java.lang.Object r4 = r6.A00
            X.2dw r4 = (X.C52522dw) r4
            java.lang.String r3 = r6.A03
            java.lang.Object r2 = r6.A01
            X.1pH r2 = (X.C37511pH) r2
            java.lang.Object r1 = r6.A02
            X.1jm r1 = (X.C34151jm) r1
            r0 = 0
            r4.A00(r2, r1, r3, r0)
            return
        L_0x04b0:
            java.lang.Object r5 = r6.A00
            X.0yx r5 = (X.C19760yx) r5
            java.lang.Object r2 = r6.A01
            android.os.ConditionVariable r2 = (android.os.ConditionVariable) r2
            java.lang.String r1 = r6.A03
            java.lang.Object r4 = r6.A02
            android.content.ServiceConnection r4 = (android.content.ServiceConnection) r4
            java.lang.String r0 = "registrationmanager/success/waiting-for-gdrive-service-object"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.block()
            java.lang.String r0 = "registrationmanager/success/cancel-pending-gdrive-backup-and-restore-if-any"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12U r0 = r5.A0D
            r0.A03()
            java.lang.String r0 = "registrationmanager/success/gdrive-start-change-number"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tz r0 = r5.A0M
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "action_change_number"
            android.content.Intent r2 = X.C14750ph.A0d(r3, r0)
            java.lang.String r0 = "old_phone_number"
            r2.putExtra(r0, r1)
            X.0sK r0 = r5.A05
            r0.A0B()
            X.1ZT r0 = r0.A05
            if (r0 != 0) goto L_0x04ff
            r1 = 0
        L_0x04ee:
            java.lang.String r0 = "new_phone_number"
            r2.putExtra(r0, r1)
            X.C446524y.A00(r3, r2)
            r3.unbindService(r4)
            X.12t r1 = r5.A0S
            r0 = 1
            r1.A01 = r0
            return
        L_0x04ff:
            java.lang.String r1 = r0.user
            goto L_0x04ee
        L_0x0502:
            java.lang.Object r1 = r6.A00
            X.1Jf r1 = (X.C25291Jf) r1
            java.lang.Object r4 = r6.A01
            X.1Z6 r4 = (X.AnonymousClass1Z6) r4
            java.lang.String r3 = r6.A03
            java.lang.Object r2 = r6.A02
            java.util.Map r2 = (java.util.Map) r2
            r0 = 2
            X.C18450wi.A0H(r3, r0)
            X.1Jd r1 = r1.A03
            java.lang.String r0 = "address_message_validate"
            X.1Z7 r0 = r1.A00(r4, r0)
            r0.A02(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S1300000_I0.run():void");
    }
}
