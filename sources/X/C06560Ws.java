package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.0Ws  reason: invalid class name and case insensitive filesystem */
public class C06560Ws {
    public static PointF A00 = new PointF();

    public static int A00(float f2, float f3) {
        int i2 = (int) f2;
        int i3 = (int) f3;
        int i4 = i2 / i3;
        boolean z2 = false;
        if ((i2 ^ i3) >= 0) {
            z2 = true;
        }
        int i5 = i2 % i3;
        if (!z2 && i5 != 0) {
            i4--;
        }
        return i2 - (i3 * i4);
    }

    public static void A01(C13540mY r3, AnonymousClass0WM r4, AnonymousClass0WM r5, List list, int i2) {
        String name = r3.getName();
        if (r4.A01(name, i2)) {
            AnonymousClass0WM r1 = new AnonymousClass0WM(r5);
            r1.A01.add(name);
            AnonymousClass0WM r0 = new AnonymousClass0WM(r1);
            r0.A00 = r3;
            list.add(r0);
        }
    }
}
