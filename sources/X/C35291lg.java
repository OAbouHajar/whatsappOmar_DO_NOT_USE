package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lg  reason: invalid class name and case insensitive filesystem */
public class C35291lg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(72);
    public final String A00;
    public final String[] A01;

    public C35291lg(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A00 = readString;
        String[] createStringArray = parcel.createStringArray();
        AnonymousClass00B.A06(createStringArray);
        this.A01 = createStringArray;
    }

    public C35291lg(String str, String[] strArr) {
        this.A00 = str;
        this.A01 = strArr;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeStringArray(this.A01);
    }
}
