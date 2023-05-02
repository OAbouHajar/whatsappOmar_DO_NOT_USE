package com.whatsapp.stickers;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public class BottomFadeRecyclerView extends RecyclerView implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public BottomFadeRecyclerView(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }
}
