package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3N6  reason: invalid class name */
public class AnonymousClass3N6 extends ViewOutlineProvider {
    public final /* synthetic */ C31201dg A00;

    public AnonymousClass3N6(C31201dg r1) {
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        Drawable background = view.getBackground();
        if (background != null) {
            background.getOutline(outline);
            outline.setAlpha(this.A00.A08(65, 1.0f));
        }
    }
}
