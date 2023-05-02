package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.5Bz  reason: invalid class name and case insensitive filesystem */
public class C105975Bz<E> extends AbstractSet<E> implements Serializable {
    public transient Object[] elements;
    public transient int[] entries;
    public transient int metadata;
    public transient int size;
    public transient Object table;

    public C105975Bz() {
        init(3);
    }

    public static C105975Bz create() {
        return new C105975Bz();
    }

    private Set createHashFloodingResistantDelegate(int i2) {
        return new LinkedHashSet(i2, 1.0f);
    }

    /* access modifiers changed from: private */
    public Object element(int i2) {
        return requireElements()[i2];
    }

    private int entry(int i2) {
        return requireEntries()[i2];
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(C13680ns.A0i("Invalid size: ", C13690nt.A0g(25), readInt));
    }

    private Object[] requireElements() {
        return this.elements;
    }

    private int[] requireEntries() {
        return this.entries;
    }

    private Object requireTable() {
        return this.table;
    }

    private void resizeMeMaybe(int i2) {
        int min;
        int length = requireEntries().length;
        if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(min);
        }
    }

    private int resizeTable(int i2, int i3, int i4, int i5) {
        Object createTable = C90864ey.createTable(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            C90864ey.tableSet(createTable, i4 & i6, i5 + 1);
        }
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i7 = 0; i7 <= i2; i7++) {
            int tableGet = C90864ey.tableGet(requireTable, i7);
            while (tableGet != 0) {
                int i8 = tableGet - 1;
                int i9 = requireEntries[i8];
                int hashPrefix = C90864ey.getHashPrefix(i9, i2) | i7;
                int i10 = hashPrefix & i6;
                int tableGet2 = C90864ey.tableGet(createTable, i10);
                C90864ey.tableSet(createTable, i10, tableGet);
                requireEntries[i8] = C90864ey.maskCombine(hashPrefix, tableGet2, i6);
                tableGet = C90864ey.getNext(i9, i2);
            }
        }
        this.table = createTable;
        setHashTableMask(i6);
        return i6;
    }

    private void setElement(int i2, Object obj) {
        requireElements()[i2] = obj;
    }

    private void setEntry(int i2, int i3) {
        requireEntries()[i2] = i3;
    }

    private void setHashTableMask(int i2) {
        this.metadata = C90864ey.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public boolean add(Object obj) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull == null) {
            int[] requireEntries = requireEntries();
            Object[] requireElements = requireElements();
            int i2 = this.size;
            int i3 = i2 + 1;
            int smearedHash = C29041Zv.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int i4 = smearedHash & hashTableMask;
            Object requireTable = requireTable();
            int tableGet = C90864ey.tableGet(requireTable, i4);
            if (tableGet == 0) {
                if (i3 <= hashTableMask) {
                    C90864ey.tableSet(requireTable, i4, i3);
                }
                hashTableMask = resizeTable(hashTableMask, C90864ey.newCapacity(hashTableMask), smearedHash, i2);
            } else {
                int hashPrefix = C90864ey.getHashPrefix(smearedHash, hashTableMask);
                int i5 = 0;
                while (true) {
                    int i6 = tableGet - 1;
                    int i7 = requireEntries[i6];
                    if (C90864ey.getHashPrefix(i7, hashTableMask) == hashPrefix && AnonymousClass45Q.A00(obj, requireElements[i6])) {
                        return false;
                    }
                    int next = C90864ey.getNext(i7, hashTableMask);
                    i5++;
                    if (next != 0) {
                        tableGet = next;
                    } else if (i5 >= 9) {
                        delegateOrNull = convertToHashFloodingResistantImplementation();
                    } else if (i3 <= hashTableMask) {
                        requireEntries[i6] = C90864ey.maskCombine(i7, i3, hashTableMask);
                    }
                }
                hashTableMask = resizeTable(hashTableMask, C90864ey.newCapacity(hashTableMask), smearedHash, i2);
            }
            resizeMeMaybe(i3);
            insertEntry(i2, obj, smearedHash, hashTableMask);
            this.size = i3;
            incrementModCount();
            return true;
        }
        return delegateOrNull.add(obj);
    }

    public int adjustAfterRemove(int i2, int i3) {
        return i2 - 1;
    }

    public int allocArrays() {
        C29031Zu.A04("Arrays already allocated", needsAllocArrays());
        int i2 = this.metadata;
        int tableSize = C90864ey.tableSize(i2);
        this.table = C90864ey.createTable(tableSize);
        setHashTableMask(tableSize - 1);
        this.entries = new int[i2];
        this.elements = new Object[i2];
        return i2;
    }

    public void clear() {
        if (!needsAllocArrays()) {
            incrementModCount();
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.metadata = Math.min(Math.max(size(), 3), 1073741823);
                delegateOrNull.clear();
                this.table = null;
            } else {
                Arrays.fill(requireElements(), 0, this.size, (Object) null);
                C90864ey.tableClear(requireTable());
                Arrays.fill(requireEntries(), 0, this.size, 0);
            }
            this.size = 0;
        }
    }

    public boolean contains(Object obj) {
        if (!needsAllocArrays()) {
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.contains(obj);
            }
            int smearedHash = C29041Zv.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int tableGet = C90864ey.tableGet(requireTable(), smearedHash & hashTableMask);
            if (tableGet != 0) {
                int hashPrefix = C90864ey.getHashPrefix(smearedHash, hashTableMask);
                do {
                    int i2 = tableGet - 1;
                    int entry = entry(i2);
                    if (C90864ey.getHashPrefix(entry, hashTableMask) == hashPrefix && AnonymousClass45Q.A00(obj, element(i2))) {
                        return true;
                    }
                    tableGet = C90864ey.getNext(entry, hashTableMask);
                } while (tableGet != 0);
            }
        }
        return false;
    }

    public Set convertToHashFloodingResistantImplementation() {
        Set createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.add(element(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    public Set delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public int getSuccessor(int i2) {
        int i3 = i2 + 1;
        if (i3 >= this.size) {
            return -1;
        }
        return i3;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public void init(int i2) {
        this.metadata = Math.min(Math.max(i2, 1), 1073741823);
    }

    public void insertEntry(int i2, Object obj, int i3, int i4) {
        setEntry(i2, C90864ey.maskCombine(i3, 0, i4));
        setElement(i2, obj);
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public Iterator iterator() {
        Set delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.iterator() : new C1048357c(this);
    }

    public void moveLastEntry(int i2, int i3) {
        int i4;
        int i5;
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireElements = requireElements();
        int size2 = size() - 1;
        if (i2 < size2) {
            Object obj = requireElements[size2];
            requireElements[i2] = obj;
            requireElements[size2] = null;
            requireEntries[i2] = requireEntries[size2];
            requireEntries[size2] = 0;
            int smearedHash = C29041Zv.smearedHash(obj) & i3;
            int tableGet = C90864ey.tableGet(requireTable, smearedHash);
            int i6 = size2 + 1;
            if (tableGet == i6) {
                C90864ey.tableSet(requireTable, smearedHash, i2 + 1);
                return;
            }
            do {
                i4 = tableGet - 1;
                i5 = requireEntries[i4];
                tableGet = C90864ey.getNext(i5, i3);
            } while (tableGet != i6);
            requireEntries[i4] = C90864ey.maskCombine(i5, i2 + 1, i3);
            return;
        }
        requireElements[i2] = null;
        requireEntries[i2] = 0;
    }

    public boolean needsAllocArrays() {
        return AnonymousClass000.A1W(this.table);
    }

    public boolean remove(Object obj) {
        if (!needsAllocArrays()) {
            Set delegateOrNull = delegateOrNull();
            Object obj2 = obj;
            if (delegateOrNull != null) {
                return delegateOrNull.remove(obj);
            }
            int hashTableMask = hashTableMask();
            int remove = C90864ey.remove(obj2, (Object) null, hashTableMask, requireTable(), requireEntries(), requireElements(), (Object[]) null);
            if (remove != -1) {
                moveLastEntry(remove, hashTableMask);
                this.size--;
                incrementModCount();
                return true;
            }
        }
        return false;
    }

    public void resizeEntries(int i2) {
        this.entries = Arrays.copyOf(requireEntries(), i2);
        this.elements = Arrays.copyOf(requireElements(), i2);
    }

    public int size() {
        Set delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.size() : this.size;
    }

    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.toArray() : Arrays.copyOf(requireElements(), this.size);
    }

    public Object[] toArray(Object[] objArr) {
        if (needsAllocArrays()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.toArray(objArr) : AnonymousClass2CC.toArrayImpl(requireElements(), 0, this.size, objArr);
    }
}
