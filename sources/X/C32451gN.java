package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1gN  reason: invalid class name and case insensitive filesystem */
public final class C32451gN {
    public final AnonymousClass5U1 A00;

    public C32451gN(AnonymousClass5U1 r1) {
        C13710nw.A01(r1);
        this.A00 = r1;
    }

    public LatLng A00() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A02 = r2.A02(4, r2.A01());
            LatLng latLng = (LatLng) (A02.readInt() == 0 ? null : (Parcelable) LatLng.CREATOR.createFromParcel(A02));
            A02.recycle();
            return latLng;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public Object A01() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A02 = r2.A02(30, r2.A01());
            IObjectWrapper A002 = C31371e2.A00(A02.readStrongBinder());
            A02.recycle();
            return C58032sR.A01(A002);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public String A02() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A02 = r2.A02(2, r2.A01());
            String readString = A02.readString();
            A02.recycle();
            return readString;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public void A03() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            r2.A03(12, r2.A01());
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public void A04() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            r2.A03(11, r2.A01());
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public void A05(AnonymousClass4C4 r4) {
        Parcel parcel;
        C31361e1 r1;
        if (r4 == null) {
            r1 = (C31361e1) this.A00;
            parcel = r1.A01();
            parcel.writeStrongBinder((IBinder) null);
        } else {
            try {
                IObjectWrapper iObjectWrapper = r4.A00;
                r1 = (C31361e1) this.A00;
                parcel = r1.A01();
                C90334dy.A00(iObjectWrapper, parcel);
            } catch (RemoteException e2) {
                throw new C105555Ab(e2);
            }
        }
        r1.A03(18, parcel);
    }

    public void A06(LatLng latLng) {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A01 = r2.A01();
            C90334dy.A01(A01, latLng);
            r2.A03(3, A01);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public void A07(Object obj) {
        try {
            AnonymousClass5U1 r2 = this.A00;
            C58032sR r0 = new C58032sR(obj);
            C31361e1 r22 = (C31361e1) r2;
            Parcel A01 = r22.A01();
            C90334dy.A00(r0, A01);
            r22.A03(29, A01);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public void A08(String str) {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A01 = r2.A01();
            A01.writeString(str);
            r2.A03(5, A01);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public void A09(boolean z2) {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A01 = r2.A01();
            A01.writeInt(z2 ? 1 : 0);
            r2.A03(14, A01);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public boolean A0A() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A02 = r2.A02(15, r2.A01());
            boolean z2 = false;
            if (A02.readInt() != 0) {
                z2 = true;
            }
            A02.recycle();
            return z2;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C32451gN)) {
            return false;
        }
        try {
            AnonymousClass5U1 r2 = this.A00;
            AnonymousClass5U1 r0 = ((C32451gN) obj).A00;
            C31361e1 r22 = (C31361e1) r2;
            Parcel A01 = r22.A01();
            C90334dy.A00(r0, A01);
            Parcel A02 = r22.A02(16, A01);
            boolean z2 = false;
            if (A02.readInt() != 0) {
                z2 = true;
            }
            A02.recycle();
            return z2;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public int hashCode() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A02 = r2.A02(17, r2.A01());
            int readInt = A02.readInt();
            A02.recycle();
            return readInt;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }
}
