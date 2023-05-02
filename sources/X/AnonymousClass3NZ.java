package X;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.3NZ  reason: invalid class name */
public class AnonymousClass3NZ extends TranslateAnimation {
    public final /* synthetic */ AnonymousClass4RF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3NZ(AnonymousClass4RF r10) {
        super(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.A00 = r10;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        super.applyTransformation(f2, transformation);
        AnonymousClass4RF r1 = this.A00;
        r1.A00(((float) r1.A01.getHeight()) * f2);
    }
}
