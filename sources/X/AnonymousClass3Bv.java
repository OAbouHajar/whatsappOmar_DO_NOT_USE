package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.3Bv  reason: invalid class name */
public final class AnonymousClass3Bv {
    public static int computeArrayListCapacity(int i2) {
        C29011Zs.checkNonnegative(i2, "arraySize");
        long j2 = ((long) i2) + 5 + ((long) (i2 / 10));
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static boolean equalsImpl(List list, Object obj) {
        if (obj != list) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                int size = list.size();
                if (size == list2.size()) {
                    if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
                        return C28021Ua.elementsEqual(list.iterator(), list2.iterator());
                    }
                    int i2 = 0;
                    while (i2 < size) {
                        if (AnonymousClass45Q.A00(list.get(i2), list2.get(i2))) {
                            i2++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static int indexOfImpl(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return indexOfRandomAccess(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (AnonymousClass45Q.A00(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int indexOfRandomAccess(List list, Object obj) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(list.get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public static int lastIndexOfImpl(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return lastIndexOfRandomAccess(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (AnonymousClass45Q.A00(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int lastIndexOfRandomAccess(List list, Object obj) {
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return -1;
            }
        } while (!obj.equals(list.get(size)));
        return size;
    }

    public static ArrayList newArrayList() {
        return AnonymousClass000.A0u();
    }

    public static ArrayList newArrayList(Iterable iterable) {
        return iterable instanceof Collection ? C13680ns.A0n((Collection) iterable) : newArrayList(iterable.iterator());
    }

    public static ArrayList newArrayList(Iterator it) {
        ArrayList newArrayList = newArrayList();
        C28021Ua.addAll(newArrayList, it);
        return newArrayList;
    }

    public static ArrayList newArrayList(Object... objArr) {
        ArrayList A0i = C13690nt.A0i(computeArrayListCapacity(objArr.length));
        Collections.addAll(A0i, objArr);
        return A0i;
    }
}
