package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.widget.ImageView;

/* renamed from: X.0CJ  reason: invalid class name */
public class AnonymousClass0CJ extends ImageView {
    public Animatable A00;
    public boolean A01;

    public AnonymousClass0CJ(Context context) {
        super(context);
    }

    public void onAttachedToWindow() {
        Animatable animatable;
        super.onAttachedToWindow();
        if (this.A01 && (animatable = this.A00) != null && !animatable.isRunning()) {
            this.A00.start();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animatable animatable = this.A00;
        if (animatable != null && animatable.isRunning()) {
            this.A00.stop();
        }
    }

    public void setVisibility(int i2) {
        Animatable animatable;
        super.setVisibility(i2);
        if (getVisibility() != 0) {
            Animatable animatable2 = this.A00;
            if (animatable2 != null && animatable2.isRunning()) {
                this.A00.stop();
            }
        } else if (this.A01 && (animatable = this.A00) != null && !animatable.isRunning()) {
            this.A00.start();
        }
    }
}
