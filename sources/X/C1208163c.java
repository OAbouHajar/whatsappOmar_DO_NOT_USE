package X;

import com.obwhatsapp.payments.CheckFirstTransaction;

/* renamed from: X.63c  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1208163c implements Runnable {
    public final /* synthetic */ CheckFirstTransaction A00;

    public /* synthetic */ C1208163c(CheckFirstTransaction checkFirstTransaction) {
        this.A00 = checkFirstTransaction;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x0050=Splitter:B:12:0x0050, B:23:0x006c=Splitter:B:23:0x006c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.obwhatsapp.payments.CheckFirstTransaction r0 = r10.A00
            X.1WD r4 = r0.A00
            X.0wS r0 = r0.A03
            r0.A06()
            X.16r r9 = r0.A08
            boolean r0 = r9.A0i()
            if (r0 == 0) goto L_0x001d
            r8 = 2
            java.lang.String r2 = "SELECT COUNT(*) as count FROM pay_transaction"
        L_0x0014:
            r6 = 0
            X.0tq r0 = r9.A04
            X.0tf r5 = r0.get()
            goto L_0x0021
        L_0x001d:
            r8 = 1
            java.lang.String r2 = "SELECT COUNT(*) as count FROM pay_transactions"
            goto L_0x0014
        L_0x0021:
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x006d }
            r0 = 0
            android.database.Cursor r3 = r1.A08(r2, r0)     // Catch:{ all -> 0x006d }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0066 }
            long r6 = r3.getLong(r0)     // Catch:{ all -> 0x0066 }
            goto L_0x0050
        L_0x0039:
            X.1Vo r2 = r9.A09     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "PaymentTransactionStore/countAllTransactions/version="
            r1.append(r0)     // Catch:{ all -> 0x0066 }
            r1.append(r8)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "/db no message"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0066 }
            r2.A06(r0)     // Catch:{ all -> 0x0066 }
        L_0x0050:
            r3.close()     // Catch:{ all -> 0x006d }
            r5.close()
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x005e
            r0 = 1
        L_0x005e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02(r0)
            return
        L_0x0066:
            r0 = move-exception
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0071 }
        L_0x0071:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208163c.run():void");
    }
}
