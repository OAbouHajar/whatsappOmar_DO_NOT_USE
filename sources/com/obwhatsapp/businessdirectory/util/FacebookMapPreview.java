package com.obwhatsapp.businessdirectory.util;

import X.AnonymousClass0P5;
import X.AnonymousClass0YG;
import X.AnonymousClass1GE;
import X.C001100m;
import X.C003501o;
import X.C011405n;
import X.C12800kz;
import X.C19980zJ;
import X.C434920f;
import X.C55562jx;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.IDxRCallbackShape296S0100000_2_I1;

public final class FacebookMapPreview implements C003501o {
    public C55562jx A00;
    public final C12800kz A01;

    public FacebookMapPreview(ViewGroup viewGroup, C12800kz r6, AnonymousClass0YG r7, AnonymousClass1GE r8) {
        this.A01 = r6;
        C001100m r3 = (C001100m) C19980zJ.A00(viewGroup.getContext());
        r8.A03(r3);
        AnonymousClass0P5 r2 = new AnonymousClass0P5();
        r2.A06 = false;
        r2.A03 = false;
        r2.A05 = false;
        r2.A01 = r7;
        r2.A04 = C434920f.A09(r3);
        r2.A02 = "whatsapp_smb_business_discovery";
        C55562jx r1 = new C55562jx(r3, r2);
        this.A00 = r1;
        r1.A0E((Bundle) null);
        r3.A06.A00(this);
        viewGroup.addView(this.A00);
    }

    @OnLifecycleEvent(C011405n.ON_CREATE)
    private final void onCreate() {
        C55562jx r2 = this.A00;
        r2.A0E((Bundle) null);
        r2.A0J(new IDxRCallbackShape296S0100000_2_I1(this, 0));
    }

    @OnLifecycleEvent(C011405n.ON_DESTROY)
    private final void onDestroy() {
    }

    @OnLifecycleEvent(C011405n.ON_PAUSE)
    private final void onPause() {
    }

    @OnLifecycleEvent(C011405n.ON_RESUME)
    private final void onResume() {
    }

    @OnLifecycleEvent(C011405n.ON_START)
    private final void onStart() {
    }

    @OnLifecycleEvent(C011405n.ON_STOP)
    private final void onStop() {
    }
}
