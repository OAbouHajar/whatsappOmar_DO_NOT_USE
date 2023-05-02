package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3N9  reason: invalid class name */
public class AnonymousClass3N9 extends ViewOutlineProvider {
    public final /* synthetic */ float A00;

    public AnonymousClass3N9(float f2) {
        this.A00 = f2;
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
