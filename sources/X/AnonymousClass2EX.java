package X;

/* renamed from: X.2EX  reason: invalid class name */
public class AnonymousClass2EX extends C30111bl implements AnonymousClass2EI {
    public final C16920ts A00;
    public final C224317x A01;

    public AnonymousClass2EX(C16920ts r3, C224317x r4, C24821Hk r5) {
        super(r5, "message_location", 2);
        this.A00 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e4, code lost:
        if (r13 != 30) goto L_0x0174;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x01e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x01ea */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x017e A[SYNTHETIC, Splitter:B:35:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0190 A[SYNTHETIC, Splitter:B:38:0x0190] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C49522Tm A09(android.database.Cursor r33) {
        /*
            r32 = this;
            java.lang.String r0 = "_id"
            r5 = r33
            int r30 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "key_remote_jid"
            int r29 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_wa_type"
            int r28 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_name"
            int r27 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_url"
            int r26 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_duration"
            int r25 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_size"
            int r24 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r23 = "latitude"
            r0 = r23
            int r22 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r21 = "longitude"
            r0 = r21
            int r20 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "thumb_image"
            int r19 = r5.getColumnIndexOrThrow(r0)
            r31 = r32
            r0 = r31
            X.0tq r0 = r0.A05
            X.0tf r18 = r0.A02()
            r1 = -1
            r4 = 0
        L_0x0050:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x0223
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x022c }
            r3.<init>()     // Catch:{ all -> 0x022c }
            r0 = r30
            long r1 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r6 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r6, r0)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r29
            java.lang.String r0 = r5.getString(r0)     // Catch:{ SQLiteException -> 0x021d }
            X.0rv r10 = X.C15830rv.A02(r0)     // Catch:{ SQLiteException -> 0x021d }
            if (r10 == 0) goto L_0x0050
            r0 = r31
            X.0ts r0 = r0.A00     // Catch:{ SQLiteException -> 0x021d }
            long r8 = r0.A02(r10)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 1
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0099
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x021d }
            r3.<init>()     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r0 = "LocationMessageStore/LocationMessageDatabaseMigration/processBatch/missing chat row_id; jid="
            r3.append(r0)     // Catch:{ SQLiteException -> 0x021d }
            r3.append(r10)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r0 = r3.toString()     // Catch:{ SQLiteException -> 0x021d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x021d }
            goto L_0x0050
        L_0x0099:
            java.lang.String r6 = "chat_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r6, r0)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r22
            double r6 = r5.getDouble(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r23
            r3.put(r0, r6)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r20
            double r6 = r5.getDouble(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r21
            r3.put(r0, r6)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r28
            int r13 = r5.getInt(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r9 = "live_location_sequence_number"
            java.lang.String r10 = "live_location_share_duration"
            java.lang.String r11 = "url"
            java.lang.String r8 = "live_location_final_timestamp"
            java.lang.String r7 = "live_location_final_longitude"
            java.lang.String r6 = "live_location_final_latitude"
            r17 = 1
            java.lang.String r15 = "place_name"
            r16 = 2
            java.lang.String r12 = "place_address"
            r0 = 5
            if (r13 == r0) goto L_0x00e8
            r0 = 16
            if (r13 == r0) goto L_0x0113
            r0 = 30
            if (r13 == r0) goto L_0x00e8
            goto L_0x0174
        L_0x00e8:
            r0 = r27
            java.lang.String r14 = r5.getString(r0)     // Catch:{ SQLiteException -> 0x021d }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ SQLiteException -> 0x021d }
            if (r0 == 0) goto L_0x01f2
            r3.putNull(r15)     // Catch:{ SQLiteException -> 0x021d }
        L_0x00f7:
            r3.putNull(r12)     // Catch:{ SQLiteException -> 0x021d }
        L_0x00fa:
            r0 = r26
            java.lang.String r0 = r5.getString(r0)     // Catch:{ SQLiteException -> 0x021d }
            X.C38611r4.A04(r3, r11, r0)     // Catch:{ SQLiteException -> 0x021d }
            r3.putNull(r10)     // Catch:{ SQLiteException -> 0x021d }
            r3.putNull(r9)     // Catch:{ SQLiteException -> 0x021d }
        L_0x0109:
            r3.putNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            r3.putNull(r7)     // Catch:{ SQLiteException -> 0x021d }
            r3.putNull(r8)     // Catch:{ SQLiteException -> 0x021d }
            goto L_0x0174
        L_0x0113:
            r3.putNull(r15)     // Catch:{ SQLiteException -> 0x021d }
            r3.putNull(r12)     // Catch:{ SQLiteException -> 0x021d }
            r3.putNull(r11)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r25
            long r11 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r10, r0)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r24
            long r10 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r9, r0)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r27
            java.lang.String r9 = r5.getString(r0)     // Catch:{ SQLiteException -> 0x021d }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ SQLiteException -> 0x021d }
            if (r0 != 0) goto L_0x0109
            java.lang.String r0 = ","
            java.lang.String[] r11 = r9.split(r0)     // Catch:{ SQLiteException -> 0x021d }
            int r9 = r11.length     // Catch:{ SQLiteException -> 0x021d }
            r0 = 4
            if (r9 != r0) goto L_0x0174
            r0 = r11[r17]     // Catch:{ SQLiteException -> 0x021d }
            double r9 = java.lang.Double.parseDouble(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.Double r0 = java.lang.Double.valueOf(r9)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r6, r0)     // Catch:{ SQLiteException -> 0x021d }
            r0 = r11[r16]     // Catch:{ SQLiteException -> 0x021d }
            double r9 = java.lang.Double.parseDouble(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.Double r0 = java.lang.Double.valueOf(r9)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r7, r0)     // Catch:{ SQLiteException -> 0x021d }
            r0 = 3
            r0 = r11[r0]     // Catch:{ SQLiteException -> 0x021d }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r8, r0)     // Catch:{ SQLiteException -> 0x021d }
        L_0x0174:
            r0 = r19
            byte[] r7 = r5.getBlob(r0)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r6 = "map_download_status"
            if (r7 != 0) goto L_0x0190
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r6, r0)     // Catch:{ SQLiteException -> 0x021d }
        L_0x0185:
            r0 = r18
            X.0tg r6 = r0.A02     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r0 = "message_location"
            r6.A03(r3, r0)     // Catch:{ SQLiteException -> 0x021d }
            goto L_0x0219
        L_0x0190:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x01ea }
            r0.<init>(r7)     // Catch:{ Exception -> 0x01ea }
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x01ea }
            r7.<init>(r0)     // Catch:{ Exception -> 0x01ea }
            java.lang.Object r8 = r7.readObject()     // Catch:{ all -> 0x01e5 }
            boolean r0 = r8 instanceof java.lang.Integer     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01a8
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x01e5 }
            r3.put(r6, r8)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e1
        L_0x01a8:
            boolean r0 = r8 instanceof X.C16750ta     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x01c2
            boolean r0 = r8 instanceof com.whatsapp.MediaData     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01da
            com.whatsapp.MediaData r8 = (com.whatsapp.MediaData) r8     // Catch:{ all -> 0x01e5 }
            X.0ta r8 = X.C16750ta.A00(r8)     // Catch:{ all -> 0x01e5 }
        L_0x01b6:
            boolean r0 = r8.A0P     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01c5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x01e5 }
            r3.put(r6, r0)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e1
        L_0x01c2:
            X.0ta r8 = (X.C16750ta) r8     // Catch:{ all -> 0x01e5 }
            goto L_0x01b6
        L_0x01c5:
            boolean r0 = r8.A0Z     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01d1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x01e5 }
            r3.put(r6, r0)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e1
        L_0x01d1:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e5 }
            r3.put(r6, r0)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e1
        L_0x01da:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x01e5 }
            r3.put(r6, r0)     // Catch:{ all -> 0x01e5 }
        L_0x01e1:
            r7.close()     // Catch:{ Exception -> 0x01ea }
            goto L_0x0185
        L_0x01e5:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x01e9 }
        L_0x01e9:
            throw r0     // Catch:{ Exception -> 0x01ea }
        L_0x01ea:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r6, r0)     // Catch:{ SQLiteException -> 0x021d }
            goto L_0x0185
        L_0x01f2:
            r0 = 10
            int r13 = r14.indexOf(r0)     // Catch:{ SQLiteException -> 0x021d }
            r0 = -1
            if (r13 != r0) goto L_0x0200
            r3.put(r15, r14)     // Catch:{ SQLiteException -> 0x021d }
            goto L_0x00f7
        L_0x0200:
            r0 = 0
            java.lang.String r0 = r14.substring(r0, r13)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r15, r0)     // Catch:{ SQLiteException -> 0x021d }
            int r0 = r14.length()     // Catch:{ SQLiteException -> 0x021d }
            if (r0 <= r13) goto L_0x00f7
            int r0 = r13 + 1
            java.lang.String r0 = r14.substring(r0)     // Catch:{ SQLiteException -> 0x021d }
            r3.put(r12, r0)     // Catch:{ SQLiteException -> 0x021d }
            goto L_0x00fa
        L_0x0219:
            int r4 = r4 + 1
            goto L_0x0050
        L_0x021d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x022c }
            goto L_0x0050
        L_0x0223:
            r18.close()
            X.2Tm r0 = new X.2Tm
            r0.<init>(r1, r4)
            return r0
        L_0x022c:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x0230 }
        L_0x0230:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EX.A09(android.database.Cursor):X.2Tm");
    }

    public /* synthetic */ void AMJ() {
    }

    public /* synthetic */ void ANa() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRollback() {
        /*
            r5 = this;
            X.0tq r0 = r5.A05
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0037 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "message_location"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0032 }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "location_ready"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "migration_message_location_index"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "migration_message_location_retry"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            r3.A00()     // Catch:{ all -> 0x0032 }
            r3.close()     // Catch:{ all -> 0x0037 }
            r4.close()
            java.lang.String r0 = "LocationMessageStore/LocationMessageDatabaseMigration/resetMigration/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0032:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EX.onRollback():void");
    }
}
