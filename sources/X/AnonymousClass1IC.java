package X;

/* renamed from: X.1IC  reason: invalid class name */
public abstract class AnonymousClass1IC {
    public boolean A00;
    public final C20210zg A01;

    public AnonymousClass1IC(C20210zg r1) {
        this.A01 = r1;
    }

    public String A00() {
        return this instanceof AnonymousClass1IM ? "payment_encrypt_with_public_key" : this instanceof AnonymousClass1IL ? "br_verify_card_check_if_app_exists" : this instanceof AnonymousClass1JJ ? "native_upi_consumer_onboarding" : this instanceof AnonymousClass1JK ? "native_upi_add_payment_method" : this instanceof AnonymousClass1JL ? "native_flow_npci_common_library" : this instanceof AnonymousClass1JI ? "native_p2m_lite_hpp_checkout" : this instanceof AnonymousClass1JH ? "native_p2m_lite_compliance" : this instanceof AnonymousClass1ID ? "native_flow_call_manager" : this instanceof AnonymousClass1IJ ? "client_dasl_query" : this instanceof AnonymousClass1IB ? "abprop_fetch" : this instanceof AnonymousClass1IK ? "send_fds_iq" : this instanceof AnonymousClass1IF ? "dismiss_bottom_sheet" : this instanceof AnonymousClass1JG ? "open_bloks_screen_static" : this instanceof AnonymousClass1IU ? "open_bloks_screen_graphql" : "open_bloks_screen";
    }

    public void A01() {
        this.A00 = true;
    }

    public void A02() {
        if (this instanceof AnonymousClass1JG) {
            AnonymousClass1JG r3 = (AnonymousClass1JG) this;
            String str = r3.A00;
            if (str != null) {
                C20220zh r2 = r3.A01;
                r2.A01.A68(str);
                r2.A04.A00().A02(C1206762o.class, r2);
            }
            AnonymousClass39U A04 = r3.A04();
            A04.A01.A03(A04);
        } else if (this instanceof AnonymousClass1IU) {
            AnonymousClass1IU r32 = (AnonymousClass1IU) this;
            String str2 = r32.A00;
            if (str2 != null) {
                C20220zh r22 = r32.A01;
                r22.A01.A68(str2);
                r22.A04.A00().A02(C1206762o.class, r22);
            }
            AnonymousClass39U A042 = r32.A04();
            A042.A01.A03(A042);
        } else if (this instanceof AnonymousClass1IY) {
            AnonymousClass1IY r33 = (AnonymousClass1IY) this;
            String str3 = r33.A00;
            if (str3 != null) {
                C20220zh r23 = r33.A01;
                r23.A01.A68(str3);
                r23.A04.A00().A02(C1206762o.class, r23);
            }
            AnonymousClass39U A043 = r33.A04();
            A043.A01.A03(A043);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ac, code lost:
        if (r4.length() == 0) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0314, code lost:
        if (r5.equals(r3) == false) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0316, code lost:
        r4 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0322, code lost:
        if (r4.A00.contains(java.lang.Integer.toString(r2)) == false) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0324, code lost:
        switch(r6) {
            case -891985903: goto L_0x0369;
            case 3271912: goto L_0x035c;
            case 64711720: goto L_0x034b;
            case 97526364: goto L_0x033a;
            case 1958052158: goto L_0x0329;
            default: goto L_0x0327;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0327, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x032f, code lost:
        if (r5.equals("integer") == false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0331, code lost:
        r7 = java.lang.Integer.valueOf(r4.A02(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0340, code lost:
        if (r5.equals("float") == false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0342, code lost:
        r7 = java.lang.Float.valueOf(r4.A00(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0351, code lost:
        if (r5.equals("boolean") == false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0353, code lost:
        r7 = java.lang.Boolean.valueOf(r4.A0C(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0362, code lost:
        if (r5.equals("json") == false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0364, code lost:
        r7 = r4.A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0370, code lost:
        if (r5.equals("string") == false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0372, code lost:
        r7 = r4.A05(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass39C r23, X.AnonymousClass4WX r24, java.util.Map r25) {
        /*
            r22 = this;
            r0 = r22
            boolean r2 = r0 instanceof X.AnonymousClass1IM
            r1 = r23
            r13 = r25
            if (r2 == 0) goto L_0x005b
            X.1IM r0 = (X.AnonymousClass1IM) r0
            r6 = 0
            java.lang.String r2 = "data_value"
            java.lang.Object r4 = r13.get(r2)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            if (r4 == 0) goto L_0x04ee
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r2 = "network"
            java.lang.Object r3 = r13.get(r2)
            if (r3 == 0) goto L_0x04e8
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r3.toUpperCase(r2)
            X.C18450wi.A0B(r2)
            java.lang.String r5 = "VISA"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x05cf
            java.lang.String r2 = "PAY: FcsPaymentsDataEncryptionResource getProviderEncryptionKeyAsync"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.5wq r11 = r0.A05
            java.lang.String r12 = "STEP-UP"
            X.50C r3 = r11.A00()
            if (r3 != 0) goto L_0x04e3
            X.0tz r2 = r0.A01
            android.content.Context r7 = r2.A00
            X.0pt r8 = r0.A00
            X.0wU r10 = r0.A04
            X.0wX r9 = r0.A03
            X.5ug r6 = new X.5ug
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.506 r2 = new X.506
            r2.<init>(r1, r0, r4)
            r6.A00(r2, r5)
        L_0x005a:
            return
        L_0x005b:
            boolean r2 = r0 instanceof X.AnonymousClass1IL
            if (r2 == 0) goto L_0x0103
            X.1IL r0 = (X.AnonymousClass1IL) r0
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r13)
            java.lang.String r10 = "data"
            java.lang.Object r2 = r9.get(r10)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
            if (r2 == 0) goto L_0x0502
            java.util.Map r7 = X.C90284dt.A00(r2)
            java.lang.String r6 = "verify_method_list"
            java.lang.Object r5 = r7.get(r6)
            if (r5 == 0) goto L_0x04fa
            java.util.AbstractList r5 = (java.util.AbstractList) r5
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x00fc
            r4 = 0
            int r11 = r5.size()
        L_0x008a:
            if (r4 >= r11) goto L_0x00f6
            int r16 = r4 + 1
            java.lang.Object r2 = r5.get(r4)
            if (r2 == 0) goto L_0x04f4
            java.util.Map r3 = X.C90284dt.A00(r2)
            java.lang.String r2 = "verify_type"
            java.lang.Object r12 = r3.get(r2)
            java.lang.String r2 = "APP_TO_APP"
            boolean r2 = X.C18450wi.A0R(r12, r2)
            if (r2 == 0) goto L_0x0100
            java.lang.String r2 = "source"
            java.lang.Object r12 = r3.get(r2)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r2 = "intent_action"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            X.01Q r2 = X.C119095vw.A00(r12, r2)
            if (r2 == 0) goto L_0x00ec
            java.lang.Object r15 = r2.A00
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r2.A01
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r2 = "request_payload"
            java.lang.Object r13 = r3.get(r2)
            java.lang.String r13 = (java.lang.String) r13
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r2 = "android.intent.extra.TEXT"
            r12.putExtra(r2, r13)
            r12.setPackage(r15)
            r12.setAction(r14)
            X.0tz r2 = r0.A00
            android.content.Context r2 = r2.A00
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.ComponentName r2 = r12.resolveActivity(r2)
            if (r2 != 0) goto L_0x0100
        L_0x00ec:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r0 = "disabled"
            r3.put(r0, r2)
            r5.set(r4, r3)
        L_0x00f6:
            r7.put(r6, r5)
            r9.put(r10, r7)
        L_0x00fc:
            r1.A01(r9)
            return
        L_0x0100:
            r4 = r16
            goto L_0x008a
        L_0x0103:
            boolean r2 = r0 instanceof X.AnonymousClass1JJ
            r9 = r24
            if (r2 == 0) goto L_0x0152
            X.1JJ r0 = (X.AnonymousClass1JJ) r0
            r0.A00 = r1
            java.lang.String r1 = "is_full_screen"
            java.lang.Object r1 = r13.get(r1)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Boolean"
            if (r1 == 0) goto L_0x0514
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r7 = r1.booleanValue()
            java.lang.String r1 = "skip_2fa"
            java.lang.Object r1 = r13.get(r1)
            if (r1 == 0) goto L_0x050e
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r8 = r1.booleanValue()
            java.lang.String r1 = "skip_value_props_screen"
            java.lang.Object r1 = r13.get(r1)
            if (r1 == 0) goto L_0x0508
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
            X.0tz r1 = r0.A02
            android.content.Context r4 = r1.A00
            java.lang.String r3 = r9.A01
            java.lang.String r2 = r0.A01
            if (r2 != 0) goto L_0x0533
            java.lang.String r0 = "observerId"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0152:
            boolean r2 = r0 instanceof X.AnonymousClass1JK
            if (r2 == 0) goto L_0x0171
            X.1JK r0 = (X.AnonymousClass1JK) r0
            r0.A00 = r1
            X.0tz r1 = r0.A02
            android.content.Context r4 = r1.A00
            java.lang.String r3 = r9.A01
            java.lang.String r2 = r0.A01
            if (r2 != 0) goto L_0x051a
            java.lang.String r0 = "observerId"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0171:
            boolean r2 = r0 instanceof X.AnonymousClass1JL
            if (r2 == 0) goto L_0x01db
            X.1JL r0 = (X.AnonymousClass1JL) r0
            r0.A00 = r1
            java.lang.String r1 = "credential_id"
            java.lang.Object r7 = r13.get(r1)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            if (r7 == 0) goto L_0x0569
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r1 = "mode"
            java.lang.Object r6 = r13.get(r1)
            if (r6 == 0) goto L_0x0563
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "npci_common_library_transaction_id"
            java.lang.Object r5 = r13.get(r1)
            boolean r1 = r5 instanceof java.lang.String
            r8 = 0
            if (r1 == 0) goto L_0x01d9
            java.lang.String r5 = (java.lang.String) r5
        L_0x019c:
            java.lang.String r1 = "receiver_handle"
            java.lang.Object r4 = r13.get(r1)
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L_0x01d7
            java.lang.String r4 = (java.lang.String) r4
        L_0x01a8:
            java.lang.String r1 = "receiver_name"
            java.lang.Object r3 = r13.get(r1)
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L_0x01d5
            java.lang.String r3 = (java.lang.String) r3
        L_0x01b4:
            java.lang.String r1 = "amount"
            java.lang.Object r2 = r13.get(r1)
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x01d3
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x01c0:
            X.0sq r1 = r0.A05
            X.56R r8 = new X.56R
            r11 = r2
            r12 = r7
            r13 = r6
            r14 = r5
            r15 = r3
            r16 = r4
            r10 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.Acl(r8)
            return
        L_0x01d3:
            r2 = r8
            goto L_0x01c0
        L_0x01d5:
            r3 = r8
            goto L_0x01b4
        L_0x01d7:
            r4 = r8
            goto L_0x01a8
        L_0x01d9:
            r5 = r8
            goto L_0x019c
        L_0x01db:
            boolean r2 = r0 instanceof X.AnonymousClass1JI
            if (r2 == 0) goto L_0x0234
            X.1JI r0 = (X.AnonymousClass1JI) r0
            r0.A00 = r1
            java.lang.String r2 = "payment_link"
            java.lang.Object r4 = r13.get(r2)
            boolean r2 = r4 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L_0x0232
            java.lang.String r4 = (java.lang.String) r4
        L_0x01f0:
            java.lang.String r2 = "success_url"
            java.lang.Object r5 = r13.get(r2)
            boolean r2 = r5 instanceof java.lang.String
            if (r2 == 0) goto L_0x0230
            java.lang.String r5 = (java.lang.String) r5
        L_0x01fd:
            java.lang.String r2 = "cancel_url"
            java.lang.Object r6 = r13.get(r2)
            boolean r2 = r6 instanceof java.lang.String
            if (r2 == 0) goto L_0x022e
            java.lang.String r6 = (java.lang.String) r6
        L_0x0209:
            java.lang.String r2 = "referral"
            java.lang.Object r7 = r13.get(r2)
            boolean r2 = r7 instanceof java.lang.String
            if (r2 == 0) goto L_0x022c
            java.lang.String r7 = (java.lang.String) r7
        L_0x0215:
            if (r4 == 0) goto L_0x057e
            if (r5 == 0) goto L_0x057e
            X.0zd r1 = r0.A02
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x056f
            java.lang.String r0 = "observerId"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x022c:
            r7 = r3
            goto L_0x0215
        L_0x022e:
            r6 = r3
            goto L_0x0209
        L_0x0230:
            r5 = r3
            goto L_0x01fd
        L_0x0232:
            r4 = r3
            goto L_0x01f0
        L_0x0234:
            boolean r2 = r0 instanceof X.AnonymousClass1JH
            if (r2 == 0) goto L_0x026e
            X.1JH r0 = (X.AnonymousClass1JH) r0
            r0.A00 = r1
            java.lang.String r2 = "account_compliance_status"
            java.lang.Object r5 = r13.get(r2)
            boolean r2 = r5 instanceof java.lang.String
            r4 = 0
            if (r2 == 0) goto L_0x026c
            java.lang.String r5 = (java.lang.String) r5
        L_0x0249:
            java.lang.String r2 = "referral"
            java.lang.Object r3 = r13.get(r2)
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x026a
            java.lang.String r3 = (java.lang.String) r3
        L_0x0255:
            if (r5 == 0) goto L_0x0596
            X.0zd r1 = r0.A02
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x0587
            java.lang.String r0 = "observerId"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x026a:
            r3 = r4
            goto L_0x0255
        L_0x026c:
            r5 = r4
            goto L_0x0249
        L_0x026e:
            boolean r2 = r0 instanceof X.AnonymousClass1ID
            if (r2 == 0) goto L_0x02af
            X.1ID r0 = (X.AnonymousClass1ID) r0
            r5 = 0
            java.lang.String r3 = "phone_number"
            boolean r2 = r13.containsKey(r3)
            if (r2 != 0) goto L_0x0286
            r4 = 0
        L_0x027e:
            r3 = 1
        L_0x027f:
            r2 = 0
            if (r3 == 0) goto L_0x059f
            r1.A00(r2)
            return
        L_0x0286:
            java.lang.Object r4 = r13.get(r3)
            if (r4 == 0) goto L_0x05ba
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "[^\\d+]"
            X.22P r2 = new X.22P
            r2.<init>((java.lang.String) r3)
            java.lang.String r3 = ""
            X.C18450wi.A0H(r4, r5)
            java.util.regex.Pattern r2 = r2.nativePattern
            java.util.regex.Matcher r2 = r2.matcher(r4)
            java.lang.String r4 = r2.replaceAll(r3)
            X.C18450wi.A0B(r4)
            int r2 = r4.length()
            r3 = 0
            if (r2 != 0) goto L_0x027f
            goto L_0x027e
        L_0x02af:
            boolean r2 = r0 instanceof X.AnonymousClass1IJ
            if (r2 == 0) goto L_0x02c7
            X.1IJ r0 = (X.AnonymousClass1IJ) r0
            java.lang.String r2 = "query"
            java.lang.Object r2 = r13.get(r2)
            if (r2 != 0) goto L_0x05c2
            java.lang.String r0 = "No parameters"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r1.A00(r0)
            return
        L_0x02c7:
            boolean r2 = r0 instanceof X.AnonymousClass1IB
            if (r2 == 0) goto L_0x0378
            X.1IB r0 = (X.AnonymousClass1IB) r0
            r8 = 0
            java.lang.String r2 = "code"
            java.lang.Object r2 = r13.get(r2)
            if (r2 == 0) goto L_0x05eb
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = "abprop_type"
            java.lang.Object r5 = r13.get(r3)
            if (r5 == 0) goto L_0x05e3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r3 = "default_value"
            java.lang.Object r7 = r13.get(r3)
            int r6 = r5.hashCode()
            switch(r6) {
                case -891985903: goto L_0x030d;
                case 3271912: goto L_0x030a;
                case 64711720: goto L_0x0307;
                case 97526364: goto L_0x0304;
                case 1958052158: goto L_0x0301;
                default: goto L_0x02f3;
            }
        L_0x02f3:
            r0 = 1
            X.1Jq[] r3 = new X.C25401Jq[r0]
            java.lang.String r2 = "abprop_value"
            X.1Jq r0 = new X.1Jq
            r0.<init>(r2, r7)
            r3[r8] = r0
            goto L_0x05db
        L_0x0301:
            java.lang.String r3 = "integer"
            goto L_0x0310
        L_0x0304:
            java.lang.String r3 = "float"
            goto L_0x0310
        L_0x0307:
            java.lang.String r3 = "boolean"
            goto L_0x0310
        L_0x030a:
            java.lang.String r3 = "json"
            goto L_0x0310
        L_0x030d:
            java.lang.String r3 = "string"
        L_0x0310:
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x02f3
            X.0pd r4 = r0.A00
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r0 = java.lang.Integer.toString(r2)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x02f3
            switch(r6) {
                case -891985903: goto L_0x0369;
                case 3271912: goto L_0x035c;
                case 64711720: goto L_0x034b;
                case 97526364: goto L_0x033a;
                case 1958052158: goto L_0x0329;
                default: goto L_0x0327;
            }
        L_0x0327:
            r7 = 0
            goto L_0x02f3
        L_0x0329:
            java.lang.String r0 = "integer"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0327
            int r0 = r4.A02(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x02f3
        L_0x033a:
            java.lang.String r0 = "float"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0327
            float r0 = r4.A00(r2)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            goto L_0x02f3
        L_0x034b:
            java.lang.String r0 = "boolean"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0327
            boolean r0 = r4.A0C(r2)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            goto L_0x02f3
        L_0x035c:
            java.lang.String r0 = "json"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0327
            org.json.JSONObject r7 = r4.A07(r2)
            goto L_0x02f3
        L_0x0369:
            java.lang.String r0 = "string"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0327
            java.lang.String r7 = r4.A05(r2)
            goto L_0x02f3
        L_0x0378:
            boolean r2 = r0 instanceof X.AnonymousClass1IK
            if (r2 == 0) goto L_0x0400
            X.1IK r0 = (X.AnonymousClass1IK) r0
            X.0vk r2 = r0.A00
            java.lang.String r0 = r9.A01
            X.0vu r6 = r2.A00(r0)
            r7 = 0
            if (r6 != 0) goto L_0x0392
            java.lang.String r0 = "FdsIqResource/execute: can't find FdsManager from the job_id"
        L_0x038b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1.A00(r7)
            return
        L_0x0392:
            java.lang.String r0 = "config"
            java.lang.Object r5 = r13.get(r0)
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L_0x03fd
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x03fd
            X.418[] r10 = X.AnonymousClass418.values()
            r9 = 0
            int r8 = r10.length
        L_0x03a6:
            if (r9 >= r8) goto L_0x03fa
            r4 = r10[r9]
            int r9 = r9 + 1
            java.lang.String r3 = r4.name()
            java.lang.String r0 = "type"
            java.lang.Object r2 = r13.get(r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x03f8
            java.lang.String r2 = (java.lang.String) r2
        L_0x03bd:
            if (r3 != 0) goto L_0x03f1
            if (r2 != 0) goto L_0x03a6
        L_0x03c1:
            java.lang.String r0 = "state"
            java.lang.Object r3 = r13.get(r0)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x03ef
            java.lang.String r3 = (java.lang.String) r3
        L_0x03ce:
            java.lang.String r0 = "parameters"
            java.lang.Object r2 = r13.get(r0)
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L_0x03e1
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x03e1
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r2)
        L_0x03e1:
            X.4W4 r2 = new X.4W4
            r2.<init>(r7, r5, r3)
            X.510 r0 = new X.510
            r0.<init>(r1, r6)
            r6.A05(r0, r4, r2)
            return
        L_0x03ef:
            r3 = r7
            goto L_0x03ce
        L_0x03f1:
            boolean r0 = r3.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x03a6
            goto L_0x03c1
        L_0x03f8:
            r2 = r7
            goto L_0x03bd
        L_0x03fa:
            java.lang.String r0 = "FdsIqResource/execute: type can't be null"
            goto L_0x038b
        L_0x03fd:
            java.lang.String r0 = "FdsIqResource/execute: config can't be null"
            goto L_0x038b
        L_0x0400:
            boolean r2 = r0 instanceof X.AnonymousClass1IF
            if (r2 == 0) goto L_0x041a
            X.1IF r0 = (X.AnonymousClass1IF) r0
            X.0zd r2 = r0.A01
            java.lang.String r0 = r0.A00
            r4 = 0
            if (r0 != 0) goto L_0x05f3
            java.lang.String r0 = "observerId"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x041a:
            boolean r2 = r0 instanceof X.AnonymousClass1JG
            if (r2 == 0) goto L_0x0462
            X.1JG r0 = (X.AnonymousClass1JG) r0
            java.lang.String r4 = r9.A01
            r0.A00 = r4
            java.lang.String r12 = r9.A02
            X.1Jq r3 = new X.1Jq
            r3.<init>(r4, r12)
            X.0zi r2 = r0.A02
            r2.A00 = r3
            X.0zh r2 = r0.A01
            int r15 = r9.A00
            r16 = r2
            r17 = r1
            r18 = r4
            r19 = r13
            r20 = r3
            r21 = r15
            boolean r1 = r16.A02(r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = "presentation"
            java.lang.Object r1 = r13.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            X.38L r11 = new X.38L
            r11.<init>(r1)
            X.39U r10 = r0.A04()
            boolean r0 = r9.A04
            java.util.Map r14 = X.AnonymousClass1JG.A00(r13)
        L_0x045c:
            r16 = r0
            r10.A01(r11, r12, r13, r14, r15, r16)
            return
        L_0x0462:
            boolean r2 = r0 instanceof X.AnonymousClass1IU
            if (r2 == 0) goto L_0x04a3
            X.1IU r0 = (X.AnonymousClass1IU) r0
            int r15 = r9.A00
            java.lang.String r4 = r9.A01
            r0.A00 = r4
            java.lang.String r12 = r9.A02
            X.1Jq r3 = new X.1Jq
            r3.<init>(r4, r12)
            X.0zi r2 = r0.A02
            r2.A00 = r3
            X.0zh r2 = r0.A01
            r16 = r2
            r17 = r1
            r18 = r4
            r19 = r13
            r20 = r3
            r21 = r15
            boolean r1 = r16.A02(r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = "presentation"
            java.lang.Object r1 = r13.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            X.38L r11 = new X.38L
            r11.<init>(r1)
            X.39U r10 = r0.A04()
            boolean r0 = r9.A04
            X.1Z8 r14 = X.AnonymousClass1Z8.A00
            goto L_0x045c
        L_0x04a3:
            X.1IY r0 = (X.AnonymousClass1IY) r0
            java.lang.String r4 = r9.A01
            r0.A00 = r4
            java.lang.String r12 = r9.A02
            X.1Jq r3 = new X.1Jq
            r3.<init>(r4, r12)
            X.0zi r2 = r0.A02
            r2.A00 = r3
            X.0zh r2 = r0.A01
            int r15 = r9.A00
            r16 = r2
            r17 = r1
            r18 = r4
            r19 = r13
            r20 = r3
            r21 = r15
            boolean r1 = r16.A02(r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = "presentation"
            java.lang.Object r1 = r13.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            X.38L r11 = new X.38L
            r11.<init>(r1)
            X.39U r10 = r0.A04()
            boolean r0 = r9.A04
            java.util.Map r14 = X.AnonymousClass1IY.A00(r13)
            goto L_0x045c
        L_0x04e3:
            r2 = 0
            r0.A04(r2, r3, r1, r4)
            return
        L_0x04e8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x04ee:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x04f4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r8)
            throw r0
        L_0x04fa:
            java.lang.String r1 = "null cannot be cast to non-null type net.minidev.json.JSONArray"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0502:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r8)
            throw r0
        L_0x0508:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x050e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0514:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x051a:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity"
            r5.setClassName(r1, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r5.putExtra(r0, r3)
            java.lang.String r0 = "extra_fcs_observer_id"
            r5.putExtra(r0, r2)
            goto L_0x055a
        L_0x0533:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity"
            r5.setClassName(r1, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r5.putExtra(r0, r3)
            java.lang.String r0 = "extra_fcs_observer_id"
            r5.putExtra(r0, r2)
            java.lang.String r0 = "extra_onboarding_skip_2fa"
            r5.putExtra(r0, r8)
            java.lang.String r0 = "extra_is_full_screen"
            r5.putExtra(r0, r7)
            java.lang.String r0 = "extra_skip_value_props_screen"
            r5.putExtra(r0, r6)
        L_0x055a:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)
            r4.startActivity(r5)
            return
        L_0x0563:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0569:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x056f:
            X.2dh r0 = r1.A02(r0)
            java.lang.String r3 = r9.A01
            X.52j r2 = new X.52j
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A01(r2)
            return
        L_0x057e:
            java.lang.String r0 = "NativeP2mLiteHppCheckoutResource/execute: paymentLink and successUrl can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1.A00(r3)
            return
        L_0x0587:
            X.2dh r2 = r1.A02(r0)
            java.lang.String r1 = r9.A01
            X.52h r0 = new X.52h
            r0.<init>(r5, r1, r3)
            r2.A01(r0)
            return
        L_0x0596:
            java.lang.String r0 = "NativeP2mLiteDoComplianceResource/execute: inputComplianceStatus can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1.A00(r4)
            return
        L_0x059f:
            java.lang.String r1 = "tel"
            android.net.Uri r3 = android.net.Uri.fromParts(r1, r4, r2)
            java.lang.String r1 = "android.intent.action.DIAL"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r1, r3)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r1)
            X.0tz r0 = r0.A00
            android.content.Context r0 = r0.A00
            r0.startActivity(r2)
            return
        L_0x05ba:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x05c2:
            X.0sq r4 = r0.A02
            r3 = 39
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r2 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r2.<init>(r13, r0, r1, r3)
            r4.Aco(r2)
            return
        L_0x05cf:
            r0 = 1
            X.1Jq[] r3 = new X.C25401Jq[r0]
            java.lang.String r2 = "data"
            X.1Jq r0 = new X.1Jq
            r0.<init>(r2, r4)
            r3[r6] = r0
        L_0x05db:
            java.util.Map r0 = X.C25411Jr.A06(r3)
            r1.A01(r0)
            return
        L_0x05e3:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x05eb:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x05f3:
            X.2dh r3 = r2.A02(r0)
            r2 = 0
            X.62u r0 = new X.62u
            r0.<init>(r4, r4, r2)
            r3.A01(r0)
            r1.A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IC.A03(X.39C, X.4WX, java.util.Map):void");
    }
}
