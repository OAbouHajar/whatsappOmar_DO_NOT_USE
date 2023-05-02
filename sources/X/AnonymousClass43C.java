package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.43C  reason: invalid class name */
public enum AnonymousClass43C implements Parcelable {
    LONG_PRESS,
    TRIGGERED;
    
    public static final Parcelable.Creator CREATOR = null;

    /* access modifiers changed from: public */
    static {
        CREATOR = AnonymousClass3K3.A0W(51);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(ordinal());
    }
}
