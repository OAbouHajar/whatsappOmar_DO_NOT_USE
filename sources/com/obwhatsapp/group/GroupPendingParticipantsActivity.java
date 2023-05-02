package com.obwhatsapp.group;

import X.AnonymousClass02C;
import X.AnonymousClass3PT;
import X.C004601z;
import X.C005402i;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16620tM;
import X.C18450wi;
import X.C33741j5;
import X.C49132Rg;
import X.C76523uA;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.obwhatsapp.PagerSlidingTabStrip;
import com.obwhatsapp.R;

public final class GroupPendingParticipantsActivity extends C14530pL {
    public boolean A00;

    public GroupPendingParticipantsActivity() {
        this(0);
    }

    public GroupPendingParticipantsActivity(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 74);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A0E = this.A0C.A0E(C16620tM.A02, 2369);
        setTitle(R.string.str0af0);
        setContentView((int) R.layout.layout02df);
        String stringExtra = getIntent().getStringExtra("gid");
        if (stringExtra != null) {
            C005402i x2 = x();
            if (x2 != null) {
                x2.A0N(true);
            }
            ViewPager viewPager = (ViewPager) C18450wi.A01(this, R.id.pending_participants_root_layout);
            C33741j5 r4 = new C33741j5(findViewById(R.id.pending_participants_tabs));
            if (A0E) {
                r4.A03(0);
                AnonymousClass02C AGM = AGM();
                View A02 = r4.A02();
                C18450wi.A0B(A02);
                viewPager.setAdapter(new C76523uA(this, AGM, (PagerSlidingTabStrip) A02, stringExtra));
                ((PagerSlidingTabStrip) r4.A02()).setViewPager(viewPager);
                C004601z.A0d(r4.A02(), 2);
                C004601z.A0f(r4.A02(), 0);
                C005402i x3 = x();
                if (x3 != null) {
                    x3.A08(0.0f);
                    return;
                }
                return;
            }
            viewPager.setAdapter(new AnonymousClass3PT(this, AGM(), stringExtra, false));
        }
    }
}
