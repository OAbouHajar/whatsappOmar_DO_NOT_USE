package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;

/* renamed from: X.5hP  reason: invalid class name and case insensitive filesystem */
public class C111785hP extends C30671cl {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(2);
    public final String A00;

    public C111785hP(Parcel parcel) {
        this.A00 = parcel.readString();
        A08(parcel);
    }

    public C111785hP(String str, String str2) {
        this.A00 = str;
        A09(str2);
    }

    public int A04() {
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        super.writeToParcel(parcel, i2);
    }
}
