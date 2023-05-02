package android.support.v4.media;

import X.AnonymousClass000;
import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(2);
    public final float A00;
    public final int A01;

    public RatingCompat(int i2, float f2) {
        this.A01 = i2;
        this.A00 = f2;
    }

    public int describeContents() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Rating:style=");
        A0r.append(this.A01);
        A0r.append(" rating=");
        float f2 = this.A00;
        return AnonymousClass000.A0h(f2 < 0.0f ? "unrated" : String.valueOf(f2), A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }
}
