package X;

/* renamed from: X.1Ty  reason: invalid class name and case insensitive filesystem */
public class C28001Ty extends C208111r {
    public final C14870pt A00;
    public final C211512z A01;
    public final C19000xb A02;
    public final C208211s A03;
    public final AnonymousClass16P A04;
    public final C18920xT A05;
    public final C19430yQ A06;
    public final C27471Rw A07;

    public C28001Ty(C16300so r9, C14870pt r10, C211512z r11, C19000xb r12, C208211s r13, AnonymousClass16P r14, C18920xT r15, C19430yQ r16, C27471Rw r17, C17190ug r18, C207811o r19, C16320sq r20) {
        super(r9, r18, r19, r20, new int[]{240}, false);
        this.A00 = r10;
        this.A05 = r15;
        this.A02 = r12;
        this.A04 = r14;
        this.A01 = r11;
        this.A03 = r13;
        this.A07 = r17;
        this.A06 = r16;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0677, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ed, code lost:
        if (r5 != false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        A03(r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:223:0x06ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:228:0x06b1 */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:228:0x06b1=Splitter:B:228:0x06b1, B:67:0x01cf=Splitter:B:67:0x01cf} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:65:0x01cc=Splitter:B:65:0x01cc, B:223:0x06ac=Splitter:B:223:0x06ac} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C28371Vv r33, int r34) {
        /*
            r32 = this;
            r0 = 240(0xf0, float:3.36E-43)
            r1 = r34
            if (r1 == r0) goto L_0x0007
            return
        L_0x0007:
            r9 = 0
            r2 = r33
            X.1Vv r5 = r2.A0I(r9)
            if (r5 == 0) goto L_0x06e2
            java.lang.String r1 = "t"
            r0 = 0
            java.lang.String r16 = r2.A0N(r1, r0)
            r3 = r32
            X.1ci r2 = r3.A00()
            com.whatsapp.jid.UserJid r6 = r2.A00()
            java.lang.String r1 = r5.A00
            r8 = -1
            int r0 = r1.hashCode()
            java.lang.String r4 = "enc"
            switch(r0) {
                case -1607257499: goto L_0x069b;
                case 100570: goto L_0x0692;
                case 1671308008: goto L_0x0687;
                case 1901043637: goto L_0x067c;
                default: goto L_0x002e;
            }
        L_0x002e:
            r1 = 4
            java.lang.String r13 = "registration"
            java.lang.String r10 = "retry"
            java.lang.String r0 = "count"
            java.lang.String r7 = "request"
            java.lang.String r12 = "; retryCount="
            java.lang.String r11 = "invalid registration node"
            switch(r8) {
                case 0: goto L_0x049a;
                case 1: goto L_0x0422;
                case 2: goto L_0x031b;
                case 3: goto L_0x0043;
                default: goto L_0x003f;
            }
        L_0x003f:
            r3.A03(r2)
            return
        L_0x0043:
            X.1Vv r14 = r5.A0J(r7)
            X.1Vv r8 = r5.A0J(r4)
            java.lang.String r4 = "final"
            r15 = 0
            java.lang.String r4 = r5.A0N(r4, r15)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x005c
            java.lang.String r0 = "connection/handleLocationNotifications/final attribute is empty"
            goto L_0x0677
        L_0x005c:
            java.lang.String r6 = "; msgId="
            java.lang.String r7 = "context"
            if (r14 == 0) goto L_0x0220
            int r10 = r14.A0A(r10, r9)
            X.1Vv r0 = r5.A0J(r13)
            if (r0 == 0) goto L_0x06c7
            byte[] r9 = r0.A01
            if (r9 == 0) goto L_0x06c1
            int r0 = r9.length
            if (r0 != r1) goto L_0x06c1
            java.lang.Class<X.0rv> r8 = X.C15830rv.class
            X.0so r0 = r3.A00
            com.whatsapp.jid.Jid r8 = r5.A0F(r0, r8, r7)
            X.0rv r8 = (X.C15830rv) r8
            if (r8 != 0) goto L_0x0085
            com.whatsapp.jid.Jid r0 = r2.A01
            X.0rv r8 = X.C16030sJ.A00(r0)
        L_0x0085:
            java.lang.String r5 = "connection/handleLocationNotifications/final live location retry notification; stanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r2)
            r0.append(r6)
            r0.append(r4)
            r0.append(r12)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.Jid r7 = r2.A01
            X.0rv r11 = X.C16030sJ.A00(r7)
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; stanzaKey="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r0 = "; contextJid="
            r5.append(r0)
            r5.append(r8)
            r5.append(r6)
            r5.append(r4)
            r5.append(r12)
            r5.append(r10)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C16030sJ.A0L(r11)
            if (r0 != 0) goto L_0x021c
            boolean r0 = X.C16030sJ.A0G(r11)
            if (r0 != 0) goto L_0x021c
            com.whatsapp.jid.DeviceJid r23 = com.whatsapp.jid.DeviceJid.of(r7)
            int r22 = X.C28641Wx.A00(r9)
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl got final location retry request; retryCount="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r10)
            java.lang.String r15 = "; targetDeviceJid="
            r5.append(r15)
            r0 = r23
            r5.append(r0)
            java.lang.String r0 = "; targetRegistrationIdInt="
            r5.append(r0)
            r0 = r22
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r10 <= r1) goto L_0x011a
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl skipping retry; reached max retry; jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
        L_0x010f:
            r0 = r23
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x04ff
        L_0x011a:
            r0 = 1
            X.1Vw r7 = new X.1Vw
            r7.<init>(r8, r4, r0)
            X.0yQ r13 = r3.A06
            X.AnonymousClass00B.A06(r23)
            com.whatsapp.jid.UserJid r21 = r23.getUserJid()
            r29 = 0
            X.1rV r9 = r13.A06(r7)
            if (r9 == 0) goto L_0x0207
            java.lang.Object r5 = r13.A0S
            monitor-enter(r5)
            java.util.Map r11 = r13.A0A()     // Catch:{ all -> 0x06be }
            X.0rv r0 = r7.A00     // Catch:{ all -> 0x06be }
            java.lang.Object r14 = r11.get(r0)     // Catch:{ all -> 0x06be }
            X.28s r14 = (X.C454628s) r14     // Catch:{ all -> 0x06be }
            r19 = 1000(0x3e8, double:4.94E-321)
            if (r14 == 0) goto L_0x017c
            X.01D r11 = r13.A0d     // Catch:{ all -> 0x06be }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x06be }
            X.0t6 r11 = (X.C16460t6) r11     // Catch:{ all -> 0x06be }
            X.0th r12 = r11.A0K     // Catch:{ all -> 0x06be }
            X.0tZ r11 = r12.A03(r7)     // Catch:{ all -> 0x06be }
            if (r11 == 0) goto L_0x0200
            boolean r11 = r12.A06(r11)     // Catch:{ all -> 0x06be }
            if (r11 != 0) goto L_0x0200
            X.1sx r11 = r14.A00     // Catch:{ all -> 0x06be }
            if (r11 == 0) goto L_0x017c
            java.util.List r12 = r14.A03     // Catch:{ all -> 0x06be }
            r11 = r21
            boolean r11 = r12.contains(r11)     // Catch:{ all -> 0x06be }
            if (r11 == 0) goto L_0x017c
            X.1sx r13 = r14.A00     // Catch:{ all -> 0x06be }
            long r0 = r13.A05     // Catch:{ all -> 0x06be }
            long r11 = r9.A0I     // Catch:{ all -> 0x06be }
            long r0 = r0 - r11
            long r0 = r0 / r19
            int r9 = (int) r0     // Catch:{ all -> 0x06be }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x06be }
            android.util.Pair r16 = android.util.Pair.create(r13, r0)     // Catch:{ all -> 0x06be }
            monitor-exit(r5)     // Catch:{ all -> 0x06be }
            goto L_0x01e5
        L_0x017c:
            X.1sx r11 = r9.A02     // Catch:{ all -> 0x06be }
            if (r11 == 0) goto L_0x0206
            X.1Rv r12 = r13.A0N     // Catch:{ all -> 0x06be }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x06be }
            java.lang.String r13 = r7.A01     // Catch:{ all -> 0x06be }
            X.1Ru r12 = r12.A00     // Catch:{ Exception -> 0x06b2 }
            X.0tf r12 = r12.get()     // Catch:{ Exception -> 0x06b2 }
            X.0tg r14 = r12.A02     // Catch:{ all -> 0x06ad }
            java.lang.String r25 = "location_sharer"
            java.lang.String[] r26 = X.C454428q.A00     // Catch:{ all -> 0x06ad }
            java.lang.String r27 = "remote_jid = ? AND from_me = ? AND remote_resource = ? AND message_id = ?"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x06ad }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x06ad }
            r18 = 0
            r1[r18] = r0     // Catch:{ all -> 0x06ad }
            java.lang.String r16 = "1"
            r0 = 1
            r1[r0] = r16     // Catch:{ all -> 0x06ad }
            r17 = 2
            java.lang.String r16 = r21.getRawString()     // Catch:{ all -> 0x06ad }
            r1[r17] = r16     // Catch:{ all -> 0x06ad }
            r16 = 3
            r1[r16] = r13     // Catch:{ all -> 0x06ad }
            r31 = r29
            r24 = r14
            r28 = r1
            r30 = r29
            android.database.Cursor r13 = r24.A09(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x06ad }
            if (r13 != 0) goto L_0x01c4
            java.lang.String r0 = "LocationSharingStore/isLocationReceiver/unable to get location sharer"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06a6 }
            goto L_0x01cf
        L_0x01c4:
            int r1 = r13.getCount()     // Catch:{ all -> 0x06a6 }
            if (r1 != r0) goto L_0x01cc
            r18 = 1
        L_0x01cc:
            r13.close()     // Catch:{ all -> 0x06ad }
        L_0x01cf:
            r12.close()     // Catch:{ Exception -> 0x06b2 }
            if (r18 == 0) goto L_0x0206
            long r0 = r11.A05     // Catch:{ all -> 0x06be }
            long r12 = r9.A0I     // Catch:{ all -> 0x06be }
            long r0 = r0 - r12
            long r0 = r0 / r19
            int r9 = (int) r0     // Catch:{ all -> 0x06be }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x06be }
            android.util.Pair r16 = android.util.Pair.create(r11, r0)     // Catch:{ all -> 0x06be }
            monitor-exit(r5)     // Catch:{ all -> 0x06be }
        L_0x01e5:
            if (r16 == 0) goto L_0x0207
            X.16P r0 = r3.A04
            r19 = 1
            com.facebook.redex.RunnableRunnableShape0S0402000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0402000_I0
            r12 = r1
            r13 = r3
            r14 = r23
            r15 = r7
            r17 = r22
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.execute(r1)
            goto L_0x003f
        L_0x0200:
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x06be }
            r13.A0O(r0)     // Catch:{ all -> 0x06be }
        L_0x0206:
            monitor-exit(r5)     // Catch:{ all -> 0x06be }
        L_0x0207:
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl skipping retry; final location message not found; contextJid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            r1.append(r6)
            r1.append(r4)
            r1.append(r15)
            goto L_0x010f
        L_0x021c:
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl received location key retry notification sent to a group or broadcast"
            goto L_0x04ff
        L_0x0220:
            if (r8 == 0) goto L_0x0317
            int r9 = r8.A0A(r0, r9)
            java.lang.String r0 = "source"
            java.lang.String r1 = r5.A0N(r0, r15)
            java.lang.String r0 = "cache"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02fa
            int r0 = java.lang.Integer.parseInt(r16)
            long r0 = (long) r0
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r10
        L_0x023d:
            java.lang.Class<X.0rv> r11 = X.C15830rv.class
            X.0so r10 = r3.A00
            com.whatsapp.jid.Jid r7 = r5.A0F(r10, r11, r7)
            X.0rv r7 = (X.C15830rv) r7
            X.1d1 r8 = X.C53622g0.A00(r8)
            java.lang.String r10 = "connection/handleLocationNotifications/final live location notification; stanzaKey="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r10)
            r5.append(r2)
            java.lang.String r13 = "; contextJid="
            r5.append(r13)
            r5.append(r7)
            r5.append(r6)
            r5.append(r4)
            r5.append(r12)
            r5.append(r9)
            java.lang.String r11 = "; cachedTime="
            r5.append(r11)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            java.lang.String r10 = "LocationNotificationHandler/onFinalLocationNotification/stanzaKey="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r10)
            r5.append(r2)
            r5.append(r13)
            r5.append(r7)
            r5.append(r6)
            r5.append(r4)
            r5.append(r12)
            r5.append(r9)
            r5.append(r11)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            int r10 = r8.A01
            r5 = 2
            if (r10 == r5) goto L_0x02b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version; ciphertextVersion="
        L_0x02ad:
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            goto L_0x04ff
        L_0x02b9:
            com.whatsapp.jid.Jid r11 = r2.A01
            X.0rv r6 = X.C16030sJ.A00(r11)
            boolean r5 = X.C16030sJ.A0L(r6)
            if (r5 == 0) goto L_0x02e5
            com.whatsapp.jid.Jid r5 = r2.A02
            com.whatsapp.jid.DeviceJid r13 = com.whatsapp.jid.DeviceJid.of(r5)
        L_0x02cb:
            r7 = r6
        L_0x02cc:
            X.2g3 r11 = new X.2g3
            r12 = r7
            r14 = r3
            r15 = r4
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            int r6 = r8.A00
            r5 = 3
            if (r6 != r5) goto L_0x02f0
            if (r9 <= 0) goto L_0x02fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version for retry final location notification; ciphertextVersion="
            goto L_0x02ad
        L_0x02e5:
            boolean r5 = X.C16030sJ.A0L(r7)
            com.whatsapp.jid.DeviceJid r13 = com.whatsapp.jid.DeviceJid.of(r11)
            if (r5 == 0) goto L_0x02cb
            goto L_0x02cc
        L_0x02f0:
            if (r9 != 0) goto L_0x02fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationNotificationHandler/onFinalLocationNotification/invalid ciphertext version for final location notification; ciphertextVersion="
            goto L_0x02ad
        L_0x02fa:
            r0 = 0
            goto L_0x023d
        L_0x02fe:
            X.16P r6 = r3.A04
            X.2g4 r5 = new X.2g4
            r16 = r2
            r17 = r4
            r18 = r9
            r19 = r0
            r10 = r5
            r14 = r8
            r15 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.concurrent.ThreadPoolExecutor r0 = r6.A00
            r0.execute(r5)
            goto L_0x003f
        L_0x0317:
            java.lang.String r0 = "connection/handleLocationNotifications/none of request nor enc node exists"
            goto L_0x0677
        L_0x031b:
            r6 = -1
            java.lang.String r0 = "id"
            long r0 = r5.A0D(r0, r6)
            java.lang.String r5 = "LocationNotificationHandler/on-location-disabled-notification; stanzaKey="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r9 = "; sequenceNumber="
            r4.append(r9)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.0yQ r6 = r3.A06
            com.whatsapp.jid.Jid r4 = r2.A01
            X.0rv r5 = X.C16030sJ.A00(r4)
            com.whatsapp.jid.UserJid r4 = r2.A00()
            if (r4 != 0) goto L_0x036e
            r4 = 0
        L_0x034b:
            java.lang.String r7 = "LocationSharingManager/onReceiveStopSharing; jid="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            r8.append(r5)
            java.lang.String r7 = "; participant="
            r8.append(r7)
            r8.append(r4)
            r8.append(r9)
            r8.append(r0)
            java.lang.String r7 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r7)
            java.lang.Object r9 = r6.A0R
            monitor-enter(r9)
            goto L_0x0373
        L_0x036e:
            com.whatsapp.jid.UserJid r4 = r2.A00()
            goto L_0x034b
        L_0x0373:
            java.util.Map r10 = r6.A09()     // Catch:{ all -> 0x06cd }
            java.lang.Object r11 = r10.get(r5)     // Catch:{ all -> 0x06cd }
            java.util.Map r11 = (java.util.Map) r11     // Catch:{ all -> 0x06cd }
            if (r11 == 0) goto L_0x03fa
            if (r4 != 0) goto L_0x0382
            goto L_0x0384
        L_0x0382:
            r13 = r4
            goto L_0x0388
        L_0x0384:
            com.whatsapp.jid.UserJid r13 = com.whatsapp.jid.UserJid.of(r5)     // Catch:{ all -> 0x06cd }
        L_0x0388:
            java.lang.Object r7 = r11.get(r13)     // Catch:{ all -> 0x06cd }
            X.28x r7 = (X.AnonymousClass28x) r7     // Catch:{ all -> 0x06cd }
            if (r7 == 0) goto L_0x03fa
            X.1Vw r7 = r7.A02     // Catch:{ all -> 0x06cd }
            X.1rV r7 = r6.A06(r7)     // Catch:{ all -> 0x06cd }
            android.util.Pair r12 = android.util.Pair.create(r5, r13)     // Catch:{ all -> 0x06cd }
            r15 = 0
            if (r7 == 0) goto L_0x03a9
            long r7 = r7.A01     // Catch:{ all -> 0x06cd }
            int r14 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x03a9
            int r7 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x03a9
            goto L_0x03f0
        L_0x03a9:
            java.util.Map r8 = r6.A0a     // Catch:{ all -> 0x06cd }
            java.lang.Object r14 = r8.get(r12)     // Catch:{ all -> 0x06cd }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x06cd }
            int r7 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x03c6
            if (r14 == 0) goto L_0x03bf
            long r14 = r14.longValue()     // Catch:{ all -> 0x06cd }
            int r7 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x03c6
        L_0x03bf:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06cd }
            r8.put(r12, r0)     // Catch:{ all -> 0x06cd }
        L_0x03c6:
            java.lang.Object r0 = r11.remove(r13)     // Catch:{ all -> 0x06cd }
            X.28x r0 = (X.AnonymousClass28x) r0     // Catch:{ all -> 0x06cd }
            r6.A0T(r0)     // Catch:{ all -> 0x06cd }
            X.1Rv r7 = r6.A0N     // Catch:{ all -> 0x06cd }
            r1 = 0
            if (r4 == 0) goto L_0x03e8
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x06cd }
            r7.A02(r5, r0, r1)     // Catch:{ all -> 0x06cd }
        L_0x03db:
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x06cd }
            if (r0 == 0) goto L_0x03e4
            r10.remove(r5)     // Catch:{ all -> 0x06cd }
        L_0x03e4:
            r6.A0Y(r10)     // Catch:{ all -> 0x06cd }
            goto L_0x03fa
        L_0x03e8:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x06cd }
            r7.A04(r0, r1)     // Catch:{ all -> 0x06cd }
            goto L_0x03db
        L_0x03f0:
            java.lang.String r0 = "LocationSharingManager/onReceiveStopSharing; received old sequence number; skip stopping"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06cd }
            java.util.Map r0 = r6.A0a     // Catch:{ all -> 0x06cd }
            r0.remove(r12)     // Catch:{ all -> 0x06cd }
        L_0x03fa:
            monitor-exit(r9)     // Catch:{ all -> 0x06cd }
            java.util.List r0 = r6.A0X
            java.util.Iterator r1 = r0.iterator()
        L_0x0401:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0411
            java.lang.Object r0 = r1.next()
            X.290 r0 = (X.AnonymousClass290) r0
            r0.AVo(r5, r4)
            goto L_0x0401
        L_0x0411:
            r6.A0L()
            android.os.Handler r4 = r6.A08
            r1 = 13
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r6, r1, r5)
            r4.post(r0)
            goto L_0x003f
        L_0x0422:
            int r7 = r5.A0A(r0, r9)
            X.1d1 r5 = X.C53622g0.A00(r5)
            java.lang.String r0 = "app/xmpp/recv/notification location key "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            r8.append(r6)
            r4 = 32
            r8.append(r4)
            r0 = r16
            r8.append(r0)
            r8.append(r4)
            long r0 = java.lang.System.currentTimeMillis()
            r8.append(r0)
            r8.append(r4)
            r8.append(r7)
            java.lang.String r0 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "LocationNotificationHandler/on-location-key-notification; stanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.Jid r0 = r2.A02
            com.whatsapp.jid.DeviceJid r10 = com.whatsapp.jid.DeviceJid.of(r0)
            int r4 = r5.A01
            r0 = 2
            if (r4 == r0) goto L_0x0486
            java.lang.String r1 = "LocationNotificationHandler/invalid ciphertext version; ciphertextVersion="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L_0x04ff
        L_0x0486:
            X.16P r0 = r3.A04
            r14 = 3
            com.facebook.redex.RunnableRunnableShape0S0401000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0401000_I0
            r8 = r1
            r9 = r3
            r11 = r2
            r12 = r5
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.execute(r1)
            goto L_0x003f
        L_0x049a:
            X.1Vv r7 = r5.A0J(r7)
            java.lang.String r4 = "deny"
            X.1Vv r0 = r5.A0J(r4)
            if (r7 == 0) goto L_0x05be
            int r7 = r7.A0A(r10, r9)
            X.1Vv r0 = r5.A0J(r13)
            if (r0 == 0) goto L_0x06d9
            byte[] r8 = r0.A01
            if (r8 == 0) goto L_0x06d3
            int r0 = r8.length
            if (r0 != r1) goto L_0x06d3
            java.lang.String r1 = "connection/handleLocationNotifications/location key retry/participant="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "LocationNotificationHandler/onLocationKeyRetryNotification; stanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.Jid r5 = r2.A01
            X.0rv r1 = X.C16030sJ.A00(r5)
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 != 0) goto L_0x05ba
            boolean r0 = X.C16030sJ.A0G(r1)
            if (r0 != 0) goto L_0x05ba
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r5)
            if (r5 != 0) goto L_0x0504
            java.lang.String r0 = "axolotl received location key retry notification for non-device jid"
        L_0x04ff:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x003f
        L_0x0504:
            int r9 = X.C28641Wx.A00(r8)
            java.lang.String r0 = "axolotl got location retry request "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " with "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            if (r7 <= r0) goto L_0x053b
            java.lang.String r1 = "axolotl skipping retry; reached max retry; jid="
        L_0x052e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            goto L_0x04ff
        L_0x053b:
            X.0yQ r8 = r3.A06
            com.whatsapp.jid.UserJid r6 = r5.getUserJid()
            java.lang.Object r1 = r8.A0S
            monitor-enter(r1)
            java.util.Set r0 = r8.A0B()     // Catch:{ all -> 0x06d0 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x06d0 }
            monitor-exit(r1)     // Catch:{ all -> 0x06d0 }
            if (r0 != 0) goto L_0x05ac
            java.lang.String r1 = "axolotl skipping retry; user should not get location key; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Rw r0 = r3.A07
            com.whatsapp.jid.UserJid r8 = r5.getUserJid()
            X.0ug r6 = r0.A01
            java.lang.String r5 = r6.A02()
            r0 = 3
            X.1lL[] r7 = new X.C35081lL[r0]
            java.lang.String r0 = "id"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r0, (java.lang.String) r5)
            r0 = 0
            r7[r0] = r1
            java.lang.String r0 = "to"
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r0)
            r0 = 1
            r7[r0] = r1
            java.lang.String r5 = "type"
            java.lang.String r0 = "location"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r5, (java.lang.String) r0)
            r0 = 2
            r7[r0] = r1
            r5 = 0
            X.1Vv r1 = new X.1Vv
            r1.<init>(r4, r5)
            java.lang.String r0 = "encrypt"
            X.1Vv r4 = new X.1Vv
            r4.<init>((X.C28371Vv) r1, (java.lang.String) r0, (X.C35081lL[]) r5)
            java.lang.String r0 = "notification"
            X.1Vv r1 = new X.1Vv
            r1.<init>((X.C28371Vv) r4, (java.lang.String) r0, (X.C35081lL[]) r7)
            r0 = 126(0x7e, float:1.77E-43)
            r6.A0D(r1, r0)
            goto L_0x003f
        L_0x05ac:
            com.whatsapp.jid.UserJid r0 = r5.getUserJid()
            boolean r0 = r8.A0d(r0, r7)
            if (r0 != 0) goto L_0x060a
            java.lang.String r1 = "axolotl skipping retry; retry too soon; jid="
            goto L_0x052e
        L_0x05ba:
            java.lang.String r0 = "axolotl received location key retry notification sent to a group or broadcast"
            goto L_0x04ff
        L_0x05be:
            if (r0 == 0) goto L_0x0675
            java.lang.String r1 = "LocationNotificationHandler/onLocationKeyDenyNotification; stanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.Jid r0 = r2.A01
            X.0rv r1 = X.C16030sJ.A00(r0)
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 != 0) goto L_0x0606
            boolean r0 = X.C16030sJ.A0G(r1)
            if (r0 != 0) goto L_0x0606
            X.0yQ r6 = r3.A06
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.of(r1)
            X.AnonymousClass00B.A06(r5)
            java.lang.String r1 = "LocationSharingManager/onReceiveDenySharing; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.lang.Object r8 = r6.A0R
            monitor-enter(r8)
            goto L_0x061e
        L_0x0606:
            java.lang.String r0 = "axolotl received location key deny notification sent to a group or broadcast"
            goto L_0x04ff
        L_0x060a:
            X.16P r0 = r3.A04
            r11 = 5
            com.facebook.redex.RunnableRunnableShape0S0202000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0202000_I0
            r8 = r9
            r9 = r5
            r10 = r7
            r6 = r1
            r7 = r3
            r6.<init>((java.lang.Object) r7, (int) r8, (java.lang.Object) r9, (int) r10, (int) r11)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.execute(r1)
            goto L_0x003f
        L_0x061e:
            java.util.Map r0 = r6.A09()     // Catch:{ all -> 0x06df }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x06df }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x06df }
        L_0x062a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x06df }
            if (r0 == 0) goto L_0x0660
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x06df }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x06df }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x06df }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x06df }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x06df }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x06df }
        L_0x0644:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06df }
            if (r0 == 0) goto L_0x062a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x06df }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x06df }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x06df }
            if (r0 == 0) goto L_0x0644
            java.lang.Object r0 = r4.getKey()     // Catch:{ all -> 0x06df }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x06df }
            r9.add(r0)     // Catch:{ all -> 0x06df }
            goto L_0x0644
        L_0x0660:
            monitor-exit(r8)     // Catch:{ all -> 0x06df }
            java.util.Iterator r1 = r9.iterator()
        L_0x0665:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r1.next()
            X.0rv r0 = (X.C15830rv) r0
            r6.A0P(r0, r5)
            goto L_0x0665
        L_0x0675:
            java.lang.String r0 = "connection/handleLocationNotifications/none of request nor deny node exists"
        L_0x0677:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x003f
        L_0x067c:
            java.lang.String r0 = "location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            r8 = 3
            goto L_0x002e
        L_0x0687:
            java.lang.String r0 = "disable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            r8 = 2
            goto L_0x002e
        L_0x0692:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x002e
            r8 = 1
            goto L_0x002e
        L_0x069b:
            java.lang.String r0 = "encrypt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            r8 = 0
            goto L_0x002e
        L_0x06a6:
            r0 = move-exception
            if (r13 == 0) goto L_0x06ac
            r13.close()     // Catch:{ all -> 0x06ac }
        L_0x06ac:
            throw r0     // Catch:{ all -> 0x06ad }
        L_0x06ad:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x06b1 }
        L_0x06b1:
            throw r0     // Catch:{ Exception -> 0x06b2 }
        L_0x06b2:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/isLocationReceiver/error checking location sharer"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x06be }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x06be }
            r0.<init>(r1)     // Catch:{ all -> 0x06be }
            throw r0     // Catch:{ all -> 0x06be }
        L_0x06be:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x06be }
            throw r0
        L_0x06c1:
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r11)
            throw r0
        L_0x06c7:
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r11)
            throw r0
        L_0x06cd:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x06cd }
            throw r0
        L_0x06d0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x06d0 }
            throw r0
        L_0x06d3:
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r11)
            throw r0
        L_0x06d9:
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r11)
            throw r0
        L_0x06df:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x06df }
            throw r0
        L_0x06e2:
            java.lang.String r1 = "invalid location notification"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28001Ty.A01(X.1Vv, int):void");
    }
}
