package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lG  reason: invalid class name and case insensitive filesystem */
public class C35031lG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(101);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C35031lG(int i2, int i3, int i4, int i5) {
        this.A01 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A00 = i5;
    }

    public C35031lG(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C35031lG r5 = (C35031lG) obj;
            if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.A01) * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }
}
