package X;

/* renamed from: X.0vK  reason: invalid class name and case insensitive filesystem */
public final class C17590vK {
    public final C216314v A00;
    public final AnonymousClass19X A01;

    public C17590vK(C216314v r2, AnonymousClass19X r3) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0053 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0053=Splitter:B:20:0x0053, B:12:0x0046=Splitter:B:12:0x0046} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(X.AnonymousClass1ZX r12) {
        /*
            r11 = this;
            r10 = 0
            X.C18450wi.A0H(r12, r10)
            X.14v r0 = r11.A00
            long r8 = r0.A01(r12)
            X.19X r0 = r11.A01
            java.util.Map r7 = r0.A01
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.lang.Object r5 = r7.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0059
            X.0tq r0 = r0.A00
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "SELECT display_name FROM lid_display_name WHERE lid_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0054 }
            r1[r10] = r0     // Catch:{ all -> 0x0054 }
            android.database.Cursor r2 = r3.A08(r2, r1)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "display_name"
            int r1 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x004d }
            if (r1 < 0) goto L_0x0046
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0046
            java.lang.String r5 = r2.getString(r1)     // Catch:{ all -> 0x004d }
            r7.put(r6, r5)     // Catch:{ all -> 0x004d }
        L_0x0046:
            r2.close()     // Catch:{ all -> 0x0054 }
            r4.close()
            return r5
        L_0x004d:
            r0 = move-exception
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0
        L_0x0059:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17590vK.A00(X.1ZX):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00d4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(java.util.Map r11) {
        /*
            r10 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r0 = r11.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x000d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            X.14v r1 = r10.A00
            java.lang.Object r0 = r3.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            long r0 = r1.A01(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r3.getValue()
            X.1Jq r0 = new X.1Jq
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x000d
        L_0x0036:
            java.util.Map r0 = X.C25411Jr.A02(r5)
            X.19X r9 = r10.A01
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x004e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map r1 = r9.A01
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0072
            java.lang.Object r0 = r2.getValue()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004e
        L_0x0072:
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r8.put(r1, r0)
            java.lang.Object r0 = r2.getKey()
            r5.add(r0)
            goto L_0x004e
        L_0x0085:
            X.0tq r0 = r9.A00     // Catch:{ SQLException -> 0x00d5 }
            X.0tf r7 = r0.A02()     // Catch:{ SQLException -> 0x00d5 }
            X.1cj r6 = r7.A00()     // Catch:{ all -> 0x00d0 }
            java.util.Set r0 = r8.entrySet()     // Catch:{ all -> 0x00cb }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x00cb }
        L_0x0097:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x00cb }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00cb }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x00cb }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00cb }
            long r1 = r0.longValue()     // Catch:{ all -> 0x00cb }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00cb }
            X.AnonymousClass19X.A00(r7, r0, r1)     // Catch:{ all -> 0x00cb }
            goto L_0x0097
        L_0x00b7:
            r6.A00()     // Catch:{ all -> 0x00cb }
            r1 = 36
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ all -> 0x00cb }
            r0.<init>(r9, r1, r8)     // Catch:{ all -> 0x00cb }
            r7.A03(r0)     // Catch:{ all -> 0x00cb }
            r6.close()     // Catch:{ all -> 0x00d0 }
            r7.close()     // Catch:{ SQLException -> 0x00d5 }
            goto L_0x00db
        L_0x00cb:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            throw r0     // Catch:{ SQLException -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            java.lang.String r0 = "LidDisplayNameStore/upsertDisplayNameForLid"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00db:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x00e4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            X.14v r2 = r10.A00
            X.C18450wi.A09(r0)
            long r0 = r0.longValue()
            com.whatsapp.jid.Jid r1 = r2.A03(r0)
            boolean r0 = r1 instanceof X.AnonymousClass1ZX
            if (r0 == 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00e4
            r4.add(r1)
            goto L_0x00e4
        L_0x0107:
            java.util.List r0 = X.C003101j.A0A(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17590vK.A01(java.util.Map):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.AnonymousClass1ZX r10, java.lang.String r11) {
        /*
            r9 = this;
            r6 = 0
            X.C18450wi.A0H(r10, r6)
            r0 = 1
            r5 = r11
            X.C18450wi.A0H(r11, r0)
            X.14v r0 = r9.A00
            long r7 = r0.A01(r10)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0059
            X.19X r4 = r9.A01
            java.util.Map r1 = r4.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0059
            X.0tq r0 = r4.A00     // Catch:{ SQLException -> 0x0051 }
            X.0tf r2 = r0.A02()     // Catch:{ SQLException -> 0x0051 }
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x004c }
            X.AnonymousClass19X.A00(r2, r11, r7)     // Catch:{ all -> 0x0047 }
            r1.A00()     // Catch:{ all -> 0x0047 }
            com.facebook.redex.RunnableRunnableShape0S1100100_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S1100100_I0     // Catch:{ all -> 0x0047 }
            r3.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x0047 }
            r2.A03(r3)     // Catch:{ all -> 0x0047 }
            r1.close()     // Catch:{ all -> 0x004c }
            r2.close()     // Catch:{ SQLException -> 0x0051 }
            r0 = 1
            return r0
        L_0x0047:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0     // Catch:{ SQLException -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            java.lang.String r0 = "LidDisplayNameStore/upsertDisplayNameForLid"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L_0x0059:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17590vK.A02(X.1ZX, java.lang.String):boolean");
    }
}
