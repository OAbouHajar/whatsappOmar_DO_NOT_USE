package X;

import android.util.Pair;
import java.util.Arrays;

/* renamed from: X.1WY  reason: invalid class name */
public class AnonymousClass1WY {
    public final C28511Wj A00;
    public final AnonymousClass1WK A01;

    public AnonymousClass1WY(C28511Wj r1, AnonymousClass1WK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static Pair A00(C37581pO r6) {
        AnonymousClass1WY r1;
        C37611pR r12 = r6.A02;
        if (r12 == null) {
            r12 = C37611pR.A02;
        }
        if ((r12.A00 & 1) == 1) {
            AnonymousClass1WK r5 = new AnonymousClass1WK(r12.A01.A04());
            if ((r6.A00 & 2) == 2) {
                C58582tj r62 = r6.A01;
                if (r62 == null) {
                    r62 = C58582tj.A04;
                }
                int i2 = r62.A00;
                if ((i2 & 4) == 4 || (i2 & 2) == 2 || (i2 & 1) == 1) {
                    C35741mQ r0 = r62.A03;
                    if (r0 == null) {
                        r0 = C35741mQ.A05;
                    }
                    C35751mR A002 = C35751mR.A00(r0);
                    if (A002 != null) {
                        r1 = new AnonymousClass1WY(new C28511Wj(A002, r62.A02.A04(), r62.A01), r5);
                    }
                }
                throw new AnonymousClass1X9(57, (String) null);
            }
            r1 = null;
            return new Pair(r5, r1);
        }
        throw new AnonymousClass1X9(53, (String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1WY)) {
            return false;
        }
        AnonymousClass1WY r4 = (AnonymousClass1WY) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncdKey{keyId=");
        sb.append(this.A01);
        sb.append(", syncdKeyData=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
