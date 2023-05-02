package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0YE  reason: invalid class name */
public class AnonymousClass0YE implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(27);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    public AnonymousClass0YE() {
    }

    public AnonymousClass0YE(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() != 1 ? false : true;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.A03 = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("FullSpanItem{mPosition=");
        A0r.append(this.A01);
        A0r.append(", mGapDir=");
        A0r.append(this.A00);
        A0r.append(", mHasUnwantedGapAfter=");
        A0r.append(this.A02);
        A0r.append(", mGapPerSpan=");
        A0r.append(Arrays.toString(this.A03));
        return AnonymousClass000.A0k(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(length);
        parcel.writeIntArray(this.A03);
    }
}
