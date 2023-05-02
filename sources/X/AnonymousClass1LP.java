package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.1LP  reason: invalid class name */
public final class AnonymousClass1LP extends C20010zM {
    public final C14870pt A00;
    public final C15900s5 A01;
    public final C14710pd A02;

    public AnonymousClass1LP(C14870pt r2, C15900s5 r3, C14710pd r4) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r3, 3);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean A01(Map map) {
        C18450wi.A0H(map, 0);
        Collection<C16740tZ> values = map.values();
        if (values == null || !values.isEmpty()) {
            for (C16740tZ A0W : values) {
                C14710pd r1 = this.A02;
                if (!C38621r6.A0W(this.A01, r1, A0W)) {
                    return false;
                }
            }
        }
        return true;
    }
}
