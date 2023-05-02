package X;

import java.util.Arrays;

/* renamed from: X.2kw  reason: invalid class name and case insensitive filesystem */
public class C56082kw {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public C56082kw(String str, String str2, boolean z2) {
        this.A02 = z2;
        this.A01 = str == null ? "" : str;
        this.A00 = str2 == null ? "" : str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C56082kw)) {
            return false;
        }
        C56082kw r4 = (C56082kw) obj;
        return this.A02 == r4.A02 && this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A02), this.A01, this.A00});
    }
}
