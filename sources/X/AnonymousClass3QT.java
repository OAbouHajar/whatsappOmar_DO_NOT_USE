package X;

import java.util.List;

/* renamed from: X.3QT  reason: invalid class name */
public class AnonymousClass3QT extends AnonymousClass07A {
    public final List A00;
    public final List A01;
    public final /* synthetic */ AnonymousClass3R6 A02;

    public AnonymousClass3QT(AnonymousClass3R6 r1, List list, List list2) {
        this.A02 = r1;
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
        return AnonymousClass000.A1Y(this.A01.get(i2), this.A00.get(i3));
    }
}
