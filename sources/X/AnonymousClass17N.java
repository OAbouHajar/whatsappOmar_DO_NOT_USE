package X;

/* renamed from: X.17N  reason: invalid class name */
public class AnonymousClass17N {
    public final C16820th A00;
    public final C16920ts A01;
    public final AnonymousClass17F A02;
    public final C16900tq A03;
    public final AnonymousClass11I A04;
    public final AnonymousClass17M A05;

    public AnonymousClass17N(C16820th r1, C16920ts r2, AnonymousClass17F r3, C16900tq r4, AnonymousClass11I r5, AnonymousClass17M r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
    }

    public static String A00(C16740tZ r2) {
        if (r2 instanceof C16840tj) {
            C16880tn AAt = ((C16840tj) r2).AAt();
            if (AAt != null) {
                return AAt.A07;
            }
            return null;
        } else if (C42551xz.A04(r2)) {
            return C42551xz.A01(r2);
        } else {
            if (r2 instanceof C30581cc) {
                return r2.A0I();
            }
            if ((r2 instanceof C38681rF) || (r2 instanceof C38721rJ)) {
                return ((C16730tY) r2).A13();
            }
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass024 r7, X.C15830rv r8) {
        /*
            r6 = this;
            X.0ts r0 = r6.A01
            long r0 = r0.A02(r8)
            java.lang.String r5 = java.lang.Long.toString(r0)
            X.0tq r0 = r6.A03
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "SELECT COUNT(*) AS count FROM message_link WHERE chat_row_id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0041 }
            r2 = 0
            r0[r2] = r5     // Catch:{ all -> 0x0041 }
            android.database.Cursor r1 = r3.A07(r7, r1, r0)     // Catch:{ all -> 0x0041 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003c }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x003c }
            r1.close()     // Catch:{ all -> 0x0041 }
            r4.close()
            return r0
        L_0x0035:
            r1.close()     // Catch:{ all -> 0x0041 }
            r4.close()
            return r2
        L_0x003c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17N.A01(X.024, X.0rv):int");
    }
}
