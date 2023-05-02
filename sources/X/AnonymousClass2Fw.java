package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.2Fw  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Fw implements Comparator {
    public final /* synthetic */ Map A00;

    public /* synthetic */ AnonymousClass2Fw(Map map) {
        this.A00 = map;
    }

    public final int compare(Object obj, Object obj2) {
        Map map = this.A00;
        C30111bl r6 = (C30111bl) obj;
        C30111bl r7 = (C30111bl) obj2;
        if (r6 == r7) {
            return 0;
        }
        return -(((Number) map.get(r6.A0C)).longValue() > ((Number) map.get(r7.A0C)).longValue() ? 1 : (((Number) map.get(r6.A0C)).longValue() == ((Number) map.get(r7.A0C)).longValue() ? 0 : -1));
    }
}
