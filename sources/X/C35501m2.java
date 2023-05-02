package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.HashMap;

/* renamed from: X.1m2  reason: invalid class name and case insensitive filesystem */
public class C35501m2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(33);
    public HashMap A00;

    public C35501m2() {
        this.A00 = new HashMap();
    }

    public C35501m2(Parcel parcel) {
        HashMap hashMap = (HashMap) parcel.readSerializable();
        this.A00 = hashMap == null ? new HashMap() : hashMap;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.A00);
    }
}
