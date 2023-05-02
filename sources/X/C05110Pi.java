package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.0Pi  reason: invalid class name and case insensitive filesystem */
public final class C05110Pi {
    public final AnonymousClass00O A00 = new AnonymousClass00O();
    public final C13010lK A01 = new AnonymousClass0b2(10);
    public final ArrayList A02 = AnonymousClass000.A0u();
    public final HashSet A03 = new HashSet();

    public final void A00(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            AbstractList abstractList = (AbstractList) this.A00.get(obj);
            if (abstractList != null) {
                int size = abstractList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    A00(abstractList.get(i2), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw AnonymousClass000.A0a("This graph contains cyclic dependencies");
    }
}
