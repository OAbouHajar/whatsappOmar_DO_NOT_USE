package e;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import java.lang.ref.WeakReference;

/* compiled from: XFMFile */
public final class m implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final RequestCreator f1693a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f1694b;

    /* renamed from: c  reason: collision with root package name */
    public Callback f1695c;

    public m(RequestCreator requestCreator, ImageView imageView, Callback callback) {
        this.f1693a = requestCreator;
        this.f1694b = new WeakReference(imageView);
        this.f1695c = callback;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            imageView.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    public final void a() {
        this.f1693a.f1597l = null;
        this.f1695c = null;
        WeakReference weakReference = this.f1694b;
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            weakReference.clear();
            imageView.removeOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public final boolean onPreDraw() {
        WeakReference weakReference = this.f1694b;
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            weakReference.clear();
            RequestCreator requestCreator = this.f1693a;
            requestCreator.f1589d = false;
            requestCreator.resize(width, height).into(imageView, this.f1695c);
        }
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
