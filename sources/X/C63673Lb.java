package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.3Lb  reason: invalid class name and case insensitive filesystem */
public abstract class C63673Lb extends Binder implements IInterface {
    public static C107925Ly zzc;

    public C63673Lb(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public abstract boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3);

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            AnonymousClass3K4.A0l(this, parcel);
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        return dispatchTransaction(i2, parcel, parcel2, i3);
    }
}
