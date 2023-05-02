package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3LV  reason: invalid class name */
public abstract class AnonymousClass3LV extends Binder implements IInterface {
    public AnonymousClass3LV() {
        attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        Parcelable.Creator creator;
        if (i2 <= 16777215) {
            AnonymousClass3K4.A0l(this, parcel);
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        C66813aX r1 = (C66813aX) this;
        if (i2 == 1) {
            Status status = (Status) AnonymousClass3K2.A0N(parcel, Status.CREATOR);
            C65873Wx r2 = (C65873Wx) AnonymousClass3K2.A0N(parcel, C65873Wx.CREATOR);
            if (r1 instanceof C66783aU) {
                ((C66783aU) r1).A00.setResult(new C98704sq(status, r2));
                return true;
            }
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 6) {
                        AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                        creator = C65883Wy.CREATOR;
                    } else if (i2 == 8) {
                        Status status2 = (Status) AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                        C65913Xb r22 = (C65913Xb) AnonymousClass3K2.A0N(parcel, C65913Xb.CREATOR);
                        if (r1 instanceof C66793aV) {
                            ((C66793aV) r1).A00.setResult(new C98714sr(status2, r22));
                            return true;
                        }
                    } else if (i2 != 10) {
                        if (i2 == 11) {
                            creator = Status.CREATOR;
                        } else if (i2 == 15) {
                            AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                            creator = AnonymousClass3X6.CREATOR;
                        } else if (i2 != 16) {
                            return false;
                        } else {
                            AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                            parcel.readString();
                            parcel.readInt();
                        }
                    }
                }
                AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                parcel.readInt();
            } else {
                AnonymousClass3K2.A0N(parcel, Status.CREATOR);
                creator = C66143Xy.CREATOR;
            }
            AnonymousClass3K2.A0N(parcel, creator);
        } else {
            parcel.readString();
        }
        throw C13680ns.A0m();
    }
}
