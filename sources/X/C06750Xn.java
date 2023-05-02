package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0Xn  reason: invalid class name and case insensitive filesystem */
public class C06750Xn implements Drawable.Callback {
    public final /* synthetic */ C016907z A00;

    public C06750Xn(C016907z r1) {
        this.A00 = r1;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.A00.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        this.A00.scheduleSelf(runnable, j2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.A00.unscheduleSelf(runnable);
    }
}
