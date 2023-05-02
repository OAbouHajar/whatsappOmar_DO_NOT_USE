package X;

import java.math.BigInteger;

/* renamed from: X.59j  reason: invalid class name and case insensitive filesystem */
public class C1054059j implements C46932Gv {
    public BigInteger A00;
    public BigInteger A01;
    public BigInteger A02;
    public AnonymousClass4UA A03;

    public C1054059j(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, AnonymousClass4UA r4) {
        this.A00 = bigInteger3;
        this.A01 = bigInteger;
        this.A02 = bigInteger2;
        this.A03 = r4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1054059j)) {
            return false;
        }
        C1054059j r4 = (C1054059j) obj;
        return r4.A01.equals(this.A01) && r4.A02.equals(this.A02) && r4.A00.equals(this.A00);
    }

    public int hashCode() {
        return (this.A01.hashCode() ^ this.A02.hashCode()) ^ this.A00.hashCode();
    }
}
