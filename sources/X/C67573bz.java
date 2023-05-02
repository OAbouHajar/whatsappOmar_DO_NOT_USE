package X;

import org.apache.commons.io.IOUtils;

/* renamed from: X.3bz  reason: invalid class name and case insensitive filesystem */
public final class C67573bz extends C67583c1 {
    public final char A00;

    public C67573bz(char c2) {
        this.A00 = c2;
    }

    public String toString() {
        char c2 = this.A00;
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder A0g = C13690nt.A0g(C13680ns.A06(copyValueOf) + 18);
        A0g.append("CharMatcher.is('");
        A0g.append(copyValueOf);
        return AnonymousClass000.A0h("')", A0g);
    }
}
