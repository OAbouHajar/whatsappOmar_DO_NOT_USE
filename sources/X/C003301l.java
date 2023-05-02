package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.01l  reason: invalid class name and case insensitive filesystem */
public class C003301l extends AnonymousClass1J7 {
    public static final void A0K(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void A0L(List list, Comparator comparator) {
        C18450wi.A0H(list, 0);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
