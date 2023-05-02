package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.235  reason: invalid class name */
public class AnonymousClass235 extends AnonymousClass15L {
    public static final String[] A00 = {"wa_biz_profiles._id", "wa_biz_profiles.jid", "websites", "email", "business_description", "address", "tag", "latitude", "longitude", "vertical", "has_catalog", "address_postal_code", "address_city_id", "address_city_name", "commerce_experience", "shop_url", "cart_enabled", "commerce_manager_url", "direct_connection_enabled", "is_shop_banned", "default_postcode", "location_name", "galaxy_business_enabled", "cover_photo_url", "cover_photo_id", "custom_url", "member_since"};

    public AnonymousClass235(AnonymousClass11X r1) {
        super(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03ba, code lost:
        if (r1 != null) goto L_0x03bc;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:181:0x03a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:205:0x03cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:211:0x03d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:217:0x03da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:223:0x03e1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:228:0x03e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0265 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:223:0x03e1=Splitter:B:223:0x03e1, B:195:0x03bc=Splitter:B:195:0x03bc} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:228:0x03e6=Splitter:B:228:0x03e6, B:197:0x03bf=Splitter:B:197:0x03bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C35611mD A00(com.whatsapp.jid.UserJid r61) {
        /*
            r60 = this;
            r27 = 0
            r26 = 0
            r37 = 0
            r39 = 0
            r25 = 0
            r43 = 0
            r42 = 0
            r41 = 0
            r36 = 0
            r35 = 0
            r48 = 0
            r24 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r51 = 0
            r33 = 0
            r23 = 0
            r44 = 0
            r22 = 0
            r38 = 0
            r34 = 0
            r40 = 0
            r21 = 0
            r28 = 0
            if (r61 != 0) goto L_0x003a
            java.lang.String r0 = "contact-mgr-db/cannot get business profile details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r28
        L_0x003a:
            java.lang.String r5 = r61.getRawString()
            r0 = r60
            X.11X r0 = r0.A00
            r29 = r0
            X.0tf r53 = r29.get()
            X.1cj r20 = r53.A01()     // Catch:{ all -> 0x03e7 }
            java.lang.String r54 = "wa_biz_profiles LEFT JOIN wa_biz_profiles_websites ON (wa_biz_profiles._id = wa_biz_profiles_websites.wa_biz_profile_id)"
            java.lang.String[] r58 = A00     // Catch:{ all -> 0x03e2 }
            java.lang.String r55 = "wa_biz_profiles.jid = ?"
            r2 = 1
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x03e2 }
            r19 = 0
            r0[r48] = r5     // Catch:{ all -> 0x03e2 }
            java.lang.String r56 = "wa_biz_profiles_websites._id ASC"
            java.lang.String r57 = "CONTACT_BIZ_PROFILES"
            r59 = r0
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r53, r54, r55, r56, r57, r58, r59)     // Catch:{ all -> 0x03e2 }
            java.lang.String[] r11 = X.C35611mD.A0P     // Catch:{ all -> 0x03db }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x03db }
            r0[r48] = r5     // Catch:{ all -> 0x03db }
            java.lang.String r7 = "wa_biz_profiles INNER JOIN wa_biz_profiles_hours ON (wa_biz_profiles._id = wa_biz_profiles_hours.wa_biz_profile_id)"
            java.lang.String r10 = "CONTACT_BIZ_PROFILES_HOURS"
            r6 = r53
            r8 = r55
            r9 = r27
            r12 = r0
            android.database.Cursor r4 = X.AnonymousClass15L.A03(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x03db }
            java.lang.String r54 = "wa_biz_profiles LEFT JOIN wa_biz_profiles_categories ON (wa_biz_profiles._id = wa_biz_profiles_categories.wa_biz_profile_id)"
            java.lang.String[] r58 = X.C35611mD.A0O     // Catch:{ all -> 0x03d4 }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x03d4 }
            r0[r48] = r5     // Catch:{ all -> 0x03d4 }
            java.lang.String r56 = "wa_biz_profiles_categories._id ASC"
            java.lang.String r57 = "CONTACT_BIZ_PROFILES_CATEGORIES"
            r59 = r0
            android.database.Cursor r14 = X.AnonymousClass15L.A03(r53, r54, r55, r56, r57, r58, r59)     // Catch:{ all -> 0x03d4 }
            java.lang.String r7 = "wa_biz_profiles LEFT JOIN wa_biz_profiles_service_areas ON (wa_biz_profiles._id = wa_biz_profiles_service_areas.wa_biz_profile_id)"
            java.lang.String[] r11 = X.C35611mD.A0Q     // Catch:{ all -> 0x03cd }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x03cd }
            r0[r48] = r5     // Catch:{ all -> 0x03cd }
            java.lang.String r10 = "CONTACT_BIZ_PROFILES_SERVICE_AREAS"
            r12 = r0
            android.database.Cursor r3 = X.AnonymousClass15L.A03(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x03cd }
            java.lang.String r6 = "wa_biz_profiles LEFT JOIN wa_biz_profiles_linked_accounts_table ON (wa_biz_profiles._id = wa_biz_profiles_linked_accounts_table.wa_biz_profile_id)"
            java.lang.String[] r10 = X.C35611mD.A0R     // Catch:{ all -> 0x03c6 }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x03c6 }
            r0[r48] = r5     // Catch:{ all -> 0x03c6 }
            java.lang.String r9 = "CONTACT_BIZ_PROFILES_TRUST_SIGNALS"
            r5 = r53
            r7 = r8
            r8 = r27
            r11 = r0
            android.database.Cursor r5 = X.AnonymousClass15L.A03(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x03c6 }
            r20.A00()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x03a6
            int r0 = r1.getCount()     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x03a6
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r12.<init>()     // Catch:{ all -> 0x039f }
            r18 = 0
        L_0x00c7:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x039f }
            r9 = 6
            r7 = 4
            r6 = 3
            r13 = 2
            r17 = 1
            if (r0 == 0) goto L_0x01e1
            boolean r0 = r1.isFirst()     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x01d8
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x039f }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r18 = new java.lang.Object     // Catch:{ all -> 0x039f }
            r18.<init>()     // Catch:{ all -> 0x039f }
            java.util.ArrayList r26 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r26.<init>()     // Catch:{ all -> 0x039f }
            java.util.ArrayList r21 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r21.<init>()     // Catch:{ all -> 0x039f }
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r22.<init>()     // Catch:{ all -> 0x039f }
            r33 = r0
            java.lang.String r35 = r1.getString(r6)     // Catch:{ all -> 0x039f }
            java.lang.String r36 = r1.getString(r7)     // Catch:{ all -> 0x039f }
            java.lang.String r34 = r1.getString(r9)     // Catch:{ all -> 0x039f }
            r6 = 5
            r0 = 11
            java.lang.String r11 = r1.getString(r6)     // Catch:{ all -> 0x039f }
            java.lang.String r10 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            r6 = 7
            r0 = 8
            r8 = 12
            r7 = 13
            java.lang.String r9 = r1.getString(r8)     // Catch:{ all -> 0x039f }
            java.lang.String r8 = r1.getString(r7)     // Catch:{ all -> 0x039f }
            boolean r15 = r1.isNull(r6)     // Catch:{ all -> 0x039f }
            r7 = 0
            if (r15 == 0) goto L_0x0128
            r6 = r7
            goto L_0x0130
        L_0x0128:
            double r15 = r1.getDouble(r6)     // Catch:{ all -> 0x039f }
            java.lang.Double r6 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x039f }
        L_0x0130:
            boolean r15 = r1.isNull(r0)     // Catch:{ all -> 0x039f }
            if (r15 != 0) goto L_0x013e
            double r15 = r1.getDouble(r0)     // Catch:{ all -> 0x039f }
            java.lang.Double r7 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x039f }
        L_0x013e:
            X.1mB r0 = new X.1mB     // Catch:{ all -> 0x039f }
            r0.<init>(r6, r7, r9, r8)     // Catch:{ all -> 0x039f }
            X.1m7 r27 = new X.1m7     // Catch:{ all -> 0x039f }
            r6 = r27
            r6.<init>(r0, r11, r10)     // Catch:{ all -> 0x039f }
            r6 = 9
            boolean r0 = r1.isNull(r6)     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x0155
            r40 = 0
            goto L_0x0159
        L_0x0155:
            java.lang.String r40 = r1.getString(r6)     // Catch:{ all -> 0x039f }
        L_0x0159:
            r0 = 10
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x039f }
            r48 = 0
            if (r0 != r2) goto L_0x0165
            r48 = 1
        L_0x0165:
            r0 = 14
            java.lang.String r37 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            r0 = 15
            java.lang.String r38 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            r0 = 16
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x039f }
            r49 = 0
            if (r0 != r2) goto L_0x017d
            r49 = 1
        L_0x017d:
            r0 = 17
            java.lang.String r39 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            r0 = 18
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x039f }
            r50 = 0
            if (r0 != r2) goto L_0x018f
            r50 = 1
        L_0x018f:
            r0 = 19
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x039f }
            r51 = 0
            if (r0 != r2) goto L_0x019b
            r51 = 1
        L_0x019b:
            r0 = 20
            java.lang.String r41 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            r0 = 21
            java.lang.String r42 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            r0 = 22
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x039f }
            if (r0 == r2) goto L_0x01b1
            r17 = 0
        L_0x01b1:
            r52 = r17
            r0 = 25
            java.lang.String r43 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            r0 = 26
            java.lang.String r44 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            r0 = 24
            java.lang.String r7 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x039f }
            if (r0 != 0) goto L_0x01d8
            r0 = 23
            java.lang.String r6 = r1.getString(r0)     // Catch:{ all -> 0x039f }
            X.1mA r25 = new X.1mA     // Catch:{ all -> 0x039f }
            r0 = r25
            r0.<init>(r6, r7)     // Catch:{ all -> 0x039f }
        L_0x01d8:
            java.lang.String r0 = r1.getString(r13)     // Catch:{ all -> 0x039f }
            r12.add(r0)     // Catch:{ all -> 0x039f }
            goto L_0x00c7
        L_0x01e1:
            if (r18 == 0) goto L_0x038a
            r21.clear()     // Catch:{ all -> 0x039f }
            r0 = r21
            r0.addAll(r12)     // Catch:{ all -> 0x039f }
            if (r4 == 0) goto L_0x0285
            int r0 = r4.getCount()     // Catch:{ all -> 0x039f }
            if (r0 <= 0) goto L_0x0285
            int r0 = r4.getCount()     // Catch:{ all -> 0x039f }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r8.<init>(r0)     // Catch:{ all -> 0x039f }
            r12 = 0
            r11 = 0
        L_0x01fe:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x0278
            boolean r0 = r4.isFirst()     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x0213
            r0 = 0
            java.lang.String r12 = r4.getString(r0)     // Catch:{ all -> 0x039f }
            java.lang.String r11 = r4.getString(r2)     // Catch:{ all -> 0x039f }
        L_0x0213:
            int r15 = r4.getInt(r13)     // Catch:{ all -> 0x039f }
            int r10 = r4.getInt(r6)     // Catch:{ all -> 0x039f }
            boolean r0 = r4.isNull(r7)     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x0223
            r7 = 0
            goto L_0x022b
        L_0x0223:
            int r0 = r4.getInt(r7)     // Catch:{ all -> 0x039f }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x039f }
        L_0x022b:
            r0 = 5
            boolean r16 = r4.isNull(r0)     // Catch:{ all -> 0x039f }
            if (r16 == 0) goto L_0x0233
            goto L_0x023c
        L_0x0233:
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x039f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x039f }
            goto L_0x023d
        L_0x023c:
            r0 = 0
        L_0x023d:
            if (r10 != 0) goto L_0x026d
            if (r7 == 0) goto L_0x0244
            if (r0 == 0) goto L_0x0244
            goto L_0x026d
        L_0x0244:
            int r15 = r4.getInt(r9)     // Catch:{ all -> 0x039f }
            X.0tf r10 = r29.A02()     // Catch:{ Exception -> 0x0266 }
            java.lang.String r9 = "wa_biz_profiles_hours"
            java.lang.String r7 = "wa_biz_profiles_hours._id = ?"
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x0261 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0261 }
            r0[r19] = r15     // Catch:{ all -> 0x0261 }
            X.AnonymousClass15L.A02(r10, r9, r7, r0)     // Catch:{ all -> 0x0261 }
            r10.close()     // Catch:{ Exception -> 0x0266 }
            goto L_0x0275
        L_0x0261:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0265 }
        L_0x0265:
            throw r0     // Catch:{ Exception -> 0x0266 }
        L_0x0266:
            r7 = move-exception
            java.lang.String r0 = "BusinessProfileStore/Error deleting business day config"
            com.whatsapp.util.Log.w(r0, r7)     // Catch:{ all -> 0x039f }
            goto L_0x0275
        L_0x026d:
            X.1ju r9 = new X.1ju     // Catch:{ all -> 0x039f }
            r9.<init>(r7, r0, r15, r10)     // Catch:{ all -> 0x039f }
            r8.add(r9)     // Catch:{ all -> 0x039f }
        L_0x0275:
            r9 = 6
            r7 = 4
            goto L_0x01fe
        L_0x0278:
            int r0 = r8.size()     // Catch:{ all -> 0x039f }
            if (r0 <= 0) goto L_0x0285
            X.1mE r24 = new X.1mE     // Catch:{ all -> 0x039f }
            r0 = r24
            r0.<init>(r12, r11, r8)     // Catch:{ all -> 0x039f }
        L_0x0285:
            if (r14 == 0) goto L_0x02b6
            int r0 = r14.getCount()     // Catch:{ all -> 0x039f }
            if (r0 <= 0) goto L_0x02b6
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r9.<init>()     // Catch:{ all -> 0x039f }
        L_0x0292:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x02ae
            r0 = 0
            java.lang.String r8 = r14.getString(r0)     // Catch:{ all -> 0x039f }
            java.lang.String r7 = r14.getString(r2)     // Catch:{ all -> 0x039f }
            if (r8 == 0) goto L_0x0292
            if (r7 == 0) goto L_0x0292
            X.1dn r0 = new X.1dn     // Catch:{ all -> 0x039f }
            r0.<init>(r8, r7)     // Catch:{ all -> 0x039f }
            r9.add(r0)     // Catch:{ all -> 0x039f }
            goto L_0x0292
        L_0x02ae:
            r26.clear()     // Catch:{ all -> 0x039f }
            r0 = r26
            r0.addAll(r9)     // Catch:{ all -> 0x039f }
        L_0x02b6:
            if (r3 == 0) goto L_0x0318
            int r0 = r3.getCount()     // Catch:{ all -> 0x039f }
            if (r0 <= 0) goto L_0x0318
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r11.<init>()     // Catch:{ all -> 0x039f }
        L_0x02c3:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x0310
            r0 = 0
            java.lang.String r10 = r3.getString(r0)     // Catch:{ all -> 0x039f }
            boolean r0 = r3.isNull(r2)     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x02d6
            r8 = 0
            goto L_0x02de
        L_0x02d6:
            int r0 = r3.getInt(r2)     // Catch:{ all -> 0x039f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x039f }
        L_0x02de:
            boolean r0 = r3.isNull(r13)     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x02e6
            r7 = 0
            goto L_0x02ee
        L_0x02e6:
            double r15 = r3.getDouble(r13)     // Catch:{ all -> 0x039f }
            java.lang.Double r7 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x039f }
        L_0x02ee:
            boolean r0 = r3.isNull(r6)     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x02f5
            goto L_0x02fe
        L_0x02f5:
            double r15 = r3.getDouble(r6)     // Catch:{ all -> 0x039f }
            java.lang.Double r0 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x039f }
            goto L_0x02ff
        L_0x02fe:
            r0 = 0
        L_0x02ff:
            if (r10 == 0) goto L_0x02c3
            if (r8 == 0) goto L_0x02c3
            if (r7 == 0) goto L_0x02c3
            if (r0 == 0) goto L_0x02c3
            X.1mC r9 = new X.1mC     // Catch:{ all -> 0x039f }
            r9.<init>(r7, r0, r8, r10)     // Catch:{ all -> 0x039f }
            r11.add(r9)     // Catch:{ all -> 0x039f }
            goto L_0x02c3
        L_0x0310:
            r22.clear()     // Catch:{ all -> 0x039f }
            r0 = r22
            r0.addAll(r11)     // Catch:{ all -> 0x039f }
        L_0x0318:
            if (r5 == 0) goto L_0x035c
            int r0 = r5.getCount()     // Catch:{ all -> 0x039f }
            if (r0 <= 0) goto L_0x035c
            r10 = 0
            r9 = 0
        L_0x0322:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x035c
            r0 = 0
            java.lang.String r8 = r5.getString(r0)     // Catch:{ all -> 0x039f }
            int r15 = r5.getInt(r2)     // Catch:{ all -> 0x039f }
            java.lang.String r7 = r5.getString(r13)     // Catch:{ all -> 0x039f }
            int r12 = r5.getInt(r6)     // Catch:{ all -> 0x039f }
            r0 = 4
            int r11 = r5.getInt(r0)     // Catch:{ all -> 0x039f }
            r0 = 0
            if (r11 != r2) goto L_0x0342
            r0 = 1
        L_0x0342:
            if (r8 == 0) goto L_0x034e
            if (r7 == 0) goto L_0x034e
            X.1m9 r11 = new X.1m9     // Catch:{ all -> 0x039f }
            r11.<init>(r8, r7, r12, r0)     // Catch:{ all -> 0x039f }
            if (r15 != r2) goto L_0x0353
            r9 = r11
        L_0x034e:
            if (r10 != 0) goto L_0x0354
            if (r9 == 0) goto L_0x0322
            goto L_0x0354
        L_0x0353:
            r10 = r11
        L_0x0354:
            X.1m8 r23 = new X.1m8     // Catch:{ all -> 0x039f }
            r0 = r23
            r0.<init>(r10, r9)     // Catch:{ all -> 0x039f }
            goto L_0x0322
        L_0x035c:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r0 = r26
            r2.<init>(r0)     // Catch:{ all -> 0x039f }
            java.util.List r45 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x039f }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r0 = r21
            r2.<init>(r0)     // Catch:{ all -> 0x039f }
            java.util.List r46 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x039f }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x039f }
            r0 = r22
            r2.<init>(r0)     // Catch:{ all -> 0x039f }
            java.util.List r47 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x039f }
            X.1mD r28 = new X.1mD     // Catch:{ all -> 0x039f }
            r29 = r24
            r30 = r25
            r31 = r23
            r32 = r27
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ all -> 0x039f }
        L_0x038a:
            if (r5 == 0) goto L_0x038f
            r5.close()     // Catch:{ all -> 0x03c6 }
        L_0x038f:
            if (r3 == 0) goto L_0x0394
            r3.close()     // Catch:{ all -> 0x03cd }
        L_0x0394:
            if (r14 == 0) goto L_0x0399
            r14.close()     // Catch:{ all -> 0x03d4 }
        L_0x0399:
            if (r4 == 0) goto L_0x03bc
            r4.close()     // Catch:{ all -> 0x03db }
            goto L_0x03bc
        L_0x039f:
            r0 = move-exception
            if (r5 == 0) goto L_0x03a5
            r5.close()     // Catch:{ all -> 0x03a5 }
        L_0x03a5:
            throw r0     // Catch:{ all -> 0x03c6 }
        L_0x03a6:
            if (r5 == 0) goto L_0x03ab
            r5.close()     // Catch:{ all -> 0x03c6 }
        L_0x03ab:
            if (r3 == 0) goto L_0x03b0
            r3.close()     // Catch:{ all -> 0x03cd }
        L_0x03b0:
            if (r14 == 0) goto L_0x03b5
            r14.close()     // Catch:{ all -> 0x03d4 }
        L_0x03b5:
            if (r4 == 0) goto L_0x03ba
            r4.close()     // Catch:{ all -> 0x03db }
        L_0x03ba:
            if (r1 == 0) goto L_0x03bf
        L_0x03bc:
            r1.close()     // Catch:{ all -> 0x03e2 }
        L_0x03bf:
            r20.close()     // Catch:{ all -> 0x03e7 }
            r53.close()
            return r28
        L_0x03c6:
            r0 = move-exception
            if (r3 == 0) goto L_0x03cc
            r3.close()     // Catch:{ all -> 0x03cc }
        L_0x03cc:
            throw r0     // Catch:{ all -> 0x03cd }
        L_0x03cd:
            r0 = move-exception
            if (r14 == 0) goto L_0x03d3
            r14.close()     // Catch:{ all -> 0x03d3 }
        L_0x03d3:
            throw r0     // Catch:{ all -> 0x03d4 }
        L_0x03d4:
            r0 = move-exception
            if (r4 == 0) goto L_0x03da
            r4.close()     // Catch:{ all -> 0x03da }
        L_0x03da:
            throw r0     // Catch:{ all -> 0x03db }
        L_0x03db:
            r0 = move-exception
            if (r1 == 0) goto L_0x03e1
            r1.close()     // Catch:{ all -> 0x03e1 }
        L_0x03e1:
            throw r0     // Catch:{ all -> 0x03e2 }
        L_0x03e2:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x03e6 }
        L_0x03e6:
            throw r0     // Catch:{ all -> 0x03e7 }
        L_0x03e7:
            r0 = move-exception
            r53.close()     // Catch:{ all -> 0x03eb }
        L_0x03eb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass235.A00(com.whatsapp.jid.UserJid):X.1mD");
    }

    public final void A01(ContentValues contentValues, C35571m9 r4, C16800tf r5, int i2, long j2) {
        contentValues.clear();
        contentValues.put("wa_biz_profile_id", Long.valueOf(j2));
        contentValues.put("account_id", r4.A03);
        contentValues.put("account_type", Integer.valueOf(i2));
        contentValues.put("account_display_name", r4.A02);
        contentValues.put("account_fan_count", Integer.valueOf(r4.A01));
        contentValues.put("account_has_media_post", Boolean.valueOf(r4.A00));
        AnonymousClass15L.A00(contentValues, r5, "wa_biz_profiles_linked_accounts_table");
    }

    public void A02(UserJid userJid) {
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot delete business profile details by null jid");
            return;
        }
        C16800tf A02 = this.A00.A02();
        try {
            AnonymousClass15L.A02(A02, "wa_biz_profiles", "wa_biz_profiles.jid = ?", new String[]{userJid.getRawString()});
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0266 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.util.Map r24) {
        /*
            r23 = this;
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            r9 = r23
            X.11X r0 = r9.A00
            X.0tf r12 = r0.A02()
            X.1cj r8 = r12.A00()     // Catch:{ all -> 0x0267 }
            java.util.Set r0 = r24.entrySet()     // Catch:{ all -> 0x0262 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0262 }
        L_0x0019:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x0258
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0262 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0262 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0262 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x0262 }
            X.1mD r0 = r9.A00(r2)     // Catch:{ all -> 0x0262 }
            java.lang.Object r3 = r1.getValue()     // Catch:{ all -> 0x0262 }
            X.1mD r3 = (X.C35611mD) r3     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x003a
            if (r3 != 0) goto L_0x0042
            goto L_0x0019
        L_0x003a:
            if (r3 == 0) goto L_0x0042
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x0019
        L_0x0042:
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x0262 }
            r9.A02(r2)     // Catch:{ all -> 0x0262 }
            if (r3 == 0) goto L_0x0019
            r10.clear()     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r2.getRawString()     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "tag"
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "address"
            X.1m7 r2 = r3.A03     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "address_postal_code"
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "address_city_id"
            X.1mB r2 = r2.A00     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "address_city_name"
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "business_description"
            java.lang.String r0 = r3.A0A     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "email"
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "latitude"
            java.lang.Double r0 = r2.A00     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "longitude"
            java.lang.Double r0 = r2.A01     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "vertical"
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "has_catalog"
            boolean r0 = r3.A0L     // Catch:{ all -> 0x0262 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            X.1mE r5 = r3.A00     // Catch:{ all -> 0x0262 }
            if (r5 == 0) goto L_0x00c0
            java.lang.String r1 = "time_zone"
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "hours_note"
            java.lang.String r0 = r5.A00     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
        L_0x00c0:
            java.lang.String r1 = "commerce_experience"
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "shop_url"
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "cart_enabled"
            boolean r0 = r3.A0J     // Catch:{ all -> 0x0262 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "commerce_manager_url"
            java.lang.String r0 = r3.A06     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "direct_connection_enabled"
            boolean r0 = r3.A0K     // Catch:{ all -> 0x0262 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "is_shop_banned"
            boolean r0 = r3.A0N     // Catch:{ all -> 0x0262 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "default_postcode"
            java.lang.String r0 = r3.A09     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "location_name"
            java.lang.String r0 = r3.A08     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "galaxy_business_enabled"
            boolean r0 = r3.A0M     // Catch:{ all -> 0x0262 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "custom_url"
            java.lang.String r0 = r3.A07     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            X.1mA r2 = r3.A01     // Catch:{ all -> 0x0262 }
            if (r2 == 0) goto L_0x0129
            java.lang.String r1 = "cover_photo_url"
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "cover_photo_id"
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
        L_0x0129:
            java.lang.String r1 = "member_since"
            java.lang.String r0 = r3.A0C     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "wa_biz_profiles"
            long r14 = X.AnonymousClass15L.A00(r10, r12, r0)     // Catch:{ all -> 0x0262 }
            java.util.List r1 = r3.A0I     // Catch:{ all -> 0x0262 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0262 }
            java.lang.String r2 = "wa_biz_profile_id"
            if (r0 != 0) goto L_0x0169
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x0262 }
        L_0x0146:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x0169
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0262 }
            r10.clear()     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "websites"
            r10.put(r0, r1)     // Catch:{ all -> 0x0262 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0262 }
            r10.put(r2, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "wa_biz_profiles_websites"
            X.AnonymousClass15L.A00(r10, r12, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0146
        L_0x0169:
            java.util.List r1 = r3.A0G     // Catch:{ all -> 0x0262 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x01a2
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x0262 }
        L_0x0175:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x0262 }
            X.1dn r4 = (X.C31241dn) r4     // Catch:{ all -> 0x0262 }
            if (r4 == 0) goto L_0x0175
            r10.clear()     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "category_id"
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "category_name"
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0262 }
            r10.put(r2, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "wa_biz_profiles_categories"
            X.AnonymousClass15L.A00(r10, r12, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0175
        L_0x01a2:
            if (r5 == 0) goto L_0x01eb
            java.util.List r0 = r5.A02     // Catch:{ all -> 0x0262 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0262 }
        L_0x01aa:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0262 }
            X.1ju r4 = (X.C34221ju) r4     // Catch:{ all -> 0x0262 }
            r10.clear()     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "day_of_week"
            int r0 = r4.A00     // Catch:{ all -> 0x0262 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "mode"
            int r0 = r4.A01     // Catch:{ all -> 0x0262 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "open_time"
            java.lang.Integer r0 = r4.A03     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = "close_time"
            java.lang.Integer r0 = r4.A02     // Catch:{ all -> 0x0262 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0262 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0262 }
            r10.put(r2, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "wa_biz_profiles_hours"
            X.AnonymousClass15L.A00(r10, r12, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x01aa
        L_0x01eb:
            X.1m8 r1 = r3.A02     // Catch:{ all -> 0x0262 }
            if (r1 == 0) goto L_0x01f7
            X.1m9 r11 = r1.A00     // Catch:{ all -> 0x0262 }
            if (r11 != 0) goto L_0x023e
            X.1m9 r0 = r1.A01     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x023e
        L_0x01f7:
            java.util.List r1 = r3.A0H     // Catch:{ all -> 0x0262 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x0019
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x0262 }
        L_0x0203:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x0019
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0262 }
            X.1mC r3 = (X.C35601mC) r3     // Catch:{ all -> 0x0262 }
            if (r3 == 0) goto L_0x0203
            r10.clear()     // Catch:{ all -> 0x0262 }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "area_description"
            r10.put(r0, r1)     // Catch:{ all -> 0x0262 }
            java.lang.Integer r1 = r3.A02     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "radius"
            r10.put(r0, r1)     // Catch:{ all -> 0x0262 }
            java.lang.Double r1 = r3.A00     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "center_latitude"
            r10.put(r0, r1)     // Catch:{ all -> 0x0262 }
            java.lang.Double r1 = r3.A01     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "center_longitude"
            r10.put(r0, r1)     // Catch:{ all -> 0x0262 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0262 }
            r10.put(r2, r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "wa_biz_profiles_service_areas"
            X.AnonymousClass15L.A00(r10, r12, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0203
        L_0x023e:
            X.1m9 r0 = r1.A01     // Catch:{ all -> 0x0262 }
            if (r11 == 0) goto L_0x0246
            r13 = 0
            r9.A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0262 }
        L_0x0246:
            if (r0 == 0) goto L_0x01f7
            r20 = 1
            r16 = r9
            r17 = r10
            r18 = r0
            r19 = r12
            r21 = r14
            r16.A01(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0262 }
            goto L_0x01f7
        L_0x0258:
            r8.A00()     // Catch:{ all -> 0x0262 }
            r8.close()     // Catch:{ all -> 0x0267 }
            r12.close()
            return
        L_0x0262:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0266 }
        L_0x0266:
            throw r0     // Catch:{ all -> 0x0267 }
        L_0x0267:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x026b }
        L_0x026b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass235.A03(java.util.Map):void");
    }
}
