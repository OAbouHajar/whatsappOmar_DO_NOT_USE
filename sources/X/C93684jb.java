package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jb  reason: invalid class name and case insensitive filesystem */
public final class C93684jb implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(62);
    public final String A00;
    public final boolean A01;

    public C93684jb() {
        this("", false);
    }

    public C93684jb(String str, boolean z2) {
        C18450wi.A0H(str, 2);
        this.A01 = z2;
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93684jb) {
                C93684jb r5 = (C93684jb) obj;
                if (this.A01 != r5.A01 || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A01;
        if (z2) {
            z2 = true;
        }
        return AnonymousClass3K4.A08(this.A00, (z2 ? 1 : 0) * true);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("PaymentMethodDetailsInternationalViewState(isShimmering=");
        A0r.append(this.A01);
        A0r.append(", descriptionText=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A00);
    }
}
