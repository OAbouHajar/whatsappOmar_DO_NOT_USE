package X;

import com.whatsapp.util.Log;

/* renamed from: X.64l  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1211664l implements Runnable {
    public final /* synthetic */ C114195nH A00;

    public /* synthetic */ C1211664l(C114195nH r1) {
        this.A00 = r1;
    }

    public final void run() {
        C114195nH r0 = this.A00;
        C119255wn r2 = r0.A07;
        C117975tr r1 = new C117975tr(r0);
        String str = r0.A09;
        synchronized (r2) {
            Log.i("dyiReportManager/download-report");
            C117055sN A03 = r2.A03(str);
            if (A03 == null) {
                Log.e("dyiReportManager/download-report no valid report info");
            } else {
                String str2 = A03.A02;
                if (str2 == null) {
                    Log.e("dyiReportManager/download-report no url");
                } else {
                    C14710pd r8 = r2.A08;
                    C17130ua r6 = r2.A04;
                    C111985hk r4 = new C111985hk(r2.A03, r6, r2.A07, r8, r2.A09, new C116025qh(str2), r2.A0B, r2.A02.A0H(str));
                    r2.A00 = r4;
                    r4.A4Z(new AnonymousClass60K(r2, r1, str));
                    Log.i("dyiReportManager/on-report-downloading");
                    r2.A0A.A0D(3, str);
                    r2.A00.A01();
                }
            }
            r2.A05(str);
            r1.A00();
        }
    }
}
