package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.25l  reason: invalid class name and case insensitive filesystem */
public class C447625l {
    public final TextView A00;
    public final AnonymousClass013 A01;

    public C447625l(View view, AnonymousClass013 r3) {
        this.A01 = r3;
        this.A00 = (TextView) C004601z.A0E(view, R.id.update_postcode_tip);
    }

    public void A00() {
        TextView textView = this.A00;
        textView.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(320);
        textView.startAnimation(alphaAnimation);
    }
}
