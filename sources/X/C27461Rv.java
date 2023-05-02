package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Rv  reason: invalid class name and case insensitive filesystem */
public class C27461Rv {
    public final C27451Ru A00;

    public C27461Rv(C27451Ru r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00(long r18, boolean r20) {
        /*
            r17 = this;
            long r7 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = r17
            X.1Ru r0 = r0.A00     // Catch:{ Exception -> 0x00a7 }
            X.0tf r4 = r0.get()     // Catch:{ Exception -> 0x00a7 }
            X.0tg r9 = r4.A02     // Catch:{ all -> 0x00a2 }
            java.lang.String r10 = "location_sharer"
            java.lang.String[] r11 = X.C454428q.A00     // Catch:{ all -> 0x00a2 }
            java.lang.String r12 = "from_me = ? AND expires >= ?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x00a2 }
            r2 = 0
            r1 = r20
            if (r20 == 0) goto L_0x0038
            java.lang.String r0 = "1"
        L_0x0023:
            r13[r2] = r0     // Catch:{ all -> 0x00a2 }
            r2 = 1
            java.lang.String r0 = java.lang.Long.toString(r18)     // Catch:{ all -> 0x00a2 }
            r13[r2] = r0     // Catch:{ all -> 0x00a2 }
            r14 = 0
            java.lang.String r15 = "_id DESC"
            r16 = r14
            android.database.Cursor r6 = r9.A09(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00a2 }
            if (r6 != 0) goto L_0x0044
            goto L_0x003b
        L_0x0038:
            java.lang.String r0 = "0"
            goto L_0x0023
        L_0x003b:
            java.lang.String r0 = "LocationSharingStore/getAllLocationSharers/unable to get location sharers"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x009b }
            r4.close()     // Catch:{ Exception -> 0x00a7 }
            return r3
        L_0x0044:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x006a
            r0 = 0
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x009b }
            X.0rv r5 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x009b }
            r2 = r14
            if (r5 == 0) goto L_0x0064
            r0 = 2
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x009b }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x009b }
            X.28r r2 = new X.28r     // Catch:{ all -> 0x009b }
            r2.<init>(r6, r5, r0)     // Catch:{ all -> 0x009b }
        L_0x0064:
            if (r2 == 0) goto L_0x0044
            r3.add(r2)     // Catch:{ all -> 0x009b }
            goto L_0x0044
        L_0x006a:
            r6.close()     // Catch:{ all -> 0x00a2 }
            r4.close()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "LocationSharingStore/getAllLocationSharers/returned "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r0 = r3.size()
            r2.append(r0)
            java.lang.String r0 = " location sharer; fromMe="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " | time: "
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r7
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r3
        L_0x009b:
            r0 = move-exception
            if (r6 == 0) goto L_0x00a1
            r6.close()     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            throw r0     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/getAllLocationSharers/error getting sharers"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27461Rv.A00(long, boolean):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(long r11, boolean r13) {
        /*
            r10 = this;
            long r8 = java.lang.System.currentTimeMillis()
            X.1Ru r0 = r10.A00     // Catch:{ Exception -> 0x0059 }
            X.0tf r5 = r0.A02()     // Catch:{ Exception -> 0x0059 }
            X.0tg r7 = r5.A02     // Catch:{ all -> 0x0054 }
            java.lang.String r6 = "location_sharer"
            java.lang.String r4 = "expires < ? AND expires > ? AND from_me = ?"
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0054 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x0054 }
            r3[r1] = r0     // Catch:{ all -> 0x0054 }
            r2 = 1
            r0 = 0
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0054 }
            r3[r2] = r0     // Catch:{ all -> 0x0054 }
            r1 = 2
            if (r13 == 0) goto L_0x0027
            goto L_0x002a
        L_0x0027:
            java.lang.String r0 = "0"
            goto L_0x002c
        L_0x002a:
            java.lang.String r0 = "1"
        L_0x002c:
            r3[r1] = r0     // Catch:{ all -> 0x0054 }
            int r1 = r7.A01(r6, r4, r3)     // Catch:{ all -> 0x0054 }
            r5.close()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = "LocationSharingStore/deleteOldLocationSharers/deleted "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r0 = " location sharers | time: "
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r8
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0054:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/deleteOldLocationSharers/delete failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27461Rv.A01(long, boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0072 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C15830rv r15, java.util.Collection r16, boolean r17) {
        /*
            r14 = this;
            long r12 = java.lang.System.currentTimeMillis()
            X.1Ru r0 = r14.A00     // Catch:{ Exception -> 0x0078 }
            X.0tf r6 = r0.A02()     // Catch:{ Exception -> 0x0078 }
            X.1cj r11 = r6.A01()     // Catch:{ all -> 0x0073 }
            java.util.Iterator r10 = r16.iterator()     // Catch:{ all -> 0x006e }
            r9 = 0
            r5 = 0
        L_0x0014:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0046
            java.lang.Object r8 = r10.next()     // Catch:{ all -> 0x006e }
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ all -> 0x006e }
            X.0tg r7 = r6.A02     // Catch:{ all -> 0x006e }
            java.lang.String r4 = "location_sharer"
            java.lang.String r3 = "remote_jid = ? AND remote_resource = ? AND from_me = ?"
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r15.getRawString()     // Catch:{ all -> 0x006e }
            r2[r9] = r0     // Catch:{ all -> 0x006e }
            r1 = 1
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x006e }
            r2[r1] = r0     // Catch:{ all -> 0x006e }
            r1 = 2
            if (r17 == 0) goto L_0x003c
            java.lang.String r0 = "1"
            goto L_0x003e
        L_0x003c:
            java.lang.String r0 = "0"
        L_0x003e:
            r2[r1] = r0     // Catch:{ all -> 0x006e }
            int r0 = r7.A01(r4, r3, r2)     // Catch:{ all -> 0x006e }
            int r5 = r5 + r0
            goto L_0x0014
        L_0x0046:
            r11.A00()     // Catch:{ all -> 0x006e }
            r11.close()     // Catch:{ all -> 0x0073 }
            r6.close()     // Catch:{ Exception -> 0x0078 }
            java.lang.String r0 = "LocationSharingStore/deleteLocationSharers/deleted "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r5)
            java.lang.String r0 = " location sharers | time: "
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r12
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x006e:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0072 }
        L_0x0072:
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0077 }
        L_0x0077:
            throw r0     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/deleteLocationSharers/delete failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27461Rv.A02(X.0rv, java.util.Collection, boolean):void");
    }

    public void A03(C39721sx r7) {
        C16800tf A02 = this.A00.A02();
        try {
            ContentValues contentValues = new ContentValues();
            UserJid userJid = r7.A06;
            contentValues.put("jid", userJid.getRawString());
            contentValues.put("latitude", Double.valueOf(r7.A00));
            contentValues.put("longitude", Double.valueOf(r7.A01));
            contentValues.put("accuracy", Integer.valueOf(r7.A03));
            contentValues.put("speed", Float.valueOf(r7.A02));
            contentValues.put("bearing", Integer.valueOf(r7.A04));
            contentValues.put("location_ts", Long.valueOf(r7.A05));
            A02.A02.A05(contentValues, "location_cache");
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingStore/saveUserLocation/saved user location; jid=");
            sb.append(userJid);
            sb.append("; timestamp=");
            sb.append(r7.A05);
            Log.i(sb.toString());
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.Iterable r14, boolean r15) {
        /*
            r13 = this;
            long r11 = java.lang.System.currentTimeMillis()
            X.1Ru r0 = r13.A00     // Catch:{ Exception -> 0x0071 }
            X.0tf r7 = r0.A02()     // Catch:{ Exception -> 0x0071 }
            X.1cj r10 = r7.A00()     // Catch:{ all -> 0x006c }
            java.util.Iterator r9 = r14.iterator()     // Catch:{ all -> 0x0067 }
            r8 = 0
            r6 = 0
        L_0x0014:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0067 }
            X.0rv r1 = (X.C15830rv) r1     // Catch:{ all -> 0x0067 }
            X.0tg r5 = r7.A02     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = "location_sharer"
            java.lang.String r3 = "remote_jid = ? AND from_me = ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = r1.getRawString()     // Catch:{ all -> 0x0067 }
            r2[r8] = r0     // Catch:{ all -> 0x0067 }
            r1 = 1
            if (r15 == 0) goto L_0x0035
            java.lang.String r0 = "1"
            goto L_0x0037
        L_0x0035:
            java.lang.String r0 = "0"
        L_0x0037:
            r2[r1] = r0     // Catch:{ all -> 0x0067 }
            int r0 = r5.A01(r4, r3, r2)     // Catch:{ all -> 0x0067 }
            int r6 = r6 + r0
            goto L_0x0014
        L_0x003f:
            r10.A00()     // Catch:{ all -> 0x0067 }
            r10.close()     // Catch:{ all -> 0x006c }
            r7.close()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = "LocationSharingStore/deleteLocationSharers/deleted "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r6)
            java.lang.String r0 = " location sharers | time: "
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0067:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/deleteLocationSharers/delete failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27461Rv.A04(java.lang.Iterable, boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0061 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.util.Collection r14) {
        /*
            r13 = this;
            long r11 = java.lang.System.currentTimeMillis()
            X.1Ru r0 = r13.A00     // Catch:{ Exception -> 0x0067 }
            X.0tf r9 = r0.A02()     // Catch:{ Exception -> 0x0067 }
            X.1cj r10 = r9.A01()     // Catch:{ all -> 0x0062 }
            java.util.Iterator r8 = r14.iterator()     // Catch:{ all -> 0x005d }
            r7 = 0
            r6 = 0
        L_0x0014:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x005d }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x005d }
            X.0tg r4 = r9.A02     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "location_cache"
            java.lang.String r2 = "jid = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x005d }
            r1[r7] = r0     // Catch:{ all -> 0x005d }
            int r0 = r4.A01(r3, r2, r1)     // Catch:{ all -> 0x005d }
            int r6 = r6 + r0
            goto L_0x0014
        L_0x0035:
            r10.A00()     // Catch:{ all -> 0x005d }
            r10.close()     // Catch:{ all -> 0x0062 }
            r9.close()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r0 = "LocationSharingStore/deleteUserLocations/deleted "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r6)
            java.lang.String r0 = " location sharers | time: "
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x005d:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0061 }
        L_0x0061:
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0066 }
        L_0x0066:
            throw r0     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/deleteUserLocations/delete failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27461Rv.A05(java.util.Collection):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.util.Collection r16, long r17) {
        /*
            r15 = this;
            long r13 = java.lang.System.currentTimeMillis()
            X.1Ru r0 = r15.A00     // Catch:{ Exception -> 0x00b2 }
            X.0tf r7 = r0.A02()     // Catch:{ Exception -> 0x00b2 }
            X.1cj r12 = r7.A01()     // Catch:{ all -> 0x00ad }
            java.util.Iterator r11 = r16.iterator()     // Catch:{ all -> 0x00a8 }
            r6 = 0
        L_0x0013:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0080
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x00a8 }
            X.28s r8 = (X.C454628s) r8     // Catch:{ all -> 0x00a8 }
            java.util.List r0 = r8.A03     // Catch:{ all -> 0x00a8 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x0025:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0013
            java.lang.Object r2 = r10.next()     // Catch:{ all -> 0x00a8 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x00a8 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00a8 }
            r4.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "remote_jid"
            X.1Vw r9 = r8.A02     // Catch:{ all -> 0x00a8 }
            X.0rv r0 = r9.A00     // Catch:{ all -> 0x00a8 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00a8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "from_me"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "remote_resource"
            java.lang.String r0 = r2.getRawString()     // Catch:{ all -> 0x00a8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "expires"
            long r0 = r8.A01     // Catch:{ all -> 0x00a8 }
            r2 = r17
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x00a8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a8 }
            r4.put(r5, r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "message_id"
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x00a8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a8 }
            X.0tg r1 = r7.A02     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "location_sharer"
            long r4 = r1.A05(r4, r0)     // Catch:{ all -> 0x00a8 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x007e
            r0 = 1
        L_0x007e:
            int r6 = r6 + r0
            goto L_0x0025
        L_0x0080:
            r12.A00()     // Catch:{ all -> 0x00a8 }
            r12.close()     // Catch:{ all -> 0x00ad }
            r7.close()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = "LocationSharingStore/updateSharingExpire/update "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r6)
            java.lang.String r0 = " location sharers | time: "
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r13
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00a8:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            throw r0     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/updateSharingExpire/save failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27461Rv.A06(java.util.Collection, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0093 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0098 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.util.List r12) {
        /*
            r11 = this;
            long r9 = java.lang.System.currentTimeMillis()
            X.1Ru r0 = r11.A00     // Catch:{ Exception -> 0x0099 }
            X.0tf r4 = r0.A02()     // Catch:{ Exception -> 0x0099 }
            X.1cj r8 = r4.A01()     // Catch:{ all -> 0x0094 }
            java.util.Iterator r7 = r12.iterator()     // Catch:{ all -> 0x008f }
        L_0x0012:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0063
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x008f }
            X.28r r6 = (X.C454528r) r6     // Catch:{ all -> 0x008f }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x008f }
            r5.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "remote_jid"
            X.0rv r0 = r6.A01     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x008f }
            r5.put(r1, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "remote_resource"
            com.whatsapp.jid.UserJid r1 = r6.A02     // Catch:{ all -> 0x008f }
            r0 = 0
            if (r1 == 0) goto L_0x0039
            java.lang.String r0 = r1.getRawString()     // Catch:{ all -> 0x008f }
        L_0x0039:
            r5.put(r2, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "from_me"
            X.1Vw r3 = r6.A03     // Catch:{ all -> 0x008f }
            boolean r0 = r3.A02     // Catch:{ all -> 0x008f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x008f }
            r5.put(r1, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "expires"
            long r0 = r6.A00     // Catch:{ all -> 0x008f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x008f }
            r5.put(r2, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "message_id"
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x008f }
            r5.put(r1, r0)     // Catch:{ all -> 0x008f }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "location_sharer"
            r1.A05(r5, r0)     // Catch:{ all -> 0x008f }
            goto L_0x0012
        L_0x0063:
            r8.A00()     // Catch:{ all -> 0x008f }
            r8.close()     // Catch:{ all -> 0x0094 }
            r4.close()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r0 = "LocationSharingStore/saveLocationSharer/saved "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r0 = r12.size()
            r2.append(r0)
            java.lang.String r0 = " location sharers | time: "
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r9
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x008f:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0093 }
        L_0x0093:
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0098 }
        L_0x0098:
            throw r0     // Catch:{ Exception -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/saveLocationSharer/save failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27461Rv.A07(java.util.List):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0076 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(java.util.List r9, boolean r10) {
        /*
            r8 = this;
            long r6 = java.lang.System.currentTimeMillis()
            X.1Ru r0 = r8.A00     // Catch:{ Exception -> 0x007c }
            X.0tf r5 = r0.A02()     // Catch:{ Exception -> 0x007c }
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x0077 }
            java.util.Iterator r3 = r9.iterator()     // Catch:{ all -> 0x0072 }
        L_0x0012:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0072 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0072 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0072 }
            r2.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0072 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "sent_to_server"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0072 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0072 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "location_key_distribution"
            r1.A05(r2, r0)     // Catch:{ all -> 0x0072 }
            goto L_0x0012
        L_0x003e:
            r4.A00()     // Catch:{ all -> 0x0072 }
            r4.close()     // Catch:{ all -> 0x0077 }
            r5.close()     // Catch:{ Exception -> 0x007c }
            java.lang.String r0 = "LocationSharingStore/storeLocationReceiverHasKey/saved "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r0 = r9.size()
            r2.append(r0)
            java.lang.String r0 = " location receiver has key: "
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = " | time: "
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r6
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0072:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0     // Catch:{ Exception -> 0x007c }
        L_0x007c:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/storeLocationReceiverHasKey/save failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27461Rv.A08(java.util.List, boolean):void");
    }
}
