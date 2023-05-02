package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.03x  reason: invalid class name and case insensitive filesystem */
public class C008603x extends C008703y {
    public static /* synthetic */ int A01(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        return !(charSequence instanceof String) ? A02(charSequence, "*", length, 0, true) : ((String) charSequence).lastIndexOf("*", length);
    }

    public static final int A02(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2) {
        C441022t A00;
        int i4;
        if (!z2) {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            A00 = new C440922s(i2, i3);
        } else {
            int length2 = charSequence.length() - 1;
            if (i2 > length2) {
                i2 = length2;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            A00 = C008203t.A00(i2, i3);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            i4 = A00.A00();
            int A01 = A00.A01();
            int A02 = A00.A02();
            if (A02 > 0) {
                if (i4 > A01) {
                    return -1;
                }
            } else if (A01 > i4) {
                return -1;
            }
            while (true) {
                int i5 = i4 + A02;
                if (C008703y.A0Q((String) charSequence2, (String) charSequence, i4, charSequence2.length(), false)) {
                    break;
                } else if (i4 == A01) {
                    return -1;
                } else {
                    i4 = i5;
                }
            }
        } else {
            int A002 = A00.A00();
            int A012 = A00.A01();
            int A022 = A00.A02();
            if (A022 > 0) {
                if (A002 > A012) {
                    return -1;
                }
            } else if (A012 > A002) {
                return -1;
            }
            while (true) {
                int i6 = i4 + A022;
                if (A0H(charSequence2, charSequence, i4, charSequence2.length(), false)) {
                    break;
                } else if (i4 == A012) {
                    return -1;
                } else {
                    A002 = i6;
                }
            }
        }
        return i4;
    }

    public static final int A03(CharSequence charSequence, String str, int i2) {
        C18450wi.A0H(str, 1);
        return !(charSequence instanceof String) ? A02(charSequence, str, i2, charSequence.length(), false) : ((String) charSequence).indexOf(str, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (java.lang.Character.isSpaceChar(r1) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence A04(java.lang.CharSequence r5) {
        /*
            r0 = 0
            X.C18450wi.A0H(r5, r0)
            int r4 = r5.length()
            r0 = 1
            int r4 = r4 - r0
            r3 = 0
            r2 = 0
        L_0x000c:
            if (r3 > r4) goto L_0x0032
            r0 = r4
            if (r2 != 0) goto L_0x0012
            r0 = r3
        L_0x0012:
            char r1 = r5.charAt(r0)
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto L_0x0023
            boolean r1 = java.lang.Character.isSpaceChar(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r2 != 0) goto L_0x002d
            if (r0 != 0) goto L_0x002a
            r2 = 1
            goto L_0x000c
        L_0x002a:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x002d:
            if (r0 == 0) goto L_0x0032
            int r4 = r4 + -1
            goto L_0x000c
        L_0x0032:
            int r0 = r4 + 1
            java.lang.CharSequence r0 = r5.subSequence(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C008603x.A04(java.lang.CharSequence):java.lang.CharSequence");
    }

    public static final String A05(CharSequence charSequence, C440922s r3) {
        C18450wi.A0H(charSequence, 0);
        C18450wi.A0H(r3, 1);
        return charSequence.subSequence(r3.A05().intValue(), r3.A04().intValue() + 1).toString();
    }

    public static final String A06(String str, String str2) {
        C18450wi.A0H(str, 0);
        C18450wi.A0H(str2, 2);
        int length = str.length();
        int lastIndexOf = str.lastIndexOf(46, length - 1);
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, length);
        C18450wi.A0B(substring);
        return substring;
    }

    public static final String A07(String str, String str2, String str3) {
        C18450wi.A0H(str, 0);
        C18450wi.A0H(str2, 1);
        C18450wi.A0H(str3, 2);
        int A03 = A03(str, str2, 0);
        if (A03 == -1) {
            return str3;
        }
        String substring = str.substring(A03 + str2.length(), str.length());
        C18450wi.A0B(substring);
        return substring;
    }

    public static final List A08(CharSequence charSequence, String str, int i2) {
        int i3 = 0;
        int A03 = A03(charSequence, str, 0);
        if (A03 == -1 || i2 == 1) {
            return AnonymousClass1JB.A0V(charSequence.toString());
        }
        boolean z2 = false;
        int i4 = 10;
        if (i2 > 0) {
            z2 = true;
            i4 = i2;
        }
        ArrayList arrayList = new ArrayList(i4);
        do {
            arrayList.add(charSequence.subSequence(i3, A03).toString());
            i3 = str.length() + A03;
            if ((z2 && arrayList.size() == i2 - 1) || (A03 = A03(charSequence, str, i3)) == -1) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, A03).toString());
            i3 = str.length() + A03;
            break;
        } while ((A03 = A03(charSequence, str, i3)) == -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static final List A09(CharSequence charSequence, String[] strArr, int i2) {
        C18450wi.A0H(charSequence, 0);
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return A08(charSequence, str, i2);
            }
        }
        Iterable<C440922s> A01 = C11490ir.A01(A0D(charSequence, strArr, i2));
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(A01, 10));
        for (C440922s A05 : A01) {
            arrayList.add(A05(charSequence, A05));
        }
        return arrayList;
    }

    public static final C440922s A0A(CharSequence charSequence) {
        return new C440922s(0, charSequence.length() - 1);
    }

    public static final AnonymousClass22G A0B(CharSequence charSequence, String[] strArr) {
        return C11490ir.A04(new AnonymousClass5FU(charSequence), A0D(charSequence, strArr, 0));
    }

    public static final AnonymousClass22G A0D(CharSequence charSequence, String[] strArr, int i2) {
        return new C1053058z(charSequence, new C63513Iw(AnonymousClass080.A00(strArr)), i2);
    }

    public static final boolean A0F(CharSequence charSequence, CharSequence charSequence2) {
        C18450wi.A0H(charSequence2, 1);
        return (charSequence2 instanceof String ? A03(charSequence, (String) charSequence2, 0) : A02(charSequence, charSequence2, 0, charSequence.length(), false)) >= 0;
    }

    public static final boolean A0H(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2) {
        char upperCase;
        char upperCase2;
        if (i2 >= 0 && 0 <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i4 + 1;
                char charAt = charSequence.charAt(i4);
                char charAt2 = charSequence2.charAt(i4 + i2);
                if (charAt == charAt2 || (z2 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                    i4 = i5;
                }
            }
            return true;
        }
        return false;
    }
}
