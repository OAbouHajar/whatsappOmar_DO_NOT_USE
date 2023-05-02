package X;

/* renamed from: X.1SN  reason: invalid class name */
public class AnonymousClass1SN {
    public final AnonymousClass1OL A00;
    public final AnonymousClass1D0 A01;
    public final AnonymousClass195 A02;

    public AnonymousClass1SN(AnonymousClass1OL r1, AnonymousClass1D0 r2, AnonymousClass195 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        r5 = r15.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r15 = this;
            java.lang.String r0 = "JoinableCallsMigrationManager/handleJoinableCallsDbMigration "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1OL r3 = r15.A00
            java.util.List r1 = r3.A03()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "JoinableCallsMigrationManager/migrateJoinableCallsFromSharedPrefsToDb "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x001a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r4 = r8.next()
            java.lang.String r4 = (java.lang.String) r4
            android.content.SharedPreferences r6 = r3.A01()
            java.lang.String r2 = "joinable_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r5 = r0.toString()
            r0 = -1
            long r0 = r6.getLong(r5, r0)
            r6 = -1
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0067
            X.1D0 r5 = r15.A01
            X.1po r1 = r5.A02(r0)
            if (r1 == 0) goto L_0x0067
            X.1r0 r0 = r1.A06
            if (r0 == 0) goto L_0x0067
            java.lang.String r11 = X.C30341cC.A0B(r4)
            long r12 = r1.A02()
            boolean r14 = r1.A0I
            com.whatsapp.jid.GroupJid r10 = r1.A04
            X.1r0 r9 = new X.1r0
            r9.<init>(r10, r11, r12, r14)
            r1.A08(r9)
            r5.A08(r1)
        L_0x0067:
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            goto L_0x001a
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SN.A00():void");
    }
}
