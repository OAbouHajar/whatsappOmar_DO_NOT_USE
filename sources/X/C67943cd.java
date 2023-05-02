package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: X.3cd  reason: invalid class name and case insensitive filesystem */
public abstract class C67943cd<E> extends C67883cX<E> implements NavigableSet<E>, C109965Um<E> {
    public final transient Comparator comparator;
    public transient C67943cd descendingSet;

    public C67943cd(Comparator comparator2) {
        this.comparator = comparator2;
    }

    public static C67943cd construct(Comparator comparator2, int i2, Object... objArr) {
        if (i2 == 0) {
            return emptySet(comparator2);
        }
        AnonymousClass2CC.checkElementsNotNull(objArr, i2);
        Arrays.sort(objArr, 0, i2, comparator2);
        int i3 = 1;
        for (int i4 = 1; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (comparator2.compare(obj, objArr[i3 - 1]) != 0) {
                objArr[i3] = obj;
                i3++;
            }
        }
        Arrays.fill(objArr, i3, i2, (Object) null);
        if (i3 < (objArr.length >> 1)) {
            objArr = Arrays.copyOf(objArr, i3);
        }
        return new C67933cc(C34641kb.asImmutableList(objArr, i3), comparator2);
    }

    public static C67933cc emptySet(Comparator comparator2) {
        return AnonymousClass57I.natural().equals(comparator2) ? C67933cc.NATURAL_EMPTY_SET : new C67933cc(C34641kb.of(), comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static int unsafeCompare(Comparator comparator2, Object obj, Object obj2) {
        return comparator2.compare(obj, obj2);
    }

    public abstract Object ceiling(Object obj);

    public Comparator comparator() {
        return this.comparator;
    }

    public abstract C67943cd createDescendingSet();

    public abstract /* bridge */ /* synthetic */ Iterator descendingIterator();

    public C67943cd descendingSet() {
        C67943cd r0 = this.descendingSet;
        if (r0 != null) {
            return r0;
        }
        C67943cd createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    public abstract Object first();

    public abstract Object floor(Object obj);

    public C67943cd headSet(Object obj) {
        return headSet(obj, false);
    }

    public C67943cd headSet(Object obj, boolean z2) {
        return headSetImpl(obj, z2);
    }

    public abstract C67943cd headSetImpl(Object obj, boolean z2);

    public abstract Object higher(Object obj);

    public abstract C28031Ub iterator();

    public abstract Object last();

    public abstract Object lower(Object obj);

    @Deprecated
    public final Object pollFirst() {
        throw C13680ns.A0m();
    }

    @Deprecated
    public final Object pollLast() {
        throw C13680ns.A0m();
    }

    public C67943cd subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public C67943cd subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        if (this.comparator.compare(obj, obj2) <= 0) {
            return subSetImpl(obj, z2, obj2, z3);
        }
        throw AnonymousClass3K3.A0f();
    }

    public abstract C67943cd subSetImpl(Object obj, boolean z2, Object obj2, boolean z3);

    public C67943cd tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public C67943cd tailSet(Object obj, boolean z2) {
        return tailSetImpl(obj, z2);
    }

    public abstract C67943cd tailSetImpl(Object obj, boolean z2);

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    public Object writeReplace() {
        return new C1041754f(this.comparator, toArray());
    }
}
