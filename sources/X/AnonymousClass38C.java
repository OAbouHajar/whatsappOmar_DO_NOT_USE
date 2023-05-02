package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.38C  reason: invalid class name */
public class AnonymousClass38C {
    public static C69583fH A00(C33221iE r7, C30611cf r8) {
        C58552tg r1;
        int i2;
        C59032uZ r0 = r7.A05().A03;
        if (r0 == null) {
            r0 = C59032uZ.A07;
        }
        C69583fH r5 = (C69583fH) r0.A0U();
        String str = r8.A02;
        C59032uZ r12 = (C59032uZ) C28581Wr.A00(r5);
        r12.A00 |= 32;
        r12.A04 = str;
        String str2 = r8.A03;
        if (!TextUtils.isEmpty(str2)) {
            C59032uZ r13 = (C59032uZ) C28581Wr.A00(r5);
            r13.A00 |= 64;
            r13.A05 = str2;
        }
        List<C39731sy> list = r8.A05;
        if (list != null && !list.isEmpty()) {
            ArrayList A0u = AnonymousClass000.A0u();
            for (C39731sy r4 : list) {
                C28581Wr A0U = C58552tg.A04.A0U();
                int i3 = r4.A03;
                if (i3 == 1) {
                    C28581Wr A0U2 = C58352tM.A03.A0U();
                    String str3 = r4.A05;
                    C58352tM r14 = (C58352tM) C28581Wr.A00(A0U2);
                    r14.A00 |= 2;
                    r14.A02 = str3;
                    String str4 = r4.A04;
                    C58352tM r15 = (C58352tM) C28581Wr.A00(A0U2);
                    r15.A00 |= 1;
                    r15.A01 = str4;
                    r1 = (C58552tg) C28581Wr.A00(A0U);
                    r1.A03 = A0U2.A02();
                    i2 = 1;
                } else if (i3 == 3) {
                    C28581Wr A0U3 = C58342tL.A03.A0U();
                    String str5 = r4.A04;
                    C58342tL r16 = (C58342tL) C28581Wr.A00(A0U3);
                    r16.A00 |= 1;
                    r16.A01 = str5;
                    String str6 = r4.A05;
                    C58342tL r17 = (C58342tL) C28581Wr.A00(A0U3);
                    r17.A00 |= 2;
                    r17.A02 = str6;
                    r1 = (C58552tg) C28581Wr.A00(A0U);
                    r1.A03 = A0U3.A02();
                    i2 = 3;
                } else if (i3 == 2) {
                    C28581Wr A0U4 = C58362tN.A03.A0U();
                    String str7 = r4.A04;
                    C58362tN r18 = (C58362tN) C28581Wr.A00(A0U4);
                    r18.A00 |= 1;
                    r18.A01 = str7;
                    String str8 = r4.A05;
                    C58362tN r19 = (C58362tN) C28581Wr.A00(A0U4);
                    r19.A00 |= 2;
                    r19.A02 = str8;
                    C28541Wm A02 = A0U4.A02();
                    r1 = (C58552tg) C28581Wr.A00(A0U);
                    r1.A03 = A02;
                    i2 = 2;
                } else {
                    int i4 = r4.A02;
                    C58552tg r110 = (C58552tg) C28581Wr.A00(A0U);
                    r110.A00 |= 8;
                    r110.A02 = i4;
                    A0u.add(A0U.A02());
                }
                r1.A01 = i2;
                int i42 = r4.A02;
                C58552tg r1102 = (C58552tg) C28581Wr.A00(A0U);
                r1102.A00 |= 8;
                r1102.A02 = i42;
                A0u.add(A0U.A02());
            }
            r5.A05(A0u);
        }
        return r5;
    }
}
