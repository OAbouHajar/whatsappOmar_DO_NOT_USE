package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.4h1  reason: invalid class name and case insensitive filesystem */
public class C92104h1 implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C92104h1(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
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

    public final IBinder asBinder() {
        return this.A00;
    }
}
