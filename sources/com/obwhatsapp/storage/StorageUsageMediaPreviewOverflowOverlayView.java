package com.obwhatsapp.storage;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;

public class StorageUsageMediaPreviewOverflowOverlayView extends View implements AnonymousClass006 {
    public Drawable A00;
    public C52662eE A01;
    public boolean A02;

    public StorageUsageMediaPreviewOverflowOverlayView(Context context) {
        this(context, (AttributeSet) null);
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        setBackgroundColor(AnonymousClass00T.A00(context, R.color.color009f));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.A00.draw(canvas);
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A00 = drawable;
        invalidate();
    }
}
