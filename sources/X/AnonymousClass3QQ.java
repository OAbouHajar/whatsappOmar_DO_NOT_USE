package X;

import java.util.List;

/* renamed from: X.3QQ  reason: invalid class name */
public class AnonymousClass3QQ extends AnonymousClass07A {
    public final List A00;
    public final List A01;

    public AnonymousClass3QQ(List list, List list2) {
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
        AnonymousClass4UJ r3 = (AnonymousClass4UJ) this.A01.get(i2);
        AnonymousClass4UJ r2 = (AnonymousClass4UJ) this.A00.get(i3);
        return r3.A00 == r2.A00 && C34901l3.A00(r3.A02, r2.A02) && C34901l3.A00(r3.A01, r2.A01);
    }

    public boolean A04(int i2, int i3) {
        return AnonymousClass000.A1Y(this.A01.get(i2), this.A00.get(i3));
    }
}
