package X;

import com.facebook.redex.IDxRCallbackShape12S0300000_1_I1;
import com.obwhatsapp.report.ReportActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.361  reason: invalid class name */
public class AnonymousClass361 extends C16690tT {
    public final AnonymousClass2DS A00;
    public final WeakReference A01;

    public AnonymousClass361(C14550pN r2, AnonymousClass2DS r3) {
        super(r2, true);
        this.A01 = C13690nt.A0h(r2);
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ReportActivity reportActivity = (ReportActivity) this.A00;
        C83844Ig r5 = reportActivity.A0N;
        AnonymousClass4F4 r4 = new AnonymousClass4F4(reportActivity);
        C17190ug r6 = r5.A01;
        String A02 = r6.A02();
        Log.i(C13680ns.A0h("GdprXmppMethods/sendGetGdprReport; iq=", A02));
        C35081lL[] r3 = new C35081lL[1];
        C28371Vv A012 = C16690tT.A01(new C28371Vv("gdpr", r3), A02, C35081lL.A03("action", "status", r3) ? 1 : 0);
        C29951bV r1 = new C29951bV();
        r6.A0A(new IDxRCallbackShape12S0300000_1_I1(r1, r5, r4, 4), A012, A02, 168, 32000);
        try {
            r1.get(32000, TimeUnit.MILLISECONDS);
            return null;
        } catch (Exception e2) {
            Log.w("send-get-gdpr-report/timeout", e2);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C14550pN r0 = (C14550pN) this.A01.get();
        if (r0 != null && !r0.AIm()) {
            this.A00.Aba();
        }
    }
}
