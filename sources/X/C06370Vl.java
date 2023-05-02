package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Vl  reason: invalid class name and case insensitive filesystem */
public class C06370Vl {
    public static C06000Tv A00 = C06000Tv.A00("k", new String[1], 0);

    public static List A00(AnonymousClass0Rs r8, C12670km r9, C09090et r10, float f2, boolean z2) {
        ArrayList A0u = AnonymousClass000.A0u();
        C09090et r5 = r10;
        AnonymousClass0Rs r3 = r8;
        if (r10.A0A() == AnonymousClass0KF.STRING) {
            AnonymousClass0Rs.A01(r8, "Lottie doesn't support expressions.");
            return A0u;
        }
        r10.A0F();
        while (r10.A0M()) {
            if (r10.A09(A00) != 0) {
                r10.A0J();
            } else {
                C12670km r4 = r9;
                float f3 = f2;
                if (r10.A0A() == AnonymousClass0KF.BEGIN_ARRAY) {
                    r10.A0E();
                    if (r10.A0A() == AnonymousClass0KF.NUMBER) {
                        A0u.add(new C06520Wl(r9.AaC(r10, f2)));
                    } else {
                        while (r10.A0M()) {
                            A0u.add(AnonymousClass0Wf.A01(r3, r4, r5, f3, true, z2));
                        }
                    }
                    r10.A0G();
                } else {
                    A0u.add(new C06520Wl(r9.AaC(r10, f2)));
                }
            }
        }
        r10.A0H();
        A01(A0u);
        return A0u;
    }

    public static void A01(List list) {
        int i2;
        Object obj;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            C06520Wl A0R = AnonymousClass000.A0R(list, i3);
            i3++;
            C06520Wl A0R2 = AnonymousClass000.A0R(list, i3);
            A0R.A08 = Float.valueOf(A0R2.A0A);
            if (A0R.A09 == null && (obj = A0R2.A0F) != null) {
                A0R.A09 = obj;
                if (A0R instanceof C03080Hd) {
                    ((C03080Hd) A0R).A04();
                }
            }
        }
        C06520Wl A0R3 = AnonymousClass000.A0R(list, i2);
        if ((A0R3.A0F == null || A0R3.A09 == null) && list.size() > 1) {
            list.remove(A0R3);
        }
    }
}
