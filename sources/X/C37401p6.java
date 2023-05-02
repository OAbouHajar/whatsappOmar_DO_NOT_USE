package X;

import java.util.Arrays;

/* renamed from: X.1p6  reason: invalid class name and case insensitive filesystem */
public class C37401p6 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C37401p6(int i2, long j2, long j3, long j4, long j5) {
        this.A00 = i2;
        this.A04 = j2;
        this.A01 = j3;
        this.A03 = j4;
        this.A02 = j5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C37401p6)) {
                return false;
            }
            C37401p6 r7 = (C37401p6) obj;
            if (!(this.A00 == r7.A00 && this.A04 == r7.A04 && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A02 == r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A04), Long.valueOf(this.A01), Long.valueOf(this.A03), Long.valueOf(this.A02)});
    }
}
