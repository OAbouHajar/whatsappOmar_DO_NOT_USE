package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.3L8  reason: invalid class name */
public class AnonymousClass3L8 extends Drawable {
    public int A00 = 16842921;

    public void draw(Canvas canvas) {
    }

    public int getOpacity() {
        return 0;
    }

    public boolean isStateful() {
        return true;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean setState(int[] iArr) {
        int i2 = this.A00;
        this.A00 = 16842921;
        int i3 = 16842921;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            int i5 = iArr[i4];
            if (i5 == 16842919) {
                this.A00 = 16842919;
                i3 = 16842919;
                break;
            }
            if (i5 == 16842908) {
                this.A00 = 16842908;
                i3 = 16842908;
            }
            i4++;
        }
        if (i2 == i3) {
            return false;
        }
        invalidateSelf();
        return true;
    }
}
