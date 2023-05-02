package X;

import android.graphics.Color;

/* renamed from: X.0dq  reason: invalid class name and case insensitive filesystem */
public class C08560dq implements C12670km {
    public static final C08560dq A00 = new C08560dq();

    public /* bridge */ /* synthetic */ Object AaC(C09090et r15, float f2) {
        boolean z2 = false;
        if (r15.A0A() == AnonymousClass0KF.BEGIN_ARRAY) {
            z2 = true;
            r15.A0E();
        }
        double A07 = r15.A07();
        double A072 = r15.A07();
        double A073 = r15.A07();
        double A074 = r15.A0A() == AnonymousClass0KF.NUMBER ? r15.A07() : 1.0d;
        if (z2) {
            r15.A0G();
        }
        if (A07 <= 1.0d && A072 <= 1.0d && A073 <= 1.0d) {
            A07 *= 255.0d;
            A072 *= 255.0d;
            A073 *= 255.0d;
            if (A074 <= 1.0d) {
                A074 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) A074, (int) A07, (int) A072, (int) A073));
    }
}
