package X;

/* renamed from: X.1Tq  reason: invalid class name and case insensitive filesystem */
public class C27921Tq implements C27881Tm {
    public AnonymousClass01V A00;
    public C16220sf A01;

    public C27921Tq(AnonymousClass01V r1, C16220sf r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* synthetic */ void AKL(String str) {
    }

    public /* synthetic */ void AKN(AnonymousClass2JM r1) {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0040 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0040=Splitter:B:22:0x0040, B:17:0x0038=Splitter:B:17:0x0038} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AKY(java.lang.String r14) {
        /*
            r13 = this;
            X.0sf r4 = r13.A01
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.0ty r0 = r4.A01()     // Catch:{ Exception -> 0x0041 }
            X.0tf r2 = r0.get()     // Catch:{ Exception -> 0x0041 }
            X.0tg r5 = r2.A02     // Catch:{ all -> 0x003c }
            java.lang.String r6 = "settings"
            java.lang.String[] r7 = X.C40941uw.A00     // Catch:{ all -> 0x003c }
            r8 = 0
            r10 = r8
            r11 = r8
            r12 = r8
            r9 = r8
            android.database.Cursor r1 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0038
        L_0x0021:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002f
            X.1WS r0 = r4.A05(r1)     // Catch:{ all -> 0x0033 }
            r3.add(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0021
        L_0x002f:
            r1.close()     // Catch:{ all -> 0x003c }
            goto L_0x0038
        L_0x0033:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0038:
            r2.close()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0047
        L_0x003c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            java.lang.String r0 = "getSettings/QUERY_CHAT_SETTINGS/settings/exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0047:
            java.util.Iterator r3 = r3.iterator()
        L_0x004b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r2 = r3.next()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r0 = " /settings/"
            r1.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x004b
        L_0x0071:
            boolean r0 = X.C40981v0.A00
            if (r0 == 0) goto L_0x00ab
            X.01V r0 = r13.A00
            android.app.NotificationManager r0 = r0.A08()
            if (r0 == 0) goto L_0x00ab
            java.util.List r0 = X.AnonymousClass1v6.A01(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0085:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r2 = r3.next()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r0 = "/setting/channel:"
            r1.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0085
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27921Tq.AKY(java.lang.String):void");
    }
}
