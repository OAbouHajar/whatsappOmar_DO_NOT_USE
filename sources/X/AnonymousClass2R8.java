package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.2R8  reason: invalid class name */
public final class AnonymousClass2R8 {
    public static ICameraUpdateFactoryDelegate A00;

    public static AnonymousClass2R9 A00(CameraPosition cameraPosition) {
        C13710nw.A02(cameraPosition, "cameraPosition must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C13710nw.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C31361e1 r2 = (C31361e1) iCameraUpdateFactoryDelegate;
            Parcel A01 = r2.A01();
            C90334dy.A01(A01, cameraPosition);
            Parcel A02 = r2.A02(7, A01);
            IObjectWrapper A002 = C31371e2.A00(A02.readStrongBinder());
            A02.recycle();
            return new AnonymousClass2R9(A002);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public static AnonymousClass2R9 A01(LatLng latLng) {
        C13710nw.A02(latLng, "latLng must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C13710nw.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C31361e1 r2 = (C31361e1) iCameraUpdateFactoryDelegate;
            Parcel A01 = r2.A01();
            C90334dy.A01(A01, latLng);
            Parcel A02 = r2.A02(8, A01);
            IObjectWrapper A002 = C31371e2.A00(A02.readStrongBinder());
            A02.recycle();
            return new AnonymousClass2R9(A002);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public static AnonymousClass2R9 A02(LatLng latLng, float f2) {
        C13710nw.A02(latLng, "latLng must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C13710nw.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C31361e1 r2 = (C31361e1) iCameraUpdateFactoryDelegate;
            Parcel A01 = r2.A01();
            C90334dy.A01(A01, latLng);
            A01.writeFloat(f2);
            Parcel A02 = r2.A02(9, A01);
            IObjectWrapper A002 = C31371e2.A00(A02.readStrongBinder());
            A02.recycle();
            return new AnonymousClass2R9(A002);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public static AnonymousClass2R9 A03(LatLngBounds latLngBounds, int i2) {
        C13710nw.A02(latLngBounds, "bounds must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C13710nw.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C31361e1 r2 = (C31361e1) iCameraUpdateFactoryDelegate;
            Parcel A01 = r2.A01();
            C90334dy.A01(A01, latLngBounds);
            A01.writeInt(i2);
            Parcel A02 = r2.A02(10, A01);
            IObjectWrapper A002 = C31371e2.A00(A02.readStrongBinder());
            A02.recycle();
            return new AnonymousClass2R9(A002);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }
}
