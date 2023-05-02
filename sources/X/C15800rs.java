package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0rs  reason: invalid class name and case insensitive filesystem */
public class C15800rs {
    public final C15810rt A00;
    public final ArrayList A01 = new ArrayList();
    public final Comparator A02 = new IDxComparatorShape19S0000000_2_I0(15);

    public C15800rs(C15810rt r3) {
        this.A00 = r3;
    }

    public int A00() {
        int i2;
        C15810rt r4 = this.A00;
        r4.A0C();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (r4.A0G(((C15820ru) it.next()).A01)) {
                    i2++;
                }
            }
        }
        return i2;
    }

    public int A01() {
        int size;
        this.A00.A0C();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            size = arrayList.size();
        }
        return size;
    }

    public int A02() {
        int i2;
        C15810rt r4 = this.A00;
        r4.A0C();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (!r4.A0G(((C15820ru) it.next()).A01)) {
                    i2++;
                }
            }
        }
        return i2;
    }

    public final int A03(C15830rv r4) {
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((C15820ru) arrayList.get(i2)).A01.equals(r4)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    public ArrayList A04() {
        ArrayList arrayList;
        this.A00.A0C();
        ArrayList arrayList2 = this.A01;
        synchronized (arrayList2) {
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C15830rv r1 = ((C15820ru) it.next()).A01;
                if (r1 instanceof UserJid) {
                    arrayList.add((UserJid) r1);
                }
            }
        }
        return arrayList;
    }

    public List A05() {
        ArrayList arrayList;
        this.A00.A0C();
        ArrayList arrayList2 = this.A01;
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C15820ru) it.next()).A01);
            }
        }
        return arrayList;
    }

    public List A06() {
        C15810rt r5 = this.A00;
        r5.A0C();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.A01;
        synchronized (arrayList2) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C15820ru r1 = (C15820ru) it.next();
                if (r5.A0G(r1.A01)) {
                    arrayList.add(r1.A01);
                }
            }
        }
        return arrayList;
    }

    public List A07() {
        ArrayList arrayList;
        this.A00.A0C();
        ArrayList arrayList2 = this.A01;
        synchronized (arrayList2) {
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C15830rv r1 = ((C15820ru) it.next()).A01;
                if (C16030sJ.A0L(r1) || C16030sJ.A0H(r1)) {
                    arrayList.add((C16060sN) r1);
                }
            }
        }
        return arrayList;
    }

    public List A08() {
        C15810rt r5 = this.A00;
        r5.A0C();
        ArrayList arrayList = this.A01;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C15820ru r1 = (C15820ru) it.next();
                if (!r5.A0G(r1.A01)) {
                    arrayList2.add(r1.A01);
                }
            }
        }
        return arrayList2;
    }

    public List A09(C16220sf r8) {
        C15810rt r6 = this.A00;
        r6.A0C();
        ArrayList arrayList = this.A01;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Set A0A = r8.A0A();
        ArrayList arrayList3 = new ArrayList();
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C15820ru) it.next()).A01);
            }
        }
        A0A.retainAll(arrayList3);
        arrayList2.addAll(A0A);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            C15830rv r1 = (C15830rv) it2.next();
            if (!r6.A0G(r1) && !A0A.contains(r1)) {
                arrayList2.add(r1);
            }
        }
        return arrayList2;
    }

    public Set A0A() {
        HashSet hashSet;
        this.A00.A0C();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            hashSet = new HashSet(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C15820ru) it.next()).A01);
            }
        }
        return hashSet;
    }

    public void A0B(C15830rv r3) {
        this.A00.A0C();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            int A03 = A03(r3);
            if (A03 >= 0) {
                arrayList.remove(A03);
            }
        }
    }

    public boolean A0C(C15830rv r3) {
        this.A00.A0C();
        return A03(r3) >= 0;
    }

    public final boolean A0D(C15830rv r7, C15830rv r8, long j2) {
        boolean z2;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            int A03 = A03(r7);
            C15820ru r4 = A03 >= 0 ? (C15820ru) arrayList.remove(A03) : new C15820ru();
            boolean z3 = true;
            if (this.A00.A03(GroupJid.of(r8)) != 1) {
                z3 = false;
            }
            z2 = true;
            if (!z3) {
                AnonymousClass00B.A06(r8);
                r4.A01 = r8;
                r4.A00 = j2;
                int binarySearch = Collections.binarySearch(arrayList, r4, this.A02);
                boolean z4 = false;
                if (binarySearch < 0) {
                    z4 = true;
                }
                AnonymousClass00B.A0F(z4);
                int i2 = (-binarySearch) - 1;
                arrayList.add(i2, r4);
                if (i2 != A03) {
                }
            } else if (A03 >= 0) {
            }
            z2 = false;
        }
        return z2;
    }
}
