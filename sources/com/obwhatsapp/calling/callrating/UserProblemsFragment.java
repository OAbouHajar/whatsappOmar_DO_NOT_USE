package com.obwhatsapp.calling.callrating;

import X.AnonymousClass02C;
import X.AnonymousClass1J9;
import X.AnonymousClass3PS;
import X.AnonymousClass42C;
import X.C004601z;
import X.C106255Dd;
import X.C13680ns;
import X.C15220qW;
import X.C18450wi;
import X.C32521gW;
import X.C87054Ve;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.base.WaFragment;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.ArrayList;
import java.util.Iterator;

public final class UserProblemsFragment extends WaFragment {
    public int A00 = -1;
    public ViewPager A01;
    public final C15220qW A02 = C32521gW.A00(new C106255Dd(this));

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.layout00d6, viewGroup, false);
    }

    public void A13() {
        super.A13();
        this.A01 = null;
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        C15220qW r6 = this.A02;
        C13680ns.A1O(((CallRatingViewModel) r6.getValue()).A09, AnonymousClass42C.A02.titleRes);
        ViewPager viewPager = (ViewPager) C004601z.A0E(view, R.id.user_problems_view_pager);
        viewPager.getLayoutParams().height = (int) (((double) A03().getDisplayMetrics().heightPixels) * 0.5d);
        AnonymousClass02C A0F = A0F();
        ArrayList arrayList = ((CallRatingViewModel) r6.getValue()).A0D;
        ArrayList A0N = AnonymousClass1J9.A0N(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String string = view.getContext().getString(((C87054Ve) it.next()).A00.titleResId);
            C18450wi.A0B(string);
            A0N.add(string);
        }
        viewPager.setAdapter(new AnonymousClass3PS(A0F, A0N));
        this.A01 = viewPager;
        ((TabLayout) C004601z.A0E(view, R.id.tab_layout)).setupWithViewPager(this.A01);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18450wi.A0H(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A00 != configuration.orientation) {
            ViewPager viewPager = this.A01;
            if (viewPager != null) {
                viewPager.getLayoutParams().height = (int) (((double) A03().getDisplayMetrics().heightPixels) * 0.5d);
                viewPager.requestLayout();
            }
            this.A00 = configuration.orientation;
        }
    }
}
