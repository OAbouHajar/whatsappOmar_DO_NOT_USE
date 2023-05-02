package X;

import com.google.common.base.Strings;
import com.google.common.collect.IDxItrShape48S0100000_2_I1;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.3cI  reason: invalid class name and case insensitive filesystem */
public abstract class C67733cI<E> extends C105855Bl<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient C90894f1 backingMap = newBackingMap(3);
    public transient long size;

    public C67733cI(int i2) {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readCount = C90544eL.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        C90544eL.populateMultiset(this, objectInputStream, readCount);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C90544eL.writeMultiset(this, objectOutputStream);
    }

    public final int add(Object obj, int i2) {
        String str;
        if (i2 == 0) {
            return count(obj);
        }
        boolean z2 = true;
        if (AnonymousClass000.A1Q(i2)) {
            int indexOf = this.backingMap.indexOf(obj);
            C90894f1 r0 = this.backingMap;
            if (indexOf == -1) {
                r0.put(obj, i2);
                this.size += (long) i2;
                return 0;
            }
            int value = r0.getValue(indexOf);
            long j2 = (long) i2;
            long j3 = ((long) value) + j2;
            if (j3 > 2147483647L) {
                z2 = false;
            }
            if (z2) {
                this.backingMap.setValue(indexOf, (int) j3);
                this.size += j2;
                return value;
            }
            Object[] A1b = C13680ns.A1b();
            C13690nt.A1Q(A1b, 0, j3);
            str = Strings.A00("too many occurrences: %s", A1b);
        } else {
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, i2, 0);
            str = Strings.A00("occurrences cannot be negative: %s", objArr);
        }
        throw AnonymousClass000.A0T(str);
    }

    public void addTo(C109985Uo r4) {
        C90894f1 r0 = this.backingMap;
        int firstIndex = r0.firstIndex();
        while (firstIndex >= 0) {
            r4.add(r0.getKey(firstIndex), this.backingMap.getValue(firstIndex));
            r0 = this.backingMap;
            firstIndex = r0.nextIndex(firstIndex);
        }
    }

    public final void clear() {
        this.backingMap.clear();
        this.size = 0;
    }

    public final int count(Object obj) {
        return this.backingMap.get(obj);
    }

    public final int distinctElements() {
        return this.backingMap.size();
    }

    public final Iterator elementIterator() {
        return new IDxItrShape48S0100000_2_I1(this, 0);
    }

    public final Iterator entryIterator() {
        return new IDxItrShape48S0100000_2_I1(this, 1);
    }

    public final Iterator iterator() {
        return C90824es.iteratorImpl(this);
    }

    public abstract C90894f1 newBackingMap(int i2);

    public final int remove(Object obj, int i2) {
        if (i2 == 0) {
            return count(obj);
        }
        int i3 = 0;
        if (AnonymousClass000.A1Q(i2)) {
            int indexOf = this.backingMap.indexOf(obj);
            if (indexOf != -1) {
                i3 = this.backingMap.getValue(indexOf);
                if (i3 > i2) {
                    this.backingMap.setValue(indexOf, i3 - i2);
                } else {
                    this.backingMap.removeEntry(indexOf);
                    i2 = i3;
                }
                this.size -= (long) i2;
            }
            return i3;
        }
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1M(A1b, i2, 0);
        throw AnonymousClass000.A0T(Strings.A00("occurrences cannot be negative: %s", A1b));
    }

    public final boolean setCount(Object obj, int i2, int i3) {
        long j2;
        long j3;
        C29011Zs.checkNonnegative(i2, "oldCount");
        C29011Zs.checkNonnegative(i3, "newCount");
        int indexOf = this.backingMap.indexOf(obj);
        if (indexOf == -1) {
            if (i2 == 0) {
                if (i3 > 0) {
                    this.backingMap.put(obj, i3);
                    j2 = this.size;
                }
                return true;
            }
            return false;
        }
        if (this.backingMap.getValue(indexOf) == i2) {
            C90894f1 r0 = this.backingMap;
            if (i3 == 0) {
                r0.removeEntry(indexOf);
                j3 = this.size - ((long) i2);
                this.size = j3;
                return true;
            }
            r0.setValue(indexOf, i3);
            j2 = this.size;
            i3 -= i2;
        }
        return false;
        j3 = j2 + ((long) i3);
        this.size = j3;
        return true;
    }

    public final int size() {
        long j2 = this.size;
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }
}
