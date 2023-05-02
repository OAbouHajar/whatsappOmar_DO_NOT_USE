package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: X.2WL  reason: invalid class name */
public class AnonymousClass2WL extends ImageButton {
    public int A00 = getVisibility();

    public AnonymousClass2WL(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void A00(int i2, boolean z2) {
        super.setVisibility(i2);
        if (z2) {
            this.A00 = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.A00;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.A00 = i2;
    }
}
