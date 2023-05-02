package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4j5  reason: invalid class name and case insensitive filesystem */
public final class C93374j5 implements Parcelable {
    public static final C93294ix CREATOR = new C93294ix();
    public final boolean A00;

    public C93374j5(boolean z2) {
        this.A00 = z2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93374j5) && this.A00 == ((C93374j5) obj).A00);
    }

    public int hashCode() {
        boolean z2 = this.A00;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AvatarGetConfigEntity(hasAvatar=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
