package X;

import com.whatsapp.util.Log;

/* renamed from: X.1es  reason: invalid class name and case insensitive filesystem */
public class C31691es {
    public final C15900s5 A00;
    public final C16440t3 A01;
    public final C002601d A02;

    public C31691es(C15900s5 r1, C16440t3 r2, C002601d r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00() {
        /*
            r4 = this;
            X.01d r0 = r4.A02
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0036 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002f }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x002f }
            r2.close()     // Catch:{ all -> 0x0036 }
            r3.close()
            return r0
        L_0x0026:
            java.lang.String r1 = "unable to fetch count from table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x002f }
            r0.<init>(r1)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31691es.A00():int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01() {
        /*
            r15 = this;
            java.lang.String r6 = "record"
            java.lang.String r5 = "prekey_id"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.01d r0 = r15.A02
            X.0tf r3 = r0.get()
            X.0tg r7 = r3.A02     // Catch:{ all -> 0x005f }
            java.lang.String r8 = "prekeys"
            r0 = 2
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x005f }
            r0 = 0
            r9[r0] = r5     // Catch:{ all -> 0x005f }
            r0 = 1
            r9[r0] = r6     // Catch:{ all -> 0x005f }
            java.lang.String r10 = "sent_to_server = 0 AND direct_distribution = 0"
            r11 = 0
            X.0s5 r1 = r15.A00     // Catch:{ all -> 0x005f }
            X.0tC r0 = X.C15910s6.A1C     // Catch:{ all -> 0x005f }
            int r0 = r1.A02(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005f }
            r13 = r11
            r12 = r11
            android.database.Cursor r7 = r7.A09(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x005f }
        L_0x0032:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0051
            int r0 = r7.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0058 }
            int r2 = r7.getInt(r0)     // Catch:{ all -> 0x0058 }
            int r0 = r7.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0058 }
            byte[] r1 = r7.getBlob(r0)     // Catch:{ all -> 0x0058 }
            X.1ew r0 = new X.1ew     // Catch:{ all -> 0x0058 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0058 }
            r4.add(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x0032
        L_0x0051:
            r7.close()     // Catch:{ all -> 0x005f }
            r3.close()
            return r4
        L_0x0058:
            r0 = move-exception
            if (r7 == 0) goto L_0x005e
            r7.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31691es.A01():java.util.List");
    }

    public void A02(int i2) {
        C16800tf A022 = this.A02.A02();
        try {
            C16810tg r6 = A022.A02;
            String[] strArr = {String.valueOf(i2)};
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl deleted ");
            sb.append((long) r6.A01("prekeys", "prekey_id = ?", strArr));
            sb.append(" pre keys with id ");
            sb.append(i2);
            Log.i(sb.toString());
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00df */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int[] r15) {
        /*
            r14 = this;
            X.01d r7 = r14.A02
            X.0tf r13 = r7.A02()
            X.1cj r12 = r13.A00()     // Catch:{ all -> 0x00e0 }
            X.0t3 r0 = r14.A01     // Catch:{ all -> 0x00db }
            long r2 = r0.A00()     // Catch:{ all -> 0x00db }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            r5 = 0
        L_0x0014:
            int r1 = r15.length     // Catch:{ all -> 0x00db }
            if (r5 >= r1) goto L_0x009b
            int r0 = r5 + 200
            int r6 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x00db }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x00db }
            r8.<init>()     // Catch:{ all -> 0x00db }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "sent_to_server"
            r8.put(r0, r1)     // Catch:{ all -> 0x00db }
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "upload_timestamp"
            r8.put(r0, r1)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "?"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r11.<init>(r0)     // Catch:{ all -> 0x00db }
            int r0 = r6 - r5
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x00db }
            r4 = r5
        L_0x0040:
            if (r4 >= r6) goto L_0x0056
            int r1 = r4 - r5
            r0 = r15[r4]     // Catch:{ all -> 0x00db }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00db }
            r10[r1] = r0     // Catch:{ all -> 0x00db }
            if (r4 == r5) goto L_0x0053
            java.lang.String r0 = ",?"
            r11.append(r0)     // Catch:{ all -> 0x00db }
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x0040
        L_0x0056:
            X.0tf r5 = r7.A02()     // Catch:{ all -> 0x00db }
            X.0tg r9 = r5.A02     // Catch:{ all -> 0x00d6 }
            java.lang.String r4 = "prekeys"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r1.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "prekey_id IN ("
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            r1.append(r11)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d6 }
            int r4 = r9.A00(r4, r8, r0, r10)     // Catch:{ all -> 0x00d6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r1.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "updated "
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            r1.append(r4)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = " prekeys; values="
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            r1.append(r8)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d6 }
            r5.close()     // Catch:{ all -> 0x00db }
            r5 = r6
            goto L_0x0014
        L_0x009b:
            X.0tf r5 = r7.A02()     // Catch:{ all -> 0x00db }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00d6 }
            r4.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = "upload_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00d6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d6 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "prekey_uploads"
            r1.A02(r4, r0)     // Catch:{ all -> 0x00d6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r1.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "axolotl addPreKeyUpload ts:"
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            r1.append(r2)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d6 }
            r5.close()     // Catch:{ all -> 0x00db }
            r12.A00()     // Catch:{ all -> 0x00db }
            r12.close()     // Catch:{ all -> 0x00e0 }
            r13.close()
            return
        L_0x00d6:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00da }
        L_0x00da:
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00df }
        L_0x00df:
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31691es.A03(int[]):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A04(int r13) {
        /*
            r12 = this;
            java.lang.String r3 = "record"
            X.01d r0 = r12.A02
            X.0tf r2 = r0.get()
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "prekeys"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0046 }
            r1 = 0
            r6[r1] = r3     // Catch:{ all -> 0x0046 }
            java.lang.String r7 = "prekey_id = ?"
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0046 }
            r8[r1] = r0     // Catch:{ all -> 0x0046 }
            r9 = 0
            r11 = r9
            r10 = r9
            android.database.Cursor r1 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0046 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0030
            r1.close()     // Catch:{ all -> 0x0046 }
            r2.close()
            return r9
        L_0x0030:
            int r0 = r1.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x003f }
            byte[] r0 = r1.getBlob(r0)     // Catch:{ all -> 0x003f }
            r1.close()     // Catch:{ all -> 0x0046 }
            r2.close()
            return r0
        L_0x003f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31691es.A04(int):byte[]");
    }
}
