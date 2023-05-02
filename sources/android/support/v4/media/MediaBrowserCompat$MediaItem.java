package android.support.v4.media;

import X.AnonymousClass000;
import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(0);
    public final int A00;
    public final MediaDescriptionCompat A01;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("MediaItem{");
        A0r.append("mFlags=");
        A0r.append(this.A00);
        A0r.append(", mDescription=");
        A0r.append(this.A01);
        return AnonymousClass000.A0k(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i2);
    }
}
