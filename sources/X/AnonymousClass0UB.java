package X;

import android.util.SparseBooleanArray;
import java.util.List;
import java.util.Map;

/* renamed from: X.0UB  reason: invalid class name */
public final class AnonymousClass0UB {
    public static final C11930jZ A05 = new C07520c2();
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final AnonymousClass0S5 A01;
    public final List A02;
    public final List A03;
    public final Map A04 = new AnonymousClass00N();

    public AnonymousClass0UB(List list, List list2) {
        this.A02 = list;
        this.A03 = list2;
        List list3 = this.A02;
        int size = list3.size();
        int i2 = Integer.MIN_VALUE;
        AnonymousClass0S5 r3 = null;
        for (int i3 = 0; i3 < size; i3++) {
            AnonymousClass0S5 r1 = (AnonymousClass0S5) list3.get(i3);
            if (r1.A06 > i2) {
                i2 = r1.A06;
                r3 = r1;
            }
        }
        this.A01 = r3;
    }
}
