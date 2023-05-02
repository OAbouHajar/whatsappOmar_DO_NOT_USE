package com.facebook.redex;

import X.AnonymousClass07D;
import X.AnonymousClass0Ri;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.picker.searchexpressions.gifs.GifTabContainerLayout;

public class IDxIDecorationShape5S0101000_2_I1 extends AnonymousClass07D {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxIDecorationShape5S0101000_2_I1(GifTabContainerLayout gifTabContainerLayout) {
        this.A02 = 2;
        this.A01 = gifTabContainerLayout;
        this.A00 = gifTabContainerLayout.getResources().getDimensionPixelSize(R.dimen.dimen06e2);
    }

    public IDxIDecorationShape5S0101000_2_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r6, RecyclerView recyclerView) {
        int i2 = this.A02;
        int i3 = this.A00;
        switch (i2) {
            case 0:
                rect.set(0, i3, 0, i3);
                return;
            case 1:
                rect.set(0, i3, i3, i3);
                return;
            default:
                rect.set(0, i3, i3, 0);
                return;
        }
    }
}
