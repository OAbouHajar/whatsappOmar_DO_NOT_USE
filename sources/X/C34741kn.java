package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1kn  reason: invalid class name and case insensitive filesystem */
public class C34741kn extends C33371iT {
    public final /* synthetic */ C16040sK A00;
    public final /* synthetic */ C224818c A01;

    public C34741kn(C16040sK r1, C224818c r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final int A01(Collection collection) {
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C16010sH r2 = (C16010sH) it.next();
            if (r2 != null && r2.A0i && r2.A0D != null && !this.A00.A0I(r2.A0E)) {
                i2++;
            }
        }
        return i2;
    }
}
