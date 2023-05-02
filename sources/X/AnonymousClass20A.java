package X;

import com.obwhatsapp.R;
import com.whatsapp.Mp4Ops;
import java.io.File;

/* renamed from: X.20A  reason: invalid class name */
public class AnonymousClass20A implements Runnable, C30721cq {
    public final C16300so A00;
    public final C16980tz A01;
    public final AnonymousClass209 A02;
    public volatile boolean A03 = false;

    public AnonymousClass20A(C16300so r2, C16980tz r3, AnonymousClass209 r4) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public synchronized void cancel() {
        this.A03 = true;
    }

    public void run() {
        C76783ug r1;
        AnonymousClass209 r5 = this.A02;
        File file = r5.A02;
        try {
            Mp4Ops.A03(file, false);
            boolean z2 = false;
            if (!this.A03) {
                z2 = true;
            }
            r1 = new C76783ug(file, z2);
        } catch (AnonymousClass20O unused) {
            if (!this.A03) {
                r5.A00.A00.A01.A04(Integer.valueOf(R.string.str083e));
            }
            r1 = new C76783ug(file, false);
        }
        r5.A01.ARN(r1);
    }
}
