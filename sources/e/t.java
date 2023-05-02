package e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;
import com.squareup.picasso.Target;

/* compiled from: XFMFile */
public final class t extends b {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f1720m = 0;

    public t(Picasso picasso, Request request, int i2, int i3, Object obj, String str) {
        super(picasso, (Object) null, request, i2, i3, 0, (Drawable) null, str, obj, false);
    }

    public t(Picasso picasso, Target target, Request request, int i2, int i3, Drawable drawable, String str, Object obj, int i4) {
        super(picasso, target, request, i2, i3, i4, drawable, str, obj, false);
    }

    public final void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        switch (this.f1720m) {
            case 0:
                return;
            default:
                if (bitmap != null) {
                    Target target = (Target) d();
                    if (target != null) {
                        target.onBitmapLoaded(bitmap, loadedFrom);
                        if (bitmap.isRecycled()) {
                            throw new IllegalStateException("Target callback must not recycle bitmap!");
                        }
                        return;
                    }
                    return;
                }
                throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
        }
    }

    public final void c(Exception exc) {
        switch (this.f1720m) {
            case 0:
                return;
            default:
                Target target = (Target) d();
                if (target != null) {
                    int i2 = this.f1611g;
                    target.onBitmapFailed(exc, i2 != 0 ? this.f1605a.f1540e.getResources().getDrawable(i2) : this.f1612h);
                    return;
                }
                return;
        }
    }
}
