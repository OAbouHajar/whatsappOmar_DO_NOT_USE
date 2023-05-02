package X;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* renamed from: X.4l2  reason: invalid class name and case insensitive filesystem */
public class C94514l2 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ C30011bb A02;

    public C94514l2(ImageView imageView, C30011bb r2, int i2) {
        this.A02 = r2;
        this.A01 = imageView;
        this.A00 = i2;
    }

    public boolean onPreDraw() {
        ImageView imageView = this.A01;
        AnonymousClass3K2.A10(imageView, this);
        C30011bb r2 = this.A02;
        Drawable keepAnimDrawable = this.A00 != 0 ? r2.getKeepAnimDrawable() : r2.getPopupDrawable();
        AnonymousClass1YG r0 = r2.A0b;
        if (r0 == null || keepAnimDrawable == null) {
            return true;
        }
        r0.A4o(keepAnimDrawable, imageView);
        return true;
    }
}
