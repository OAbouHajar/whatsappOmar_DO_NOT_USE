package android.support.v4.media.session;

import X.AnonymousClass000;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(5);
    public final Object A00;

    public MediaSessionCompat$Token(Object obj) {
        this.A00 = obj;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaSessionCompat$Token) {
            Object obj2 = this.A00;
            Object obj3 = ((MediaSessionCompat$Token) obj).A00;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 != null) {
                return obj2.equals(obj3);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            parcel.writeParcelable((Parcelable) this.A00, i2);
        } else {
            parcel.writeStrongBinder((IBinder) this.A00);
        }
    }
}
