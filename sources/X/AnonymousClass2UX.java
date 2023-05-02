package X;

import android.util.Pair;
import android.util.SparseIntArray;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2UX  reason: invalid class name */
public final class AnonymousClass2UX extends ArrayList<AnonymousClass2UZ> {
    public static final C55962kj A00 = new C55962kj(Integer.valueOf(R.string.str145b), 27);
    public static final C55962kj A01 = new C55962kj(Integer.valueOf(R.string.str14ae), 1);
    public static final C55962kj A02 = new C55962kj(Integer.valueOf(R.string.str1546), 24);
    public static final C55962kj A03 = new C55962kj(Integer.valueOf(R.string.str0c01), 1);
    public static final C55962kj A04 = new C55962kj(Integer.valueOf(R.string.str14af), 1);
    public static final C55962kj A05 = new C55962kj(false, 13);
    public static final C55962kj A06 = new C55962kj(true, 13);
    public static final C55962kj A07 = new C55962kj(Integer.valueOf(R.string.str14b0), 1);
    public C56112kz latestBucket = null;
    public final C56122l0 timeBucketsProvider;

    public AnonymousClass2UX(C16980tz r3, AnonymousClass013 r4) {
        this.timeBucketsProvider = new C56122l0(r3.A00, r4);
    }

    public int A00(int i2) {
        if (i2 < 0 || i2 >= size()) {
            return -1;
        }
        return ((AnonymousClass2UZ) get(i2)).A00;
    }

    public C49902Wp A01(int i2) {
        return (C49902Wp) get(i2);
    }

    public C16740tZ A02(int i2) {
        return (C16740tZ) ((AnonymousClass2UZ) get(i2)).A01;
    }

    public void A03(SparseIntArray sparseIntArray) {
        add(new C55962kj(sparseIntArray.clone(), 4));
    }

    public void A04(C14710pd r5, List list, boolean z2) {
        Object r1;
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16740tZ r2 = (C16740tZ) it.next();
            if (r2 != null) {
                if (z2) {
                    A05(r2, false);
                }
                if (r2 instanceof C30581cc) {
                    r1 = C30931dC.A05(r2.A0I(), true) != null ? new C55962kj(r2, 19) : new C55962kj(r2, 7);
                } else if (r2 instanceof C38631rA) {
                    r1 = new C55962kj(r2, 11);
                } else if (r2 instanceof C30901d9) {
                    r1 = new C55962kj(r2, 20);
                } else if (r2 instanceof C38701rH) {
                    C38701rH r22 = (C38701rH) r2;
                    r1 = r22.A1B() ? new C55962kj(r22, 15) : new C55962kj(r22, 14);
                } else {
                    if (!(r2 instanceof C38891ra)) {
                        if (r2 instanceof C38681rF) {
                            r1 = new C55962kj(r2, 16);
                        } else if (r2 instanceof C38711rI) {
                            r1 = new C55962kj(r2, 17);
                        } else if (r2 instanceof C38801rR) {
                            r1 = new C55962kj(r2, 18);
                        } else if (r2 instanceof C38741rL) {
                            r1 = new C55962kj(r2, 21);
                        } else if (r2 instanceof C38811rS) {
                            r1 = new C55962kj(r2, 21);
                        } else if ((r2 instanceof C39171s2) && r5.A0E(C16620tM.A02, 2662)) {
                            r1 = new C55962kj(r2, 26);
                        }
                    }
                    r1 = new C56142l2(r2);
                }
                add(r1);
            }
        }
    }

    public void A05(C16740tZ r5, boolean z2) {
        C56112kz A002 = this.timeBucketsProvider.A00(r5.A0I);
        if (!C34901l3.A00(A002, this.latestBucket)) {
            add(new C55962kj(new Pair(A002.toString(), Boolean.valueOf(z2)), 12));
            this.latestBucket = A002;
        }
    }

    public void A06(List list) {
        add(new C55962kj(new C56132l1(new ArrayList(list), 0), 6));
    }

    public void A07(List list) {
        add(new C55962kj(list, 23));
    }

    public void A08(List list) {
        add(new C55962kj(new ArrayList(list), 22));
    }

    public void A09(List list, boolean z2) {
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16740tZ r2 = (C16740tZ) it.next();
            if (r2 instanceof C38801rR) {
                if (z2) {
                    A05(r2, true);
                }
                add(new C55962kj(r2, 8));
            }
        }
    }

    public void A0A(List list, boolean z2) {
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16740tZ r2 = (C16740tZ) it.next();
            if (r2 instanceof C38681rF) {
                if (z2) {
                    A05(r2, true);
                }
                add(new C55962kj(r2, 9));
            }
        }
    }

    public void A0B(List list, boolean z2) {
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16740tZ r2 = (C16740tZ) it.next();
            if (z2) {
                A05(r2, true);
            }
            if (r2 instanceof C38711rI) {
                add(new C55962kj(r2, 10));
            }
        }
    }

    public void A0C(Set set) {
        add(new C55962kj(new C56132l1(new ArrayList(set), 1), 6));
    }
}
