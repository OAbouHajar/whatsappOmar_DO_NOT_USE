package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: X.1lu  reason: invalid class name and case insensitive filesystem */
public class C35421lu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(40);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C35421lu(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A01 = readString;
        String readString2 = parcel.readString();
        AnonymousClass00B.A06(readString2);
        this.A02 = readString2;
        this.A00 = parcel.readLong();
        this.A03 = parcel.readString();
    }

    public C35421lu(String str, String str2, String str3, long j2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j2;
        this.A03 = str3;
    }

    public C35421lu(JSONObject jSONObject) {
        this.A01 = jSONObject.optString("id");
        this.A02 = jSONObject.optString("message_id");
        this.A00 = jSONObject.optLong("expiry_ts");
        this.A03 = jSONObject.optString("payment_config_id");
    }

    public C28371Vv A00() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL("id", this.A01));
        arrayList.add(new C35081lL("message_id", this.A02));
        String str = this.A03;
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new C35081lL("payment_config_id", str));
        }
        return new C28371Vv("order", (C35081lL[]) arrayList.toArray(new C35081lL[0]));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A03);
    }
}
