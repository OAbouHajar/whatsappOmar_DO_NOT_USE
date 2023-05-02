package X;

import com.whatsapp.util.Log;

/* renamed from: X.1ex  reason: invalid class name and case insensitive filesystem */
public class C31741ex {
    public final C16440t3 A00;
    public final C002601d A01;

    public C31741ex(C16440t3 r1, C002601d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2 > 100) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A00(java.util.Set r6) {
        /*
            r5 = this;
            int r2 = r6.size()
            if (r2 <= 0) goto L_0x000b
            r1 = 100
            r0 = 1
            if (r2 <= r1) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            X.AnonymousClass00B.A0F(r0)
            X.01d r0 = r5.A01
            X.0tg r4 = r0.AHC()
            int r3 = r6.size()
            java.lang.String r0 = "SELECT record, recipient_id, recipient_type, device_id FROM sessions INNER JOIN (SELECT ? AS r, ? AS t, ? AS d"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r1 = 1
        L_0x0021:
            if (r1 >= r3) goto L_0x002b
            java.lang.String r0 = " UNION ALL SELECT ? AS r, ? AS t, ? AS d"
            r2.append(r0)
            int r1 = r1 + 1
            goto L_0x0021
        L_0x002b:
            java.lang.String r0 = ") AS joined ON joined.r = sessions.recipient_id AND joined.t = sessions.recipient_type AND joined.d = sessions.device_id"
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String[] r0 = X.AnonymousClass03N.A00(r6)
            android.database.Cursor r0 = r4.A08(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31741ex.A00(java.util.Set):android.database.Cursor");
    }

    public void A01(C28861Yb r6) {
        C16800tf A02 = this.A01.A02();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl deleted ");
            sb.append((long) A02.A02.A01("sessions", "recipient_id = ? AND recipient_type = ? AND device_id = ? ", r6.A03()));
            sb.append(" sessions with ");
            sb.append(r6);
            Log.i(sb.toString());
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0093 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C28861Yb r14, byte[] r15) {
        /*
            r13 = this;
            java.lang.String r3 = r14.A02
            int r11 = r14.A01
            int r10 = r14.A00
            X.01d r0 = r13.A01
            X.0tf r4 = r0.A02()
            X.1cj r12 = r4.A00()     // Catch:{ all -> 0x0094 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x008f }
            r6.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "record"
            r6.put(r0, r15)     // Catch:{ all -> 0x008f }
            X.0tg r7 = r4.A02     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "sessions"
            java.lang.String r1 = "recipient_id = ? AND recipient_type = ? AND device_id = ? "
            java.lang.String[] r0 = r14.A03()     // Catch:{ all -> 0x008f }
            int r0 = r7.A00(r5, r6, r1, r0)     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x0074
            X.0t3 r0 = r13.A00     // Catch:{ all -> 0x008f }
            long r1 = r0.A00()     // Catch:{ all -> 0x008f }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r8
            java.lang.String r0 = "recipient_id"
            r6.put(r0, r3)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "recipient_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x008f }
            r6.put(r3, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "device_id"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x008f }
            r6.put(r3, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x008f }
            r6.put(r3, r0)     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r3.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "axolotl inserting new session for "
            r3.append(r0)     // Catch:{ all -> 0x008f }
            r3.append(r14)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = " at "
            r3.append(r0)     // Catch:{ all -> 0x008f }
            r3.append(r1)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x008f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x008f }
            r7.A02(r6, r5)     // Catch:{ all -> 0x008f }
        L_0x0074:
            r12.A00()     // Catch:{ all -> 0x008f }
            r12.close()     // Catch:{ all -> 0x0094 }
            r4.close()
            java.lang.String r1 = "axolotl stored session for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x008f:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0093 }
        L_0x0093:
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0098 }
        L_0x0098:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31741ex.A02(X.1Yb, byte[]):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A03(X.C28861Yb r12) {
        /*
            r11 = this;
            java.lang.String r1 = "record"
            X.01d r0 = r11.A01
            X.0tf r2 = r0.get()
            X.0tg r3 = r2.A02     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = "sessions"
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0057 }
            r0 = 0
            r5[r0] = r1     // Catch:{ all -> 0x0057 }
            java.lang.String r6 = "recipient_id = ? AND recipient_type = ? AND device_id = ? "
            java.lang.String[] r7 = r12.A03()     // Catch:{ all -> 0x0057 }
            r8 = 0
            r10 = r8
            r9 = r8
            android.database.Cursor r3 = r3.A09(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0057 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0041
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "axolotl cant load a session record for "
            r1.append(r0)     // Catch:{ all -> 0x0050 }
            r1.append(r12)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0050 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0050 }
            r3.close()     // Catch:{ all -> 0x0057 }
            r2.close()
            return r8
        L_0x0041:
            int r0 = r3.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0050 }
            byte[] r0 = r3.getBlob(r0)     // Catch:{ all -> 0x0050 }
            r3.close()     // Catch:{ all -> 0x0057 }
            r2.close()
            return r0
        L_0x0050:
            r0 = move-exception
            if (r3 == 0) goto L_0x0056
            r3.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31741ex.A03(X.1Yb):byte[]");
    }
}
