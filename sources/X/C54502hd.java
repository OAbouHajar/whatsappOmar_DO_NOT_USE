package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.2hd  reason: invalid class name and case insensitive filesystem */
public class C54502hd extends C54512he {
    public Bitmap A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public AnonymousClass013 A04;
    public AnonymousClass2BF A05;
    public boolean A06;

    public C54502hd(Context context) {
        super(context);
        Drawable A042 = AnonymousClass00T.A04(context, R.drawable.selector_orange_gradient);
        this.A03 = A042;
        A042.setCallback(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r5 = (X.C54482hb) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.graphics.Canvas r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C54482hb
            if (r0 == 0) goto L_0x0033
            r5 = r6
            X.2hb r5 = (X.C54482hb) r5
            android.graphics.drawable.Drawable r0 = r5.A00
            if (r0 == 0) goto L_0x0033
            int r0 = r0.getIntrinsicHeight()
            int r4 = r0 >> 2
            android.graphics.drawable.Drawable r3 = r5.A00
            int r2 = r5.getHeight()
            android.graphics.drawable.Drawable r0 = r5.A00
            int r0 = r0.getIntrinsicHeight()
            int r2 = r2 - r0
            int r2 = r2 - r4
            android.graphics.drawable.Drawable r0 = r5.A00
            int r1 = r0.getIntrinsicWidth()
            int r1 = r1 + r4
            int r0 = r5.getHeight()
            int r0 = r0 - r4
            r3.setBounds(r4, r2, r1, r0)
            android.graphics.drawable.Drawable r0 = r5.A00
            r0.draw(r7)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54502hd.A01(android.graphics.Canvas):void");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
            Drawable drawable = this.A03;
            if (drawable != null) {
                drawable.setHotspot(f2, f3);
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A03;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public AnonymousClass2BF getMediaItem() {
        return this.A05;
    }

    public Bitmap getThumbnail() {
        return this.A00;
    }

    public Uri getUri() {
        return this.A05.A9L();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        A01(canvas);
        if (this.A06) {
            if (this.A01 == null) {
                this.A01 = AnonymousClass00T.A04(getContext(), R.drawable.photo_check);
            }
            canvas.drawColor(1073741824);
            int width = (getWidth() - this.A01.getIntrinsicWidth()) >> 1;
            int height = (getHeight() - this.A01.getIntrinsicHeight()) >> 1;
            Drawable drawable = this.A01;
            drawable.setBounds(width, height, drawable.getIntrinsicWidth() + width, this.A01.getIntrinsicHeight() + height);
            this.A01.draw(canvas);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
            this.A02.draw(canvas);
        }
    }

    public void onMeasure(int i2, int i3) {
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i2);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setChecked(boolean z2) {
        if (this.A06 != z2) {
            this.A06 = z2;
            setSelected(z2);
            invalidate();
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A02 = drawable;
        invalidate();
    }

    public void setMediaItem(AnonymousClass2BF r3) {
        int i2;
        this.A05 = r3;
        if (r3 != null) {
            int type = r3.getType();
            if (type == 0) {
                i2 = R.string.str05e0;
            } else if (type == 1) {
                i2 = R.string.str05e9;
            } else if (type == 2) {
                i2 = R.string.str05dc;
            } else if (type == 3) {
                i2 = R.string.str05d5;
            } else if (type == 4) {
                i2 = R.string.str05db;
            } else {
                return;
            }
            setContentDescription(getContext().getString(i2));
        }
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A03;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A03 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
    }

    public void setThumbnail(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.A03 || super.verifyDrawable(drawable);
    }
}
