package X;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.06e  reason: invalid class name and case insensitive filesystem */
public final class C012606e {
    public static final C012606e A01 = A02(new Locale[0]);
    public final C012706f A00;

    public C012606e(C012706f r1) {
        this.A00 = r1;
    }

    public static C012606e A00(LocaleList localeList) {
        return new C012606e(new C07320ay(localeList));
    }

    public static C012606e A01(String str) {
        if (str == null || str.isEmpty()) {
            return A01;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = Build.VERSION.SDK_INT;
            String str2 = split[i2];
            localeArr[i2] = i3 >= 21 ? C04100Le.A00(str2) : A03(str2);
        }
        return A02(localeArr);
    }

    public static C012606e A02(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? A00(C04110Lf.A00(localeArr)) : new C012606e(new C013406m(localeArr));
    }

    public static Locale A03(String str) {
        String str2 = "-";
        if (!str.contains(str2)) {
            str2 = "_";
            if (!str.contains(str2)) {
                return new Locale(str);
            }
        }
        String[] split = str.split(str2, -1);
        int length = split.length;
        if (length > 2) {
            return new Locale(split[0], split[1], split[2]);
        }
        if (length > 1) {
            return new Locale(split[0], split[1]);
        }
        if (length == 1) {
            return new Locale(split[0]);
        }
        StringBuilder sb = new StringBuilder("Can not parse language tag: [");
        sb.append(str);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C012606e) && this.A00.equals(((C012606e) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
