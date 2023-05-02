package X;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: X.4Xi  reason: invalid class name and case insensitive filesystem */
public final class C87544Xi {
    public static Comparator comparator(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? AnonymousClass57I.natural() : comparator;
    }

    public static boolean hasSameComparator(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        if (iterable instanceof SortedSet) {
            comparator2 = comparator((SortedSet) iterable);
        } else if (!(iterable instanceof C109965Um)) {
            return false;
        } else {
            comparator2 = ((C109965Um) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
