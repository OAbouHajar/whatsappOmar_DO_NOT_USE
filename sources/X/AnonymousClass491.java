package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.491  reason: invalid class name */
public final class AnonymousClass491 {
    public static C109875Tz A00;

    public static AnonymousClass4C4 A00(Bitmap bitmap) {
        C13710nw.A02(bitmap, "image must not be null");
        try {
            C109875Tz r2 = A00;
            C13710nw.A02(r2, "IBitmapDescriptorFactory is not initialized");
            C31361e1 r22 = (C31361e1) r2;
            Parcel A01 = r22.A01();
            C90334dy.A01(A01, bitmap);
            Parcel A02 = r22.A02(6, A01);
            IObjectWrapper A002 = C31371e2.A00(A02.readStrongBinder());
            A02.recycle();
            return new AnonymousClass4C4(A002);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }
}
