package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.2ZG  reason: invalid class name */
public final class AnonymousClass2ZG extends AnonymousClass1LN {
    public final C16040sK A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2ZG(C16040sK r2, AnonymousClass1L9 r3) {
        super(r3);
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A00 = r2;
    }

    public boolean A01(Map map) {
        C18450wi.A0H(map, 0);
        if (!super.A01(map) || this.A00.A0G()) {
            return false;
        }
        Collection<C16740tZ> values = map.values();
        if (values == null || !values.isEmpty()) {
            for (C16740tZ A0o : values) {
                if (C38621r6.A0o(A0o)) {
                    return false;
                }
            }
        }
        return true;
    }
}
