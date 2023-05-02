package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.19M  reason: invalid class name */
public class AnonymousClass19M {
    public final AnonymousClass19K A00;

    public AnonymousClass19M(AnonymousClass19K r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x0290 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x0358 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:198:0x03db */
    /* JADX WARNING: Missing exception handler attribute for start block: B:275:0x0555 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:315:0x0622 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:347:0x06bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:380:0x0741 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0126 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01f4 */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x075c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C29861bL A00(android.database.Cursor r10) {
        /*
            X.AnonymousClass00B.A00()
            java.lang.String r0 = "_id"
            int r0 = r10.getColumnIndexOrThrow(r0)
            long r0 = r10.getLong(r0)
            java.lang.String r2 = "message_type"
            int r2 = r10.getColumnIndexOrThrow(r2)
            long r3 = r10.getLong(r2)
            int r2 = (int) r3
            byte r7 = (byte) r2
            java.lang.String r2 = "key_remote_jid"
            int r2 = r10.getColumnIndexOrThrow(r2)
            java.lang.String r4 = r10.getString(r2)
            X.0rv r6 = X.C15830rv.A02(r4)
            if (r6 != 0) goto L_0x004c
            java.lang.String r2 = "peer-messages-store/read-peer-message-from-cursor/invalid remote jid "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r4)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " of msgType: "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x004c:
            java.lang.String r2 = "key_from_me"
            int r2 = r10.getColumnIndexOrThrow(r2)
            int r4 = r10.getInt(r2)
            r5 = 0
            r2 = 1
            r3 = 0
            if (r4 != r2) goto L_0x005c
            r3 = 1
        L_0x005c:
            java.lang.String r2 = "key_id"
            int r2 = r10.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r10.getString(r2)
            X.1Vw r4 = new X.1Vw
            r4.<init>(r6, r2, r3)
            java.lang.String r6 = "timestamp"
            int r2 = r10.getColumnIndexOrThrow(r6)
            long r2 = r10.getLong(r2)
            X.1bL r4 = X.C37461pC.A00(r4, r7, r2)
            X.AnonymousClass00B.A06(r4)
            r4.A13 = r0
            java.lang.String r0 = "device_id"
            int r0 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r10.getString(r0)
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            if (r0 == 0) goto L_0x0091
            r4.A00 = r0
        L_0x0091:
            java.lang.String r0 = "data"
            int r0 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r1 = r10.getString(r0)
            boolean r0 = r4 instanceof X.C37471pD
            if (r0 == 0) goto L_0x012c
            r3 = r4
            X.1pD r3 = (X.C37471pD) r3
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x074c
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0127 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0127 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x0127 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0127 }
            r2.beginObject()     // Catch:{ all -> 0x0122 }
        L_0x00b5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x011a
            java.lang.String r6 = r2.nextName()     // Catch:{ all -> 0x0122 }
            int r1 = r6.hashCode()     // Catch:{ all -> 0x0122 }
            r0 = 569764601(0x21f5eaf9, float:1.6664043E-18)
            if (r1 == r0) goto L_0x00dc
            r0 = 1150097001(0x448d1669, float:1128.7003)
            if (r1 != r0) goto L_0x0100
            java.lang.String r0 = "requestType"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x0100
            int r0 = r2.nextInt()     // Catch:{ all -> 0x0122 }
            r3.A00 = r0     // Catch:{ all -> 0x0122 }
            goto L_0x00b5
        L_0x00dc:
            java.lang.String r0 = "identifierSet"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x0100
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            r2.beginArray()     // Catch:{ all -> 0x0122 }
        L_0x00ec:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0122 }
            r1.add(r0)     // Catch:{ all -> 0x0122 }
            goto L_0x00ec
        L_0x00fa:
            r2.endArray()     // Catch:{ all -> 0x0122 }
            r3.A01 = r1     // Catch:{ all -> 0x0122 }
            goto L_0x00b5
        L_0x0100:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "FMessagePeerDataOperationRequest/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x0122 }
            r1.append(r6)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0122 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0122 }
            goto L_0x00b5
        L_0x011a:
            r2.endObject()     // Catch:{ all -> 0x0122 }
            r2.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x074c
        L_0x0122:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0126 }
        L_0x0126:
            throw r0     // Catch:{ IOException -> 0x0127 }
        L_0x0127:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataOperationRequest/readData failed"
            goto L_0x0749
        L_0x012c:
            boolean r0 = r4 instanceof X.C37491pF
            if (r0 == 0) goto L_0x022e
            r9 = r4
            X.1pF r9 = (X.C37491pF) r9
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x074c
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x01f5 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01f5 }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ IOException -> 0x01f5 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x01f5 }
            r3.beginObject()     // Catch:{ all -> 0x01f0 }
        L_0x0150:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01e9
            java.lang.String r6 = r3.nextName()     // Catch:{ all -> 0x01f0 }
            int r1 = r6.hashCode()     // Catch:{ all -> 0x01f0 }
            r0 = -957719559(0xffffffffc6ea5bf9, float:-29997.986)
            r7 = 2
            if (r1 == r0) goto L_0x01a0
            r0 = -758599065(0xffffffffd2c8b267, float:-4.30993277E11)
            if (r1 == r0) goto L_0x017d
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x01ce
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01ce
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x01f0 }
            r9.A00 = r0     // Catch:{ all -> 0x01f0 }
            goto L_0x0150
        L_0x017d:
            java.lang.String r0 = "requestResults"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01ce
            r3.beginObject()     // Catch:{ all -> 0x01f0 }
        L_0x0188:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01ca
            java.lang.String r1 = r3.nextName()     // Catch:{ all -> 0x01f0 }
            int r0 = r3.nextInt()     // Catch:{ all -> 0x01f0 }
            X.1pH r0 = X.C37511pH.A00(r0)     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x0188
            r2.put(r1, r0)     // Catch:{ all -> 0x01f0 }
            goto L_0x0188
        L_0x01a0:
            java.lang.String r0 = "stickerResults"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01ce
            r3.beginObject()     // Catch:{ all -> 0x01f0 }
        L_0x01ac:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01ca
            java.lang.String r6 = r3.nextName()     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x01f0 }
            byte[] r1 = android.util.Base64.decode(r0, r7)     // Catch:{ all -> 0x01f0 }
            X.1pI r0 = X.C37521pI.A0I     // Catch:{ all -> 0x01f0 }
            X.1Wm r0 = X.C28541Wm.A0E(r0, r1)     // Catch:{ all -> 0x01f0 }
            X.1pI r0 = (X.C37521pI) r0     // Catch:{ all -> 0x01f0 }
            r8.put(r6, r0)     // Catch:{ all -> 0x01f0 }
            goto L_0x01ac
        L_0x01ca:
            r3.endObject()     // Catch:{ all -> 0x01f0 }
            goto L_0x0150
        L_0x01ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f0 }
            r1.<init>()     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x01f0 }
            r1.append(r6)     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01f0 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01f0 }
            goto L_0x0150
        L_0x01e9:
            r3.endObject()     // Catch:{ all -> 0x01f0 }
            r3.close()     // Catch:{ IOException -> 0x01f5 }
            goto L_0x01fb
        L_0x01f0:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01f4 }
        L_0x01f4:
            throw r0     // Catch:{ IOException -> 0x01f5 }
        L_0x01f5:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/readData failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01fb:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0203:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x074c
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            java.util.Map r3 = r9.A00
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r8.containsKey(r6)
            if (r0 == 0) goto L_0x022c
            java.lang.Object r1 = r8.get(r6)
        L_0x0223:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r3.put(r6, r0)
            goto L_0x0203
        L_0x022c:
            r1 = 0
            goto L_0x0223
        L_0x022e:
            boolean r0 = r4 instanceof X.C37531pJ
            if (r0 == 0) goto L_0x0291
            r6 = r4
            X.1pG r6 = (X.C37501pG) r6
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x074c
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0746 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0746 }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ IOException -> 0x0746 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0746 }
            r3.beginObject()     // Catch:{ all -> 0x028c }
        L_0x0248:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0284
            java.lang.String r2 = r3.nextName()     // Catch:{ all -> 0x028c }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x028c }
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x026a
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x026a
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x028c }
            r6.A00 = r0     // Catch:{ all -> 0x028c }
            goto L_0x0248
        L_0x026a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x028c }
            r1.<init>()     // Catch:{ all -> 0x028c }
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x028c }
            r1.append(r2)     // Catch:{ all -> 0x028c }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x028c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x028c }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x028c }
            goto L_0x0248
        L_0x0284:
            r3.endObject()     // Catch:{ all -> 0x028c }
            r3.close()     // Catch:{ IOException -> 0x0746 }
            goto L_0x074c
        L_0x028c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0290 }
        L_0x0290:
            throw r0     // Catch:{ IOException -> 0x0746 }
        L_0x0291:
            boolean r0 = r4 instanceof X.C37541pK
            if (r0 == 0) goto L_0x0392
            r9 = r4
            X.1pK r9 = (X.C37541pK) r9
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x074c
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0359 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0359 }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ IOException -> 0x0359 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0359 }
            r3.beginObject()     // Catch:{ all -> 0x0354 }
        L_0x02b5:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x034d
            java.lang.String r6 = r3.nextName()     // Catch:{ all -> 0x0354 }
            int r1 = r6.hashCode()     // Catch:{ all -> 0x0354 }
            r0 = -1808687704(0xffffffff94319da8, float:-8.9673085E-27)
            r7 = 2
            if (r1 == r0) goto L_0x0305
            r0 = -758599065(0xffffffffd2c8b267, float:-4.30993277E11)
            if (r1 == r0) goto L_0x02e2
            r0 = -392662625(0xffffffffe898719f, float:-5.759165E24)
            if (r1 != r0) goto L_0x0332
            java.lang.String r0 = "requestStanzaId"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x0332
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x0354 }
            r9.A00 = r0     // Catch:{ all -> 0x0354 }
            goto L_0x02b5
        L_0x02e2:
            java.lang.String r0 = "requestResults"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x0332
            r3.beginObject()     // Catch:{ all -> 0x0354 }
        L_0x02ed:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x032e
            java.lang.String r1 = r3.nextName()     // Catch:{ all -> 0x0354 }
            int r0 = r3.nextInt()     // Catch:{ all -> 0x0354 }
            X.1pH r0 = X.C37511pH.A00(r0)     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x02ed
            r2.put(r1, r0)     // Catch:{ all -> 0x0354 }
            goto L_0x02ed
        L_0x0305:
            java.lang.String r0 = "linkPreviewResults"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x0332
            r3.beginObject()     // Catch:{ all -> 0x0354 }
        L_0x0310:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x032e
            java.lang.String r6 = r3.nextName()     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x0354 }
            byte[] r1 = android.util.Base64.decode(r0, r7)     // Catch:{ all -> 0x0354 }
            X.1pL r0 = X.C37551pL.A08     // Catch:{ all -> 0x0354 }
            X.1Wm r0 = X.C28541Wm.A0E(r0, r1)     // Catch:{ all -> 0x0354 }
            X.1pL r0 = (X.C37551pL) r0     // Catch:{ all -> 0x0354 }
            r8.put(r6, r0)     // Catch:{ all -> 0x0354 }
            goto L_0x0310
        L_0x032e:
            r3.endObject()     // Catch:{ all -> 0x0354 }
            goto L_0x02b5
        L_0x0332:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0354 }
            r1.<init>()     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x0354 }
            r1.append(r6)     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0354 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0354 }
            goto L_0x02b5
        L_0x034d:
            r3.endObject()     // Catch:{ all -> 0x0354 }
            r3.close()     // Catch:{ IOException -> 0x0359 }
            goto L_0x035f
        L_0x0354:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0358 }
        L_0x0358:
            throw r0     // Catch:{ IOException -> 0x0359 }
        L_0x0359:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/readData failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x035f:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0367:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x074c
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            java.util.Map r3 = r9.A00
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r8.containsKey(r6)
            if (r0 == 0) goto L_0x0390
            java.lang.Object r1 = r8.get(r6)
        L_0x0387:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r3.put(r6, r0)
            goto L_0x0367
        L_0x0390:
            r1 = 0
            goto L_0x0387
        L_0x0392:
            boolean r0 = r4 instanceof X.C37561pM
            if (r0 == 0) goto L_0x03e1
            r6 = r4
            X.1pM r6 = (X.C37561pM) r6
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x074c
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x03dc }
            r0.<init>(r1)     // Catch:{ IOException -> 0x03dc }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ IOException -> 0x03dc }
            r3.<init>(r0)     // Catch:{ IOException -> 0x03dc }
            r3.beginObject()     // Catch:{ all -> 0x03d7 }
        L_0x03ac:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x03cf
            java.lang.String r2 = r3.nextName()     // Catch:{ all -> 0x03d7 }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x03d7 }
            r0 = 1518553996(0x5a834b8c, float:1.84781433E16)
            if (r1 != r0) goto L_0x03ac
            java.lang.String r0 = "security_notification_enabled"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x03ac
            boolean r0 = r3.nextBoolean()     // Catch:{ all -> 0x03d7 }
            r6.A00 = r0     // Catch:{ all -> 0x03d7 }
            goto L_0x03ac
        L_0x03cf:
            r3.endObject()     // Catch:{ all -> 0x03d7 }
            r3.close()     // Catch:{ IOException -> 0x03dc }
            goto L_0x074c
        L_0x03d7:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x03db }
        L_0x03db:
            throw r0     // Catch:{ IOException -> 0x03dc }
        L_0x03dc:
            r1 = move-exception
            java.lang.String r0 = "FMessageInitialSecurityNotificationSettingSync/readData failed"
            goto L_0x0749
        L_0x03e1:
            boolean r0 = r4 instanceof X.C29871bM
            if (r0 == 0) goto L_0x055b
            r3 = r4
            X.1bM r3 = (X.C29871bM) r3
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x074c
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0556 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0556 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x0556 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0556 }
            r2.beginObject()     // Catch:{ all -> 0x0551 }
        L_0x03fb:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x0549
            java.lang.String r1 = r2.nextName()     // Catch:{ all -> 0x0551 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0551 }
            r6 = 2
            switch(r0) {
                case -1906067869: goto L_0x0539;
                case -1641051461: goto L_0x0529;
                case -1001078227: goto L_0x0519;
                case -945994952: goto L_0x0509;
                case -339500935: goto L_0x04f9;
                case -50870532: goto L_0x04e9;
                case 494573150: goto L_0x04d8;
                case 500641162: goto L_0x04c4;
                case 990743644: goto L_0x04b4;
                case 1098377542: goto L_0x04a3;
                case 1120684249: goto L_0x0493;
                case 1190721806: goto L_0x0483;
                case 1661853540: goto L_0x0472;
                case 1836211977: goto L_0x0463;
                case 1894532689: goto L_0x0454;
                case 1939495049: goto L_0x0445;
                case 2011285592: goto L_0x0436;
                case 2104347627: goto L_0x0427;
                default: goto L_0x040d;
            }     // Catch:{ all -> 0x0551 }
        L_0x040d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0551 }
            r6.<init>()     // Catch:{ all -> 0x0551 }
            java.lang.String r0 = "FMessageHistorySyncNotification/readData/unexpected name \""
            r6.append(r0)     // Catch:{ all -> 0x0551 }
            r6.append(r1)     // Catch:{ all -> 0x0551 }
            java.lang.String r0 = "\""
            r6.append(r0)     // Catch:{ all -> 0x0551 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0551 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0427:
            java.lang.String r0 = "chats_count"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            long r0 = r2.nextLong()     // Catch:{ all -> 0x0551 }
            r3.A04 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0436:
            java.lang.String r0 = "reg_attempt_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0551 }
            r3.A0F = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0445:
            java.lang.String r0 = "media_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0551 }
            r3.A0D = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0454:
            java.lang.String r0 = "latest_msg_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            long r0 = r2.nextLong()     // Catch:{ all -> 0x0551 }
            r3.A06 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0463:
            java.lang.String r0 = "file_length"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            long r0 = r2.nextLong()     // Catch:{ all -> 0x0551 }
            r3.A05 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0472:
            java.lang.String r0 = "session_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0551 }
            r3.A0G = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0483:
            java.lang.String r0 = "enc_media_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0551 }
            r3.A0C = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0493:
            java.lang.String r0 = "oldest_msg_id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            long r0 = r2.nextLong()     // Catch:{ all -> 0x0551 }
            r3.A08 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x04a3:
            java.lang.String r0 = "retries"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            int r0 = r2.nextInt()     // Catch:{ all -> 0x0551 }
            r3.A02 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x04b4:
            java.lang.String r0 = "messages_count"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            long r0 = r2.nextLong()     // Catch:{ all -> 0x0551 }
            r3.A07 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x04c4:
            java.lang.String r0 = "key_data"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0551 }
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch:{ all -> 0x0551 }
            r3.A0H = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x04d8:
            java.lang.String r0 = "sync_type"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            int r0 = r2.nextInt()     // Catch:{ all -> 0x0551 }
            r3.A03 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x04e9:
            java.lang.String r0 = "chunk_order"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            int r0 = r2.nextInt()     // Catch:{ all -> 0x0551 }
            r3.A00 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x04f9:
            java.lang.String r0 = "oldest_msg_id_to_sync"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            long r0 = r2.nextLong()     // Catch:{ all -> 0x0551 }
            r3.A09 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0509:
            java.lang.String r0 = "oldest_msg_to_sync_timestamp"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            long r0 = r2.nextLong()     // Catch:{ all -> 0x0551 }
            r3.A0A = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0519:
            java.lang.String r0 = "progress"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            int r0 = r2.nextInt()     // Catch:{ all -> 0x0551 }
            r3.A01 = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0529:
            java.lang.String r0 = "direct_path"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0551 }
            r3.A0B = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0539:
            java.lang.String r0 = "original-msg-id"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x040d
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0551 }
            r3.A0E = r0     // Catch:{ all -> 0x0551 }
            goto L_0x03fb
        L_0x0549:
            r2.endObject()     // Catch:{ all -> 0x0551 }
            r2.close()     // Catch:{ IOException -> 0x0556 }
            goto L_0x074c
        L_0x0551:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0555 }
        L_0x0555:
            throw r0     // Catch:{ IOException -> 0x0556 }
        L_0x0556:
            r1 = move-exception
            java.lang.String r0 = "FMessageHistorySyncNotification/readData failed"
            goto L_0x0749
        L_0x055b:
            boolean r0 = r4 instanceof X.C37571pN
            if (r0 == 0) goto L_0x0628
            r3 = r4
            X.1pN r3 = (X.C37571pN) r3
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x074c
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ 1X9 | IOException -> 0x0623 }
            r0.<init>(r1)     // Catch:{ 1X9 | IOException -> 0x0623 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ 1X9 | IOException -> 0x0623 }
            r2.<init>(r0)     // Catch:{ 1X9 | IOException -> 0x0623 }
            r2.beginObject()     // Catch:{ all -> 0x061e }
        L_0x0575:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x061e }
            if (r0 == 0) goto L_0x0616
            java.lang.String r7 = r2.nextName()     // Catch:{ all -> 0x061e }
            int r1 = r7.hashCode()     // Catch:{ all -> 0x061e }
            r0 = -1807872114(0xffffffff943e0f8e, float:-9.595616E-27)
            r6 = 2
            if (r1 == r0) goto L_0x05df
            r0 = 3288564(0x322df4, float:4.60826E-39)
            if (r1 == r0) goto L_0x05a2
            r0 = 1970709011(0x7576a213, float:3.126446E32)
            if (r1 != r0) goto L_0x05fb
            java.lang.String r0 = "isNewlyGeneratedKey"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x061e }
            if (r0 == 0) goto L_0x05fb
            boolean r0 = r2.nextBoolean()     // Catch:{ all -> 0x061e }
            r3.A01 = r0     // Catch:{ all -> 0x061e }
            goto L_0x0575
        L_0x05a2:
            java.lang.String r0 = "keys"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x061e }
            if (r0 == 0) goto L_0x05fb
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x061e }
            r7.<init>()     // Catch:{ all -> 0x061e }
            r2.beginArray()     // Catch:{ all -> 0x061e }
        L_0x05b2:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x061e }
            if (r0 == 0) goto L_0x05d8
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x061e }
            byte[] r1 = android.util.Base64.decode(r0, r6)     // Catch:{ all -> 0x061e }
            X.1pO r0 = X.C37581pO.A03     // Catch:{ all -> 0x061e }
            X.1Wm r0 = X.C28541Wm.A0E(r0, r1)     // Catch:{ all -> 0x061e }
            X.1pO r0 = (X.C37581pO) r0     // Catch:{ all -> 0x061e }
            android.util.Pair r0 = X.AnonymousClass1WY.A00(r0)     // Catch:{ all -> 0x061e }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x061e }
            X.1WK r1 = (X.AnonymousClass1WK) r1     // Catch:{ all -> 0x061e }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x061e }
            X.1WY r0 = (X.AnonymousClass1WY) r0     // Catch:{ all -> 0x061e }
            r7.put(r1, r0)     // Catch:{ all -> 0x061e }
            goto L_0x05b2
        L_0x05d8:
            r2.endArray()     // Catch:{ all -> 0x061e }
            r3.A13(r7)     // Catch:{ all -> 0x061e }
            goto L_0x0575
        L_0x05df:
            java.lang.String r0 = "appStateSyncKeyShareProtoString"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x061e }
            if (r0 == 0) goto L_0x05fb
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x061e }
            byte[] r1 = android.util.Base64.decode(r0, r6)     // Catch:{ all -> 0x061e }
            X.1pP r0 = X.C37591pP.A01     // Catch:{ all -> 0x061e }
            X.1Wm r0 = X.C28541Wm.A0E(r0, r1)     // Catch:{ all -> 0x061e }
            X.1pP r0 = (X.C37591pP) r0     // Catch:{ all -> 0x061e }
            r3.A00 = r0     // Catch:{ all -> 0x061e }
            goto L_0x0575
        L_0x05fb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x061e }
            r1.<init>()     // Catch:{ all -> 0x061e }
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x061e }
            r1.append(r7)     // Catch:{ all -> 0x061e }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x061e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x061e }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x061e }
            goto L_0x0575
        L_0x0616:
            r2.endObject()     // Catch:{ all -> 0x061e }
            r2.close()     // Catch:{ 1X9 | IOException -> 0x0623 }
            goto L_0x074c
        L_0x061e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0622 }
        L_0x0622:
            throw r0     // Catch:{ 1X9 | IOException -> 0x0623 }
        L_0x0623:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/readData failed"
            goto L_0x0749
        L_0x0628:
            boolean r0 = r4 instanceof X.C37601pQ
            if (r0 == 0) goto L_0x06c2
            r0 = r4
            X.1pQ r0 = (X.C37601pQ) r0
            java.util.Set r6 = r0.A00
            r6.clear()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x074c
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x06bd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x06bd }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ IOException -> 0x06bd }
            r3.<init>(r0)     // Catch:{ IOException -> 0x06bd }
            r3.beginObject()     // Catch:{ all -> 0x06b8 }
        L_0x0647:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x06b8 }
            if (r0 == 0) goto L_0x06b0
            java.lang.String r2 = r3.nextName()     // Catch:{ all -> 0x06b8 }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x06b8 }
            r0 = -816618934(0xffffffffcf53624a, float:-3.54643405E9)
            if (r1 != r0) goto L_0x0696
            java.lang.String r0 = "key-ids"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x06b8 }
            if (r0 == 0) goto L_0x0696
            r3.beginArray()     // Catch:{ all -> 0x06b8 }
        L_0x0665:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x06b8 }
            if (r0 == 0) goto L_0x0692
            java.lang.String r1 = r3.nextString()     // Catch:{ all -> 0x06b8 }
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x06b8 }
            X.1pR r0 = X.C37611pR.A02     // Catch:{ all -> 0x06b8 }
            X.1Wm r2 = X.C28541Wm.A0E(r0, r1)     // Catch:{ all -> 0x06b8 }
            X.1pR r2 = (X.C37611pR) r2     // Catch:{ all -> 0x06b8 }
            int r0 = r2.A00     // Catch:{ all -> 0x06b8 }
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0665
            X.1Ww r0 = r2.A01     // Catch:{ all -> 0x06b8 }
            byte[] r1 = r0.A04()     // Catch:{ all -> 0x06b8 }
            X.1WK r0 = new X.1WK     // Catch:{ all -> 0x06b8 }
            r0.<init>(r1)     // Catch:{ all -> 0x06b8 }
            r6.add(r0)     // Catch:{ all -> 0x06b8 }
            goto L_0x0665
        L_0x0692:
            r3.endArray()     // Catch:{ all -> 0x06b8 }
            goto L_0x0647
        L_0x0696:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b8 }
            r1.<init>()     // Catch:{ all -> 0x06b8 }
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x06b8 }
            r1.append(r2)     // Catch:{ all -> 0x06b8 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x06b8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06b8 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x06b8 }
            goto L_0x0647
        L_0x06b0:
            r3.endObject()     // Catch:{ all -> 0x06b8 }
            r3.close()     // Catch:{ IOException -> 0x06bd }
            goto L_0x074c
        L_0x06b8:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x06bc }
        L_0x06bc:
            throw r0     // Catch:{ IOException -> 0x06bd }
        L_0x06bd:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/readData failed"
            goto L_0x0749
        L_0x06c2:
            r3 = r4
            X.1pS r3 = (X.C37621pS) r3
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x074c
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0742 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0742 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x0742 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0742 }
            r2.beginObject()     // Catch:{ all -> 0x073d }
        L_0x06d8:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x073d }
            if (r0 == 0) goto L_0x0736
            java.lang.String r7 = r2.nextName()     // Catch:{ all -> 0x073d }
            int r1 = r7.hashCode()     // Catch:{ all -> 0x073d }
            r0 = -1490290073(0xffffffffa72bfa67, float:-2.386676E-15)
            if (r1 == r0) goto L_0x06fd
            r0 = 55126294(0x3492916, float:5.9115755E-37)
            if (r1 != r0) goto L_0x071c
            boolean r0 = r7.equals(r6)     // Catch:{ all -> 0x073d }
            if (r0 == 0) goto L_0x071c
            long r0 = r2.nextLong()     // Catch:{ all -> 0x073d }
            r3.A00 = r0     // Catch:{ all -> 0x073d }
            goto L_0x06d8
        L_0x06fd:
            java.lang.String r0 = "collection_names"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x073d }
            if (r0 == 0) goto L_0x071c
            r2.beginArray()     // Catch:{ all -> 0x073d }
        L_0x0708:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x073d }
            if (r0 == 0) goto L_0x0718
            java.util.Set r1 = r3.A01     // Catch:{ all -> 0x073d }
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x073d }
            r1.add(r0)     // Catch:{ all -> 0x073d }
            goto L_0x0708
        L_0x0718:
            r2.endArray()     // Catch:{ all -> 0x073d }
            goto L_0x06d8
        L_0x071c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x073d }
            r1.<init>()     // Catch:{ all -> 0x073d }
            java.lang.String r0 = "FMessageAppStateFatalExceptionNotification/readData/unexpected name \""
            r1.append(r0)     // Catch:{ all -> 0x073d }
            r1.append(r7)     // Catch:{ all -> 0x073d }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x073d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x073d }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x073d }
            goto L_0x06d8
        L_0x0736:
            r2.endObject()     // Catch:{ all -> 0x073d }
            r2.close()     // Catch:{ IOException -> 0x0742 }
            goto L_0x074c
        L_0x073d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0741 }
        L_0x0741:
            throw r0     // Catch:{ IOException -> 0x0742 }
        L_0x0742:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateFatalExceptionNotification/readData failed"
            goto L_0x0749
        L_0x0746:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/readData failed"
        L_0x0749:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x074c:
            java.lang.String r0 = "acked"
            int r0 = r10.getColumnIndexOrThrow(r0)
            long r6 = r10.getLong(r0)
            r1 = 1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x075d
            r5 = 1
        L_0x075d:
            r4.A01 = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19M.A00(android.database.Cursor):X.1bL");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0295 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x03cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0417 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:187:0x046e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:211:0x04c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x016c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x019b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x0261 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:206:0x04bc=Splitter:B:206:0x04bc, B:217:0x04cd=Splitter:B:217:0x04cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(X.C29861bL r14) {
        /*
            r13 = this;
            X.AnonymousClass00B.A00()
            X.19K r0 = r13.A00
            X.0tf r9 = r0.A02()
            X.0tg r1 = r9.A02     // Catch:{ all -> 0x04ea }
            java.lang.String r0 = "INSERT INTO peer_messages (message_type,key_remote_jid,key_from_me, key_id, timestamp, device_id, data, acked) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            X.1ou r5 = r1.A0A(r0)     // Catch:{ all -> 0x04ea }
            android.database.sqlite.SQLiteStatement r10 = r5.A00     // Catch:{ all -> 0x04ea }
            r10.clearBindings()     // Catch:{ all -> 0x04ea }
            r2 = 1
            byte r0 = r14.A10     // Catch:{ all -> 0x04ea }
            long r0 = (long) r0     // Catch:{ all -> 0x04ea }
            r5.A01(r2, r0)     // Catch:{ all -> 0x04ea }
            r1 = 2
            X.1Vw r3 = r14.A11     // Catch:{ all -> 0x04ea }
            X.0rv r0 = r3.A00     // Catch:{ all -> 0x04ea }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x04ea }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x04ea }
            r5.A02(r1, r0)     // Catch:{ all -> 0x04ea }
            r2 = 3
            boolean r0 = r3.A02     // Catch:{ all -> 0x04ea }
            r6 = 0
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0038
        L_0x0036:
            r0 = 0
        L_0x0038:
            r5.A01(r2, r0)     // Catch:{ all -> 0x04ea }
            r1 = 4
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x04ea }
            r5.A02(r1, r0)     // Catch:{ all -> 0x04ea }
            r2 = 5
            long r0 = r14.A0I     // Catch:{ all -> 0x04ea }
            r5.A01(r2, r0)     // Catch:{ all -> 0x04ea }
            com.whatsapp.jid.DeviceJid r0 = r14.A00     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x0053
            r1 = 6
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x04ea }
            r5.A02(r1, r0)     // Catch:{ all -> 0x04ea }
        L_0x0053:
            r8 = 7
            boolean r0 = r14 instanceof X.C37471pD     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x00ab
            r3 = r14
            X.1pD r3 = (X.C37471pD) r3     // Catch:{ all -> 0x04ea }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x04ea }
            r4.<init>()     // Catch:{ all -> 0x04ea }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x00a6 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x00a6 }
            r2.beginObject()     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "requestType"
            android.util.JsonWriter r11 = r2.name(r0)     // Catch:{ all -> 0x00a1 }
            int r0 = r3.A00     // Catch:{ all -> 0x00a1 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a1 }
            r11.value(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "identifierSet"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x00a1 }
            r0.beginArray()     // Catch:{ all -> 0x00a1 }
            java.util.Set r0 = r3.A01     // Catch:{ all -> 0x00a1 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00a1 }
        L_0x0083:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00a1 }
            r2.value(r0)     // Catch:{ all -> 0x00a1 }
            goto L_0x0083
        L_0x0093:
            r2.endArray()     // Catch:{ all -> 0x00a1 }
            r2.endObject()     // Catch:{ all -> 0x00a1 }
            r2.flush()     // Catch:{ all -> 0x00a1 }
            r2.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x04bc
        L_0x00a1:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            throw r0     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataOperationRequest/writeData failed"
            goto L_0x04cd
        L_0x00ab:
            boolean r0 = r14 instanceof X.C37491pF     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x016d
            r11 = r14
            X.1pF r11 = (X.C37491pF) r11     // Catch:{ all -> 0x04ea }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x04ea }
            r4.<init>()     // Catch:{ all -> 0x04ea }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x04ca }
            r2.<init>(r4)     // Catch:{ IOException -> 0x04ca }
            r2.beginObject()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = r11.A00     // Catch:{ all -> 0x0168 }
            r1.value(r0)     // Catch:{ all -> 0x0168 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0168 }
            r3.<init>()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "stickerResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0168 }
            r0.beginObject()     // Catch:{ all -> 0x0168 }
            java.util.Map r0 = r11.A00     // Catch:{ all -> 0x0168 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0168 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0168 }
        L_0x00e3:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0124
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0168 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0168 }
            java.lang.Object r1 = r11.getKey()     // Catch:{ all -> 0x0168 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0168 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x0168 }
            X.1pH r0 = (X.C37511pH) r0     // Catch:{ all -> 0x0168 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0168 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0168 }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x0168 }
            X.1pI r1 = (X.C37521pI) r1     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x00e3
            java.lang.Object r0 = r11.getKey()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0168 }
            r2.name(r0)     // Catch:{ all -> 0x0168 }
            byte[] r1 = r1.A02()     // Catch:{ all -> 0x0168 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0168 }
            r2.value(r0)     // Catch:{ all -> 0x0168 }
            goto L_0x00e3
        L_0x0124:
            r2.endObject()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "requestResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0168 }
            r0.beginObject()     // Catch:{ all -> 0x0168 }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x0168 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0168 }
        L_0x0138:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x015a
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0168 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0168 }
            r2.name(r0)     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0168 }
            X.1pH r0 = (X.C37511pH) r0     // Catch:{ all -> 0x0168 }
            int r0 = r0.value     // Catch:{ all -> 0x0168 }
            long r0 = (long) r0     // Catch:{ all -> 0x0168 }
            r2.value(r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0138
        L_0x015a:
            r2.endObject()     // Catch:{ all -> 0x0168 }
            r2.endObject()     // Catch:{ all -> 0x0168 }
            r2.flush()     // Catch:{ all -> 0x0168 }
            r2.close()     // Catch:{ IOException -> 0x04ca }
            goto L_0x04bc
        L_0x0168:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x016c }
        L_0x016c:
            throw r0     // Catch:{ IOException -> 0x04ca }
        L_0x016d:
            boolean r0 = r14 instanceof X.C37531pJ     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x01a1
            r4 = r14
            X.1pG r4 = (X.C37501pG) r4     // Catch:{ all -> 0x04ea }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ all -> 0x04ea }
            r3.<init>()     // Catch:{ all -> 0x04ea }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x019c }
            r2.<init>(r3)     // Catch:{ IOException -> 0x019c }
            r2.beginObject()     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x0197 }
            r1.value(r0)     // Catch:{ all -> 0x0197 }
            r2.endObject()     // Catch:{ all -> 0x0197 }
            r2.flush()     // Catch:{ all -> 0x0197 }
            r2.close()     // Catch:{ IOException -> 0x019c }
            goto L_0x04d2
        L_0x0197:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x019b }
        L_0x019b:
            throw r0     // Catch:{ IOException -> 0x019c }
        L_0x019c:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataRequestUnknownResponse/writeData failed"
            goto L_0x04cd
        L_0x01a1:
            boolean r0 = r14 instanceof X.C37541pK     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x0267
            r11 = r14
            X.1pK r11 = (X.C37541pK) r11     // Catch:{ all -> 0x04ea }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x04ea }
            r4.<init>()     // Catch:{ all -> 0x04ea }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0262 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0262 }
            r2.beginObject()     // Catch:{ all -> 0x025d }
            java.lang.String r0 = "requestStanzaId"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x025d }
            java.lang.String r0 = r11.A00     // Catch:{ all -> 0x025d }
            r1.value(r0)     // Catch:{ all -> 0x025d }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x025d }
            r3.<init>()     // Catch:{ all -> 0x025d }
            java.lang.String r0 = "linkPreviewResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x025d }
            r0.beginObject()     // Catch:{ all -> 0x025d }
            java.util.Map r0 = r11.A00     // Catch:{ all -> 0x025d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x025d }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x025d }
        L_0x01d8:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x0219
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x025d }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x025d }
            java.lang.Object r1 = r11.getKey()     // Catch:{ all -> 0x025d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x025d }
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x025d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x025d }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x025d }
            X.1pH r0 = (X.C37511pH) r0     // Catch:{ all -> 0x025d }
            r3.put(r1, r0)     // Catch:{ all -> 0x025d }
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x025d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x025d }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x025d }
            X.1pL r1 = (X.C37551pL) r1     // Catch:{ all -> 0x025d }
            if (r1 == 0) goto L_0x01d8
            java.lang.Object r0 = r11.getKey()     // Catch:{ all -> 0x025d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x025d }
            r2.name(r0)     // Catch:{ all -> 0x025d }
            byte[] r1 = r1.A02()     // Catch:{ all -> 0x025d }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x025d }
            r2.value(r0)     // Catch:{ all -> 0x025d }
            goto L_0x01d8
        L_0x0219:
            r2.endObject()     // Catch:{ all -> 0x025d }
            java.lang.String r0 = "requestResults"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x025d }
            r0.beginObject()     // Catch:{ all -> 0x025d }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x025d }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x025d }
        L_0x022d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x024f
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x025d }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x025d }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x025d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x025d }
            r2.name(r0)     // Catch:{ all -> 0x025d }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x025d }
            X.1pH r0 = (X.C37511pH) r0     // Catch:{ all -> 0x025d }
            int r0 = r0.value     // Catch:{ all -> 0x025d }
            long r0 = (long) r0     // Catch:{ all -> 0x025d }
            r2.value(r0)     // Catch:{ all -> 0x025d }
            goto L_0x022d
        L_0x024f:
            r2.endObject()     // Catch:{ all -> 0x025d }
            r2.endObject()     // Catch:{ all -> 0x025d }
            r2.flush()     // Catch:{ all -> 0x025d }
            r2.close()     // Catch:{ IOException -> 0x0262 }
            goto L_0x04bc
        L_0x025d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0261 }
        L_0x0261:
            throw r0     // Catch:{ IOException -> 0x0262 }
        L_0x0262:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataLinkPreviewRequestResponse/writeData failed"
            goto L_0x04cd
        L_0x0267:
            boolean r0 = r14 instanceof X.C37561pM     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x029b
            r4 = r14
            X.1pM r4 = (X.C37561pM) r4     // Catch:{ all -> 0x04ea }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ all -> 0x04ea }
            r3.<init>()     // Catch:{ all -> 0x04ea }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0296 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0296 }
            android.util.JsonWriter r1 = r2.beginObject()     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "security_notification_enabled"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ all -> 0x0291 }
            boolean r0 = r4.A00     // Catch:{ all -> 0x0291 }
            android.util.JsonWriter r0 = r1.value(r0)     // Catch:{ all -> 0x0291 }
            r0.endObject()     // Catch:{ all -> 0x0291 }
            r2.close()     // Catch:{ IOException -> 0x0296 }
            goto L_0x04d2
        L_0x0291:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0295 }
        L_0x0295:
            throw r0     // Catch:{ IOException -> 0x0296 }
        L_0x0296:
            r1 = move-exception
            java.lang.String r0 = "FMessageInitialSecurityNotificationSettingSync/writeData failed"
            goto L_0x04cd
        L_0x029b:
            boolean r0 = r14 instanceof X.C29871bM     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x03d2
            r3 = r14
            X.1bM r3 = (X.C29871bM) r3     // Catch:{ all -> 0x04ea }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x04ea }
            r4.<init>()     // Catch:{ all -> 0x04ea }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x03cd }
            r2.<init>(r4)     // Catch:{ IOException -> 0x03cd }
            r2.beginObject()     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x03c8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03c8 }
            if (r0 != 0) goto L_0x02c2
            java.lang.String r0 = "direct_path"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x03c8 }
            r1.value(r0)     // Catch:{ all -> 0x03c8 }
        L_0x02c2:
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x03c8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03c8 }
            if (r0 != 0) goto L_0x02d5
            java.lang.String r0 = "media_hash"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x03c8 }
            r1.value(r0)     // Catch:{ all -> 0x03c8 }
        L_0x02d5:
            java.lang.String r0 = r3.A0C     // Catch:{ all -> 0x03c8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03c8 }
            if (r0 != 0) goto L_0x02e8
            java.lang.String r0 = "enc_media_hash"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = r3.A0C     // Catch:{ all -> 0x03c8 }
            r1.value(r0)     // Catch:{ all -> 0x03c8 }
        L_0x02e8:
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x03c8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03c8 }
            if (r0 != 0) goto L_0x02fb
            java.lang.String r0 = "original-msg-id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x03c8 }
            r1.value(r0)     // Catch:{ all -> 0x03c8 }
        L_0x02fb:
            java.lang.String r0 = r3.A0G     // Catch:{ all -> 0x03c8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03c8 }
            if (r0 != 0) goto L_0x030f
            java.lang.String r0 = "session_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = r3.A0G     // Catch:{ all -> 0x03c8 }
            r1.value(r0)     // Catch:{ all -> 0x03c8 }
        L_0x030f:
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x03c8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03c8 }
            if (r0 != 0) goto L_0x0322
            java.lang.String r0 = "reg_attempt_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x03c8 }
            r1.value(r0)     // Catch:{ all -> 0x03c8 }
        L_0x0322:
            java.lang.String r0 = "file_length"
            android.util.JsonWriter r11 = r2.name(r0)     // Catch:{ all -> 0x03c8 }
            long r0 = r3.A05     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "sync_type"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            int r0 = r3.A03     // Catch:{ all -> 0x03c8 }
            long r0 = (long) r0     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "chunk_order"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            int r0 = r3.A00     // Catch:{ all -> 0x03c8 }
            long r0 = (long) r0     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "progress"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            int r0 = r3.A01     // Catch:{ all -> 0x03c8 }
            long r0 = (long) r0     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "retries"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            int r0 = r3.A02     // Catch:{ all -> 0x03c8 }
            long r0 = (long) r0     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "latest_msg_id"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            long r0 = r3.A06     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "oldest_msg_id"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            long r0 = r3.A08     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "oldest_msg_id_to_sync"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            long r0 = r3.A09     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "chats_count"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            long r0 = r3.A04     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "messages_count"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            long r0 = r3.A07     // Catch:{ all -> 0x03c8 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "oldest_msg_to_sync_timestamp"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ all -> 0x03c8 }
            long r0 = r3.A0A     // Catch:{ all -> 0x03c8 }
            r11.value(r0)     // Catch:{ all -> 0x03c8 }
            byte[] r1 = r3.A0H     // Catch:{ all -> 0x03c8 }
            if (r1 == 0) goto L_0x03bd
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "key_data"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x03c8 }
            r0.value(r1)     // Catch:{ all -> 0x03c8 }
        L_0x03bd:
            r2.endObject()     // Catch:{ all -> 0x03c8 }
            r2.flush()     // Catch:{ all -> 0x03c8 }
            r2.close()     // Catch:{ IOException -> 0x03cd }
            goto L_0x04bc
        L_0x03c8:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x03cc }
        L_0x03cc:
            throw r0     // Catch:{ IOException -> 0x03cd }
        L_0x03cd:
            r1 = move-exception
            java.lang.String r0 = "FMessageHistorySyncNotification/writeData failed"
            goto L_0x04cd
        L_0x03d2:
            boolean r0 = r14 instanceof X.C37571pN     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x041d
            r4 = r14
            X.1pN r4 = (X.C37571pN) r4     // Catch:{ all -> 0x04ea }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ all -> 0x04ea }
            r3.<init>()     // Catch:{ all -> 0x04ea }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0418 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0418 }
            r2.beginObject()     // Catch:{ all -> 0x0413 }
            X.1pP r0 = r4.A00     // Catch:{ all -> 0x0413 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0413 }
            byte[] r1 = r0.A02()     // Catch:{ all -> 0x0413 }
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0413 }
            java.lang.String r0 = "appStateSyncKeyShareProtoString"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0413 }
            r0.value(r1)     // Catch:{ all -> 0x0413 }
            java.lang.String r0 = "isNewlyGeneratedKey"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0413 }
            boolean r0 = r4.A01     // Catch:{ all -> 0x0413 }
            r1.value(r0)     // Catch:{ all -> 0x0413 }
            r2.endObject()     // Catch:{ all -> 0x0413 }
            r2.flush()     // Catch:{ all -> 0x0413 }
            r2.close()     // Catch:{ IOException -> 0x0418 }
            goto L_0x04d2
        L_0x0413:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0417 }
        L_0x0417:
            throw r0     // Catch:{ IOException -> 0x0418 }
        L_0x0418:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyShare/writeData failed"
            goto L_0x04cd
        L_0x041d:
            boolean r0 = r14 instanceof X.C37601pQ     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x0473
            r1 = r14
            X.1pQ r1 = (X.C37601pQ) r1     // Catch:{ all -> 0x04ea }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x04ea }
            r4.<init>()     // Catch:{ all -> 0x04ea }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x046f }
            r2.<init>(r4)     // Catch:{ IOException -> 0x046f }
            r2.beginObject()     // Catch:{ all -> 0x046a }
            java.lang.String r0 = "key-ids"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x046a }
            r0.beginArray()     // Catch:{ all -> 0x046a }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x046a }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x046a }
        L_0x0440:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x046a }
            if (r0 == 0) goto L_0x045d
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x046a }
            X.1WK r0 = (X.AnonymousClass1WK) r0     // Catch:{ all -> 0x046a }
            X.1pR r0 = r0.A02()     // Catch:{ all -> 0x046a }
            byte[] r1 = r0.A02()     // Catch:{ all -> 0x046a }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x046a }
            r2.value(r0)     // Catch:{ all -> 0x046a }
            goto L_0x0440
        L_0x045d:
            r2.endArray()     // Catch:{ all -> 0x046a }
            r2.endObject()     // Catch:{ all -> 0x046a }
            r2.flush()     // Catch:{ all -> 0x046a }
            r2.close()     // Catch:{ IOException -> 0x046f }
            goto L_0x04bc
        L_0x046a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x046e }
        L_0x046e:
            throw r0     // Catch:{ IOException -> 0x046f }
        L_0x046f:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateSyncKeyRequest/writeData failed"
            goto L_0x04cd
        L_0x0473:
            r11 = r14
            X.1pS r11 = (X.C37621pS) r11     // Catch:{ all -> 0x04ea }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x04ea }
            r4.<init>()     // Catch:{ all -> 0x04ea }
            android.util.JsonWriter r3 = new android.util.JsonWriter     // Catch:{ IOException -> 0x04c6 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x04c6 }
            r3.beginObject()     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "collection_names"
            android.util.JsonWriter r0 = r3.name(r0)     // Catch:{ all -> 0x04c1 }
            r0.beginArray()     // Catch:{ all -> 0x04c1 }
            java.util.Set r0 = r11.A01     // Catch:{ all -> 0x04c1 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x04c1 }
        L_0x0492:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x04a4
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04c1 }
            if (r0 == 0) goto L_0x0492
            r3.value(r0)     // Catch:{ all -> 0x04c1 }
            goto L_0x0492
        L_0x04a4:
            r3.endArray()     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "timestamp"
            android.util.JsonWriter r2 = r3.name(r0)     // Catch:{ all -> 0x04c1 }
            long r0 = r11.A00     // Catch:{ all -> 0x04c1 }
            r2.value(r0)     // Catch:{ all -> 0x04c1 }
            r3.endObject()     // Catch:{ all -> 0x04c1 }
            r3.flush()     // Catch:{ all -> 0x04c1 }
            r3.close()     // Catch:{ IOException -> 0x04c6 }
        L_0x04bc:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x04ea }
            goto L_0x04d6
        L_0x04c1:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x04c5 }
        L_0x04c5:
            throw r0     // Catch:{ IOException -> 0x04c6 }
        L_0x04c6:
            r1 = move-exception
            java.lang.String r0 = "FMessageAppStateFatalExceptionNotification/writeData failed"
            goto L_0x04cd
        L_0x04ca:
            r1 = move-exception
            java.lang.String r0 = "FMessagePeerDataStickerRequestResponse/writeData failed"
        L_0x04cd:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04ea }
            r0 = 0
            goto L_0x04d6
        L_0x04d2:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x04ea }
        L_0x04d6:
            r5.A02(r8, r0)     // Catch:{ all -> 0x04ea }
            r0 = 8
            r5.A01(r0, r6)     // Catch:{ all -> 0x04ea }
            long r0 = r10.executeInsert()     // Catch:{ all -> 0x04ea }
            r14.A13 = r0     // Catch:{ all -> 0x04ea }
            long r0 = r14.A13     // Catch:{ all -> 0x04ea }
            r9.close()
            return r0
        L_0x04ea:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x04ee }
        L_0x04ee:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19M.A01(X.1bL):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C29861bL A02(long r7) {
        /*
            r6 = this;
            X.AnonymousClass00B.A00()
            X.19K r0 = r6.A00
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE _id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0037 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0037 }
            r2[r1] = r0     // Catch:{ all -> 0x0037 }
            android.database.Cursor r1 = r4.A08(r3, r2)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x002d
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x002d
            X.1bL r0 = A00(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x002d:
            r0 = 0
            if (r1 == 0) goto L_0x0033
        L_0x0030:
            r1.close()     // Catch:{ all -> 0x0037 }
        L_0x0033:
            r5.close()
            return r0
        L_0x0037:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19M.A02(long):X.1bL");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r1 != null) goto L_0x003a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C29861bL A03(com.whatsapp.jid.DeviceJid r7, java.lang.String r8) {
        /*
            r6 = this;
            X.AnonymousClass00B.A00()
            X.19K r0 = r6.A00
            X.0tf r4 = r0.get()
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE device_id = ? AND key_from_me = ? AND key_id = ?"
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = r7.getRawString()     // Catch:{ all -> 0x0041 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0041 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0041 }
            r2[r1] = r0     // Catch:{ all -> 0x0041 }
            r0 = 2
            r2[r0] = r8     // Catch:{ all -> 0x0041 }
            android.database.Cursor r1 = r5.A08(r3, r2)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0037
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0037
            X.1bL r0 = A00(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x003a
        L_0x0032:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0037:
            r0 = 0
            if (r1 == 0) goto L_0x003d
        L_0x003a:
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x003d:
            r4.close()
            return r0
        L_0x0041:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19M.A03(com.whatsapp.jid.DeviceJid, java.lang.String):X.1bL");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A04(byte r8) {
        /*
            r7 = this;
            X.AnonymousClass00B.A00()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.19K r0 = r7.A00
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x003e }
            java.lang.String r3 = "SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE message_type = ? "
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x003e }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x003e }
            r2[r1] = r0     // Catch:{ all -> 0x003e }
            android.database.Cursor r1 = r4.A08(r3, r2)     // Catch:{ all -> 0x003e }
        L_0x0020:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0030
            X.1bL r0 = A00(r1)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0020
            r6.add(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x0020
        L_0x0030:
            r1.close()     // Catch:{ all -> 0x003e }
            r5.close()
            return r6
        L_0x0037:
            r0 = move-exception
            if (r1 == 0) goto L_0x003d
            r1.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19M.A04(byte):java.util.List");
    }

    public void A05(DeviceJid deviceJid) {
        AnonymousClass00B.A00();
        C16800tf A02 = this.A00.A02();
        try {
            A02.A02.A01("peer_messages", "device_id = ?", new String[]{deviceJid.getRawString()});
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.util.List r9) {
        /*
            r8 = this;
            int r0 = r9.size()
            if (r0 == 0) goto L_0x007a
            X.AnonymousClass00B.A00()
            int r0 = r9.size()
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
        L_0x0010:
            int r0 = r9.size()
            if (r1 >= r0) goto L_0x0023
            java.lang.Object r0 = r9.get(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0010
        L_0x0023:
            X.19K r0 = r8.A00
            X.0tf r5 = r0.A02()
            X.1cj r7 = r5.A00()     // Catch:{ all -> 0x0075 }
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r6 = new X.1jh     // Catch:{ all -> 0x0070 }
            r6.<init>(r2, r0)     // Catch:{ all -> 0x0070 }
        L_0x0034:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0066
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x0070 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x0070 }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0070 }
            int r1 = r4.length     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "DELETE FROM peer_messages WHERE _id IN ( "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r2.<init>(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x0070 }
            r2.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = " )"
            r2.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0070 }
            r3.A0C(r0, r4)     // Catch:{ all -> 0x0070 }
            goto L_0x0034
        L_0x0066:
            r7.A00()     // Catch:{ all -> 0x0070 }
            r7.close()     // Catch:{ all -> 0x0075 }
            r5.close()
            return
        L_0x0070:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0079 }
        L_0x0079:
            throw r0
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19M.A06(java.util.List):void");
    }
}
