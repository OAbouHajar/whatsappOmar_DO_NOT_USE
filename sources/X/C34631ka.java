package X;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.1ka  reason: invalid class name and case insensitive filesystem */
public class C34631ka {
    public final C34641kb A00;
    public final C34651kc A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Collection A04;
    public final boolean A05;
    public final boolean A06;

    public C34631ka(C34641kb r1, C34651kc r2, Boolean bool, Boolean bool2, Collection collection, boolean z2, boolean z3) {
        this.A03 = bool;
        this.A02 = bool2;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = z2;
        this.A04 = collection;
        this.A05 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C34631ka r5 = (C34631ka) obj;
            if (!C34901l3.A00(this.A03, r5.A03) || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A00, r5.A00) || !C34901l3.A00(this.A01, r5.A01) || this.A06 != r5.A06 || !C34901l3.A00(this.A04, r5.A04) || this.A05 != r5.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, this.A00, null, this.A01, Boolean.valueOf(this.A06), this.A04, Boolean.valueOf(this.A05)});
    }
}
