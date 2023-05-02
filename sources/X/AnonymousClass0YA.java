package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0YA  reason: invalid class name */
public final class AnonymousClass0YA implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(11);
    public final int A00;
    public final int A01;
    public final Intent A02;
    public final IntentSender A03;

    public AnonymousClass0YA(Intent intent, IntentSender intentSender, int i2, int i3) {
        this.A03 = intentSender;
        this.A02 = intent;
        this.A00 = i2;
        this.A01 = i3;
    }

    public AnonymousClass0YA(Parcel parcel) {
        this.A03 = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.A02 = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A03, i2);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
