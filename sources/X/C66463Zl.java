package X;

import org.apache.commons.io.IOUtils;

/* renamed from: X.3Zl  reason: invalid class name and case insensitive filesystem */
public final class C66463Zl extends C66483Zn {
    public final char A00;

    public C66463Zl(char c2) {
        this.A00 = c2;
    }

    public final String toString() {
        int i2 = this.A00;
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder A0g = C13690nt.A0g(C13680ns.A06(copyValueOf) + 18);
        A0g.append("CharMatcher.is('");
        A0g.append(copyValueOf);
        return AnonymousClass000.A0h("')", A0g);
    }
}
