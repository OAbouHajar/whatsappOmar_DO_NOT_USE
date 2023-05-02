package X;

import java.net.InetAddress;
import java.util.Locale;

/* renamed from: X.1mS  reason: invalid class name and case insensitive filesystem */
public final class C35761mS {
    public final int A00;
    public final Long A01;
    public final Short A02;
    public final InetAddress A03;
    public final boolean A04;
    public final boolean A05;

    public C35761mS(Long l2, Short sh, InetAddress inetAddress, int i2, boolean z2, boolean z3) {
        this.A01 = l2;
        this.A03 = inetAddress;
        this.A02 = sh;
        this.A05 = z2;
        this.A04 = z3;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C35761mS)) {
            return false;
        }
        C35761mS r4 = (C35761mS) obj;
        Long l2 = this.A01;
        Long l3 = r4.A01;
        if (l2 != l3 && (l2 == null || !l2.equals(l3))) {
            return false;
        }
        InetAddress inetAddress = this.A03;
        InetAddress inetAddress2 = r4.A03;
        if (inetAddress != inetAddress2 && (inetAddress == null || !inetAddress.equals(inetAddress2))) {
            return false;
        }
        Short sh = this.A02;
        Short sh2 = r4.A02;
        return sh == sh2 || (sh != null && sh.equals(sh2));
    }

    public int hashCode() {
        Long l2 = this.A01;
        int i2 = 0;
        int hashCode = ((l2 != null ? l2.hashCode() : 0) + 41) * 41;
        InetAddress inetAddress = this.A03;
        int hashCode2 = (hashCode + (inetAddress != null ? inetAddress.hashCode() : 0)) * 41;
        Short sh = this.A02;
        if (sh != null) {
            i2 = sh.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return String.format(Locale.US, "%s:%d EXPIRE: %tc", new Object[]{this.A03, this.A02, this.A01});
    }
}
