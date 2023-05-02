package X;

import com.obwhatsapp.report.BusinessActivityReportViewModel;
import com.obwhatsapp.report.ReportActivity;

/* renamed from: X.3Gs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63253Gs implements AnonymousClass5QE {
    public final /* synthetic */ ReportActivity A00;

    public /* synthetic */ C63253Gs(ReportActivity reportActivity) {
        this.A00 = reportActivity;
    }

    public final void A7p() {
        boolean z2;
        BusinessActivityReportViewModel businessActivityReportViewModel = this.A00.A0L;
        if (businessActivityReportViewModel.A03.A0O()) {
            C13680ns.A1O(businessActivityReportViewModel.A01, 1);
            AnonymousClass51L r6 = businessActivityReportViewModel.A0B;
            if (r6.A04.A0A()) {
                C17190ug r5 = r6.A05;
                String A02 = r5.A02();
                C35081lL[] r3 = new C35081lL[1];
                char A03 = C35081lL.A03("action", "delete", r3);
                C28371Vv r4 = new C28371Vv("p2b", r3);
                C35081lL[] r32 = new C35081lL[6];
                r32[A03] = C35081lL.A00();
                C16040sK r0 = r6.A03;
                r0.A0B();
                AnonymousClass1ZT r02 = r0.A05;
                AnonymousClass00B.A06(r02);
                C35081lL.A02("from", r02.getRawString(), r32, 1);
                C35081lL.A01("xmlns", "w:biz:p2b_report", r32);
                r32[3] = new C35081lL("type", "set");
                r32[4] = new C35081lL("smax_id", "31");
                r32[5] = new C35081lL("id", A02);
                r5.A0B(r6, C28371Vv.A04(r4, r32), A02, 266, 32000);
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder A0r = AnonymousClass000.A0r("app/sendDeleteReport success:");
            A0r.append(z2);
            C13680ns.A1V(A0r);
        }
    }
}
