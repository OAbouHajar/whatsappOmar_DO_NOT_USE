package com.whatsapp.stickers;

import X.AnonymousClass03Y;
import X.AnonymousClass3TD;
import X.C436020t;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.WaImageView;

public class StickerView extends WaImageView {
    public int A00;
    public AnonymousClass03Y A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass03Y A05;

    public StickerView(Context context) {
        super(context);
        A02();
        this.A05 = new AnonymousClass3TD(this);
    }

    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A05 = new AnonymousClass3TD(this);
    }

    public StickerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A05 = new AnonymousClass3TD(this);
    }

    public StickerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public void A04() {
        Drawable drawable = getDrawable();
        if (drawable instanceof C436020t) {
            C436020t r2 = (C436020t) drawable;
            r2.A03 = this.A03;
            int i2 = this.A00;
            if (!r2.A04) {
                r2.A01 = i2;
            } else if (r2.A01 < i2) {
                r2.A01 = i2;
                r2.A00 = 0;
            }
        }
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public void A05() {
        Drawable drawable = getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    public AnonymousClass03Y getAnimationCallback() {
        return this.A01;
    }

    public boolean getLoopIndefinitely() {
        return this.A03;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A04 && this.A03) {
            A04();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A05();
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (i2 != 0) {
            A05();
        } else if (this.A04 && this.A03) {
            A04();
        }
    }

    public void setAnimationCallback(AnonymousClass03Y r1) {
        this.A01 = r1;
    }

    public void setImageDrawable(Drawable drawable) {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        Drawable drawable2 = getDrawable();
        if (drawable2 != drawable && (drawable2 instanceof C436020t)) {
            C436020t r2 = (C436020t) drawable2;
            r2.A08.remove(this.A05);
            r2.stop();
        }
        super.setImageDrawable(drawable);
        if (drawable instanceof C436020t) {
            ((C436020t) drawable).A08.add(this.A05);
        }
    }

    public void setLoopIndefinitely(boolean z2) {
        this.A03 = z2;
    }

    public void setMaxLoops(int i2) {
        this.A00 = i2;
    }

    public void setUserVisibleForIndefiniteLoop(boolean z2) {
        this.A04 = z2;
    }
}
