package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3NF  reason: invalid class name */
public class AnonymousClass3NF extends ViewOutlineProvider {
    public int A00;
    public boolean A01;

    public void A00(int i2) {
        this.A00 = i2;
    }

    public void A01(boolean z2) {
        this.A01 = z2;
    }

    public void getOutline(View view, Outline outline) {
        Outline outline2 = outline;
        if (this.A01) {
            outline2.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.A00);
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }
}
