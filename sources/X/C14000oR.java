package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0oR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C14000oR implements C13840oA {
    public final Set A00;

    public C14000oR(Set set) {
        this.A00 = set;
    }

    public Object get() {
        Set<C13850oB> set = this.A00;
        HashSet hashSet = new HashSet();
        for (C13850oB r0 : set) {
            hashSet.add(r0.get());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
