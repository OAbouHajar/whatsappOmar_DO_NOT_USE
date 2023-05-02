package com.facebook.redex;

import X.AnonymousClass00T;
import X.AnonymousClass2NR;
import X.C004601z;
import android.content.Context;
import android.view.View;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;

public class IDxIListenerShape257S0100000_2_I1 implements AnonymousClass2NR {
    public Object A00;
    public final int A01;

    public IDxIListenerShape257S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ASD(View view) {
        CircularProgressBar circularProgressBar;
        int A002;
        switch (this.A01) {
            case 0:
                C004601z.A0E(view, R.id.action_view_business).setOnClickListener(new ViewOnClickCListenerShape5S0100000_I1_1(this.A00, 6));
                return;
            case 1:
                Context context = (Context) this.A00;
                circularProgressBar = (CircularProgressBar) view;
                circularProgressBar.setMax(100);
                circularProgressBar.A0C = AnonymousClass00T.A00(context, R.color.color0541);
                A002 = AnonymousClass00T.A00(context, R.color.color014b);
                break;
            case 2:
                CircularProgressBar circularProgressBar2 = (CircularProgressBar) view;
                circularProgressBar2.setMax(100);
                circularProgressBar2.A0B = 0;
                circularProgressBar2.A06 = 6.0f;
                int dimensionPixelSize = ((View) this.A00).getResources().getDimensionPixelSize(R.dimen.dimen028d);
                circularProgressBar2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                return;
            default:
                circularProgressBar = (CircularProgressBar) view;
                circularProgressBar.setMax(100);
                circularProgressBar.A0C = AnonymousClass00T.A00(((View) this.A00).getContext(), R.color.color0476);
                A002 = 0;
                break;
        }
        circularProgressBar.A0B = A002;
    }
}
