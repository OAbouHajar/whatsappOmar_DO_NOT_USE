package X;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.3LZ  reason: invalid class name */
public abstract class AnonymousClass3LZ extends Binder implements IInterface {
    public AnonymousClass3LZ(String str) {
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
        if (this instanceof C66563a7) {
            C66563a7 r5 = (C66563a7) this;
            if (i2 != 1) {
                return i2 == 2;
            }
            ((BasePendingResult) r5.A00).setResult(((AnonymousClass3Y9) AnonymousClass3K2.A0N(parcel, AnonymousClass3Y9.CREATOR)).A00);
            return true;
        }
        C66573a8 r52 = (C66573a8) this;
        if (i2 != 1) {
            return false;
        }
        Location location = (Location) AnonymousClass3K2.A0N(parcel, Location.CREATOR);
        synchronized (r52) {
            C84114Jh r4 = r52.A00;
            r4.A00.execute(new RunnableRunnableShape12S0200000_I1(r4, 15, new C97914qn(location)));
        }
        return true;
    }
}
