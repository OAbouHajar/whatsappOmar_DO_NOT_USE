package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;

/* renamed from: X.0Xz  reason: invalid class name and case insensitive filesystem */
public class C06810Xz implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(9);
    public IResultReceiver A00;

    public C06810Xz(Parcel parcel) {
        IResultReceiver r1;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            r1 = (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) ? new AnonymousClass0YM(readStrongBinder) : (IResultReceiver) queryLocalInterface;
        }
        this.A00 = r1;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            IResultReceiver iResultReceiver = this.A00;
            if (iResultReceiver == null) {
                iResultReceiver = new C02330Aw(this);
                this.A00 = iResultReceiver;
            }
            parcel.writeStrongBinder(iResultReceiver.asBinder());
        }
    }
}
