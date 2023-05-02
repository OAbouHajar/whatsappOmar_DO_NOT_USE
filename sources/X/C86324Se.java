package X;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: X.4Se  reason: invalid class name and case insensitive filesystem */
public final class C86324Se {
    public final AnonymousClass5U0 A00;

    public C86324Se(AnonymousClass5U0 r1) {
        C13710nw.A01(r1);
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C86324Se)) {
            return false;
        }
        try {
            AnonymousClass5U0 r2 = this.A00;
            AnonymousClass5U0 r0 = ((C86324Se) obj).A00;
            C31361e1 r22 = (C31361e1) r2;
            Parcel A01 = r22.A01();
            C90334dy.A00(r0, A01);
            Parcel A02 = r22.A02(17, A01);
            boolean A1O = AnonymousClass000.A1O(A02.readInt());
            A02.recycle();
            return A1O;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }

    public final int hashCode() {
        try {
            C31361e1 r2 = (C31361e1) this.A00;
            Parcel A02 = r2.A02(18, r2.A01());
            int readInt = A02.readInt();
            A02.recycle();
            return readInt;
        } catch (RemoteException e2) {
            throw new C105555Ab(e2);
        }
    }
}
