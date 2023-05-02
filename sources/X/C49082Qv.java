package X;

import com.obwhatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Qv  reason: invalid class name and case insensitive filesystem */
public class C49082Qv implements C49092Qw {
    public final /* synthetic */ DeleteAccountFromHsmServerJob A00;
    public final /* synthetic */ AtomicInteger A01;

    public C49082Qv(DeleteAccountFromHsmServerJob deleteAccountFromHsmServerJob, AtomicInteger atomicInteger) {
        this.A00 = deleteAccountFromHsmServerJob;
        this.A01 = atomicInteger;
    }

    public void AQf(int i2, String str, int i3) {
        StringBuilder sb = new StringBuilder("DeleteAccountFromHsmServerJob/job unsuccessful with error code: ");
        sb.append(i2);
        Log.e(sb.toString());
        this.A01.set(i2);
    }

    public void onSuccess() {
        Log.i("DeleteAccountFromHsmServerJob/job successful");
    }
}
