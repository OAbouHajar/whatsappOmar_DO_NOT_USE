package com.obwhatsapp;

import X.AnonymousClass01A;
import X.AnonymousClass3D6;
import X.AnonymousClass3K3;
import X.AnonymousClass3T3;
import X.C30551cZ;
import X.C42821yj;
import X.C63223Gp;
import X.C94454kw;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.facebook.redex.IDxDListenerShape58S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.obwhatsapp.phonematching.CountryPicker;
import com.whatsapp.util.Log;

public class IDxLAdapterShape52S0100000_2_I1 extends C30551cZ {
    public Object A00;
    public final int A01;

    public IDxLAdapterShape52S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        View view;
        int i2;
        switch (this.A01) {
            case 0:
                view = (View) this.A00;
                i2 = 8;
                break;
            case 1:
                Log.i("conversation/showinputextension/end");
                C94454kw r3 = (C94454kw) this.A00;
                C42821yj r2 = r3.A03;
                r2.A0z.setClipChildren(true);
                r2.A01 = 0;
                r2.A1n.setTranscriptMode(r3.A00);
                return;
            case 2:
                ImageView imageView = ((AnonymousClass3D6) this.A00).A01;
                imageView.post(new RunnableRunnableShape14S0200000_I1_2(this, 8, imageView));
                return;
            case 3:
                AnonymousClass3T3 r1 = (AnonymousClass3T3) ((IDxDListenerShape58S0200000_2_I1) this.A00).A00;
                r1.clearAnimation();
                r1.A0E = false;
                r1.setEnabled(true);
                AnonymousClass3K3.A14(r1);
                return;
            case 4:
                ((AnonymousClass01A) this.A00).A0G().A0p();
                return;
            case 5:
                ((C63223Gp) this.A00).A00.A0R.AcJ();
                return;
            case 6:
                ((CountryPicker) this.A00).A01.setIconified(false);
                return;
            default:
                CountryPicker countryPicker = (CountryPicker) this.A00;
                countryPicker.A01.A07();
                countryPicker.A00.setVisibility(8);
                view = countryPicker.A02;
                i2 = 0;
                break;
        }
        view.setVisibility(i2);
    }

    public void onAnimationStart(Animation animation) {
        if (3 - this.A01 != 0) {
            super.onAnimationStart(animation);
            return;
        }
        IDxDListenerShape58S0200000_2_I1 iDxDListenerShape58S0200000_2_I1 = (IDxDListenerShape58S0200000_2_I1) this.A00;
        ((View) iDxDListenerShape58S0200000_2_I1.A00).setEnabled(false);
        ((Runnable) iDxDListenerShape58S0200000_2_I1.A01).run();
    }
}
