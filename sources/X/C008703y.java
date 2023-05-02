package X;

import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.03y  reason: invalid class name and case insensitive filesystem */
public class C008703y extends C441522z {
    public static final String A0I(String str) {
        C18450wi.A0H(str, 0);
        String replace = str.replace(FilenameUtils.EXTENSION_SEPARATOR, '_');
        C18450wi.A0B(replace);
        return replace;
    }

    public static final String A0K(String str, String str2, String str3) {
        C18450wi.A0H(str2, 1);
        int i2 = 0;
        int A03 = C008603x.A03(str, str2, 0);
        if (A03 < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length;
        if (length < 1) {
            i3 = 1;
        }
        int length2 = str.length();
        int length3 = (length2 - length) + str3.length();
        if (length3 >= 0) {
            StringBuilder sb = new StringBuilder(length3);
            do {
                sb.append(str, i2, A03);
                sb.append(str3);
                i2 = A03 + length;
                if (A03 >= length2 || (A03 = C008603x.A03(str, str2, A03 + i3)) <= 0) {
                    sb.append(str, i2, length2);
                    String obj = sb.toString();
                    C18450wi.A0B(obj);
                }
                sb.append(str, i2, A03);
                sb.append(str3);
                i2 = A03 + length;
                break;
            } while ((A03 = C008603x.A03(str, str2, A03 + i3)) <= 0);
            sb.append(str, i2, length2);
            String obj2 = sb.toString();
            C18450wi.A0B(obj2);
            return obj2;
        }
        throw new OutOfMemoryError();
    }

    public static final boolean A0L(CharSequence charSequence) {
        C18450wi.A0H(charSequence, 0);
        if (charSequence.length() != 0) {
            C440922s A0A = C008603x.A0A(charSequence);
            if (!(A0A instanceof Collection) || !((Collection) A0A).isEmpty()) {
                Iterator it = A0A.iterator();
                while (it.hasNext()) {
                    char charAt = charSequence.charAt(((C52222dL) it).A00());
                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean A0M(String str, String str2) {
        C18450wi.A0H(str, 0);
        C18450wi.A0H(str2, 1);
        return str.endsWith(str2);
    }

    public static final boolean A0N(String str, String str2) {
        C18450wi.A0H(str, 0);
        C18450wi.A0H(str2, 1);
        return str.startsWith(str2);
    }

    public static final boolean A0Q(String str, String str2, int i2, int i3, boolean z2) {
        String str3 = str;
        C18450wi.A0H(str, 0);
        String str4 = str2;
        C18450wi.A0H(str2, 2);
        int i4 = i2;
        return !z2 ? str3.regionMatches(0, str4, i4, i3) : str3.regionMatches(z2, 0, str4, i4, i3);
    }
}
