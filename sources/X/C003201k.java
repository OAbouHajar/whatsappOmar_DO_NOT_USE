package X;

import java.util.Collection;

/* renamed from: X.01k  reason: invalid class name and case insensitive filesystem */
public class C003201k extends C003301l {
    public static final void A0J(Iterable iterable, Collection collection) {
        C18450wi.A0H(iterable, 1);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }
}
