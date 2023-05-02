package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ta  reason: invalid class name and case insensitive filesystem */
public final class C99164ta implements AnonymousClass5RK {
    public final List A00;

    public C99164ta(List list) {
        this.A00 = C13680ns.A0n(list);
    }

    public C31201dg A51(C31201dg r12) {
        List list;
        int i2;
        ArrayList arrayList = null;
        int i3 = 0;
        C31201dg r5 = r12;
        while (true) {
            list = this.A00;
            if (i3 >= list.size()) {
                break;
            }
            Pair pair = (Pair) list.get(i3);
            if (((AnonymousClass5OP) pair.first).Agf(r5)) {
                if (arrayList == null) {
                    arrayList = AnonymousClass000.A0u();
                }
                arrayList.add(pair);
                AnonymousClass4SR r2 = (AnonymousClass4SR) pair.second;
                if (r2 instanceof C69953fs) {
                    C69953fs r22 = (C69953fs) r2;
                    int i4 = r22.A00;
                    Object obj = r22.A01;
                    Object obj2 = r5.A02.get(i4);
                    if (obj2 != obj) {
                        if (!(obj instanceof Number)) {
                            i2 = !AnonymousClass45W.A00(obj2, obj);
                        } else if (obj2 instanceof Number) {
                            Number number = (Number) obj2;
                            Number number2 = (Number) obj;
                            if (number.longValue() == number2.longValue()) {
                                i2 = (number.doubleValue() > number2.doubleValue() ? 1 : (number.doubleValue() == number2.doubleValue() ? 0 : -1));
                            }
                        }
                        if (i2 == 0) {
                        }
                    }
                }
                if (r5 == r12) {
                    r5 = new C31201dg(r12, (C31201dg) null, r12.A05, r12.A00);
                }
                ((AnonymousClass4SR) pair.second).A00(r5);
            }
            i3++;
        }
        if (arrayList != null) {
            list.removeAll(arrayList);
        }
        return r5;
    }

    public void AZQ(C31201dg r1) {
    }
}
