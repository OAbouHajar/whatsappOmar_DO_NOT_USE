package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.0Uy  reason: invalid class name and case insensitive filesystem */
public class C06240Uy {
    public int A00 = 0;
    public ServiceConnection A01;
    public IGetInstallReferrerService A02;
    public final Context A03;

    public C06240Uy(Context context) {
        this.A03 = context.getApplicationContext();
    }

    public AnonymousClass0QB A01() {
        if (A03()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.A03.getPackageName());
            try {
                return new AnonymousClass0QB(this.A02.A5m(bundle));
            } catch (RemoteException e2) {
                C05780Sz.A01("RemoteException getting install referrer information");
                this.A00 = 0;
                throw e2;
            }
        } else {
            throw AnonymousClass000.A0V("Service not connected. Please start a connection before using the service.");
        }
    }

    public void A02() {
        this.A00 = 3;
        if (this.A01 != null) {
            C05780Sz.A00("Unbinding from service.");
            this.A03.unbindService(this.A01);
            this.A01 = null;
        }
        this.A02 = null;
    }

    public boolean A03() {
        return (this.A00 != 2 || this.A02 == null || this.A01 == null) ? false : true;
    }
}
