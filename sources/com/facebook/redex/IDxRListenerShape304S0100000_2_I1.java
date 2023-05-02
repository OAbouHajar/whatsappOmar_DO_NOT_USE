package com.facebook.redex;

import X.AnonymousClass07E;
import android.os.Bundle;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2;
import com.obwhatsapp.privacy.disclosure.standalone.PrivacyDisclosureStandaloneContainerActivity;

public class IDxRListenerShape304S0100000_2_I1 implements AnonymousClass07E {
    public Object A00;
    public final int A01;

    public IDxRListenerShape304S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ARb(String str, Bundle bundle) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                CatalogSearchFragment.A03(bundle, (CatalogSearchFragment) obj);
                return;
            case 1:
                CatalogSearchFragmentV2.A02(bundle, (CatalogSearchFragmentV2) obj);
                return;
            default:
                PrivacyDisclosureStandaloneContainerActivity.A02(bundle, (PrivacyDisclosureStandaloneContainerActivity) obj);
                return;
        }
    }
}
