package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4jW  reason: invalid class name and case insensitive filesystem */
public final class C93634jW implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(30);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int[] A04;

    public C93634jW(Parcel parcel) {
        this.A01 = parcel.readInt();
        int readByte = parcel.readByte();
        this.A02 = readByte;
        int[] iArr = new int[readByte];
        this.A04 = iArr;
        parcel.readIntArray(iArr);
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public C93634jW(int... iArr) {
        this.A01 = 0;
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length);
        this.A04 = copyOf;
        this.A02 = length;
        this.A03 = 2;
        this.A00 = 0;
        Arrays.sort(copyOf);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C93634jW.class != obj.getClass()) {
                return false;
            }
            C93634jW r5 = (C93634jW) obj;
            if (!(this.A01 == r5.A01 && Arrays.equals(this.A04, r5.A04) && this.A03 == r5.A03 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + Arrays.hashCode(this.A04)) * 31) + this.A03) * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A01);
        int[] iArr = this.A04;
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(iArr);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
    }
}
