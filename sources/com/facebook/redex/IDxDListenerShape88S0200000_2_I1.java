package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass13S;
import X.AnonymousClass4QR;
import X.C13680ns;
import X.C16730tY;
import X.C16750ta;
import X.C19300yD;
import X.C30761cu;
import X.C31701et;
import X.C38331qc;
import X.C38641rB;
import com.obwhatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.util.Log;
import java.io.File;

public class IDxDListenerShape88S0200000_2_I1 implements C38331qc {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDListenerShape88S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public /* synthetic */ void AQ3(boolean z2) {
        if (this.A02 != 0) {
            StringBuilder A0r = AnonymousClass000.A0r("BusinessActivityReportManager/download-report/on-download-canceled transferred -> ");
            A0r.append(z2);
            C13680ns.A1V(A0r);
            if (!z2) {
                AnonymousClass13S r2 = (AnonymousClass13S) this.A00;
                File A06 = r2.A01.A06();
                if (A06.exists() && !A06.delete()) {
                    Log.e("BusinessActivityReportManager/reset/failed-delete-report-file");
                }
                r2.A03.A0f(2);
            }
        }
    }

    public final void AQ4(C31701et r6, C30761cu r7) {
        C16750ta r1;
        if (this.A02 != 0) {
            StringBuilder A0r = AnonymousClass000.A0r("BusinessActivityReportManager/download-report/on-download-completed success -> ");
            boolean A022 = r6.A02();
            A0r.append(A022);
            C13680ns.A1V(A0r);
            if (A022) {
                AnonymousClass13S r2 = (AnonymousClass13S) this.A00;
                synchronized (r2) {
                    r2.A03.A0f(4);
                }
                Log.i("BusinessActivityReportViewModel/download-report/on-success");
                BusinessActivityReportViewModel businessActivityReportViewModel = ((AnonymousClass4QR) this.A01).A00;
                C13680ns.A1P(businessActivityReportViewModel.A02, businessActivityReportViewModel.A05.A00());
                return;
            }
            ((AnonymousClass4QR) this.A01).A00();
            ((AnonymousClass13S) this.A00).A03.A0f(2);
            return;
        }
        C19300yD r4 = (C19300yD) this.A00;
        C38641rB r3 = (C38641rB) ((C16730tY) this.A01);
        if (r6.A02() && (r1 = r3.A02) != null) {
            r1.A0F = r7.A03();
            r4.A0o.A00(r3, new IDxCallbackShape71S0200000_2_I1(r4, 0, r3));
        }
    }
}
