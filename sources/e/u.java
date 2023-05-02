package e;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;

/* compiled from: XFMFile */
public final class u extends b {

    /* renamed from: m  reason: collision with root package name */
    public Callback f1721m;

    public u(Picasso picasso, ImageView imageView, Request request, int i2, int i3, int i4, Drawable drawable, String str, Object obj, Callback callback, boolean z2) {
        super(picasso, imageView, request, i2, i3, i4, drawable, str, obj, z2);
        this.f1721m = callback;
    }

    public final void a() {
        this.f1616l = true;
        if (this.f1721m != null) {
            this.f1721m = null;
        }
    }

    public final void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f1607c.get();
            if (imageView != null) {
                Picasso picasso = this.f1605a;
                Bitmap bitmap2 = bitmap;
                Picasso.LoadedFrom loadedFrom2 = loadedFrom;
                e0.a(imageView, picasso.f1540e, bitmap2, loadedFrom2, this.f1608d, picasso.f1548m);
                Callback callback = this.f1721m;
                if (callback != null) {
                    callback.onSuccess();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public final void c(Exception exc) {
        ImageView imageView = (ImageView) this.f1607c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i2 = this.f1611g;
            if (i2 != 0) {
                imageView.setImageResource(i2);
            } else {
                Drawable drawable2 = this.f1612h;
                if (drawable2 != null) {
                    imageView.setImageDrawable(drawable2);
                }
            }
            Callback callback = this.f1721m;
            if (callback != null) {
                callback.onError(exc);
            }
        }
    }
}
