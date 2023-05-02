package X;

/* renamed from: X.38b  reason: invalid class name and case insensitive filesystem */
public class C612238b {
    public final C16440t3 A00;

    public C612238b(C16440t3 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0095, code lost:
        if (X.C13680ns.A0C(r3).getBoolean("reg_profile_pic_tapped_key", false) != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C75873sr A00(android.content.Context r8, X.C15860rz r9, X.C16010sH r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Integer r14, boolean r15, boolean r16) {
        /*
            r7 = this;
            X.3sr r4 = new X.3sr
            r4.<init>()
            long r5 = java.lang.System.currentTimeMillis()
            X.01D r3 = r9.A01
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            java.lang.String r0 = "eula_accepted_time"
            long r0 = X.C13680ns.A08(r1, r0)
            long r5 = r5 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4.A09 = r0
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            java.lang.String r0 = "message_store_verified_time"
            long r0 = X.C13680ns.A08(r1, r0)
            long r5 = r5 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4.A0A = r0
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            java.lang.String r0 = "registration_attempt_skip_with_no_vertical"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r0
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            java.lang.String r0 = "registration_retry_fetching_biz_profile"
            boolean r0 = r1.getBoolean(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A04 = r0
            r4.A08 = r11
            r4.A05 = r12
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x006b
            X.03S r0 = new X.03S
            r0.<init>(r8)
            boolean r0 = r0.A03()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
        L_0x006b:
            if (r13 != 0) goto L_0x0086
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r3)
            java.lang.String r2 = "reg_backup_status_key"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x00d8
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            r0 = -1
            int r0 = r1.getInt(r2, r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x0086:
            r4.A06 = r13
            if (r15 != 0) goto L_0x0097
            android.content.SharedPreferences r2 = X.C13680ns.A0C(r3)
            java.lang.String r1 = "reg_profile_pic_tapped_key"
            r0 = 0
            boolean r1 = r2.getBoolean(r1, r0)
            if (r1 == 0) goto L_0x0098
        L_0x0097:
            r0 = 1
        L_0x0098:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A03 = r0
            if (r10 == 0) goto L_0x00c5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r4.A02 = r0
            if (r16 == 0) goto L_0x00c5
            if (r14 != 0) goto L_0x00c3
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r3)
            java.lang.String r2 = "reg_profile_pic_source_key"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x00d6
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            r0 = -1
            int r0 = r1.getInt(r2, r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x00c3:
            r4.A07 = r14
        L_0x00c5:
            java.lang.String r0 = r9.A0N()
            byte[] r1 = X.AnonymousClass2JN.A0M(r0)
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            r4.A0B = r0
            return r4
        L_0x00d6:
            r14 = 0
            goto L_0x00c3
        L_0x00d8:
            r13 = 0
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C612238b.A00(android.content.Context, X.0rz, X.0sH, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, boolean):X.3sr");
    }
}
