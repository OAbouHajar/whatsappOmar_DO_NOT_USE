package X;

import android.app.Activity;
import android.content.Context;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5uC  reason: invalid class name and case insensitive filesystem */
public class C118135uC {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass60O A01;
    public final /* synthetic */ AnonymousClass5Q2 A02;

    public C118135uC(Activity activity, AnonymousClass60O r2, AnonymousClass5Q2 r3) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = r3;
    }

    public void A00(AnonymousClass2HJ r7, boolean z2) {
        String A0d;
        StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaUpiBlockListManager/on-error blocked: ");
        A0r.append(z2);
        Log.e(AnonymousClass000.A0e(r7, " error: ", A0r));
        AnonymousClass60O r2 = this.A01;
        C14870pt r5 = r2.A02;
        Activity activity = this.A00;
        r5.A0C((C14600pS) activity);
        if (!activity.isFinishing()) {
            Context context = r2.A05.A00;
            if (z2) {
                A0d = context.getString(R.string.str023c);
            } else {
                A0d = C13680ns.A0d(context, context.getString(R.string.str0b6e), C13680ns.A1b(), 0, R.string.str187e);
            }
            r5.A0N(A0d, 0);
        }
        this.A02.AWL(r7);
    }
}
