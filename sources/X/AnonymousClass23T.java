package X;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.23T  reason: invalid class name */
public class AnonymousClass23T {
    public final C16040sK A00;
    public final Map A01 = new ConcurrentHashMap();
    public final Map A02 = new ConcurrentHashMap();
    public final TreeSet A03 = new TreeSet();

    public AnonymousClass23T(C16040sK r3, List list) {
        this.A00 = r3;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A04((C38541qx) it.next());
        }
    }

    public static final String A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        AnonymousClass00B.A06(str);
        return !C37941pz.A02(str) ? "□" : C37781pj.A00(C62153Bw.A07(new C37781pj(new C37781pj(C37941pz.A03(new C37781pj(str).A00)).toString()).A00));
    }

    public synchronized int A01() {
        int i2;
        i2 = 0;
        Iterator A032 = A03();
        while (A032.hasNext()) {
            AnonymousClass23U r1 = (AnonymousClass23U) A032.next();
            if (!TextUtils.isEmpty(r1.A02)) {
                i2 += r1.A04.size();
            }
        }
        return i2;
    }

    public synchronized Collection A02() {
        return this.A02.values();
    }

    public synchronized Iterator A03() {
        return this.A03.descendingIterator();
    }

    public synchronized void A04(C38541qx r14) {
        AnonymousClass23U r0;
        TreeSet treeSet;
        if (!(r14 instanceof C39101rv)) {
            AnonymousClass00B.A08("Wrong message add on passed into MessageReactionsImpl");
        } else {
            C16040sK r4 = this.A00;
            r4.A0B();
            C15830rv r5 = r4.A05;
            if (r5 == null) {
                AnonymousClass00B.A08("myUserJid is null. User logged out?");
            } else {
                C39101rv r142 = (C39101rv) r14;
                Map map = this.A02;
                C28381Vw r1 = r142.A11;
                map.put(r1.A01, r142);
                if (!r1.A02) {
                    r5 = r142.A0C();
                    AnonymousClass00B.A06(r5);
                }
                C55792kN r3 = new C55792kN(r4, r5, r142.A01, r142.A00, r142.A0I, r142.A00);
                String A002 = A00(r3.A05);
                if (!TextUtils.isEmpty(A002)) {
                    Map map2 = this.A01;
                    if (!map2.containsKey(A002)) {
                        r0 = new AnonymousClass23U(r4, r3, A002);
                        map2.put(A002, r0);
                        treeSet = this.A03;
                    } else {
                        Object obj = map2.get(A002);
                        AnonymousClass00B.A06(obj);
                        r0 = (AnonymousClass23U) obj;
                        treeSet = this.A03;
                        treeSet.remove(r0);
                        r0.A00(r3);
                    }
                    treeSet.add(r0);
                }
            }
        }
    }
}
