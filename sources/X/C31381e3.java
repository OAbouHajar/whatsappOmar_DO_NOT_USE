package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: X.1e3  reason: invalid class name and case insensitive filesystem */
public class C31381e3 extends Binder implements IInterface {
    public C31381e3(String str) {
        attachInterface(this, str);
    }

    public boolean A00(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (!(this instanceof C58052sT)) {
            return false;
        }
        C58052sT r5 = (C58052sT) this;
        if (i2 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Parcelable parcelable = parcel.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcel);
            C13710nw.A02(r5.A00, "onPostInitComplete can be called only once per call to getRemoteService");
            r5.A00.A03((Bundle) parcelable, readStrongBinder, readInt, r5.A01);
        } else if (i2 == 2) {
            parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                creator.createFromParcel(parcel);
            }
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            parcel2.writeNoException();
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C66113Xv r7 = (C66113Xv) (parcel.readInt() == 0 ? null : (Parcelable) C66113Xv.CREATOR.createFromParcel(parcel));
            C15770rp r1 = r5.A00;
            C13710nw.A02(r1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C13710nw.A01(r7);
            r1.A0Q = r7;
            if (r1.A06()) {
                C65943Xe r0 = r7.A02;
                C89874d5 A00 = C89874d5.A00();
                C65933Xd r2 = r0 == null ? null : r0.A01;
                synchronized (A00) {
                    if (r2 == null) {
                        r2 = C89874d5.A02;
                    } else {
                        C65933Xd r02 = A00.A00;
                        if (r02 != null) {
                            if (r02.A00 < r2.A00) {
                            }
                        }
                    }
                    A00.A00 = r2;
                }
            }
            Bundle bundle = r7.A01;
            C13710nw.A02(r5.A00, "onPostInitComplete can be called only once per call to getRemoteService");
            r5.A00.A03(bundle, readStrongBinder2, readInt2, r5.A01);
        }
        r5.A00 = null;
        parcel2.writeNoException();
        return true;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        return A00(i2, parcel, parcel2, i3);
    }
}
