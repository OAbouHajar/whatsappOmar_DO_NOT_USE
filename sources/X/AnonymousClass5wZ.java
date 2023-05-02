package X;

import com.obwhatsapp.R;

/* renamed from: X.5wZ  reason: invalid class name */
public final class AnonymousClass5wZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AnonymousClass5wZ(int i2) {
        this(-1, i2, R.dimen.dimen05a0, R.dimen.dimen05a0);
    }

    public AnonymousClass5wZ(int i2, int i3, int i4, int i5) {
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A03 = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5wZ)) {
            return false;
        }
        AnonymousClass5wZ r4 = (AnonymousClass5wZ) obj;
        return this.A02 == r4.A02 && this.A01 == r4.A01;
    }

    public int hashCode() {
        return ((this.A02 + 31) * 31) + this.A01;
    }
}
