package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.IResultReceiver;

/* renamed from: X.0Aw  reason: invalid class name and case insensitive filesystem */
public class C02330Aw extends Binder implements IResultReceiver {
    public final /* synthetic */ C06810Xz A00;

    public C02330Aw(C06810Xz r2) {
        this.A00 = r2;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            parcel.readInt();
            if (parcel.readInt() != 0) {
                Bundle.CREATOR.createFromParcel(parcel);
                return true;
            }
        } else if (i2 != 1598968902) {
            return super.onTransact(i2, parcel, parcel2, i3);
        } else {
            parcel2.writeString("android.support.v4.os.IResultReceiver");
        }
        return true;
    }
}
