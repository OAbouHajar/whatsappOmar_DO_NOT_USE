package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jM  reason: invalid class name and case insensitive filesystem */
public final class C93534jM implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(53);
    public final int A00;
    public final int A01;
    public final String A02;

    public C93534jM(int i2, String str, int i3) {
        this.A02 = str;
        this.A01 = i2;
        this.A00 = i3;
    }

    public C93534jM(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A0v(C93534jM.class, A0o);
        A0o.append("{url='");
        A0o.append(this.A02);
        A0o.append('\'');
        A0o.append(", width=");
        A0o.append(this.A01);
        A0o.append(", height=");
        A0o.append(this.A00);
        return AnonymousClass000.A0k(A0o);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
