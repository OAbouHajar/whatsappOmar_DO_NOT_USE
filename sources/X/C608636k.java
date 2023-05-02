package X;

import android.os.SystemClock;
import com.facebook.redex.IDxIRunnableShape287S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.obwhatsapp.report.ReportActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.36k  reason: invalid class name and case insensitive filesystem */
public class C608636k extends C16690tT {
    public final C14870pt A00;
    public final AnonymousClass2DS A01;
    public final WeakReference A02;

    public C608636k(C14550pN r2, C14870pt r3, AnonymousClass2DS r4) {
        super(r2, true);
        this.A02 = C13690nt.A0h(r2);
        this.A00 = r3;
        this.A01 = r4;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ReportActivity reportActivity = (ReportActivity) this.A01;
        C83844Ig r7 = reportActivity.A0N;
        RunnableRunnableShape14S0100000_I0_13 runnableRunnableShape14S0100000_I0_13 = new RunnableRunnableShape14S0100000_I0_13((Object) reportActivity.A0M, 6);
        IDxIRunnableShape287S0100000_2_I1 iDxIRunnableShape287S0100000_2_I1 = new IDxIRunnableShape287S0100000_2_I1(reportActivity, 4);
        C17190ug r10 = r7.A01;
        String A022 = r10.A02();
        Log.i(C13680ns.A0h("GdprXmppMethods/sendDeleteGdprReport; iq=", A022));
        C35081lL[] r4 = new C35081lL[1];
        C28371Vv A012 = C16690tT.A01(new C28371Vv("gdpr", r4), A022, C35081lL.A03("action", "delete", r4) ? 1 : 0);
        C29951bV r42 = new C29951bV();
        r10.A0A(new AnonymousClass51H(r42, iDxIRunnableShape287S0100000_2_I1, r7, runnableRunnableShape14S0100000_I0_13), A012, A022, 169, 32000);
        try {
            r42.get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                try {
                    Thread.sleep(500 - elapsedRealtime2);
                    return null;
                } catch (InterruptedException unused) {
                }
            }
        } catch (Exception e2) {
            Log.w("send-request-gdpr-report/timeout", e2);
            C14870pt.A01(this.A00, this, 32);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C14550pN r1 = (C14550pN) this.A02.get();
        if (r1 != null && !r1.AIm()) {
            r1.Ac1();
            this.A01.Aba();
        }
    }
}
