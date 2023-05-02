package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.4h7  reason: invalid class name and case insensitive filesystem */
public final class C92164h7 implements IInterface, C109795Tr {
    public final IBinder A00;

    public C92164h7(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final Parcel A00(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass3K2.A0w(this.A00, parcel, parcel, i2);
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
