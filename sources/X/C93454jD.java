package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4jD  reason: invalid class name and case insensitive filesystem */
public class C93454jD implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(54);
    public final ArrayList A00;
    public final boolean A01;

    public C93454jD(Parcel parcel) {
        this.A01 = AnonymousClass000.A1O(parcel.readByte());
        this.A00 = parcel.createStringArrayList();
    }

    public C93454jD(ArrayList arrayList, boolean z2) {
        this.A01 = z2;
        this.A00 = arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeStringList(this.A00);
    }
}
