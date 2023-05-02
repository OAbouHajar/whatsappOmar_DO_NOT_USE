package X;

/* renamed from: X.51T  reason: invalid class name */
public class AnonymousClass51T implements C31031dM {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass39M A01;

    public AnonymousClass51T(AnonymousClass39M r1, long j2) {
        this.A01 = r1;
        this.A00 = j2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A8B(X.C30191bu r8) {
        /*
            r7 = this;
            X.39M r0 = r7.A01
            X.10G r2 = r0.A06
            long r0 = r7.A00
            X.0tq r2 = r2.A0C
            X.0tf r4 = r2.get()
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x0052 }
            java.lang.String r5 = "SELECT starred FROM message_view WHERE _id = ?"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0052 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0052 }
            android.database.Cursor r1 = r6.A08(r5, r2)     // Catch:{ all -> 0x0052 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "starred"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004b }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x004b }
            if (r0 == r3) goto L_0x0031
            r3 = 0
        L_0x0031:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x004b }
            r1.close()     // Catch:{ all -> 0x0052 }
            r4.close()
            if (r2 == 0) goto L_0x0043
            java.lang.String r1 = "is_starred"
            r0 = 1
            r8.A00(r0, r1, r2)
        L_0x0043:
            return
        L_0x0044:
            r1.close()     // Catch:{ all -> 0x0052 }
            r4.close()
            return
        L_0x004b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51T.A8B(X.1bu):void");
    }

    public String ADD() {
        return "is_starred";
    }
}
