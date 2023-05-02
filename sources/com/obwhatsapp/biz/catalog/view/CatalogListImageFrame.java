package com.obwhatsapp.biz.catalog.view;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

public class CatalogListImageFrame extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public final Drawable A02;
    public final Drawable A03;

    public CatalogListImageFrame(Context context) {
        this(context, (AttributeSet) null);
    }

    public CatalogListImageFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CatalogListImageFrame(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = getResources().getDrawable(R.drawable.album_card_top);
        this.A02 = getResources().getDrawable(R.drawable.album_card_bottom);
        setWillNotDraw(false);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable = this.A03;
        drawable.setBounds(0, getPaddingTop() - drawable.getIntrinsicHeight(), getWidth(), getPaddingTop());
        drawable.draw(canvas);
        Drawable drawable2 = this.A02;
        drawable2.setBounds(0, getHeight() - getPaddingBottom(), getWidth(), (getHeight() - getPaddingBottom()) + drawable2.getIntrinsicHeight());
        drawable2.draw(canvas);
        super.onDraw(canvas);
    }
}
