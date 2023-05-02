package X;

/* renamed from: X.4Wv  reason: invalid class name and case insensitive filesystem */
public final class C87454Wv {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C30271c3 A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C87454Wv(C30271c3 r1, long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z4) {
        this.A04 = r1;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = j4;
        this.A00 = j5;
        this.A06 = z2;
        this.A07 = z3;
        this.A05 = z4;
    }

    public C87454Wv A00(long j2) {
        return j2 == this.A02 ? this : new C87454Wv(this.A04, this.A03, j2, this.A01, this.A00, this.A06, this.A07, this.A05);
    }

    public C87454Wv A01(long j2) {
        return j2 == this.A03 ? this : new C87454Wv(this.A04, j2, this.A02, this.A01, this.A00, this.A06, this.A07, this.A05);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C87454Wv.class != obj.getClass()) {
                return false;
            }
            C87454Wv r7 = (C87454Wv) obj;
            if (!(this.A03 == r7.A03 && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A06 == r7.A06 && this.A07 == r7.A07 && this.A05 == r7.A05 && AnonymousClass3C1.A0F(this.A04, r7.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass3K3.A07(this.A04.hashCode()) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A01)) * 31) + ((int) this.A00)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0);
    }
}
