package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3LS  reason: invalid class name */
public abstract class AnonymousClass3LS extends Binder implements IInterface {
    public AnonymousClass3LS() {
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            AnonymousClass3K4.A0l(this, parcel);
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        AnonymousClass3YZ r1 = (AnonymousClass3YZ) this;
        if (i2 != 1) {
            return false;
        }
        AnonymousClass459.A00((Status) AnonymousClass3K2.A0N(parcel, Status.CREATOR), r1.A00.A00, (Object) null);
        return true;
    }
}
