package com.obwhatsapp.wabloks.commerce.ui.view;

import X.AnonymousClass00T;
import X.AnonymousClass5wM;
import X.C004601z;
import X.C006602z;
import X.C13680ns;
import X.C13700nu;
import X.C18450wi;
import X.C32291fz;
import X.C34341k6;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape20S0100000_I1_5;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsNavBarViewModel;
import java.util.Map;

public final class WaBkExtensionsScreenFragment extends Hilt_WaBkExtensionsScreenFragment {
    public FrameLayout A00;
    public FrameLayout A01;
    public ProgressBar A02;
    public C32291fz A03;
    public WaTextView A04;
    public WaExtensionsNavBarViewModel A05;
    public AnonymousClass5wM A06;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout060d, viewGroup, false);
        this.A03 = C32291fz.A01(inflate, "", 0);
        return inflate;
    }

    public void A13() {
        super.A13();
        ((WaBkExtensionsLayoutViewModel) this.A05).A07.A04(A0H());
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A05 = (WaExtensionsNavBarViewModel) new C006602z(A0D()).A01(WaExtensionsNavBarViewModel.class);
    }

    public void A18(Bundle bundle, View view) {
        ViewGroup.LayoutParams layoutParams;
        C18450wi.A0H(view, 0);
        this.A02 = (ProgressBar) C004601z.A0E(view, R.id.bloks_dialogfragment_progressbar);
        this.A00 = C13700nu.A08(view, R.id.bloks_dialogfragment);
        this.A01 = C13700nu.A08(view, R.id.extensions_container);
        this.A04 = C13680ns.A0S(view, R.id.extensions_error_text);
        C13700nu.A0P(this.A00);
        ProgressBar progressBar = this.A02;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        Drawable A042 = AnonymousClass00T.A04(A02(), R.drawable.bloks_progress_indeterminate);
        ProgressBar progressBar2 = this.A02;
        if (progressBar2 == null) {
            layoutParams = null;
        } else {
            layoutParams = progressBar2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = A0D().getWindowManager().getDefaultDisplay().getHeight() >> 1;
            }
        }
        ProgressBar progressBar3 = this.A02;
        if (progressBar3 != null) {
            progressBar3.setLayoutParams(layoutParams);
        }
        ProgressBar progressBar4 = this.A02;
        if (progressBar4 != null) {
            progressBar4.setIndeterminateDrawable(A042);
        }
        C13680ns.A1N(A0H(), ((WaBkExtensionsLayoutViewModel) this.A05).A07, this, 140);
        C13680ns.A1N(A0H(), ((WaBkExtensionsLayoutViewModel) this.A05).A08, this, 141);
        C13680ns.A1N(A0H(), ((WaBkExtensionsLayoutViewModel) this.A05).A05, this, 143);
        C13680ns.A1N(A0H(), ((WaBkExtensionsLayoutViewModel) this.A05).A06, this, 142);
        super.A18(bundle, view);
    }

    public void A1B() {
        C13700nu.A0P(this.A02);
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (this.A05 != null) {
            String string = A04().getString("qpl_params");
            AnonymousClass5wM r2 = this.A06;
            if (r2 != null) {
                r2.A01((Map) null, string, "openScreen");
                return;
            }
            throw C18450wi.A03("bloksQplHelper");
        }
    }

    public final void A1I(String str) {
        C34341k6 r1;
        TextView A0M;
        C32291fz r0 = this.A03;
        if (!(r0 == null || (r1 = r0.A05) == null || (A0M = C13680ns.A0M(r1, R.id.snackbar_text)) == null)) {
            A0M.setText(str);
        }
        C32291fz r3 = this.A03;
        if (r3 != null) {
            r3.A08(new ViewOnClickCListenerShape20S0100000_I1_5((Object) this, 48), R.string.str0e87);
        }
        C32291fz r02 = this.A03;
        if (r02 != null) {
            r02.A03();
        }
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A05;
        if (waExtensionsNavBarViewModel == null) {
            throw C18450wi.A03("waExtensionsNavBarViewModel");
        }
        C13700nu.A0V(waExtensionsNavBarViewModel.A03, false);
        C13700nu.A0P(this.A02);
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public final void A1J(String str) {
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            waTextView.setVisibility(0);
            waTextView.setText(str);
        }
        C13700nu.A0P(this.A01);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A05;
        if (waExtensionsNavBarViewModel != null) {
            waExtensionsNavBarViewModel.A03.A0B(false);
            WaExtensionsNavBarViewModel waExtensionsNavBarViewModel2 = this.A05;
            if (waExtensionsNavBarViewModel2 != null) {
                waExtensionsNavBarViewModel2.A02.A0B(false);
                C13700nu.A0P(this.A02);
                FrameLayout frameLayout = this.A00;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    return;
                }
                return;
            }
        }
        throw C18450wi.A03("waExtensionsNavBarViewModel");
    }
}
