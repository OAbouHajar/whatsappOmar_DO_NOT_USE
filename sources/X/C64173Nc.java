package X;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.3Nc  reason: invalid class name and case insensitive filesystem */
public class C64173Nc extends TranslateAnimation {
    public final /* synthetic */ AnonymousClass29S A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64173Nc(AnonymousClass29S r10) {
        super(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.A00 = r10;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        super.applyTransformation(f2, transformation);
        AnonymousClass29S r1 = this.A00;
        r1.A0H((int) (((float) r1.A0J.getHeight()) * f2));
    }
}
