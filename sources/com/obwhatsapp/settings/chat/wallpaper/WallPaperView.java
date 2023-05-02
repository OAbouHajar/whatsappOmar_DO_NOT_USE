package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass1ZK;
import X.C006002o;
import X.C1034851o;
import X.C108155Mw;
import X.C13680ns;
import X.C13690nt;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class WallPaperView extends C006002o implements AnonymousClass006 {
    public Rect A00;
    public C108155Mw A01;
    public C52662eE A02;
    public boolean A03;
    public boolean A04;

    public WallPaperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public WallPaperView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
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
        C108155Mw r0;
        AnonymousClass1ZK r02;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.A00;
        boolean z2 = true;
        if (rect == null) {
            if (!isInEditMode()) {
                StringBuilder A0r = AnonymousClass000.A0r("redraw:");
                C13690nt.A1N(" | ", A0r, measuredWidth, measuredHeight);
                C13680ns.A1V(A0r);
            }
            this.A00 = new Rect(0, 0, measuredWidth, measuredHeight);
        } else if (rect.width() == measuredWidth && this.A00.height() == measuredHeight) {
            z2 = false;
        } else {
            this.A00.set(0, 0, measuredWidth, measuredHeight);
            if (!isInEditMode()) {
                StringBuilder A0r2 = AnonymousClass000.A0r("redraw changed:");
                C13690nt.A1N(" | ", A0r2, measuredWidth, measuredHeight);
                C13680ns.A1V(A0r2);
            }
        }
        super.onDraw(canvas);
        if ((z2 || this.A04) && measuredHeight > 0 && measuredWidth > 0 && (r0 = this.A01) != null && (r02 = ((C1034851o) r0).A00.A4F) != null) {
            r02.A0O(false);
        }
    }

    public void setDrawable(Drawable drawable) {
        this.A04 = true;
        setImageDrawable(drawable);
        invalidate();
    }

    public boolean setFrame(int i2, int i3, int i4, int i5) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float max = Math.max(((float) (i4 - i2)) / ((float) drawable.getIntrinsicWidth()), ((float) (i5 - i3)) / ((float) drawable.getIntrinsicHeight()));
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i2, i3, i4, i5);
    }

    public void setOnSizeChangedListener(C108155Mw r1) {
        this.A01 = r1;
    }
}
