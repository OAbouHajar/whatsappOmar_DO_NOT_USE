package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3pd  reason: invalid class name and case insensitive filesystem */
public class C74033pd extends C18940xV {
    public final /* synthetic */ AnonymousClass5PP A00;
    public final /* synthetic */ C86144Rj A01;

    public C74033pd(AnonymousClass5PP r1, C86144Rj r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A08(Collection collection, Map map) {
        C86144Rj r4 = this.A01;
        if (!r4.A00) {
            boolean z2 = false;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (r4.A04.remove(C13680ns.A0V(it).A11) != null) {
                    z2 = true;
                }
            }
            if (z2) {
                this.A00.AWv();
            }
        }
    }
}
