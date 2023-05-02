package X;

import com.facebook.redex.IDxComparatorShape20S0000000_2_I1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.31o  reason: invalid class name and case insensitive filesystem */
public class C604331o extends AnonymousClass2HH {
    public final AnonymousClass160 A00;
    public final Set A01;

    public C604331o(AnonymousClass2HF r3, AnonymousClass160 r4, AnonymousClass1GR r5, C16320sq r6, List list) {
        super(r3, r4, r5, r6);
        this.A00 = r4;
        TreeSet treeSet = new TreeSet(new IDxComparatorShape20S0000000_2_I1(16));
        this.A01 = treeSet;
        treeSet.addAll(list);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0A = this.A00.A0A();
        ArrayList A0u = AnonymousClass000.A0u();
        for (Object next : A0A) {
            if (!this.A01.contains(next)) {
                A0u.add(next);
            }
        }
        Set set = this.A01;
        A0u.addAll(set);
        C83684Hq A0B = A0B(A0u);
        ArrayList A0i = C13690nt.A0i(set.size());
        for (Object next2 : A0B.A00) {
            if (set.contains(next2)) {
                A0i.add(next2);
            }
        }
        return new C83684Hq(A0i, A0B.A01);
    }
}
