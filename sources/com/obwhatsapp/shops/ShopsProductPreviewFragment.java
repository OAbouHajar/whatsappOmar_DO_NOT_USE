package com.obwhatsapp.shops;

import X.AnonymousClass00B;
import X.C004601z;
import X.C006602z;
import X.C13680ns;
import X.C16490t9;
import X.C17090uW;
import X.C228319l;
import X.C25821Lg;
import X.C34331k5;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.obwhatsapp.R;

public class ShopsProductPreviewFragment extends Hilt_ShopsProductPreviewFragment {
    public FrameLayout A00;
    public ConstraintLayout A01;
    public ShimmerFrameLayout A02;
    public C17090uW A03;
    public C25821Lg A04;
    public C16490t9 A05;
    public ShopsProductPreviewFragmentViewModel A06;
    public C228319l A07;
    public Runnable A08;
    public String A09;
    public final Handler A0A = new Handler();

    public static ShopsProductPreviewFragment A01(String str) {
        ShopsProductPreviewFragment shopsProductPreviewFragment = new ShopsProductPreviewFragment();
        Bundle A042 = shopsProductPreviewFragment.A04();
        A042.putString("screen_name", "com.bloks.www.minishops.whatsapp.products_preview_h_scroll");
        A042.putString("shopUrl", str);
        return shopsProductPreviewFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout02a4);
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        String string = A04().getString("shopUrl");
        AnonymousClass00B.A06(string);
        this.A09 = string;
        this.A06 = (ShopsProductPreviewFragmentViewModel) new C006602z(this).A01(ShopsProductPreviewFragmentViewModel.class);
    }

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        A06();
        this.A02 = (ShimmerFrameLayout) C004601z.A0E(view, R.id.shimmer_container);
        this.A01 = (ConstraintLayout) C004601z.A0E(view, R.id.placeholder_container);
        C34331k5.A02(C004601z.A0E(view, R.id.see_all), this, 2);
        this.A00 = (FrameLayout) view.findViewById(R.id.bloks_dialogfragment);
        RunnableRunnableShape20S0100000_I1_3 runnableRunnableShape20S0100000_I1_3 = new RunnableRunnableShape20S0100000_I1_3(this, 1);
        this.A08 = runnableRunnableShape20S0100000_I1_3;
        this.A0A.postDelayed(runnableRunnableShape20S0100000_I1_3, 200);
    }

    public int A19() {
        return R.id.bk_container;
    }

    public void A1B() {
        Runnable runnable = this.A08;
        if (runnable != null) {
            this.A0A.removeCallbacks(runnable);
        }
        this.A02.A02();
        this.A02.setVisibility(8);
    }
}
