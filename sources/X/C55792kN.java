package X;

import com.whatsapp.jid.Jid;
import java.util.Arrays;

/* renamed from: X.2kN  reason: invalid class name and case insensitive filesystem */
public class C55792kN implements Comparable {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C16040sK A03;
    public final C15830rv A04;
    public final String A05;

    public C55792kN(C16040sK r1, C15830rv r2, String str, long j2, long j3, long j4) {
        this.A03 = r1;
        this.A04 = r2;
        this.A05 = str;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C55792kN r8 = (C55792kN) obj;
        C16040sK r0 = this.A03;
        C15830rv r6 = this.A04;
        boolean A0I = r0.A0I(r6);
        C15830rv r5 = r8.A04;
        if (A0I != r0.A0I(r5)) {
            return A0I ? 1 : -1;
        }
        int i2 = (this.A02 > r8.A02 ? 1 : (this.A02 == r8.A02 ? 0 : -1));
        if (i2 != 0) {
            return i2;
        }
        int compareTo = r6.compareTo((Jid) r5);
        return compareTo == 0 ? (this.A00 > r8.A00 ? 1 : (this.A00 == r8.A00 ? 0 : -1)) : compareTo;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C55792kN)) {
            return false;
        }
        C55792kN r7 = (C55792kN) obj;
        return this.A01 == r7.A01 && this.A02 == r7.A02 && this.A00 == r7.A00 && this.A04.equals(r7.A04) && C34901l3.A00(this.A05, r7.A05);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, Long.valueOf(this.A01), Long.valueOf(this.A02), Long.valueOf(this.A00)});
    }
}
