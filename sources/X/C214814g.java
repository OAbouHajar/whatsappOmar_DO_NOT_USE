package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.14g  reason: invalid class name and case insensitive filesystem */
public final class C214814g {
    public static final C37771pi A00(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C37761ph r2 = new C37761ph();
        r2.A0D = str;
        r2.A0F = str2;
        r2.A0H = str3;
        r2.A02 = str4;
        r2.A0E = "-1";
        r2.A0J = "-1";
        r2.A0K = "-1";
        int i2 = 0;
        r2.A0N = false;
        r2.A0O = true;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 += ((C34151jm) it.next()).A00;
        }
        r2.A01 = (long) i2;
        r2.A0M = list;
        r2.A0Q = true;
        r2.A0I = str5;
        r2.A0B = str6;
        r2.A0A = str7;
        return r2.A00();
    }
}
