package X;

import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.whatsapp.util.Log;
import java.util.TimerTask;

/* renamed from: X.2ih  reason: invalid class name and case insensitive filesystem */
public class C55032ih extends TimerTask {
    public final /* synthetic */ C55042ii A00;

    public C55032ih(C55042ii r1) {
        this.A00 = r1;
    }

    public void run() {
        StringBuilder sb = new StringBuilder("restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/not-finished-in-");
        C55042ii r4 = this.A00;
        sb.append(r4.A07.A00() / 1000);
        sb.append("-seconds");
        Log.i(sb.toString());
        r4.A00.A0K(new RunnableRunnableShape3S0100000_I0_2(this, 2));
    }
}
