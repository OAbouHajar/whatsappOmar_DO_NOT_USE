package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jP  reason: invalid class name and case insensitive filesystem */
public class C93564jP implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(42);
    public final String A00;
    public final String A01;

    public C93564jP(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C93564jP(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C93564jP r5 = (C93564jP) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A00;
        return AnonymousClass3K2.A08(this.A01, A1Z);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
