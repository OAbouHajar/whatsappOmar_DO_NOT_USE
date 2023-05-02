package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.mod2.fblibs.FacebookFacade;
import org.json.JSONObject;

/* renamed from: X.3oM  reason: invalid class name and case insensitive filesystem */
public class C73563oM extends C31241dn {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(59);
    public final String A00;
    public final String A01;

    public C73563oM(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public C73563oM(String str, String str2) {
        super(str, str2);
        this.A01 = "";
        this.A00 = null;
    }

    public C73563oM(String str, String str2, String str3, String str4) {
        super(str, str2);
        this.A01 = str3;
        this.A00 = str4;
    }

    public static C73563oM A00(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        AnonymousClass00B.A05(string);
        String string2 = jSONObject.getString(FacebookFacade.RequestParameter.NAME);
        AnonymousClass00B.A05(string2);
        return new C73563oM(string, string2, jSONObject.optString("icon_url", ""), jSONObject.optString("bg_color"));
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
