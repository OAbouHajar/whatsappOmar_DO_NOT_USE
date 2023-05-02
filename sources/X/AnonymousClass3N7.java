package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3N7  reason: invalid class name */
public class AnonymousClass3N7 extends ViewOutlineProvider {
    public final /* synthetic */ C31201dg A00;

    public AnonymousClass3N7(C31201dg r1) {
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        float f2;
        Drawable background = view.getBackground();
        if (background != null) {
            background.getOutline(outline);
            f2 = this.A00.A08(65, 1.0f);
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            f2 = 0.0f;
        }
        outline.setAlpha(f2);
    }
}
