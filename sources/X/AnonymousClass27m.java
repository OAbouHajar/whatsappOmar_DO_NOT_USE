package X;

/* renamed from: X.27m  reason: invalid class name */
public class AnonymousClass27m {
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0284, code lost:
        if ("catalog_exists".equals(r3.A0N("status", (java.lang.String) null)) == false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02b6, code lost:
        if (r0.booleanValue() == false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ce, code lost:
        if (r0.booleanValue() == false) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ae, code lost:
        r0 = new java.lang.StringBuilder("Unrecognized week day: ");
        r0.append(r3);
        r1 = new X.AnonymousClass1W9(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c1, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0210, code lost:
        switch(r0.hashCode()) {
            case -504372495: goto L_0x0227;
            case 1800267202: goto L_0x0230;
            case 2060249164: goto L_0x023a;
            default: goto L_0x0213;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0213, code lost:
        r1 = new java.lang.StringBuilder("Unrecognized open mode: ");
        r1.append(r0);
        r1 = new X.AnonymousClass1W9(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022d, code lost:
        if (r0.equals("open_24h") == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0237, code lost:
        if (r0.equals("specific_hours") == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0240, code lost:
        if (r0.equals("appointment_only") == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0243, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0245, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0247, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0248, code lost:
        r6.add(new X.C34221ju(r7, r5, r3, r4));
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0457  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C35611mD A00(com.whatsapp.jid.UserJid r48, X.C28371Vv r49) {
        /*
            r1 = 0
            r34 = 0
            r13 = 0
            r22 = 0
            r36 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r46 = 0
            r33 = 0
            r21 = 0
            r2 = r49
            if (r49 != 0) goto L_0x0019
            return r1
        L_0x0019:
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r0 = "tag"
            java.lang.String r29 = r2.A0N(r0, r1)
            java.lang.String r0 = "structured_address"
            X.1Vv r3 = r2.A0J(r0)
            if (r3 == 0) goto L_0x0053
            java.lang.String r0 = "street_address"
            java.lang.String r7 = A02(r3, r0)
            java.lang.String r0 = "zip_code"
            java.lang.String r8 = A02(r3, r0)
            java.lang.String r0 = "city_id"
            java.lang.String r6 = A02(r3, r0)
            java.lang.String r0 = "localized_city_name"
            java.lang.String r5 = A02(r3, r0)
            goto L_0x005c
        L_0x0053:
            java.lang.String r0 = "address"
            java.lang.String r7 = A02(r2, r0)
            r5 = r1
            r8 = r1
            r6 = r1
        L_0x005c:
            java.lang.String r15 = "latitude"
            X.1Vv r3 = r2.A0J(r15)     // Catch:{ NumberFormatException -> 0x04b6 }
            if (r3 == 0) goto L_0x0091
            java.lang.String r0 = r3.A0L()     // Catch:{ NumberFormatException -> 0x04b6 }
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = r3.A0L()     // Catch:{ NumberFormatException -> 0x04b6 }
            double r3 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x04b6 }
            java.lang.Double r4 = java.lang.Double.valueOf(r3)     // Catch:{ NumberFormatException -> 0x04b6 }
        L_0x0076:
            java.lang.String r14 = "longitude"
            X.1Vv r3 = r2.A0J(r14)     // Catch:{ NumberFormatException -> 0x04b6 }
            if (r3 == 0) goto L_0x0093
            java.lang.String r0 = r3.A0L()     // Catch:{ NumberFormatException -> 0x04b6 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = r3.A0L()     // Catch:{ NumberFormatException -> 0x04b6 }
            double r9 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x04b6 }
            java.lang.Double r3 = java.lang.Double.valueOf(r9)     // Catch:{ NumberFormatException -> 0x04b6 }
            goto L_0x0094
        L_0x0091:
            r4 = 0
            goto L_0x0076
        L_0x0093:
            r3 = 0
        L_0x0094:
            X.1mB r0 = new X.1mB
            r0.<init>(r4, r3, r6, r5)
            X.1m7 r17 = new X.1m7
            r3 = r17
            r3.<init>(r0, r7, r8)
            java.lang.String r0 = "description"
            java.lang.String r31 = A02(r2, r0)
            java.lang.String r0 = "email"
            java.lang.String r30 = A02(r2, r0)
            java.lang.String r0 = "vertical"
            X.1Vv r3 = r2.A0J(r0)
            if (r3 == 0) goto L_0x0104
            java.lang.String r0 = "canonical"
            java.lang.String r35 = r3.A0N(r0, r1)
        L_0x00bb:
            java.util.List r4 = java.util.Collections.emptyList()
            java.lang.String r0 = "categories"
            java.util.List r0 = r2.A0O(r0)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0107
            r3 = 0
            java.lang.Object r3 = r0.get(r3)
            X.1Vv r3 = (X.C28371Vv) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = "category"
            java.util.List r0 = r3.A0O(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x00e1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r6.next()
            X.1Vv r0 = (X.C28371Vv) r0
            java.lang.String r3 = "id"
            java.lang.String r5 = r0.A0N(r3, r1)
            java.lang.String r3 = r0.A0L()
            if (r5 == 0) goto L_0x00e1
            if (r3 == 0) goto L_0x00e1
            X.1dn r0 = new X.1dn
            r0.<init>(r5, r3)
            r4.add(r0)
            goto L_0x00e1
        L_0x0104:
            r35 = 0
            goto L_0x00bb
        L_0x0107:
            r20.clear()
            r0 = r20
            r0.addAll(r4)
            java.lang.String r0 = "website"
            java.util.List r0 = r2.A0O(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x011f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r4.next()
            X.1Vv r0 = (X.C28371Vv) r0
            java.lang.String r0 = r0.A0L()
            r3.add(r0)
            goto L_0x011f
        L_0x0133:
            r19.clear()
            r0 = r19
            r0.addAll(r3)
            java.lang.String r0 = "business_hours"
            X.1Vv r3 = r2.A0J(r0)
            r12 = 0
            if (r3 == 0) goto L_0x026b
            java.lang.String r0 = "timezone"
            java.lang.String r9 = r3.A0N(r0, r1)     // Catch:{ NumberFormatException -> 0x0263 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ NumberFormatException -> 0x0263 }
            r6.<init>()     // Catch:{ NumberFormatException -> 0x0263 }
            java.lang.String r0 = "business_hours_note"
            X.1Vv r4 = r3.A0J(r0)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x0252
            java.lang.String r0 = r4.A0L()     // Catch:{ NumberFormatException -> 0x0263 }
            if (r0 == 0) goto L_0x0252
            java.lang.String r8 = r4.A0L()     // Catch:{ NumberFormatException -> 0x0263 }
        L_0x0162:
            java.lang.String r0 = "business_hours_config"
            java.util.List r0 = r3.A0O(r0)     // Catch:{ NumberFormatException -> 0x0263 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ NumberFormatException -> 0x0263 }
        L_0x016c:
            boolean r0 = r10.hasNext()     // Catch:{ NumberFormatException -> 0x0263 }
            if (r0 == 0) goto L_0x0255
            java.lang.Object r4 = r10.next()     // Catch:{ NumberFormatException -> 0x0263 }
            X.1Vv r4 = (X.C28371Vv) r4     // Catch:{ NumberFormatException -> 0x0263 }
            java.lang.String r0 = "day_of_week"
            java.lang.String r3 = r4.A0N(r0, r1)     // Catch:{ NumberFormatException -> 0x0263 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ NumberFormatException -> 0x0263 }
            java.lang.String r0 = "mode"
            java.lang.String r0 = r4.A0N(r0, r1)     // Catch:{ NumberFormatException -> 0x0263 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ NumberFormatException -> 0x0263 }
            java.lang.String r5 = "open_time"
            java.lang.String r7 = r4.A0N(r5, r1)     // Catch:{ NumberFormatException -> 0x0263 }
            java.lang.String r5 = "close_time"
            java.lang.String r4 = r4.A0N(r5, r1)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r7 == 0) goto L_0x019d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0263 }
            goto L_0x019e
        L_0x019d:
            r7 = r1
        L_0x019e:
            if (r4 == 0) goto L_0x01a1
            goto L_0x01a3
        L_0x01a1:
            r5 = r1
            goto L_0x01a7
        L_0x01a3:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0263 }
        L_0x01a7:
            int r4 = r3.hashCode()     // Catch:{ NumberFormatException -> 0x0263 }
            switch(r4) {
                case 101661: goto L_0x01c2;
                case 108300: goto L_0x01cc;
                case 113638: goto L_0x01d6;
                case 114252: goto L_0x01e1;
                case 114817: goto L_0x01ec;
                case 115204: goto L_0x01f7;
                case 117590: goto L_0x0202;
                default: goto L_0x01ae;
            }     // Catch:{ NumberFormatException -> 0x0263 }
        L_0x01ae:
            java.lang.String r1 = "Unrecognized week day: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0263 }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x0263 }
            r0.append(r3)     // Catch:{ NumberFormatException -> 0x0263 }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x0263 }
            X.1W9 r1 = new X.1W9     // Catch:{ NumberFormatException -> 0x0263 }
            r1.<init>((java.lang.String) r0)     // Catch:{ NumberFormatException -> 0x0263 }
        L_0x01c1:
            throw r1     // Catch:{ NumberFormatException -> 0x0263 }
        L_0x01c2:
            java.lang.String r4 = "fri"
            boolean r4 = r3.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x01ae
            r3 = 6
            goto L_0x020c
        L_0x01cc:
            java.lang.String r4 = "mon"
            boolean r4 = r3.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x01ae
            r3 = 2
            goto L_0x020c
        L_0x01d6:
            java.lang.String r4 = "sat"
            boolean r4 = r3.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x01ae
            r3 = 7
            goto L_0x020c
        L_0x01e1:
            java.lang.String r4 = "sun"
            boolean r4 = r3.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x01ae
            r3 = 1
            goto L_0x020c
        L_0x01ec:
            java.lang.String r4 = "thu"
            boolean r4 = r3.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x01ae
            r3 = 5
            goto L_0x020c
        L_0x01f7:
            java.lang.String r4 = "tue"
            boolean r4 = r3.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x01ae
            r3 = 3
            goto L_0x020c
        L_0x0202:
            java.lang.String r4 = "wed"
            boolean r4 = r3.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x01ae
            r3 = 4
        L_0x020c:
            int r4 = r0.hashCode()     // Catch:{ NumberFormatException -> 0x0263 }
            switch(r4) {
                case -504372495: goto L_0x0227;
                case 1800267202: goto L_0x0230;
                case 2060249164: goto L_0x023a;
                default: goto L_0x0213;
            }     // Catch:{ NumberFormatException -> 0x0263 }
        L_0x0213:
            java.lang.String r2 = "Unrecognized open mode: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0263 }
            r1.<init>(r2)     // Catch:{ NumberFormatException -> 0x0263 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0263 }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x0263 }
            X.1W9 r1 = new X.1W9     // Catch:{ NumberFormatException -> 0x0263 }
            r1.<init>((java.lang.String) r0)     // Catch:{ NumberFormatException -> 0x0263 }
            goto L_0x01c1
        L_0x0227:
            java.lang.String r4 = "open_24h"
            boolean r4 = r0.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x0213
            goto L_0x0243
        L_0x0230:
            java.lang.String r4 = "specific_hours"
            boolean r4 = r0.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x0213
            goto L_0x0245
        L_0x023a:
            java.lang.String r4 = "appointment_only"
            boolean r4 = r0.equals(r4)     // Catch:{ NumberFormatException -> 0x0263 }
            if (r4 == 0) goto L_0x0213
            goto L_0x0247
        L_0x0243:
            r4 = 1
            goto L_0x0248
        L_0x0245:
            r4 = 0
            goto L_0x0248
        L_0x0247:
            r4 = 2
        L_0x0248:
            X.1ju r0 = new X.1ju     // Catch:{ NumberFormatException -> 0x0263 }
            r0.<init>(r7, r5, r3, r4)     // Catch:{ NumberFormatException -> 0x0263 }
            r6.add(r0)     // Catch:{ NumberFormatException -> 0x0263 }
            goto L_0x016c
        L_0x0252:
            r8 = r1
            goto L_0x0162
        L_0x0255:
            int r0 = r6.size()     // Catch:{ NumberFormatException -> 0x0263 }
            if (r0 <= 0) goto L_0x026b
            X.1mE r16 = new X.1mE     // Catch:{ NumberFormatException -> 0x0263 }
            r0 = r16
            r0.<init>(r9, r8, r6)     // Catch:{ NumberFormatException -> 0x0263 }
            goto L_0x026d
        L_0x0263:
            java.lang.String r1 = "Business hours open/close time failed to parse."
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x026b:
            r16 = r1
        L_0x026d:
            java.lang.String r0 = "catalog_status"
            X.1Vv r3 = r2.A0J(r0)
            if (r3 == 0) goto L_0x0286
            java.lang.String r0 = "status"
            java.lang.String r3 = r3.A0N(r0, r1)
            java.lang.String r0 = "catalog_exists"
            boolean r0 = r0.equals(r3)
            r43 = 1
            if (r0 != 0) goto L_0x0288
        L_0x0286:
            r43 = 0
        L_0x0288:
            java.lang.String r0 = "profile_options"
            X.1Vv r3 = r2.A0J(r0)
            if (r3 == 0) goto L_0x02e0
            java.lang.String r0 = "commerce_experience"
            java.lang.String r1 = A02(r3, r0)
            java.lang.String r0 = "shop"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r47 = 1
            if (r0 == 0) goto L_0x043b
            java.lang.String r0 = "shop_url"
            java.lang.String r33 = A02(r3, r0)
        L_0x02a8:
            java.lang.String r0 = "cart_enabled"
            java.lang.Boolean r0 = A01(r3, r0)
            if (r0 == 0) goto L_0x02b8
            boolean r0 = r0.booleanValue()
            r44 = 1
            if (r0 != 0) goto L_0x02ba
        L_0x02b8:
            r44 = 0
        L_0x02ba:
            java.lang.String r0 = "commerce_manager_url"
            java.lang.String r34 = A02(r3, r0)
            java.lang.String r0 = "is_banned"
            java.lang.Boolean r0 = A01(r3, r0)
            if (r0 == 0) goto L_0x02d0
            boolean r0 = r0.booleanValue()
            r46 = 1
            if (r0 != 0) goto L_0x02d2
        L_0x02d0:
            r46 = 0
        L_0x02d2:
            java.lang.String r0 = "has_galaxy_flows"
            java.lang.Boolean r0 = A01(r3, r0)
            if (r0 == 0) goto L_0x0437
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0437
        L_0x02e0:
            java.lang.String r0 = "custom_url"
            java.lang.String r38 = A02(r2, r0)
            java.lang.String r0 = "linked_accounts"
            X.1Vv r3 = r2.A0J(r0)
            if (r3 != 0) goto L_0x03b0
            r9 = r13
        L_0x02ef:
            java.lang.String r3 = "cover_photo"
            X.1Vv r0 = r2.A0J(r3)
            java.lang.String r4 = A02(r2, r3)
            if (r0 == 0) goto L_0x0301
            java.lang.String r3 = "id"
            java.lang.String r21 = r0.A0N(r3, r13)
        L_0x0301:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x030e
            X.1mA r13 = new X.1mA
            r0 = r21
            r13.<init>(r4, r0)
        L_0x030e:
            java.util.List r5 = java.util.Collections.emptyList()
            java.lang.String r0 = "service_areas"
            java.util.List r3 = r2.A0O(r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0447
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            X.1Vv r0 = (X.C28371Vv) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r3 = "service_area"
            java.util.List r0 = r0.A0O(r3)
            java.util.Iterator r11 = r0.iterator()
        L_0x0336:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0447
            java.lang.Object r0 = r11.next()
            X.1Vv r0 = (X.C28371Vv) r0
            java.lang.String r3 = "area_description"
            X.1Vv r4 = r0.A0J(r3)
            r10 = 0
            if (r4 == 0) goto L_0x03ae
            X.1Vv r3 = r0.A0J(r3)
            java.lang.String r7 = r3.A0L()
        L_0x0353:
            java.lang.String r3 = "area_radius_meters"
            X.1Vv r4 = r0.A0J(r3)
            if (r4 == 0) goto L_0x03ac
            X.1Vv r3 = r0.A0J(r3)
            java.lang.String r8 = r3.A0L()
        L_0x0363:
            java.lang.String r3 = "area_center"
            X.1Vv r0 = r0.A0J(r3)
            if (r0 == 0) goto L_0x0336
            X.1Vv r3 = r0.A0J(r15)
            if (r3 == 0) goto L_0x03aa
            X.1Vv r3 = r0.A0J(r15)
            java.lang.String r4 = r3.A0L()
        L_0x0379:
            X.1Vv r3 = r0.A0J(r14)
            if (r3 == 0) goto L_0x0387
            X.1Vv r0 = r0.A0J(r14)
            java.lang.String r10 = r0.A0L()
        L_0x0387:
            if (r4 == 0) goto L_0x0336
            if (r10 == 0) goto L_0x0336
            if (r8 == 0) goto L_0x0336
            java.lang.Double r6 = java.lang.Double.valueOf(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            if (r3 == 0) goto L_0x0336
            if (r6 == 0) goto L_0x0336
            if (r4 == 0) goto L_0x0336
            if (r7 == 0) goto L_0x0336
            X.1mC r0 = new X.1mC
            r0.<init>(r6, r4, r3, r7)
            r5.add(r0)
            goto L_0x0336
        L_0x03aa:
            r4 = r10
            goto L_0x0379
        L_0x03ac:
            r8 = r10
            goto L_0x0363
        L_0x03ae:
            r7 = r10
            goto L_0x0353
        L_0x03b0:
            java.lang.String r0 = "fb_page"
            X.1Vv r0 = r3.A0J(r0)
            r11 = 1
            java.lang.String r9 = "has_published_media_posts"
            java.lang.String r7 = "id"
            if (r0 == 0) goto L_0x03f3
            java.lang.String r6 = r0.A0N(r7, r13)
            java.lang.String r4 = "display_name"
            java.lang.String r5 = A02(r0, r4)
            java.lang.String r4 = "likes"
            X.1Vv r8 = r0.A0J(r4)
            if (r8 == 0) goto L_0x03de
            java.lang.String r4 = r8.A0L()
            if (r4 == 0) goto L_0x03de
            java.lang.String r4 = r8.A0L()     // Catch:{ NumberFormatException -> 0x03de }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x03de }
            goto L_0x03df
        L_0x03de:
            r4 = 0
        L_0x03df:
            java.lang.Boolean r10 = A01(r0, r9)
            if (r6 == 0) goto L_0x03f3
            if (r5 == 0) goto L_0x03f3
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r0 = 0
            if (r10 != r8) goto L_0x03ed
            r0 = 1
        L_0x03ed:
            X.1m9 r8 = new X.1m9
            r8.<init>(r6, r5, r4, r0)
            goto L_0x03f4
        L_0x03f3:
            r8 = r13
        L_0x03f4:
            java.lang.String r0 = "ig_professional"
            X.1Vv r0 = r3.A0J(r0)
            if (r0 == 0) goto L_0x0430
            java.lang.String r5 = r0.A0N(r7, r13)
            java.lang.String r3 = "ig_handle"
            java.lang.String r4 = A02(r0, r3)
            java.lang.String r3 = "followers"
            X.1Vv r6 = r0.A0J(r3)
            if (r6 == 0) goto L_0x041d
            java.lang.String r3 = r6.A0L()
            if (r3 == 0) goto L_0x041d
            java.lang.String r3 = r6.A0L()     // Catch:{ NumberFormatException -> 0x041d }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x041d }
            goto L_0x041e
        L_0x041d:
            r3 = 0
        L_0x041e:
            java.lang.Boolean r6 = A01(r0, r9)
            if (r5 == 0) goto L_0x0430
            if (r4 == 0) goto L_0x0430
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r6 == r0) goto L_0x042b
            r11 = 0
        L_0x042b:
            X.1m9 r12 = new X.1m9
            r12.<init>(r5, r4, r3, r11)
        L_0x0430:
            X.1m8 r9 = new X.1m8
            r9.<init>(r8, r12)
            goto L_0x02ef
        L_0x0437:
            r47 = 0
            goto L_0x02e0
        L_0x043b:
            java.lang.String r0 = "catalog"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02a8
            r43 = 1
            goto L_0x02a8
        L_0x0447:
            r18.clear()
            r0 = r18
            r0.addAll(r5)
            java.lang.String r0 = "direct_connection"
            X.1Vv r0 = r2.A0J(r0)
            if (r0 == 0) goto L_0x047b
            java.lang.String r4 = "enabled"
            java.lang.String r3 = "false"
            java.lang.String r3 = r0.A0N(r4, r3)
            if (r3 == 0) goto L_0x0465
            boolean r45 = java.lang.Boolean.parseBoolean(r3)
        L_0x0465:
            java.lang.String r3 = "default_postcode"
            X.1Vv r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x047b
            java.lang.String r4 = "code"
            r0 = r22
            java.lang.String r36 = r3.A0N(r4, r0)
            java.lang.String r4 = "location_name"
            java.lang.String r22 = r3.A0N(r4, r0)
        L_0x047b:
            java.lang.String r0 = "member_since_text"
            java.lang.String r39 = A02(r2, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = r20
            r2.<init>(r0)
            java.util.List r40 = java.util.Collections.unmodifiableList(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = r19
            r2.<init>(r0)
            java.util.List r41 = java.util.Collections.unmodifiableList(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = r18
            r2.<init>(r0)
            java.util.List r42 = java.util.Collections.unmodifiableList(r2)
            X.1mD r23 = new X.1mD
            r28 = r48
            r24 = r16
            r25 = r13
            r26 = r9
            r27 = r17
            r32 = r1
            r37 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            return r23
        L_0x04b6:
            java.lang.String r1 = "business latitude/longitude failed to parse"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27m.A00(com.whatsapp.jid.UserJid, X.1Vv):X.1mD");
    }

    public static Boolean A01(C28371Vv r0, String str) {
        C28371Vv A0J = r0.A0J(str);
        if (A0J == null || A0J.A0L() == null) {
            return null;
        }
        return Boolean.valueOf(A0J.A0L().trim().equalsIgnoreCase("true"));
    }

    public static String A02(C28371Vv r0, String str) {
        C28371Vv A0J = r0.A0J(str);
        if (A0J != null) {
            return A0J.A0L();
        }
        return null;
    }
}
