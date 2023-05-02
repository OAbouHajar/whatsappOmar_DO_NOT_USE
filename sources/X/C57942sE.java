package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.2sE  reason: invalid class name and case insensitive filesystem */
public final class C57942sE extends C65743Wk {
    public final C107775Lj A00;
    public final C55202j2 A01;
    public final C14370p3 A02;

    public C57942sE(C107775Lj r2, C55202j2 r3, C14370p3 r4, int i2) {
        super(i2);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        if (i2 == 2 && r3.A01) {
            throw AnonymousClass000.A0T("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void A01(Status status) {
        this.A02.A00(status.A02 != null ? new AnonymousClass3WR(status) : new AnonymousClass43Z(status));
    }

    public final void A02(C612338c r6, boolean z2) {
        C14370p3 r2 = this.A02;
        r6.A01.put(r2, Boolean.valueOf(z2));
        C14210on r4 = r2.A00;
        r4.A03.A00(new C98874t7(new C98774sx(r6, r2), C14500pH.A00));
        r4.A04();
    }

    public final void A03(C15730rl r4) {
        try {
            this.A01.A00(r4.A04, this.A02);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            A01(C89334bz.A00(e3));
        } catch (RuntimeException e4) {
            this.A02.A00(e4);
        }
    }

    public final void A04(Exception exc) {
        this.A02.A00(exc);
    }

    public final boolean A05(C15730rl r2) {
        return this.A01.A01;
    }

    public final AnonymousClass3Y2[] A06(C15730rl r2) {
        return this.A01.A02;
    }
}
