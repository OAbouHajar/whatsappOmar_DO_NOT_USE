package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Ay  reason: invalid class name and case insensitive filesystem */
public class C45782Ay {
    public final C30991dI A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final Map A04;
    public final Map A05;

    public C45782Ay() {
        this.A00 = null;
        this.A02 = Collections.emptyList();
        this.A03 = Collections.emptyList();
        this.A01 = Collections.emptyList();
        this.A05 = Collections.emptyMap();
        this.A04 = Collections.emptyMap();
    }

    public C45782Ay(C30991dI r3, List list, List list2, List list3, Map map, Map map2) {
        AnonymousClass00B.A06(list);
        AnonymousClass00B.A06(list2);
        AnonymousClass00B.A06(list3);
        AnonymousClass00B.A06(map);
        AnonymousClass00B.A06(map2);
        Collections.sort(list, new AnonymousClass574(true));
        Collections.sort(list2, new AnonymousClass574(true));
        Collections.sort(list3, new AnonymousClass574(false));
        this.A00 = r3;
        this.A02 = Collections.unmodifiableList(list);
        this.A03 = Collections.unmodifiableList(list2);
        this.A01 = Collections.unmodifiableList(list3);
        this.A05 = Collections.unmodifiableMap(map);
        this.A04 = Collections.unmodifiableMap(map2);
    }

    public List A00() {
        return this.A01;
    }

    public List A01() {
        return this.A02;
    }

    public List A02() {
        return this.A03;
    }

    public boolean A03() {
        return this.A00 == null && this.A02.isEmpty() && this.A03.isEmpty() && this.A01.isEmpty() && this.A05.isEmpty() && this.A04.isEmpty();
    }
}
