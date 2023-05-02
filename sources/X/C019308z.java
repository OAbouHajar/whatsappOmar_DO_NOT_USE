package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.08z  reason: invalid class name and case insensitive filesystem */
public final class C019308z extends Drawable.ConstantState {
    public int A00;
    public ColorStateList A01 = null;
    public PorterDuff.Mode A02 = C019108x.A06;
    public Drawable.ConstantState A03;

    public C019308z(C019308z r2) {
        if (r2 != null) {
            this.A00 = r2.A00;
            this.A03 = r2.A03;
            this.A01 = r2.A01;
            this.A02 = r2.A02;
        }
    }

    public int getChangingConfigurations() {
        int i2 = this.A00;
        Drawable.ConstantState constantState = this.A03;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new AnonymousClass0EF(resources, this) : new C019108x(resources, this);
    }
}
