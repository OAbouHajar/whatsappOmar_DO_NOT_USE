package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5xC  reason: invalid class name */
public class AnonymousClass5xC {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C35431lv A05;
    public C35301lh A06;
    public C35301lh A07;
    public C35301lh A08;
    @Deprecated
    public C35301lh A09;
    public C35301lh A0A;
    public AnonymousClass5x8 A0B;
    public AnonymousClass5xB A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public AnonymousClass5wO[] A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019e, code lost:
        if (r3.equals(r1) == false) goto L_0x01a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5xC(X.AnonymousClass173 r14, X.C28371Vv r15) {
        /*
            r13 = this;
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r13.<init>()
            r2 = 1
            r13.A0L = r2
            java.lang.String r0 = "mandate-no"
            r6 = 0
            java.lang.String r3 = r15.A0N(r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0021
            X.2gP r1 = X.C110105dW.A0L()
            java.lang.String r0 = "mandateNo"
            X.1lh r0 = X.C110105dW.A0J(r1, r4, r3, r0)
            r13.A08 = r0
        L_0x0021:
            java.lang.String r0 = "amount-rule"
            java.lang.String r1 = r15.A0N(r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002f
            r13.A0F = r1
        L_0x002f:
            java.lang.String r0 = "is-revocable"
            java.lang.String r0 = r15.A0N(r0, r6)
            r5 = 0
            if (r0 == 0) goto L_0x0041
            int r0 = X.C29501aj.A00(r0, r5)
            if (r0 == r2) goto L_0x003f
            r2 = 0
        L_0x003f:
            r13.A0M = r2
        L_0x0041:
            java.lang.String r0 = "mandate-name"
            java.lang.String r2 = r15.A0N(r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0059
            X.2gP r1 = X.C110105dW.A0L()
            java.lang.String r0 = "mandateName"
            X.1lh r0 = X.C110105dW.A0J(r1, r4, r2, r0)
            r13.A07 = r0
        L_0x0059:
            java.lang.String r0 = "purpose-code"
            java.lang.String r2 = r15.A0N(r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0071
            X.2gP r1 = X.C110105dW.A0L()
            java.lang.String r0 = "upiPurposeCode"
            X.1lh r0 = X.C110105dW.A0J(r1, r4, r2, r0)
            r13.A0A = r0
        L_0x0071:
            java.lang.String r0 = "start-ts"
            java.lang.String r2 = r15.A0N(r0, r6)
            r7 = 1000(0x3e8, double:4.94E-321)
            r0 = 0
            if (r2 == 0) goto L_0x0084
            long r2 = X.C29501aj.A01(r2, r0)
            long r2 = r2 * r7
            r13.A02 = r2
        L_0x0084:
            java.lang.String r2 = "end-ts"
            java.lang.String r2 = r15.A0N(r2, r6)
            if (r2 == 0) goto L_0x0093
            long r2 = X.C29501aj.A01(r2, r0)
            long r2 = r2 * r7
            r13.A01 = r2
        L_0x0093:
            java.lang.String r2 = "debit-ts"
            java.lang.String r2 = r15.A0N(r2, r6)
            if (r2 == 0) goto L_0x009d
            r13.A0D = r2
        L_0x009d:
            java.lang.String r2 = "next-payment-ts"
            java.lang.String r2 = r15.A0N(r2, r6)
            if (r2 == 0) goto L_0x00ac
            long r2 = X.C29501aj.A01(r2, r0)
            long r2 = r2 * r7
            r13.A04 = r2
        L_0x00ac:
            java.lang.String r2 = "next-payment-end-ts"
            java.lang.String r2 = r15.A0N(r2, r6)
            if (r2 == 0) goto L_0x00bb
            long r0 = X.C29501aj.A01(r2, r0)
            long r0 = r0 * r7
            r13.A03 = r0
        L_0x00bb:
            java.lang.String r0 = "error-code"
            java.lang.String r0 = r15.A0N(r0, r6)
            if (r0 == 0) goto L_0x00c5
            r13.A0G = r0
        L_0x00c5:
            java.lang.String r0 = "original-amount"
            X.1Vv r1 = r15.A0J(r0)
            java.lang.String r2 = "moneyStringValue"
            if (r1 != 0) goto L_0x00e0
            java.lang.String r1 = r15.A0N(r0, r6)
            if (r1 == 0) goto L_0x0106
            X.2gP r0 = X.C110105dW.A0L()
            X.1lh r0 = X.C110105dW.A0J(r0, r4, r1, r2)
            r13.A09 = r0
            goto L_0x0106
        L_0x00e0:
            java.lang.String r0 = "money"
            X.1Vv r1 = r1.A0J(r0)
            if (r1 == 0) goto L_0x0106
            X.1lv r0 = X.C110105dW.A0H(r14, r1)     // Catch:{ Exception -> 0x0101 }
            r13.A05 = r0     // Catch:{ Exception -> 0x0101 }
            X.2gP r1 = X.C110105dW.A0L()     // Catch:{ Exception -> 0x0101 }
            X.1Vy r0 = r0.A02     // Catch:{ Exception -> 0x0101 }
            java.math.BigDecimal r0 = r0.A00     // Catch:{ Exception -> 0x0101 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0101 }
            X.1lh r0 = X.C110105dW.A0J(r1, r4, r0, r2)     // Catch:{ Exception -> 0x0101 }
            r13.A09 = r0     // Catch:{ Exception -> 0x0101 }
            goto L_0x0106
        L_0x0101:
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0106:
            java.lang.String r0 = "total-expected-txns"
            int r0 = r15.A0A(r0, r5)     // Catch:{ 1W9 -> 0x0145 }
            r13.A00 = r0     // Catch:{ 1W9 -> 0x0145 }
            java.lang.String r0 = "pause-resume-status-details"
            X.1Vv r1 = r15.A0J(r0)     // Catch:{ 1W9 -> 0x0145 }
            if (r1 == 0) goto L_0x011d
            X.5x8 r0 = new X.5x8     // Catch:{ 1W9 -> 0x0145 }
            r0.<init>((X.C28371Vv) r1)     // Catch:{ 1W9 -> 0x0145 }
            r13.A0B = r0     // Catch:{ 1W9 -> 0x0145 }
        L_0x011d:
            java.lang.String r0 = "transaction"
            java.util.List r6 = r15.A0O(r0)     // Catch:{ 1W9 -> 0x0145 }
            boolean r0 = r6.isEmpty()     // Catch:{ 1W9 -> 0x0145 }
            if (r0 != 0) goto L_0x014a
            int r3 = r6.size()     // Catch:{ 1W9 -> 0x0145 }
            X.5wO[] r0 = new X.AnonymousClass5wO[r3]     // Catch:{ 1W9 -> 0x0145 }
            r13.A0O = r0     // Catch:{ 1W9 -> 0x0145 }
        L_0x0131:
            if (r5 >= r3) goto L_0x014a
            X.5wO[] r2 = r13.A0O     // Catch:{ 1W9 -> 0x0145 }
            java.lang.Object r1 = r6.get(r5)     // Catch:{ 1W9 -> 0x0145 }
            X.1Vv r1 = (X.C28371Vv) r1     // Catch:{ 1W9 -> 0x0145 }
            X.5wO r0 = new X.5wO     // Catch:{ 1W9 -> 0x0145 }
            r0.<init>((X.C28371Vv) r1)     // Catch:{ 1W9 -> 0x0145 }
            r2[r5] = r0     // Catch:{ 1W9 -> 0x0145 }
            int r5 = r5 + 1
            goto L_0x0131
        L_0x0145:
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata - and error occurred while parsing recurring mandate info"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x014a:
            java.lang.String r0 = "mandate-info"
            r3 = 0
            java.lang.String r2 = r15.A0N(r0, r3)
            if (r2 == 0) goto L_0x015f
            X.2gP r1 = X.C110105dW.A0L()
            java.lang.String r0 = "mandateInfo"
            X.1lh r0 = X.C110105dW.A0J(r1, r4, r2, r0)
            r13.A06 = r0
        L_0x015f:
            java.lang.String r0 = "frequency-rule"
            java.lang.String r12 = r15.A0N(r0, r3)
            java.lang.String r3 = "UNKNOWN"
            if (r12 == 0) goto L_0x0184
            int r0 = r12.hashCode()
            java.lang.String r11 = "MONTHLY"
            java.lang.String r10 = "ASPRESENTED"
            java.lang.String r9 = "QUARTERLY"
            java.lang.String r8 = "BIMONTHLY"
            java.lang.String r7 = "FORTNIGHTLY"
            java.lang.String r6 = "HALFYEARLY"
            java.lang.String r5 = "DAILY"
            java.lang.String r4 = "ONETIME"
            java.lang.String r2 = "YEARLY"
            java.lang.String r1 = "WEEKLY"
            switch(r0) {
                case -1738378111: goto L_0x020e;
                case -1681232246: goto L_0x0205;
                case -602281453: goto L_0x01fd;
                case 64808441: goto L_0x01f5;
                case 1134556285: goto L_0x01ed;
                case 1271097434: goto L_0x01e5;
                case 1297843654: goto L_0x01dd;
                case 1720567065: goto L_0x01d5;
                case 1896178312: goto L_0x01cd;
                case 1954618349: goto L_0x01c5;
                default: goto L_0x0184;
            }
        L_0x0184:
            r13.A0E = r3
            java.lang.String r0 = "recurrence-rule"
            java.lang.String r3 = X.C28371Vv.A05(r15, r0)
            java.lang.String r2 = "ON"
            if (r3 == 0) goto L_0x01a0
            java.lang.String r1 = "AFTER"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x01c3
            java.lang.String r1 = "BEFORE"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x01c3
        L_0x01a0:
            r13.A0J = r2
            java.lang.String r0 = "recurrence-day"
            r1 = 0
            java.lang.String r0 = r15.A0N(r0, r1)
            r13.A0I = r0
            java.lang.String r0 = "ref-id"
            java.lang.String r0 = r15.A0N(r0, r1)
            r13.A0K = r0
            java.lang.String r0 = "mandate-update"
            X.1Vv r1 = r15.A0J(r0)
            if (r1 == 0) goto L_0x01c2
            X.5xB r0 = new X.5xB
            r0.<init>(r14, r1)
            r13.A0C = r0
        L_0x01c2:
            return
        L_0x01c3:
            r2 = r1
            goto L_0x01a0
        L_0x01c5:
            boolean r0 = r12.equals(r11)
            if (r0 == 0) goto L_0x0184
            r3 = r11
            goto L_0x0184
        L_0x01cd:
            boolean r0 = r12.equals(r10)
            if (r0 == 0) goto L_0x0184
            r3 = r10
            goto L_0x0184
        L_0x01d5:
            boolean r0 = r12.equals(r9)
            if (r0 == 0) goto L_0x0184
            r3 = r9
            goto L_0x0184
        L_0x01dd:
            boolean r0 = r12.equals(r8)
            if (r0 == 0) goto L_0x0184
            r3 = r8
            goto L_0x0184
        L_0x01e5:
            boolean r0 = r12.equals(r7)
            if (r0 == 0) goto L_0x0184
            r3 = r7
            goto L_0x0184
        L_0x01ed:
            boolean r0 = r12.equals(r6)
            if (r0 == 0) goto L_0x0184
            r3 = r6
            goto L_0x0184
        L_0x01f5:
            boolean r0 = r12.equals(r5)
            if (r0 == 0) goto L_0x0184
            r3 = r5
            goto L_0x0184
        L_0x01fd:
            boolean r0 = r12.equals(r4)
            if (r0 == 0) goto L_0x0184
            r3 = r4
            goto L_0x0184
        L_0x0205:
            boolean r0 = r12.equals(r2)
            if (r0 == 0) goto L_0x0184
            r3 = r2
            goto L_0x0184
        L_0x020e:
            boolean r0 = r12.equals(r1)
            if (r0 == 0) goto L_0x0184
            r3 = r1
            goto L_0x0184
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xC.<init>(X.173, X.1Vv):void");
    }

    public AnonymousClass5xC(String str) {
        JSONArray jSONArray;
        int length;
        C35431lv r0;
        C28411Vz r7 = null;
        long j2 = 0;
        Class<String> cls = String.class;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A0K2 = C13700nu.A0K(str);
                this.A0L = A0K2.optBoolean("isMandate", false);
                this.A0M = A0K2.optBoolean("isRevocable", false);
                this.A0N = A0K2.optBoolean("isShareToPayee", false);
                this.A02 = A0K2.optLong("mandateStartTs", this.A02);
                this.A01 = A0K2.optLong("mandateEndTs", this.A01);
                this.A0D = A0K2.optString("debitTs", this.A0D);
                this.A0H = A0K2.optString("previousDebitTs", this.A0H);
                this.A04 = A0K2.optLong("nextPaymentTs", this.A04);
                this.A03 = A0K2.optLong("nextPaymentEndTs", this.A03);
                this.A00 = A0K2.optInt("totalRecurringTxnCount", this.A00);
                this.A0F = A0K2.optString("mandateAmountRule", this.A0F);
                C53852gP A0L2 = C110105dW.A0L();
                C35301lh r02 = this.A09;
                this.A09 = C110105dW.A0J(A0L2, cls, A0K2.optString("originalAmount", (String) (r02 == null ? null : r02.A00)), "moneyStringValue");
                if (A0K2.has("originalMoney")) {
                    JSONObject optJSONObject = A0K2.optJSONObject("originalMoney");
                    if (optJSONObject != null) {
                        j2 = optJSONObject.optLong("value", -1);
                        int optInt = optJSONObject.optInt("offset", -1);
                        int optInt2 = optJSONObject.optInt("currencyType", -1);
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("currency");
                        r7 = optJSONObject2 != null ? optInt2 != 1 ? new C35481m0(optJSONObject2) : new C35531m5(optJSONObject2) : C35481m0.A06;
                        if (optInt > 0) {
                            r0 = new C35431lv(r7, optInt, j2);
                            this.A05 = r0;
                        }
                    }
                    r0 = new C35431lv(r7, 1, j2);
                    this.A05 = r0;
                }
                C53852gP A0L3 = C110105dW.A0L();
                C35301lh r03 = this.A08;
                this.A08 = C110105dW.A0J(A0L3, cls, A0K2.optString("mandateNo", (String) (r03 == null ? null : r03.A00)), "mandateNo");
                C53852gP A0L4 = C110105dW.A0L();
                C35301lh r04 = this.A07;
                this.A07 = C110105dW.A0J(A0L4, cls, A0K2.optString("mandateName", (String) (r04 == null ? null : r04.A00)), "mandateName");
                C53852gP A0L5 = C110105dW.A0L();
                C35301lh r05 = this.A0A;
                this.A0A = C110105dW.A0J(A0L5, cls, A0K2.optString("upiPurposeCode", (String) (r05 == null ? null : r05.A00)), "upiPurposeCode");
                this.A0G = A0K2.optString("mandateErrorCode", this.A0G);
                C53852gP A0L6 = C110105dW.A0L();
                C35301lh r06 = this.A06;
                this.A06 = C110105dW.A0J(A0L6, cls, A0K2.optString("mandateInfo", (String) (r06 == null ? null : r06.A00)), "mandateInfo");
                this.A0E = A0K2.optString("frequencyRule", this.A0E);
                this.A0J = A0K2.optString("recurrenceRule", this.A0J);
                this.A0I = A0K2.optString("recurrenceDay", this.A0I);
                this.A0K = A0K2.optString("refId", this.A0K);
                if (A0K2.has("pendingMandateUpdate")) {
                    this.A0C = new AnonymousClass5xB(A0K2.optString("pendingMandateUpdate", (String) null));
                }
                if (A0K2.has("pauseResumeStatusDetails")) {
                    this.A0B = new AnonymousClass5x8(A0K2.optString("pauseResumeStatusDetails", (String) null));
                }
                if (A0K2.has("instanceTransactions") && (length = jSONArray.length()) > 0) {
                    this.A0O = new AnonymousClass5wO[length];
                    int i2 = 0;
                    while (true) {
                        this.A0O[i2] = new AnonymousClass5wO((jSONArray = new JSONArray(A0K2.optString("instanceTransactions", "[]"))).get(i2).toString());
                        i2++;
                        if (i2 >= length) {
                            return;
                        }
                    }
                }
            } catch (JSONException e2) {
                Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata threw: ", e2);
            }
        }
    }

    public AnonymousClass5xC(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, boolean z2, boolean z3) {
        Class<String> cls = String.class;
        this.A0L = true;
        this.A0M = z2;
        this.A0N = z3;
        this.A02 = j2;
        this.A01 = j3;
        this.A0F = str;
        C35301lh r3 = null;
        this.A08 = str2 != null ? C39841t9.A00(str2, "mandateNo") : null;
        this.A07 = str3 != null ? C110105dW.A0J(C110105dW.A0L(), cls, str3, "mandateName") : null;
        this.A0A = str4 != null ? C110105dW.A0J(C110105dW.A0L(), cls, str4, "upiPurposeCode") : null;
        this.A09 = str5 != null ? C110105dW.A0J(C110105dW.A0L(), cls, str5, "moneyStringValue") : r3;
        this.A0E = str6;
        this.A0J = str7;
        this.A0I = str8;
        this.A0K = str9;
    }

    public int A00() {
        AnonymousClass5x8 r7 = this.A0B;
        if (r7 != null) {
            String str = r7.A02;
            if (!str.equals("RESUME")) {
                if (str.equals("PAUSE")) {
                    String str2 = r7.A03;
                    switch (str2.hashCode()) {
                        case -1149187101:
                            if (str2.equals("SUCCESS")) {
                                return 2;
                            }
                            break;
                        case -368591510:
                            if (str2.equals("FAILURE")) {
                                return 3;
                            }
                            break;
                        case 35394935:
                            if (str2.equals("PENDING")) {
                                return 1;
                            }
                            break;
                    }
                }
            }
            String str3 = r7.A03;
            switch (str3.hashCode()) {
                case -1149187101:
                    if (str3.equals("SUCCESS")) {
                        return 5;
                    }
                    break;
                case -368591510:
                    if (str3.equals("FAILURE")) {
                        return 6;
                    }
                    break;
                case 35394935:
                    if (str3.equals("PENDING")) {
                        return 4;
                    }
                    break;
            }
        }
        return 0;
    }

    public String A01() {
        String str;
        String str2;
        String str3;
        try {
            JSONObject A0J2 = C13700nu.A0J();
            A0J2.put("isMandate", this.A0L);
            A0J2.put("isRevocable", this.A0M);
            A0J2.put("isShareToPayee", this.A0N);
            long j2 = this.A02;
            if (j2 > 0) {
                A0J2.put("mandateStartTs", j2);
            }
            long j3 = this.A01;
            if (j3 > 0) {
                A0J2.put("mandateEndTs", j3);
            }
            String str4 = this.A0F;
            if (str4 != null) {
                A0J2.put("mandateAmountRule", str4);
            }
            C35301lh r1 = this.A08;
            if (r1 != null) {
                C110115dX.A11(r1, "mandateNo", A0J2);
            }
            C35301lh r12 = this.A07;
            if (r12 != null) {
                C110115dX.A11(r12, "mandateName", A0J2);
            }
            C35301lh r13 = this.A0A;
            if (r13 != null) {
                C110115dX.A11(r13, "upiPurposeCode", A0J2);
            }
            String str5 = this.A0G;
            if (str5 != null) {
                A0J2.put("mandateErrorCode", str5);
            }
            C35301lh r14 = this.A09;
            if (!C39841t9.A04(r14)) {
                C110115dX.A11(r14, "originalAmount", A0J2);
            }
            C35431lv r0 = this.A05;
            if (r0 != null) {
                A0J2.put("originalMoney", r0.A01());
            }
            AnonymousClass5xB r2 = this.A0C;
            if (r2 != null) {
                try {
                    JSONObject A0J3 = C13700nu.A0J();
                    C35301lh r15 = r2.A03;
                    if (r15 != null) {
                        C110115dX.A11(r15, "pendingAmount", A0J3);
                    }
                    C35431lv r02 = r2.A01;
                    if (r02 != null) {
                        A0J3.put("pendingMoney", r02.A01());
                    }
                    String str6 = r2.A06;
                    if (str6 != null) {
                        A0J3.put("isRevocable", str6);
                    }
                    long j4 = r2.A00;
                    if (j4 > 0) {
                        A0J3.put("mandateEndTs", j4);
                    }
                    String str7 = r2.A07;
                    if (str7 != null) {
                        A0J3.put("mandateAmountRule", str7);
                    }
                    C35301lh r5 = r2.A04;
                    if (!C39841t9.A04(r5)) {
                        A0J3.put("seqNum", r5 == null ? null : r5.A00);
                    }
                    String str8 = r2.A05;
                    if (str8 != null) {
                        A0J3.put("errorCode", str8);
                    }
                    String str9 = r2.A09;
                    if (str9 != null) {
                        A0J3.put("mandateUpdateStatus", str9);
                    }
                    String str10 = r2.A08;
                    if (str10 != null) {
                        A0J3.put("mandateUpdateAction", str10);
                    }
                    C35301lh r22 = r2.A02;
                    if (!C39841t9.A04(r22)) {
                        A0J3.put("mandateUpdateInfo", r22 == null ? null : r22.A00);
                    }
                    str3 = A0J3.toString();
                } catch (JSONException e2) {
                    Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata toJsonString threw: ", e2);
                    str3 = null;
                }
                A0J2.put("pendingMandateUpdate", str3);
            }
            C35301lh r16 = this.A06;
            if (r16 != null) {
                C110115dX.A11(r16, "mandateInfo", A0J2);
            }
            String str11 = this.A0E;
            if (str11 != null) {
                A0J2.put("frequencyRule", str11);
            }
            String str12 = this.A0J;
            if (str12 != null) {
                A0J2.put("recurrenceRule", str12);
            }
            String str13 = this.A0I;
            if (str13 != null) {
                A0J2.put("recurrenceDay", str13);
            }
            String str14 = this.A0K;
            if (str14 != null) {
                A0J2.put("refId", str14);
            }
            int i2 = this.A00;
            if (i2 > 0) {
                A0J2.put("totalRecurringTxnCount", i2);
            }
            String str15 = this.A0D;
            if (str15 != null) {
                A0J2.put("debitTs", str15);
            }
            String str16 = this.A0H;
            if (str16 != null) {
                A0J2.put("previousDebitTs", str16);
            }
            long j5 = this.A04;
            if (j5 > 0) {
                A0J2.put("nextPaymentTs", j5);
            }
            long j6 = this.A03;
            if (j6 > 0) {
                A0J2.put("nextPaymentEndTs", j6);
            }
            AnonymousClass5x8 r52 = this.A0B;
            if (r52 != null) {
                JSONObject A0J4 = C13700nu.A0J();
                try {
                    A0J4.put("action", r52.A02);
                    A0J4.put("status", r52.A03);
                    A0J4.put("pauseStartTs", r52.A01);
                    A0J4.put("pauseEndTs", r52.A00);
                    str2 = A0J4.toString();
                } catch (JSONException e3) {
                    Log.w("PAY: IndiaUpiMandateMetadata:PauseResumeStatusDetails toJsonString threw: ", e3);
                    str2 = null;
                }
                A0J2.put("pauseResumeStatusDetails", str2);
            }
            AnonymousClass5wO[] r03 = this.A0O;
            if (r03 != null && r03.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (AnonymousClass5wO r3 : this.A0O) {
                    JSONObject A0J5 = C13700nu.A0J();
                    try {
                        C35301lh r04 = r3.A00;
                        A0J5.put("id", r04 == null ? null : r04.A00);
                        str = C110115dX.A0f(r3.A01, "status", A0J5);
                    } catch (JSONException e4) {
                        Log.w("PAY: IndiaUpiMandateMetadata:InstanceTransaction toJsonString threw: ", e4);
                        str = null;
                    }
                    jSONArray.put(str);
                }
                A0J2.put("instanceTransactions", jSONArray);
            }
            return A0J2.toString();
        } catch (JSONException e5) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e5);
            return null;
        }
    }

    public String toString() {
        AnonymousClass5xB r0 = this.A0C;
        String str = "null";
        String obj = r0 == null ? str : r0.toString();
        AnonymousClass5x8 r02 = this.A0B;
        if (r02 != null) {
            str = r02.toString();
        }
        StringBuilder A0r = AnonymousClass000.A0r("[ ");
        AnonymousClass5wO[] r6 = this.A0O;
        if (r6 != null) {
            for (AnonymousClass5wO obj2 : r6) {
                A0r.append(obj2.toString());
            }
        }
        A0r.append(" ]");
        StringBuilder A0r2 = AnonymousClass000.A0r("[ mandateNo: ");
        A0r2.append(this.A08);
        A0r2.append(" mandateErrorCode: ");
        A0r2.append(this.A0G);
        A0r2.append(" isMandate : ");
        A0r2.append(this.A0L);
        A0r2.append(" mandateName : ");
        A0r2.append(this.A07);
        A0r2.append(" upiPurposeCode : ");
        A0r2.append(this.A0A);
        A0r2.append(" mandateStartTs: ");
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A02);
        AnonymousClass5x3.A03(A0r2, A0o.toString());
        A0r2.append(" mandateEndTs: ");
        StringBuilder A0o2 = AnonymousClass000.A0o();
        A0o2.append(this.A01);
        AnonymousClass5x3.A03(A0r2, AnonymousClass000.A0h("", A0o2));
        A0r2.append(" debitTs: ");
        StringBuilder A0o3 = AnonymousClass000.A0o();
        A0o3.append(this.A0D);
        AnonymousClass5x3.A03(A0r2, AnonymousClass000.A0h("", A0o3));
        A0r2.append(" previousDebitTs: ");
        StringBuilder A0o4 = AnonymousClass000.A0o();
        A0o4.append(this.A0H);
        AnonymousClass5x3.A03(A0r2, AnonymousClass000.A0h("", A0o4));
        A0r2.append(" nextPaymentTs: ");
        StringBuilder A0o5 = AnonymousClass000.A0o();
        A0o5.append(this.A04);
        AnonymousClass5x3.A03(A0r2, AnonymousClass000.A0h("", A0o5));
        A0r2.append(" nextPaymentEndTs: ");
        StringBuilder A0o6 = AnonymousClass000.A0o();
        A0o6.append(this.A03);
        AnonymousClass5x3.A03(A0r2, AnonymousClass000.A0h("", A0o6));
        A0r2.append(" totalRecurringTxnCount: ");
        StringBuilder A0o7 = AnonymousClass000.A0o();
        A0o7.append(this.A00);
        AnonymousClass5x3.A03(A0r2, AnonymousClass000.A0h("", A0o7));
        A0r2.append(" mandateInfo: ");
        A0r2.append(this.A06);
        A0r2.append(" pendingMandateUpdate: {");
        A0r2.append(obj);
        A0r2.append("}  pauseResumeStatusDetails: {");
        A0r2.append(str);
        A0r2.append("}  instanceTransactions: {");
        A0r2.append(A0r.toString());
        return AnonymousClass000.A0h("} ]", A0r2);
    }
}
