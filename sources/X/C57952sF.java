package X;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: X.2sF  reason: invalid class name and case insensitive filesystem */
public final class C57952sF extends C89334bz {
    public final C438121p A00;

    public C57952sF(C438121p r1, int i2) {
        super(i2);
        this.A00 = r1;
    }

    public final void A01(Status status) {
        try {
            this.A00.A02(status);
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    public final void A02(C612338c r4, boolean z2) {
        C438121p r2 = this.A00;
        r4.A00.put(r2, Boolean.valueOf(z2));
        r2.addStatusListener(new C97884qk(r2, r4));
    }

    public final void A03(C15730rl r3) {
        try {
            this.A00.A01(r3.A04);
        } catch (RuntimeException e2) {
            A04(e2);
        }
    }

    public final void A04(Exception exc) {
        String A0c = AnonymousClass000.A0c(exc);
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder A0g = C13690nt.A0g(A0c.length() + 2 + C13680ns.A06(localizedMessage));
        A0g.append(A0c);
        A0g.append(": ");
        try {
            this.A00.A02(new Status(10, AnonymousClass000.A0h(localizedMessage, A0g)));
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }
}
