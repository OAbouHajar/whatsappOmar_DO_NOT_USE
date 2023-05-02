package X;

import java.math.BigInteger;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.0f5  reason: invalid class name and case insensitive filesystem */
public final class C09190f5 implements Comparable {
    public static final C09190f5 A05;
    public static final C09190f5 A06 = new C09190f5("", 0, 0, 0);
    public static final C09190f5 A07 = new C09190f5("", 0, 1, 0);
    public static final C09190f5 A08;
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C15220qW A04 = C32521gW.A00(new C11400ii(this));

    static {
        C09190f5 r0 = new C09190f5("", 1, 0, 0);
        A08 = r0;
        A05 = r0;
    }

    public C09190f5(String str, int i2, int i3, int i4) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = str;
    }

    /* renamed from: A00 */
    public int compareTo(C09190f5 r3) {
        C18450wi.A0H(r3, 0);
        return A01().compareTo(r3.A01());
    }

    public final BigInteger A01() {
        Object value = this.A04.getValue();
        C18450wi.A0B(value);
        return (BigInteger) value;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C09190f5)) {
            return false;
        }
        C09190f5 r4 = (C09190f5) obj;
        return this.A00 == r4.A00 && this.A01 == r4.A01 && this.A02 == r4.A02;
    }

    public int hashCode() {
        return ((((527 + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public String toString() {
        String str = this.A03;
        String A062 = C008703y.A0L(str) ^ true ? C18450wi.A06("-", str) : "";
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A00);
        A0o.append(FilenameUtils.EXTENSION_SEPARATOR);
        A0o.append(this.A01);
        A0o.append(FilenameUtils.EXTENSION_SEPARATOR);
        A0o.append(this.A02);
        return AnonymousClass000.A0h(A062, A0o);
    }
}
