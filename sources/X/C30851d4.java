package X;

import com.whatsapp.util.Log;

/* renamed from: X.1d4  reason: invalid class name and case insensitive filesystem */
public class C30851d4 {
    public int A00;
    public C31941fH A01;
    public final C16440t3 A02;
    public final C002601d A03;

    public C30851d4(C16440t3 r1, C002601d r2) {
        this.A02 = r1;
        this.A03 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00() {
        /*
            r13 = this;
            java.lang.String r4 = "next_prekey_id"
            X.01d r0 = r13.A03
            X.0tf r3 = r0.get()
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x0052 }
            java.lang.String r6 = "identities"
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ all -> 0x0052 }
            r1 = 0
            r7[r1] = r4     // Catch:{ all -> 0x0052 }
            java.lang.String r8 = "recipient_id=? AND recipient_type = ? AND device_id=?"
            r0 = 3
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0052 }
            r0 = -1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0052 }
            r9[r1] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0052 }
            r9[r2] = r1     // Catch:{ all -> 0x0052 }
            r0 = 2
            r9[r0] = r1     // Catch:{ all -> 0x0052 }
            r10 = 0
            r12 = r10
            r11 = r10
            android.database.Cursor r2 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0052 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0043
            int r0 = r2.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x004b }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x004b }
            r2.close()     // Catch:{ all -> 0x0052 }
            r3.close()
            return r0
        L_0x0043:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x004b }
            r0.<init>(r1)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30851d4.A00():int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01() {
        /*
            r13 = this;
            java.lang.String r4 = "registration_id"
            int r0 = r13.A00
            if (r0 != 0) goto L_0x005d
            X.01d r0 = r13.A03
            X.0tf r3 = r0.get()
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x0055 }
            java.lang.String r6 = "identities"
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ all -> 0x0055 }
            r1 = 0
            r7[r1] = r4     // Catch:{ all -> 0x0055 }
            java.lang.String r8 = "recipient_id=? AND recipient_type = ? AND device_id=?"
            r0 = 3
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0055 }
            r0 = -1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r9[r1] = r0     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0055 }
            r9[r2] = r1     // Catch:{ all -> 0x0055 }
            r0 = 2
            r9[r0] = r1     // Catch:{ all -> 0x0055 }
            r10 = 0
            r12 = r10
            r11 = r10
            android.database.Cursor r2 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0055 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0046
            int r0 = r2.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x004e }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x004e }
            r13.A00 = r0     // Catch:{ all -> 0x004e }
            r2.close()     // Catch:{ all -> 0x0055 }
            goto L_0x005a
        L_0x0046:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x004e }
            r0.<init>(r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0
        L_0x005a:
            r3.close()
        L_0x005d:
            int r0 = r13.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30851d4.A01():int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C31941fH A02() {
        /*
            r15 = this;
            java.lang.String r1 = "private_key"
            java.lang.String r2 = "public_key"
            X.1fH r0 = r15.A01
            if (r0 != 0) goto L_0x006e
            X.01d r0 = r15.A03
            X.0tf r3 = r0.get()
            X.0tg r7 = r3.A02     // Catch:{ all -> 0x0066 }
            java.lang.String r8 = "identities"
            r6 = 2
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ all -> 0x0066 }
            r5 = 0
            r9[r5] = r2     // Catch:{ all -> 0x0066 }
            r4 = 1
            r9[r4] = r1     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = "recipient_id=? AND recipient_type = ? AND device_id=?"
            r0 = 3
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0066 }
            r0 = -1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0066 }
            r11[r5] = r0     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0066 }
            r11[r4] = r0     // Catch:{ all -> 0x0066 }
            r11[r6] = r0     // Catch:{ all -> 0x0066 }
            r12 = 0
            r14 = r12
            r13 = r12
            android.database.Cursor r4 = r7.A09(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0057
            int r0 = r4.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x005f }
            byte[] r2 = r4.getBlob(r0)     // Catch:{ all -> 0x005f }
            int r0 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x005f }
            byte[] r1 = r4.getBlob(r0)     // Catch:{ all -> 0x005f }
            X.1fH r0 = new X.1fH     // Catch:{ all -> 0x005f }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x005f }
            r15.A01 = r0     // Catch:{ all -> 0x005f }
            r4.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006b
        L_0x0057:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x005f }
            r0.<init>(r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            if (r4 == 0) goto L_0x0065
            r4.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006a }
        L_0x006a:
            throw r0
        L_0x006b:
            r3.close()
        L_0x006e:
            X.1fH r0 = r15.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30851d4.A02():X.1fH");
    }

    public boolean A03(C28861Yb r8) {
        C16800tf A022 = this.A03.A02();
        try {
            long A012 = (long) A022.A02.A01("identities", "recipient_id=? AND recipient_type = ? AND device_id=?", r8.A03());
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl deleted ");
            sb.append(A012);
            sb.append(" identities for ");
            sb.append(r8);
            Log.i(sb.toString());
            boolean z2 = false;
            if (A012 > 0) {
                z2 = true;
            }
            A022.close();
            return z2;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0087 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A04(X.C28861Yb r13) {
        /*
            r12 = this;
            java.lang.String r1 = "timestamp"
            java.lang.String r2 = "public_key"
            X.01d r0 = r12.A03
            X.0tf r3 = r0.get()
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x0088 }
            java.lang.String r5 = "identities"
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0088 }
            r0 = 0
            r6[r0] = r2     // Catch:{ all -> 0x0088 }
            r0 = 1
            r6[r0] = r1     // Catch:{ all -> 0x0088 }
            java.lang.String r7 = "recipient_id=? AND recipient_type = ? AND device_id=?"
            java.lang.String[] r8 = r13.A03()     // Catch:{ all -> 0x0088 }
            r9 = 0
            r11 = r9
            r10 = r9
            android.database.Cursor r6 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0088 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0046
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r1.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "axolotl found no identity entry for "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            r1.append(r13)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0081 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0081 }
            r6.close()     // Catch:{ all -> 0x0088 }
            r3.close()
            return r9
        L_0x0046:
            int r0 = r6.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0081 }
            byte[] r7 = r6.getBlob(r0)     // Catch:{ all -> 0x0081 }
            int r0 = r6.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0081 }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x0081 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x0081 }
            r2.<init>(r0)     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r1.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "axolotl found an identity entry for "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            r1.append(r13)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = " dated "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            r1.append(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0081 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0081 }
            r6.close()     // Catch:{ all -> 0x0088 }
            r3.close()
            return r7
        L_0x0081:
            r0 = move-exception
            if (r6 == 0) goto L_0x0087
            r6.close()     // Catch:{ all -> 0x0087 }
        L_0x0087:
            throw r0     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x008c }
        L_0x008c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30851d4.A04(X.1Yb):byte[]");
    }
}
