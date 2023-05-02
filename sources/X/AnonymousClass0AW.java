package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0AW  reason: invalid class name */
public class AnonymousClass0AW extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public AnonymousClass0AW(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable() {
        AnonymousClass07V r1 = new AnonymousClass07V();
        r1.A00 = this.A00.newDrawable();
        return r1;
    }

    public Drawable newDrawable(Resources resources) {
        AnonymousClass07V r1 = new AnonymousClass07V();
        r1.A00 = this.A00.newDrawable(resources);
        return r1;
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        AnonymousClass07V r1 = new AnonymousClass07V();
        r1.A00 = this.A00.newDrawable(resources, theme);
        return r1;
    }
}
