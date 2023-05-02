package X;

/* renamed from: X.1OA  reason: invalid class name */
public class AnonymousClass1OA implements C23541Cj {
    public final C16440t3 A00;
    public final AnonymousClass1O8 A01;
    public final AnonymousClass11K A02;
    public final AnonymousClass151 A03;
    public final AnonymousClass1O9 A04;
    public final C216414w A05;
    public final AnonymousClass192 A06;
    public final AnonymousClass17J A07;
    public final AnonymousClass128 A08;
    public final AnonymousClass15G A09;
    public final C16500tA A0A;
    public final AnonymousClass0y2 A0B;

    public AnonymousClass1OA(C16440t3 r1, AnonymousClass1O8 r2, AnonymousClass11K r3, AnonymousClass151 r4, AnonymousClass1O9 r5, C216414w r6, AnonymousClass192 r7, AnonymousClass17J r8, AnonymousClass128 r9, AnonymousClass15G r10, C16500tA r11, AnonymousClass0y2 r12) {
        this.A0B = r12;
        this.A0A = r11;
        this.A08 = r9;
        this.A09 = r10;
        this.A07 = r8;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00bc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APJ() {
        /*
            r8 = this;
            X.0tA r1 = r8.A0A
            java.lang.String r0 = "SharedMediaIdsStore/deleteOutdatedRecords"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tc r0 = r1.A00
            X.0tf r7 = r0.A02()
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = "shared_media_ids"
            java.lang.String r4 = "expiration_timestamp <?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00c2 }
            r2 = 0
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00c2 }
            r3[r2] = r0     // Catch:{ all -> 0x00c2 }
            r6.A01(r5, r4, r3)     // Catch:{ all -> 0x00c2 }
            r7.close()
            X.0y2 r3 = r8.A0B
            X.0yO r0 = r3.A02
            java.util.List r1 = r0.A07()
            int r0 = r1.size()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r1.next()
            X.1WN r0 = (X.AnonymousClass1WN) r0
            com.whatsapp.jid.DeviceJid r0 = r0.A06
            r7.add(r0)
            goto L_0x003d
        L_0x004f:
            X.19M r5 = r3.A03
            X.AnonymousClass00B.A00()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.19K r0 = r5.A00
            X.0tf r6 = r0.get()
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "SELECT DISTINCT device_id FROM peer_messages"
            r0 = 0
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x00bd }
        L_0x0068:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = "device_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00b6 }
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r0)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0068
            r4.add(r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x0068
        L_0x0082:
            r1.close()     // Catch:{ all -> 0x00bd }
            r6.close()
            r4.removeAll(r7)
            java.util.Iterator r1 = r4.iterator()
        L_0x008f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009f
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            r5.A05(r0)
            goto L_0x008f
        L_0x009f:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00b5
            X.0so r3 = r3.A00
            int r0 = r4.size()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "orphan-peer-messages"
            r3.AcB(r0, r2, r1)
        L_0x00b5:
            return
        L_0x00b6:
            r0 = move-exception
            if (r1 == 0) goto L_0x00bc
            r1.close()     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00c6 }
            throw r0
        L_0x00c2:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OA.APJ():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|36|37|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        if (r3 == null) goto L_0x010d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0215 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x0283 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x0288 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x010d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0112 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0117 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x020b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0210 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APK() {
        /*
            r21 = this;
            r5 = r21
            X.151 r0 = r5.A03
            r0.A03()
            X.128 r4 = r5.A08
            r2 = 1
            X.126 r3 = r4.A04
            r0 = 41
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r1.<init>(r4, r0)
            r0 = 40
            r3.A01(r1, r0)
            X.14w r1 = r5.A05
            X.0tq r0 = r1.A03
            X.0tf r8 = r0.A02()
            X.0t3 r0 = r1.A00     // Catch:{ all -> 0x02f6 }
            long r9 = r0.A00()     // Catch:{ all -> 0x02f6 }
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r9 = r9 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r0
            X.0tg r6 = r8.A02     // Catch:{ all -> 0x02f6 }
            java.lang.String r4 = "receipt_orphaned"
            java.lang.String r3 = "timestamp < ?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x02f6 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x02f6 }
            r2[r1] = r0     // Catch:{ all -> 0x02f6 }
            r6.A01(r4, r3, r2)     // Catch:{ all -> 0x02f6 }
            r8.close()
            X.17J r11 = r5.A07
            X.0t3 r4 = r5.A00
            long r19 = r4.A00()
            long r0 = X.C817849s.A00
            long r19 = r19 - r0
            r10 = 200(0xc8, float:2.8E-43)
            r9 = 1
            r18 = 500(0x1f4, float:7.0E-43)
        L_0x0056:
            r14 = 0
            X.0tq r0 = r11.A04     // Catch:{ Exception -> 0x0118 }
            X.0tf r8 = r0.A02()     // Catch:{ Exception -> 0x0118 }
            X.1cj r17 = r8.A00()     // Catch:{ all -> 0x0113 }
            X.0tg r13 = r8.A02     // Catch:{ all -> 0x010e }
            java.lang.String r2 = "SELECT message_row_id FROM message_streaming_sidecar WHERE timestamp < ? LIMIT ?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x010e }
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x010e }
            r1[r14] = r0     // Catch:{ all -> 0x010e }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x010e }
            r1[r9] = r0     // Catch:{ all -> 0x010e }
            android.database.Cursor r3 = r13.A08(r2, r1)     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r1.<init>()     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan num messages to update:"
            r1.append(r0)     // Catch:{ all -> 0x0107 }
            int r0 = r3.getCount()     // Catch:{ all -> 0x0107 }
            r1.append(r0)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0107 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0107 }
            int r0 = r3.getCount()     // Catch:{ all -> 0x0107 }
            r16 = 0
            if (r0 < r10) goto L_0x009a
            r16 = 1
        L_0x009a:
            r12 = 0
        L_0x009b:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "message_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0105 }
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x0105 }
            X.0th r0 = r11.A01     // Catch:{ all -> 0x0105 }
            X.0tZ r2 = r0.A00(r6)     // Catch:{ all -> 0x0105 }
            boolean r0 = r2 instanceof X.C16730tY     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00cb
            r0 = r2
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ all -> 0x0105 }
            X.0ta r0 = r0.A02     // Catch:{ all -> 0x0105 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0105 }
            r0.A0M = r14     // Catch:{ all -> 0x0105 }
            X.1sc r1 = r11.A03     // Catch:{ all -> 0x0105 }
            X.1Vw r0 = r2.A11     // Catch:{ all -> 0x0105 }
            r1.A00(r2, r0)     // Catch:{ all -> 0x0105 }
            X.17I r0 = r11.A02     // Catch:{ all -> 0x0105 }
            r0.A07(r2)     // Catch:{ all -> 0x0105 }
        L_0x00cb:
            java.lang.String r15 = "message_streaming_sidecar"
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r9]     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0105 }
            r1[r14] = r0     // Catch:{ all -> 0x0105 }
            int r0 = r13.A01(r15, r2, r1)     // Catch:{ all -> 0x0105 }
            int r12 = r12 + r0
            goto L_0x009b
        L_0x00dd:
            r17.A00()     // Catch:{ all -> 0x0105 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0105 }
            r1.<init>()     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan deleting rows:"
            r1.append(r0)     // Catch:{ all -> 0x0105 }
            r1.append(r12)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0105 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0105 }
            r3.close()     // Catch:{ all -> 0x010e }
            r17.close()     // Catch:{ all -> 0x0113 }
            r8.close()     // Catch:{ Exception -> 0x0118 }
            int r18 = r18 + -1
            if (r16 == 0) goto L_0x011e
            if (r18 <= 0) goto L_0x011e
            goto L_0x0056
        L_0x0105:
            r0 = move-exception
            goto L_0x010a
        L_0x0107:
            r0 = move-exception
            if (r3 == 0) goto L_0x010d
        L_0x010a:
            r3.close()     // Catch:{ all -> 0x010d }
        L_0x010d:
            throw r0     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0112 }
        L_0x0112:
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x0113:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0117 }
        L_0x0117:
            throw r0     // Catch:{ Exception -> 0x0118 }
        L_0x0118:
            r1 = move-exception
            java.lang.String r0 = "SidecarMessageStore/deleteStreamingSidecarOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x011e:
            X.1O9 r7 = r5.A04
            X.0t3 r0 = r7.A00
            long r14 = r0.A00()
            r0 = 2678400000(0x9fa52400, double:1.323305426E-314)
            long r14 = r14 - r0
        L_0x012c:
            X.0tq r0 = r7.A04     // Catch:{ Exception -> 0x0216 }
            X.0tf r3 = r0.A02()     // Catch:{ Exception -> 0x0216 }
            X.1cj r13 = r3.A00()     // Catch:{ all -> 0x0211 }
            r6 = 200(0xc8, float:2.8E-43)
            X.0tg r8 = r3.A02     // Catch:{ all -> 0x020c }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x020c }
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x020c }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x020c }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x020c }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "SELECT message_row_id FROM mms_thumbnail_metadata WHERE insert_timestamp < ? LIMIT ?"
            android.database.Cursor r9 = r8.A08(r0, r2)     // Catch:{ all -> 0x020c }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0205 }
            r2.<init>()     // Catch:{ all -> 0x0205 }
            java.lang.String r0 = "message_row_id"
            int r6 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0205 }
        L_0x015c:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0205 }
            if (r0 == 0) goto L_0x016e
            long r0 = r9.getLong(r6)     // Catch:{ all -> 0x0205 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0205 }
            r2.add(r0)     // Catch:{ all -> 0x0205 }
            goto L_0x015c
        L_0x016e:
            r9.close()     // Catch:{ all -> 0x020c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020c }
            r1.<init>()     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan num messages to update:"
            r1.append(r0)     // Catch:{ all -> 0x020c }
            int r0 = r2.size()     // Catch:{ all -> 0x020c }
            r1.append(r0)     // Catch:{ all -> 0x020c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x020c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x020c }
            int r0 = r2.size()     // Catch:{ all -> 0x020c }
            r12 = 0
            if (r0 <= 0) goto L_0x0191
            r12 = 1
        L_0x0191:
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x020c }
            r6 = 0
        L_0x0196:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x020c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x020c }
            long r0 = r0.longValue()     // Catch:{ all -> 0x020c }
            X.0th r2 = r7.A01     // Catch:{ all -> 0x020c }
            X.0tZ r10 = r2.A00(r0)     // Catch:{ all -> 0x020c }
            if (r10 == 0) goto L_0x01cd
            X.17R r9 = r7.A03     // Catch:{ all -> 0x020c }
            X.1Vw r2 = r10.A11     // Catch:{ all -> 0x020c }
            X.0rv r2 = r2.A00     // Catch:{ all -> 0x020c }
            java.util.Map r9 = r9.A03     // Catch:{ all -> 0x020c }
            java.lang.Object r2 = r9.get(r2)     // Catch:{ all -> 0x020c }
            if (r2 != 0) goto L_0x0196
            r2 = 0
            java.lang.Object r2 = r9.get(r2)     // Catch:{ all -> 0x020c }
            if (r2 != 0) goto L_0x0196
            r2 = 0
            r10.A0h(r2)     // Catch:{ all -> 0x020c }
            X.0t6 r9 = r7.A02     // Catch:{ all -> 0x020c }
            r2 = -1
            r9.A0y(r10, r2)     // Catch:{ all -> 0x020c }
        L_0x01cd:
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x020c }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x020c }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x020c }
            java.lang.String r1 = "mms_thumbnail_metadata"
            java.lang.String r0 = "message_row_id = ?"
            int r0 = r8.A01(r1, r0, r2)     // Catch:{ all -> 0x020c }
            int r6 = r6 + r0
            goto L_0x0196
        L_0x01e1:
            r13.A00()     // Catch:{ all -> 0x020c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020c }
            r1.<init>()     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan deleting rows:"
            r1.append(r0)     // Catch:{ all -> 0x020c }
            r1.append(r6)     // Catch:{ all -> 0x020c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x020c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x020c }
            if (r6 != 0) goto L_0x01fb
            r12 = 0
        L_0x01fb:
            r13.close()     // Catch:{ all -> 0x0211 }
            r3.close()     // Catch:{ Exception -> 0x0216 }
            if (r12 == 0) goto L_0x021c
            goto L_0x012c
        L_0x0205:
            r0 = move-exception
            if (r9 == 0) goto L_0x020b
            r9.close()     // Catch:{ all -> 0x020b }
        L_0x020b:
            throw r0     // Catch:{ all -> 0x020c }
        L_0x020c:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0210 }
        L_0x0210:
            throw r0     // Catch:{ all -> 0x0211 }
        L_0x0211:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0215 }
        L_0x0215:
            throw r0     // Catch:{ Exception -> 0x0216 }
        L_0x0216:
            r1 = move-exception
            java.lang.String r0 = "MmsThumbnailMetadataDeletionManager/deleteMmsThumbnailMetadataOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x021c:
            X.1O8 r10 = r5.A01
            X.0tq r0 = r10.A02     // Catch:{ Exception -> 0x0289 }
            X.0tf r8 = r0.A02()     // Catch:{ Exception -> 0x0289 }
            X.0tg r12 = r8.A02     // Catch:{ all -> 0x0284 }
            java.lang.String r13 = "conversion_tuples"
            r0 = 6
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "jid_row_id"
            r9 = 0
            r14[r9] = r0     // Catch:{ all -> 0x0284 }
            r1 = 1
            java.lang.String r0 = "data"
            r14[r1] = r0     // Catch:{ all -> 0x0284 }
            r1 = 2
            java.lang.String r0 = "source"
            r14[r1] = r0     // Catch:{ all -> 0x0284 }
            r1 = 3
            java.lang.String r0 = "biz_count"
            r14[r1] = r0     // Catch:{ all -> 0x0284 }
            r1 = 4
            java.lang.String r0 = "has_user_sent_last_message"
            r14[r1] = r0     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "last_interaction"
            r3 = 5
            r14[r3] = r0     // Catch:{ all -> 0x0284 }
            r15 = 0
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ all -> 0x0284 }
            r18 = r15
            r19 = r15
            r16 = r0
            r17 = r15
            android.database.Cursor r11 = r12.A09(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0284 }
        L_0x0259:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x027d }
            if (r0 == 0) goto L_0x0276
            long r0 = r11.getLong(r3)     // Catch:{ all -> 0x027d }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x027d }
            long r6 = r6 - r0
            long r1 = X.AnonymousClass2IP.A06     // Catch:{ all -> 0x027d }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0259
            int r0 = r11.getInt(r9)     // Catch:{ all -> 0x027d }
            r10.A00(r12, r0)     // Catch:{ all -> 0x027d }
            goto L_0x0259
        L_0x0276:
            r11.close()     // Catch:{ all -> 0x0284 }
            r8.close()     // Catch:{ Exception -> 0x0289 }
            goto L_0x028f
        L_0x027d:
            r0 = move-exception
            if (r11 == 0) goto L_0x0283
            r11.close()     // Catch:{ all -> 0x0283 }
        L_0x0283:
            throw r0     // Catch:{ all -> 0x0284 }
        L_0x0284:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0288 }
        L_0x0288:
            throw r0     // Catch:{ Exception -> 0x0289 }
        L_0x0289:
            r1 = move-exception
            java.lang.String r0 = "conversionTupleMessageStore/getConversionTuple error accessing db"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x028f:
            X.15G r8 = r5.A09
            java.lang.String r0 = "MessageAddOnManager/deleteOldOrphanedMessageAddOns"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0t3 r0 = r8.A03
            long r6 = r0.A00()
            int r0 = r8.A00
            long r2 = (long) r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            long r6 = r6 - r2
            X.1QN r0 = r8.A0D
            X.0tq r0 = r0.A03
            X.0tf r8 = r0.A02()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x02f6 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x02f6 }
            r3[r1] = r0     // Catch:{ all -> 0x02f6 }
            java.lang.String r2 = "message_add_on_orphan.timestamp < ?"
            X.0tg r1 = r8.A02     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "message_add_on_orphan"
            r1.A01(r0, r2, r3)     // Catch:{ all -> 0x02f6 }
            r8.close()
            X.11K r0 = r5.A02
            r0.A00()
            X.192 r5 = r5.A06
            long r2 = r4.A00()
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r2 = r2 - r0
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0 = 0
            r4[r0] = r1
            X.0tq r0 = r5.A01
            X.0tf r3 = r0.A02()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x02f1 }
            java.lang.String r1 = "group_past_participant_user"
            java.lang.String r0 = "timestamp < ? "
            r2.A01(r1, r0, r4)     // Catch:{ all -> 0x02f1 }
            r3.close()
            return
        L_0x02f1:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x02fa }
            throw r0
        L_0x02f6:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x02fa }
        L_0x02fa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OA.APK():void");
    }
}
