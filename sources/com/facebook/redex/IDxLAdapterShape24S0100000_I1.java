package com.facebook.redex;

import X.AnonymousClass06G;
import X.AnonymousClass0ZH;
import X.AnonymousClass0f9;
import X.C004601z;
import X.C009804r;
import X.C02480Cg;
import X.C07360bC;
import X.C13190lc;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarOverlayLayout;

public class IDxLAdapterShape24S0100000_I1 extends C07360bC {
    public Object A00;
    public final int A01;

    public IDxLAdapterShape24S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AMS(View view) {
        View view2;
        switch (this.A01) {
            case 0:
                AnonymousClass06G r2 = ((AnonymousClass0f9) this.A00).A00;
                r2.A0L.setAlpha(1.0f);
                r2.A0N.A0A((C13190lc) null);
                r2.A0N = null;
                return;
            case 1:
                AnonymousClass06G r22 = ((AnonymousClass0ZH) this.A00).A01;
                r22.A0L.setVisibility(8);
                PopupWindow popupWindow = r22.A09;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (r22.A0L.getParent() instanceof View) {
                    C004601z.A0T((View) r22.A0L.getParent());
                }
                r22.A0L.A03();
                r22.A0N.A0A((C13190lc) null);
                r22.A0N = null;
                C004601z.A0T(r22.A07);
                return;
            case 2:
                C02480Cg r3 = (C02480Cg) this.A00;
                if (r3.A0F && (view2 = r3.A04) != null) {
                    view2.setTranslationY(0.0f);
                    r3.A09.setTranslationY(0.0f);
                }
                r3.A09.setVisibility(8);
                r3.A09.setTransitioning(false);
                r3.A08 = null;
                C009804r r1 = r3.A06;
                if (r1 != null) {
                    r1.APd(r3.A07);
                    r3.A07 = null;
                    r3.A06 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = r3.A0B;
                if (actionBarOverlayLayout != null) {
                    C004601z.A0T(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                C02480Cg r12 = (C02480Cg) this.A00;
                r12.A08 = null;
                r12.A09.requestLayout();
                return;
        }
    }

    public void AMT(View view) {
        if (this.A01 == 0) {
            ((AnonymousClass0f9) this.A00).A00.A0L.setVisibility(0);
        }
    }
}
