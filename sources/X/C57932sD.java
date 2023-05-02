package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.2sD  reason: invalid class name and case insensitive filesystem */
public final class C57932sD extends C65743Wk {
    public final C86314Sd A00;
    public final C14370p3 A01;

    public C57932sD(C86314Sd r2, C14370p3 r3) {
        super(4);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void A01(Status status) {
        this.A01.A00(new AnonymousClass43Z(status));
    }

    public final /* bridge */ /* synthetic */ void A02(C612338c r1, boolean z2) {
    }

    public final void A03(C15730rl r5) {
        try {
            r5.A09.remove(this.A00);
            C14370p3 r0 = this.A01;
            Boolean bool = Boolean.FALSE;
            C14210on r2 = r0.A00;
            synchronized (r2.A04) {
                if (!r2.A02) {
                    r2.A02 = true;
                    r2.A01 = bool;
                    r2.A03.A01(r2);
                }
            }
        } catch (DeadObjectException e2) {
            A01(C89334bz.A00(e2));
            throw e2;
        } catch (RemoteException e3) {
            A01(C89334bz.A00(e3));
        } catch (RuntimeException e4) {
            this.A01.A00(e4);
        }
    }

    public final void A04(Exception exc) {
        this.A01.A00(exc);
    }

    public final boolean A05(C15730rl r3) {
        r3.A09.get(this.A00);
        return false;
    }

    public final AnonymousClass3Y2[] A06(C15730rl r3) {
        r3.A09.get(this.A00);
        return null;
    }
}
