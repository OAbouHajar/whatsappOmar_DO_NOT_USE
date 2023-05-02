package X;

/* renamed from: X.177  reason: invalid class name */
public class AnonymousClass177 {
    public final C16900tq A00;

    public AnonymousClass177(C16900tq r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C42661yC r6, long r7) {
        /*
            r5 = this;
            X.0tq r0 = r5.A00     // Catch:{ SQLiteConstraintException -> 0x0038 }
            X.0tf r4 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x0038 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0033 }
            r3.<init>()     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0033 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "waveform"
            byte[] r0 = r6.A02     // Catch:{ all -> 0x0033 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "background_color"
            int r0 = r6.A01     // Catch:{ all -> 0x0033 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0033 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0033 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "audio_data"
            r0 = 5
            r2.A06(r3, r1, r0)     // Catch:{ all -> 0x0033 }
            r4.close()     // Catch:{ SQLiteConstraintException -> 0x0038 }
            return
        L_0x0033:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "WaveformMessageStore/insertWaveform/"
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass177.A00(X.1yC, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C38701rH r9) {
        /*
            r8 = this;
            long r5 = r9.A13
            X.0tq r0 = r8.A00
            X.0tf r4 = r0.get()
            X.0tg r7 = r4.A02     // Catch:{ all -> 0x0053 }
            java.lang.String r3 = "SELECT message_row_id, waveform, background_color FROM audio_data WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0053 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x0053 }
            r2[r1] = r0     // Catch:{ all -> 0x0053 }
            android.database.Cursor r3 = r7.A08(r3, r2)     // Catch:{ all -> 0x0053 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "waveform"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004c }
            byte[] r2 = r3.getBlob(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "background_color"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004c }
            int r1 = r3.getInt(r0)     // Catch:{ all -> 0x004c }
            X.1yC r0 = new X.1yC     // Catch:{ all -> 0x004c }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x004c }
            r3.close()     // Catch:{ all -> 0x0053 }
            r4.close()
            goto L_0x0048
        L_0x0041:
            r3.close()     // Catch:{ all -> 0x0053 }
            r4.close()
            r0 = 0
        L_0x0048:
            r9.A19(r0)
            return
        L_0x004c:
            r0 = move-exception
            if (r3 == 0) goto L_0x0052
            r3.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass177.A01(X.1rH):void");
    }
}
