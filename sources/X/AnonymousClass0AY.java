package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: X.0AY  reason: invalid class name */
public class AnonymousClass0AY extends Drawable {
    public final ActionBarContainer A00;

    public AnonymousClass0AY(ActionBarContainer actionBarContainer) {
        this.A00 = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A07) {
            Drawable drawable = actionBarContainer.A02;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.A01;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.A03;
        if (drawable3 != null && actionBarContainer.A08) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.A00;
        Drawable drawable = actionBarContainer.A07 ? actionBarContainer.A02 : actionBarContainer.A01;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
