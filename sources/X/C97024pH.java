package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4pH  reason: invalid class name and case insensitive filesystem */
public final class C97024pH implements AnonymousClass5LJ {
    public final List A00;

    public C97024pH() {
        this(0);
    }

    public C97024pH(int i2) {
        this.A00 = C34641kb.of();
    }

    public final List A00(AnonymousClass4LS r13) {
        ArrayList arrayList;
        boolean z2;
        String str;
        int i2;
        C90504eH r9 = new C90504eH(r13.A03);
        List list = this.A00;
        while (C90504eH.A00(r9) > 0) {
            int A0C = r9.A0C();
            int A0C2 = r9.A01 + r9.A0C();
            if (A0C == 134) {
                ArrayList A0u = AnonymousClass000.A0u();
                int A0C3 = r9.A0C() & 31;
                for (int i3 = 0; i3 < A0C3; i3++) {
                    String A0O = r9.A0O(3);
                    int A0C4 = r9.A0C();
                    boolean z3 = true;
                    if ((A0C4 & 128) != 0) {
                        z2 = true;
                        i2 = A0C4 & 63;
                        str = "application/cea-708";
                    } else {
                        z2 = false;
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte A0C5 = (byte) r9.A0C();
                    r9.A0T(1);
                    List list2 = null;
                    if (z2) {
                        if ((A0C5 & 64) == 0) {
                            z3 = false;
                        }
                        byte[] bArr = new byte[1];
                        if (z3) {
                            bArr[0] = 1;
                        } else {
                            bArr[0] = 0;
                        }
                        list2 = Collections.singletonList(bArr);
                    }
                    C32471gR A0N = AnonymousClass3K4.A0N();
                    A0N.A0R = str;
                    A0N.A0Q = A0O;
                    A0N.A02 = i2;
                    A0N.A0S = list2;
                    A0u.add(new C32491gT(A0N));
                }
                arrayList = A0u;
            } else {
                arrayList = list;
            }
            r9.A0S(A0C2);
            list = arrayList;
        }
        return list;
    }
}
