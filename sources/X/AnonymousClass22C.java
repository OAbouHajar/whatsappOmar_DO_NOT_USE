package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.22C  reason: invalid class name */
public final class AnonymousClass22C extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ C18440wh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass22C(C18440wh r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        int size;
        Set singleton = Collections.singleton("com.bloks.www.whatsapp.commerce.address_message");
        C18450wi.A0B(singleton);
        Collection<AnonymousClass22D> values = ((Map) this.this$0.A01.getValue()).values();
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(values, 10));
        for (AnonymousClass22D r0 : values) {
            arrayList.add(r0.A01);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!C18450wi.A0R(next, "com.bloks.www.whatsapp.commerce.galaxy_message") && !C18450wi.A0R(next, "com.bloks.www.whatsapp.commerce.extensions_message_v2")) {
                arrayList2.add(next);
            }
        }
        if (arrayList2 instanceof Collection) {
            int size2 = arrayList2.size();
            if (Integer.valueOf(size2) != null) {
                size = size2 + singleton.size();
                LinkedHashSet linkedHashSet = new LinkedHashSet(C25421Js.A07(size));
                linkedHashSet.addAll(singleton);
                C003201k.A0J(arrayList2, linkedHashSet);
                return linkedHashSet;
            }
        }
        size = singleton.size() << 1;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(C25421Js.A07(size));
        linkedHashSet2.addAll(singleton);
        C003201k.A0J(arrayList2, linkedHashSet2);
        return linkedHashSet2;
    }
}
