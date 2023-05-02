package X;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0gO  reason: invalid class name and case insensitive filesystem */
public class C09980gO implements Runnable {
    public final /* synthetic */ C10630hR A00;
    public final /* synthetic */ String A01;

    public C09980gO(C10630hR r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void run() {
        try {
            C10630hR r5 = this.A00;
            AnonymousClass02Q r4 = (AnonymousClass02Q) r5.A0F.get();
            if (r4 == null) {
                C06530Wm.A00();
                String str = C10630hR.A0I;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(r5.A08.A0G);
                Log.e(str, AnonymousClass000.A0h(" returned a null result. Treating it as a failure.", A0o));
            } else {
                C06530Wm A002 = C06530Wm.A00();
                String str2 = C10630hR.A0I;
                StringBuilder A0o2 = AnonymousClass000.A0o();
                A0o2.append(r5.A08.A0G);
                A0o2.append(" returned a ");
                A0o2.append(r4);
                A002.A02(str2, AnonymousClass000.A0h(".", A0o2));
                r5.A02 = r4;
            }
        } catch (CancellationException e2) {
            C06530Wm.A00();
            String str3 = C10630hR.A0I;
            StringBuilder A0o3 = AnonymousClass000.A0o();
            A0o3.append(this.A01);
            Log.i(str3, AnonymousClass000.A0h(" was cancelled", A0o3), e2);
        } catch (InterruptedException | ExecutionException e3) {
            C06530Wm.A00();
            String str4 = C10630hR.A0I;
            StringBuilder A0o4 = AnonymousClass000.A0o();
            A0o4.append(this.A01);
            Log.e(str4, AnonymousClass000.A0h(" failed because it threw an exception/error", A0o4), e3);
        } catch (Throwable th) {
            this.A00.A03();
            throw th;
        }
        this.A00.A03();
    }
}
