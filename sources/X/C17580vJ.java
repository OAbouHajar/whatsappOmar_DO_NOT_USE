package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0vJ  reason: invalid class name and case insensitive filesystem */
public final class C17580vJ {
    public final C23641Cu A00;
    public final C216314v A01;
    public final Map A02;
    public final Map A03;

    public C17580vJ(C23641Cu r3, C216314v r4) {
        C18450wi.A0H(r4, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = linkedHashMap;
        this.A03 = linkedHashMap2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|29|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0065 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1ZX A00(X.AnonymousClass1ZT r12) {
        /*
            r11 = this;
            r6 = 0
            X.C18450wi.A0H(r12, r6)
            X.14v r9 = r11.A01
            long r4 = r9.A01(r12)
            r10 = r11
            r8 = 0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0081
            monitor-enter(r10)
            java.util.Map r1 = r11.A03     // Catch:{ all -> 0x007e }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x007e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0066
            X.1Cu r0 = r11.A00     // Catch:{ all -> 0x007e }
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x007e }
            X.0tf r7 = r0.get()     // Catch:{ all -> 0x007e }
            X.0tg r3 = r7.A02     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "SELECT lid_row_id FROM jid_map WHERE jid_row_id = ? ORDER BY lid_row_id DESC LIMIT 1"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0061 }
            r1[r6] = r0     // Catch:{ all -> 0x0061 }
            android.database.Cursor r6 = r3.A08(r2, r1)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "lid_row_id"
            int r1 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x005a }
            if (r1 < 0) goto L_0x0051
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0051
            int r0 = r6.getInt(r1)     // Catch:{ all -> 0x005a }
            long r2 = (long) r0     // Catch:{ all -> 0x005a }
            r6.close()     // Catch:{ all -> 0x0061 }
            goto L_0x006b
        L_0x0051:
            r6.close()     // Catch:{ all -> 0x0061 }
            r7.close()     // Catch:{ all -> 0x007e }
            r2 = -1
            goto L_0x006e
        L_0x005a:
            r0 = move-exception
            if (r6 == 0) goto L_0x0060
            r6.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0066:
            long r2 = r0.longValue()     // Catch:{ all -> 0x007e }
            goto L_0x006e
        L_0x006b:
            r7.close()     // Catch:{ all -> 0x007e }
        L_0x006e:
            com.whatsapp.jid.Jid r1 = r9.A03(r2)     // Catch:{ all -> 0x007e }
            boolean r0 = r1 instanceof X.AnonymousClass1ZX     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x007c
            r8 = r1
            X.1ZX r8 = (X.AnonymousClass1ZX) r8     // Catch:{ all -> 0x007e }
            r11.A02(r2, r4)     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r10)
            return r8
        L_0x007e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0081:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17580vJ.A00(X.1ZT):X.1ZX");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|29|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0065 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1ZT A01(X.AnonymousClass1ZX r12) {
        /*
            r11 = this;
            r6 = 0
            X.C18450wi.A0H(r12, r6)
            X.14v r9 = r11.A01
            long r4 = r9.A01(r12)
            r10 = r11
            r8 = 0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0081
            monitor-enter(r10)
            java.util.Map r1 = r11.A02     // Catch:{ all -> 0x007e }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x007e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0066
            X.1Cu r0 = r11.A00     // Catch:{ all -> 0x007e }
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x007e }
            X.0tf r7 = r0.get()     // Catch:{ all -> 0x007e }
            X.0tg r3 = r7.A02     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "SELECT jid_row_id FROM jid_map WHERE lid_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0061 }
            r1[r6] = r0     // Catch:{ all -> 0x0061 }
            android.database.Cursor r6 = r3.A08(r2, r1)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "jid_row_id"
            int r1 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x005a }
            if (r1 < 0) goto L_0x0051
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0051
            int r0 = r6.getInt(r1)     // Catch:{ all -> 0x005a }
            long r2 = (long) r0     // Catch:{ all -> 0x005a }
            r6.close()     // Catch:{ all -> 0x0061 }
            goto L_0x006b
        L_0x0051:
            r6.close()     // Catch:{ all -> 0x0061 }
            r7.close()     // Catch:{ all -> 0x007e }
            r2 = -1
            goto L_0x006e
        L_0x005a:
            r0 = move-exception
            if (r6 == 0) goto L_0x0060
            r6.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0066:
            long r2 = r0.longValue()     // Catch:{ all -> 0x007e }
            goto L_0x006e
        L_0x006b:
            r7.close()     // Catch:{ all -> 0x007e }
        L_0x006e:
            com.whatsapp.jid.Jid r1 = r9.A03(r2)     // Catch:{ all -> 0x007e }
            boolean r0 = r1 instanceof X.AnonymousClass1ZT     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x007c
            r8 = r1
            X.1ZT r8 = (X.AnonymousClass1ZT) r8     // Catch:{ all -> 0x007e }
            r11.A02(r4, r2)     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r10)
            return r8
        L_0x007e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0081:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17580vJ.A01(X.1ZX):X.1ZT");
    }

    public final void A02(long j2, long j3) {
        Map map = this.A02;
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(j3);
        map.put(valueOf, valueOf2);
        this.A03.put(valueOf2, valueOf);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass1ZX r10, X.AnonymousClass1ZT r11) {
        /*
            r9 = this;
            r0 = 0
            X.C18450wi.A0H(r10, r0)
            r0 = 1
            X.C18450wi.A0H(r11, r0)
            X.14v r0 = r9.A01
            long r2 = r0.A01(r10)
            long r4 = r0.A01(r11)
            r8 = r9
            monitor-enter(r8)
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            java.util.Map r1 = r9.A02     // Catch:{ all -> 0x0057 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0057 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0057 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0039
            long r6 = r0.longValue()     // Catch:{ all -> 0x0057 }
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            goto L_0x005a
        L_0x0039:
            X.1Cu r0 = r9.A00     // Catch:{ all -> 0x0057 }
            X.0tq r0 = r0.A00     // Catch:{ SQLException -> 0x0050 }
            X.0tf r1 = r0.A02()     // Catch:{ SQLException -> 0x0050 }
            X.C23641Cu.A00(r1, r2, r4)     // Catch:{ all -> 0x004b }
            r1.close()     // Catch:{ SQLException -> 0x0050 }
            r9.A02(r2, r4)     // Catch:{ all -> 0x0057 }
            goto L_0x005a
        L_0x004b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ SQLException -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "JidMapStore/upsertLidToJidMapping"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0057 }
            goto L_0x005a
        L_0x0057:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x005a:
            monitor-exit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17580vJ.A03(X.1ZX, X.1ZT):void");
    }
}
