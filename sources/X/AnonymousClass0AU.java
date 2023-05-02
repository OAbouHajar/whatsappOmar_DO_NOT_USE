package X;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: X.0AU  reason: invalid class name */
public class AnonymousClass0AU extends Drawable.ConstantState {
    public AnimatorSet A00;
    public AnonymousClass00N A01;
    public AnonymousClass07V A02;
    public ArrayList A03;

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        throw AnonymousClass000.A0V("No constant state support for SDK < 24.");
    }

    public Drawable newDrawable(Resources resources) {
        throw AnonymousClass000.A0V("No constant state support for SDK < 24.");
    }
}
