package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4O1  reason: invalid class name */
public final class AnonymousClass4O1 {
    public Integer A00;
    public final C97844qf A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Set A05;
    public final Set A06;

    public AnonymousClass4O1(C97844qf r4, String str, String str2, Map map, Set set) {
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.A05 = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.A04 = map;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r4 == null ? C97844qf.A00 : r4;
        HashSet hashSet = new HashSet(emptySet);
        Iterator A0q = C13680ns.A0q(map);
        if (A0q.hasNext()) {
            A0q.next();
            throw AnonymousClass000.A0W("zaa");
        } else {
            this.A06 = Collections.unmodifiableSet(hashSet);
        }
    }
}
