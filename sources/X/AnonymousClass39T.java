package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.39T  reason: invalid class name */
public final class AnonymousClass39T {
    public final IProjectionDelegate A00;

    public AnonymousClass39T(IProjectionDelegate iProjectionDelegate) {
        this.A00 = iProjectionDelegate;
    }

    public Point A00(LatLng latLng) {
        C13710nw.A01(latLng);
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A01 = r2.A01();
            C90334dy.A01(A01, latLng);
            return (Point) C58032sR.A01(C31361e1.A00(A01, r2, 2));
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public LatLng A01(Point point) {
        try {
            IProjectionDelegate iProjectionDelegate = this.A00;
            C58032sR r0 = new C58032sR(point);
            C31361e1 r2 = (C31361e1) iProjectionDelegate;
            Parcel A01 = r2.A01();
            C90334dy.A00(r0, A01);
            Parcel A02 = r2.A02(1, A01);
            LatLng latLng = (LatLng) (A02.readInt() == 0 ? null : (Parcelable) LatLng.CREATOR.createFromParcel(A02));
            A02.recycle();
            return latLng;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public C66063Xq A02() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A02 = r2.A02(3, r2.A01());
            C66063Xq r0 = (C66063Xq) (A02.readInt() == 0 ? null : (Parcelable) C66063Xq.CREATOR.createFromParcel(A02));
            A02.recycle();
            return r0;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }
}
