package X;

import android.util.Base64;
import com.obwhatsapp.registration.report.BanReportViewModel;
import java.io.IOException;

/* renamed from: X.4yo  reason: invalid class name and case insensitive filesystem */
public class C102354yo implements C448025p {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BanReportViewModel A01;

    public C102354yo(BanReportViewModel banReportViewModel, int i2) {
        this.A01 = banReportViewModel;
        this.A00 = i2;
    }

    public void A5s(AnonymousClass2JT r22) {
        Object obj;
        AnonymousClass2JT r0 = r22;
        AnonymousClass14O r1 = r0.A02;
        int i2 = r0.A00;
        Integer A0Y = C13680ns.A0Y();
        if (i2 == 0 && (obj = r1.A00) != null) {
            C83834If r2 = (C83834If) obj;
            String str = r2.A01;
            if ("AVAILABLE".equals(str)) {
                AnonymousClass4OK r4 = r2.A00;
                if (r4 != null) {
                    BanReportViewModel banReportViewModel = this.A01;
                    banReportViewModel.A06.A06(new C102654zJ(banReportViewModel), AnonymousClass1XK.A08, (AnonymousClass1WE) null, (AnonymousClass1WE) null, r4.A03, r4.A04, r4.A02, r4.A06, r4.A01, (String) null, Base64.decode(r4.A05, 2), 2, 1, 10, 2, (long) r4.A00);
                    return;
                }
            } else {
                boolean equals = "PENDING".equals(str);
                BanReportViewModel banReportViewModel2 = this.A01;
                if (equals) {
                    BanReportViewModel.A01(banReportViewModel2, this.A00);
                    return;
                }
                C82444Cv r02 = banReportViewModel2.A04;
                String str2 = banReportViewModel2.A00;
                AnonymousClass2FC r23 = r02.A00;
                C16150sX r12 = r23.A02;
                C17130ua A05 = C16150sX.A05(r12);
                C15860rz A0Y2 = C16150sX.A0Y(r12);
                AnonymousClass01D A002 = C17270uo.A00(r12.AQV);
                C14710pd A0k = C16150sX.A0k(r12);
                AnonymousClass2FD r03 = r23.A03;
                new AnonymousClass2FF(A05, A0Y2, A0k, (C17660vR) r12.APW.get(), A002, str2, r03.A0c, r03.A0A).Aah(new C102344yn(this));
                return;
            }
        }
        this.A01.A02.A09(A0Y);
    }

    public void APZ(IOException iOException) {
        C13680ns.A1P(this.A01.A02, 1);
    }

    public void AQa(Exception exc) {
        C13680ns.A1P(this.A01.A02, 1);
    }
}
