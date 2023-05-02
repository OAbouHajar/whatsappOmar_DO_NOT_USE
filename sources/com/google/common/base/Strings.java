package com.google.common.base;

import X.AnonymousClass000;
import X.C13680ns;
import X.C13690nt;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Strings {
    public static String A00(String str, Object... objArr) {
        int length;
        String valueOf = String.valueOf(str);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            String str2 = objArr[i3];
            if (str2 == null) {
                str2 = "null";
            } else {
                try {
                    str2 = str2.toString();
                } catch (Exception e2) {
                    String A0d = AnonymousClass000.A0d(str2);
                    String hexString = Integer.toHexString(System.identityHashCode(str2));
                    StringBuilder A0l = C13680ns.A0l(hexString, A0d.length() + 1);
                    A0l.append(A0d);
                    A0l.append('@');
                    String A0h = AnonymousClass000.A0h(hexString, A0l);
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, C13680ns.A0g(String.valueOf(A0h), "Exception during lenientFormat for "), e2);
                    String A0d2 = AnonymousClass000.A0d(e2);
                    StringBuilder A0g = C13690nt.A0g(C13680ns.A06(A0h) + 9 + A0d2.length());
                    A0g.append("<");
                    A0g.append(A0h);
                    A0g.append(" threw ");
                    A0g.append(A0d2);
                    str2 = AnonymousClass000.A0h(">", A0g);
                }
            }
            objArr[i3] = str2;
            i3++;
        }
        int length2 = valueOf.length();
        StringBuilder A0g2 = C13690nt.A0g((length << 4) + length2);
        int i4 = 0;
        while (i2 < length) {
            int indexOf = valueOf.indexOf("%s", i4);
            if (indexOf == -1) {
                break;
            }
            A0g2.append(valueOf, i4, indexOf);
            A0g2.append(objArr[i2]);
            i4 = indexOf + 2;
            i2++;
        }
        A0g2.append(valueOf, i4, length2);
        if (i2 < length) {
            A0g2.append(" [");
            A0g2.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < length; i5++) {
                A0g2.append(", ");
                A0g2.append(objArr[i5]);
            }
            A0g2.append(']');
        }
        return A0g2.toString();
    }
}
