package X;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: X.0Sd  reason: invalid class name and case insensitive filesystem */
public final class C05580Sd {
    public static int A00(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? AnonymousClass0VQ.A00(marginLayoutParams) : marginLayoutParams.rightMargin;
    }

    public static int A01(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? AnonymousClass0VQ.A01(marginLayoutParams) : marginLayoutParams.leftMargin;
    }
}
