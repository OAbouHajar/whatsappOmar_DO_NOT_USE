package X;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.53R  reason: invalid class name */
public final class AnonymousClass53R implements AnonymousClass5SD {
    public final /* synthetic */ AnonymousClass22A A00;
    public final /* synthetic */ C109015Qj A01;
    public final /* synthetic */ WeakReference A02;

    public AnonymousClass53R(AnonymousClass22A r1, C109015Qj r2, WeakReference weakReference) {
        this.A01 = r2;
        this.A02 = weakReference;
        this.A00 = r1;
    }

    public void AWK(C29661az r5) {
        C18450wi.A0H(r5, 0);
        Context context = (Context) this.A02.get();
        if (context != null) {
            C29701b3.A02(context, r5, C14950q3.A01, this.A00, AnonymousClass1Z8.A00);
            this.A01.AOs(C79253zY.A00);
            return;
        }
        this.A01.AOs(C79243zX.A00);
    }

    public void AWO(AnonymousClass2WZ r3) {
        C18450wi.A0H(r3, 0);
        if (r3.A00 == 5) {
            Log.e("AsyncActionLauncher", "should launch as an async action");
        }
        this.A01.AOs(new C79233zW(r3));
    }
}
