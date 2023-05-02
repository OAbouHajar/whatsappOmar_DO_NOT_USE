package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4l5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94544l5 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ColorDrawable A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ Toolbar A03;

    public /* synthetic */ C94544l5(ColorDrawable colorDrawable, View view, Toolbar toolbar, int i2) {
        this.A02 = view;
        this.A00 = i2;
        this.A01 = colorDrawable;
        this.A03 = toolbar;
    }

    public final void onScrollChanged() {
        View view = this.A02;
        int i2 = this.A00;
        ColorDrawable colorDrawable = this.A01;
        Toolbar toolbar = this.A03;
        int scrollY = view.getScrollY();
        if (scrollY < 0) {
            scrollY = 0;
        }
        if (scrollY <= i2 || colorDrawable.getAlpha() != 255) {
            float f2 = 1.0f;
            if (scrollY < i2) {
                f2 = ((float) scrollY) / ((float) i2);
            }
            colorDrawable.setAlpha((int) (f2 * 255.0f));
            toolbar.invalidate();
        }
    }
}
