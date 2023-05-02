package X;

/* renamed from: X.0PJ  reason: invalid class name */
public final class AnonymousClass0PJ {
    public final boolean A00(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i2 < length) {
                    char charAt = str.charAt(i2);
                    int i5 = i4 + 1;
                    if (i4 == 0) {
                        if (charAt != '(') {
                            break;
                        }
                    } else if (charAt != '(') {
                        if (charAt == ')' && i3 - 1 == 0 && i4 != length - 1) {
                            return false;
                        }
                        i2++;
                        i4 = i5;
                    }
                    i3++;
                    i2++;
                    i4 = i5;
                } else if (i3 == 0) {
                    String substring = str.substring(1, length - 1);
                    C18450wi.A0B(substring);
                    return C18450wi.A0R(C008603x.A04(substring).toString(), str2);
                }
            }
        }
        return false;
    }
}
