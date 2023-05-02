package X;

import java.util.Arrays;

/* renamed from: X.20m  reason: invalid class name and case insensitive filesystem */
public class C435520m {
    public final C434720d A00;
    public final boolean A01;

    public C435520m(C434720d r1, boolean z2) {
        this.A01 = z2;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C435520m)) {
            return false;
        }
        C435520m r4 = (C435520m) obj;
        return this.A01 == r4.A01 && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A01), this.A00});
    }
}
