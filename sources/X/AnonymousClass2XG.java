package X;

import java.util.Arrays;

/* renamed from: X.2XG  reason: invalid class name */
public class AnonymousClass2XG {
    public final int A00;
    public final int A01;
    public final int A02;

    public AnonymousClass2XG(int i2, int i3, int i4) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2XG r5 = (AnonymousClass2XG) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02)});
    }
}
