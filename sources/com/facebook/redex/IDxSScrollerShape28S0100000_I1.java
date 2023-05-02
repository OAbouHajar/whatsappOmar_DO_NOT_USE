package com.facebook.redex;

import X.AnonymousClass0Fo;
import X.AnonymousClass0Ri;
import X.C02840Fl;
import X.C05260Px;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class IDxSScrollerShape28S0100000_I1 extends AnonymousClass0Fo {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSScrollerShape28S0100000_I1(Context context, Object obj, int i2) {
        super(context);
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A03(View view, C05260Px r8, AnonymousClass0Ri r9) {
        int i2 = this.A01;
        C02840Fl r1 = (C02840Fl) this.A00;
        RecyclerView recyclerView = r1.A01;
        if (i2 == 0 || recyclerView != null) {
            int[] A05 = r1.A05(view, recyclerView.getLayoutManager());
            int i3 = A05[0];
            int i4 = A05[1];
            int ceil = (int) Math.ceil(((double) A07(Math.max(Math.abs(i3), Math.abs(i4)))) / 0.3356d);
            if (ceil > 0) {
                DecelerateInterpolator decelerateInterpolator = this.A04;
                r8.A02 = i3;
                r8.A03 = i4;
                r8.A01 = ceil;
                r8.A05 = decelerateInterpolator;
                r8.A06 = true;
            }
        }
    }

    public float A04(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public int A07(int i2) {
        return this.A01 != 0 ? super.A07(i2) : Math.min(100, super.A07(i2));
    }
}
