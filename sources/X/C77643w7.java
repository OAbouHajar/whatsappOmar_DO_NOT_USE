package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3w7  reason: invalid class name and case insensitive filesystem */
public class C77643w7 extends C35271le {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(61);

    public C77643w7(String str) {
        super(str, "DOC_UPLOAD");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
    }
}
