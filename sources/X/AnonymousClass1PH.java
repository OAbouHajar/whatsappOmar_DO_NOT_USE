package X;

import android.view.View;

/* renamed from: X.1PH  reason: invalid class name */
public final class AnonymousClass1PH {
    public static float A00(View view, C16740tZ r5, float f2) {
        String A0I = r5.A0I();
        AnonymousClass00B.A06(A0I);
        int A00 = C40651uT.A00(A0I);
        if (A00 > 0) {
            return f2 + (((Math.max(f2, Math.min(f2, (view.getResources().getDisplayMetrics().density * f2) / view.getResources().getDisplayMetrics().scaledDensity) * 1.5f) - f2) * ((float) (4 - A00))) / 3.0f);
        }
        return -1.0f;
    }
}
