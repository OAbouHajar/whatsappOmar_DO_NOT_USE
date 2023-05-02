package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0AV  reason: invalid class name */
public class AnonymousClass0AV extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public AnonymousClass0AV(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable() {
        C016907z r2 = new C016907z();
        Drawable newDrawable = this.A00.newDrawable();
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A06);
        return r2;
    }

    public Drawable newDrawable(Resources resources) {
        C016907z r2 = new C016907z();
        Drawable newDrawable = this.A00.newDrawable(resources);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A06);
        return r2;
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C016907z r2 = new C016907z();
        Drawable newDrawable = this.A00.newDrawable(resources, theme);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A06);
        return r2;
    }
}
