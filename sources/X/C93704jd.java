package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4jd  reason: invalid class name and case insensitive filesystem */
public final class C93704jd implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(32);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public C93704jd(int i2, byte[] bArr, int i3, int i4) {
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A04 = bArr;
    }

    public C93704jd(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C93704jd.class != obj.getClass()) {
                return false;
            }
            C93704jd r5 = (C93704jd) obj;
            if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03 && Arrays.equals(this.A04, r5.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        int A0B = AnonymousClass3K4.A0B(this.A04, (((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31);
        this.A00 = A0B;
        return A0B;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ColorInfo(");
        A0r.append(this.A02);
        A0r.append(", ");
        A0r.append(this.A01);
        A0r.append(", ");
        A0r.append(this.A03);
        A0r.append(", ");
        A0r.append(AnonymousClass000.A1V(this.A04));
        return AnonymousClass000.A0h(")", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A04;
        parcel.writeInt(AnonymousClass000.A1V(bArr) ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
