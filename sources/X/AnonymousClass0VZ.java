package X;

import android.view.View;

/* renamed from: X.0VZ  reason: invalid class name */
public class AnonymousClass0VZ {
    public static int A00(View view, View view2, AnonymousClass0VA r4, AnonymousClass02W r5, AnonymousClass0Ri r6, boolean z2) {
        if (r5.A05() == 0 || r6.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return AnonymousClass000.A09(AnonymousClass02W.A02(view), AnonymousClass02W.A02(view2)) + 1;
        }
        return Math.min(r4.A07(), r4.A08(view2) - r4.A0B(view));
    }

    public static int A01(View view, View view2, AnonymousClass0VA r5, AnonymousClass02W r6, AnonymousClass0Ri r7, boolean z2) {
        int A00;
        if (r6.A05() == 0 || (A00 = r7.A00()) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return A00;
        }
        return (int) ((((float) (r5.A08(view2) - r5.A0B(view))) / ((float) (AnonymousClass000.A09(AnonymousClass02W.A02(view), AnonymousClass02W.A02(view2)) + 1))) * ((float) r7.A00()));
    }

    public static int A02(View view, View view2, AnonymousClass0VA r6, AnonymousClass02W r7, AnonymousClass0Ri r8, boolean z2, boolean z3) {
        if (r7.A05() == 0 || r8.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (r8.A00() - Math.max(AnonymousClass02W.A02(view), AnonymousClass02W.A02(view2))) - 1) : Math.max(0, Math.min(AnonymousClass02W.A02(view), AnonymousClass02W.A02(view2)));
        if (!z2) {
            return max;
        }
        return Math.round((((float) max) * (((float) AnonymousClass000.A09(r6.A08(view2), r6.A0B(view))) / ((float) (AnonymousClass000.A09(AnonymousClass02W.A02(view), AnonymousClass02W.A02(view2)) + 1)))) + ((float) (r6.A06() - r6.A0B(view))));
    }
}
