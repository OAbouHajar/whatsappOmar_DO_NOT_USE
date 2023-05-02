package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.4h2  reason: invalid class name and case insensitive filesystem */
public class C92114h2 implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C92114h2(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final Parcel A00(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass3K2.A0w(this.A00, parcel, parcel, 1);
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
