package X;

import android.view.animation.Animation;
import com.obwhatsapp.QrImageView;

/* renamed from: X.4l7  reason: invalid class name and case insensitive filesystem */
public class C94564l7 implements Animation.AnimationListener {
    public final /* synthetic */ C51262bH A00;
    public final /* synthetic */ QrImageView A01;

    public C94564l7(C51262bH r1, QrImageView qrImageView) {
        this.A01 = qrImageView;
        this.A00 = r1;
    }

    public void onAnimationEnd(Animation animation) {
        this.A00.AOx(this.A01);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
