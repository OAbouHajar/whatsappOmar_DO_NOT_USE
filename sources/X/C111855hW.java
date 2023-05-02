package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5hW  reason: invalid class name and case insensitive filesystem */
public final class C111855hW extends AnonymousClass1W2 {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(7);
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 1;
    public long A04;
    public long A05 = -1;
    public C35301lh A06;
    public C35301lh A07;
    public C35301lh A08;
    public C35301lh A09;
    public C35301lh A0A;
    public AnonymousClass5xC A0B;
    public AnonymousClass609 A0C;
    public Boolean A0D = null;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;

    public void A01(AnonymousClass173 r6, C28371Vv r7, int i2) {
        Class<String> cls = String.class;
        String A0N2 = r7.A0N("seq-no", (String) null);
        if (!TextUtils.isEmpty(A0N2)) {
            this.A0N = A0N2;
        }
        String A0N3 = r7.A0N("ref-url", (String) null);
        if (!TextUtils.isEmpty(A0N3)) {
            this.A0Q = A0N3;
        }
        String A0N4 = r7.A0N("sync-status", (String) null);
        if (!TextUtils.isEmpty(A0N4)) {
            this.A0O = A0N4;
        }
        String A0N5 = r7.A0N("upi-bank-info", (String) null);
        if (A0N5 != null) {
            this.A09 = C110105dW.A0J(C110105dW.A0L(), cls, A0N5, "bankInfo");
        }
        String A0N6 = r7.A0N("sender-name", (String) null);
        if (A0N6 != null) {
            this.A08 = C110105dW.A0J(C110105dW.A0L(), cls, A0N6, "legalName");
        }
        String A0N7 = r7.A0N("receiver-name", (String) null);
        if (A0N7 != null) {
            this.A07 = C110105dW.A0J(C110105dW.A0L(), cls, A0N7, "legalName");
        }
        C28371Vv A0J2 = r7.A0J("mandate");
        if (A0J2 != null) {
            this.A0B = new AnonymousClass5xC(r6, A0J2);
        }
        String A0N8 = r7.A0N("is-complaint-eligible", (String) null);
        C28371Vv A0J3 = r7.A0J("complaint");
        if (!(A0N8 == null && A0J3 == null)) {
            this.A0C = new AnonymousClass609(A0J3, A0N8);
        }
        String A0N9 = r7.A0N("mandate-transaction-id", (String) null);
        if (!TextUtils.isEmpty(A0N9)) {
            this.A0G = A0N9;
        }
        String A0N10 = r7.A0N("mcc", (String) null);
        if (!TextUtils.isEmpty(A0N10)) {
            this.A0H = A0N10;
        }
    }

    public void A02(List list, int i2) {
        if (!C39841t9.A03(this.A0A)) {
            C110105dW.A1R("mpin", (String) C110105dW.A0d(this.A0A), list);
        }
        if (!TextUtils.isEmpty(this.A0N)) {
            C110105dW.A1R("seq-no", this.A0N, list);
        }
        if (!TextUtils.isEmpty(this.A0L)) {
            C110105dW.A1R("sender-vpa", this.A0L, list);
        }
        if (!TextUtils.isEmpty(this.A0M)) {
            C110105dW.A1R("sender-vpa-id", this.A0M, list);
        }
        if (!TextUtils.isEmpty(this.A0J)) {
            C110105dW.A1R("receiver-vpa", this.A0J, list);
        }
        if (!TextUtils.isEmpty(this.A0K)) {
            C110105dW.A1R("receiver-vpa-id", this.A0K, list);
        }
        if (!C39841t9.A03(this.A07)) {
            C110105dW.A1R("receiver-name", (String) this.A07.A00, list);
        }
        if (!C39841t9.A03(this.A08)) {
            C110105dW.A1R("sender-name", (String) this.A08.A00, list);
        }
        if (!TextUtils.isEmpty(this.A0E)) {
            C110105dW.A1R("device-id", this.A0E, list);
        }
        if (!C39841t9.A03(this.A09)) {
            C110105dW.A1R("upi-bank-info", (String) C110105dW.A0d(this.A09), list);
        }
        if (!TextUtils.isEmpty(this.A0H)) {
            C110105dW.A1R("mcc", this.A0H, list);
        }
        Boolean bool = this.A0D;
        if (bool != null) {
            C110105dW.A1R("is_first_send", bool.booleanValue() ? "1" : "0", list);
        }
        C35421lu r0 = this.A02;
        if (r0 != null) {
            C110105dW.A1R("ref-id", r0.A01, list);
        }
        if (!TextUtils.isEmpty(this.A0I)) {
            C110105dW.A1R("purpose-code", this.A0I, list);
        }
        if (!TextUtils.isEmpty(this.A0G)) {
            C110105dW.A1R("mandate-transaction-id", this.A0G, list);
        }
    }

    public String A03() {
        return null;
    }

    public void A04(String str) {
        Class<String> cls = String.class;
        try {
            super.A04(str);
            JSONObject A0K2 = C13700nu.A0K(str);
            this.A03 = A0K2.optInt("v", 1);
            this.A0N = A0K2.optString("seqNum", this.A0N);
            this.A00 = A0K2.optInt("counter", 0);
            this.A0E = A0K2.optString("deviceId", this.A0E);
            this.A0L = A0K2.optString("senderVpa", this.A0L);
            this.A0M = A0K2.optString("senderVpaId", this.A0M);
            C53852gP A0L2 = C110105dW.A0L();
            C35301lh r0 = this.A08;
            this.A08 = C110105dW.A0J(A0L2, cls, A0K2.optString("senderName", (String) (r0 == null ? null : r0.A00)), "legalName");
            this.A0J = A0K2.optString("receiverVpa", this.A0J);
            this.A0K = A0K2.optString("receiverVpaId", this.A0K);
            C53852gP A0L3 = C110105dW.A0L();
            C35301lh r02 = this.A07;
            this.A07 = C110105dW.A0J(A0L3, cls, A0K2.optString("receiverName", (String) (r02 == null ? null : r02.A00)), "legalName");
            C53852gP A0L4 = C110105dW.A0L();
            C35301lh r03 = this.A0A;
            this.A0A = C110105dW.A0J(A0L4, cls, A0K2.optString("blob", (String) (r03 == null ? null : r03.A00)), "pin");
            this.A0P = A0K2.optString("token", this.A0P);
            this.A04 = A0K2.optLong("expiryTs", this.A04);
            this.A01 = A0K2.optInt("previousStatus", this.A01);
            this.A02 = A0K2.optInt("previousType", this.A02);
            this.A0Q = A0K2.optString("url", this.A0Q);
            C53852gP A0L5 = C110105dW.A0L();
            C35301lh r04 = this.A09;
            this.A09 = C110105dW.A0J(A0L5, cls, A0K2.optString("upiBankInfo", (String) (r04 == null ? null : r04.A00)), "bankInfo");
            this.A0O = A0K2.optString("syncStatus", this.A0O);
            this.A0H = A0K2.optString("mcc", this.A0H);
            this.A0I = A0K2.optString("purposeCode", this.A0I);
            if (A0K2.has("indiaUpiMandateMetadata")) {
                this.A0B = new AnonymousClass5xC(A0K2.optString("indiaUpiMandateMetadata", (String) null));
            }
            if (A0K2.has("isFirstSend")) {
                this.A0D = Boolean.valueOf(A0K2.optBoolean("isFirstSend", false));
            }
            if (A0K2.has("indiaUpiTransactionComplaintData")) {
                this.A0C = new AnonymousClass609(A0K2.optString("indiaUpiTransactionComplaintData", (String) null));
            }
            this.A0G = A0K2.optString("mandateTransactionId", this.A0G);
            C53852gP A0L6 = C110105dW.A0L();
            C35301lh r05 = this.A06;
            this.A06 = C110105dW.A0J(A0L6, cls, A0K2.optString("note", (String) (r05 == null ? null : r05.A00)), "interopNote");
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiTransactionMetadata fromDBString threw: ", e2);
        }
    }

    public int A05() {
        return this.A00;
    }

    public int A06() {
        return this.A01;
    }

    public int A07() {
        return this.A02;
    }

    public long A08() {
        return this.A05;
    }

    public long A09() {
        return this.A04;
    }

    public long A0A() {
        return this.A05 * 1000;
    }

    public AnonymousClass5UL A0B() {
        return this.A0C;
    }

    public C35301lh A0C() {
        return this.A06;
    }

    public C35301lh A0D() {
        return this.A07;
    }

    public C35301lh A0E() {
        return this.A08;
    }

    public C48362Mw A0F() {
        C28581Wr A0U = AnonymousClass2N2.A08.A0U();
        String str = this.A0L;
        A0U.A03();
        AnonymousClass2N2 r1 = (AnonymousClass2N2) A0U.A00;
        r1.A01 |= 4;
        r1.A07 = str;
        String str2 = this.A0J;
        A0U.A03();
        AnonymousClass2N2 r12 = (AnonymousClass2N2) A0U.A00;
        r12.A01 |= 2;
        r12.A06 = str2;
        long j2 = this.A05;
        A0U.A03();
        AnonymousClass2N2 r13 = (AnonymousClass2N2) A0U.A00;
        r13.A01 |= 1;
        r13.A02 = j2;
        C28581Wr A0U2 = C48362Mw.A04.A0U();
        C28541Wm A022 = A0U.A02();
        A0U2.A03();
        C48362Mw r14 = (C48362Mw) A0U2.A00;
        r14.A03 = A022;
        r14.A02 = 1;
        return (C48362Mw) A0U2.A02();
    }

    public String A0H() {
        return this.A0N;
    }

    public String A0I() {
        return this.A0J;
    }

    public String A0J() {
        return this.A0L;
    }

    public String A0K() {
        try {
            JSONObject A0M2 = A0M();
            A0M2.put("v", this.A03);
            String str = this.A0N;
            if (str != null) {
                A0M2.put("seqNum", str);
            }
            String str2 = this.A0E;
            if (str2 != null) {
                A0M2.put("deviceId", str2);
            }
            long j2 = this.A04;
            if (j2 > 0) {
                A0M2.put("expiryTs", j2);
            }
            int i2 = this.A01;
            if (i2 > 0) {
                A0M2.put("previousStatus", i2);
            }
            String str3 = this.A0J;
            if (str3 != null) {
                A0M2.put("receiverVpa", str3);
            }
            String str4 = this.A0K;
            if (str4 != null) {
                A0M2.put("receiverVpaId", str4);
            }
            C35301lh r1 = this.A07;
            if (!C39841t9.A04(r1)) {
                C110115dX.A11(r1, "receiverName", A0M2);
            }
            String str5 = this.A0L;
            if (str5 != null) {
                A0M2.put("senderVpa", str5);
            }
            String str6 = this.A0M;
            if (str6 != null) {
                A0M2.put("senderVpaId", str6);
            }
            C35301lh r12 = this.A08;
            if (!C39841t9.A04(r12)) {
                C110115dX.A11(r12, "senderName", A0M2);
            }
            int i3 = this.A00;
            if (i3 > 0) {
                A0M2.put("counter", i3);
            }
            int i4 = this.A02;
            if (i4 > 0) {
                A0M2.put("previousType", i4);
            }
            String str7 = this.A0Q;
            if (str7 != null) {
                A0M2.put("url", str7);
            }
            String str8 = this.A0O;
            if (str8 != null) {
                A0M2.put("syncStatus", str8);
            }
            C35301lh r3 = this.A09;
            if (!C39841t9.A04(r3)) {
                A0M2.put("upiBankInfo", r3 == null ? null : r3.A00);
            }
            String str9 = this.A0H;
            if (str9 != null) {
                A0M2.put("mcc", str9);
            }
            String str10 = this.A0I;
            if (str10 != null) {
                A0M2.put("purposeCode", str10);
            }
            AnonymousClass5xC r0 = this.A0B;
            if (r0 != null) {
                A0M2.put("indiaUpiMandateMetadata", r0.A01());
            }
            Boolean bool = this.A0D;
            if (bool != null) {
                A0M2.put("isFirstSend", bool);
            }
            AnonymousClass609 r02 = this.A0C;
            if (r02 != null) {
                A0M2.put("indiaUpiTransactionComplaintData", r02.A00());
            }
            String str11 = this.A0G;
            if (str11 != null) {
                A0M2.put("mandateTransactionId", str11);
            }
            if (!C39841t9.A03(this.A06)) {
                C110115dX.A11(this.A06, "note", A0M2);
            }
            Boolean bool2 = this.A03;
            if (bool2 != null) {
                A0M2.put("isPendingRequestViewed", bool2);
            }
            return A0M2.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e2);
            return null;
        }
    }

    public String A0L() {
        try {
            JSONObject A0J2 = C13700nu.A0J();
            A0J2.put("v", this.A03);
            C35301lh r2 = this.A0A;
            if (!C39841t9.A04(r2)) {
                A0J2.put("blob", r2 == null ? null : r2.A00);
            }
            if (!TextUtils.isEmpty(this.A0P)) {
                A0J2.put("token", this.A0P);
            }
            String str = this.A0L;
            if (str != null) {
                A0J2.put("senderVpa", str);
            }
            String str2 = this.A0M;
            if (str2 != null) {
                A0J2.put("senderVpaId", str2);
            }
            C35301lh r1 = this.A08;
            if (!C39841t9.A04(r1)) {
                C110115dX.A11(r1, "senderName", A0J2);
            }
            String str3 = this.A0J;
            if (str3 != null) {
                A0J2.put("receiverVpa", str3);
            }
            String str4 = this.A0K;
            if (str4 != null) {
                A0J2.put("receiverVpaId", str4);
            }
            C35301lh r12 = this.A07;
            if (!C39841t9.A04(r12)) {
                C110115dX.A11(r12, "receiverName", A0J2);
            }
            String str5 = this.A0E;
            if (str5 != null) {
                A0J2.put("deviceId", str5);
            }
            C35301lh r22 = this.A09;
            if (!C39841t9.A04(r22)) {
                A0J2.put("upiBankInfo", r22 == null ? null : r22.A00);
            }
            if (!C39841t9.A03(this.A06)) {
                C110115dX.A11(this.A06, "note", A0J2);
            }
            return A0J2.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e2);
            return null;
        }
    }

    public void A0N(int i2) {
        this.A00 = i2;
    }

    public void A0O(int i2) {
        this.A01 = i2;
    }

    public void A0P(int i2) {
        this.A02 = i2;
    }

    public void A0Q(long j2) {
        this.A05 = j2;
    }

    public void A0R(long j2) {
        this.A04 = j2;
    }

    public void A0T(AnonymousClass1W2 r8) {
        super.A0T(r8);
        C111855hW r82 = (C111855hW) r8;
        String str = r82.A0N;
        if (str != null) {
            this.A0N = str;
        }
        String str2 = r82.A0E;
        if (str2 != null) {
            this.A0E = str2;
        }
        String str3 = r82.A0J;
        if (str3 != null) {
            this.A0J = str3;
        }
        String str4 = r82.A0K;
        if (str4 != null) {
            this.A0K = str4;
        }
        C35301lh r0 = r82.A07;
        if (r0 != null) {
            this.A07 = r0;
        }
        String str5 = r82.A0L;
        if (str5 != null) {
            this.A0L = str5;
        }
        String str6 = r82.A0M;
        if (str6 != null) {
            this.A0M = str6;
        }
        C35301lh r1 = r82.A08;
        if (!C39841t9.A04(r1)) {
            this.A08 = r1;
        }
        long j2 = r82.A04;
        if (j2 > 0) {
            this.A04 = j2;
        }
        int i2 = r82.A01;
        if (i2 > 0) {
            this.A01 = i2;
        }
        int i3 = r82.A00;
        if (i3 > 0) {
            this.A00 = i3;
        }
        int i4 = r82.A02;
        if (i4 > 0) {
            this.A02 = i4;
        }
        String str7 = r82.A0Q;
        if (str7 != null) {
            this.A0Q = str7;
        }
        C35301lh r12 = r82.A09;
        if (!C39841t9.A04(r12)) {
            this.A09 = r12;
        }
        String str8 = r82.A0O;
        if (str8 != null) {
            this.A0O = str8;
        }
        String str9 = r82.A0H;
        if (str9 != null) {
            this.A0H = str9;
        }
        String str10 = r82.A0I;
        if (str10 != null) {
            this.A0I = str10;
        }
        AnonymousClass5xC r2 = r82.A0B;
        if (r2 != null) {
            AnonymousClass5xC r13 = this.A0B;
            C35301lh r02 = r2.A08;
            if (r02 != null) {
                r13.A08 = r02;
            }
            C35301lh r03 = r2.A07;
            if (r03 != null) {
                r13.A07 = r03;
            }
            C35301lh r04 = r2.A0A;
            if (r04 != null) {
                r13.A0A = r04;
            }
            r13.A0G = r2.A0G;
            String str11 = r2.A0F;
            if (str11 != null) {
                r13.A0F = str11;
            }
            r13.A0L = r2.A0L;
            r13.A0M = r2.A0M;
            r13.A0N = r2.A0N;
            long j3 = r2.A02;
            if (j3 > 0) {
                r13.A02 = j3;
            }
            long j4 = r2.A01;
            if (j4 > 0) {
                r13.A01 = j4;
            }
            String str12 = r2.A0D;
            if (str12 != null) {
                r13.A0D = str12;
            }
            String str13 = r2.A0H;
            if (str13 != null) {
                r13.A0H = str13;
            }
            long j5 = r2.A04;
            if (j5 > 0) {
                r13.A04 = j5;
            }
            long j6 = r2.A03;
            if (j6 > 0) {
                r13.A03 = j6;
            }
            int i5 = r2.A00;
            if (i5 > 0) {
                r13.A00 = i5;
            }
            C35301lh r05 = r2.A09;
            if (r05 != null) {
                r13.A09 = r05;
            }
            C35431lv r06 = r2.A05;
            if (r06 != null) {
                r13.A05 = r06;
            }
            C35301lh r07 = r2.A06;
            if (r07 != null) {
                r13.A06 = r07;
            }
            String str14 = r2.A0E;
            if (str14 != null) {
                r13.A0E = str14;
            }
            String str15 = r2.A0J;
            if (str15 != null) {
                r13.A0J = str15;
            }
            String str16 = r2.A0I;
            if (str16 != null) {
                r13.A0I = str16;
            }
            String str17 = r2.A0K;
            if (str17 != null) {
                r13.A0K = str17;
            }
            r13.A0C = r2.A0C;
            r13.A0O = r2.A0O;
            r13.A0B = r2.A0B;
        }
        Boolean bool = r82.A0D;
        if (bool != null) {
            this.A0D = bool;
        }
        AnonymousClass609 r4 = r82.A0C;
        if (r4 != null) {
            AnonymousClass609 r3 = this.A0C;
            if (r3 == null) {
                this.A0C = new AnonymousClass609(r4.A00());
            } else {
                r3.A03 = r4.A03;
                long j7 = r4.A00;
                if (j7 > 0) {
                    r3.A00 = j7;
                }
                long j8 = r4.A01;
                if (j8 > 0) {
                    r3.A01 = j8;
                }
                String str18 = r4.A02;
                if (str18 != null) {
                    r3.A02 = str18;
                }
            }
        }
        String str19 = r82.A0G;
        if (str19 != null) {
            this.A0G = str19;
        }
        C35301lh r14 = r82.A06;
        if (!C39841t9.A04(r14)) {
            this.A06 = r14;
        }
    }

    public void A0U(String str) {
        this.A06 = C110105dW.A0J(C110105dW.A0L(), String.class, str, "interopNote");
    }

    public void A0V(String str) {
        this.A0N = str;
    }

    public void A0W(String str) {
        this.A0J = str;
    }

    public void A0X(String str) {
        this.A0L = str;
    }

    public boolean A0Y() {
        return "MISSING_FIELD_NOT_PARTIAL".equals(this.A0O);
    }

    public boolean A0Z(AnonymousClass1Vt r3) {
        if (TextUtils.isEmpty(this.A0L) || TextUtils.isEmpty(this.A0J)) {
            return true;
        }
        return !"FULL".equals(this.A0O) && r3.A0A() && TextUtils.isEmpty(r3.A0F);
    }

    public void A0a(String str) {
        this.A07 = C110105dW.A0J(C110105dW.A0L(), String.class, str, "legalName");
    }

    public String toString() {
        AnonymousClass5xC r0 = this.A0B;
        String str = "null";
        String obj = r0 == null ? str : r0.toString();
        String str2 = "order = [";
        AnonymousClass609 r02 = this.A0C;
        if (r02 != null) {
            str = r02.toString();
        }
        C35421lu r2 = this.A02;
        if (r2 != null) {
            StringBuilder A0q = AnonymousClass000.A0q(str2);
            A0q.append("id: ");
            StringBuilder A0q2 = AnonymousClass000.A0q(AnonymousClass000.A0h(AnonymousClass5x3.A00(r2.A01), A0q));
            A0q2.append("expiryTsInSec:");
            C35421lu r22 = this.A02;
            A0q2.append(r22.A00);
            StringBuilder A0q3 = AnonymousClass000.A0q(A0q2.toString());
            A0q3.append("messageId:");
            str2 = AnonymousClass000.A0h(AnonymousClass5x3.A00(r22.A02), A0q3);
        }
        String A0h = AnonymousClass000.A0h("]", AnonymousClass000.A0q(str2));
        StringBuilder A0r = AnonymousClass000.A0r("[ seq-no: ");
        AnonymousClass5x3.A03(A0r, this.A0N);
        A0r.append(" timestamp: ");
        A0r.append(this.A05);
        A0r.append(" deviceId: ");
        A0r.append(this.A0E);
        A0r.append(" sender: ");
        A0r.append(AnonymousClass5x3.A02(this.A0L));
        A0r.append(" senderVpaId: ");
        A0r.append(this.A0M);
        A0r.append(" senderName: ");
        C35301lh r03 = this.A08;
        String str3 = null;
        AnonymousClass5x3.A03(A0r, r03 != null ? r03.toString() : null);
        A0r.append(" receiver: ");
        A0r.append(AnonymousClass5x3.A02(this.A0J));
        A0r.append(" receiverVpaId: ");
        A0r.append(AnonymousClass5x3.A02(this.A0K));
        A0r.append(" receiverName : ");
        C35301lh r04 = this.A07;
        AnonymousClass5x3.A03(A0r, r04 != null ? r04.toString() : null);
        A0r.append(" encryptedKeyLength: ");
        C35301lh r4 = this.A0A;
        A0r.append(C39841t9.A04(r4) ? "0" : Integer.valueOf(((String) r4.A00).length()));
        A0r.append(" previousType: ");
        A0r.append(this.A02);
        A0r.append(" previousStatus: ");
        A0r.append(this.A01);
        A0r.append(" token: ");
        AnonymousClass5x3.A03(A0r, this.A0P);
        A0r.append(" url: ");
        AnonymousClass5x3.A03(A0r, this.A0Q);
        A0r.append(" upiBankInfo: ");
        A0r.append(this.A09);
        A0r.append(" order : ");
        A0r.append(A0h);
        A0r.append(" mcc: ");
        AnonymousClass5x3.A03(A0r, this.A0H);
        A0r.append(" purposeCode: ");
        AnonymousClass5x3.A03(A0r, this.A0I);
        A0r.append(" isFirstSend: ");
        A0r.append(this.A0D);
        A0r.append(" indiaUpiMandateMetadata: {");
        A0r.append(obj);
        A0r.append("} ] indiaUpiTransactionComplaintData: {");
        A0r.append(str);
        A0r.append("}  mandateTransactionId: ");
        AnonymousClass5x3.A03(A0r, this.A0G);
        A0r.append(" note : ");
        C35301lh r05 = this.A06;
        if (r05 != null) {
            str3 = r05.toString();
        }
        AnonymousClass5x3.A03(A0r, str3);
        A0r.append(" isPendingRequestViewed: ");
        A0r.append(this.A03);
        return AnonymousClass000.A0h("]", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.A0A, i2);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0M);
        parcel.writeString((String) C110105dW.A0d(this.A08));
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeString((String) C110105dW.A0d(this.A07));
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0E);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0Q);
        parcel.writeParcelable(this.A09, i2);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        AnonymousClass5xC r0 = this.A0B;
        String str = null;
        parcel.writeString(r0 == null ? null : r0.A01());
        Boolean bool = this.A0D;
        parcel.writeInt(bool == null ? -1 : AnonymousClass000.A1O(bool.booleanValue() ? 1 : 0));
        AnonymousClass609 r02 = this.A0C;
        if (r02 != null) {
            str = r02.A00();
        }
        parcel.writeString(str);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A06, i2);
    }
}
