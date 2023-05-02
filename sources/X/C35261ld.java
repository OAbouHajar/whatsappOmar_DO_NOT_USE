package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1ld  reason: invalid class name and case insensitive filesystem */
public class C35261ld extends C35271le {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(74);
    public final boolean A00;

    public C35261ld(String str, boolean z2) {
        super(str, "WEBVIEW");
        this.A00 = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
