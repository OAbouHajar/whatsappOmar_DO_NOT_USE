package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.3LU  reason: invalid class name */
public abstract class AnonymousClass3LU extends Binder implements IInterface {
    public AnonymousClass3LU() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
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
        AnonymousClass3ZA r2 = (AnonymousClass3ZA) this;
        switch (i2) {
            case 1:
                ((C66393Ze) r2).A00.setResult((Status) AnonymousClass3K2.A0N(parcel, Status.CREATOR));
                return true;
            case 2:
            case 4:
                creator = Status.CREATOR;
                break;
            case 3:
            case 5:
                AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                parcel.readLong();
                break;
            case 6:
                AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                parcel.createTypedArray(AnonymousClass3Y3.CREATOR);
                break;
            case 7:
                creator = DataHolder.CREATOR;
                break;
            case 8:
            case 9:
                AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                creator = C66043Xo.CREATOR;
                break;
            default:
                return false;
        }
        AnonymousClass3K2.A0N(parcel, creator);
        throw C13680ns.A0m();
    }
}
