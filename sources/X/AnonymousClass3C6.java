package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import com.whatsapp.util.Log;

/* renamed from: X.3C6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;

    public /* synthetic */ AnonymousClass3C6(Activity activity, int i2, int i3) {
        this.A00 = i2;
        this.A02 = activity;
        this.A01 = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        PendingIntent activity;
        int i3 = this.A00;
        Activity activity2 = this.A02;
        int i4 = this.A01;
        try {
            Intent A012 = AnonymousClass3AP.A00.A01(activity2, (String) null, i3);
            if (A012 == null || (activity = PendingIntent.getActivity(activity2, i4, A012, C815748w.A00 | 134217728)) == null) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("gdrive-util/get-error-dialog pending intent is null for error code: ");
                Log.e(AnonymousClass000.A0h(AnonymousClass2GK.A03(i3), A0o));
                return;
            }
            StringBuilder A0o2 = AnonymousClass000.A0o();
            A0o2.append("gdrive-util/get-error-dialog starting resolution for ");
            Log.e(AnonymousClass000.A0h(AnonymousClass2GK.A03(i3), A0o2));
            C15700rh r1 = new C15700rh(i3, activity);
            if (r1.A00()) {
                PendingIntent pendingIntent = r1.A02;
                C13710nw.A01(pendingIntent);
                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), i4, (Intent) null, 0, 0, 0);
            }
        } catch (IntentSender.SendIntentException e2) {
            Log.e("gdrive-util/get-error-dialog", e2);
        }
    }
}
