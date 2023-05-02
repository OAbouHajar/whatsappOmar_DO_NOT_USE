package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.obwhatsapp.yo.yo;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.0xb  reason: invalid class name and case insensitive filesystem */
public class C19000xb {
    public C28721Xj A00;
    public final C16300so A01;
    public final C16980tz A02;
    public final C14710pd A03;

    public C19000xb(C16300so r1, C16980tz r2, C14710pd r3) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
    }

    public static C19000xb A21() {
        return (C19000xb) yo.mSingletonC.AQX.get();
    }

    public void A00(Job job) {
        C28721Xj r6 = this.A00;
        if (job.parameters.wakeLock) {
            Context context = r6.A00;
            String obj = job.toString();
            long j2 = job.parameters.wakeLockTimeout;
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, obj);
            if (j2 == 0) {
                newWakeLock.acquire();
            } else {
                newWakeLock.acquire(j2);
            }
            job.A02 = newWakeLock;
        }
        r6.A01.execute(new RunnableRunnableShape11S0200000_I0_9(r6, 38, job));
    }
}
