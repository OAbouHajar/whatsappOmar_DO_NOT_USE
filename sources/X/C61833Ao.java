package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.3Ao  reason: invalid class name and case insensitive filesystem */
public class C61833Ao {
    public static int A00(C14990q7 r2, C31201dg r3) {
        C31201dg A0G = r3.A0G(38);
        if (A0G != null) {
            return C87564Xk.A01(r2, A0G, 0);
        }
        try {
            String A0J = r3.A0J(36);
            if (A0J == null) {
                return -16777216;
            }
            return C62163Bx.A05(A0J);
        } catch (AnonymousClass40K e2) {
            C29691b2.A01("ColorDrawableUtils", "Error parsing border color in BoxDecoration", e2);
            return 0;
        }
    }

    public static C56312nR A01(C14990q7 r10, C31201dg r11, int i2) {
        float A01;
        int A00;
        int A002;
        float A012;
        float[] A02;
        float A013;
        C56312nR r2 = new C56312nR();
        if (r11 == null) {
            A01 = 0.0f;
            A00 = 0;
            A002 = 0;
            A012 = 0.0f;
            A02 = null;
        } else {
            String A0J = r11.A0J(46);
            A01 = A0J == null ? 0.0f : C62163Bx.A01(A0J);
            A00 = C89544cP.A00(r11.A0N(56), 0);
            A002 = A00(r10, r11);
            String A0J2 = r11.A0J(40);
            A012 = A0J2 == null ? 0.0f : C62163Bx.A01(A0J2);
            A02 = A02(r11.A0N(62));
            String A0J3 = r11.A0J(63);
            if (A0J3 != null) {
                A013 = C62163Bx.A01(A0J3);
                r2.A05.setColor(i2);
                Paint paint = r2.A04;
                paint.setColor(A002);
                paint.setStrokeWidth(A012);
                if (A012 > 0.0f && A02 != null) {
                    paint.setPathEffect(new DashPathEffect(A02, A013));
                }
                r2.A02 = A01;
                r2.A03 = A00;
                float f2 = A012 / 2.0f;
                r2.A00 = f2;
                r2.A01 = A01 - f2;
                return r2;
            }
        }
        A013 = 0.0f;
        r2.A05.setColor(i2);
        Paint paint2 = r2.A04;
        paint2.setColor(A002);
        paint2.setStrokeWidth(A012);
        paint2.setPathEffect(new DashPathEffect(A02, A013));
        r2.A02 = A01;
        r2.A03 = A00;
        float f22 = A012 / 2.0f;
        r2.A00 = f22;
        r2.A01 = A01 - f22;
        return r2;
    }

    public static float[] A02(List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        float[] fArr = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            String A0n = AnonymousClass000.A0n(list, i2);
            fArr[i2] = A0n == null ? 0.0f : C62163Bx.A01(A0n);
        }
        return fArr;
    }
}
