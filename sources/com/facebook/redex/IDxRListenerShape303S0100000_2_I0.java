package com.facebook.redex;

import X.AnonymousClass07E;
import X.C42821yj;
import android.os.Bundle;
import com.obwhatsapp.community.CommunityHomeActivity;

public class IDxRListenerShape303S0100000_2_I0 implements AnonymousClass07E {
    public Object A00;
    public final int A01;

    public IDxRListenerShape303S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ARb(String str, Bundle bundle) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C42821yj.A00(bundle, (C42821yj) obj);
        } else {
            CommunityHomeActivity.A02(bundle, (CommunityHomeActivity) obj);
        }
    }
}
