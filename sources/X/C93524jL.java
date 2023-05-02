package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jL  reason: invalid class name and case insensitive filesystem */
public class C93524jL implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(33);
    public final String A00;
    public final String A01;
    public final String A02;

    public C93524jL(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C93524jL(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DeviceSimInfo{countryCode='");
        char A002 = AnonymousClass3K3.A00(this.A00, A0r);
        A0r.append(", phoneNumber='");
        A0r.append(this.A02);
        A0r.append(A002);
        A0r.append(", networkOperatorName='");
        A0r.append(this.A01);
        A0r.append(A002);
        return AnonymousClass000.A0k(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
