package X;

/* renamed from: X.1c4  reason: invalid class name and case insensitive filesystem */
public class C30281c4 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public C30281c4(C30281c4 r3) {
        this.A04 = r3.A04;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A02 = r3.A02;
    }

    public C30281c4(Object obj, int i2, int i3, int i4, long j2) {
        this.A04 = obj;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j2;
        this.A02 = i4;
    }

    public boolean A00() {
        return this.A00 != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30281c4)) {
            return false;
        }
        C30281c4 r7 = (C30281c4) obj;
        return this.A04.equals(r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A02 == r7.A02;
    }

    public int hashCode() {
        return ((((((((527 + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03)) * 31) + this.A02;
    }
}
