package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;

/* renamed from: X.21w  reason: invalid class name and case insensitive filesystem */
public final class C438721w {
    public static boolean A00;

    public static synchronized int A00(Context context) {
        ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate;
        C109875Tz r1;
        synchronized (C438721w.class) {
            C13710nw.A02(context, "Context is null");
            if (!A00) {
                try {
                    try {
                        C66653aH r4 = (C66653aH) C87874Yz.A01(context);
                        Parcel A02 = r4.A02(4, r4.A01());
                        IBinder readStrongBinder = A02.readStrongBinder();
                        if (readStrongBinder == null) {
                            iCameraUpdateFactoryDelegate = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                            iCameraUpdateFactoryDelegate = queryLocalInterface instanceof ICameraUpdateFactoryDelegate ? (ICameraUpdateFactoryDelegate) queryLocalInterface : new C66603aC(readStrongBinder);
                        }
                        A02.recycle();
                        C13710nw.A01(iCameraUpdateFactoryDelegate);
                        AnonymousClass2R8.A00 = iCameraUpdateFactoryDelegate;
                        Parcel A022 = r4.A02(5, r4.A01());
                        IBinder readStrongBinder2 = A022.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            r1 = null;
                        } else {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                            r1 = queryLocalInterface2 instanceof C109875Tz ? (C109875Tz) queryLocalInterface2 : new AnonymousClass3a9(readStrongBinder2);
                        }
                        A022.recycle();
                        if (AnonymousClass491.A00 == null) {
                            C13710nw.A02(r1, "delegate must not be null");
                            AnonymousClass491.A00 = r1;
                        }
                        A00 = true;
                    } catch (RemoteException e2) {
                        throw new C105555Ab(e2);
                    }
                } catch (C47092Hl e3) {
                    return e3.errorCode;
                }
            }
        }
        return 0;
    }
}
