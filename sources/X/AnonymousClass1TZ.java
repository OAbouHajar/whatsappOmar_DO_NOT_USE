package X;

/* renamed from: X.1TZ  reason: invalid class name */
public final class AnonymousClass1TZ {
    public final C16980tz A00;
    public final C14710pd A01;
    public final C17190ug A02;

    public AnonymousClass1TZ(C16980tz r2, C14710pd r3, C17190ug r4) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C53102ez r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            r5 = 0
            r6 = r18
            X.C18450wi.A0H(r6, r5)
            java.lang.String r4 = "platform"
            r13 = 1
            r3 = 0
            r0 = r17
            if (r17 == 0) goto L_0x0080
            java.util.List r1 = r0.A01
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0018
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L_0x0018:
            if (r1 == 0) goto L_0x0080
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0080
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.Iterator r12 = r1.iterator()
        L_0x002f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r11 = r12.next()
            X.2f0 r11 = (X.AnonymousClass2f0) r11
            r0 = 2
            X.1lL[] r10 = new X.C35081lL[r0]
            X.0rv r2 = r11.A01
            java.lang.String r1 = "jid"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r10[r5] = r0
            java.lang.Long r0 = r11.A00
            if (r0 != 0) goto L_0x0065
            java.lang.Long r0 = r11.A02
            long r1 = r0.longValue()
            r7 = -1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = r0.toSeconds(r1)
        L_0x005f:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r11.A00 = r0
        L_0x0065:
            X.C18450wi.A0B(r0)
            long r0 = r0.longValue()
            java.lang.String r7 = "mute"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r7, (long) r0)
            r10[r13] = r2
            java.lang.String r1 = "item"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r10)
            r9.add(r0)
            goto L_0x002f
        L_0x0080:
            r0 = 0
            goto L_0x008c
        L_0x0082:
            X.1Vv[] r0 = new X.C28371Vv[r5]
            java.lang.Object[] r0 = r9.toArray(r0)
            if (r0 == 0) goto L_0x013d
            X.1Vv[] r0 = (X.C28371Vv[]) r0
        L_0x008c:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2 = r16
            X.0ug r9 = r2.A02
            java.lang.String r12 = r9.A02()
            X.C18450wi.A0B(r12)
            java.lang.String r1 = "id"
            X.1lL r8 = new X.1lL
            r8.<init>((java.lang.String) r1, (java.lang.String) r6)
            r7.add(r8)
            X.1lL r6 = new X.1lL
            r8 = r19
            r6.<init>((java.lang.String) r4, (java.lang.String) r8)
            r7.add(r6)
            X.0pd r8 = r2.A01
            r6 = 2792(0xae8, float:3.912E-42)
            X.0tM r4 = X.C16620tM.A02
            boolean r4 = r8.A0E(r4, r6)
            if (r4 == 0) goto L_0x00c8
            if (r3 == 0) goto L_0x00c8
            java.lang.String r6 = "app_mute"
            X.1lL r4 = new X.1lL
            r4.<init>((java.lang.String) r6, (java.lang.String) r3)
            r7.add(r4)
        L_0x00c8:
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.lang.String r4 = "config"
            if (r0 == 0) goto L_0x0121
            X.1lL[] r3 = new X.C35081lL[r5]
            java.lang.Object[] r3 = r7.toArray(r3)
            if (r3 == 0) goto L_0x0131
            X.1lL[] r3 = (X.C35081lL[]) r3
            X.1Vv r6 = new X.1Vv
            r6.<init>((java.lang.String) r4, (X.C35081lL[]) r3, (X.C28371Vv[]) r0)
        L_0x00dd:
            r0 = 4
            X.1lL[] r7 = new X.C35081lL[r0]
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)
            r7[r5] = r0
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:push"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)
            r7[r13] = r0
            r4 = 2
            java.lang.String r3 = "type"
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)
            r7[r4] = r0
            r4 = 3
            X.1ks r3 = X.C34791ks.A00
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)
            r7[r4] = r0
            java.lang.String r0 = "iq"
            X.1Vv r11 = new X.1Vv
            r11.<init>((X.C28371Vv) r6, (java.lang.String) r0, (X.C35081lL[]) r7)
            com.facebook.redex.IDxRCallbackShape231S0100000_2_I0 r10 = new com.facebook.redex.IDxRCallbackShape231S0100000_2_I0
            r10.<init>(r2, r4)
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0G(r10, r11, r12, r13, r14)
            return
        L_0x0121:
            X.1lL[] r0 = new X.C35081lL[r5]
            java.lang.Object[] r0 = r7.toArray(r0)
            if (r0 == 0) goto L_0x0137
            X.1lL[] r0 = (X.C35081lL[]) r0
            X.1Vv r6 = new X.1Vv
            r6.<init>(r4, r0)
            goto L_0x00dd
        L_0x0131:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x0137:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x013d:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TZ.A00(X.2ez, java.lang.String, java.lang.String):void");
    }
}
