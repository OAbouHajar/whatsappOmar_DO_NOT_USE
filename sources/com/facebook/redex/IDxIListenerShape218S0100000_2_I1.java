package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass030;
import X.AnonymousClass08I;
import X.AnonymousClass3RK;
import X.C016507v;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.obwhatsapp.CatalogImageListActivity;
import com.obwhatsapp.R;

public class IDxIListenerShape218S0100000_2_I1 implements C016507v {
    public Object A00;
    public final int A01;

    public IDxIListenerShape218S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public AnonymousClass030 AMY(View view, AnonymousClass030 r10) {
        switch (this.A01) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) this.A00;
                AnonymousClass030 r1 = null;
                if (appBarLayout.getFitsSystemWindows()) {
                    r1 = r10;
                }
                if (!AnonymousClass08I.A01(appBarLayout.A04, r1)) {
                    appBarLayout.A04 = r1;
                    appBarLayout.A03 = -1;
                    appBarLayout.A00 = -1;
                    appBarLayout.A01 = -1;
                    return r10;
                }
                break;
            case 1:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.A00;
                AnonymousClass030 r12 = null;
                if (collapsingToolbarLayout.getFitsSystemWindows()) {
                    r12 = r10;
                }
                if (!AnonymousClass08I.A01(collapsingToolbarLayout.A0F, r12)) {
                    collapsingToolbarLayout.A0F = r12;
                    collapsingToolbarLayout.requestLayout();
                }
                return r10.A00.A07();
            case 2:
                CatalogImageListActivity catalogImageListActivity = (CatalogImageListActivity) this.A00;
                catalogImageListActivity.A01 = r10.A06() + catalogImageListActivity.getResources().getDimensionPixelSize(R.dimen.dimen005e);
                int A03 = r10.A03();
                AnonymousClass3RK r0 = catalogImageListActivity.A04;
                int i2 = catalogImageListActivity.A01;
                r0.A01 = i2;
                r0.A00 = A03;
                int i3 = catalogImageListActivity.A00;
                if (i3 > 0) {
                    catalogImageListActivity.A02.A1Q(i3, i2);
                    return r10;
                }
                break;
            default:
                AnonymousClass01A r7 = (AnonymousClass01A) this.A00;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                int i4 = r10.A00.A0B(7).A00;
                int i5 = layoutParams.leftMargin;
                int identifier = r7.A03().getIdentifier("status_bar_height", "dimen", "android");
                layoutParams.setMargins(i5, identifier > 0 ? r7.A03().getDimensionPixelSize(identifier) : 25, layoutParams.rightMargin, i4);
                view.setLayoutParams(layoutParams);
                break;
        }
        return r10;
    }
}
