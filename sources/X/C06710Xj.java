package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.0Xj  reason: invalid class name and case insensitive filesystem */
public final class C06710Xj implements ServiceConnection {
    public final C12680kn A00;
    public final /* synthetic */ C06240Uy A01;

    public C06710Xj(C06240Uy r1, C12680kn r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static IGetInstallReferrerService A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) queryLocalInterface : new C92144h5(iBinder);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C05780Sz.A00("Install Referrer service connected.");
        C06240Uy r1 = this.A01;
        r1.A02 = A00(iBinder);
        r1.A00 = 2;
        this.A00.ASH(0);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C05780Sz.A01("Install Referrer service disconnected.");
        C06240Uy r1 = this.A01;
        r1.A02 = null;
        r1.A00 = 0;
    }
}
