package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4j8  reason: invalid class name and case insensitive filesystem */
public final class C93404j8 implements Parcelable {
    public static final C93254it CREATOR = new C93254it();
    public final double A00;
    public final double A01;
    public final int A02;

    public C93404j8(double d2, double d3, int i2) {
        this.A00 = d2;
        this.A01 = d3;
        this.A02 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93404j8) {
                C93404j8 r6 = (C93404j8) obj;
                if (!C18450wi.A0R(Double.valueOf(this.A00), Double.valueOf(r6.A00)) || !C18450wi.A0R(Double.valueOf(this.A01), Double.valueOf(r6.A01)) || this.A02 != r6.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass3K2.A04(Double.doubleToLongBits(this.A00)) * 31) + AnonymousClass3K2.A04(Double.doubleToLongBits(this.A01))) * 31) + this.A02;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BusinessCluster(latitude=");
        A0r.append(this.A00);
        A0r.append(", longitude=");
        A0r.append(this.A01);
        A0r.append(", businessCount=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A02);
    }
}
