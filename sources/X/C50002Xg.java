package X;

import java.util.List;

/* renamed from: X.2Xg  reason: invalid class name and case insensitive filesystem */
public class C50002Xg extends AnonymousClass07A {
    public List A00;
    public List A01;

    public C50002Xg(List list, List list2) {
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
        return this.A01.get(i2).equals(this.A00.get(i3));
    }

    public boolean A04(int i2, int i3) {
        List list = this.A01;
        if (i2 >= list.size()) {
            return false;
        }
        List list2 = this.A00;
        return i3 < list2.size() && ((AnonymousClass5P6) list.get(i2)).ACu() == ((AnonymousClass5P6) list2.get(i3)).ACu();
    }
}
