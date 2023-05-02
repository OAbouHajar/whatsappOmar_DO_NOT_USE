package X;

import com.google.common.collect.IDxItrShape49S0100000_2_I1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5Bu  reason: invalid class name and case insensitive filesystem */
public class C105935Bu<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object NOT_FOUND = C13690nt.A0Y();
    public transient int[] entries;
    public transient Set entrySetView;
    public transient Set keySetView;
    public transient Object[] keys;
    public transient int metadata;
    public transient int size;
    public transient Object table;
    public transient Object[] values;
    public transient Collection valuesView;

    public C105935Bu() {
        init(3);
    }

    public static /* synthetic */ int access$1210(C105935Bu r2) {
        int i2 = r2.size;
        r2.size = i2 - 1;
        return i2;
    }

    public static C105935Bu create() {
        return new C105935Bu();
    }

    private int entry(int i2) {
        return requireEntries()[i2];
    }

    /* access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public int indexOf(Object obj) {
        if (!needsAllocArrays()) {
            int smearedHash = C29041Zv.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int tableGet = C90864ey.tableGet(requireTable(), smearedHash & hashTableMask);
            if (tableGet != 0) {
                int hashPrefix = C90864ey.getHashPrefix(smearedHash, hashTableMask);
                do {
                    int i2 = tableGet - 1;
                    int entry = entry(i2);
                    if (C90864ey.getHashPrefix(entry, hashTableMask) == hashPrefix && AnonymousClass45Q.A00(obj, key(i2))) {
                        return i2;
                    }
                    tableGet = C90864ey.getNext(entry, hashTableMask);
                } while (tableGet != 0);
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public Object key(int i2) {
        return requireKeys()[i2];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(C13680ns.A0i("Invalid size: ", C13690nt.A0g(25), readInt));
    }

    /* access modifiers changed from: private */
    public Object removeHelper(Object obj) {
        int hashTableMask;
        int remove;
        if (needsAllocArrays() || (remove = C90864ey.remove(obj, (Object) null, hashTableMask, requireTable(), requireEntries(), requireKeys(), (Object[]) null)) == -1) {
            return NOT_FOUND;
        }
        Object value = value(remove);
        moveLastEntry(remove, (hashTableMask = hashTableMask()));
        this.size--;
        incrementModCount();
        return value;
    }

    /* access modifiers changed from: private */
    public int[] requireEntries() {
        return this.entries;
    }

    /* access modifiers changed from: private */
    public Object[] requireKeys() {
        return this.keys;
    }

    /* access modifiers changed from: private */
    public Object requireTable() {
        return this.table;
    }

    /* access modifiers changed from: private */
    public Object[] requireValues() {
        return this.values;
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

    private void setEntry(int i2, int i3) {
        requireEntries()[i2] = i3;
    }

    private void setHashTableMask(int i2) {
        this.metadata = C90864ey.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    private void setKey(int i2, Object obj) {
        requireKeys()[i2] = obj;
    }

    /* access modifiers changed from: private */
    public void setValue(int i2, Object obj) {
        requireValues()[i2] = obj;
    }

    /* access modifiers changed from: private */
    public Object value(int i2) {
        return requireValues()[i2];
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator entrySetIterator = entrySetIterator();
        while (entrySetIterator.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(entrySetIterator);
            objectOutputStream.writeObject(A0z.getKey());
            objectOutputStream.writeObject(A0z.getValue());
        }
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
        this.keys = new Object[i2];
        this.values = new Object[i2];
        return i2;
    }

    public void clear() {
        if (!needsAllocArrays()) {
            incrementModCount();
            Map delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.metadata = Math.min(Math.max(size(), 3), 1073741823);
                delegateOrNull.clear();
                this.table = null;
            } else {
                Arrays.fill(requireKeys(), 0, this.size, (Object) null);
                Arrays.fill(requireValues(), 0, this.size, (Object) null);
                C90864ey.tableClear(requireTable());
                Arrays.fill(requireEntries(), 0, this.size, 0);
            }
            this.size = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.containsKey(obj) : AnonymousClass3K2.A1X(indexOf(obj), -1);
    }

    public boolean containsValue(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.size; i2++) {
            if (AnonymousClass45Q.A00(obj, value(i2))) {
                return true;
            }
        }
        return false;
    }

    public Map convertToHashFloodingResistantImplementation() {
        Map createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.put(key(firstEntryIndex), value(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    public Set createEntrySet() {
        return new AnonymousClass5Bw(this);
    }

    public Map createHashFloodingResistantDelegate(int i2) {
        return new LinkedHashMap(i2, 1.0f);
    }

    public Set createKeySet() {
        return new C105955Bx(this);
    }

    public Collection createValues() {
        return new C105795Bf(this);
    }

    public Map delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public Set entrySet() {
        Set set = this.entrySetView;
        if (set != null) {
            return set;
        }
        Set createEntrySet = createEntrySet();
        this.entrySetView = createEntrySet;
        return createEntrySet;
    }

    public Iterator entrySetIterator() {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? AnonymousClass000.A0y(delegateOrNull) : new IDxItrShape49S0100000_2_I1(this, 1);
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public Object get(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(obj);
        }
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return value(indexOf);
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

    public void insertEntry(int i2, Object obj, Object obj2, int i3, int i4) {
        setEntry(i2, C90864ey.maskCombine(i3, 0, i4));
        setKey(i2, obj);
        setValue(i2, obj2);
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public Set keySet() {
        Set set = this.keySetView;
        if (set != null) {
            return set;
        }
        Set createKeySet = createKeySet();
        this.keySetView = createKeySet;
        return createKeySet;
    }

    public Iterator keySetIterator() {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? C13700nu.A0I(delegateOrNull) : new IDxItrShape49S0100000_2_I1(this, 0);
    }

    public void moveLastEntry(int i2, int i3) {
        int i4;
        int i5;
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireKeys = requireKeys();
        Object[] requireValues = requireValues();
        int size2 = size() - 1;
        if (i2 < size2) {
            Object obj = requireKeys[size2];
            requireKeys[i2] = obj;
            requireValues[i2] = requireValues[size2];
            requireKeys[size2] = null;
            requireValues[size2] = null;
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
        requireKeys[i2] = null;
        requireValues[i2] = null;
        requireEntries[i2] = 0;
    }

    public boolean needsAllocArrays() {
        return AnonymousClass000.A1W(this.table);
    }

    public Object put(Object obj, Object obj2) {
        int i2;
        int i3;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map delegateOrNull = delegateOrNull();
        Object obj3 = obj;
        Object obj4 = obj2;
        if (delegateOrNull == null) {
            int[] requireEntries = requireEntries();
            Object[] requireKeys = requireKeys();
            Object[] requireValues = requireValues();
            int i4 = this.size;
            int i5 = i4 + 1;
            int smearedHash = C29041Zv.smearedHash(obj3);
            int hashTableMask = hashTableMask();
            int i6 = smearedHash & hashTableMask;
            Object requireTable = requireTable();
            int tableGet = C90864ey.tableGet(requireTable, i6);
            if (tableGet == 0) {
                if (i5 <= hashTableMask) {
                    C90864ey.tableSet(requireTable, i6, i5);
                }
                hashTableMask = resizeTable(hashTableMask, C90864ey.newCapacity(hashTableMask), smearedHash, i4);
            } else {
                int hashPrefix = C90864ey.getHashPrefix(smearedHash, hashTableMask);
                int i7 = 0;
                do {
                    i2 = tableGet - 1;
                    i3 = requireEntries[i2];
                    if (C90864ey.getHashPrefix(i3, hashTableMask) != hashPrefix || !AnonymousClass45Q.A00(obj3, requireKeys[i2])) {
                        tableGet = C90864ey.getNext(i3, hashTableMask);
                        i7++;
                    } else {
                        Object obj5 = requireValues[i2];
                        requireValues[i2] = obj2;
                        return obj5;
                    }
                } while (tableGet != 0);
                if (i7 >= 9) {
                    delegateOrNull = convertToHashFloodingResistantImplementation();
                } else {
                    if (i5 <= hashTableMask) {
                        requireEntries[i2] = C90864ey.maskCombine(i3, i5, hashTableMask);
                    }
                    hashTableMask = resizeTable(hashTableMask, C90864ey.newCapacity(hashTableMask), smearedHash, i4);
                }
            }
            resizeMeMaybe(i5);
            insertEntry(i4, obj3, obj4, smearedHash, hashTableMask);
            this.size = i5;
            incrementModCount();
            return null;
        }
        return delegateOrNull.put(obj3, obj4);
    }

    public Object remove(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        Object removeHelper = removeHelper(obj);
        if (removeHelper == NOT_FOUND) {
            return null;
        }
        return removeHelper;
    }

    public void resizeEntries(int i2) {
        this.entries = Arrays.copyOf(requireEntries(), i2);
        this.keys = Arrays.copyOf(requireKeys(), i2);
        this.values = Arrays.copyOf(requireValues(), i2);
    }

    public int size() {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.size() : this.size;
    }

    public Collection values() {
        Collection collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Collection createValues = createValues();
        this.valuesView = createValues;
        return createValues;
    }

    public Iterator valuesIterator() {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? C13680ns.A0q(delegateOrNull) : new IDxItrShape49S0100000_2_I1(this, 2);
    }
}
