package X;

/* renamed from: X.2iW  reason: invalid class name and case insensitive filesystem */
public final class C54942iW extends AnonymousClass1ZS {
    public final C16300so A00;
    public final C51562bs A01;
    public final C41401vj A02;

    public C54942iW(C16300so r2, C51562bs r3, C41401vj r4) {
        super("ReaderThread");
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (X.C28371Vv.A07(r6, "notification") != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c3, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("xmpp/reader/corrupt-stream-error/stanza ");
        r1.append(r4.bufString);
        com.whatsapp.util.Log.i(r1.toString());
        com.whatsapp.util.Log.i("xmpp/reader/corrupt-stream-error", r4);
        r15.A00.AcB("CorruptStreamException", r4.getMessage(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ee, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ef, code lost:
        com.whatsapp.util.Log.i("xmpp/reader/io-error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020e, code lost:
        com.whatsapp.util.Log.i("xmpp/reader/error");
        ((android.os.Handler) r15.A01).sendEmptyMessage(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0219, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ee A[Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3, all -> 0x020d }, ExcHandler: IOException (r1v5 'e' java.io.IOException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            java.lang.String r14 = "xmpp/reader/error"
            r0 = 1
            android.os.Process.setThreadPriority(r0)
        L_0x0007:
            X.1vj r7 = r15.A02     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            X.1Vu r11 = r7.A0J     // Catch:{ 1W9 | IOException -> 0x017b, RuntimeException -> 0x01b6 }
            X.1Vv r6 = r11.A03()     // Catch:{ 1W9 | IOException -> 0x017b, RuntimeException -> 0x01b6 }
            if (r6 != 0) goto L_0x0013
            goto L_0x01fe
        L_0x0013:
            r10 = 1
            boolean r0 = r7.A0D     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r9 = "message"
            boolean r13 = X.C28371Vv.A07(r6, r9)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r13 != 0) goto L_0x0031
            java.lang.String r0 = "receipt"
            boolean r0 = X.C28371Vv.A07(r6, r0)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "notification"
            boolean r1 = X.C28371Vv.A07(r6, r0)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            r0 = 0
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            java.lang.String r8 = "notification"
            java.lang.String r5 = "receipt"
            java.lang.String r4 = "offline"
            if (r0 == 0) goto L_0x0073
            r0 = 0
            java.lang.String r0 = r6.A0N(r4, r0)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 == 0) goto L_0x0073
            java.lang.String r2 = "t"
            r0 = -1
            long r2 = r6.A0D(r2, r0)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0056
            long r0 = r7.A09     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            r7.A09 = r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
        L_0x0056:
            r2 = 1
            if (r13 == 0) goto L_0x0060
            long r0 = r7.A05     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            long r0 = r0 + r2
            r7.A05 = r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            goto L_0x006b
        L_0x0060:
            boolean r0 = X.C28371Vv.A07(r6, r5)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 == 0) goto L_0x00c5
            long r0 = r7.A07     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            long r0 = r0 + r2
            r7.A07 = r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
        L_0x006b:
            X.0t3 r0 = r7.A0G     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            long r0 = r0.A00()     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            r7.A04 = r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
        L_0x0073:
            java.lang.String r0 = "ib"
            boolean r0 = X.C28371Vv.A07(r6, r0)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 == 0) goto L_0x00a5
            r3 = 0
            X.1Vv r2 = r6.A0I(r3)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            java.lang.String r0 = "offline_preview"
            boolean r0 = X.C28371Vv.A07(r2, r0)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 == 0) goto L_0x00bc
            X.0t3 r0 = r7.A0G     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            long r0 = r0.A00()     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            r7.A08 = r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            int r0 = r2.A0A(r9, r3)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            long r0 = (long) r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            r7.A01 = r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            int r0 = r2.A0A(r5, r3)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            long r0 = (long) r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            r7.A03 = r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            int r0 = r2.A0A(r8, r3)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            long r0 = (long) r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            r7.A02 = r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
        L_0x00a5:
            java.lang.String r2 = r6.A00     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            java.util.Map r1 = r7.A0B     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            boolean r0 = r1.containsKey(r2)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = r1.get(r2)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            X.2bg r0 = (X.C51442bg) r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 == 0) goto L_0x00d1
            r0.A00(r6)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            goto L_0x0007
        L_0x00bc:
            boolean r0 = X.C28371Vv.A07(r2, r4)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 == 0) goto L_0x00a5
            r7.A0C = r10     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            goto L_0x00a5
        L_0x00c5:
            boolean r0 = X.C28371Vv.A07(r6, r8)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            if (r0 == 0) goto L_0x006b
            long r0 = r7.A06     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            long r0 = r0 + r2
            r7.A06 = r0     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            goto L_0x006b
        L_0x00d1:
            java.lang.String r0 = "ConnectionReader/read tag found in map, but canHandleStanzaType returned false"
            X.AnonymousClass00B.A08(r0)     // Catch:{ 1W9 -> 0x00d8, RuntimeException -> 0x0170, IOException -> 0x01ee }
            goto L_0x0007
        L_0x00d8:
            r3 = move-exception
            java.lang.String r1 = "id"
            java.lang.String r0 = "-1"
            java.lang.String r9 = r6.A0N(r1, r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            X.AnonymousClass00B.A06(r9)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.String r10 = r6.A00     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r10)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "notification"
            boolean r0 = r0.equals(r10)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r10)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "call"
            boolean r0 = r0.equals(r10)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            if (r0 != 0) goto L_0x0107
            r10 = 0
        L_0x0107:
            java.lang.String r1 = "type"
            r0 = 0
            java.lang.String r8 = r6.A0N(r1, r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.Class<com.whatsapp.jid.Jid> r2 = com.whatsapp.jid.Jid.class
            X.0so r5 = r7.A0F     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r1 = r6.A0F(r5, r2, r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r4 = r6.A0F(r5, r2, r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            if (r10 == 0) goto L_0x01c2
            X.1kL r3 = new X.1kL     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r3.<init>()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            if (r1 == 0) goto L_0x012a
            r3.A01 = r1     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
        L_0x012a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r2.<init>()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r3.A05 = r10     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.String r0 = "cls:"
            r2.append(r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r2.append(r10)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.String r1 = " "
            r2.append(r1)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r3.A07 = r9     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            if (r8 == 0) goto L_0x0150
            r3.A08 = r8     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.String r0 = "type:"
            r2.append(r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r2.append(r8)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r2.append(r1)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
        L_0x0150:
            if (r4 == 0) goto L_0x0154
            r3.A02 = r4     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
        L_0x0154:
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r1 = 0
            java.lang.String r0 = "CorruptStreamException"
            r5.AcB(r0, r2, r1)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.String r1 = "error"
            java.lang.String r0 = "487"
            r3.A01(r1, r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            X.2H7 r1 = r7.A0I     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            X.1ci r0 = r3.A00()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r1.A01(r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            goto L_0x0007
        L_0x0170:
            r3 = move-exception
            java.lang.String r0 = "xmpp/reader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r11.A05()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            goto L_0x01c2
        L_0x017b:
            r3 = move-exception
            java.lang.String r0 = "xmpp/reader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.util.Map r4 = r7.A0A     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.util.Set r0 = r4.entrySet()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
        L_0x018c:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            X.2Qh r1 = (X.AnonymousClass2Qh) r1     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            boolean r0 = r1 instanceof X.C51782cG     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            if (r0 == 0) goto L_0x018c
            X.2cG r1 = (X.C51782cG) r1     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            X.2cF r0 = r1.A00     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            com.obwhatsapp.profile.SetAboutInfo r0 = r0.A00     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            android.os.Handler r1 = r0.A07     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r0 = 0
            r1.removeMessages(r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r1.sendEmptyMessage(r0)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            goto L_0x018c
        L_0x01b2:
            r4.clear()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            goto L_0x01c2
        L_0x01b6:
            r3 = move-exception
            X.1Vu r1 = r7.A0J     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            java.lang.String r0 = "xmpp/reader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
            r1.A05()     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
        L_0x01c2:
            throw r3     // Catch:{ IOException -> 0x01ee, 1W9 -> 0x01c3 }
        L_0x01c3:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020d }
            r1.<init>()     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "xmpp/reader/corrupt-stream-error/stanza "
            r1.append(r0)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = r4.bufString     // Catch:{ all -> 0x020d }
            r1.append(r0)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x020d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "xmpp/reader/corrupt-stream-error"
            com.whatsapp.util.Log.i(r0, r4)     // Catch:{ all -> 0x020d }
            X.0so r3 = r15.A00     // Catch:{ all -> 0x020d }
            java.lang.String r2 = "CorruptStreamException"
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x020d }
            r0 = 0
            r3.AcB(r2, r1, r0)     // Catch:{ all -> 0x020d }
            goto L_0x01f5
        L_0x01ee:
            r1 = move-exception
            java.lang.String r0 = "xmpp/reader/io-error"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x020d }
        L_0x01f5:
            com.whatsapp.util.Log.i((java.lang.String) r14)
            X.2bs r1 = r15.A01
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 2
            goto L_0x0209
        L_0x01fe:
            java.lang.String r0 = "xmpp/reader/logout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2bs r1 = r15.A01
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 1
        L_0x0209:
            r1.sendEmptyMessage(r0)
            return
        L_0x020d:
            r2 = move-exception
            com.whatsapp.util.Log.i((java.lang.String) r14)
            X.2bs r1 = r15.A01
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 2
            r1.sendEmptyMessage(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54942iW.run():void");
    }
}
