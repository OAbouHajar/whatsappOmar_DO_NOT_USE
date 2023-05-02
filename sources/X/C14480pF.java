package X;

import android.os.Bundle;
import android.util.Log;

/* renamed from: X.0pF  reason: invalid class name and case insensitive filesystem */
public abstract class C14480pF {
    public final int A00;
    public final int A01;
    public final Bundle A02;
    public final C14370p3 A03 = new C14370p3();

    public C14480pF(Bundle bundle, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = bundle;
    }

    public void A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        A02(bundle2);
    }

    public final void A01(C14520pJ r7) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(r7);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.A03.A00.A07(r7);
    }

    public final void A02(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.A03.A01(obj);
    }

    public boolean A03() {
        return false;
    }

    public String toString() {
        int i2 = this.A01;
        int i3 = this.A00;
        boolean A032 = A03();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i2);
        sb.append(" id=");
        sb.append(i3);
        sb.append(" oneWay=");
        sb.append(A032);
        sb.append("}");
        return sb.toString();
    }
}
