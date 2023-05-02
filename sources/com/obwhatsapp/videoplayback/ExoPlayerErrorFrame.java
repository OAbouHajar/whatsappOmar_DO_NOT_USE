package com.obwhatsapp.videoplayback;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;

public final class ExoPlayerErrorFrame extends FrameLayout implements AnonymousClass006 {
    public View.OnClickListener A00;
    public View A01;
    public FrameLayout A02;
    public TextView A03;
    public C52662eE A04;
    public boolean A05;
    public final FrameLayout A06;
    public final CircularProgressBar A07;

    public ExoPlayerErrorFrame(Context context) {
        this(context, (AttributeSet) null);
    }

    public ExoPlayerErrorFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExoPlayerErrorFrame(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.layout0605, this);
        this.A07 = (CircularProgressBar) findViewById(R.id.loading);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public int getErrorScreenVisibility() {
        FrameLayout frameLayout = this.A02;
        if (frameLayout != null) {
            return frameLayout.getVisibility();
        }
        return 8;
    }

    public void setLoadingViewVisibility(int i2) {
        this.A07.setVisibility(i2);
    }

    public void setOnRetryListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }
}
