package com.facebook.redex;

import X.C005402i;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewTreeObserver;
import com.obwhatsapp.R;

public class IDxCListenerShape42S0300000_3_I1 implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape42S0300000_3_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void onScrollChanged() {
        C005402i r2;
        float f2;
        Resources resources;
        int i2 = this.A03;
        Object obj = this.A00;
        if (i2 != 0) {
            Context context = (Context) obj;
            r2 = (C005402i) this.A02;
            if (((View) this.A01).canScrollVertically(-1)) {
                resources = context.getResources();
            }
            f2 = 0.0f;
            r2.A08(f2);
        }
        r2 = (C005402i) this.A01;
        Context context2 = (Context) this.A02;
        if (((View) obj).canScrollVertically(-1)) {
            resources = context2.getResources();
        }
        f2 = 0.0f;
        r2.A08(f2);
        f2 = resources.getDimension(R.dimen.dimen005d);
        r2.A08(f2);
    }
}
