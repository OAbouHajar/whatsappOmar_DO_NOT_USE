package X;

import android.os.SystemClock;
import com.facebook.redex.IDxRCallbackShape12S0300000_1_I1;
import com.obwhatsapp.report.ReportActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.36l  reason: invalid class name and case insensitive filesystem */
public class C608736l extends C16690tT {
    public final C14870pt A00;
    public final AnonymousClass2DS A01;
    public final WeakReference A02;

    public C608736l(C14550pN r2, C14870pt r3, AnonymousClass2DS r4) {
        super(r2, true);
        this.A02 = C13690nt.A0h(r2);
        this.A00 = r3;
        this.A01 = r4;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ReportActivity reportActivity = (ReportActivity) this.A01;
        C83844Ig r6 = reportActivity.A0N;
        AnonymousClass4F3 r5 = new AnonymousClass4F3(reportActivity);
        C17190ug r9 = r6.A01;
        String A022 = r9.A02();
        Log.i(C13680ns.A0h("GdprXmppMethods/sendRequestGdprReport; iq=", A022));
        C35081lL[] r4 = new C35081lL[1];
        C28371Vv A012 = C16690tT.A01(new C28371Vv("gdpr", r4), A022, C35081lL.A03("action", "request", r4) ? 1 : 0);
        C29951bV r42 = new C29951bV();
        r9.A0A(new IDxRCallbackShape12S0300000_1_I1(r42, r6, r5, 3), A012, A022, 167, 32000);
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
            C14870pt.A01(this.A00, this, 33);
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
