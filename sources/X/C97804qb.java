package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.4qb  reason: invalid class name and case insensitive filesystem */
public final class C97804qb implements C108385Nt {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ String A01;

    public C97804qb(String str, Bundle bundle) {
        this.A01 = str;
        this.A00 = bundle;
    }

    public final /* synthetic */ Object Aj7(IBinder iBinder) {
        Object r4;
        if (iBinder == null) {
            r4 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            r4 = queryLocalInterface instanceof C109825Tu ? (C109825Tu) queryLocalInterface : new AnonymousClass3Yf(iBinder);
        }
        String str = this.A01;
        Bundle bundle = this.A00;
        C92124h3 r42 = (C92124h3) r4;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r42.A01);
        obtain.writeString(str);
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        Parcel A002 = r42.A00(2, obtain);
        Bundle bundle2 = (Bundle) AnonymousClass3K2.A0N(A002, Bundle.CREATOR);
        A002.recycle();
        C62103Bq.A05(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new AnonymousClass2RH(string);
    }
}
