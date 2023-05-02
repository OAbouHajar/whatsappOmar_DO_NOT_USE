package X;

/* renamed from: X.5vD  reason: invalid class name and case insensitive filesystem */
public final class C118765vD {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public C118765vD(String str, int i2, int i3, int i4, int i5) {
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = str;
        this.A03 = i4;
        this.A00 = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C118765vD) {
            C118765vD r4 = (C118765vD) obj;
            if (this.A02 == r4.A02 && this.A01 == r4.A01 && this.A03 == r4.A03 && this.A00 == r4.A00) {
                return this.A04.equals(r4.A04);
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.A02 * 31) + this.A01) * 31) + this.A04.hashCode()) * 31) + this.A03) * 31) + this.A00;
    }
}
