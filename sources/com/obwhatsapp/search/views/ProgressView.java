package com.obwhatsapp.search.views;

import X.AnonymousClass006;
import X.C004601z;
import X.C52662eE;
import X.C87594Xo;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;

public class ProgressView extends FrameLayout implements AnonymousClass006 {
    public AnimatorSet A00;
    public C52662eE A01;
    public boolean A02;
    public final int A03;
    public final CircularProgressBar A04;

    public ProgressView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        FrameLayout.inflate(context, R.layout.layout052e, this);
        this.A04 = (CircularProgressBar) C004601z.A0E(this, R.id.progress_bar);
        this.A03 = C87594Xo.A00(getContext(), 40.0f);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }
}
