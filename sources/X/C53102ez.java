package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.2ez  reason: invalid class name and case insensitive filesystem */
public class C53102ez {
    public final int A00;
    public final List A01;

    public C53102ez(List list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A01 = list;
        z2 = z3 ? z2 | true : z2;
        z2 = z4 ? z2 | true : z2;
        z2 = z5 ? z2 | true : z2;
        this.A00 = z6 ? z2 | true : z2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C53102ez r5 = (C53102ez) obj;
            if (this.A00 != r5.A00 || !C34901l3.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00)});
    }
}
