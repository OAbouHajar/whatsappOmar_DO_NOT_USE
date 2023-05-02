package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.10E  reason: invalid class name */
public abstract class AnonymousClass10E extends C20010zM {
    public final C14710pd A00;

    public AnonymousClass10E(C14710pd r1) {
        this.A00 = r1;
    }

    public final boolean A02(Collection collection) {
        byte b2;
        C18450wi.A0H(collection, 0);
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16740tZ r4 = (C16740tZ) it.next();
            if (!((r4 instanceof C39001rl) || (b2 = r4.A10) == 10 || b2 == 12 || b2 == 11 || b2 == 31 || C38621r6.A0o(r4))) {
                if (!r4.A0x && C38621r6.A0l(r4)) {
                    C14710pd r2 = this.A00;
                    if (!r2.A0E(C16620tM.A02, 1353)) {
                        if (1 == r4.A06() && C34321k4.A05(r2, r4)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
