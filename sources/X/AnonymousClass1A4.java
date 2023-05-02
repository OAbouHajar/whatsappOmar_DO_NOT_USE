package X;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.os.Build;
import com.obwhatsapp.service.RestoreChatConnectionWorker;
import com.obwhatsapp.service.UnsentMessagesNetworkAvailableJob;
import com.whatsapp.util.Log;

/* renamed from: X.1A4  reason: invalid class name */
public class AnonymousClass1A4 {
    public final AnonymousClass01V A00;
    public final C16980tz A01;
    public final AnonymousClass12P A02;

    public AnonymousClass1A4(AnonymousClass01V r1, C16980tz r2, AnonymousClass12P r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void A00() {
        Log.i("Scheduling job to restore chat connection");
        AnonymousClass03z r3 = AnonymousClass03z.KEEP;
        C006903e r2 = new C006903e(RestoreChatConnectionWorker.class);
        AnonymousClass040 r1 = new AnonymousClass040();
        r1.A01(AnonymousClass041.CONNECTED);
        r2.A00.A0A = r1.A00();
        ((AnonymousClass022) this.A02.get()).A06(r3, (AnonymousClass043) r2.A00(), "com.obwhatsapp.service.restoreChatConnection");
    }

    public void A01() {
        if (Build.VERSION.SDK_INT >= 21) {
            Log.i("Scheduling job for unsent messages");
            this.A00.A09().schedule(new JobInfo.Builder(6, new ComponentName(this.A01.A00, UnsentMessagesNetworkAvailableJob.class)).setRequiredNetworkType(1).setPersisted(true).build());
        }
    }
}
