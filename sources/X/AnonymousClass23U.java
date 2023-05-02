package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.TreeSet;

/* renamed from: X.23U  reason: invalid class name */
public class AnonymousClass23U implements Comparable {
    public int A00 = 0;
    public final C16040sK A01;
    public final String A02;
    public final HashMap A03 = new HashMap();
    public final TreeSet A04 = new TreeSet();

    public AnonymousClass23U(C16040sK r2, C55792kN r3, String str) {
        this.A01 = r2;
        this.A02 = str;
        A00(r3);
    }

    public void A00(C55792kN r5) {
        C15830rv r3 = r5.A04;
        Pair pair = new Pair(r3, Long.valueOf(r5.A00));
        HashMap hashMap = this.A03;
        if (!hashMap.containsKey(pair)) {
            hashMap.put(pair, r5);
            this.A04.add(r5);
            if (this.A01.A0I(r3)) {
                this.A00++;
            }
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass23U r8 = (AnonymousClass23U) obj;
        boolean z2 = false;
        if (this.A00 > 0) {
            z2 = true;
        }
        boolean z3 = false;
        if (r8.A00 > 0) {
            z3 = true;
        }
        if (z2 != z3) {
            return z2 ? 1 : -1;
        }
        TreeSet treeSet = this.A04;
        TreeSet treeSet2 = r8.A04;
        int i2 = (((long) treeSet.size()) > ((long) treeSet2.size()) ? 1 : (((long) treeSet.size()) == ((long) treeSet2.size()) ? 0 : -1));
        if (i2 != 0) {
            return i2;
        }
        int i3 = (((C55792kN) treeSet.first()).A02 > ((C55792kN) treeSet2.first()).A02 ? 1 : (((C55792kN) treeSet.first()).A02 == ((C55792kN) treeSet2.first()).A02 ? 0 : -1));
        return i3 == 0 ? this.A02.compareTo(r8.A02) : i3;
    }
}
