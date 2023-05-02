package X;

import java.util.Arrays;

/* renamed from: X.2Xh  reason: invalid class name and case insensitive filesystem */
public class C50012Xh {
    public int A00;
    public int A01;
    public boolean A02;

    public C50012Xh(int i2, int i3, boolean z2) {
        this.A01 = i2;
        this.A02 = z2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C50012Xh)) {
            return false;
        }
        C50012Xh r4 = (C50012Xh) obj;
        return this.A01 == r4.A01 && this.A02 == r4.A02 && this.A00 == r4.A00;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Boolean.valueOf(this.A02), Integer.valueOf(this.A00)});
    }
}
