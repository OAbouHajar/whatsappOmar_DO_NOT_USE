package X;

import java.util.ArrayList;

/* renamed from: X.0Vj  reason: invalid class name and case insensitive filesystem */
public class C06350Vj {
    public static final C06000Tv A00;

    static {
        String[] strArr = new String[3];
        strArr[0] = "k";
        strArr[1] = "x";
        A00 = C06000Tv.A00("y", strArr, 2);
    }

    public static C08410db A00(AnonymousClass0Rs r9, C09090et r10) {
        ArrayList A0u = AnonymousClass000.A0u();
        C09090et r5 = r10;
        if (r10.A0A() == AnonymousClass0KF.BEGIN_ARRAY) {
            r10.A0E();
            while (r10.A0M()) {
                boolean A1Y = AnonymousClass000.A1Y(r10.A0A(), AnonymousClass0KF.BEGIN_OBJECT);
                AnonymousClass0Rs r3 = r9;
                A0u.add(new C03080Hd(r9, AnonymousClass0Wf.A01(r3, C08590dt.A00, r5, AnonymousClass0XD.A00(), A1Y, false)));
            }
            r10.A0G();
            C06370Vl.A01(A0u);
        } else {
            A0u.add(new C06520Wl(C06550Wr.A02(r10, AnonymousClass0XD.A00())));
        }
        return new C08410db(A0u);
    }

    public static C13230lg A01(AnonymousClass0Rs r7, C09090et r8) {
        r8.A0F();
        C08410db r5 = null;
        AnonymousClass0HT r4 = null;
        AnonymousClass0HT r3 = null;
        boolean z2 = false;
        while (r8.A0A() != AnonymousClass0KF.END_OBJECT) {
            int A09 = r8.A09(A00);
            if (A09 != 0) {
                if (A09 != 1) {
                    if (A09 != 2) {
                        r8.A0I();
                        r8.A0J();
                    } else if (r8.A0A() != AnonymousClass0KF.STRING) {
                        r3 = C06270Vb.A01(r7, r8, true);
                    }
                } else if (r8.A0A() != AnonymousClass0KF.STRING) {
                    r4 = C06270Vb.A01(r7, r8, true);
                }
                r8.A0J();
                z2 = true;
            } else {
                r5 = A00(r7, r8);
            }
        }
        r8.A0H();
        if (z2) {
            AnonymousClass0Rs.A01(r7, "Lottie doesn't support expressions.");
        }
        return r5 != null ? r5 : new C08400da(r4, r3);
    }
}
