package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxObjectShape25S0000000_I1;

/* renamed from: X.0Y8  reason: invalid class name */
public class AnonymousClass0Y8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxObjectShape25S0000000_I1(3);
    public final Bundle A00;

    public AnonymousClass0Y8(Bundle bundle) {
        this.A00 = bundle;
    }

    public AnonymousClass0Y8(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.A00 = readBundle;
        if (classLoader != null && readBundle != null) {
            readBundle.setClassLoader(classLoader);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.A00);
    }
}
