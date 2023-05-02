package com.facebook.redex;

import X.AnonymousClass00T;
import X.AnonymousClass2NR;
import X.C16740tZ;
import X.C52092d7;
import X.C87594Xo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.obwhatsapp.R;

public class IDxIListenerShape108S0200000_2_I0 implements AnonymousClass2NR {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxIListenerShape108S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void ASD(View view) {
        if (this.A02 != 0) {
            View view2 = (View) this.A00;
            GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
            gradientDrawable.mutate();
            int A002 = C87594Xo.A00(view2.getContext(), 1.0f);
            Resources resources = view2.getResources();
            boolean z2 = ((C16740tZ) this.A01).A11.A02;
            int i2 = R.color.color0626;
            if (z2) {
                i2 = R.color.color0627;
            }
            gradientDrawable.setStroke(A002, resources.getColor(i2));
            return;
        }
        Context context = ((View) this.A00).getContext();
        boolean z3 = ((C16740tZ) this.A01).A11.A02;
        int i3 = R.color.color00c6;
        if (z3) {
            i3 = R.color.color00c8;
        }
        view.setBackground(new C52092d7(AnonymousClass00T.A00(context, i3)));
    }
}
