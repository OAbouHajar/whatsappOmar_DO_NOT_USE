package com.obwhatsapp.wabloks.base;

import X.AnonymousClass00B;
import X.AnonymousClass2WZ;
import X.AnonymousClass2Wa;
import X.C110105dW;
import X.C1207462v;
import X.C13690nt;
import X.C20170zc;
import X.C35001lD;
import X.C52372dh;
import android.os.Bundle;
import java.util.Map;

public class BkFcsPreloadingScreenFragment extends Hilt_BkFcsPreloadingScreenFragment {
    public C52372dh A00;
    public C20170zc A01;
    public String A02;
    public String A03;
    public Map A04;
    public boolean A05 = false;

    public static BkFcsPreloadingScreenFragment A01(C35001lD r3, String str, String str2, String str3, String str4, String str5, String str6) {
        BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment = new BkFcsPreloadingScreenFragment();
        bkFcsPreloadingScreenFragment.A1F(str);
        bkFcsPreloadingScreenFragment.A1E(str4);
        bkFcsPreloadingScreenFragment.A1C();
        bkFcsPreloadingScreenFragment.A04().putParcelable("screen_cache_config", r3);
        bkFcsPreloadingScreenFragment.A1C();
        bkFcsPreloadingScreenFragment.A04().putSerializable("qpl_params", str5);
        bkFcsPreloadingScreenFragment.A1G(str2, str3);
        if (bkFcsPreloadingScreenFragment.A05 == null) {
            bkFcsPreloadingScreenFragment.A0T(C13690nt.A0D());
        }
        bkFcsPreloadingScreenFragment.A04().putString("observer_id", str6);
        return bkFcsPreloadingScreenFragment;
    }

    public void A0w() {
        super.A0w();
        this.A05 = false;
    }

    public void A12() {
        super.A12();
        C52372dh r0 = this.A00;
        if (r0 != null) {
            r0.A03(this);
            this.A00 = null;
        }
    }

    public void A14() {
        super.A14();
        this.A05 = true;
    }

    public void A17(Bundle bundle) {
        AnonymousClass2Wa r0;
        String string = A04().getString("screen_name");
        AnonymousClass00B.A06(string);
        this.A03 = string;
        String string2 = A04().getString("observer_id");
        AnonymousClass00B.A06(string2);
        this.A02 = string2;
        AnonymousClass2WZ A002 = this.A01.A00(this.A03);
        if (!(A002 == null || (r0 = A002.A01) == null)) {
            this.A02 = r0;
        }
        super.A17(bundle);
        C52372dh A022 = this.A04.A02(this.A02);
        this.A00 = A022;
        C110105dW.A1N(A022, C1207462v.class, this, 2);
    }
}
