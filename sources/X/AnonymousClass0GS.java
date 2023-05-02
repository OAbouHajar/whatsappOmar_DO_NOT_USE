package X;

import android.view.View;

/* renamed from: X.0GS  reason: invalid class name */
public class AnonymousClass0GS extends AnonymousClass0SD {
    public static boolean A00 = true;

    public float A00(View view) {
        if (A00) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        return view.getAlpha();
    }

    public void A04(View view) {
    }

    public void A05(View view) {
    }

    public void A06(View view, float f2) {
        if (A00) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        view.setAlpha(f2);
    }
}
