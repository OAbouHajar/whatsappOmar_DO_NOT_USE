package X;

import com.whatsapp.util.Log;
import java.io.Closeable;

/* renamed from: X.54M  reason: invalid class name */
public class AnonymousClass54M implements Closeable {
    public boolean A00;
    public final AnonymousClass1NJ A01;

    public AnonymousClass54M(AnonymousClass1NJ r1) {
        this.A01 = r1;
    }

    public AnonymousClass1NJ A00() {
        return this.A01;
    }

    public void close() {
        boolean z2;
        int i2;
        AnonymousClass3CG r1;
        synchronized (this) {
            z2 = true;
            if (!this.A00) {
                this.A00 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            AnonymousClass1NJ r4 = this.A01;
            String A0h = AnonymousClass000.A0h("GoogleMigrateClient", AnonymousClass000.A0r("svc-client/onSessionClosed; service="));
            if (A00() == r4) {
                synchronized (r4) {
                    int i3 = r4.A00;
                    if (i3 <= 0) {
                        Log.e(C13680ns.A0i(", imbalanced ref_cnt=", AnonymousClass000.A0q(A0h), i3));
                        C16300so r3 = r4.A05;
                        StringBuilder A0o = AnonymousClass000.A0o();
                        A0o.append("name=");
                        A0o.append("GoogleMigrateClient");
                        A0o.append(", counter=");
                        r3.AcB("svc-client-reference-counter-imbalance", AnonymousClass000.A0l(A0o, r4.A00), false);
                        r4.A00 = 0;
                        i2 = 0;
                    } else {
                        i2 = i3 - 1;
                        r4.A00 = i2;
                    }
                    r1 = null;
                    if (i2 == 0) {
                        AnonymousClass3CG r0 = r4.A01;
                        r4.A01 = null;
                        r1 = r0;
                    }
                }
                if (r1 != null) {
                    r1.A01(false);
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0T(AnonymousClass000.A0h("GoogleMigrateClient", AnonymousClass000.A0r("A session from a different client has been provided. Client: ")));
        }
    }
}
