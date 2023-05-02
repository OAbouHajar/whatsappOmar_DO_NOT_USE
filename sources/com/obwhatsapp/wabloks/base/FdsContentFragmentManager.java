package com.obwhatsapp.wabloks.base;

import X.AnonymousClass01A;
import X.AnonymousClass050;
import X.C110105dW;
import X.C1206162i;
import X.C1206262j;
import X.C1206462l;
import X.C1207062r;
import X.C1216166e;
import X.C13680ns;
import X.C13690nt;
import X.C20180zd;
import X.C52372dh;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.obwhatsapp.R;

public class FdsContentFragmentManager extends Hilt_FdsContentFragmentManager {
    public LinearLayout A00;
    public C20180zd A01;
    public Runnable A02;
    public boolean A03 = true;

    public static FdsContentFragmentManager A01(String str) {
        FdsContentFragmentManager fdsContentFragmentManager = new FdsContentFragmentManager();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("fds_observer_id", str);
        fdsContentFragmentManager.A0T(A0D);
        return fdsContentFragmentManager;
    }

    public static /* synthetic */ void A02(FdsContentFragmentManager fdsContentFragmentManager, C1207062r r6) {
        AnonymousClass01A r4 = r6.A00;
        String str = r6.A01;
        if (fdsContentFragmentManager.A03) {
            fdsContentFragmentManager.A1A(r4, str);
        } else if (!fdsContentFragmentManager.A0D().isFinishing()) {
            fdsContentFragmentManager.A01.A02(fdsContentFragmentManager.A04().getString("fds_observer_id")).A01(new C1206162i());
            fdsContentFragmentManager.A02 = new C1216166e(r4, fdsContentFragmentManager, str);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout060c);
        this.A00 = (LinearLayout) A0H.findViewById(R.id.wa_fcs_modal_fragment_container);
        return A0H;
    }

    public void A12() {
        this.A01.A02(A04().getString("fds_observer_id")).A03(this);
        this.A00 = null;
        this.A02 = null;
        super.A12();
    }

    public void A18(Bundle bundle, View view) {
        C52372dh A022 = this.A01.A02(this.A05.getString("fds_observer_id"));
        C110105dW.A1N(A022, C1207062r.class, this, 4);
        C110105dW.A1N(A022, C1206462l.class, this, 3);
        A022.A01(new C1206262j());
    }

    public void A1A(AnonymousClass01A r6, String str) {
        AnonymousClass050 r4 = new AnonymousClass050(A0F());
        r4.A0I(str);
        r4.A02 = R.anim.anim0027;
        r4.A03 = R.anim.anim0028;
        r4.A05 = R.anim.anim0026;
        r4.A06 = R.anim.anim0029;
        r4.A0E(r6, str, this.A00.getId());
        r4.A01();
    }
}
