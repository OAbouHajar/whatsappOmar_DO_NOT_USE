package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0FJ  reason: invalid class name */
public class AnonymousClass0FJ extends AnonymousClass0Bb {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(21);
    public Set A00;

    public AnonymousClass0FJ(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.A00 = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.A00, strArr);
    }

    public AnonymousClass0FJ(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A00.size());
        Set set = this.A00;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }
}
