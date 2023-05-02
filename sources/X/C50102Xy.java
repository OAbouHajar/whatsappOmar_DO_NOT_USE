package X;

import java.util.Arrays;

/* renamed from: X.2Xy  reason: invalid class name and case insensitive filesystem */
public class C50102Xy {
    public long A00;
    public final C35701mM A01;

    public C50102Xy(C35701mM r1, long j2) {
        this.A01 = r1;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C50102Xy)) {
                return false;
            }
            C50102Xy r7 = (C50102Xy) obj;
            if (this.A00 != r7.A00 || !this.A01.equals(r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Long.valueOf(this.A00)});
    }
}
