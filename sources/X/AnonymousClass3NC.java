package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3NC  reason: invalid class name */
public class AnonymousClass3NC extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C31201dg A01;

    public AnonymousClass3NC(C31201dg r1, float f2) {
        this.A00 = f2;
        this.A01 = r1;
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.A00);
        Drawable background = view.getBackground();
        if (background != null) {
            background.getOutline(outline);
            outline.setAlpha(this.A01.A08(65, 1.0f));
        }
    }
}
