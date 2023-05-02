package X;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.3Na  reason: invalid class name and case insensitive filesystem */
public class C64153Na extends TranslateAnimation {
    public final /* synthetic */ AnonymousClass4RF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64153Na(AnonymousClass4RF r10) {
        super(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.A00 = r10;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        super.applyTransformation(f2, transformation);
        AnonymousClass4RF r2 = this.A00;
        r2.A00(((float) r2.A01.getHeight()) * (1.0f - f2));
    }
}
