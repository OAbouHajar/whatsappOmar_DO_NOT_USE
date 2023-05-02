package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.obwhatsapp.R;

/* renamed from: X.3kk  reason: invalid class name and case insensitive filesystem */
public class C71633kk extends C65123Sy {
    public C71633kk(View view) {
        super(view);
    }

    public void A09() {
        View view = this.A0H;
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.anim0034);
        loadAnimation.setStartOffset((loadAnimation.getDuration() / 4) * (((long) A00()) % 4));
        view.startAnimation(loadAnimation);
    }
}
