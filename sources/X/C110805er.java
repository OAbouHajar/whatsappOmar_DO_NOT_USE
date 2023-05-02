package X;

import java.util.List;

/* renamed from: X.5er  reason: invalid class name and case insensitive filesystem */
public class C110805er extends AnonymousClass07A {
    public final List A00;
    public final List A01;

    public C110805er(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i2, int i3) {
        List list = this.A01;
        boolean z2 = ((C118275uQ) list.get(i2)).A00;
        List list2 = this.A00;
        return z2 == ((C118275uQ) list2.get(i3)).A00 && ((C118275uQ) list.get(i2)).A01 == ((C118275uQ) list2.get(i3)).A01 && ((C118275uQ) list.get(i2)).A02 == ((C118275uQ) list2.get(i3)).A02;
    }

    public boolean A04(int i2, int i3) {
        C35361lo r1 = ((C118275uQ) this.A01.get(i2)).A03;
        C35361lo r2 = ((C118275uQ) this.A00.get(i3)).A03;
        if (r1 == null) {
            return r2 == null;
        }
        if (r2 != null) {
            return r1.A0F.equals(r2.A0F);
        }
    }
}
