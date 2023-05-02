package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0YD  reason: invalid class name */
public final class AnonymousClass0YD implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(10);
    public final int A00;
    public final Intent A01;

    public AnonymousClass0YD(int i2, Intent intent) {
        this.A00 = i2;
        this.A01 = intent;
    }

    public AnonymousClass0YD(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ActivityResult{resultCode=");
        int i2 = this.A00;
        A0r.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        A0r.append(", data=");
        A0r.append(this.A01);
        return AnonymousClass000.A0k(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        Intent intent = this.A01;
        int i3 = 1;
        if (intent == null) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
