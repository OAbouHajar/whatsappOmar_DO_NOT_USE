package X;

import java.util.Arrays;

/* renamed from: X.1Wj  reason: invalid class name and case insensitive filesystem */
public class C28511Wj {
    public final long A00;
    public final C35751mR A01;
    public final byte[] A02;

    public C28511Wj(C35751mR r1, byte[] bArr, long j2) {
        this.A02 = bArr;
        this.A00 = j2;
        this.A01 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28511Wj)) {
            return false;
        }
        C28511Wj r7 = (C28511Wj) obj;
        return this.A00 == r7.A00 && Arrays.equals(this.A02, r7.A02) && this.A01.equals(r7.A01);
    }

    public int hashCode() {
        return (Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A01}) * 31) + Arrays.hashCode(this.A02);
    }

    public String toString() {
        return "SyncdKeyData";
    }
}
