package X;

import android.graphics.Color;
import android.graphics.PointF;
import android.support.v4.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Wr  reason: invalid class name and case insensitive filesystem */
public class C06550Wr {
    public static final C06000Tv A00;

    static {
        String[] strArr = new String[2];
        strArr[0] = "x";
        A00 = C06000Tv.A00("y", strArr, 1);
    }

    public static float A00(C09090et r2) {
        AnonymousClass0KF A0A = r2.A0A();
        switch (A0A.ordinal()) {
            case 0:
                r2.A0E();
                float A05 = C09090et.A05(r2);
                while (r2.A0M()) {
                    r2.A0J();
                }
                r2.A0G();
                return A05;
            case 6:
                return C09090et.A05(r2);
            default:
                throw AnonymousClass000.A0T(AnonymousClass000.A0g("Unknown value for token of type ", A0A));
        }
    }

    public static int A01(C09090et r8) {
        r8.A0E();
        int A07 = (int) (r8.A07() * 255.0d);
        int A072 = (int) (r8.A07() * 255.0d);
        int A073 = (int) (r8.A07() * 255.0d);
        while (r8.A0M()) {
            r8.A0J();
        }
        r8.A0G();
        return Color.argb(MotionEventCompat.ACTION_MASK, A07, A072, A073);
    }

    public static PointF A02(C09090et r4, float f2) {
        float f3;
        float f4;
        switch (r4.A0A().ordinal()) {
            case 0:
                r4.A0E();
                f3 = C09090et.A05(r4);
                f4 = C09090et.A05(r4);
                while (r4.A0A() != AnonymousClass0KF.END_ARRAY) {
                    r4.A0J();
                }
                r4.A0G();
                break;
            case 2:
                r4.A0F();
                f3 = 0.0f;
                f4 = 0.0f;
                while (r4.A0M()) {
                    int A09 = r4.A09(A00);
                    if (A09 == 0) {
                        f3 = A00(r4);
                    } else if (A09 != 1) {
                        r4.A0I();
                        r4.A0J();
                    } else {
                        f4 = A00(r4);
                    }
                }
                r4.A0H();
                break;
            case 6:
                float A05 = C09090et.A05(r4);
                float A052 = C09090et.A05(r4);
                while (r4.A0M()) {
                    r4.A0J();
                }
                return new PointF(A05 * f2, A052 * f2);
            default:
                throw AnonymousClass000.A0T(AnonymousClass000.A0f(r4.A0A(), AnonymousClass000.A0r("Unknown point starts with ")));
        }
        return new PointF(f3 * f2, f4 * f2);
    }

    public static List A03(C09090et r3, float f2) {
        ArrayList A0u = AnonymousClass000.A0u();
        r3.A0E();
        while (r3.A0A() == AnonymousClass0KF.BEGIN_ARRAY) {
            r3.A0E();
            A0u.add(A02(r3, f2));
            r3.A0G();
        }
        r3.A0G();
        return A0u;
    }
}
