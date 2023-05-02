package X;

import java.util.List;

/* renamed from: X.3QP  reason: invalid class name */
public final class AnonymousClass3QP extends AnonymousClass07A {
    public final List A00;
    public final List A01;

    public AnonymousClass3QP(List list, List list2) {
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
        return C18450wi.A0R(((AnonymousClass2KI) this.A01.get(i2)).A06, ((AnonymousClass2KI) this.A00.get(i3)).A06);
    }

    public boolean A04(int i2, int i3) {
        return C18450wi.A0R(this.A01.get(i2), this.A00.get(i3));
    }
}
