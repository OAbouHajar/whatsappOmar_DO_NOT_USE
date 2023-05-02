package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass027;
import X.AnonymousClass2F9;
import X.C13680ns;
import com.obwhatsapp.registration.report.BanReportViewModel;
import com.obwhatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.util.Log;

public class IDxECallbackShape458S0100000_2_I1 implements AnonymousClass2F9 {
    public Object A00;
    public final int A01;

    public IDxECallbackShape458S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AQQ() {
        if (this.A01 != 0) {
            Log.i("BusinessActivityReportViewModel/export-report/on-error");
            C13680ns.A1P(((BusinessActivityReportViewModel) this.A00).A01, 6);
            return;
        }
        Log.i("BanReportViewModel/export-report/on-error");
        C13680ns.A1O(((BanReportViewModel) this.A00).A02, 1);
    }

    public void AVj(String str) {
        AnonymousClass027 r0;
        if (this.A01 != 0) {
            Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("BusinessActivityReportViewModel/export-report/on-ready-to-export :: ")));
            r0 = ((BusinessActivityReportViewModel) this.A00).A00;
        } else {
            Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("BanReportViewModel/export-report/on-ready-to-export :: ")));
            r0 = ((BanReportViewModel) this.A00).A01;
        }
        r0.A09(str);
    }
}
