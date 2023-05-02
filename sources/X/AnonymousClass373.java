package X;

import java.lang.ref.WeakReference;

/* renamed from: X.373  reason: invalid class name */
public abstract class AnonymousClass373 extends C16690tT {
    public final AnonymousClass024 A00 = new AnonymousClass024();
    public final C14870pt A01;
    public final C25711Kv A02;
    public final C25701Ku A03;
    public final AnonymousClass17N A04;
    public final C16480t8 A05;
    public final AnonymousClass10G A06;
    public final C15830rv A07;
    public final C18090w8 A08;
    public final C18290wS A09;
    public final WeakReference A0A;

    public AnonymousClass373(C14870pt r2, AnonymousClass3Q1 r3, C25711Kv r4, C25701Ku r5, AnonymousClass17N r6, C16480t8 r7, AnonymousClass10G r8, C16010sH r9, C18090w8 r10, C18290wS r11) {
        this.A01 = r2;
        this.A09 = r11;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = r4;
        this.A08 = r10;
        this.A0A = C13690nt.A0h(r3);
        this.A07 = C16010sH.A01(r9);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0183 */
    /* renamed from: A0B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void A08(java.lang.Void... r11) {
        /*
            r10 = this;
            X.0tU r5 = r10.A02
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L_0x003d
            X.0t8 r4 = r10.A05
            X.0rv r2 = r10.A07
            r1 = 3
            com.facebook.redex.IDxSCallbackShape334S0100000_2_I1 r0 = new com.facebook.redex.IDxSCallbackShape334S0100000_2_I1
            r0.<init>(r10, r1)
            r3 = 1
            int r0 = r4.A01(r0, r2, r3)
            if (r0 > 0) goto L_0x002c
            X.17N r0 = r10.A04
            X.024 r1 = r10.A00
            int r0 = r0.A01(r1, r2)
            if (r0 > 0) goto L_0x002c
            X.1Kv r0 = r10.A02
            int r0 = r0.A00(r1, r2)
            if (r0 > 0) goto L_0x002c
            r3 = 0
        L_0x002c:
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L_0x003d
            X.0pt r2 = r10.A01
            r1 = 2
            com.facebook.redex.RunnableRunnableShape1S0110000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0110000_I1
            r0.<init>(r10, r1, r3)
            r2.A0K(r0)
        L_0x003d:
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L_0x0061
            X.0t8 r4 = r10.A05
            X.0rv r3 = r10.A07
            r0 = 3
            com.facebook.redex.IDxSCallbackShape334S0100000_2_I1 r2 = new com.facebook.redex.IDxSCallbackShape334S0100000_2_I1
            r2.<init>(r10, r0)
            r1 = 12
            r0 = 1
            java.util.ArrayList r2 = r4.A0B(r2, r3, r1, r0)
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L_0x0061
            X.0pt r1 = r10.A01
            r0 = 20
            X.C14870pt.A02(r1, r10, r2, r0)
        L_0x0061:
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L_0x007a
            X.10G r1 = r10.A06
            X.0rv r0 = r10.A07
            long r2 = r1.A00(r0)
            X.0pt r4 = r10.A01
            r1 = 2
            com.facebook.redex.RunnableRunnableShape1S0100100_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0100100_I1
            r0.<init>(r10, r2, r1)
            r4.A0K(r0)
        L_0x007a:
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L_0x00db
            X.1Ku r1 = r10.A03
            X.0rv r8 = r10.A07
            X.0tq r0 = r1.A05
            X.0tf r6 = r0.get()
            X.0tg r7 = r6.A02     // Catch:{ all -> 0x0184 }
            java.lang.String r4 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id IN (SELECT message_row_id FROM message_ephemeral WHERE keep_in_chat = 1)"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0184 }
            r2 = 0
            X.0ts r0 = r1.A02     // Catch:{ all -> 0x0184 }
            long r0 = r0.A02(r8)     // Catch:{ all -> 0x0184 }
            X.C13700nu.A0e(r3, r2, r0)     // Catch:{ all -> 0x0184 }
            android.database.Cursor r4 = r7.A08(r4, r3)     // Catch:{ all -> 0x0184 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = "count"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c5 }
            long r2 = r4.getLong(r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c1
        L_0x00b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = "msgstore/countKeptMessages/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x00c5 }
            r1.append(r8)     // Catch:{ all -> 0x00c5 }
            X.C13680ns.A1V(r1)     // Catch:{ all -> 0x00c5 }
            r2 = 0
        L_0x00c1:
            r4.close()     // Catch:{ all -> 0x0184 }
            goto L_0x00cd
        L_0x00c5:
            r0 = move-exception
            if (r4 == 0) goto L_0x0183
            r4.close()     // Catch:{ all -> 0x0183 }
            goto L_0x0183
        L_0x00cd:
            r6.close()
            X.0pt r4 = r10.A01
            r1 = 1
            com.facebook.redex.RunnableRunnableShape1S0100100_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0100100_I1
            r0.<init>(r10, r2, r1)
            r4.A0K(r0)
        L_0x00db:
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L_0x0119
            X.0w8 r0 = r10.A08
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0119
            X.0wS r0 = r10.A09
            r0.A06()
            X.16r r9 = r0.A08
            X.0rv r7 = r10.A07
            boolean r1 = r9.A0i()
            r0 = 1
            int r8 = X.C13690nt.A00(r1)
            android.util.Pair r5 = r9.A0F(r7, r8)
            r1 = 0
            if (r5 != 0) goto L_0x011b
            X.1Vo r3 = r9.A09
            java.lang.String r0 = "PaymentTransactionStore/countAllTransactionsForChat/null selection/version="
            java.lang.String r0 = X.C13680ns.A0c(r8, r0)
            r3.A05(r0)
        L_0x010e:
            X.0pt r4 = r10.A01
            r3 = 3
            com.facebook.redex.RunnableRunnableShape1S0100100_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0100100_I1
            r0.<init>(r10, r1, r3)
            r4.A0K(r0)
        L_0x0119:
            r0 = 0
            return r0
        L_0x011b:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            if (r8 != r0) goto L_0x013a
            java.lang.String r0 = "SELECT COUNT(*) as count FROM pay_transactions"
        L_0x0123:
            r3.append(r0)
            java.lang.String r0 = " WHERE "
            r3.append(r0)
            java.lang.Object r0 = r5.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = X.AnonymousClass000.A0h(r0, r3)
            X.0tq r0 = r9.A04
            X.0tf r6 = r0.get()
            goto L_0x013d
        L_0x013a:
            java.lang.String r0 = "SELECT COUNT(*) as count FROM pay_transaction"
            goto L_0x0123
        L_0x013d:
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x0184 }
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x0184 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0184 }
            android.database.Cursor r5 = r3.A08(r4, r0)     // Catch:{ all -> 0x0184 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x0158
            java.lang.String r0 = "count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            long r1 = r5.getLong(r0)     // Catch:{ all -> 0x017d }
            goto L_0x0176
        L_0x0158:
            X.1Vo r4 = r9.A09     // Catch:{ all -> 0x017d }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "PaymentTransactionStore/countAllTransactionsForChat/version="
            r3.append(r0)     // Catch:{ all -> 0x017d }
            r3.append(r8)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "/db no message for "
            r3.append(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x017d }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)     // Catch:{ all -> 0x017d }
            r4.A06(r0)     // Catch:{ all -> 0x017d }
        L_0x0176:
            r5.close()     // Catch:{ all -> 0x0184 }
            r6.close()
            goto L_0x010e
        L_0x017d:
            r0 = move-exception
            if (r5 == 0) goto L_0x0183
            r5.close()     // Catch:{ all -> 0x0183 }
        L_0x0183:
            throw r0     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0188 }
        L_0x0188:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass373.A08(java.lang.Void[]):java.lang.Void");
    }
}
