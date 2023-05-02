package X;

import java.util.regex.Pattern;

/* renamed from: X.4eT  reason: invalid class name and case insensitive filesystem */
public final class C90624eT {
    public static final Pattern A02 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final C90504eH A00 = new C90504eH();
    public final StringBuilder A01 = AnonymousClass000.A0o();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 == '_') goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r2 != '.') goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r2 <= r1) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.C90504eH r7, java.lang.StringBuilder r8) {
        /*
            r5 = 0
            r8.setLength(r5)
            int r4 = r7.A01
            r6 = r4
            int r3 = r7.A00
        L_0x0009:
            if (r4 >= r3) goto L_0x0041
            if (r5 != 0) goto L_0x0041
            byte[] r0 = r7.A02
            byte r0 = r0[r4]
            char r2 = (char) r0
            r0 = 65
            if (r2 < r0) goto L_0x002a
            r0 = 90
            if (r2 <= r0) goto L_0x0024
            r0 = 97
            r1 = 122(0x7a, float:1.71E-43)
            if (r2 >= r0) goto L_0x003e
            r0 = 95
            if (r2 != r0) goto L_0x003c
        L_0x0024:
            int r4 = r4 + 1
            r8.append(r2)
            goto L_0x0009
        L_0x002a:
            r0 = 48
            r1 = 57
            if (r2 >= r0) goto L_0x003e
            r0 = 35
            if (r2 == r0) goto L_0x0024
            r0 = 45
            if (r2 == r0) goto L_0x0024
            r0 = 46
            if (r2 == r0) goto L_0x0024
        L_0x003c:
            r5 = 1
            goto L_0x0009
        L_0x003e:
            if (r2 <= r1) goto L_0x0024
            goto L_0x003c
        L_0x0041:
            int r4 = r4 - r6
            r7.A0T(r4)
            java.lang.String r0 = r8.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90624eT.A00(X.4eH, java.lang.StringBuilder):java.lang.String");
    }

    public static String A01(C90504eH r3, StringBuilder sb) {
        A02(r3);
        if (C90504eH.A00(r3) == 0) {
            return null;
        }
        String A002 = A00(r3, sb);
        return !"".equals(A002) ? A002 : AnonymousClass3K3.A0p(AnonymousClass000.A0q(""), (char) r3.A0C());
    }

    public static void A02(C90504eH r8) {
        while (true) {
            boolean z2 = true;
            while (true) {
                int i2 = r8.A00;
                int i3 = r8.A01;
                if (i2 - i3 > 0 && z2) {
                    byte[] bArr = r8.A02;
                    byte b2 = bArr[i3];
                    char c2 = (char) b2;
                    if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
                        r8.A0T(1);
                    } else {
                        if (i3 + 2 <= i2) {
                            int i4 = i3 + 1;
                            if (b2 == 47) {
                                int i5 = i4 + 1;
                                if (bArr[i4] == 42) {
                                    while (true) {
                                        int i6 = i5 + 1;
                                        if (i6 >= i2) {
                                            break;
                                        } else if (((char) bArr[i5]) == '*' && ((char) bArr[i6]) == '/') {
                                            i5 = i6 + 1;
                                            i2 = i5;
                                        } else {
                                            i5 = i6;
                                        }
                                    }
                                    r8.A0T(i2 - i3);
                                }
                            } else {
                                continue;
                            }
                        }
                        z2 = false;
                    }
                } else {
                    return;
                }
            }
            r8.A0T(1);
        }
    }
}
