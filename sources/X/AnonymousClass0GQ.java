package X;

import android.view.View;

/* renamed from: X.0GQ  reason: invalid class name */
public class AnonymousClass0GQ extends AnonymousClass0GR {
    public static boolean A00 = true;

    public void A08(View view, int i2, int i3, int i4, int i5) {
        if (A00) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
