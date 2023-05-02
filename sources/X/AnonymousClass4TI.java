package X;

import java.util.Arrays;

/* renamed from: X.4TI  reason: invalid class name */
public final class AnonymousClass4TI {
    public int A00;
    public final AnonymousClass5LS[] A01;

    public AnonymousClass4TI(AnonymousClass5LS... r1) {
        this.A01 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass4TI.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A01, ((AnonymousClass4TI) obj).A01);
    }

    public int hashCode() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = 527 + Arrays.hashCode(this.A01);
        this.A00 = hashCode;
        return hashCode;
    }
}
