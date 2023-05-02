package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape42S0300000_3_I1;
import com.obwhatsapp.R;

/* renamed from: X.5pJ  reason: invalid class name and case insensitive filesystem */
public class C115185pJ {
    public static void A00(C14550pN r5, int i2) {
        Toolbar A09 = C110105dW.A09(r5);
        r5.Aem(A09);
        C005402i x2 = r5.x();
        if (x2 != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                r5.getWindow().addFlags(Integer.MIN_VALUE);
                Window window = r5.getWindow();
                int A00 = AnonymousClass00T.A00(r5, R.color.color059c);
            }
            A09.setBackgroundColor(AnonymousClass00T.A00(r5, R.color.color065f));
            x2.A0E(AnonymousClass00T.A04(r5, i2));
            x2.A0Q(false);
            x2.A0N(true);
            A09.setOverflowIcon(AnonymousClass00T.A04(r5, R.drawable.onboarding_actionbar_overflow_button));
            View findViewById = r5.findViewById(R.id.scroll_view);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape42S0300000_3_I1(findViewById, x2, r5, 0));
            }
        }
    }
}
