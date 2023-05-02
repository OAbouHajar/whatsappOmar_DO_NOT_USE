package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.1J9  reason: invalid class name */
public class AnonymousClass1J9 extends AnonymousClass1JA {
    public static final int A0M(Iterable iterable, int i2) {
        C18450wi.A0H(iterable, 0);
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static ArrayList A0N(Iterable iterable) {
        return new ArrayList(A0M(iterable, 10));
    }
}
