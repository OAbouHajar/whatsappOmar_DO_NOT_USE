package X;

import java.util.Arrays;

/* renamed from: X.26J  reason: invalid class name */
public class AnonymousClass26J {
    public final int A00;

    public AnonymousClass26J(int i2) {
        this.A00 = i2;
    }

    public boolean A00(AnonymousClass26J r4) {
        return this.A00 == r4.A00;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnonymousClass26J) && this.A00 == ((AnonymousClass26J) obj).A00;
    }

    public int hashCode() {
        return 31 + Arrays.hashCode(new Object[]{Integer.valueOf(this.A00)});
    }
}
