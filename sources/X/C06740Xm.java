package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0Xm  reason: invalid class name and case insensitive filesystem */
public class C06740Xm implements Drawable.Callback {
    public Drawable.Callback A00;

    public void invalidateDrawable(Drawable drawable) {
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = this.A00;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j2);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.A00;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
