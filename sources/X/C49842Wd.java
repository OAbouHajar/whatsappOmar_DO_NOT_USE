package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.2Wd  reason: invalid class name and case insensitive filesystem */
public abstract class C49842Wd extends ViewGroup {
    public boolean A00 = true;

    public C49842Wd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract void A02(AnonymousClass4LN r1);

    public abstract void A03(AnonymousClass4LN r1, int i2);

    public abstract void A04(AnonymousClass4LN r1, int i2, int i3);

    public boolean getClipChildren() {
        return Build.VERSION.SDK_INT < 18 ? this.A00 : super.getClipChildren();
    }

    public abstract String getDescriptionOfMountedItems();

    public abstract int getMountItemCount();

    public void setClipChildren(boolean z2) {
        if (Build.VERSION.SDK_INT < 18) {
            this.A00 = z2;
        }
        super.setClipChildren(z2);
    }
}
