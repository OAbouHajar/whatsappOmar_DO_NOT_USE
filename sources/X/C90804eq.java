package X;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: X.4eq  reason: invalid class name and case insensitive filesystem */
public final class C90804eq {
    public static boolean any(Iterable iterable, AnonymousClass5OH r1) {
        return C28021Ua.any(iterable.iterator(), r1);
    }

    public static Object getFirst(Iterable iterable, Object obj) {
        return C28021Ua.getNext(iterable.iterator(), obj);
    }

    public static Object getLast(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return C28021Ua.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return getLastInNonemptyList(list);
        }
        throw new NoSuchElementException();
    }

    public static Object getLastInNonemptyList(List list) {
        return list.get(list.size() - 1);
    }

    public static boolean removeIf(Iterable iterable, AnonymousClass5OH r2) {
        return (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) ? C28021Ua.removeIf(iterable.iterator(), r2) : removeIfFromRandomAccessList((List) iterable, r2);
    }

    public static boolean removeIfFromRandomAccessList(List list, AnonymousClass5OH r7) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Object obj = list.get(i2);
            if (!r7.A55(obj)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                        slowRemoveIfForRemainingElements(list, r7, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }

    public static void slowRemoveIfForRemainingElements(List list, AnonymousClass5OH r3, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (r3.A55(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 >= i2) {
                list.remove(i3);
            } else {
                return;
            }
        }
    }

    public static String toString(Iterable iterable) {
        return C28021Ua.toString(iterable.iterator());
    }
}
