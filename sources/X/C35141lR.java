package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1lR  reason: invalid class name and case insensitive filesystem */
public class C35141lR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(87);
    public final String A00;
    public final List A01;

    public C35141lR(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readList(arrayList, C35161lT.class.getClassLoader());
    }

    public C35141lR(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeList(this.A01);
    }
}
