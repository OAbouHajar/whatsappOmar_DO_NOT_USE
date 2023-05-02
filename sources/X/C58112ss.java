package X;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.2ss  reason: invalid class name and case insensitive filesystem */
public class C58112ss<E> extends C34641kb<E> {
    public final transient C34641kb forwardList;

    public C58112ss(C34641kb r1) {
        this.forwardList = r1;
    }

    private int reverseIndex(int i2) {
        return (size() - 1) - i2;
    }

    private int reversePosition(int i2) {
        return size() - i2;
    }

    public boolean contains(Object obj) {
        return this.forwardList.contains(obj);
    }

    public Object get(int i2) {
        C29031Zu.A01(i2, size());
        return this.forwardList.get(reverseIndex(i2));
    }

    public int indexOf(Object obj) {
        int lastIndexOf = this.forwardList.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return reverseIndex(lastIndexOf);
        }
        return -1;
    }

    public boolean isPartialView() {
        return this.forwardList.isPartialView();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public int lastIndexOf(Object obj) {
        int indexOf = this.forwardList.indexOf(obj);
        if (indexOf >= 0) {
            return reverseIndex(indexOf);
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
        return super.listIterator(i2);
    }

    public C34641kb reverse() {
        return this.forwardList;
    }

    public int size() {
        return this.forwardList.size();
    }

    public C34641kb subList(int i2, int i3) {
        C29031Zu.A03(i2, i3, size());
        return this.forwardList.subList(reversePosition(i3), reversePosition(i2)).reverse();
    }
}
