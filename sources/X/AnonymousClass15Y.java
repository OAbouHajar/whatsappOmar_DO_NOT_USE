package X;

/* renamed from: X.15Y  reason: invalid class name */
public class AnonymousClass15Y implements C19170xs {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C16080sP A02;
    public final C16440t3 A03;
    public final C16980tz A04;
    public final C19780yz A05;
    public final C16900tq A06;
    public final AnonymousClass175 A07;
    public final C18090w8 A08;
    public final C18290wS A09;
    public final AnonymousClass1Vo A0A = AnonymousClass1Vo.A00("PaymentStatusNotifier", "notification", "COMMON");
    public final C218315p A0B;
    public final AnonymousClass122 A0C;
    public final AnonymousClass01D A0D;

    public AnonymousClass15Y(C16040sK r4, C16000sG r5, C16080sP r6, C16440t3 r7, C16980tz r8, C19780yz r9, C16900tq r10, AnonymousClass175 r11, C18090w8 r12, C18290wS r13, C218315p r14, AnonymousClass122 r15, AnonymousClass01D r16) {
        this.A04 = r8;
        this.A03 = r7;
        this.A00 = r4;
        this.A0B = r14;
        this.A01 = r5;
        this.A02 = r6;
        this.A09 = r13;
        this.A05 = r9;
        this.A06 = r10;
        this.A07 = r11;
        this.A0C = r15;
        this.A08 = r12;
        this.A0D = r16;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:41|42|43|44|45) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:83|84|85|86|87) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00ce */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x019a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x019f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x01a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00() {
        /*
            r20 = this;
            r0 = r20
            monitor-enter(r0)
            X.01D r1 = r0.A0D     // Catch:{ all -> 0x0214 }
            java.lang.Object r5 = r1.get()     // Catch:{ all -> 0x0214 }
            X.0t6 r5 = (X.C16460t6) r5     // Catch:{ all -> 0x0214 }
            X.0wS r9 = r0.A09     // Catch:{ all -> 0x0214 }
            r9.A06()     // Catch:{ all -> 0x0214 }
            X.16r r7 = r9.A08     // Catch:{ all -> 0x0214 }
            monitor-enter(r7)     // Catch:{ all -> 0x0214 }
            X.0t3 r6 = r7.A02     // Catch:{ all -> 0x020e }
            long r18 = r6.A00()     // Catch:{ all -> 0x020e }
            java.util.List r1 = r7.A0R()     // Catch:{ all -> 0x020e }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x020e }
            r8.<init>()     // Catch:{ all -> 0x020e }
            X.0tq r12 = r7.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cf }
            X.0tf r10 = r12.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cf }
            X.1cj r17 = r10.A00()     // Catch:{ all -> 0x00ca }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ all -> 0x00c5 }
        L_0x0030:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00bb
            java.lang.Object r11 = r16.next()     // Catch:{ all -> 0x00c5 }
            X.1Vt r11 = (X.AnonymousClass1Vt) r11     // Catch:{ all -> 0x00c5 }
            X.1W2 r1 = r11.A0A     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0048
            long r2 = r1.A09()     // Catch:{ all -> 0x00c5 }
            int r1 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r1 >= 0) goto L_0x0030
        L_0x0048:
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x00c5 }
            r13.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = r11.A0L     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = r11.A0K     // Catch:{ all -> 0x00c5 }
            android.util.Pair r14 = X.C221116r.A06(r2, r1)     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = "status"
            r1 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00c5 }
            r13.put(r2, r1)     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "timestamp"
            r1 = 1000(0x3e8, double:4.94E-321)
            long r1 = r18 / r1
            int r3 = (int) r1     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00c5 }
            r13.put(r4, r1)     // Catch:{ all -> 0x00c5 }
            X.1Vo r3 = r7.A09     // Catch:{ all -> 0x00c5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r2.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "expireOldPendingRequests key id:"
            r2.append(r1)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = r11.A0L     // Catch:{ all -> 0x00c5 }
            r2.append(r1)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00c5 }
            r3.A06(r1)     // Catch:{ all -> 0x00c5 }
            r15 = 0
            boolean r1 = r7.A0i()     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0096
            int r1 = X.C221116r.A00(r13, r10, r11)     // Catch:{ all -> 0x00c5 }
            if (r1 <= 0) goto L_0x0096
            r15 = 1
        L_0x0096:
            r12.A04()     // Catch:{ all -> 0x00c5 }
            X.1jC r1 = r12.A04     // Catch:{ all -> 0x00c5 }
            boolean r1 = r1.A0D(r10)     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00b8
            X.0tg r4 = r10.A02     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "pay_transactions"
            java.lang.Object r2 = r14.first     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00c5 }
            java.lang.Object r1 = r14.second     // Catch:{ all -> 0x00c5 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x00c5 }
            int r1 = r4.A00(r3, r13, r2, r1)     // Catch:{ all -> 0x00c5 }
            if (r1 <= 0) goto L_0x00b8
        L_0x00b3:
            r8.add(r11)     // Catch:{ all -> 0x00c5 }
            goto L_0x0030
        L_0x00b8:
            if (r15 == 0) goto L_0x0030
            goto L_0x00b3
        L_0x00bb:
            r17.A00()     // Catch:{ all -> 0x00c5 }
            r17.close()     // Catch:{ all -> 0x00ca }
            r10.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cf }
            goto L_0x00d6
        L_0x00c5:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            throw r1     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cf }
        L_0x00cf:
            X.1Vo r2 = r7.A09     // Catch:{ all -> 0x020e }
            java.lang.String r1 = "expireOldPendingRequests failed."
            r2.A05(r1)     // Catch:{ all -> 0x020e }
        L_0x00d6:
            monitor-exit(r7)     // Catch:{ all -> 0x0214 }
            r9.A06()     // Catch:{ all -> 0x0214 }
            monitor-enter(r7)     // Catch:{ all -> 0x0214 }
            long r16 = r6.A00()     // Catch:{ all -> 0x020e }
            r6 = -1
            r2 = 1
            java.lang.Integer[] r4 = new java.lang.Integer[r2]     // Catch:{ all -> 0x020e }
            r1 = 20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x020e }
            r3 = 0
            r4[r3] = r1     // Catch:{ all -> 0x020e }
            java.lang.Integer[] r2 = new java.lang.Integer[r2]     // Catch:{ all -> 0x020e }
            r1 = 40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x020e }
            r2[r3] = r1     // Catch:{ all -> 0x020e }
            java.util.List r1 = r7.A0c(r4, r2, r6)     // Catch:{ all -> 0x020e }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x020e }
            r6.<init>()     // Catch:{ all -> 0x020e }
            X.0tq r12 = r7.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a0 }
            X.0tf r10 = r12.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a0 }
            X.1cj r15 = r10.A00()     // Catch:{ all -> 0x019b }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x0196 }
        L_0x010d:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x018c
            java.lang.Object r11 = r14.next()     // Catch:{ all -> 0x0196 }
            X.1Vt r11 = (X.AnonymousClass1Vt) r11     // Catch:{ all -> 0x0196 }
            X.1W2 r1 = r11.A0A     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x0125
            long r2 = r1.A09()     // Catch:{ all -> 0x0196 }
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x010d
        L_0x0125:
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0196 }
            r9.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = r11.A0L     // Catch:{ all -> 0x0196 }
            java.lang.String r1 = r11.A0K     // Catch:{ all -> 0x0196 }
            android.util.Pair r13 = X.C221116r.A06(r2, r1)     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "status"
            r1 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0196 }
            r9.put(r2, r1)     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = "timestamp"
            r1 = 1000(0x3e8, double:4.94E-321)
            long r1 = r16 / r1
            int r3 = (int) r1     // Catch:{ all -> 0x0196 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0196 }
            r9.put(r4, r1)     // Catch:{ all -> 0x0196 }
            X.1Vo r3 = r7.A09     // Catch:{ all -> 0x0196 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r2.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r1 = "expireOldPendingRequests key id:"
            r2.append(r1)     // Catch:{ all -> 0x0196 }
            java.lang.String r1 = r11.A0L     // Catch:{ all -> 0x0196 }
            r2.append(r1)     // Catch:{ all -> 0x0196 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0196 }
            r3.A06(r1)     // Catch:{ all -> 0x0196 }
            boolean r1 = r7.A0i()     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x016e
            X.C221116r.A00(r9, r10, r11)     // Catch:{ all -> 0x0196 }
        L_0x016e:
            r12.A04()     // Catch:{ all -> 0x0196 }
            X.1jC r1 = r12.A04     // Catch:{ all -> 0x0196 }
            boolean r1 = r1.A0D(r10)     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x0188
            X.0tg r4 = r10.A02     // Catch:{ all -> 0x0196 }
            java.lang.String r3 = "pay_transactions"
            java.lang.Object r2 = r13.first     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0196 }
            java.lang.Object r1 = r13.second     // Catch:{ all -> 0x0196 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0196 }
            r4.A00(r3, r9, r2, r1)     // Catch:{ all -> 0x0196 }
        L_0x0188:
            r6.add(r11)     // Catch:{ all -> 0x0196 }
            goto L_0x010d
        L_0x018c:
            r15.A00()     // Catch:{ all -> 0x0196 }
            r15.close()     // Catch:{ all -> 0x019b }
            r10.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a0 }
            goto L_0x01a7
        L_0x0196:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x019a }
        L_0x019a:
            throw r1     // Catch:{ all -> 0x019b }
        L_0x019b:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x019f }
        L_0x019f:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x01a0 }
        L_0x01a0:
            X.1Vo r2 = r7.A09     // Catch:{ all -> 0x020e }
            java.lang.String r1 = "expirePendingMandateRequests failed."
            r2.A05(r1)     // Catch:{ all -> 0x020e }
        L_0x01a7:
            monitor-exit(r7)     // Catch:{ all -> 0x0214 }
            r8.addAll(r6)     // Catch:{ all -> 0x0214 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0214 }
        L_0x01af:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x0214 }
            if (r1 == 0) goto L_0x020c
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x0214 }
            X.1Vt r7 = (X.AnonymousClass1Vt) r7     // Catch:{ all -> 0x0214 }
            X.122 r6 = r0.A0C     // Catch:{ all -> 0x0214 }
            X.0rv r4 = r7.A0C     // Catch:{ all -> 0x0214 }
            X.0t3 r1 = r0.A03     // Catch:{ all -> 0x0214 }
            long r2 = r1.A00()     // Catch:{ all -> 0x0214 }
            r1 = 44
            X.1sL r6 = r6.A08(r4, r1, r2)     // Catch:{ all -> 0x0214 }
            com.whatsapp.jid.UserJid r1 = r7.A0D     // Catch:{ all -> 0x0214 }
            r6.A01 = r1     // Catch:{ all -> 0x0214 }
            com.whatsapp.jid.UserJid r1 = r7.A0E     // Catch:{ all -> 0x0214 }
            r6.A00 = r1     // Catch:{ all -> 0x0214 }
            java.lang.String r2 = r7.A0I     // Catch:{ all -> 0x0214 }
            X.1Vy r1 = r7.A08     // Catch:{ all -> 0x0214 }
            java.lang.String r1 = X.C218315p.A08(r1, r2)     // Catch:{ all -> 0x0214 }
            r6.A03 = r1     // Catch:{ all -> 0x0214 }
            X.0rv r4 = r7.A0C     // Catch:{ all -> 0x0214 }
            boolean r3 = r7.A0Q     // Catch:{ all -> 0x0214 }
            java.lang.String r2 = r7.A0L     // Catch:{ all -> 0x0214 }
            X.1Vw r1 = new X.1Vw     // Catch:{ all -> 0x0214 }
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0214 }
            r6.A02 = r1     // Catch:{ all -> 0x0214 }
            X.1Vw r1 = r6.A11     // Catch:{ all -> 0x0214 }
            X.0rv r1 = r1.A00     // Catch:{ all -> 0x0214 }
            if (r1 == 0) goto L_0x01af
            r3 = 16
            r5.A0w(r6, r3)     // Catch:{ all -> 0x0214 }
            monitor-enter(r5)     // Catch:{ all -> 0x0214 }
            X.0tZ r2 = r5.A0H(r7)     // Catch:{ all -> 0x0211 }
            if (r2 == 0) goto L_0x020a
            r7.A02 = r3     // Catch:{ all -> 0x0211 }
            r2.A0L = r7     // Catch:{ all -> 0x0211 }
            X.17E r1 = r5.A0e     // Catch:{ all -> 0x0211 }
            r1.A00(r2, r3)     // Catch:{ all -> 0x0211 }
            X.17F r1 = r5.A0a     // Catch:{ all -> 0x0211 }
            r1.A0O(r2)     // Catch:{ all -> 0x0211 }
        L_0x020a:
            monitor-exit(r5)     // Catch:{ all -> 0x0214 }
            goto L_0x01af
        L_0x020c:
            monitor-exit(r0)
            return
        L_0x020e:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0214 }
            goto L_0x0213
        L_0x0211:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0214 }
        L_0x0213:
            throw r1     // Catch:{ all -> 0x0214 }
        L_0x0214:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15Y.A00():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x01c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x01c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x0282 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x0287 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x015e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0163 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:120:0x01c9=Splitter:B:120:0x01c9, B:109:0x01ba=Splitter:B:109:0x01ba} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:44:0x00b8=Splitter:B:44:0x00b8, B:33:0x00a9=Splitter:B:33:0x00a9} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:79:0x0153=Splitter:B:79:0x0153, B:90:0x0163=Splitter:B:90:0x0163} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AS4() {
        /*
            r17 = this;
            r4 = r17
            X.0sK r0 = r4.A00
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0294
            X.0w8 r1 = r4.A08
            r0 = 0
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0294
            X.0tq r0 = r4.A06
            r0.A04()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0294
            X.0wS r3 = r4.A09
            X.19r r0 = r3.A03()
            X.19a r1 = r0.AB3()
            if (r1 == 0) goto L_0x0030
            r0 = 0
            boolean r0 = r1.Af9(r0)
            if (r0 == 0) goto L_0x00da
        L_0x0030:
            X.175 r0 = r4.A07
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x00da
            X.19r r0 = r3.A03()
            X.1yH r6 = r0.AEu()
            if (r6 == 0) goto L_0x00da
            X.01D r0 = r4.A0D
            java.lang.Object r5 = r0.get()
            X.0t6 r5 = (X.C16460t6) r5
            r3.A06()
            X.16r r2 = r3.A08
            monitor-enter(r2)
            java.lang.String r10 = "status=? AND metadata LIKE '%expiryTs%'"
            r0 = 1
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x00c7 }
            r1 = 0
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00c7 }
            r11[r1] = r0     // Catch:{ all -> 0x00c7 }
            java.lang.String r13 = "timestamp ASC"
            r2.A0i()     // Catch:{ all -> 0x00c7 }
            X.0tq r0 = r2.A04     // Catch:{ IllegalStateException -> 0x00b9 }
            X.0tf r1 = r0.get()     // Catch:{ IllegalStateException -> 0x00b9 }
            X.0tg r7 = r1.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r8 = r2.A0P()     // Catch:{ all -> 0x00b4 }
            boolean r0 = r2.A0i()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0081
            java.lang.String[] r9 = X.C221116r.A0B     // Catch:{ all -> 0x00b4 }
        L_0x0079:
            r12 = 0
            java.lang.String r14 = "100"
            android.database.Cursor r10 = r7.A09(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00b4 }
            goto L_0x0084
        L_0x0081:
            java.lang.String[] r9 = X.C221116r.A0A     // Catch:{ all -> 0x00b4 }
            goto L_0x0079
        L_0x0084:
            java.lang.String r0 = "readUnacceptedTransactions"
            java.util.List r9 = r2.A0U(r10, r0)     // Catch:{ all -> 0x00ad }
            X.1Vo r8 = r2.A09     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r7.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "readUnacceptedTransactions returned: "
            r7.append(r0)     // Catch:{ all -> 0x00ad }
            int r0 = r9.size()     // Catch:{ all -> 0x00ad }
            r7.append(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ad }
            r8.A06(r0)     // Catch:{ all -> 0x00ad }
            if (r10 == 0) goto L_0x00a9
            r10.close()     // Catch:{ all -> 0x00b4 }
        L_0x00a9:
            r1.close()     // Catch:{ IllegalStateException -> 0x00b9 }
            goto L_0x00ca
        L_0x00ad:
            r0 = move-exception
            if (r10 == 0) goto L_0x00b3
            r10.close()     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            throw r0     // Catch:{ IllegalStateException -> 0x00b9 }
        L_0x00b9:
            r7 = move-exception
            X.1Vo r1 = r2.A09     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "readUnacceptedTransactions/IllegalStateException "
            r1.A0A(r0, r7)     // Catch:{ all -> 0x00c7 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00c7 }
            r9.<init>()     // Catch:{ all -> 0x00c7 }
            goto L_0x00ca
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00ca:
            monitor-exit(r2)
            int r0 = r9.size()
            if (r0 != 0) goto L_0x00e4
            X.1Vo r2 = r4.A0A
            java.lang.String r1 = "sendAcceptPaymentReminderNotificationsIfNeeded skipped. No pending transaction with expiry timestamp."
            r0 = 0
            r2.A03(r0, r1)
        L_0x00da:
            r4.A00()
            r3.A06()
            X.16r r0 = r3.A08
            monitor-enter(r0)
            goto L_0x00fe
        L_0x00e4:
            java.util.List r0 = r6.A5l(r9)
            java.util.Iterator r2 = r0.iterator()
        L_0x00ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r1 = r2.next()
            X.0tZ r1 = (X.C16740tZ) r1
            r0 = 16
            r5.A0w(r1, r0)
            goto L_0x00ec
        L_0x00fe:
            X.0t3 r1 = r0.A02     // Catch:{ all -> 0x0290 }
            long r15 = r1.A00()     // Catch:{ all -> 0x0290 }
            boolean r1 = r0.A0i()     // Catch:{ all -> 0x028e }
            if (r1 == 0) goto L_0x0174
            android.util.Pair r1 = r0.A0C()     // Catch:{ all -> 0x0172 }
            java.lang.Object r6 = r1.first     // Catch:{ all -> 0x0172 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0172 }
            java.lang.Object r7 = r1.second     // Catch:{ all -> 0x0172 }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x0172 }
            java.lang.String r9 = "init_timestamp DESC"
            java.lang.String r10 = ""
            r0.A0i()     // Catch:{ all -> 0x0172 }
            X.0tq r1 = r0.A04     // Catch:{ IllegalStateException -> 0x0164 }
            X.0tf r2 = r1.get()     // Catch:{ IllegalStateException -> 0x0164 }
            X.0tg r3 = r2.A02     // Catch:{ all -> 0x015f }
            java.lang.String r4 = "pay_transaction"
            java.lang.String[] r5 = X.C221116r.A0B     // Catch:{ all -> 0x015f }
            r8 = 0
            android.database.Cursor r4 = r3.A09(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x015f }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2"
            java.util.List r7 = r0.A0U(r4, r1)     // Catch:{ all -> 0x0158 }
            X.1Vo r5 = r0.A09     // Catch:{ all -> 0x0158 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0158 }
            r3.<init>()     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2 returned: "
            r3.append(r1)     // Catch:{ all -> 0x0158 }
            int r1 = r7.size()     // Catch:{ all -> 0x0158 }
            r3.append(r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0158 }
            r5.A03(r8, r1)     // Catch:{ all -> 0x0158 }
            if (r4 == 0) goto L_0x0153
            r4.close()     // Catch:{ all -> 0x015f }
        L_0x0153:
            r2.close()     // Catch:{ IllegalStateException -> 0x0164 }
            goto L_0x01d7
        L_0x0158:
            r1 = move-exception
            if (r4 == 0) goto L_0x015e
            r4.close()     // Catch:{ all -> 0x015e }
        L_0x015e:
            throw r1     // Catch:{ all -> 0x015f }
        L_0x015f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0163 }
        L_0x0163:
            throw r1     // Catch:{ IllegalStateException -> 0x0164 }
        L_0x0164:
            r2 = move-exception
            X.1Vo r5 = r0.A09     // Catch:{ all -> 0x0172 }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2/IllegalStateException "
            r5.A0A(r1, r2)     // Catch:{ all -> 0x0172 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0172 }
            r7.<init>()     // Catch:{ all -> 0x0172 }
            goto L_0x01d7
        L_0x0172:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x028e }
        L_0x0174:
            android.util.Pair r1 = r0.A0C()     // Catch:{ all -> 0x028e }
            java.lang.Object r6 = r1.first     // Catch:{ all -> 0x028e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x028e }
            java.lang.Object r7 = r1.second     // Catch:{ all -> 0x028e }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x028e }
            java.lang.String r9 = "init_timestamp DESC"
            java.lang.String r10 = ""
            X.0tq r1 = r0.A04     // Catch:{ IllegalStateException -> 0x01ca }
            X.0tf r2 = r1.get()     // Catch:{ IllegalStateException -> 0x01ca }
            X.0tg r3 = r2.A02     // Catch:{ all -> 0x01c5 }
            java.lang.String r4 = "pay_transactions"
            java.lang.String[] r5 = X.C221116r.A0A     // Catch:{ all -> 0x01c5 }
            r8 = 0
            android.database.Cursor r4 = r3.A09(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01c5 }
            java.lang.String r1 = "readPendingAndActiveWithdrawals"
            java.util.List r7 = r0.A0U(r4, r1)     // Catch:{ all -> 0x01be }
            X.1Vo r5 = r0.A09     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r3.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r1 = "readPendingAndActiveWithdrawals returned: "
            r3.append(r1)     // Catch:{ all -> 0x01be }
            int r1 = r7.size()     // Catch:{ all -> 0x01be }
            r3.append(r1)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01be }
            r5.A03(r8, r1)     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x01ba
            r4.close()     // Catch:{ all -> 0x01c5 }
        L_0x01ba:
            r2.close()     // Catch:{ IllegalStateException -> 0x01ca }
            goto L_0x01d7
        L_0x01be:
            r1 = move-exception
            if (r4 == 0) goto L_0x01c4
            r4.close()     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            throw r1     // Catch:{ all -> 0x01c5 }
        L_0x01c5:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01c9 }
        L_0x01c9:
            throw r1     // Catch:{ IllegalStateException -> 0x01ca }
        L_0x01ca:
            r2 = move-exception
            X.1Vo r5 = r0.A09     // Catch:{ all -> 0x028e }
            java.lang.String r1 = "PaymentTransactionStore/readPendingAndActiveWithdrawals/IllegalStateException "
            r5.A0A(r1, r2)     // Catch:{ all -> 0x028e }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x028e }
            r7.<init>()     // Catch:{ all -> 0x028e }
        L_0x01d7:
            X.0tq r8 = r0.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0288 }
            X.0tf r6 = r8.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0288 }
            X.1cj r14 = r6.A00()     // Catch:{ all -> 0x0283 }
            java.util.Iterator r13 = r7.iterator()     // Catch:{ all -> 0x027e }
        L_0x01e5:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x027e }
            if (r1 == 0) goto L_0x0274
            java.lang.Object r3 = r13.next()     // Catch:{ all -> 0x027e }
            X.1Vt r3 = (X.AnonymousClass1Vt) r3     // Catch:{ all -> 0x027e }
            X.1W2 r1 = r3.A0A     // Catch:{ all -> 0x027e }
            if (r1 == 0) goto L_0x0203
            long r11 = r1.A09()     // Catch:{ all -> 0x027e }
            r9 = 0
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x01e5
            int r1 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x01e5
        L_0x0203:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x027e }
            r7.<init>()     // Catch:{ all -> 0x027e }
            java.lang.String r2 = r3.A0L     // Catch:{ all -> 0x027e }
            java.lang.String r1 = r3.A0K     // Catch:{ all -> 0x027e }
            android.util.Pair r9 = X.C221116r.A06(r2, r1)     // Catch:{ all -> 0x027e }
            java.lang.String r2 = "status"
            r1 = 607(0x25f, float:8.5E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x027e }
            r7.put(r2, r1)     // Catch:{ all -> 0x027e }
            java.lang.String r10 = "timestamp"
            r1 = 1000(0x3e8, double:4.94E-321)
            long r1 = r15 / r1
            int r4 = (int) r1     // Catch:{ all -> 0x027e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x027e }
            r7.put(r10, r1)     // Catch:{ all -> 0x027e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x027e }
            r2.<init>()     // Catch:{ all -> 0x027e }
            java.lang.String r1 = "expireOldWithdrawals key id:"
            r2.append(r1)     // Catch:{ all -> 0x027e }
            java.lang.String r1 = r3.A0K     // Catch:{ all -> 0x027e }
            r2.append(r1)     // Catch:{ all -> 0x027e }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x027e }
            r5.A06(r1)     // Catch:{ all -> 0x027e }
            boolean r1 = r0.A0i()     // Catch:{ all -> 0x027e }
            if (r1 == 0) goto L_0x0258
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ all -> 0x027e }
            java.lang.String r2 = r3.A0K     // Catch:{ all -> 0x027e }
            r1 = 0
            r4[r1] = r2     // Catch:{ all -> 0x027e }
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x027e }
            java.lang.String r2 = "pay_transaction"
            java.lang.String r1 = "id=?"
            r3.A00(r2, r7, r1, r4)     // Catch:{ all -> 0x027e }
        L_0x0258:
            r8.A04()     // Catch:{ all -> 0x027e }
            X.1jC r1 = r8.A04     // Catch:{ all -> 0x027e }
            boolean r1 = r1.A0D(r6)     // Catch:{ all -> 0x027e }
            if (r1 == 0) goto L_0x01e5
            X.0tg r4 = r6.A02     // Catch:{ all -> 0x027e }
            java.lang.String r3 = "pay_transactions"
            java.lang.Object r2 = r9.first     // Catch:{ all -> 0x027e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x027e }
            java.lang.Object r1 = r9.second     // Catch:{ all -> 0x027e }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x027e }
            r4.A00(r3, r7, r2, r1)     // Catch:{ all -> 0x027e }
            goto L_0x01e5
        L_0x0274:
            r14.A00()     // Catch:{ all -> 0x027e }
            r14.close()     // Catch:{ all -> 0x0283 }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0288 }
            goto L_0x0293
        L_0x027e:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0282 }
        L_0x0282:
            throw r1     // Catch:{ all -> 0x0283 }
        L_0x0283:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0287 }
        L_0x0287:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0288 }
        L_0x0288:
            java.lang.String r1 = "expireOldWithdrawals failed."
            r5.A05(r1)     // Catch:{ all -> 0x0290 }
            goto L_0x0293
        L_0x028e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0290 }
        L_0x0290:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0293:
            monitor-exit(r0)
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15Y.AS4():void");
    }
}
