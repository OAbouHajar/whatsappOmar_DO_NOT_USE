package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.46n  reason: invalid class name and case insensitive filesystem */
public final class C810246n {
    public static final Object A00(Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            if (A0z != null) {
                return A0z.getValue();
            }
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }
}
