package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NM  reason: invalid class name */
public class AnonymousClass3NM extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass3LF A02;

    public AnonymousClass3NM(AnonymousClass3LF r1, int i2, int i3) {
        this.A02 = r1;
        this.A01 = i2;
        this.A00 = i3;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        if (f2 != 1.0f) {
            AnonymousClass3LF r2 = this.A02;
            r2.A00 = AnonymousClass000.A06(f2, this.A00, this.A01);
            r2.invalidateSelf();
        }
    }
}
