package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.facebook.redex.IDxLListenerShape59S0200000_2_I0;
import com.obwhatsapp.R;

/* renamed from: X.1k4  reason: invalid class name and case insensitive filesystem */
public class C34321k4 {
    public static int A00(int i2, boolean z2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 11;
            case 2:
                return 14;
            case 3:
                return 10;
            case 4:
                return 8;
            case 5:
                return z2 ? 12 : 4;
            case 6:
                return 13;
            case 7:
                return 9;
            default:
                return 15;
        }
    }

    public static void A01(Activity activity, View view, int i2) {
        View view2;
        Window window = activity.getWindow();
        if (view != null) {
            view2 = view;
        } else if (window == null || window.getDecorView() == null || (view2 = window.getDecorView()) == null) {
            return;
        }
        C32291fz A00 = C32291fz.A00(view2, i2, -1);
        C34341k6 r3 = A00.A05;
        if (view == null) {
            r3.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape59S0200000_2_I0(activity, 3, r3));
        }
        TextView textView = (TextView) r3.findViewById(R.id.snackbar_text);
        if (textView != null) {
            textView.setSingleLine(false);
        }
        A00.A03();
    }

    public static boolean A02(C14710pd r2) {
        return r2.A0E(C16620tM.A02, 1352);
    }

    public static boolean A03(C14710pd r2) {
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 1352) || r2.A0E(r1, 1353);
    }

    public static boolean A04(C14710pd r2) {
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 2005) || r2.A0E(r1, 1353);
    }

    public static boolean A05(C14710pd r2, C16740tZ r3) {
        C16620tM r1 = C16620tM.A02;
        if (!r2.A0E(r1, 1353)) {
            return r2.A0E(r1, 1352) && r3.A11.A02;
        }
        return true;
    }
}
