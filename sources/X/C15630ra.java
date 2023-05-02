package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0ra  reason: invalid class name and case insensitive filesystem */
public abstract class C15630ra extends Binder implements IInterface {
    public C15630ra() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        Parcelable.Creator creator;
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        C15620rZ r2 = (C15620rZ) this;
        switch (i2) {
            case 3:
                Parcelable.Creator creator2 = C15700rh.CREATOR;
                if (parcel.readInt() != 0) {
                    creator2.createFromParcel(parcel);
                }
                creator = AnonymousClass3YB.CREATOR;
                break;
            case 4:
            case 6:
                creator = Status.CREATOR;
                break;
            case 7:
                Parcelable.Creator creator3 = Status.CREATOR;
                if (parcel.readInt() != 0) {
                    creator3.createFromParcel(parcel);
                }
                creator = GoogleSignInAccount.CREATOR;
                break;
            case 8:
                r2.AiS((AnonymousClass3XU) (parcel.readInt() == 0 ? null : (Parcelable) AnonymousClass3XU.CREATOR.createFromParcel(parcel)));
                break;
            case 9:
                creator = AnonymousClass3YA.CREATOR;
                break;
            default:
                return false;
        }
        if (parcel.readInt() != 0) {
            creator.createFromParcel(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
