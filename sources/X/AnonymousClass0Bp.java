package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0Bp  reason: invalid class name */
public class AnonymousClass0Bp extends ViewGroup.MarginLayoutParams {
    public C005602k A00;
    public boolean A01 = true;
    public boolean A02 = false;
    public final Rect A03 = AnonymousClass000.A0J();

    public AnonymousClass0Bp(int i2, int i3) {
        super(i2, i3);
    }

    public AnonymousClass0Bp(AnonymousClass0Bp r2) {
        super(r2);
    }

    public AnonymousClass0Bp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnonymousClass0Bp(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AnonymousClass0Bp(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public static Rect A00(View view) {
        return ((AnonymousClass0Bp) view.getLayoutParams()).A03;
    }

    public int A01() {
        C005602k r2 = this.A00;
        int i2 = r2.A06;
        return i2 == -1 ? r2.A05 : i2;
    }
}
