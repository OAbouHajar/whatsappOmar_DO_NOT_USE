package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: X.2sS  reason: invalid class name and case insensitive filesystem */
public final class C58042sS extends AnonymousClass3M2 {
    public final Context A00;
    public final /* synthetic */ C57892s9 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58042sS(Context context, C57892s9 r3) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.A01 = r3;
        this.A00 = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.w("GoogleApiAvailability", C13680ns.A0i("Don't know how to handle this message: ", C13690nt.A0g(50), i2));
            return;
        }
        C57892s9 r6 = this.A01;
        Context context = this.A00;
        int A002 = r6.A00(context, 12451000);
        if (A002 == 1 || A002 == 2 || A002 == 3 || A002 == 9) {
            Intent A012 = r6.A01(context, "n", A002);
            r6.A02(A012 == null ? null : PendingIntent.getActivity(context, 0, A012, C815748w.A00 | 134217728), context, A002);
        }
    }
}
