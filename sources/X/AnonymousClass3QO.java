package X;

import java.util.List;

/* renamed from: X.3QO  reason: invalid class name */
public final class AnonymousClass3QO extends AnonymousClass07A {
    public List A00;
    public List A01;

    public AnonymousClass3QO(List list, List list2) {
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
        return ((C37921px) this.A01.get(i2)).A0U.equals(((C37921px) this.A00.get(i3)).A0U);
    }
}
