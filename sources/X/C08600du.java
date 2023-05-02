package X;

import android.graphics.PointF;

/* renamed from: X.0du  reason: invalid class name and case insensitive filesystem */
public class C08600du implements C12670km {
    public static final C08600du A00 = new C08600du();

    public /* bridge */ /* synthetic */ Object AaC(C09090et r4, float f2) {
        AnonymousClass0KF A0A = r4.A0A();
        if (A0A == AnonymousClass0KF.BEGIN_ARRAY || A0A == AnonymousClass0KF.BEGIN_OBJECT) {
            return C06550Wr.A02(r4, f2);
        }
        if (A0A == AnonymousClass0KF.NUMBER) {
            PointF pointF = new PointF(C09090et.A05(r4) * f2, C09090et.A05(r4) * f2);
            while (r4.A0M()) {
                r4.A0J();
            }
            return pointF;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0g("Cannot convert json to point. Next token is ", A0A));
    }
}
