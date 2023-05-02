package X;

/* renamed from: X.1kp  reason: invalid class name and case insensitive filesystem */
public class C34761kp {
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02a2, code lost:
        if (r10 <= (java.lang.System.currentTimeMillis() / 1000)) goto L_0x02a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0335  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16010sH A00(android.database.Cursor r17) {
        /*
            java.lang.String r1 = "jid"
            r0 = r17
            int r1 = r0.getColumnIndexOrThrow(r1)
            java.lang.String r1 = r0.getString(r1)
            X.0rv r2 = X.C15830rv.A02(r1)
            X.0sH r1 = new X.0sH
            r1.<init>(r2)
            java.lang.String r2 = "status"
            int r2 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r0.getString(r2)
            r1.A0T = r2
            java.lang.String r2 = "status_timestamp"
            int r2 = r0.getColumnIndexOrThrow(r2)
            long r2 = r0.getLong(r2)
            r1.A0B = r2
            java.lang.String r2 = "_id"
            int r2 = r0.getColumnIndexOrThrow(r2)
            long r2 = r0.getLong(r2)
            r1.A0D(r2)
            java.lang.String r2 = "phone_type"
            int r2 = r0.getColumnIndexOrThrow(r2)
            int r2 = r0.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.A0I = r2
            java.lang.String r2 = "phone_label"
            int r2 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r0.getString(r2)
            r1.A0R = r2
            java.lang.String r2 = "history_sync_initial_phash"
            int r2 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r0.getString(r2)
            r1.A0O = r2
            java.lang.String r2 = "number"
            int r2 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r9 = r0.getString(r2)
            java.lang.String r2 = "raw_contact_id"
            int r2 = r0.getColumnIndexOrThrow(r2)
            long r3 = r0.getLong(r2)
            r7 = 0
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x008a
            r5 = -2
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x008a
            r5 = -3
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x009e
        L_0x008a:
            if (r9 == 0) goto L_0x009e
            r2 = 5
            int r5 = r9.length()
            if (r2 > r5) goto L_0x009e
            r2 = 20
            if (r5 > r2) goto L_0x009e
            X.1ko r2 = new X.1ko
            r2.<init>(r9, r3)
            r1.A0D = r2
        L_0x009e:
            java.lang.String r2 = "display_name"
            int r2 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r3 = r0.getString(r2)
            X.1ko r2 = r1.A0D
            if (r2 != 0) goto L_0x036e
            boolean r2 = r1.A0J()
            if (r2 != 0) goto L_0x036e
            X.0rv r2 = r1.A0E
            boolean r2 = X.C16030sJ.A0G(r2)
            if (r2 != 0) goto L_0x036e
            r1.A0J = r3
        L_0x00bc:
            java.lang.String r2 = "is_whatsapp_user"
            int r2 = r0.getColumnIndexOrThrow(r2)
            int r4 = r0.getInt(r2)
            r5 = 0
            r2 = 1
            r3 = 0
            if (r4 != r2) goto L_0x00cc
            r3 = 1
        L_0x00cc:
            r1.A0i = r3
            java.lang.String r3 = "unseen_msg_count"
            int r3 = r0.getColumnIndexOrThrow(r3)
            r0.getInt(r3)
            java.lang.String r3 = "photo_ts"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r3 = r0.getInt(r3)
            r1.A04 = r3
            java.lang.String r3 = "thumb_ts"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r3 = r0.getInt(r3)
            r1.A05 = r3
            java.lang.String r3 = "photo_id_timestamp"
            int r3 = r0.getColumnIndexOrThrow(r3)
            long r3 = r0.getLong(r3)
            r1.A0A = r3
            java.lang.String r3 = "given_name"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            r1.A0N = r3
            java.lang.String r3 = "family_name"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            r1.A0M = r3
            java.lang.String r3 = "wa_name"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            r1.A0W = r3
            java.lang.String r3 = "sort_name"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            r1.A0S = r3
            java.lang.String r3 = "nickname"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            r1.A0Q = r3
            java.lang.String r3 = "company"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            r1.A0K = r3
            java.lang.String r3 = "title"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            r1.A0U = r3
            java.lang.String r3 = "status_autodownload_disabled"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x0163
            r3 = 1
        L_0x0163:
            r1.A0m = r3
            java.lang.String r3 = "keep_timestamp"
            int r3 = r0.getColumnIndexOrThrow(r3)
            long r3 = r0.getLong(r3)
            r1.A09 = r3
            java.lang.String r3 = "is_spam_reported"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x017f
            r3 = 1
        L_0x017f:
            r1.A0f = r3
            java.lang.String r3 = "description"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r12 = r0.getString(r3)
            r6 = 0
            if (r12 != 0) goto L_0x033b
            X.1cF r3 = X.C30371cF.A04
            r1.A0H = r3
        L_0x0192:
            java.lang.String r3 = "restrict_mode"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x01a1
            r3 = 1
        L_0x01a1:
            r1.A0l = r3
            java.lang.String r3 = "announcement_group"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x01b1
            r3 = 1
        L_0x01b1:
            r1.A0Y = r3
            java.lang.String r3 = "no_frequently_forwarded"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x01c1
            r3 = 1
        L_0x01c1:
            r1.A0j = r3
            java.lang.String r3 = "ephemeral_duration"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r3 = r0.getInt(r3)
            r1.A01 = r3
            java.lang.String r3 = "creator_jid"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.getNullable(r3)
            r1.A0F = r3
            java.lang.String r3 = "in_app_support"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x01ed
            r3 = 1
        L_0x01ed:
            r1.A0a = r3
            java.lang.String r3 = "is_suspended"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x01fd
            r3 = 1
        L_0x01fd:
            r1.A0c = r3
            java.lang.String r3 = "group_state"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r3 = r0.getInt(r3)
            r1.A02 = r3
            java.lang.String r3 = "require_membership_approval"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x0219
            r3 = 1
        L_0x0219:
            r1.A0k = r3
            java.lang.String r3 = "member_add_mode"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r3 = r0.getInt(r3)
            r1.A03 = r3
            java.lang.String r3 = "incognito"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x0235
            r3 = 1
        L_0x0235:
            r1.A0b = r3
            java.lang.String r3 = "is_pending_requests_banner_acknowledged"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x0245
            r3 = 1
        L_0x0245:
            r1.A0e = r3
            java.lang.String r3 = "verified_level"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r3 = r0.getInt(r3)
            r14 = 1
            if (r3 == r2) goto L_0x025c
            r14 = 2
            if (r3 == r14) goto L_0x025c
            r14 = 3
            if (r3 == r14) goto L_0x025c
            r14 = 0
        L_0x025c:
            r1.A06 = r14
            java.lang.String r3 = "verified_name"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r13 = r0.getString(r3)
            java.lang.String r9 = "identity_unconfirmed_since"
            int r3 = r0.getColumnIndexOrThrow(r9)
            boolean r4 = r0.isNull(r3)
            java.lang.String r3 = "issuer"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r12 = r0.getString(r3)
            if (r4 == 0) goto L_0x02a4
            if (r13 == 0) goto L_0x0338
            java.lang.String r4 = "expires"
            int r3 = r0.getColumnIndexOrThrow(r4)
            boolean r3 = r0.isNull(r3)
            if (r3 != 0) goto L_0x0338
            int r3 = r0.getColumnIndexOrThrow(r4)
            long r10 = r0.getLong(r3)
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0338
            long r7 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r3
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0338
        L_0x02a4:
            r1.A06 = r5
        L_0x02a6:
            java.lang.String r3 = "serial"
            int r3 = r0.getColumnIndexOrThrow(r3)
            long r16 = r0.getLong(r3)
            int r3 = r0.getColumnIndexOrThrow(r9)
            int r15 = r0.getInt(r3)
            java.lang.String r3 = "host_storage"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            int r8 = X.AnonymousClass4Y1.A01(r3)
            java.lang.String r3 = "actual_actors"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            int r7 = X.AnonymousClass4Y1.A00(r3)
            java.lang.String r3 = "privacy_mode_ts"
            int r3 = r0.getColumnIndexOrThrow(r3)
            long r3 = r0.getLong(r3)
            X.1ta r11 = new X.1ta
            r11.<init>((int) r8, (long) r3, (int) r7)
            boolean r3 = r1 instanceof X.C34811ku
            if (r3 == 0) goto L_0x0335
            java.lang.String r3 = "Setting verified name for ServerContact not allowed"
            X.AnonymousClass00B.A08(r3)
        L_0x02ed:
            r1.A0P = r12
            X.0rv r3 = r1.A0E
            com.whatsapp.jid.UserJid r10 = com.whatsapp.jid.UserJid.of(r3)
            X.1Vq r9 = new X.1Vq
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.A0C = r9
            java.lang.String r3 = "is_sidelist_synced"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r4 = r0.getInt(r3)
            r3 = 0
            if (r4 != r2) goto L_0x030a
            r3 = 1
        L_0x030a:
            r1.A0h = r3
            java.lang.String r3 = "is_business_synced"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r3 = r0.getInt(r3)
            if (r3 != r2) goto L_0x0319
            r5 = 1
        L_0x0319:
            r1.A0d = r5
            java.lang.String r2 = "disappearing_mode_duration"
            int r2 = r0.getColumnIndexOrThrow(r2)
            int r2 = r0.getInt(r2)
            r1.A00 = r2
            java.lang.String r2 = "disappearing_mode_timestamp"
            int r2 = r0.getColumnIndexOrThrow(r2)
            int r0 = r0.getInt(r2)
            long r2 = (long) r0
            r1.A07 = r2
            return r1
        L_0x0335:
            r1.A0V = r6
            goto L_0x02ed
        L_0x0338:
            r6 = r13
            goto L_0x02a6
        L_0x033b:
            java.lang.String r3 = "description_id_string"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r11 = r0.getString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 == 0) goto L_0x034c
            r11 = r6
        L_0x034c:
            java.lang.String r3 = "description_time"
            int r3 = r0.getColumnIndexOrThrow(r3)
            int r3 = r0.getInt(r3)
            long r13 = (long) r3
            java.lang.String r3 = "description_setter_jid"
            int r3 = r0.getColumnIndexOrThrow(r3)
            java.lang.String r3 = r0.getString(r3)
            com.whatsapp.jid.UserJid r10 = com.whatsapp.jid.UserJid.getNullable(r3)
            X.1cF r9 = new X.1cF
            r9.<init>(r10, r11, r12, r13)
            r1.A0H = r9
            goto L_0x0192
        L_0x036e:
            r1.A0L = r3
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34761kp.A00(android.database.Cursor):X.0sH");
    }
}
