package X;

import android.app.Activity;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3ub  reason: invalid class name and case insensitive filesystem */
public class C76733ub extends AnonymousClass2K1 {
    public final C211312x A00;

    public C76733ub(Activity activity, C14870pt r10, C16080sP r11, AnonymousClass12W r12, C14730pf r13, C16490t9 r14, C211312x r15) {
        super(activity, r10, r11, r12, r13, (C16010sH) null, r14);
        this.A00 = r15;
    }

    public void AQ4(C31701et r6, C30761cu r7) {
        if (r6.A02()) {
            C211312x r2 = this.A00;
            synchronized (r2) {
                Log.i("gdpr/on-report-downloaded");
                r2.A0D.A0h(3);
            }
        } else {
            int i2 = r6.A01;
            if (i2 == 5 || i2 == 8) {
                A01(new Object[0], i2, R.string.str073d, R.string.str093d);
                this.A00.A04();
            } else if (i2 == 4) {
                A01(new Object[0], i2, R.string.str073d, R.string.str0b9f);
            } else {
                A00(r6);
                C211312x r1 = this.A00;
                synchronized (r1) {
                    Log.i("gdpr/on-report-download-failed");
                    r1.A0D.A0h(4);
                }
            }
        }
        this.A01 = null;
    }
}
