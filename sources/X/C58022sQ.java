package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.2sQ  reason: invalid class name and case insensitive filesystem */
public final class C58022sQ extends AnonymousClass3YN {
    public final IBinder A00;
    public final /* synthetic */ C15770rp A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58022sQ(Bundle bundle, IBinder iBinder, C15770rp r3, int i2) {
        super(bundle, r3, i2);
        this.A01 = r3;
        this.A00 = iBinder;
    }

    public final void A01(C15700rh r4) {
        C15770rp r2 = this.A01;
        C107795Ll r0 = r2.A0K;
        if (r0 != null) {
            ((C98004qw) r0).A00.onConnectionFailed(r4);
        }
        r2.A01 = r4.A01;
        r2.A05 = System.currentTimeMillis();
    }

    public final boolean A02() {
        try {
            IBinder iBinder = this.A00;
            C13710nw.A01(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            C15770rp r3 = this.A01;
            String A0A = r3.A0A();
            if (!A0A.equals(interfaceDescriptor)) {
                StringBuilder A0g = C13690nt.A0g(C13680ns.A06(A0A) + 34 + C13680ns.A06(interfaceDescriptor));
                A0g.append("service descriptor mismatch: ");
                A0g.append(A0A);
                A0g.append(" vs. ");
                Log.w("GmsClient", AnonymousClass000.A0h(interfaceDescriptor, A0g));
            } else {
                IInterface A09 = r3.A09(iBinder);
                if (A09 != null && (C15770rp.A00(A09, r3, 2, 4) || C15770rp.A00(A09, r3, 3, 4))) {
                    r3.A07 = null;
                    C107785Lk r0 = r3.A0J;
                    if (r0 == null) {
                        return true;
                    }
                    ((C97994qv) r0).A00.onConnected((Bundle) null);
                    return true;
                }
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
