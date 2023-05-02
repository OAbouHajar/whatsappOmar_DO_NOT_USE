package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.4a5  reason: invalid class name and case insensitive filesystem */
public final class C88184a5 {
    public final List A00;
    public final List A01;
    public final List A02;
    public final Map A03;

    public C88184a5() {
        this((List) null, (List) null, (List) null, (Map) null);
    }

    public C88184a5(List list, List list2, List list3, Map map) {
        this.A02 = list == null ? Collections.emptyList() : list;
        this.A03 = map == null ? Collections.emptyMap() : map;
        this.A01 = list2 == null ? Collections.emptyList() : list2;
        this.A00 = list3 == null ? Collections.emptyList() : list3;
    }
}
