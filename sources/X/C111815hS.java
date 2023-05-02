package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5hS  reason: invalid class name and case insensitive filesystem */
public class C111815hS extends C39891tE {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(9);
    public int A00 = 0;
    public int A01;
    public int A02 = 1;
    public String A03 = null;
    public String A04;
    public String A05;
    public String A06 = null;
    public boolean A07;
    public boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x012a, code lost:
        if (X.C110105dW.A1U(r4, "default-eligible-p2p", "1") != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0099, code lost:
        if (X.C110105dW.A1U(r8, "default-debit", "1") != false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass173 r7, X.C28371Vv r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "verified"
            r2 = 0
            java.lang.String r0 = r8.A0N(r0, r2)
            java.lang.String r5 = "1"
            boolean r0 = r5.equals(r0)
            r6.A0a = r0
            java.lang.String r0 = "automatic-binding"
            boolean r0 = X.C110105dW.A1U(r8, r0, r5)
            r6.A07 = r0
            java.lang.String r0 = "bank-name"
            java.lang.String r1 = r8.A0N(r0, r2)
            java.lang.String r0 = "bankName"
            X.1lh r0 = X.C39841t9.A01(r1, r0)
            r6.A08 = r0
            java.lang.String r0 = "bank-phone-number"
            java.lang.String r0 = r8.A0N(r0, r2)
            r6.A0B = r0
            java.lang.String r3 = "image"
            java.lang.String r0 = r8.A0N(r3, r2)
            r6.A0A = r0
            java.lang.String r0 = "time-last-added"
            java.lang.String r4 = r8.A0N(r0, r2)
            r0 = -1
            long r0 = X.C29501aj.A01(r4, r0)
            r6.A06 = r0
            java.lang.String r0 = "pending-verification-type"
            java.lang.String r0 = r8.A0N(r0, r2)
            r6.A0O = r0
            java.lang.String r0 = "country"
            java.lang.String r0 = r8.A0N(r0, r2)
            r6.A0G = r0
            java.lang.String r0 = "credential-id"
            java.lang.String r0 = r8.A0N(r0, r2)
            r6.A0H = r0
            java.lang.String r0 = "type"
            java.lang.String r0 = r8.A0N(r0, r2)
            int r0 = X.C35391lr.A04(r0)
            r6.A00 = r0
            java.lang.String r0 = "created"
            java.lang.String r4 = r8.A0N(r0, r2)
            r0 = 0
            long r0 = X.C29501aj.A01(r4, r0)
            r6.A05 = r0
            java.lang.String r0 = "network-type"
            java.lang.String r0 = r8.A0N(r0, r2)
            int r0 = X.C35391lr.A05(r0)
            r6.A01 = r0
            java.lang.String r0 = "last4"
            java.lang.String r0 = r8.A0N(r0, r2)
            r6.A0J = r0
            java.lang.String r0 = "default-debit-p2p"
            boolean r0 = X.C110105dW.A1U(r8, r0, r5)
            r4 = 0
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "default-debit"
            boolean r1 = X.C110105dW.A1U(r8, r0, r5)
            r0 = 0
            if (r1 == 0) goto L_0x009c
        L_0x009b:
            r0 = 1
        L_0x009c:
            r6.A0W = r0
            java.lang.String r0 = "default-credit-p2p"
            boolean r0 = X.C110105dW.A1U(r8, r0, r5)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "default-credit"
            boolean r0 = X.C110105dW.A1U(r8, r0, r5)
            if (r0 == 0) goto L_0x00af
        L_0x00ae:
            r4 = 1
        L_0x00af:
            r6.A0V = r4
            java.lang.String r0 = "default-debit-p2m"
            boolean r0 = X.C110105dW.A1U(r8, r0, r5)
            r6.A0S = r0
            java.lang.String r0 = "default-credit-p2m"
            boolean r0 = X.C110105dW.A1U(r8, r0, r5)
            r6.A0R = r0
            java.lang.String r0 = "needs-device-binding"
            boolean r0 = X.C110105dW.A1U(r8, r0, r5)
            r6.A08 = r0
            java.lang.String r0 = "binding-type"
            java.lang.String r0 = r8.A0N(r0, r2)
            r6.A03 = r0
            java.lang.String r0 = "token-id"
            java.lang.String r0 = r8.A0N(r0, r2)
            r6.A06 = r0
            java.lang.String r0 = "p2p-eligible"
            boolean r0 = X.C110105dW.A1U(r8, r0, r5)
            r6.A0Y = r0
            java.lang.String r0 = "p2m-eligible"
            boolean r0 = X.C110105dW.A1U(r8, r0, r5)
            r6.A0U = r0
            java.lang.String r1 = "state"
            java.lang.String r0 = "UNSET"
            java.lang.String r0 = r8.A0N(r1, r0)
            r6.A0F = r0
            java.lang.String r0 = "display-state"
            java.lang.String r1 = r8.A0N(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0101
            java.lang.String r1 = "ACTIVE"
        L_0x0101:
            r6.A0I = r1
            java.lang.String r0 = "capabilities"
            X.1Vv r4 = r8.A0J(r0)
            if (r4 == 0) goto L_0x019d
            java.lang.String r0 = "editable"
            boolean r0 = X.C110105dW.A1U(r4, r0, r5)
            r6.A0P = r0
            java.lang.String r0 = "verifiable"
            boolean r0 = X.C110105dW.A1U(r4, r0, r5)
            r6.A0Z = r0
            java.lang.String r0 = "default-eligible"
            boolean r0 = X.C110105dW.A1U(r4, r0, r5)
            if (r0 != 0) goto L_0x012c
            java.lang.String r0 = "default-eligible-p2p"
            boolean r1 = X.C110105dW.A1U(r4, r0, r5)
            r0 = 0
            if (r1 == 0) goto L_0x012d
        L_0x012c:
            r0 = 1
        L_0x012d:
            r6.A0X = r0
            java.lang.String r0 = "default-eligible-p2m"
            boolean r0 = X.C110105dW.A1U(r4, r0, r5)
            r6.A0T = r0
            java.lang.String r0 = "p2p-send"
            java.lang.String r0 = r4.A0N(r0, r2)
            java.lang.String r0 = X.C39891tE.A00(r0)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r6.A0Y
            if (r0 == 0) goto L_0x01d1
            java.lang.String r1 = r6.A0I
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d1
            boolean r0 = r6.A0a
            if (r0 == 0) goto L_0x01ce
            java.lang.String r0 = "ENABLED"
        L_0x0157:
            r6.A0N = r0
            java.lang.String r0 = "p2p-receive"
            java.lang.String r0 = r4.A0N(r0, r2)
            java.lang.String r0 = X.C39891tE.A00(r0)
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = r6.A0A()
        L_0x0169:
            r6.A0M = r0
            java.lang.String r0 = "p2m-send"
            java.lang.String r0 = r4.A0N(r0, r2)
            java.lang.String r0 = X.C39891tE.A00(r0)
            if (r0 != 0) goto L_0x018b
            boolean r0 = r6.A0U
            if (r0 == 0) goto L_0x01cb
            java.lang.String r1 = r6.A0I
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01cb
            boolean r0 = r6.A0a
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = "ENABLED"
        L_0x018b:
            r6.A0L = r0
            java.lang.String r0 = "p2m-receive"
            java.lang.String r0 = r4.A0N(r0, r2)
            java.lang.String r0 = X.C39891tE.A00(r0)
            if (r0 != 0) goto L_0x019b
            java.lang.String r0 = "DISABLED"
        L_0x019b:
            r6.A0K = r0
        L_0x019d:
            java.lang.String r0 = "verification-status"
            java.lang.String r0 = r8.A0N(r0, r2)
            int r0 = X.C30671cl.A00(r0)
            r6.A01 = r0
            X.1Vv r1 = r8.A0J(r3)
            java.lang.String r0 = "image-content-id"
            if (r1 == 0) goto L_0x01d4
            java.lang.String r0 = r1.A0N(r0, r2)
            r6.A0C = r0
            java.lang.String r0 = "image-url"
            java.lang.String r0 = r1.A0N(r0, r2)
            r6.A0E = r0
            java.lang.String r0 = "image-label-color"
            java.lang.String r0 = r1.A0N(r0, r2)
            r6.A0D = r0
            return
        L_0x01c8:
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            goto L_0x018b
        L_0x01cb:
            java.lang.String r0 = "DISABLED"
            goto L_0x018b
        L_0x01ce:
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            goto L_0x0157
        L_0x01d1:
            java.lang.String r0 = "DISABLED"
            goto L_0x0157
        L_0x01d4:
            java.lang.String r0 = r8.A0N(r0, r2)
            r6.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111815hS.A01(X.173, X.1Vv, int):void");
    }

    public void A02(List list, int i2) {
        throw new UnsupportedOperationException("PAY: BrazilCardMethodData toNetwork unsupported");
    }

    public String A03() {
        try {
            JSONObject A0J = C13700nu.A0J();
            try {
                A0J.put("verified", this.A0a);
                C35301lh r1 = this.A08;
                if (!C39841t9.A04(r1)) {
                    C110115dX.A11(r1, "bankName", A0J);
                }
                C35301lh r12 = this.A07;
                if (!C39841t9.A04(r12)) {
                    C110115dX.A11(r12, "bankCode", A0J);
                }
                String str = this.A0B;
                if (str != null) {
                    A0J.put("bankPhoneNumber", str);
                }
                String str2 = this.A0A;
                if (str2 != null) {
                    A0J.put("bankLogoUrl", str2);
                }
                long j2 = this.A06;
                if (j2 >= 0) {
                    A0J.put("timeLastAdded", j2);
                }
                String str3 = this.A0O;
                if (str3 != null) {
                    A0J.put("verificationType", str3);
                }
                if ("otp".equals(this.A0O)) {
                    A0J.put("otpNumberMatch", this.A0Q);
                }
                int i2 = this.A02;
                if (i2 >= 0) {
                    A0J.put("otpLength", i2);
                }
                String str4 = this.A0I;
                if (str4 != null) {
                    A0J.put("displayState", str4);
                }
                try {
                    A0J.put("editable", this.A0P);
                    A0J.put("verifiable", this.A0Z);
                    A0J.put("p2pDefaultEligible", this.A0X);
                    A0J.put("p2mDefaultEligible", this.A0T);
                    A0J.put("p2pSend", this.A0N);
                    A0J.put("p2pReceive", this.A0M);
                    A0J.put("p2mSend", this.A0L);
                    A0J.put("p2mReceive", this.A0K);
                } catch (JSONException e2) {
                    Log.w(AnonymousClass000.A0g("PAY: PaymentMethodCardCountryData/addCapabilitiesToJson threw: ", e2));
                }
            } catch (JSONException e3) {
                Log.w(AnonymousClass000.A0g("PAY: PaymentMethodCardCountryData toJSONObject threw: ", e3));
            }
            A0J.put("v", this.A02);
            A0J.put("paymentRails", this.A03);
            A0J.put("needsDeviceBinding", this.A08);
            A0J.put("automaticBinding", this.A07);
            String str5 = this.A03;
            if (str5 != null) {
                A0J.put("bindingType", str5);
            }
            String str6 = this.A06;
            if (str6 != null) {
                A0J.put("tokenId", str6);
            }
            String str7 = this.A0C;
            if (str7 != null) {
                A0J.put("cardImageContentId", str7);
            }
            String str8 = this.A0E;
            if (str8 != null) {
                A0J.put("cardImageUrl", str8);
            }
            String str9 = this.A0D;
            if (str9 != null) {
                A0J.put("cardImageLabelColor", str9);
            }
            String str10 = this.A0J;
            if (str10 != null) {
                A0J.put("lastFour", str10);
            }
            Long l2 = this.A09;
            if (l2 != null) {
                A0J.put("cardDataUpdatedTimeMillis", l2);
            }
            A0J.put("notificationType", this.A05);
            A0J.put("cardState", this.A0F);
            A0J.put("p2pEligible", this.A0Y);
            A0J.put("p2mEligible", this.A0U);
            A0J.put("verificationStatus", this.A01);
            return A0J.toString();
        } catch (JSONException e4) {
            Log.w(AnonymousClass000.A0g("PAY: BrazilCardMethodData toDBString threw: ", e4));
            return null;
        }
    }

    public void A04(String str) {
        if (str != null) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                this.A0a = A0K.optBoolean("verified", false);
                this.A08 = C39841t9.A01(A0K.optString("bankName", (String) null), "bankName");
                this.A07 = C39841t9.A01(A0K.optString("bankCode", (String) null), "bankCode");
                this.A0B = A0K.optString("bankPhoneNumber", (String) null);
                this.A0A = A0K.optString("bankLogoUrl", this.A0A);
                this.A06 = A0K.optLong("timeLastAdded", -1);
                this.A0O = A0K.optString("verificationType", (String) null);
                this.A0Q = A0K.optBoolean("otpNumberMatch", false);
                this.A02 = A0K.optInt("otpLength", 8);
                String optString = A0K.optString("displayState", (String) null);
                if (TextUtils.isEmpty(optString)) {
                    optString = "ACTIVE";
                }
                this.A0I = optString;
                this.A0P = A0K.optBoolean("editable", false);
                this.A0Z = A0K.optBoolean("verifiable", false);
                String str2 = "p2pDefaultEligible";
                if (!A0K.has(str2)) {
                    str2 = "defaultEligible";
                }
                this.A0X = A0K.optBoolean(str2, false);
                this.A0T = A0K.optBoolean("p2mDefaultEligible", false);
                this.A0N = A0K.optString("p2pSend", (!this.A0Y || !"ACTIVE".equals(this.A0I)) ? "DISABLED" : this.A0a ? "ENABLED" : "REQUIRES_VERIFICATION");
                this.A0M = A0K.optString("p2pReceive", A0A());
                this.A0L = A0K.optString("p2mSend", (!this.A0U || !"ACTIVE".equals(this.A0I)) ? "DISABLED" : this.A0a ? "ENABLED" : "REQUIRES_VERIFICATION");
                this.A0K = A0K.optString("p2mReceive", "DISABLED");
                this.A02 = A0K.optInt("v", 1);
                this.A03 = A0K.optInt("paymentRails", 0);
                this.A0Y = A0K.optBoolean("p2pEligible", false);
                this.A0U = A0K.optBoolean("p2mEligible", false);
                this.A08 = A0K.optBoolean("needsDeviceBinding", false);
                this.A07 = A0K.optBoolean("automaticBinding", false);
                this.A03 = A0K.optString("bindingType", (String) null);
                this.A06 = A0K.optString("tokenId", (String) null);
                this.A0C = A0K.optString("cardImageContentId", (String) null);
                this.A0E = A0K.optString("cardImageUrl", (String) null);
                this.A0D = A0K.optString("cardImageLabelColor", (String) null);
                this.A0J = A0K.optString("lastFour", (String) null);
                this.A09 = Long.valueOf(A0K.optLong("cardDataUpdatedTimeMillis", 0));
                this.A05 = A0K.optString("notificationType", (String) null);
                this.A0F = A0K.optString("cardState", "UNSET");
                this.A01 = A0K.optInt("verificationStatus");
            } catch (JSONException e2) {
                Log.w(AnonymousClass000.A0g("PAY: BrazilCardMethodData fromDBString threw: ", e2));
            }
        }
    }

    public C30671cl A05() {
        C30681cm A002 = C30681cm.A00("BR");
        String str = this.A0H;
        int i2 = this.A00;
        int i3 = 0;
        if (this.A0W) {
            i3 = 2;
        }
        int i4 = 0;
        if (this.A0V) {
            i4 = 2;
        }
        int i5 = 0;
        if (this.A0S) {
            i5 = 2;
        }
        int i6 = 0;
        if (this.A0R) {
            i6 = 2;
        }
        String str2 = this.A0J;
        long j2 = this.A05;
        C35391lr r2 = new C35391lr(A002, str, (String) C110105dW.A0d(this.A08), str2, i2, i3, i4, i5, i6, this.A01);
        r2.A05 = j2;
        r2.A08 = this;
        r2.A04 = this.A01;
        return r2;
    }

    public LinkedHashSet A08() {
        return new LinkedHashSet(Collections.singletonList(C35481m0.A04));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ verified: ");
        A0r.append(this.A0a);
        A0r.append(" automaticBinding: ");
        A0r.append(this.A07);
        A0r.append(" accountType: ");
        A0r.append(this.A00);
        A0r.append(" bankName: ");
        A0r.append(this.A08);
        A0r.append(" bankPhoneNumber: ");
        A0r.append(this.A0B);
        A0r.append(" bankLogoUrl: ");
        A0r.append(this.A0A);
        A0r.append(" verificationType: ");
        A0r.append(this.A0O);
        A0r.append(" otpNumberMatch: ");
        A0r.append(this.A0Q);
        A0r.append(" paymentRails: ");
        A0r.append(this.A03);
        A0r.append(" p2pEligible: ");
        A0r.append(this.A0Y);
        A0r.append(" p2mEligible: ");
        A0r.append(this.A0U);
        A0r.append(" timeLastAdded: ");
        A0r.append(this.A06);
        A0r.append(" needsDeviceBinding: ");
        A0r.append(this.A08);
        A0r.append(" bindingType: ");
        A0r.append(this.A03);
        A0r.append(" cardImageContentId: ");
        A0r.append(this.A0C);
        A0r.append(" cardImageUrl: ");
        A0r.append(this.A0E);
        A0r.append(" cardImageLabelColor: ");
        A0r.append(this.A0D);
        A0r.append(" notificationType: ");
        A0r.append(this.A05);
        A0r.append(" lastFour: ");
        A0r.append(this.A0J);
        A0r.append("payoutVerificationStatus: ");
        A0r.append(this.A01);
        A0r.append(" displayState: ");
        A0r.append(this.A0I);
        StringBuilder A0r2 = AnonymousClass000.A0r(" capabilities { editable: ");
        A0r2.append(this.A0P);
        A0r2.append(", verifiable: ");
        A0r2.append(this.A0Z);
        A0r2.append(", p2pDefaultEligible: ");
        A0r2.append(this.A0X);
        A0r2.append(", p2mDefaultEligible: ");
        A0r2.append(this.A0T);
        A0r2.append(", p2pSend: ");
        A0r2.append(this.A0N);
        A0r2.append(", p2pReceive: ");
        A0r2.append(this.A0M);
        A0r2.append(", p2mSend: ");
        A0r2.append(this.A0L);
        A0r2.append(", p2mReceive: ");
        A0r2.append(this.A0K);
        A0r.append(AnonymousClass000.A0h("}", A0r2));
        return AnonymousClass000.A0h(" ]", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.A0a ? (byte) 1 : 0);
        parcel.writeParcelable(this.A08, i2);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0O);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeInt(this.A03);
        parcel.writeByte(this.A0Y ? (byte) 1 : 0);
        parcel.writeByte(this.A0U ? (byte) 1 : 0);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A0W ? (byte) 1 : 0);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeLong(this.A09.longValue());
        parcel.writeString(this.A05);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeByte(this.A0Z ? (byte) 1 : 0);
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeByte(this.A0T ? (byte) 1 : 0);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
    }
}
