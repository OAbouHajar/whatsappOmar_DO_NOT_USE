package X;

/* renamed from: X.3I1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I1 implements Runnable {
    public final /* synthetic */ C15830rv A00;
    public final /* synthetic */ C25331Jj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ AnonymousClass3I1(C15830rv r1, C25331Jj r2, String str, String str2, String str3, String str4, boolean z2) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r1;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.1lV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.1lV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.1lV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.1lV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            X.1Jj r7 = r1.A01
            java.lang.String r10 = r1.A02
            java.lang.String r0 = r1.A03
            X.0rv r11 = r1.A00
            java.lang.String r9 = r1.A04
            java.lang.String r5 = r1.A05
            boolean r4 = r1.A06
            X.C18450wi.A0F(r10)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            X.C18450wi.A0F(r9)
            X.C18450wi.A0F(r5)
            r1 = 0
            X.1Vw r0 = new X.1Vw
            r0.<init>(r11, r8, r1)
            X.0t6 r3 = r7.A04
            X.0tZ r2 = X.C16460t6.A00(r3, r0)
            org.json.JSONObject r6 = X.C13700nu.A0J()
            java.lang.String r0 = "cta"
            r6.put(r0, r5)     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r0 = "flow_id"
            r6.put(r0, r9)     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r0 = "session_id"
            r6.put(r0, r10)     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r1 = "extensions_message_id"
            java.lang.String r0 = X.AnonymousClass22T.A00(r8)     // Catch:{ JSONException -> 0x0047 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0047 }
            goto L_0x0055
        L_0x0047:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "SendExtensionsResponseMessage/sendWamEvent/"
            java.lang.String r0 = X.C18450wi.A06(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0055:
            boolean r0 = r11 instanceof com.whatsapp.jid.UserJid
            r1 = 0
            if (r0 == 0) goto L_0x00cc
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            if (r11 == 0) goto L_0x00cd
            X.0uP r0 = r7.A03
            X.1Vq r0 = r0.A00(r11)
            int r0 = X.C18180wH.A00(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L_0x006c:
            X.1Ji r10 = r7.A05
            java.lang.String r13 = r6.toString()
            if (r2 != 0) goto L_0x00bf
            r16 = 1
        L_0x0076:
            r17 = 1
            r14 = 2
            r15 = 4
            r10.A00(r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r2 instanceof X.C16840tj
            if (r0 == 0) goto L_0x00be
            r0 = r2
            X.0tj r0 = (X.C16840tj) r0
            if (r0 == 0) goto L_0x00be
            X.0tn r7 = r0.AAt()
            if (r7 == 0) goto L_0x00be
            int r6 = r7.A00
            r0 = 5
            if (r6 != r0) goto L_0x00be
            X.1lW r0 = r7.A03
            if (r0 == 0) goto L_0x00be
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00bb
            java.util.Iterator r7 = r0.iterator()
        L_0x009d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r6 = r7.next()
            r0 = r6
            X.1lV r0 = (X.C35181lV) r0
            X.1lK r0 = r0.A01
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18450wi.A0R(r0, r5)
            if (r0 == 0) goto L_0x009d
            r1 = r6
        L_0x00b5:
            X.1lV r1 = (X.C35181lV) r1
            if (r1 == 0) goto L_0x00bb
            r1.A00 = r4
        L_0x00bb:
            r3.A0a(r2)
        L_0x00be:
            return
        L_0x00bf:
            byte r7 = r2.A10
            int r6 = r2.A08
            boolean r0 = X.C30921dB.A04(r2)
            int r16 = X.C42141xI.A00(r7, r6, r0)
            goto L_0x0076
        L_0x00cc:
            r11 = r1
        L_0x00cd:
            r12 = r1
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3I1.run():void");
    }
}
