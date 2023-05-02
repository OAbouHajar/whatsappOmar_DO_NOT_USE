package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4j9  reason: invalid class name and case insensitive filesystem */
public final class C93414j9 implements Parcelable {
    public static final C93274iv CREATOR = new C93274iv();
    public final String A00;
    public final String A01;
    public final String A02;

    public C93414j9(String str, String str2, String str3) {
        C18450wi.A0J(str, str2);
        C18450wi.A0H(str3, 3);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93414j9) {
                C93414j9 r5 = (C93414j9) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A02, AnonymousClass3K2.A09(this.A00, AnonymousClass3K4.A07(this.A01)));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CategoryInfo(name=");
        A0r.append(this.A01);
        A0r.append(", iconUrl=");
        A0r.append(this.A00);
        A0r.append(", rootCategoryId=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }
}
