package X;

/* renamed from: X.17J  reason: invalid class name */
public class AnonymousClass17J {
    public final C16440t3 A00;
    public final C16820th A01;
    public final AnonymousClass17I A02;
    public final C39521sc A03;
    public final C16900tq A04;

    public AnonymousClass17J(C16440t3 r2, C16820th r3, AnonymousClass17I r4, AnonymousClass17H r5, C16900tq r6) {
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5.A01;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0091 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42581y3 A00(X.C28381Vw r11) {
        /*
            r10 = this;
            r1 = 0
            if (r11 == 0) goto L_0x0097
            X.0th r0 = r10.A01
            X.0tZ r0 = r0.A03(r11)
            if (r0 == 0) goto L_0x0097
            long r5 = r0.A13
            X.0tq r0 = r10.A04
            X.0tf r4 = r0.get()
            X.0tg r7 = r4.A02     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "SELECT sidecar, chunk_lengths FROM message_streaming_sidecar WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0092 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x0092 }
            r2[r1] = r0     // Catch:{ all -> 0x0092 }
            android.database.Cursor r5 = r7.A08(r3, r2)     // Catch:{ all -> 0x0092 }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "sidecar"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x008b }
            byte[] r6 = r5.getBlob(r0)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "chunk_lengths"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x008b }
            byte[] r7 = r5.getBlob(r0)     // Catch:{ all -> 0x008b }
            if (r7 == 0) goto L_0x0076
            int r1 = r7.length     // Catch:{ all -> 0x008b }
            if (r1 <= 0) goto L_0x0076
            int r0 = r1 % 4
            if (r0 != 0) goto L_0x0076
            int r3 = r1 >> 2
            int[] r2 = new int[r3]     // Catch:{ all -> 0x008b }
            r1 = 0
        L_0x004e:
            if (r1 >= r3) goto L_0x0077
            int r9 = r1 << 2
            byte r0 = r7[r9]     // Catch:{ all -> 0x008b }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r8 = r0 << 24
            int r0 = r9 + 1
            byte r0 = r7[r0]     // Catch:{ all -> 0x008b }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r8 = r8 | r0
            int r0 = r9 + 2
            byte r0 = r7[r0]     // Catch:{ all -> 0x008b }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r8 = r8 | r0
            int r0 = r9 + 3
            byte r0 = r7[r0]     // Catch:{ all -> 0x008b }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r8
            r2[r1] = r0     // Catch:{ all -> 0x008b }
            int r1 = r1 + 1
            goto L_0x004e
        L_0x0076:
            r2 = 0
        L_0x0077:
            X.1y3 r0 = new X.1y3     // Catch:{ all -> 0x008b }
            r0.<init>(r6, r2)     // Catch:{ all -> 0x008b }
            r5.close()     // Catch:{ all -> 0x0092 }
            r4.close()
            return r0
        L_0x0083:
            r5.close()     // Catch:{ all -> 0x0092 }
            r4.close()
            r0 = 0
            return r0
        L_0x008b:
            r0 = move-exception
            if (r5 == 0) goto L_0x0091
            r5.close()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0096 }
        L_0x0096:
            throw r0
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17J.A00(X.1Vw):X.1y3");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C42591y4 r12, long r13) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x008a
            monitor-enter(r12)
            boolean r0 = r12.A01     // Catch:{ all -> 0x0087 }
            monitor-exit(r12)
            if (r0 == 0) goto L_0x008a
            byte[] r2 = r12.A05()
            int[] r8 = r12.A06()
            X.0tq r0 = r11.A04     // Catch:{ SQLiteConstraintException -> 0x0080 }
            X.0tf r3 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x0080 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x007b }
            r4.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x007b }
            r4.put(r1, r0)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "sidecar"
            r4.put(r0, r2)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "chunk_lengths"
            if (r8 != 0) goto L_0x0030
            r6 = 0
            goto L_0x0057
        L_0x0030:
            int r5 = r8.length     // Catch:{ all -> 0x007b }
            int r0 = r5 << 2
            byte[] r6 = new byte[r0]     // Catch:{ all -> 0x007b }
            r2 = 0
        L_0x0036:
            if (r2 >= r5) goto L_0x0057
            int r10 = r2 << 2
            r9 = r8[r2]     // Catch:{ all -> 0x007b }
            int r1 = r10 + 3
            byte r0 = (byte) r9     // Catch:{ all -> 0x007b }
            r6[r1] = r0     // Catch:{ all -> 0x007b }
            int r1 = r10 + 2
            int r0 = r9 >> 8
            byte r0 = (byte) r0     // Catch:{ all -> 0x007b }
            r6[r1] = r0     // Catch:{ all -> 0x007b }
            int r1 = r10 + 1
            int r0 = r9 >> 16
            byte r0 = (byte) r0     // Catch:{ all -> 0x007b }
            r6[r1] = r0     // Catch:{ all -> 0x007b }
            int r0 = r9 >> 24
            byte r0 = (byte) r0     // Catch:{ all -> 0x007b }
            r6[r10] = r0     // Catch:{ all -> 0x007b }
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0057:
            r4.put(r7, r6)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "timestamp"
            X.0t3 r0 = r11.A00     // Catch:{ all -> 0x007b }
            long r0 = r0.A00()     // Catch:{ all -> 0x007b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x007b }
            r4.put(r2, r0)     // Catch:{ all -> 0x007b }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x007b }
            java.lang.String r1 = "message_streaming_sidecar"
            r0 = 5
            r2.A06(r4, r1, r0)     // Catch:{ all -> 0x007b }
            r3.close()     // Catch:{ SQLiteConstraintException -> 0x0080 }
            monitor-enter(r12)
            r0 = 0
            r12.A01 = r0     // Catch:{ all -> 0x0087 }
            monitor-exit(r12)
            return
        L_0x007b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x007f }
        L_0x007f:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0080 }
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "SidecarMessageStore/insertStreamingSidecar/"
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        L_0x0087:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17J.A01(X.1y4, long):void");
    }
}
