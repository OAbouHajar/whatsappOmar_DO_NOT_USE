package com.obwhatsapp.search.views.itemviews;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass4BW;
import X.C004601z;
import X.C13680ns;
import X.C16150sX;
import X.C45902Bo;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public class AudioPlayerMetadataView extends LinearLayout implements AnonymousClass006 {
    public TextView A00;
    public AnonymousClass013 A01;
    public C52662eE A02;
    public boolean A03;

    public AudioPlayerMetadataView(Context context) {
        super(context);
        A00();
        A01(context, (AttributeSet) null);
    }

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(context, attributeSet);
    }

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        ViewGroup viewGroup;
        LinearLayout.inflate(context, R.layout.layout03e2, this);
        setOrientation(0);
        setGravity(17);
        View A0E = C004601z.A0E(this, R.id.date_wrapper);
        View A0E2 = C004601z.A0E(this, R.id.status);
        this.A00 = C13680ns.A0L(this, R.id.description);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A01);
            boolean z2 = obtainStyledAttributes.getBoolean(2, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            C45902Bo.A08(A0E, this.A01, A0E.getPaddingLeft(), dimensionPixelSize2);
            C45902Bo.A07(A0E, this.A01, dimensionPixelSize, ((LinearLayout.LayoutParams) A0E.getLayoutParams()).rightMargin);
            if (!z2 && (viewGroup = (ViewGroup) A0E2.getParent()) != null) {
                viewGroup.removeView(A0E2);
            }
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDescription(String str) {
        this.A00.setText(str);
    }
}
