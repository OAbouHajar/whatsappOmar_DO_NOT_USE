package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;

/* renamed from: X.4Px  reason: invalid class name and case insensitive filesystem */
public final class C85774Px {
    public final IUiSettingsDelegate A00;

    public C85774Px(IUiSettingsDelegate iUiSettingsDelegate) {
        this.A00 = iUiSettingsDelegate;
    }

    public void A00() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A01 = r2.A01();
            A01.writeInt(0);
            r2.A03(3, A01);
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }
}
