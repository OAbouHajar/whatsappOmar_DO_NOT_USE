package X;

import java.util.ArrayList;

/* renamed from: X.0bL  reason: invalid class name and case insensitive filesystem */
public class C07420bL implements AnonymousClass051 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ AnonymousClass02C A03;

    public C07420bL(AnonymousClass02C r1, String str, int i2, int i3) {
        this.A03 = r1;
        this.A02 = str;
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean A9O(ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        AnonymousClass02C r2 = this.A03;
        AnonymousClass01A r1 = r2.A06;
        if (r1 != null && this.A01 < 0 && this.A02 == null && r1.A0F().A0p()) {
            return false;
        }
        String str = this.A02;
        int i3 = this.A01;
        int i4 = this.A00;
        ArrayList arrayList3 = r2.A0E;
        if (arrayList3 == null) {
            return false;
        }
        if (str != null || i3 >= 0) {
            i2 = arrayList3.size() - 1;
            while (i2 >= 0) {
                AnonymousClass050 r12 = (AnonymousClass050) arrayList3.get(i2);
                if ((str == null || !str.equals(r12.A0A)) && (i3 < 0 || i3 != r12.A04)) {
                    i2--;
                } else if ((i4 & 1) != 0) {
                    while (true) {
                        i2--;
                        if (i2 < 0) {
                            break;
                        }
                        AnonymousClass050 r13 = (AnonymousClass050) arrayList3.get(i2);
                        if ((str == null || !str.equals(r13.A0A)) && (i3 < 0 || i3 != r13.A04)) {
                            break;
                        }
                    }
                }
            }
            return false;
        } else if ((i4 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(arrayList3.remove(size));
            arrayList2.add(Boolean.TRUE);
            return true;
        } else {
            i2 = -1;
        }
        if (i2 == arrayList3.size() - 1) {
            return false;
        }
        for (int size2 = arrayList3.size() - 1; size2 > i2; size2--) {
            arrayList.add(arrayList3.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }
}
