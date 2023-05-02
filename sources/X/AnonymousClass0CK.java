package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.0CK  reason: invalid class name */
public class AnonymousClass0CK extends ImageView {
    public ObjectAnimator A00;
    public boolean A01;

    public AnonymousClass0CK(Context context) {
        super(context);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, 360.0f}).setDuration(850);
        this.A00 = duration;
        duration.setRepeatMode(1);
        this.A00.setRepeatCount(-1);
        this.A00.setInterpolator(new LinearInterpolator());
        setImageDrawable(AnonymousClass00T.A04(context, R.drawable.spinner_large));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            this.A00.start();
        }
    }

    public void onDetachedFromWindow() {
        this.A01 = false;
        this.A00.cancel();
        super.onDetachedFromWindow();
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A01) {
            this.A00.start();
            this.A01 = false;
        }
    }

    public void onVisibilityChanged(View view, int i2) {
        boolean z2;
        super.onVisibilityChanged(view, i2);
        if (getWindowToken() != null) {
            if (i2 != 0 || getVisibility() != 0) {
                this.A00.cancel();
                z2 = false;
            } else if (getAnimation() != null) {
                return;
            } else {
                if (getMeasuredWidth() != 0) {
                    this.A00.start();
                    return;
                }
                z2 = true;
            }
            this.A01 = z2;
        }
    }
}
