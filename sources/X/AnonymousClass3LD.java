package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;

/* renamed from: X.3LD  reason: invalid class name */
public class AnonymousClass3LD extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public final Drawable A02;
    public final Drawable A03;

    public AnonymousClass3LD(Context context) {
        Drawable A04 = AnonymousClass00T.A04(context, R.drawable.carousel_scrollbar_track);
        AnonymousClass00B.A06(A04);
        this.A03 = A04;
        A04.setCallback(this);
        Drawable A042 = AnonymousClass00T.A04(context, R.drawable.carousel_scrollbar_thumb);
        AnonymousClass00B.A06(A042);
        this.A02 = A042;
        A042.setCallback(this);
    }

    public final void A00() {
        Rect bounds = getBounds();
        this.A03.setBounds(bounds);
        Drawable drawable = this.A02;
        int i2 = bounds.left + this.A01;
        drawable.setBounds(i2, bounds.top, i2 + this.A00, bounds.bottom);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.A03.draw(canvas);
        this.A02.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        A00();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.A03.setAlpha(i2);
        this.A02.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
