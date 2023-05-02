package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5yZ  reason: invalid class name */
public final class AnonymousClass5yZ implements Parcelable {
    public static final AnonymousClass5yY CREATOR = new AnonymousClass5yY();
    public final int A00;
    public final int A01;
    public final C114855oi A02;

    public AnonymousClass5yZ() {
        this(C114855oi.NONE, -1, -1);
    }

    public AnonymousClass5yZ(C114855oi r2, int i2, int i3) {
        C18450wi.A0H(r2, 1);
        this.A02 = r2;
        this.A01 = i2;
        this.A00 = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5yZ) {
                AnonymousClass5yZ r5 = (AnonymousClass5yZ) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CheckoutErrorContent(code=");
        A0r.append(this.A02);
        A0r.append(", titleRes=");
        A0r.append(this.A01);
        A0r.append(", descriptionRes=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeSerializable(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
