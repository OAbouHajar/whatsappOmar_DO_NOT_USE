package android.support.v4.media.session;

import X.AnonymousClass000;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(3);
    public final long A00;
    public final MediaDescriptionCompat A01;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("MediaSession.QueueItem {Description=");
        A0r.append(this.A01);
        A0r.append(", Id=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h(" }", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        this.A01.writeToParcel(parcel, i2);
        parcel.writeLong(this.A00);
    }
}
