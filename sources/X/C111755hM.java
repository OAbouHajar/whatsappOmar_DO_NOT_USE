package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5hM  reason: invalid class name and case insensitive filesystem */
public final class C111755hM extends C35511m3 {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(10);
    public int A00 = 1;

    public C111755hM() {
    }

    public C111755hM(Parcel parcel) {
        super(parcel);
    }

    public void A02(List list, int i2) {
        throw new UnsupportedOperationException("BrazilContactData toNetwork not supported");
    }

    public String A03() {
        try {
            String A03 = super.A03();
            JSONObject A0K = A03 != null ? C13700nu.A0K(A03) : C13700nu.A0J();
            A0K.put("v", this.A00);
            long j2 = this.A01;
            if (j2 != -1) {
                A0K.put("nextSyncTimeMillis", j2);
            }
            if (!TextUtils.isEmpty(this.A06)) {
                A0K.put("dataHash", this.A06);
            }
            return A0K.toString();
        } catch (JSONException e2) {
            Log.w("PAY: BrazilContactData toDBString threw: ", e2);
            return null;
        }
    }

    public void A04(String str) {
        super.A04(str);
        if (str != null) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                int optInt = A0K.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A01 = A0K.optLong("nextSyncTimeMillis", -1);
                }
                this.A06 = A0K.optString("dataHash");
            } catch (JSONException e2) {
                Log.w("PAY: BrazilContactData fromDBString threw: ", e2);
            }
        }
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ ver: ");
        A0r.append(this.A00);
        A0r.append(" jid: ");
        A0r.append(this.A05);
        A0r.append(" isMerchant: ");
        A0r.append(this.A07);
        A0r.append(" defaultPaymentType: ");
        A0r.append(this.A00);
        return AnonymousClass000.A0h(" ]", A0r);
    }
}
