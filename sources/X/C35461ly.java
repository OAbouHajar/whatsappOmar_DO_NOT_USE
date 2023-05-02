package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ly  reason: invalid class name and case insensitive filesystem */
public class C35461ly implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(36);
    public final String A00;
    public final List A01;

    public C35461ly(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readStringList(arrayList);
    }

    public C35461ly(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }
}
