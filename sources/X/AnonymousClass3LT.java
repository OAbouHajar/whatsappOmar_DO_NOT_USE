package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3LT  reason: invalid class name */
public abstract class AnonymousClass3LT extends Binder implements IInterface {
    public AnonymousClass3LT() {
        attachInterface(this, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        Parcelable.Creator creator;
        if (i2 <= 16777215) {
            AnonymousClass3K4.A0l(this, parcel);
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        C66233Yo r3 = (C66233Yo) this;
        switch (i2) {
            case 1:
                creator = Status.CREATOR;
                break;
            case 2:
                AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                creator = C66193Yk.CREATOR;
                break;
            case 3:
                AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                creator = AnonymousClass3Yh.CREATOR;
                break;
            case 4:
                if (r3 instanceof C66203Yl) {
                    ((C66203Yl) r3).A00.A00.A01((Object) null);
                    return true;
                }
                break;
            case 5:
                Status status = (Status) AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                if (r3 instanceof C66203Yl) {
                    C14370p3 r0 = ((C66203Yl) r3).A00.A00;
                    r0.A00.A07(new AnonymousClass3WQ(status));
                    return true;
                }
                C14370p3 r02 = ((C66213Ym) r3).A00.A00;
                r02.A00.A07(new AnonymousClass3WQ(status));
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                if (r3 instanceof C66213Ym) {
                    ((C66213Ym) r3).A01.A00.A01(createByteArray);
                    return true;
                }
                break;
            case 7:
                creator = AnonymousClass3XZ.CREATOR;
                break;
            default:
                return false;
        }
        AnonymousClass3K2.A0N(parcel, creator);
        throw C13680ns.A0m();
    }
}
