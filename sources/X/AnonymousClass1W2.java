package X;

import android.os.Parcel;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1W2  reason: invalid class name */
public abstract class AnonymousClass1W2 extends AnonymousClass1W3 {
    public C35471lz A00;
    public C35431lv A01;
    public C35421lu A02;
    public Boolean A03;
    public boolean A04;

    public void A04(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.A04 = jSONObject.optBoolean("messageDeleted", false);
            JSONObject optJSONObject = jSONObject.optJSONObject("money");
            if (optJSONObject != null) {
                C28411Vz r7 = C35481m0.A06;
                new C35431lv(r7, 1, 0);
                long optLong = optJSONObject.optLong("value", -1);
                int optInt = optJSONObject.optInt("offset", -1);
                int optInt2 = optJSONObject.optInt("currencyType", -1);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("currency");
                if (optJSONObject2 != null) {
                    r7 = optInt2 != 1 ? new C35481m0(optJSONObject2) : new C35531m5(optJSONObject2);
                }
                this.A01 = optInt <= 0 ? new C35431lv(r7, 1, optLong) : new C35431lv(r7, optInt, optLong);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("incentive");
            if (optJSONObject3 != null) {
                this.A00 = new C35471lz(optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("order");
            if (optJSONObject4 != null) {
                this.A02 = new C35421lu(optJSONObject4);
            } else {
                String optString = jSONObject.optString("orderId");
                long optLong2 = jSONObject.optLong("orderExpiryTsInSec");
                String optString2 = jSONObject.optString("orderMessageId");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    this.A02 = new C35421lu(optString, optString2, (String) null, optLong2);
                }
            }
            this.A03 = Boolean.valueOf(jSONObject.optBoolean("isPendingRequestViewed", false));
        } catch (JSONException e2) {
            Log.w("PAY: PaymentTransactionCountryData fromDBString threw: ", e2);
        }
    }

    public abstract int A05();

    public abstract int A06();

    public abstract int A07();

    public long A08() {
        return 0;
    }

    public abstract long A09();

    public abstract long A0A();

    public AnonymousClass5UL A0B() {
        return null;
    }

    public C35301lh A0C() {
        return null;
    }

    public C35301lh A0D() {
        return null;
    }

    public C35301lh A0E() {
        return null;
    }

    public C48362Mw A0F() {
        return null;
    }

    public String A0G() {
        return null;
    }

    public abstract String A0H();

    public abstract String A0I();

    public abstract String A0J();

    public abstract String A0K();

    public abstract String A0L();

    public JSONObject A0M() {
        JSONObject jSONObject = new JSONObject();
        boolean z2 = this.A04;
        if (z2) {
            jSONObject.put("messageDeleted", z2);
        }
        C35431lv r0 = this.A01;
        if (r0 != null) {
            jSONObject.put("money", r0.A01());
        }
        C35471lz r4 = this.A00;
        if (r4 != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("offer-id", r4.A02);
                String str = r4.A01;
                if (str != null) {
                    jSONObject2.put("offer-claim-id", str);
                }
                String str2 = r4.A03;
                if (str2 != null) {
                    jSONObject2.put("parent-transaction-id", str2);
                }
                String str3 = r4.A00;
                if (str3 != null) {
                    jSONObject2.put("incentive-payment-id", str3);
                }
            } catch (JSONException e2) {
                Log.w("PAY: PaymentIncentiveData toJson threw: ", e2);
            }
            jSONObject.put("incentive", jSONObject2);
        }
        C35421lu r5 = this.A02;
        if (r5 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", r5.A01);
            jSONObject3.put("message_id", r5.A02);
            jSONObject3.put("expiry_ts", r5.A00);
            String str4 = r5.A03;
            if (!TextUtils.isEmpty(str4)) {
                jSONObject3.put("payment_config_id", str4);
            }
            jSONObject.put("order", jSONObject3);
        }
        Boolean bool = this.A03;
        if (bool != null) {
            jSONObject.put("isPendingRequestViewed", bool.booleanValue());
        }
        return jSONObject;
    }

    public abstract void A0N(int i2);

    public abstract void A0O(int i2);

    public abstract void A0P(int i2);

    public void A0Q(long j2) {
    }

    public abstract void A0R(long j2);

    public void A0S(Parcel parcel) {
        boolean z2 = true;
        if (parcel.readByte() != 1) {
            z2 = false;
        }
        this.A04 = z2;
        this.A01 = (C35431lv) parcel.readParcelable(C35431lv.class.getClassLoader());
        this.A02 = (C35421lu) parcel.readParcelable(C35421lu.class.getClassLoader());
        this.A03 = (Boolean) parcel.readSerializable();
    }

    public void A0T(AnonymousClass1W2 r2) {
        this.A04 = r2.A04;
        C35431lv r0 = r2.A01;
        if (r0 != null) {
            this.A01 = r0;
        }
        C35471lz r02 = r2.A00;
        if (r02 != null) {
            this.A00 = r02;
        }
        C35421lu r03 = r2.A02;
        if (r03 != null) {
            this.A02 = r03;
        }
        Boolean bool = r2.A03;
        if (bool != null) {
            this.A03 = bool;
        }
    }

    public void A0U(String str) {
    }

    public abstract void A0V(String str);

    public abstract void A0W(String str);

    public abstract void A0X(String str);

    public boolean A0Y() {
        return false;
    }

    public boolean A0Z(AnonymousClass1Vt r2) {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A01, 0);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeSerializable(this.A03);
    }
}
