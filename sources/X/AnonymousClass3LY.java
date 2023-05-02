package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3LY  reason: invalid class name */
public abstract class AnonymousClass3LY extends Binder implements IInterface {
    public AnonymousClass3LY(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            AnonymousClass3K4.A0l(this, parcel);
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        if (this instanceof C66273Ys) {
            C66273Ys r3 = (C66273Ys) this;
            if (i2 != 1) {
                return false;
            }
            AnonymousClass459.A00((Status) AnonymousClass3K2.A0N(parcel, Status.CREATOR), r3.A00, Boolean.valueOf(AnonymousClass000.A1O(parcel.readInt())));
            return true;
        } else if (this instanceof C66263Yr) {
            C66263Yr r32 = (C66263Yr) this;
            if (i2 != 1) {
                return false;
            }
            AnonymousClass459.A00((Status) AnonymousClass3K2.A0N(parcel, Status.CREATOR), r32.A00, parcel.createByteArray());
            return true;
        } else {
            C66253Yq r33 = (C66253Yq) this;
            if (i2 != 1) {
                return false;
            }
            AnonymousClass459.A00((Status) AnonymousClass3K2.A0N(parcel, Status.CREATOR), r33.A00, Integer.valueOf(parcel.readInt()));
            return true;
        }
    }
}
