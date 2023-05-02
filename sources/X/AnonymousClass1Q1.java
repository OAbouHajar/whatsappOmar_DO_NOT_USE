package X;

/* renamed from: X.1Q1  reason: invalid class name */
public class AnonymousClass1Q1 {
    public final C16300so A00;
    public final C16040sK A01;
    public final C16460t6 A02;
    public final C216314v A03;
    public final C16900tq A04;
    public final AnonymousClass1Q0 A05;
    public final C26971Py A06;

    public AnonymousClass1Q1(C16300so r1, C16040sK r2, C16460t6 r3, C216314v r4, C16900tq r5, AnonymousClass1Q0 r6, C26971Py r7) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r7 = r12.A11;
        r1 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r7 = r12.A11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C16740tZ r11, X.C39101rv r12, X.C39101rv r13) {
        /*
            r10 = this;
            X.23T r5 = r11.A0W
            if (r5 != 0) goto L_0x002f
            r3 = 1
            int r0 = r11.A07
            r0 = r0 & 1
            if (r0 == r3) goto L_0x0026
            X.0sK r2 = r10.A01
            java.util.List r0 = java.util.Collections.singletonList(r13)
            X.23T r1 = new X.23T
            r1.<init>(r2, r0)
            X.23T r0 = r11.A0W
            if (r0 != 0) goto L_0x0027
            r11.A0W = r1
            int r0 = r11.A07
            r3 = r3 | r0
            r11.A07 = r3
            X.0t6 r0 = r10.A02
            r0.A0Z(r11)
        L_0x0026:
            return
        L_0x0027:
            java.lang.String r1 = "FMessage/setMessageReactions re-assigning messageReactions"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002f:
            if (r12 == 0) goto L_0x00d2
            monitor-enter(r5)
            X.1Vw r0 = r13.A11     // Catch:{ all -> 0x00cf }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x0052
            X.1Vw r7 = r12.A11     // Catch:{ all -> 0x00cf }
            boolean r1 = r7.A02     // Catch:{ all -> 0x00cf }
            if (r1 != 0) goto L_0x004c
            com.whatsapp.jid.UserJid r2 = r13.A0C()     // Catch:{ all -> 0x00cf }
            com.whatsapp.jid.UserJid r0 = r12.A0C()     // Catch:{ all -> 0x00cf }
            boolean r0 = X.C34901l3.A00(r2, r0)     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x0058
        L_0x004c:
            java.lang.String r0 = "Wrong message add on passed into MessageReactionsImpl"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x00cf }
            goto L_0x00cb
        L_0x0052:
            X.1Vw r7 = r12.A11     // Catch:{ all -> 0x00cf }
            boolean r1 = r7.A02     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x004c
        L_0x0058:
            X.0sK r0 = r5.A00     // Catch:{ all -> 0x00cd }
            r0.A0B()     // Catch:{ all -> 0x00cd }
            X.1ZT r8 = r0.A05     // Catch:{ all -> 0x00cd }
            if (r8 != 0) goto L_0x0067
            java.lang.String r0 = "myUserJid is null. User logged out?"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x00cd }
            goto L_0x00c8
        L_0x0067:
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = X.AnonymousClass23T.A00(r0)     // Catch:{ all -> 0x00cd }
            java.util.Map r4 = r5.A01     // Catch:{ all -> 0x00cd }
            java.lang.Object r3 = r4.get(r6)     // Catch:{ all -> 0x00cd }
            X.23U r3 = (X.AnonymousClass23U) r3     // Catch:{ all -> 0x00cd }
            if (r3 == 0) goto L_0x00c8
            java.util.TreeSet r2 = r5.A03     // Catch:{ all -> 0x00cd }
            r2.remove(r3)     // Catch:{ all -> 0x00cd }
            if (r1 != 0) goto L_0x0085
            com.whatsapp.jid.UserJid r8 = r12.A0C()     // Catch:{ all -> 0x00cd }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x00cd }
        L_0x0085:
            long r0 = r12.A00     // Catch:{ all -> 0x00cd }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cd }
            android.util.Pair r9 = new android.util.Pair     // Catch:{ all -> 0x00cd }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x00cd }
            java.util.HashMap r0 = r3.A03     // Catch:{ all -> 0x00cd }
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x00ae
            r0.remove(r9)     // Catch:{ all -> 0x00cd }
            java.util.TreeSet r0 = r3.A04     // Catch:{ all -> 0x00cd }
            r0.remove(r1)     // Catch:{ all -> 0x00cd }
            X.0sK r0 = r3.A01     // Catch:{ all -> 0x00cd }
            boolean r0 = r0.A0I(r8)     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x00ae
            int r0 = r3.A00     // Catch:{ all -> 0x00cd }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x00cd }
        L_0x00ae:
            java.util.TreeSet r0 = r3.A04     // Catch:{ all -> 0x00cd }
            int r0 = r0.size()     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x00c4
            r2.remove(r3)     // Catch:{ all -> 0x00cd }
            r4.remove(r6)     // Catch:{ all -> 0x00cd }
        L_0x00bc:
            java.util.Map r1 = r5.A02     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x00cd }
            r1.remove(r0)     // Catch:{ all -> 0x00cd }
            goto L_0x00c8
        L_0x00c4:
            r2.add(r3)     // Catch:{ all -> 0x00cd }
            goto L_0x00bc
        L_0x00c8:
            r5.A04(r13)     // Catch:{ all -> 0x00cf }
        L_0x00cb:
            monitor-exit(r5)
            goto L_0x00d5
        L_0x00cd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00d2:
            r5.A04(r13)
        L_0x00d5:
            X.0t6 r0 = r10.A02
            X.17H r0 = r0.A0n
            r0.A02(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q1.A00(X.0tZ, X.1rv, X.1rv):void");
    }
}
