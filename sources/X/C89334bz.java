package X;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.4bz  reason: invalid class name and case insensitive filesystem */
public abstract class C89334bz {
    public final int A00;

    public C89334bz(int i2) {
        this.A00 = i2;
    }

    public static /* bridge */ /* synthetic */ Status A00(RemoteException remoteException) {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A13(A0o, AnonymousClass000.A0c(remoteException));
        return new Status(19, AnonymousClass000.A0h(remoteException.getLocalizedMessage(), A0o));
    }

    public abstract void A01(Status status);

    public abstract void A02(C612338c r1, boolean z2);

    public abstract void A03(C15730rl r1);

    public abstract void A04(Exception exc);
}
