package X;

/* renamed from: X.4bF  reason: invalid class name and case insensitive filesystem */
public final class C88884bF {
    public static final C88884bF A02;
    public static final C88884bF A03;
    public final long A00;
    public final long A01;

    static {
        C88884bF r5 = new C88884bF(0, 0);
        A03 = r5;
        new C88884bF(Long.MAX_VALUE, Long.MAX_VALUE);
        new C88884bF(Long.MAX_VALUE, 0);
        new C88884bF(0, Long.MAX_VALUE);
        A02 = r5;
    }

    public C88884bF(long j2, long j3) {
        boolean z2 = true;
        C90524eJ.A03(C13700nu.A0f((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1))));
        C90524eJ.A03(j3 < 0 ? false : z2);
        this.A01 = j2;
        this.A00 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C88884bF.class != obj.getClass()) {
                return false;
            }
            C88884bF r7 = (C88884bF) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
