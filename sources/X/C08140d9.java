package X;

import com.facebook.redex.IDxIAdapterShape37S0100000_I1;
import com.facebook.redex.IDxLStatementShape38S0100000_I1;

/* renamed from: X.0d9  reason: invalid class name and case insensitive filesystem */
public final class C08140d9 implements C13140lX {
    public final C02860Fx A00;
    public final AnonymousClass0SM A01;
    public final C05450Rm A02;
    public final C05450Rm A03;

    public C08140d9(AnonymousClass0SM r3) {
        this.A01 = r3;
        this.A00 = new IDxIAdapterShape37S0100000_I1(r3, this, 2);
        this.A02 = new IDxLStatementShape38S0100000_I1(r3, this, 0);
        this.A03 = new IDxLStatementShape38S0100000_I1(r3, this, 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.0RF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0RF AGO(X.AnonymousClass0R5 r8) {
        /*
            r7 = this;
            java.lang.String r3 = r8.A01
            int r1 = r8.A00
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r2 = 2
            X.0cR r6 = X.AnonymousClass0M4.A00(r0, r2)
            r0 = 1
            r6.A5S(r0, r3)
            long r0 = (long) r1
            r6.A5Q(r2, r0)
            X.0SM r1 = r7.A01
            r1.A09()
            r0 = 0
            r5 = 0
            android.database.Cursor r4 = X.AnonymousClass0M5.A00(r1, r6, r0)
            java.lang.String r0 = "work_spec_id"
            int r3 = X.AnonymousClass0WY.A02(r4, r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "generation"
            int r2 = X.AnonymousClass0WY.A02(r4, r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "system_id"
            int r1 = X.AnonymousClass0WY.A02(r4, r0)     // Catch:{ all -> 0x0055 }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004e
            boolean r0 = r4.isNull(r3)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0040
            java.lang.String r5 = r4.getString(r3)     // Catch:{ all -> 0x0055 }
        L_0x0040:
            int r2 = r4.getInt(r2)     // Catch:{ all -> 0x0055 }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0055 }
            X.0RF r0 = new X.0RF     // Catch:{ all -> 0x0055 }
            r0.<init>(r2, r5, r1)     // Catch:{ all -> 0x0055 }
            r5 = r0
        L_0x004e:
            r4.close()
            r6.A01()
            return r5
        L_0x0055:
            r0 = move-exception
            r4.close()
            r6.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08140d9.AGO(X.0R5):X.0RF");
    }

    public void AIQ(AnonymousClass0RF r3) {
        AnonymousClass0SM r1 = this.A01;
        r1.A09();
        r1.A0A();
        try {
            this.A00.A05(r3);
            r1.A0C();
        } finally {
            r1.A0B();
        }
    }
}
