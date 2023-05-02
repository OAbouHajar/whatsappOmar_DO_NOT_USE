package X;

import java.lang.ref.WeakReference;

/* renamed from: X.36B  reason: invalid class name */
public class AnonymousClass36B extends C16690tT {
    public final C16000sG A00;
    public final AnonymousClass120 A01;
    public final C14710pd A02;
    public final WeakReference A03;

    public AnonymousClass36B(C16000sG r2, AnonymousClass120 r3, AnonymousClass3BA r4, C14710pd r5) {
        this.A03 = C13690nt.A0h(r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0099 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r12) {
        /*
            r11 = this;
            X.0tU r4 = r11.A02
            boolean r0 = r4.isCancelled()
            r8 = 0
            if (r0 != 0) goto L_0x0126
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            X.0sG r3 = r11.A00
            X.18c r0 = r3.A06
            java.lang.String r1 = "raw_contact_id"
            X.01V r0 = r0.A03
            android.content.ContentResolver r5 = r0.A0C()
            if (r5 != 0) goto L_0x005f
            java.lang.String r0 = "contact-mgr-db/wadbhelper/get-contact-nux-suggest-list cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0020:
            boolean r0 = r4.isCancelled()
            if (r0 != 0) goto L_0x0126
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            r3.A0U(r5)
            boolean r0 = r4.isCancelled()
            if (r0 != 0) goto L_0x0126
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            int[] r0 = X.AnonymousClass3BA.A0E
            int r6 = r0.length
            r3 = 0
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00a1
            java.util.Iterator r2 = r5.iterator()
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0119
            X.0sH r1 = X.C13680ns.A0U(r2)
            if (r3 >= r6) goto L_0x0119
            X.120 r0 = r11.A01
            boolean r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x0045
            r4.add(r1)
            int r3 = r3 + 1
            goto L_0x0045
        L_0x005f:
            android.net.Uri r6 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ Exception -> 0x009a }
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ Exception -> 0x009a }
            r0 = 0
            r7[r0] = r1     // Catch:{ Exception -> 0x009a }
            java.lang.String r10 = "times_contacted DESC LIMIT 100"
            r9 = r8
            android.database.Cursor r7 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x009a }
            if (r7 == 0) goto L_0x0020
            int r6 = r7.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0095 }
            java.util.HashSet r5 = X.C13680ns.A0o()     // Catch:{ all -> 0x0095 }
        L_0x0079:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0091
            long r0 = r7.getLong(r6)     // Catch:{ all -> 0x0095 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0095 }
            boolean r0 = r5.add(r1)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0079
            r2.add(r1)     // Catch:{ all -> 0x0095 }
            goto L_0x0079
        L_0x0091:
            r7.close()     // Catch:{ Exception -> 0x009a }
            goto L_0x0020
        L_0x0095:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0099 }
        L_0x0099:
            throw r0     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to query the phone book for frequent contacts sorted by TIMES_CONTACTED"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0020
        L_0x00a1:
            X.03G r8 = new X.03G
            r8.<init>()
            java.util.Iterator r9 = r5.iterator()
        L_0x00aa:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c1
            X.0sH r7 = X.C13680ns.A0U(r9)
            X.1ko r0 = r7.A0D
            if (r0 != 0) goto L_0x00be
            r0 = 0
        L_0x00ba:
            r8.A09(r0, r7)
            goto L_0x00aa
        L_0x00be:
            long r0 = r0.A00
            goto L_0x00ba
        L_0x00c1:
            java.util.HashSet r7 = X.C13680ns.A0o()
            java.util.Iterator r9 = r2.iterator()
        L_0x00c9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r9.next()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r3 >= r6) goto L_0x00f5
            long r1 = r0.longValue()
            r0 = 0
            java.lang.Object r1 = r8.A04(r1, r0)
            X.0sH r1 = (X.C16010sH) r1
            if (r1 == 0) goto L_0x00c9
            X.120 r0 = r11.A01
            boolean r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x00c9
            r4.add(r1)
            r7.add(r1)
            int r3 = r3 + 1
            goto L_0x00c9
        L_0x00f5:
            java.util.Iterator r2 = r5.iterator()
        L_0x00f9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0119
            X.0sH r1 = X.C13680ns.A0U(r2)
            if (r3 >= r6) goto L_0x0119
            X.120 r0 = r11.A01
            boolean r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r7.add(r1)
            if (r0 == 0) goto L_0x00f9
            r4.add(r1)
            int r3 = r3 + 1
            goto L_0x00f9
        L_0x0119:
            int r0 = r5.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.01Q r8 = new X.01Q
            r8.<init>(r4, r0)
        L_0x0126:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36B.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r2 = (AnonymousClass01Q) obj;
        AnonymousClass3BA r0 = (AnonymousClass3BA) this.A03.get();
        if (r0 != null) {
            AnonymousClass3BA.A00(r2, r0);
        }
    }
}
