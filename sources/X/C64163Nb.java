package X;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.3Nb  reason: invalid class name and case insensitive filesystem */
public class C64163Nb extends TranslateAnimation {
    public final /* synthetic */ AnonymousClass29S A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64163Nb(AnonymousClass29S r10) {
        super(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.A00 = r10;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        super.applyTransformation(f2, transformation);
        AnonymousClass29S r2 = this.A00;
        r2.A0H((int) (((float) r2.A0J.getHeight()) * (1.0f - f2)));
    }
}
