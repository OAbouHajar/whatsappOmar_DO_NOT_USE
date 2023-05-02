package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.385  reason: invalid class name */
public class AnonymousClass385 {
    public static void A00(View view, C14990q7 r8, C31201dg r9, AnonymousClass1JW r10) {
        TextView A0L = C13680ns.A0L(view, R.id.text);
        String A0J = r9.A0J(38);
        if (A0J != null) {
            A0L.setText(A0J);
        }
        View A0E = C004601z.A0E(view, R.id.checkbox);
        View A0E2 = C004601z.A0E(view, R.id.wabloks_checkbox);
        if (r9.A0A(41, 0) > 0) {
            float x2 = A0E2.getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{x2, ((float) A0E2.getResources().getDimensionPixelSize(R.dimen.dimen038a)) + x2});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50);
            C13690nt.A0p(ofFloat, A0E2, 3);
            ofFloat.addListener(new AnonymousClass3KC(A0E2, x2));
            ofFloat.start();
            r10.AgT();
        }
        C13690nt.A1B(A0E2, A0E, r9, r8, 4);
    }
}
