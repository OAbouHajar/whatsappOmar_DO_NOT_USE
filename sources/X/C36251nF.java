package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.1nF  reason: invalid class name and case insensitive filesystem */
public class C36251nF implements Comparable {
    public final byte[] A00;

    public C36251nF(byte[] bArr) {
        this.A00 = bArr;
    }

    public byte[] A00() {
        return C36581nm.A00(new byte[]{5}, this.A00);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return new BigInteger(this.A00).compareTo(new BigInteger(((C36251nF) obj).A00));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C36251nF)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C36251nF) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }
}
