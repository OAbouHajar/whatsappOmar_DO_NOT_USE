package X;

import java.util.Arrays;

/* renamed from: X.0ok  reason: invalid class name and case insensitive filesystem */
public final class C14180ok {
    public final long A00;
    public final String A01;

    public C14180ok(String str, long j2) {
        C13710nw.A01(str);
        this.A01 = str;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14180ok) {
            C14180ok r7 = (C14180ok) obj;
            return this.A00 == r7.A00 && this.A01.equals(r7.A01);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Long.valueOf(this.A00)});
    }
}
