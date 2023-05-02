package X;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.obwhatsapp.calling.views.VoipCallControlRingingDotsIndicator;

/* renamed from: X.3NP  reason: invalid class name */
public final class AnonymousClass3NP extends Animation {
    public final float A00 = 0.14f;
    public final float A01 = 0.66f;
    public final int A02 = 800;
    public final int A03 = 100;
    public final VoipCallControlRingingDotsIndicator A04;

    public AnonymousClass3NP(VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator) {
        this.A04 = voipCallControlRingingDotsIndicator;
        setDuration((long) 1500);
        setInterpolator(new LinearInterpolator());
    }

    public void applyTransformation(float f2, Transformation transformation) {
        int i2;
        VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator;
        int i3 = 0;
        do {
            i2 = i3 + 1;
            int duration = ((int) (((float) getDuration()) * f2)) - (this.A03 * i2);
            int i4 = this.A02;
            int i5 = i4 >> 1;
            float f3 = (float) duration;
            if (duration > i5) {
                f3 = ((float) i4) - ((float) duration);
            }
            float f4 = f3 / ((float) i5);
            if (f4 < 0.0f) {
                f4 = 0.0f;
            } else if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            voipCallControlRingingDotsIndicator = this.A04;
            float f5 = this.A00;
            float f6 = f5 + ((this.A01 - f5) * f4);
            if (i3 >= 0 && i3 < 3) {
                voipCallControlRingingDotsIndicator.A05[i3] = f6;
            }
            i3 = i2;
        } while (i2 < 3);
        voipCallControlRingingDotsIndicator.invalidate();
    }
}
