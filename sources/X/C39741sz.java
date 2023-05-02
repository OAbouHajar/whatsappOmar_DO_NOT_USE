package X;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.1sz  reason: invalid class name and case insensitive filesystem */
public class C39741sz {
    public static final HashSet A00 = new HashSet(Collections.singletonList("GTQ"));

    public static String A00(AnonymousClass013 r5, String str, String str2, BigDecimal bigDecimal, int i2, boolean z2) {
        C39651sq r1 = C39651sq.A02;
        C39651sq r3 = r1;
        if (!TextUtils.isEmpty(str)) {
            r1 = new C39651sq(str);
        }
        C39751t0 A01 = r1.A01(r5, i2, z2);
        String A02 = A01.A07.A02(bigDecimal);
        if (A01.A02.A02) {
            boolean z3 = false;
            if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
                z3 = true;
            }
            A02 = A01.A01(A02, z3);
        }
        HashSet hashSet = A00;
        if (!hashSet.contains(str)) {
            return A02;
        }
        String replace = A02.replace(" ", "");
        if (!hashSet.contains(str)) {
            if (!TextUtils.isEmpty(str)) {
                r3 = new C39651sq(str);
            }
            str2 = r3.A02(r5);
        }
        return replace.replace(str, str2);
    }

    public static String A01(AnonymousClass013 r5, String str, String str2, BigDecimal bigDecimal, boolean z2) {
        C39651sq r1 = C39651sq.A02;
        C39651sq r4 = r1;
        if (!TextUtils.isEmpty(str)) {
            r1 = new C39651sq(str);
        }
        String A03 = r1.A03(r5, bigDecimal, z2);
        HashSet hashSet = A00;
        if (!hashSet.contains(str)) {
            return A03;
        }
        String replace = A03.replace(" ", "");
        if (!hashSet.contains(str)) {
            if (!TextUtils.isEmpty(str)) {
                r4 = new C39651sq(str);
            }
            str2 = r4.A02(r5);
        }
        return replace.replace(str, str2);
    }

    public static String A02(AnonymousClass013 r1, String str, BigDecimal bigDecimal, boolean z2) {
        NumberFormat instance = DecimalFormat.getInstance(AnonymousClass013.A00(r1.A00));
        instance.setMaximumFractionDigits(bigDecimal.scale());
        instance.setMinimumFractionDigits(bigDecimal.scale());
        String format = instance.format(bigDecimal);
        if (!z2) {
            return format;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }
}
