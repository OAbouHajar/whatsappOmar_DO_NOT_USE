package X;

/* renamed from: X.2Jj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C47532Jj implements AnonymousClass1WE {
    public final /* synthetic */ C43241zg A00;
    public final /* synthetic */ AnonymousClass1HE A01;
    public final /* synthetic */ AnonymousClass1XP A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C47532Jj(C43241zg r1, AnonymousClass1HE r2, AnonymousClass1XP r3, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = z2;
        this.A04 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0357, code lost:
        if (r9 != 1) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x035b, code lost:
        r28 = "cancelled";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f0, code lost:
        r10.A07(r0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r36) {
        /*
            r35 = this;
            r15 = r36
            r1 = r35
            X.1HE r4 = r1.A01
            X.1zg r3 = r1.A00
            X.1XP r2 = r1.A02
            boolean r0 = r1.A03
            r20 = r0
            boolean r0 = r1.A04
            r19 = r0
            java.lang.Integer r15 = (java.lang.Integer) r15
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.A01
            r18 = r0
            r18.size()
            X.1zh r0 = r2.A0K
            r34 = r0
            X.AnonymousClass00B.A06(r34)
            int r7 = r34.A00()
            X.1XS r0 = r2.A0H
            java.lang.Object r1 = r0.A00()
            X.21B r1 = (X.AnonymousClass21B) r1
            if (r1 == 0) goto L_0x003b
            X.1Sv r6 = r4.A0E
            r5 = 1
            com.facebook.redex.IDxMModifierShape234S0100000_2_I0 r0 = new com.facebook.redex.IDxMModifierShape234S0100000_2_I0
            r0.<init>(r6, r5)
            X.C27711Sv.A00(r3, r0, r1)
        L_0x003b:
            X.1XS r0 = r2.A0E
            java.lang.Object r5 = r0.A00()
            X.21B r5 = (X.AnonymousClass21B) r5
            if (r5 == 0) goto L_0x004f
            X.1Sv r6 = r4.A0E
            X.3G0 r0 = new X.3G0
            r0.<init>(r6)
            X.C27711Sv.A00(r3, r0, r5)
        L_0x004f:
            X.1XS r0 = r2.A04
            java.lang.Object r9 = r0.A00()
            if (r9 == 0) goto L_0x0062
            X.1Sv r8 = r4.A0E
            r6 = 0
            com.facebook.redex.IDxMModifierShape234S0100000_2_I0 r0 = new com.facebook.redex.IDxMModifierShape234S0100000_2_I0
            r0.<init>(r8, r6)
            X.C27711Sv.A00(r3, r0, r9)
        L_0x0062:
            X.1Sv r6 = r4.A0E
            int r9 = r15.intValue()
            r8 = 2
            com.facebook.redex.IDxMModifierShape234S0100000_2_I0 r0 = new com.facebook.redex.IDxMModifierShape234S0100000_2_I0
            r0.<init>(r6, r8)
            X.C27711Sv.A00(r3, r0, r15)
            java.util.Iterator r6 = r18.iterator()
        L_0x0075:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0368
            java.lang.Object r0 = r6.next()
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x0075
            r25 = 1
        L_0x008d:
            X.1Sw r6 = r4.A0K
            X.1XL r0 = r2.A0L
            X.1XJ r13 = r0.A02
            boolean r10 = r13.A02
            if (r7 == 0) goto L_0x0188
            if (r7 == r8) goto L_0x0188
            r0 = 4
            if (r7 == r0) goto L_0x0188
            if (r1 != 0) goto L_0x0139
            java.lang.String r0 = "mediauploadresponseprocessor/processUploadResponse/not regular upload, but upload response is null: uploadType="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = "; result="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00b7:
            r0 = 0
            r4.A02(r3, r0)
            boolean r0 = r13.A01
            if (r0 == 0) goto L_0x0134
            r9 = 4
        L_0x00c0:
            X.0t9 r8 = r4.A0C
            X.0wL r7 = r4.A0D
            int r0 = r2.A00
            X.21I r0 = r7.A02(r2, r0, r9)
            r8.A06(r0)
            X.21A r0 = r2.A01
            if (r0 == 0) goto L_0x00f0
            if (r5 == 0) goto L_0x00f0
            X.1f1 r6 = r0.A00
            X.1zh r1 = r0.A01
            int r0 = r5.A00
            int r22 = r1.A00()
            r19 = r5
            r20 = r0
            r21 = r9
            r16 = r7
            r17 = r6
            r18 = r1
            X.21I r0 = r16.A01(r17, r18, r19, r20, r21, r22)
            r8.A06(r0)
        L_0x00f0:
            X.0tY r1 = r3.A00()
            X.0w2 r0 = r4.A0A
            int r22 = X.C18020w1.A02(r0, r1)
            X.AnonymousClass00B.A06(r34)
            r0 = r34
            X.21E r1 = r0.A05
            if (r1 == 0) goto L_0x0131
            java.lang.Long r0 = r1.A08
            if (r0 == 0) goto L_0x0131
            long r23 = r0.longValue()
            X.21K r0 = r1.A01
            if (r0 == 0) goto L_0x0119
            java.lang.Long r0 = r0.A02
            if (r0 == 0) goto L_0x0119
            long r0 = r0.longValue()
            long r23 = r23 - r0
        L_0x0119:
            X.0sq r1 = r4.A0O
            X.3Hz r0 = new X.3Hz
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r2
            r21 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r25)
            r1.Acl(r0)
            r2.A02()
            return
        L_0x0131:
            r23 = 0
            goto L_0x0119
        L_0x0134:
            r9 = 2
            if (r25 == 0) goto L_0x00c0
            r9 = 3
            goto L_0x00c0
        L_0x0139:
            r0 = 3
            if (r7 != r0) goto L_0x00b7
            X.0tY r10 = r3.A00()
            X.1f0 r8 = r1.A01
            X.3ud r8 = (X.C76753ud) r8
            X.13B r0 = r6.A06
            r16 = r0
            if (r9 == 0) goto L_0x0185
            r0 = 7
            r23 = 2
            if (r9 == r0) goto L_0x0151
            r23 = 0
        L_0x0151:
            com.whatsapp.jid.Jid r14 = r8.A01
            X.1Vw r0 = r10.A11
            java.lang.String r12 = r0.A01
            X.0rv r11 = r8.A00
            boolean r7 = r8.A03
            com.whatsapp.jid.UserJid r0 = r8.A02
            X.1ez r1 = r1.A02
            java.lang.String r22 = r1.A03()
            r19 = r0
            r20 = r10
            r21 = r12
            r24 = r7
            r17 = r11
            r18 = r14
            r16.A01(r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x017b
            X.1Cb r0 = r6.A03
            r0.A00()
        L_0x017b:
            if (r9 != 0) goto L_0x00b7
            X.0t6 r1 = r6.A04
            r0 = -1
            r1.A0e(r10, r0)
            goto L_0x00b7
        L_0x0185:
            r23 = 1
            goto L_0x0151
        L_0x0188:
            r14 = 0
            r7 = 0
            if (r9 != 0) goto L_0x018d
            r7 = 2
        L_0x018d:
            X.0sK r11 = r6.A02
            java.util.Iterator r16 = r18.iterator()
        L_0x0193:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01af
            java.lang.Object r0 = r16.next()
            X.0tZ r0 = (X.C16740tZ) r0
            boolean r12 = X.C30921dB.A01(r11, r0)
            if (r12 != 0) goto L_0x0193
            if (r7 != 0) goto L_0x01ab
            r0.A0R()
            goto L_0x0193
        L_0x01ab:
            r0.A0W(r7)
            goto L_0x0193
        L_0x01af:
            r0 = 21
            r11 = 1
            if (r9 == r0) goto L_0x01f4
            switch(r9) {
                case 2: goto L_0x01da;
                case 3: goto L_0x01b9;
                case 4: goto L_0x01d4;
                case 5: goto L_0x01e0;
                case 6: goto L_0x01ce;
                case 7: goto L_0x01bf;
                default: goto L_0x01b7;
            }
        L_0x01b7:
            monitor-enter(r3)
            goto L_0x01ff
        L_0x01b9:
            X.0pt r10 = r6.A01
            r0 = 2131891709(0x7f1215fd, float:1.9418146E38)
            goto L_0x01fb
        L_0x01bf:
            X.0pt r10 = r6.A01
            boolean r12 = X.C14730pf.A00()
            r0 = 2131888431(0x7f12092f, float:1.9411497E38)
            if (r12 == 0) goto L_0x01f0
            r0 = 2131888430(0x7f12092e, float:1.9411495E38)
            goto L_0x01f0
        L_0x01ce:
            X.0pt r10 = r6.A01
            r0 = 2131889636(0x7f120de4, float:1.9413941E38)
            goto L_0x01f0
        L_0x01d4:
            X.0pt r10 = r6.A01
            r0 = 2131888213(0x7f120855, float:1.9411055E38)
            goto L_0x01f0
        L_0x01da:
            X.0pt r10 = r6.A01
            r0 = 2131888210(0x7f120852, float:1.9411049E38)
            goto L_0x01f0
        L_0x01e0:
            X.0tY r0 = r3.A00()
            byte r12 = r0.A10
            X.0pt r10 = r6.A01
            r0 = 2131888186(0x7f12083a, float:1.9411E38)
            if (r12 != r11) goto L_0x01f0
            r0 = 2131888192(0x7f120840, float:1.9411012E38)
        L_0x01f0:
            r10.A07(r0, r14)
            goto L_0x01b7
        L_0x01f4:
            if (r10 == 0) goto L_0x01b7
            X.0pt r10 = r6.A01
            r0 = 2131891710(0x7f1215fe, float:1.9418148E38)
        L_0x01fb:
            r10.A09(r0, r14)
            goto L_0x01b7
        L_0x01ff:
            java.util.Iterator r12 = r18.iterator()     // Catch:{ all -> 0x036c }
        L_0x0203:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x036c }
            if (r0 == 0) goto L_0x021a
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x036c }
            X.0tY r10 = (X.C16730tY) r10     // Catch:{ all -> 0x036c }
            X.1Vw r0 = r10.A11     // Catch:{ all -> 0x036c }
            X.0rv r0 = r0.A00     // Catch:{ all -> 0x036c }
            boolean r0 = X.C16030sJ.A0Q(r0)     // Catch:{ all -> 0x036c }
            if (r0 == 0) goto L_0x0203
            goto L_0x021b
        L_0x021a:
            r10 = 0
        L_0x021b:
            monitor-exit(r3)
            r16 = 0
            if (r10 == 0) goto L_0x0253
            r0 = 0
            if (r1 == 0) goto L_0x0229
            X.1f0 r0 = r1.A01
            X.21E r0 = r0.A04
            java.lang.Long r0 = r0.A0E
        L_0x0229:
            X.1L1 r14 = r6.A08
            X.0w2 r1 = r6.A05
            int r29 = X.C18020w1.A02(r1, r10)
            if (r0 == 0) goto L_0x0364
            long r30 = r0.longValue()
        L_0x0237:
            X.0pd r12 = r14.A08
            r1 = 2065(0x811, float:2.894E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r12.A0E(r0, r1)
            if (r0 == 0) goto L_0x0355
            switch(r9) {
                case 0: goto L_0x035f;
                case 1: goto L_0x035b;
                case 2: goto L_0x0351;
                case 3: goto L_0x034d;
                case 4: goto L_0x0349;
                case 5: goto L_0x0345;
                case 6: goto L_0x0341;
                case 7: goto L_0x033d;
                case 8: goto L_0x0339;
                case 9: goto L_0x0335;
                case 10: goto L_0x0331;
                case 11: goto L_0x032d;
                case 12: goto L_0x0329;
                case 13: goto L_0x0325;
                case 14: goto L_0x0321;
                case 15: goto L_0x031d;
                case 16: goto L_0x0319;
                case 17: goto L_0x0315;
                case 18: goto L_0x0311;
                case 19: goto L_0x030d;
                case 20: goto L_0x0309;
                case 21: goto L_0x0305;
                case 22: goto L_0x0301;
                case 23: goto L_0x02fd;
                case 24: goto L_0x02f9;
                case 25: goto L_0x0315;
                case 26: goto L_0x02f5;
                case 27: goto L_0x035b;
                default: goto L_0x0246;
            }
        L_0x0246:
            java.lang.String r28 = "error_unknown"
        L_0x0248:
            r27 = r10
            r32 = r20
            r33 = r19
            r26 = r14
            r26.A09(r27, r28, r29, r30, r32, r33)
        L_0x0253:
            java.util.List r0 = java.util.Collections.unmodifiableList(r18)
            java.util.Iterator r12 = r0.iterator()
        L_0x025b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r9 = r12.next()
            X.0tY r9 = (X.C16730tY) r9
            if (r7 != r8) goto L_0x02e0
            X.0ta r11 = r9.A02
            X.AnonymousClass00B.A06(r11)
            java.lang.String r0 = r9.A08
            if (r0 != 0) goto L_0x0287
            java.lang.String r0 = "mediauploadresponseprocessor/uploaded, but url is null for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r9.A11
            java.lang.String r0 = r0.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0287:
            long r0 = r9.A01
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 > 0) goto L_0x02e0
            java.io.File r0 = r11.A0F
            if (r0 == 0) goto L_0x02f2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = "; exists="
            r10.append(r0)
            java.io.File r0 = r11.A0F
            boolean r0 = r0.exists()
            r10.append(r0)
            java.lang.String r0 = "; size="
            r10.append(r0)
            java.io.File r0 = r11.A0F
            long r0 = r0.length()
            r10.append(r0)
            java.lang.String r11 = r10.toString()
        L_0x02b9:
            java.lang.String r0 = "mediauploadresponseprocessor/uploaded, but mediaSize="
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            long r0 = r9.A01
            r10.append(r0)
            java.lang.String r0 = "; file="
            r10.append(r0)
            r10.append(r11)
            java.lang.String r0 = "; msg="
            r10.append(r0)
            X.1Vw r0 = r9.A11
            java.lang.String r0 = r0.A01
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x02e0:
            X.0t6 r1 = r6.A04
            r0 = -1
            if (r7 != r8) goto L_0x02e6
            r0 = 1
        L_0x02e6:
            r1.A0e(r9, r0)
            if (r7 == r8) goto L_0x025b
            X.1HO r0 = r6.A07
            r0.A01(r9)
            goto L_0x025b
        L_0x02f2:
            java.lang.String r11 = "null"
            goto L_0x02b9
        L_0x02f5:
            java.lang.String r28 = "media_switch_required"
            goto L_0x0248
        L_0x02f9:
            java.lang.String r28 = "media_error_too_large"
            goto L_0x0248
        L_0x02fd:
            java.lang.String r28 = "media_error_wamsys"
            goto L_0x0248
        L_0x0301:
            java.lang.String r28 = "media_error_dns"
            goto L_0x0248
        L_0x0305:
            java.lang.String r28 = "media_error_file_format_unsupported"
            goto L_0x0248
        L_0x0309:
            java.lang.String r28 = "media_error_transcoding_unknown"
            goto L_0x0248
        L_0x030d:
            java.lang.String r28 = "media_error_url"
            goto L_0x0248
        L_0x0311:
            java.lang.String r28 = "media_error_ssl"
            goto L_0x0248
        L_0x0315:
            java.lang.String r28 = "media_error_no_client_network"
            goto L_0x0248
        L_0x0319:
            java.lang.String r28 = "media_error_no_such_algorithm"
            goto L_0x0248
        L_0x031d:
            java.lang.String r28 = "media_error_throttle"
            goto L_0x0248
        L_0x0321:
            java.lang.String r28 = "media_error_optimistic_network_unsafe"
            goto L_0x0248
        L_0x0325:
            java.lang.String r28 = "media_error_conn"
            goto L_0x0248
        L_0x0329:
            java.lang.String r28 = "media_error_optimistic_hash"
            goto L_0x0248
        L_0x032d:
            java.lang.String r28 = "media_error_not_finalized"
            goto L_0x0248
        L_0x0331:
            java.lang.String r28 = "media_error_request_timeout"
            goto L_0x0248
        L_0x0335:
            java.lang.String r28 = "media_error_request"
            goto L_0x0248
        L_0x0339:
            java.lang.String r28 = "media_error_server"
            goto L_0x0248
        L_0x033d:
            java.lang.String r28 = "media_error_fnf"
            goto L_0x0248
        L_0x0341:
            java.lang.String r28 = "media_error_no_permissions"
            goto L_0x0248
        L_0x0345:
            java.lang.String r28 = "media_error_bad_media"
            goto L_0x0248
        L_0x0349:
            java.lang.String r28 = "media_error_oom"
            goto L_0x0248
        L_0x034d:
            java.lang.String r28 = "media_error_io"
            goto L_0x0248
        L_0x0351:
            java.lang.String r28 = "failed_insufficient_space"
            goto L_0x0248
        L_0x0355:
            if (r9 == 0) goto L_0x035f
            if (r9 == r11) goto L_0x035b
            goto L_0x0246
        L_0x035b:
            java.lang.String r28 = "cancelled"
            goto L_0x0248
        L_0x035f:
            java.lang.String r28 = "success"
            goto L_0x0248
        L_0x0364:
            r30 = 0
            goto L_0x0237
        L_0x0368:
            r25 = 0
            goto L_0x008d
        L_0x036c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47532Jj.accept(java.lang.Object):void");
    }
}
