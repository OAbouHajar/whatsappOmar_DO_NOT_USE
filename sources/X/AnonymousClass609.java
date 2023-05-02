package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.609  reason: invalid class name */
public class AnonymousClass609 implements AnonymousClass5UL {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(6);
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;

    public AnonymousClass609(C28371Vv r9, String str) {
        if (str != null) {
            this.A03 = C29501aj.A00(str, 0) == 1;
        }
        if (r9 != null) {
            String A0N = r9.A0N("created-ts", (String) null);
            if (A0N != null) {
                this.A00 = C29501aj.A01(A0N, 0) * 1000;
            }
            String A0N2 = r9.A0N("updated-ts", (String) null);
            if (A0N2 != null) {
                this.A01 = C29501aj.A01(A0N2, 0) * 1000;
            }
            String A0N3 = r9.A0N("complaint-status", (String) null);
            if (!TextUtils.isEmpty(A0N3)) {
                this.A02 = A0N3;
            }
        }
    }

    public AnonymousClass609(Parcel parcel) {
        this.A03 = AnonymousClass000.A1O(parcel.readByte());
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readString();
    }

    public AnonymousClass609(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                this.A03 = A0K.optBoolean("is-complaint-eligible", false);
                this.A00 = A0K.optLong("created-ts");
                this.A01 = A0K.optLong("updated-ts");
                this.A02 = A0K.optString("complaint-status");
            } catch (JSONException e2) {
                Log.w("PAY: IndiaUpiTransactionComplaintData threw: ", e2);
            }
        }
    }

    public String A00() {
        JSONObject A0J = C13700nu.A0J();
        try {
            A0J.put("is-complaint-eligible", this.A03);
            long j2 = this.A00;
            if (j2 > 0) {
                A0J.put("created-ts", j2);
            }
            long j3 = this.A01;
            if (j3 > 0) {
                A0J.put("updated-ts", j3);
            }
            String str = this.A02;
            if (str != null) {
                A0J.put("complaint-status", str);
            }
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiTransactionComplaintData toJson threw: ", e2);
        }
        return A0J.toString();
    }

    public String AAk() {
        return this.A02;
    }

    public long AGn() {
        return this.A01;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiTransactionComplaintData{isComplaintEligible='");
        A0r.append(this.A03);
        A0r.append('\'');
        A0r.append(", createdTs='");
        A0r.append(this.A00);
        A0r.append('\'');
        A0r.append(", updatedTs='");
        A0r.append(this.A01);
        A0r.append('\'');
        A0r.append(", complaintStatus='");
        A0r.append(this.A02);
        A0r.append('\'');
        return AnonymousClass000.A0k(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02);
    }
}
