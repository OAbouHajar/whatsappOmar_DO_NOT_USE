package X;

/* renamed from: X.2e0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52562e0 implements AnonymousClass1WE {
    public final /* synthetic */ C52522dw A00;
    public final /* synthetic */ C23531Ci A01;
    public final /* synthetic */ AnonymousClass1XP A02;
    public final /* synthetic */ C34151jm A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ byte[] A05;

    public /* synthetic */ C52562e0(C52522dw r1, C23531Ci r2, AnonymousClass1XP r3, C34151jm r4, String str, byte[] bArr) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = r4;
        this.A05 = bArr;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0192 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0192=Splitter:B:42:0x0192, B:36:0x0188=Splitter:B:36:0x0188} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r27) {
        /*
            r26 = this;
            r2 = r27
            r0 = r26
            X.1Ci r5 = r0.A01
            X.1XP r1 = r0.A02
            java.lang.String r8 = r0.A04
            X.1jm r4 = r0.A03
            byte[] r10 = r0.A05
            X.2dw r3 = r0.A00
            java.lang.Number r2 = (java.lang.Number) r2
            X.1XS r0 = r1.A0H
            java.lang.Object r9 = r0.A00()
            X.21B r9 = (X.AnonymousClass21B) r9
            r1.A02()
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x01cd
            if (r9 == 0) goto L_0x01cd
            X.1ez r13 = r9.A02
            java.lang.String r0 = r13.A03()
            if (r0 == 0) goto L_0x01cd
            X.1RN r6 = r5.A0D
            X.1f1 r2 = r1.A0J
            X.AnonymousClass00B.A06(r2)
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
            X.1OJ r0 = r6.A01
            r0.A03(r2)
            java.lang.String r2 = r4.A0D
            X.AnonymousClass00B.A06(r2)
            r7 = 0
            java.lang.String r6 = android.util.Base64.encodeToString(r10, r7)
            java.lang.String r0 = r13.A06()
            r4.A0G = r0
            java.lang.String r0 = r13.A03()
            r4.A06 = r0
            r4.A0B = r6
            java.lang.String r0 = r13.A04()
            r4.A08 = r0
            X.13k r10 = r5.A0F
            boolean r0 = r10.A0I(r2)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r15 = r13.A05()
            java.lang.String r16 = r13.A06()
            java.lang.String r17 = r13.A04()
            java.lang.String r18 = r13.A03()
            java.lang.String r12 = r4.A0C
            X.1f0 r0 = r9.A01
            X.1qS r0 = r0.A02
            long r0 = r0.A02
            int r11 = (int) r0
            java.lang.Integer r0 = r13.A02()
            if (r0 != 0) goto L_0x0142
            r23 = 0
        L_0x0086:
            java.lang.Integer r0 = r13.A01()
            if (r0 != 0) goto L_0x0138
            r24 = 0
        L_0x008e:
            java.lang.String r1 = r4.A07
            boolean r0 = r4.A0I
            r19 = r12
            r20 = r6
            r21 = r1
            r22 = r11
            r25 = r0
            r14 = r10
            r14.A0G(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x00a0:
            X.1Go r15 = r5.A0G
            boolean r0 = r15.A02(r2)
            if (r0 == 0) goto L_0x01af
            java.lang.String r17 = r13.A05()
            java.lang.String r14 = r13.A06()
            java.lang.String r12 = r13.A04()
            java.lang.String r11 = r13.A03()
            java.lang.String r10 = r4.A0C
            X.1f0 r0 = r9.A01
            X.1qS r0 = r0.A02
            long r0 = r0.A02
            int r9 = (int) r0
            r18 = r9
            java.lang.Integer r0 = r13.A02()
            if (r0 != 0) goto L_0x012f
            r16 = 0
        L_0x00cb:
            java.lang.Integer r0 = r13.A01()
            if (r0 == 0) goto L_0x00d9
            java.lang.Integer r0 = r13.A01()
            int r7 = r0.intValue()
        L_0x00d9:
            java.lang.String r1 = r4.A07
            boolean r0 = r4.A0I
            X.1Qj r13 = r15.A04
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>()
            java.lang.String r15 = "url"
            r9.put(r15, r14)
            java.lang.String r14 = "enc_hash"
            r9.put(r14, r12)
            java.lang.String r12 = "direct_path"
            r9.put(r12, r11)
            java.lang.String r11 = "mimetype"
            r9.put(r11, r10)
            java.lang.String r10 = "media_key"
            r9.put(r10, r6)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            java.lang.String r6 = "file_size"
            r9.put(r6, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            java.lang.String r6 = "width"
            r9.put(r6, r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r6 = "height"
            r9.put(r6, r7)
            java.lang.String r6 = "emojis"
            r9.put(r6, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_first_party"
            r9.put(r0, r1)
            X.12j r11 = r13.A01
            X.0tf r7 = r11.A02()
            goto L_0x014c
        L_0x012f:
            java.lang.Integer r0 = r13.A02()
            int r16 = r0.intValue()
            goto L_0x00cb
        L_0x0138:
            java.lang.Integer r0 = r13.A01()
            int r24 = r0.intValue()
            goto L_0x008e
        L_0x0142:
            java.lang.Integer r0 = r13.A02()
            int r23 = r0.intValue()
            goto L_0x0086
        L_0x014c:
            X.0tg r12 = r7.A02     // Catch:{ all -> 0x0193 }
            java.lang.String r10 = "starred_stickers"
            java.lang.String r6 = "plaintext_hash = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0193 }
            r0 = 0
            r1[r0] = r17     // Catch:{ all -> 0x0193 }
            r12.A00(r10, r9, r6, r1)     // Catch:{ all -> 0x0193 }
            r7.close()
            X.AnonymousClass00B.A00()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r0 = 0
            r6[r0] = r2
            X.0tf r7 = r11.get()
            X.0tg r1 = r7.A02     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "SELECT timestamp FROM starred_stickers WHERE plaintext_hash = ?"
            android.database.Cursor r6 = r1.A08(r0, r6)     // Catch:{ all -> 0x0193 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = "timestamp"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018c }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x018c }
            goto L_0x0188
        L_0x0186:
            r0 = -1
        L_0x0188:
            r6.close()     // Catch:{ all -> 0x0193 }
            goto L_0x0198
        L_0x018c:
            r0 = move-exception
            if (r6 == 0) goto L_0x0192
            r6.close()     // Catch:{ all -> 0x0192 }
        L_0x0192:
            throw r0     // Catch:{ all -> 0x0193 }
        L_0x0193:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0197 }
        L_0x0197:
            throw r0
        L_0x0198:
            r7.close()
            X.0xU r7 = r5.A00
            if (r7 == 0) goto L_0x01af
            r9 = 0
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x01af
            r6 = 1
            java.util.Set r1 = r7.A0H(r4, r0, r6)
            X.0xU r0 = r5.A00
            r0.A0V(r1)
        L_0x01af:
            X.1RM r5 = r5.A0H
            monitor-enter(r5)
            X.03L r1 = r5.A00     // Catch:{ all -> 0x01ca }
            if (r1 != 0) goto L_0x01bf
            r0 = 60
            X.03L r1 = new X.03L     // Catch:{ all -> 0x01ca }
            r1.<init>(r0)     // Catch:{ all -> 0x01ca }
            r5.A00 = r1     // Catch:{ all -> 0x01ca }
        L_0x01bf:
            r1.A06(r2, r4)     // Catch:{ all -> 0x01ca }
            monitor-exit(r5)
            X.1pH r1 = X.C37511pH.A04
            r0 = 1
            r3.A00(r1, r4, r8, r0)
            return
        L_0x01ca:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x01cd:
            java.lang.String r0 = "NonMessageDataRequestManager/uploadSticker/failed to upload, error:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.C87644Xx.A00(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1pH r2 = X.C37511pH.A02
            r1 = 0
            r0 = 0
            r3.A00(r2, r1, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52562e0.accept(java.lang.Object):void");
    }
}
