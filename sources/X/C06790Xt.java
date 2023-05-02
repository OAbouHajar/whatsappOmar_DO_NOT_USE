package X;

import android.media.MediaDescription;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* renamed from: X.0Xt  reason: invalid class name and case insensitive filesystem */
public class C06790Xt implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.A00(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new MediaDescriptionCompat[i2];
    }
}
