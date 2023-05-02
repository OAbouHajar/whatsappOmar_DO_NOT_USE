package X;

import android.view.View;
import android.widget.RelativeLayout;
import com.obwhatsapp.R;

/* renamed from: X.4Xy  reason: invalid class name */
public class AnonymousClass4Xy {
    public static void A00(View view, AnonymousClass013 r3) {
        int i2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (C13680ns.A1Z(r3)) {
            layoutParams.addRule(0, 0);
            i2 = 11;
        } else {
            layoutParams.addRule(1, 0);
            i2 = 9;
        }
        layoutParams.addRule(i2);
    }

    public static void A01(View view, AnonymousClass013 r3) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        int i2 = 0;
        if (C13680ns.A1Z(r3)) {
            layoutParams.addRule(11, 0);
        } else {
            layoutParams.addRule(9, 0);
            i2 = 1;
        }
        layoutParams.addRule(i2, R.id.send);
    }
}
