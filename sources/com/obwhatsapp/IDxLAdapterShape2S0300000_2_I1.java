package com.obwhatsapp;

import X.C30551cZ;
import android.view.View;
import android.view.animation.Animation;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxLAdapterShape2S0300000_2_I1 extends C30551cZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLAdapterShape2S0300000_2_I1(View view, View view2, VoipActivityV2 voipActivityV2, int i2) {
        this.A03 = i2;
        this.A00 = voipActivityV2;
        this.A01 = view;
        this.A02 = view2;
    }

    public void onAnimationEnd(Animation animation) {
        VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
        voipActivityV2.hideView((View) this.A02);
        voipActivityV2.A0X.setVisibility(0);
        voipActivityV2.showView((View) this.A01);
    }

    public void onAnimationStart(Animation animation) {
        VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
        voipActivityV2.A0X.setVisibility(4);
        voipActivityV2.hideView((View) this.A01);
    }
}
