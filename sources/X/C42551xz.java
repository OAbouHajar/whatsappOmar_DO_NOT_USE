package X;

import android.text.TextUtils;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1xz  reason: invalid class name and case insensitive filesystem */
public final class C42551xz {
    public static String A00(C16740tZ r3) {
        String A01 = A01(r3);
        if (TextUtils.isEmpty(A01)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(A01);
        String str = r3.A0E().A00.A01;
        if (!TextUtils.isEmpty(str)) {
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String A01(C16740tZ r1) {
        C39261sB r0;
        if (!r1.A0x() || (r0 = r1.A0E().A00) == null) {
            return null;
        }
        String str = r0.A00;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return null;
    }

    public static String A02(C39261sB r4, String str) {
        StringBuilder sb = new StringBuilder();
        if (r4 != null) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            String str2 = r4.A00;
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb.append(str2);
            }
            String str3 = r4.A01;
            if (!TextUtils.isEmpty(str3)) {
                if (sb.length() > 0) {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb.append(str3);
            }
        }
        return sb.toString();
    }

    public static void A03(C69503f9 r7, C39261sB r8) {
        if (r8 != null) {
            String str = r8.A00;
            if (str != null) {
                r7.A03();
                C58852uG r1 = (C58852uG) r7.A00;
                r1.A00 |= 32;
                r1.A06 = str;
            }
            String str2 = r8.A01;
            if (str2 != null) {
                r7.A03();
                C58852uG r12 = (C58852uG) r7.A00;
                r12.A00 |= 64;
                r12.A07 = str2;
            }
            for (C39821t7 r5 : r8.A02) {
                C28581Wr A0U = AnonymousClass2u3.A05.A0U();
                String str3 = r5.A04;
                A0U.A03();
                AnonymousClass2u3 r13 = (AnonymousClass2u3) A0U.A00;
                r13.A00 |= 1;
                r13.A04 = str3;
                int i2 = r5.A01;
                AnonymousClass42R r2 = i2 == 2 ? AnonymousClass42R.A01 : i2 == 1 ? AnonymousClass42R.A02 : AnonymousClass42R.A03;
                A0U.A03();
                AnonymousClass2u3 r14 = (AnonymousClass2u3) A0U.A00;
                r14.A00 |= 4;
                r14.A01 = r2.value;
                C28581Wr A0U2 = AnonymousClass2t2.A02.A0U();
                String str4 = r5.A03;
                A0U2.A03();
                AnonymousClass2t2 r15 = (AnonymousClass2t2) A0U2.A00;
                r15.A00 |= 1;
                r15.A01 = str4;
                A0U.A03();
                AnonymousClass2u3 r16 = (AnonymousClass2u3) A0U.A00;
                r16.A02 = (AnonymousClass2t2) A0U2.A02();
                r16.A00 |= 2;
                C28541Wm A02 = A0U.A02();
                r7.A03();
                C58852uG r22 = (C58852uG) r7.A00;
                AnonymousClass1XE r17 = r22.A03;
                if (!((AnonymousClass1XF) r17).A00) {
                    r17 = C28541Wm.A0G(r17);
                    r22.A03 = r17;
                }
                r17.add(A02);
            }
        }
    }

    public static boolean A04(C16740tZ r1) {
        return r1.A0x() && r1.A0E().A00 != null;
    }
}
