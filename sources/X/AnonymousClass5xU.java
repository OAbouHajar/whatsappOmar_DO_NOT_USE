package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5xU  reason: invalid class name */
public class AnonymousClass5xU {
    public AnonymousClass5vQ A00;
    public AnonymousClass5vQ A01;
    public AnonymousClass5vQ A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public AnonymousClass5xU(int i2, int i3, int i4) {
        this.A04 = i2;
        this.A03 = i3;
        this.A05 = i4;
    }

    public static double A00(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0.0d;
        }
        return ((double) Math.max(i2, i3)) / ((double) Math.min(i2, i3));
    }

    public static AnonymousClass5vQ A01(AnonymousClass5vQ r9, AnonymousClass5vQ r10) {
        int i2 = r9.A02;
        int i3 = r9.A01;
        double A002 = A00(i2, i3);
        int i4 = r10.A02;
        int i5 = r10.A01;
        if (Math.abs(A002 - A00(i4, i5)) <= ((double) 0.02f)) {
            return r9;
        }
        if ((i2 - i3) * (i4 - i5) < 0) {
            r10 = new AnonymousClass5vQ(i5, i4);
        }
        float f2 = (float) r10.A01;
        float f3 = (float) r10.A02;
        int i6 = (int) (((float) i2) * (f2 / f3));
        return i6 <= i3 ? new AnonymousClass5vQ(i2, i6) : new AnonymousClass5vQ((int) (((float) i3) * (f3 / f2)), i3);
    }

    public static AnonymousClass5vQ A02(AnonymousClass5vQ r18, List list, Set set, double d2) {
        AnonymousClass5vQ r7 = null;
        AnonymousClass5vQ r0 = r18;
        int i2 = r0.A02;
        int i3 = r0.A01;
        int max = Math.max(i2, i3);
        int min = Math.min(i2, i3);
        if (d2 <= 0.0d) {
            d2 = A00(i2, i3);
        }
        double d3 = Double.MAX_VALUE;
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AnonymousClass5vQ r6 = (AnonymousClass5vQ) it.next();
            int i4 = r6.A02;
            int i5 = r6.A01;
            int max2 = Math.max(i4, i5);
            int min2 = Math.min(i4, i5);
            double A002 = A00(i4, i5);
            Set set2 = set;
            if (set == null || set2.isEmpty() || set2.contains(Double.valueOf(A002))) {
                if (max2 == max && min2 == min && Math.abs(A002 - d2) <= 0.001d) {
                    return r6;
                }
                double abs = Math.abs(d2 - A002);
                double d4 = abs - d3;
                if (d4 <= 0.001d) {
                    if (Math.abs(d4) > 0.001d) {
                        d3 = abs;
                        r7 = null;
                        z2 = false;
                    }
                    if (max2 < max || min2 < min) {
                        if (!z2) {
                            if (r7 != null && Long.signum((((long) i4) * ((long) i5)) - (((long) r7.A02) * ((long) r7.A01))) <= 0) {
                            }
                        }
                    } else if (!z2) {
                        r7 = r6;
                        z2 = true;
                    } else if (r7 != null) {
                        if (Long.signum((((long) i4) * ((long) i5)) - (((long) r7.A02) * ((long) r7.A01))) >= 0) {
                        }
                    }
                    r7 = r6;
                }
            }
        }
        return r7;
    }

    public static List A03(List list, int i2) {
        ArrayList A0i = C13690nt.A0i(list.size());
        AnonymousClass5vQ r5 = null;
        for (int i3 = 0; i3 < list.size(); i3++) {
            AnonymousClass5vQ r3 = (AnonymousClass5vQ) list.get(i3);
            if (r3.A02 * r3.A01 <= i2) {
                A0i.add(r3);
            }
            if (r5 == null || r3.A02 * r3.A01 < r5.A02 * r5.A01) {
                r5 = r3;
            }
        }
        if (A0i.isEmpty() && r5 != null) {
            A0i.add(r5);
        }
        return A0i;
    }

    public final C116945sC A04(List list, List list2, List list3, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        HashSet hashSet;
        AnonymousClass5vQ r8;
        int i7 = i2;
        int i8 = i3;
        List list4 = list2;
        List<AnonymousClass5vQ> list5 = list;
        AnonymousClass5vQ r3 = new AnonymousClass5vQ(Math.max(i7, i8), Math.min(i7, i8));
        int i9 = this.A04;
        if (i9 > 0) {
            float f2 = (float) i9;
            i5 = (int) (0.8f * f2);
            i4 = (int) (f2 * 1.2f);
        } else {
            i4 = 3145728;
            i5 = 0;
        }
        List A032 = A03(list3, i4);
        if (list != null) {
            list5 = A03(list5, 10485760);
        }
        if (list2 != null) {
            list4 = A03(list4, AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END);
        }
        if (list5 != null) {
            i6 = this.A03;
            if (i6 <= 0) {
                i6 = r3.A02 * r3.A01;
            }
            int i10 = 0;
            if (i6 > 0) {
                Iterator it = list5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass5vQ A012 = A01((AnonymousClass5vQ) it.next(), r3);
                    int i11 = A012.A02 * A012.A01;
                    if (i11 > i10) {
                        if (i11 >= i6) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            }
            i6 = i10;
        } else {
            i6 = 0;
        }
        int i12 = this.A05;
        if (i5 != 0) {
            double A002 = A00(r3.A02, r3.A01);
            double sqrt = Math.sqrt(((double) i5) / A002);
            r3 = new AnonymousClass5vQ((int) (A002 * sqrt), (int) sqrt);
        }
        int i13 = 0;
        AnonymousClass5vQ r10 = null;
        if (i6 <= 0 || list5 == null) {
            hashSet = null;
        } else {
            i13 = (int) (((double) i6) * 0.85d);
            hashSet = C13680ns.A0o();
            for (AnonymousClass5vQ r82 : list5) {
                AnonymousClass5vQ A013 = A01(r82, r3);
                if (A013.A02 * A013.A01 >= i13) {
                    hashSet.add(Double.valueOf(A00(r82.A02, r82.A01)));
                }
            }
        }
        AnonymousClass5vQ A022 = A02(r3, A032, hashSet, 0.0d);
        if (A022 == null && (A022 = A02(r3, A032, (Set) null, 0.0d)) == null) {
            throw AnonymousClass000.A0a("Could not calculate preview size.");
        }
        double A003 = A00(A022.A02, A022.A01);
        if (list5 != null) {
            if (i6 > 0) {
                double sqrt2 = Math.sqrt(((double) i13) / A003);
                r3 = new AnonymousClass5vQ((int) (A003 * sqrt2), (int) sqrt2);
            }
            r8 = A02(r3, list5, (Set) null, A003);
        } else {
            r8 = null;
        }
        if (list4 != null) {
            if (i12 == 0) {
                r10 = A02(A022, list4, (Set) null, A003);
            } else {
                double d2 = 0.0d;
                if (A003 != 0.0d) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < list4.size(); i15++) {
                        AnonymousClass5vQ r6 = (AnonymousClass5vQ) list4.get(i15);
                        int i16 = r6.A02;
                        int i17 = r6.A01;
                        int i18 = i16 * i17;
                        double A004 = A00(i16, i17);
                        int abs = Math.abs(i12 - i18);
                        double abs2 = Math.abs(A003 - A004);
                        if (r10 != null) {
                            double d3 = (double) i18;
                            if (((double) (((int) (abs2 * d3)) + abs)) >= ((double) (((int) (d3 * d2)) + i14))) {
                            }
                        }
                        r10 = r6;
                        d2 = abs2;
                        i14 = abs;
                    }
                }
            }
        }
        this.A01 = A022;
        this.A00 = r8;
        this.A02 = r10;
        return new C116945sC(A022, r8, r10);
    }
}
