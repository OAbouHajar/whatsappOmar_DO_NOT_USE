package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.4bN  reason: invalid class name and case insensitive filesystem */
public class C88964bN {
    public final Map A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;

    public C88964bN() {
        this.A02 = Collections.emptyMap();
        this.A01 = Collections.emptyMap();
        this.A03 = Collections.emptyMap();
        this.A00 = Collections.emptyMap();
    }

    public C88964bN(Map map, Map map2, Map map3, Map map4) {
        this.A02 = map;
        this.A01 = map2;
        this.A03 = map3;
        this.A00 = map4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C88964bN)) {
            return false;
        }
        C88964bN r4 = (C88964bN) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00 && this.A02 == r4.A02 && this.A03.equals(r4.A03);
    }

    public int hashCode() {
        return ((this.A02.hashCode() ^ this.A01.hashCode()) ^ this.A03.hashCode()) ^ this.A00.hashCode();
    }
}
