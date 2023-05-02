package androidx.work;

import X.AnonymousClass000;
import X.AnonymousClass0UK;
import X.C007103g;
import X.C007203h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class OverwritingInputMerger extends AnonymousClass0UK {
    public C007203h A03(List list) {
        C007103g r3 = new C007103g();
        HashMap A0x = AnonymousClass000.A0x();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0x.putAll(Collections.unmodifiableMap(((C007203h) it.next()).A00));
        }
        r3.A02(A0x);
        return r3.A00();
    }
}
