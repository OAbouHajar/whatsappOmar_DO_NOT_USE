package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.47A  reason: invalid class name */
public final class AnonymousClass47A {
    public static final Map A00(Uri uri) {
        String query = uri.getQuery();
        if (query == null) {
            return null;
        }
        List A09 = C008603x.A09(query, new String[]{"&"}, 0);
        int A07 = C25421Js.A07(AnonymousClass1J9.A0M(A09, 10));
        if (A07 < 16) {
            A07 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A07);
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            List A092 = C008603x.A09(AnonymousClass000.A0m(it), new String[]{"="}, 0);
            linkedHashMap.put(A092.get(0), A092.get(1));
        }
        return linkedHashMap;
    }
}
