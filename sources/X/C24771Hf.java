package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.1Hf  reason: invalid class name and case insensitive filesystem */
public class C24771Hf {
    public final C14710pd A00;
    public final C19070xi A01;
    public final Set A02;

    public C24771Hf(C14710pd r3, C19070xi r4) {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet());
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = Collections.unmodifiableSet(new HashSet(unmodifiableSet));
    }

    public static boolean A00(String str, String str2) {
        if (!(str == null || str2 == null)) {
            if (str2.equals("all") || str2.equals("none")) {
                throw new IllegalArgumentException("Name 'none' and 'all' are not supported");
            }
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            String lowerCase2 = str2.toLowerCase(locale);
            String trim = lowerCase.trim();
            if (!TextUtils.isEmpty(trim) && !trim.equals("none")) {
                boolean z2 = false;
                for (String trim2 : trim.split(";")) {
                    String trim3 = trim2.trim();
                    if (!TextUtils.isEmpty(trim3)) {
                        if (trim3.equals("all")) {
                            z2 = true;
                        }
                        if (trim3.equals(lowerCase2)) {
                            z2 = true;
                        }
                        if (trim3.startsWith("-") && lowerCase2.equals(trim3.substring(1))) {
                        }
                    }
                }
                return z2;
            }
        }
        return false;
    }

    public int A01(String str) {
        C14710pd r3 = this.A00;
        C16620tM r2 = C16620tM.A02;
        if (!A00(r3.A06(r2, 207), str)) {
            return (A00(r3.A06(r2, 208), str) || !A00(r3.A06(r2, 209), str)) ? 2 : 3;
        }
        return 1;
    }
}
