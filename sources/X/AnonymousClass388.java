package X;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.388  reason: invalid class name */
public class AnonymousClass388 {
    public static Pair A00(AnonymousClass013 r8, List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        int size = list.size();
        String str = "";
        for (int i2 = 0; i2 < size; i2++) {
            C16010sH AAn = ((AnonymousClass2XJ) list.get(i2)).AAn();
            if (AAn != null) {
                String A09 = AAn.A09();
                if (!TextUtils.isEmpty(A09)) {
                    String upperCase = AnonymousClass1ZW.A04(1, A09).toUpperCase(C13690nt.A0m(r8));
                    if (Character.isDigit(upperCase.codePointAt(0)) || "+".equals(upperCase)) {
                        upperCase = "#";
                    }
                    if (!str.equals(upperCase)) {
                        A0u.add(upperCase);
                        C13690nt.A1O(A0u2, i2);
                        str = upperCase;
                    }
                }
            }
        }
        return C13690nt.A0I(A0u, A0u2);
    }
}
