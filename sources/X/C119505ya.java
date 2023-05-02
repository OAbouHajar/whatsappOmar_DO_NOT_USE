package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.mod2.fblibs.FacebookFacade;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5ya  reason: invalid class name and case insensitive filesystem */
public class C119505ya implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(13);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;

    public C119505ya(Parcel parcel) {
        this.A07 = parcel.readString();
        ArrayList A0u = AnonymousClass000.A0u();
        this.A08 = A0u;
        parcel.readList(A0u, String.class.getClassLoader());
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A09 = parcel.readInt() != 1 ? false : true;
        int readInt = parcel.readInt();
        this.A00 = readInt != 0 ? Integer.valueOf(readInt) : null;
    }

    public C119505ya(Integer num, String str, String str2, String str3, String str4, boolean z2) {
        this.A07 = str;
        this.A08 = null;
        this.A06 = "";
        this.A05 = str2;
        this.A04 = "";
        this.A03 = str3;
        this.A02 = "";
        this.A01 = str4;
        this.A09 = z2;
        this.A00 = num;
    }

    public C119505ya(JSONObject jSONObject) {
        this.A07 = jSONObject.getString("type");
        JSONArray jSONArray = jSONObject.getJSONArray("url_regex_list");
        this.A08 = AnonymousClass000.A0u();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.A08.add(jSONArray.getString(i2));
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("title");
        this.A06 = jSONObject2.getString(FacebookFacade.RequestParameter.NAME);
        this.A05 = jSONObject2.getString("default_text");
        JSONObject jSONObject3 = jSONObject.getJSONObject("subtitle");
        this.A04 = jSONObject3.getString(FacebookFacade.RequestParameter.NAME);
        this.A03 = jSONObject3.getString("default_text");
        JSONObject jSONObject4 = jSONObject.getJSONObject("button");
        this.A02 = jSONObject4.getString(FacebookFacade.RequestParameter.NAME);
        this.A01 = jSONObject4.getString("default_text");
        this.A09 = false;
        this.A00 = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A07);
        parcel.writeList(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A09 ? 1 : 0);
        Integer num = this.A00;
        parcel.writeInt(num != null ? num.intValue() : 0);
    }
}
