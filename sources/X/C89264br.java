package X;

/* renamed from: X.4br  reason: invalid class name and case insensitive filesystem */
public final class C89264br {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public C89264br() {
        this(0, 0, 0, 0);
    }

    public C89264br(int i2, int i3, int i4, int i5) {
        this.A01 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A00 = i5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89264br) {
                C89264br r5 = (C89264br) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Margins(left=");
        A0r.append(this.A01);
        A0r.append(", top=");
        A0r.append(this.A03);
        A0r.append(", right=");
        A0r.append(this.A02);
        A0r.append(", bottom=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
