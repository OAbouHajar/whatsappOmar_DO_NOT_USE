package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.1dd  reason: invalid class name and case insensitive filesystem */
public final class C31171dd {
    public static int A00(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int A01(Context context, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            z2 = true;
        }
        AnonymousClass00B.A0F(z2);
        int A00 = A00(context);
        boolean z3 = false;
        if (i2 != 0) {
            z3 = true;
        }
        AnonymousClass00B.A0F(z3);
        return Math.round((((float) A00) * ((float) i2)) / 100.0f);
    }

    public static int A02(View view) {
        return A01(view.getContext(), 72);
    }
}
