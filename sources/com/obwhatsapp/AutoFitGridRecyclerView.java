package com.obwhatsapp;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass02W;
import X.AnonymousClass3RG;
import X.C16150sX;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AutoFitGridRecyclerView extends RecyclerView implements AnonymousClass006 {
    public int A00;
    public AnonymousClass013 A01;
    public C52662eE A02;
    public boolean A03;

    public AutoFitGridRecyclerView(Context context) {
        super(context);
        A0z();
        A10(context, (AttributeSet) null);
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0z();
        A10(context, attributeSet);
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A0z();
        A10(context, attributeSet);
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A0z();
    }

    public void A0z() {
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public final void A10(Context context, AttributeSet attributeSet) {
        int i2 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A00);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
            i2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        A0m(new AnonymousClass3RG(this.A01, i2));
        setLayoutManager(new GridLayoutManager(1));
        this.A0h = true;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A00 > 0) {
            AnonymousClass02W layoutManager = getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                ((GridLayoutManager) layoutManager).A1g(Math.max(1, getMeasuredWidth() / this.A00));
            }
        }
    }
}
