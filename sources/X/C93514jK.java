package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jK  reason: invalid class name and case insensitive filesystem */
public class C93514jK implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(48);
    public final String A00;
    public final String A01;

    public C93514jK(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = AnonymousClass3K4.A0X(parcel);
    }

    public C93514jK(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("PhoneNumberSelectionInfo{phoneNumberLabel='");
        char A002 = AnonymousClass3K3.A00(this.A01, A0r);
        A0r.append(", phoneNumber='");
        A0r.append(this.A00);
        A0r.append(A002);
        return AnonymousClass000.A0k(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
