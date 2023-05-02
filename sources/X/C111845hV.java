package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5hV  reason: invalid class name and case insensitive filesystem */
public class C111845hV extends AnonymousClass1W2 {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(12);
    public long A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public void A01(AnonymousClass173 r1, C28371Vv r2, int i2) {
    }

    public void A02(List list, int i2) {
        if (!TextUtils.isEmpty(this.A04)) {
            C110105dW.A1R("nonce", this.A04, list);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            C110105dW.A1R("device-id", this.A03, list);
        }
        Boolean bool = this.A01;
        if (bool != null) {
            C110105dW.A1R("is_first_send", bool.booleanValue() ? "1" : "0", list);
        }
    }

    public String A03() {
        return null;
    }

    public void A04(String str) {
        try {
            super.A04(str);
            JSONObject A0K = C13700nu.A0K(str);
            this.A00 = A0K.optLong("expiryTs", this.A00);
            this.A04 = A0K.optString("nonce", this.A04);
            this.A03 = A0K.optString("deviceId", this.A03);
            this.A02 = A0K.optString("amount", this.A02);
            this.A05 = A0K.optString("sender-alias", this.A05);
            if (A0K.has("isFirstSend")) {
                this.A01 = Boolean.valueOf(A0K.optBoolean("isFirstSend", false));
            }
        } catch (JSONException e2) {
            Log.w("PAY: BrazilTransactionCountryData fromDBString threw: ", e2);
        }
    }

    public int A05() {
        return 0;
    }

    public int A06() {
        return 0;
    }

    public int A07() {
        return 0;
    }

    public long A09() {
        return this.A00;
    }

    public long A0A() {
        return 0;
    }

    public C48362Mw A0F() {
        C28581Wr A0U = AnonymousClass2N0.A02.A0U();
        C28581Wr A0U2 = C48362Mw.A04.A0U();
        C28541Wm A022 = A0U.A02();
        A0U2.A03();
        C48362Mw r1 = (C48362Mw) A0U2.A00;
        r1.A03 = A022;
        r1.A02 = 2;
        return (C48362Mw) A0U2.A02();
    }

    public String A0H() {
        return null;
    }

    public String A0I() {
        return null;
    }

    public String A0J() {
        return this.A05;
    }

    public String A0K() {
        try {
            JSONObject A0M = A0M();
            long j2 = this.A00;
            if (j2 > 0) {
                A0M.put("expiryTs", j2);
            }
            String str = this.A04;
            if (str != null) {
                A0M.put("nonce", str);
            }
            String str2 = this.A02;
            if (str2 != null) {
                A0M.put("amount", str2);
            }
            String str3 = this.A03;
            if (str3 != null) {
                A0M.put("deviceId", str3);
            }
            String str4 = this.A05;
            if (str4 != null) {
                A0M.put("sender-alias", str4);
            }
            Boolean bool = this.A01;
            if (bool != null) {
                A0M.put("isFirstSend", bool);
            }
            return A0M.toString();
        } catch (JSONException e2) {
            Log.w("PAY: BrazilTransactionCountryData toDBString threw: ", e2);
            return null;
        }
    }

    public String A0L() {
        return null;
    }

    public void A0N(int i2) {
    }

    public void A0O(int i2) {
    }

    public void A0P(int i2) {
    }

    public void A0R(long j2) {
        this.A00 = j2;
    }

    public void A0T(AnonymousClass1W2 r6) {
        super.A0T(r6);
        C111845hV r62 = (C111845hV) r6;
        long j2 = r62.A00;
        if (j2 > 0) {
            this.A00 = j2;
        }
        String str = r62.A04;
        if (str != null) {
            this.A04 = str;
        }
        String str2 = r62.A03;
        if (str2 != null) {
            this.A03 = str2;
        }
        String str3 = r62.A02;
        if (str3 != null) {
            this.A02 = str3;
        }
        String str4 = r62.A05;
        if (str4 != null) {
            this.A05 = str4;
        }
        Boolean bool = r62.A01;
        if (bool != null) {
            this.A01 = bool;
        }
    }

    public void A0V(String str) {
    }

    public void A0W(String str) {
    }

    public void A0X(String str) {
        this.A05 = str;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeSerializable(this.A01);
    }
}
