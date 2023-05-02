package com.facebook.redex;

import X.AnonymousClass031;
import X.AnonymousClass05M;
import X.AnonymousClass3K3;
import X.AnonymousClass4M9;
import X.C57702rc;
import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;

public class IDxDCompatShape4S0200000_2_I1 extends AnonymousClass05M {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDCompatShape4S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A00(View view, int i2) {
        if (2 - this.A02 == 0 && i2 == 256) {
            ExoPlaybackControlView exoPlaybackControlView = (ExoPlaybackControlView) this.A01;
            if (exoPlaybackControlView.A07()) {
                exoPlaybackControlView.A00();
                return;
            }
            exoPlaybackControlView.A01();
            exoPlaybackControlView.A06(3000);
            return;
        }
        super.A00(view, i2);
    }

    public void A06(View view, AnonymousClass031 r4) {
        String str;
        Context context;
        int i2;
        switch (this.A02) {
            case 0:
                super.A06(view, r4);
                context = ((View) this.A01).getContext();
                i2 = R.string.str05a9;
                break;
            case 1:
                super.A06(view, r4);
                str = ((AnonymousClass4M9) this.A01).A02;
                break;
            case 3:
                super.A06((View) this.A01, r4);
                C57702rc r0 = (C57702rc) this.A00;
                context = r0.A03;
                i2 = r0.A00;
                break;
            default:
                super.A06(view, r4);
                return;
        }
        str = context.getString(i2);
        AnonymousClass3K3.A18(r4, str);
    }
}
