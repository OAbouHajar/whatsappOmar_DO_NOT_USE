package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.0Fo  reason: invalid class name */
public class AnonymousClass0Fo extends C05490Rq {
    public int A00 = 0;
    public int A01 = 0;
    public PointF A02;
    public final float A03;
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public final LinearInterpolator A05 = new LinearInterpolator();

    public AnonymousClass0Fo(Context context) {
        this.A03 = A04(AnonymousClass000.A0M(context));
    }

    public void A03(View view, C05260Px r14, AnonymousClass0Ri r15) {
        int i2;
        int i3;
        int A052 = A05();
        AnonymousClass02W r2 = this.A02;
        if (r2 == null || !r2.A13()) {
            i2 = 0;
        } else {
            ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(view);
            i2 = A08((view.getLeft() - AnonymousClass0Bp.A00(view).left) - A0O.leftMargin, view.getRight() + AnonymousClass0Bp.A00(view).right + A0O.rightMargin, r2.A08(), r2.A03 - r2.A09(), A052);
        }
        int A06 = A06();
        AnonymousClass02W r3 = this.A02;
        if (r3 == null || !r3.A14()) {
            i3 = 0;
        } else {
            ViewGroup.MarginLayoutParams A0O2 = AnonymousClass000.A0O(view);
            i3 = A08((view.getTop() - AnonymousClass0Bp.A00(view).top) - A0O2.topMargin, view.getBottom() + AnonymousClass0Bp.A00(view).bottom + A0O2.bottomMargin, r3.A0A(), r3.A00 - r3.A07(), A06);
        }
        int ceil = (int) Math.ceil(((double) A07((int) Math.sqrt((double) ((i2 * i2) + (i3 * i3))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.A04;
            r14.A02 = -i2;
            r14.A03 = -i3;
            r14.A01 = ceil;
            r14.A05 = decelerateInterpolator;
            r14.A06 = true;
        }
    }

    public float A04(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int A05() {
        PointF pointF = this.A02;
        if (pointF == null) {
            return 0;
        }
        float f2 = pointF.x;
        if (f2 != 0.0f) {
            return f2 > 0.0f ? 1 : -1;
        }
        return 0;
    }

    public int A06() {
        PointF pointF = this.A02;
        if (pointF == null) {
            return 0;
        }
        float f2 = pointF.y;
        if (f2 != 0.0f) {
            return f2 > 0.0f ? 1 : -1;
        }
        return 0;
    }

    public int A07(int i2) {
        return (int) Math.ceil((double) (((float) Math.abs(i2)) * this.A03));
    }

    public int A08(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 >= 0) {
                return 0;
            }
            return i8;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw AnonymousClass000.A0T("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }
}
