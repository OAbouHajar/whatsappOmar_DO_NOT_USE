package X;

import java.util.List;

/* renamed from: X.3QR  reason: invalid class name */
public class AnonymousClass3QR extends AnonymousClass07A {
    public final List A00;
    public final List A01;

    public AnonymousClass3QR(List list, List list2) {
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
        return ((C83914In) this.A01.get(i2)).A01.equals(((C83914In) this.A00.get(i3)).A01);
    }

    public boolean A04(int i2, int i3) {
        return AnonymousClass000.A1R(((C83914In) this.A01.get(i2)).A00, ((C83914In) this.A00.get(i3)).A00);
    }
}
