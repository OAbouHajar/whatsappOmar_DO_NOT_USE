package com.obwhatsapp.webpagepreview;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.C13680ns;
import X.C13690nt;
import X.C16150sX;
import X.C26671Or;
import X.C447725m;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

public class WebPagePreviewCornerShadowView extends FrameLayout implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C26671Or A01;
    public C52662eE A02;
    public boolean A03;

    public WebPagePreviewCornerShadowView(Context context) {
        super(context);
        A00();
        setWillNotDraw(false);
    }

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        setWillNotDraw(false);
    }

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        setWillNotDraw(false);
    }

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A00 = C16150sX.A0Z(A002);
            this.A01 = (C26671Or) A002.A7T.get();
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

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int paddingLeft = getPaddingLeft();
            int A04 = C13690nt.A04(this);
            int height = getHeight() - getPaddingBottom();
            Context context = getContext();
            AnonymousClass00B.A06(context);
            C26671Or r5 = this.A01;
            Drawable drawable = r5.A00;
            if (drawable == null) {
                drawable = new C447725m(context.getResources().getDrawable(R.drawable.corner_overlay), r5.A02);
                r5.A00 = drawable;
            }
            if (C13680ns.A1Z(this.A00)) {
                drawable.setBounds(A04 - drawable.getIntrinsicWidth(), height - drawable.getIntrinsicHeight(), A04, height);
            } else {
                drawable.setBounds(paddingLeft, height - drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth() + paddingLeft, height);
            }
            drawable.draw(canvas);
        }
    }

    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
    }
}
