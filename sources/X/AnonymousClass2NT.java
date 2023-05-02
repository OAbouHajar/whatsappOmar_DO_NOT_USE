package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: X.2NT  reason: invalid class name */
public class AnonymousClass2NT {
    public C85774Px A00;
    public final IGoogleMapDelegate A01;

    public AnonymousClass2NT(IGoogleMapDelegate iGoogleMapDelegate) {
        C13710nw.A01(iGoogleMapDelegate);
        this.A01 = iGoogleMapDelegate;
    }

    public final AnonymousClass39T A00() {
        IProjectionDelegate iProjectionDelegate;
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A02 = r2.A02(26, r2.A01());
            IBinder readStrongBinder = A02.readStrongBinder();
            if (readStrongBinder == null) {
                iProjectionDelegate = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                iProjectionDelegate = queryLocalInterface instanceof IProjectionDelegate ? (IProjectionDelegate) queryLocalInterface : new C66633aF(readStrongBinder);
            }
            A02.recycle();
            return new AnonymousClass39T(iProjectionDelegate);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final C85774Px A01() {
        IUiSettingsDelegate iUiSettingsDelegate;
        try {
            C85774Px r0 = this.A00;
            if (r0 != null) {
                return r0;
            }
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A02 = r2.A02(25, r2.A01());
            IBinder readStrongBinder = A02.readStrongBinder();
            if (readStrongBinder == null) {
                iUiSettingsDelegate = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                iUiSettingsDelegate = queryLocalInterface instanceof IUiSettingsDelegate ? (IUiSettingsDelegate) queryLocalInterface : new C66643aG(readStrongBinder);
            }
            A02.recycle();
            C85774Px r02 = new C85774Px(iUiSettingsDelegate);
            this.A00 = r02;
            return r02;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final CameraPosition A02() {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A02 = r2.A02(1, r2.A01());
            CameraPosition cameraPosition = (CameraPosition) (A02.readInt() == 0 ? null : (Parcelable) CameraPosition.CREATOR.createFromParcel(A02));
            A02.recycle();
            return cameraPosition;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final C32451gN A03(C58012sL r4) {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A012 = r2.A01();
            C90334dy.A01(A012, r4);
            Parcel A02 = r2.A02(11, A012);
            AnonymousClass5U1 A002 = C66763aS.A00(A02.readStrongBinder());
            A02.recycle();
            if (A002 != null) {
                return new C32451gN(A002);
            }
            return null;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public void A04() {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            r2.A03(94, r2.A01());
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public void A05() {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A012 = r2.A01();
            A012.writeFloat(16.0f);
            r2.A03(93, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A06() {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            r2.A03(14, r2.A01());
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A07(int i2) {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A012 = r2.A01();
            A012.writeInt(i2);
            r2.A03(16, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A08(int i2, int i3, int i4, int i5) {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A012 = r2.A01();
            A012.writeInt(i2);
            A012.writeInt(i3);
            A012.writeInt(i4);
            A012.writeInt(i5);
            r2.A03(39, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A09(AnonymousClass2R9 r4) {
        try {
            C13710nw.A02(r4, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r4.A00;
            C31361e1 r2 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r2.A01();
            C90334dy.A00(iObjectWrapper, A012);
            r2.A03(5, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0A(AnonymousClass2R9 r4) {
        try {
            C13710nw.A02(r4, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r4.A00;
            C31361e1 r2 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r2.A01();
            C90334dy.A00(iObjectWrapper, A012);
            r2.A03(4, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0B(AnonymousClass2R9 r5, AnonymousClass5RJ r6) {
        try {
            C13710nw.A02(r5, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r5.A00;
            C66673aJ r0 = r6 == null ? null : new C66673aJ(r6);
            C31361e1 r3 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r3.A01();
            C90334dy.A00(iObjectWrapper, A012);
            C90334dy.A00(r0, A012);
            r3.A03(6, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0C(AnonymousClass2R9 r6, AnonymousClass5RJ r7) {
        try {
            C13710nw.A02(r6, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = r6.A00;
            C66673aJ r2 = r7 == null ? null : new C66673aJ(r7);
            C31361e1 r4 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r4.A01();
            C90334dy.A00(iObjectWrapper, A012);
            A012.writeInt(400);
            C90334dy.A00(r2, A012);
            r4.A03(7, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0D(AnonymousClass5O9 r4) {
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            C66703aM r0 = new C66703aM(r4);
            C31361e1 r2 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r2.A01();
            C90334dy.A00(r0, A012);
            r2.A03(33, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0E(AnonymousClass5OA r4) {
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            C66743aQ r0 = new C66743aQ(r4);
            C31361e1 r2 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r2.A01();
            C90334dy.A00(r0, A012);
            r2.A03(99, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0F(AnonymousClass5OB r4) {
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            C66723aO r0 = new C66723aO(r4);
            C31361e1 r2 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r2.A01();
            C90334dy.A00(r0, A012);
            r2.A03(96, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0G(AnonymousClass5OC r4) {
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            C66693aL r0 = new C66693aL(r4);
            C31361e1 r2 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r2.A01();
            C90334dy.A00(r0, A012);
            r2.A03(32, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0H(AnonymousClass5OD r4) {
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            C66753aR r0 = new C66753aR(r4);
            C31361e1 r2 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r2.A01();
            C90334dy.A00(r0, A012);
            r2.A03(28, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0I(AnonymousClass5OE r4) {
        try {
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            C66663aI r0 = new C66663aI(r4);
            C31361e1 r2 = (C31361e1) iGoogleMapDelegate;
            Parcel A012 = r2.A01();
            C90334dy.A00(r0, A012);
            r2.A03(30, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public void A0J(C58002sK r4) {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A012 = r2.A01();
            C90334dy.A01(A012, r4);
            Parcel A02 = r2.A02(91, A012);
            A02.readInt();
            A02.recycle();
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0K(boolean z2) {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A012 = r2.A01();
            A012.writeInt(z2 ? 1 : 0);
            Parcel A02 = r2.A02(20, A012);
            A02.readInt();
            A02.recycle();
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0L(boolean z2) {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A012 = r2.A01();
            A012.writeInt(z2 ? 1 : 0);
            r2.A03(22, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final void A0M(boolean z2) {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A012 = r2.A01();
            A012.writeInt(z2 ? 1 : 0);
            r2.A03(18, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final boolean A0N() {
        try {
            C31361e1 r2 = (C31361e1) this.A01;
            Parcel A02 = r2.A02(17, r2.A01());
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
}
