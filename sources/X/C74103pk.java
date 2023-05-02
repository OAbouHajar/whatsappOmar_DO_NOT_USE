package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3pk  reason: invalid class name and case insensitive filesystem */
public final class C74103pk extends AnonymousClass1W2 {
    public static final C93284iw CREATOR = new C93284iw();
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public String A04;

    public void A01(AnonymousClass173 r3, C28371Vv r4, int i2) {
        if (r4 != null) {
            String A0N = r4.A0N("psp_transaction_id", (String) null);
            if (A0N != null) {
                this.A04 = A0N;
            }
            String A0N2 = r4.A0N("psp_receipt_url", (String) null);
            if (A0N2 != null) {
                this.A03 = A0N2;
            }
        }
    }

    public void A02(List list, int i2) {
        C18450wi.A0H(list, 1);
        String str = this.A04;
        if (str != null) {
            list.add(new C35081lL("psp_transaction_id", str));
        }
        String str2 = this.A03;
        if (str2 != null) {
            list.add(new C35081lL("psp_receipt_url", str2));
        }
    }

    public String A03() {
        return null;
    }

    public void A04(String str) {
        super.A04(str);
        JSONObject jSONObject = new JSONObject(str);
        this.A04 = jSONObject.optString("pspTransactionId", this.A04);
        this.A03 = jSONObject.optString("pspReceiptURL", this.A03);
    }

    public int A05() {
        return this.A00;
    }

    public int A06() {
        return this.A01;
    }

    public int A07() {
        return 0;
    }

    public long A09() {
        return this.A02;
    }

    public long A0A() {
        return 0;
    }

    public String A0G() {
        return this.A04;
    }

    public String A0H() {
        return null;
    }

    public String A0I() {
        return null;
    }

    public String A0J() {
        return null;
    }

    public String A0K() {
        try {
            JSONObject A0M = A0M();
            String str = this.A04;
            if (str != null) {
                A0M.put("pspTransactionId", str);
            }
            String str2 = this.A03;
            if (str2 != null) {
                A0M.put("pspReceiptURL", str2);
            }
            return A0M.toString();
        } catch (JSONException e2) {
            Log.w("PAY: P2mLiteTransactionMetadata metaDataToDbString threw: ", e2);
            return null;
        }
    }

    public String A0L() {
        return null;
    }

    public void A0N(int i2) {
        this.A00 = i2;
    }

    public void A0O(int i2) {
        this.A01 = i2;
    }

    public void A0P(int i2) {
    }

    public void A0R(long j2) {
        this.A02 = j2;
    }

    public void A0T(AnonymousClass1W2 r2) {
        super.A0T(r2);
        C74103pk r22 = (C74103pk) r2;
        String str = r22.A04;
        if (str != null) {
            this.A04 = str;
        }
        String str2 = r22.A03;
        if (str2 != null) {
            this.A03 = str2;
        }
    }

    public void A0V(String str) {
    }

    public void A0W(String str) {
    }

    public void A0X(String str) {
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }
}
