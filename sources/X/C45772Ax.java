package X;

import java.util.Arrays;

/* renamed from: X.2Ax  reason: invalid class name and case insensitive filesystem */
public class C45772Ax {
    public final int A00;
    public final C16740tZ A01;
    public final boolean A02;

    public C45772Ax(C16740tZ r1, int i2, boolean z2) {
        this.A01 = r1;
        this.A00 = i2;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C45772Ax r5 = (C45772Ax) obj;
            if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01.equals(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00), Boolean.valueOf(this.A02)});
    }
}
