package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.List;

/* renamed from: X.1lW  reason: invalid class name and case insensitive filesystem */
public class C35191lW implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(82);
    public final List A00;

    public C35191lW(Parcel parcel) {
        this.A00 = parcel.createTypedArrayList(C35181lV.CREATOR);
    }

    public C35191lW(List list) {
        this.A00 = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.A00);
    }
}
