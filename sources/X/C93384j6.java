package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.4j6  reason: invalid class name and case insensitive filesystem */
public final class C93384j6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(63);
    public final List A00;

    public C93384j6(List list) {
        this.A00 = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93384j6) && C18450wi.A0R(this.A00, ((C93384j6) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0C(this.A00);
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.A00, AnonymousClass000.A0r("AvatarGetProfilePhotoPosesEntity(poses="));
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeTypedList(this.A00);
    }
}
