package X;

import android.view.animation.RotateAnimation;
import android.view.animation.Transformation;

/* renamed from: X.3NY  reason: invalid class name */
public class AnonymousClass3NY extends RotateAnimation {
    public long A00;
    public boolean A01;

    public AnonymousClass3NY() {
        super(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
    }

    public boolean getTransformation(long j2, Transformation transformation) {
        if (this.A01) {
            long j3 = this.A00;
            if (j3 == 0) {
                j3 = j2 - getStartTime();
                this.A00 = j3;
            }
            setStartTime(j2 - j3);
        }
        return super.getTransformation(j2, transformation);
    }
}
