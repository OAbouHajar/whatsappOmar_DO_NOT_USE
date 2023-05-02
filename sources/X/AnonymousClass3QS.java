package X;

import java.util.List;

/* renamed from: X.3QS  reason: invalid class name */
public final class AnonymousClass3QS extends AnonymousClass07A {
    public final List A00;
    public final List A01;

    public AnonymousClass3QS(List list, List list2) {
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
        return C18450wi.A0R(this.A01.get(i2), this.A00.get(i3));
    }

    public boolean A04(int i2, int i3) {
        AnonymousClass4SV r5 = (AnonymousClass4SV) this.A01.get(i2);
        AnonymousClass4SV r4 = (AnonymousClass4SV) this.A00.get(i3);
        boolean z2 = r5 instanceof C78423y1;
        boolean z3 = r4 instanceof C78423y1;
        if (C18450wi.A0R(z2 ? ((C78423y1) r5).A01 : ((C78433y2) r5).A03, z3 ? ((C78423y1) r4).A01 : ((C78433y2) r4).A03)) {
            return ((r5 instanceof C78433y2) && (r4 instanceof C78433y2)) || (z2 && z3);
        }
        return false;
    }
}
