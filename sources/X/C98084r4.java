package X;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.4r4  reason: invalid class name and case insensitive filesystem */
public final class C98084r4 implements C107835Lp {
    public View A00;
    public final ViewGroup A01;
    public final IMapViewDelegate A02;

    public C98084r4(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
        this.A02 = iMapViewDelegate;
        C13710nw.A01(viewGroup);
        this.A01 = viewGroup;
    }

    public final void A00(AnonymousClass5OF r4) {
        try {
            IMapViewDelegate iMapViewDelegate = this.A02;
            C66683aK r0 = new C66683aK(r4);
            C31361e1 r2 = (C31361e1) iMapViewDelegate;
            Parcel A012 = r2.A01();
            C90334dy.A00(r0, A012);
            r2.A03(9, A012);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }
}
