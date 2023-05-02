package X;

import org.apache.commons.io.IOUtils;

/* renamed from: X.4XU  reason: invalid class name */
public class AnonymousClass4XU {
    public int A00;
    public int A01 = 0;
    public final CharSequence A02;

    public AnonymousClass4XU(CharSequence charSequence) {
        this.A02 = charSequence;
        this.A00 = charSequence.length() - 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:0:0x0000, B:3:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char A00(int r3) {
        /*
            r2 = this;
        L_0x0000:
            int r3 = r3 + 1
            boolean r0 = r2.A09(r3)
            r0 = r0 ^ 1
            r1 = 32
            if (r0 != 0) goto L_0x0015
            java.lang.CharSequence r0 = r2.A02
            char r0 = r0.charAt(r3)
            if (r0 != r1) goto L_0x0015
            goto L_0x0000
        L_0x0015:
            boolean r0 = r2.A09(r3)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0024
            java.lang.CharSequence r0 = r2.A02
            char r0 = r0.charAt(r3)
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XU.A00(int):char");
    }

    public int A01(char c2, char c3, int i2, boolean z2) {
        String str;
        CharSequence charSequence = this.A02;
        if (charSequence.charAt(i2) == c2) {
            int i3 = 1;
            while (true) {
                i2++;
                if (!A09(i2)) {
                    return -1;
                }
                char charAt = charSequence.charAt(i2);
                if (charAt == '\'' || charAt == '\"') {
                    int A03 = A03(charAt, i2);
                    if (A03 == -1) {
                        StringBuilder A0r = AnonymousClass000.A0r("Could not find matching close quote for ");
                        A0r.append(charAt);
                        A0r.append(" when parsing : ");
                        str = AnonymousClass000.A0f(charSequence, A0r);
                        break;
                    }
                    i2 = A03 + 1;
                }
                if (z2 && charSequence.charAt(i2) == '/') {
                    int A032 = A03(IOUtils.DIR_SEPARATOR_UNIX, i2);
                    if (A032 == -1) {
                        str = AnonymousClass000.A0g("Could not find matching close for / when parsing regex in : ", charSequence);
                        break;
                    }
                    i2 = A032 + 1;
                }
                if (charSequence.charAt(i2) == c2) {
                    i3++;
                }
                if (charSequence.charAt(i2) == c3 && i3 - 1 == 0) {
                    return i2;
                }
            }
        } else {
            StringBuilder A0r2 = AnonymousClass000.A0r("Expected ");
            A0r2.append(c2);
            A0r2.append(" but found ");
            str = AnonymousClass3K3.A0p(A0r2, charSequence.charAt(i2));
        }
        throw C70003fx.A00(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:0:0x0000, B:3:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(char r3, int r4) {
        /*
            r2 = this;
        L_0x0000:
            int r4 = r4 + 1
            boolean r0 = r2.A09(r4)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0015
            java.lang.CharSequence r0 = r2.A02
            char r1 = r0.charAt(r4)
            r0 = 32
            if (r1 != r0) goto L_0x0015
            goto L_0x0000
        L_0x0015:
            java.lang.CharSequence r0 = r2.A02
            char r0 = r0.charAt(r4)
            if (r0 == r3) goto L_0x001e
            r4 = -1
        L_0x001e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XU.A02(char, int):int");
    }

    public int A03(char c2, int i2) {
        boolean z2 = false;
        for (int i3 = i2 + 1; !(!A09(i3)); i3++) {
            if (z2) {
                z2 = false;
            } else {
                CharSequence charSequence = this.A02;
                if ('\\' == charSequence.charAt(i3)) {
                    z2 = true;
                } else if (c2 == charSequence.charAt(i3)) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public void A04() {
        while (true) {
            int i2 = this.A01;
            if (A09(i2) && i2 < this.A00 && this.A02.charAt(i2) == ' ') {
                this.A01++;
            } else {
                return;
            }
        }
    }

    public void A05() {
        int i2;
        A04();
        while (true) {
            int i3 = this.A01;
            if (A09(i3) && i3 < (i2 = this.A00) && this.A02.charAt(i2) == ' ') {
                this.A00--;
            } else {
                return;
            }
        }
    }

    public void A06(char c2) {
        A04();
        if (this.A02.charAt(this.A01) == c2) {
            this.A01++;
        } else {
            throw C70003fx.A00(String.format("Expected character: %c", new Object[]{Character.valueOf(c2)}));
        }
    }

    public boolean A07(char c2) {
        return AnonymousClass000.A1R(this.A02.charAt(this.A01), c2);
    }

    public boolean A08(char c2, int i2) {
        do {
            i2++;
            if ((!A09(i2)) || this.A02.charAt(i2) != ' ') {
            }
            i2++;
            break;
        } while (this.A02.charAt(i2) != ' ');
        return !(A09(i2) ^ true) && this.A02.charAt(i2) == c2;
    }

    public boolean A09(int i2) {
        return i2 >= 0 && i2 <= this.A00;
    }

    public boolean A0A(CharSequence charSequence) {
        A04();
        if (A09((this.A01 + charSequence.length()) - 1)) {
            int i2 = this.A01;
            if (this.A02.subSequence(i2, charSequence.length() + i2).equals(charSequence)) {
                this.A01 += charSequence.length();
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.A02.toString();
    }
}
