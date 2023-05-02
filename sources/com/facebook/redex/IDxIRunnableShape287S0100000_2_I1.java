package com.facebook.redex;

import X.AnonymousClass36Q;
import X.AnonymousClass36S;
import X.C13680ns;
import X.C40841um;
import X.C49642Uo;
import android.os.Handler;
import com.obwhatsapp.profile.SetAboutInfo;
import com.obwhatsapp.report.ReportActivity;
import com.whatsapp.util.Log;

public class IDxIRunnableShape287S0100000_2_I1 implements C40841um {
    public Object A00;
    public final int A01;

    public IDxIRunnableShape287S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void Ach(int i2) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass36S) this.A00).A00 = i2;
                return;
            case 1:
                ((C49642Uo) this.A00).A06(i2);
                return;
            case 2:
                ((AnonymousClass36Q) this.A00).A00 = i2;
                return;
            case 3:
                Handler handler = ((SetAboutInfo) this.A00).A07;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
                return;
            default:
                ReportActivity reportActivity = (ReportActivity) this.A00;
                Log.e(C13680ns.A0c(i2, "send-get-gdpr-report/failed/error "));
                if (i2 == 404) {
                    reportActivity.A0M.A04();
                    return;
                } else {
                    reportActivity.A05.A0K(new RunnableRunnableShape14S0100000_I0_13((Object) reportActivity, 7));
                    return;
                }
        }
    }
}
