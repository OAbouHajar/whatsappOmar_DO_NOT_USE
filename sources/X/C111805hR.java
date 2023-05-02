package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5hR  reason: invalid class name and case insensitive filesystem */
public final class C111805hR extends C39911tG {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(4);
    public int A00 = -1;
    public int A01;
    public int A02 = 1;
    public C35301lh A03;
    public C35301lh A04;
    public C35301lh A05;
    public C35301lh A06;
    public C35301lh A07;
    public C35301lh A08;
    public C35301lh A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public ArrayList A0G;
    public boolean A0H = false;
    public boolean A0I;

    public void A01(AnonymousClass173 r14, C28371Vv r15, int i2) {
        String str;
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        if (i2 == 2) {
            str = null;
            this.A01 = C39841t9.A01(r15.A0N(FacebookFacade.RequestParameter.NAME, (String) null), "bankName");
            this.A0A = r15.A0N("bank-ref-id", (String) null);
            this.A03 = r15.A0N("image", (String) null);
            this.A0C = r15.A0N("code", (String) null);
            this.A04 = r15.A0N("bank-phone-number", (String) null);
            this.A0I = C110105dW.A1U(r15, "popular-bank", "1");
            String A0N = r15.A0N("psp-routing", (String) null);
            if (!TextUtils.isEmpty(A0N)) {
                this.A0G = C13680ns.A0n(Arrays.asList(A0N.split(",")));
            }
            if (this.A00 == -1) {
                this.A00 = C29501aj.A00(r15.A0N("version", (String) null), -1);
            }
        } else {
            str = null;
            try {
                this.A0A = r15.A0N("provider", (String) null);
                this.A03 = C110105dW.A0J(C110105dW.A0L(), cls2, r15.A0N("account-name", (String) null), "accountHolderName");
                boolean z2 = false;
                this.A05 = C110105dW.A0J(C110105dW.A0L(), Boolean.class, Boolean.valueOf(AnonymousClass000.A1R(C29501aj.A00(r15.A0N("is-mpin-set", (String) null), 0), 1)), "isPinSet");
                this.A07 = C110105dW.A0J(C110105dW.A0L(), cls, Integer.valueOf(C29501aj.A00(r15.A0N("otp-length", (String) null), 0)), "otpLength");
                this.A04 = C110105dW.A0J(C110105dW.A0L(), cls, Integer.valueOf(C29501aj.A00(r15.A0N("atm-pin-length", (String) null), 0)), "atmPinLength");
                this.A08 = C110105dW.A0J(C110105dW.A0L(), cls, Integer.valueOf(C29501aj.A00(r15.A0N("mpin-length", (String) null), 0)), "pinLength");
                this.A09 = C110105dW.A0J(C110105dW.A0L(), cls2, r15.A0N("vpa", (String) null), "upiHandle");
                this.A0F = r15.A0N("vpa-id", (String) null);
                this.A0C = r15.A0N("code", (String) null);
                this.A01 = C29501aj.A00(r15.A0N("pin-format-version", (String) null), 0);
                this.A06 = C110105dW.A0J(C110105dW.A0L(), cls2, r15.A0N("upi-bank-info", (String) null), "bankInfo");
                this.A03 = r15.A0N("image", (String) null);
                this.A04 = r15.A0N("bank-phone-number", (String) null);
                this.A09 = null;
                this.A01 = C39841t9.A01(r15.A0N("bank-name", (String) null), "bankName");
                this.A06 = r15.A0N("credential-id", (String) null);
                this.A02 = C39841t9.A01(r15.A0N("account-number", (String) null), "bankAccountNumber");
                this.A00 = C29501aj.A01(r15.A0N("created", (String) null), 0) * 1000;
                this.A07 = AnonymousClass000.A1R(C29501aj.A00(r15.A0N("default-credit", (String) null), 0), 1);
                if (C29501aj.A00(r15.A0N("default-debit", (String) null), 0) == 1) {
                    z2 = true;
                }
                this.A08 = z2;
                this.A0B = r15.A0N("account-type", (String) null);
            } catch (Exception e2) {
                Log.e("PAY: IndiaUpiMethodData fromNetwork", e2);
                return;
            }
        }
        String A0N2 = r15.A0N("transaction-prefix", str);
        if (!TextUtils.isEmpty(A0N2)) {
            this.A0E = A0N2;
        }
    }

    public void A02(List list, int i2) {
        throw new UnsupportedOperationException("PAY: IndiaUpiMethodData toNetwork is unsupported");
    }

    public String A03() {
        try {
            JSONObject A0B2 = A0B();
            A0B2.put("v", this.A02);
            String str = this.A0A;
            if (str != null) {
                A0B2.put("accountProvider", str);
            }
            if (!C39841t9.A03(this.A03)) {
                C35301lh r0 = this.A03;
                A0B2.put("accountHolderName", r0 == null ? null : r0.A00);
            }
            Object obj = this.A07.A00;
            if (AnonymousClass000.A0D(obj) >= 0) {
                A0B2.put("otpLength", obj);
            }
            Object obj2 = this.A04.A00;
            if (AnonymousClass000.A0D(obj2) >= 0) {
                A0B2.put("atmPinLength", obj2);
            }
            Object obj3 = this.A08.A00;
            if (AnonymousClass000.A0D(obj3) >= 0) {
                A0B2.put("upiPinLength", obj3);
            }
            C35301lh r3 = this.A06;
            if (!C39841t9.A04(r3)) {
                A0B2.put("miscBankInfo", r3 == null ? null : r3.A00);
            }
            C35301lh r1 = this.A09;
            if (!C39841t9.A04(r1)) {
                C110115dX.A11(r1, "vpaHandle", A0B2);
            }
            String str2 = this.A0F;
            if (str2 != null) {
                A0B2.put("vpaId", str2);
            }
            String str3 = this.A0C;
            if (str3 != null) {
                A0B2.put("bankCode", str3);
            }
            int i2 = this.A01;
            if (i2 >= 0) {
                A0B2.put("pinFormat", i2);
            }
            C110115dX.A11(this.A05, "isMpinSet", A0B2);
            String str4 = this.A0B;
            if (str4 != null) {
                A0B2.put("accountType", str4);
            }
            return A0B2.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiMethodData toDBString threw: ", e2);
            return null;
        }
    }

    public void A04(String str) {
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        if (str != null) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                this.A03 = A0K.optString("bankImageURL", (String) null);
                this.A04 = A0K.optString("bankPhoneNumber", (String) null);
                this.A02 = A0K.optInt("v", 1);
                this.A0A = A0K.optString("accountProvider", (String) null);
                this.A03 = C110105dW.A0J(C110105dW.A0L(), cls2, A0K.optString("accountHolderName", (String) null), "accountHolderName");
                this.A07 = C110105dW.A0J(C110105dW.A0L(), cls, Integer.valueOf(A0K.optInt("otpLength", -1)), "otpLength");
                this.A04 = C110105dW.A0J(C110105dW.A0L(), cls, Integer.valueOf(A0K.optInt("atmPinLength", -1)), "atmPinLength");
                this.A08 = C110105dW.A0J(C110105dW.A0L(), cls, Integer.valueOf(A0K.optInt("upiPinLength", -1)), "pinLength");
                this.A06 = C110105dW.A0J(C110105dW.A0L(), cls2, A0K.optString("miscBankInfo", (String) null), "bankInfo");
                this.A09 = C110105dW.A0J(C110105dW.A0L(), cls2, A0K.optString("vpaHandle", (String) null), "upiHandle");
                this.A0F = A0K.optString("vpaId", (String) null);
                this.A0C = A0K.optString("bankCode", (String) null);
                this.A01 = A0K.optInt("pinFormat", 0);
                this.A05 = C110105dW.A0J(C110105dW.A0L(), Boolean.class, Boolean.valueOf(A0K.optBoolean("isMpinSet", false)), "isPinSet");
                this.A0B = A0K.optString("accountType", (String) null);
            } catch (JSONException e2) {
                Log.w("PAY: IndiaUpiMethodData fromDBString threw: ", e2);
            }
        }
    }

    public C30671cl A05() {
        return null;
    }

    public C35301lh A06() {
        if (!C39841t9.A03(this.A03)) {
            return this.A03;
        }
        try {
            C35301lh r0 = this.A06;
            return C110105dW.A0J(C110105dW.A0L(), String.class, C13700nu.A0K((String) (r0 == null ? null : r0.A00)).optString("account_name"), "accountHolderName");
        } catch (JSONException unused) {
            return null;
        }
    }

    public LinkedHashSet A08() {
        return new LinkedHashSet(Collections.singletonList(C35481m0.A05));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = r1.equals(r0);
        r1 = com.obwhatsapp.R.string.str0449;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0C() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A0B
            if (r1 == 0) goto L_0x000b
            int r0 = r1.hashCode()
            switch(r0) {
                case -1704036199: goto L_0x000f;
                case -240997565: goto L_0x0019;
                case 358786314: goto L_0x001c;
                case 1844922713: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 2131887179(0x7f12044b, float:1.9408958E38)
        L_0x000e:
            return r1
        L_0x000f:
            java.lang.String r0 = "SAVINGS"
            boolean r0 = r1.equals(r0)
            r1 = 2131887178(0x7f12044a, float:1.9408956E38)
            goto L_0x002f
        L_0x0019:
            java.lang.String r0 = "OD_SECURED"
            goto L_0x001e
        L_0x001c:
            java.lang.String r0 = "OD_UNSECURED"
        L_0x001e:
            boolean r0 = r1.equals(r0)
            r1 = 2131887177(0x7f120449, float:1.9408954E38)
            goto L_0x002f
        L_0x0026:
            java.lang.String r0 = "CURRENT"
            boolean r0 = r1.equals(r0)
            r1 = 2131887176(0x7f120448, float:1.9408952E38)
        L_0x002f:
            if (r0 != 0) goto L_0x000e
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111805hR.A0C():int");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ accountProvider: ");
        A0r.append(this.A0A);
        A0r.append(" issuerName: ");
        A0r.append(this.A01);
        A0r.append(" bankImageUrl: ");
        A0r.append(this.A03);
        A0r.append(" icon length: ");
        byte[] bArr = this.A09;
        A0r.append(bArr != null ? bArr.length : 0);
        A0r.append(" otpLength: ");
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A07);
        AnonymousClass5x3.A03(A0r, A0o.toString());
        A0r.append(" upiPinLength: ");
        StringBuilder A0o2 = AnonymousClass000.A0o();
        A0o2.append(this.A08);
        AnonymousClass5x3.A03(A0r, AnonymousClass000.A0h("", A0o2));
        A0r.append(" atmPinLength: ");
        StringBuilder A0o3 = AnonymousClass000.A0o();
        A0o3.append(this.A04);
        AnonymousClass5x3.A03(A0r, AnonymousClass000.A0h("", A0o3));
        A0r.append(" vpaHandle: ");
        A0r.append(this.A09);
        A0r.append(" vpaId: ");
        A0r.append(this.A0F);
        A0r.append(" bankPhoneNumber: ");
        A0r.append(this.A04);
        A0r.append(" bankCode: ");
        A0r.append(this.A0C);
        A0r.append(" pinFormat: ");
        StringBuilder A0o4 = AnonymousClass000.A0o();
        A0o4.append(this.A01);
        AnonymousClass5x3.A03(A0r, AnonymousClass000.A0h("", A0o4));
        A0r.append(" pspRouting: ");
        A0r.append(this.A0G);
        A0r.append(" supportPhoneNumber: ");
        A0r.append(this.A0D);
        A0r.append(" transactionPrefix: ");
        A0r.append(this.A0E);
        A0r.append(" banksListVersion: ");
        A0r.append(this.A00);
        return AnonymousClass000.A0h(" ]", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A03, i2);
        parcel.writeParcelable(this.A05, i2);
        parcel.writeParcelable(this.A07, i2);
        parcel.writeParcelable(this.A04, i2);
        parcel.writeParcelable(this.A08, i2);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeParcelable(this.A06, i2);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A09, i2);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeStringList(this.A0G);
        byte[] bArr = this.A09;
        parcel.writeInt(bArr == null ? 0 : bArr.length);
        byte[] bArr2 = this.A09;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i2);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0I ? 1 : 0);
    }
}
