package com.obwhatsapp.payments.care.csat;

import X.AnonymousClass000;
import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass1MS;
import X.AnonymousClass1ZT;
import X.AnonymousClass4IM;
import X.AnonymousClass53M;
import X.C009604p;
import X.C114715oR;
import X.C13690nt;
import X.C13700nu;
import X.C16040sK;
import X.C18450wi;
import X.C35001lD;
import X.C434920f;
import X.C95084lx;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class CsatSurveyBloksActivity extends C114715oR {
    public AnonymousClass4IM A00;

    public static /* synthetic */ void A02(AnonymousClass01A r2, CsatSurveyBloksActivity csatSurveyBloksActivity) {
        C009604p r1;
        if ((r2 instanceof BkBottomSheetContainerFragment) && (r1 = r2.A0K) != null) {
            r1.A00(new CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1(r2, csatSurveyBloksActivity));
        }
    }

    public AnonymousClass01A A35(Intent intent) {
        return new AnonymousClass01A();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13690nt.A1I(this, R.id.wabloks_screen);
        AnonymousClass02C AGM = AGM();
        AGM.A0Z.add(new C95084lx(this));
        AnonymousClass4IM r3 = this.A00;
        if (r3 != null) {
            String stringExtra = getIntent().getStringExtra("survey_id");
            if (stringExtra != null) {
                String stringExtra2 = getIntent().getStringExtra("entry_point");
                String stringExtra3 = getIntent().getStringExtra("session_id");
                AnonymousClass1MS r9 = (AnonymousClass1MS) r3.A01.get();
                WeakReference A0h = C13690nt.A0h(this);
                boolean A09 = C434920f.A09(this);
                C16040sK r0 = r3.A00;
                r0.A0B();
                AnonymousClass1ZT r02 = r0.A05;
                C18450wi.A0F(r02);
                String rawString = r02.getRawString();
                C18450wi.A0B(rawString);
                JSONObject A0J = C13700nu.A0J();
                A0J.put("survey_id", stringExtra);
                if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                    A0J.put("entry_point", stringExtra2);
                }
                if (!(stringExtra3 == null || stringExtra3.length() == 0)) {
                    A0J.put("session_id", stringExtra3);
                }
                String obj = C13700nu.A0J().put("params", C13700nu.A0J().put("server_params", A0J)).toString();
                C18450wi.A0B(obj);
                r9.A00(new AnonymousClass53M(), (C35001lD) null, "com.bloks.www.novi.care.start_survey_action", rawString, obj, A0h, A09);
                return;
            }
            throw AnonymousClass000.A0T("Required value was null.");
        }
        throw C18450wi.A03("csatSurveyLauncherProxy");
    }
}
