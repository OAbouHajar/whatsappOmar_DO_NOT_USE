package X;

import java.util.Arrays;

/* renamed from: X.5v5  reason: invalid class name and case insensitive filesystem */
public class C118685v5 {
    public C35301lh A00;
    public final /* synthetic */ AnonymousClass60O A01;

    public C118685v5(C35301lh r1, AnonymousClass60O r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C118685v5)) {
            return false;
        }
        C118685v5 r3 = (C118685v5) obj;
        C35301lh r1 = this.A00;
        return C39841t9.A04(r1) ? C39841t9.A04(r3.A00) : ((String) C110105dW.A0d(r1)).equals(C110105dW.A0d(r3.A00));
    }

    public int hashCode() {
        Object[] A1b = C13680ns.A1b();
        A1b[0] = this.A00.A00;
        return Arrays.hashCode(A1b);
    }
}
