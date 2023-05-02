package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.60K  reason: invalid class name */
public class AnonymousClass60K implements C38331qc {
    public final /* synthetic */ C119255wn A00;
    public final /* synthetic */ C117975tr A01;
    public final /* synthetic */ String A02;

    public AnonymousClass60K(C119255wn r1, C117975tr r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public void AQ3(boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("dyiReportManager/download-report/on-download-canceled transferred -> ");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        if (!z2) {
            C119255wn r3 = this.A00;
            C16180sb r0 = r3.A02;
            String str = this.A02;
            File A0H = r0.A0H(str);
            if (A0H.exists() && !A0H.delete()) {
                Log.e("dyiReportManager/reset/failed-delete-report-file");
            }
            r3.A0A.A0D(2, str);
        }
    }

    public void AQ4(C31701et r5, C30761cu r6) {
        StringBuilder A0r = AnonymousClass000.A0r("dyiReportManager/download-report/on-download-canceled success -> ");
        boolean A022 = r5.A02();
        A0r.append(A022);
        C13680ns.A1V(A0r);
        if (A022) {
            C119255wn r3 = this.A00;
            String str = this.A02;
            synchronized (r3) {
                r3.A0A.A0D(4, str);
            }
            C117975tr r1 = this.A01;
            Log.i("DyiViewModel/download-report/on-success");
            C114195nH r0 = r1.A00;
            C119255wn.A01(r0.A02, r0.A07, r0.A09);
            return;
        }
        this.A01.A00();
        this.A00.A0A.A0D(2, this.A02);
    }
}
