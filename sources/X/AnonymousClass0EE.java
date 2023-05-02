package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: X.0EE  reason: invalid class name */
public class AnonymousClass0EE extends C02170Ac {
    public AnonymousClass0EE(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    public void A01(int i2, int i3, int i4, Rect rect, Rect rect2) {
        Gravity.apply(i2, i3, i4, rect, rect2, 0);
    }

    public void getOutline(Outline outline) {
        A00();
        outline.setRoundRect(this.A0B, this.A00);
    }
}
