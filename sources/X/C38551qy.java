package X;

import java.util.Arrays;

/* renamed from: X.1qy  reason: invalid class name and case insensitive filesystem */
public class C38551qy {
    public final C15830rv A00;
    public final C15830rv A01;
    public final boolean A02;

    public C38551qy(C15830rv r1, C15830rv r2, boolean z2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C38551qy)) {
                C38551qy r5 = (C38551qy) obj;
                if (!C34901l3.A00(this.A00, r5.A00) || !C34901l3.A00(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, Boolean.valueOf(this.A02)});
    }
}
