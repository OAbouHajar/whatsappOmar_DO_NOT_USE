package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1mR  reason: invalid class name and case insensitive filesystem */
public class C35751mR {
    public final int A00;
    public final int A01;
    public final Set A02;

    public C35751mR(Set set, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public static C35751mR A00(C35741mQ r4) {
        int i2 = r4.A00;
        if ((i2 & 1) != 1 || (i2 & 2) != 2 || r4.A04.size() == 0) {
            return null;
        }
        return new C35751mR(new HashSet(r4.A04), r4.A03, r4.A01);
    }

    public C35741mQ A01() {
        C28581Wr A0U = C35741mQ.A05.A0U();
        int i2 = this.A01;
        A0U.A03();
        C35741mQ r1 = (C35741mQ) A0U.A00;
        r1.A00 |= 1;
        r1.A03 = i2;
        int i3 = this.A00;
        A0U.A03();
        C35741mQ r12 = (C35741mQ) A0U.A00;
        r12.A00 |= 2;
        r12.A01 = i3;
        Set set = this.A02;
        A0U.A03();
        C35741mQ r2 = (C35741mQ) A0U.A00;
        AnonymousClass27P r13 = r2.A04;
        if (!((AnonymousClass1XF) r13).A00) {
            r13 = C28541Wm.A0F(r13);
            r2.A04 = r13;
        }
        C28591Ws.A01(set, r13);
        return (C35741mQ) A0U.A02();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35751mR)) {
            return false;
        }
        C35751mR r4 = (C35751mR) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00 && this.A02.equals(r4.A02);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A02});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncdKeyFingerprint{");
        sb.append("rawId=");
        sb.append(this.A01);
        sb.append(", currentIndex=");
        sb.append(this.A00);
        sb.append(", deviceIndexes=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
