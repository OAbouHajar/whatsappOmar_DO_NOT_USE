package X;

import java.util.Arrays;

/* renamed from: X.4f1  reason: invalid class name and case insensitive filesystem */
public class C90894f1 {
    public transient long[] entries;
    public transient Object[] keys;
    public transient float loadFactor;
    public transient int modCount;
    public transient int size;
    public transient int[] table;
    public transient int threshold;
    public transient int[] values;

    public C90894f1() {
        init(3, 1.0f);
    }

    public C90894f1(int i2) {
        this(3, 1.0f);
    }

    public C90894f1(int i2, float f2) {
        init(3, 1.0f);
    }

    public static int getHash(long j2) {
        return (int) (j2 >>> 32);
    }

    public static int getNext(long j2) {
        return (int) j2;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    public static long[] newEntries(int i2) {
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    public static int[] newTable(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int remove(Object obj, int i2) {
        int hashTableMask = hashTableMask() & i2;
        int i3 = this.table[hashTableMask];
        if (i3 != -1) {
            int i4 = -1;
            while (true) {
                if (getHash(this.entries[i3]) != i2 || !AnonymousClass45Q.A00(obj, this.keys[i3])) {
                    int next = getNext(this.entries[i3]);
                    if (next == -1) {
                        break;
                    }
                    i4 = i3;
                    i3 = next;
                } else {
                    int i5 = this.values[i3];
                    if (i4 == -1) {
                        this.table[hashTableMask] = getNext(this.entries[i3]);
                    } else {
                        long[] jArr = this.entries;
                        jArr[i4] = swapNext(jArr[i4], getNext(jArr[i3]));
                    }
                    moveLastEntry(i3);
                    this.size--;
                    this.modCount++;
                    return i5;
                }
            }
        }
        return 0;
    }

    private void resizeMeMaybe(int i2) {
        int length = this.entries.length;
        if (i2 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            } else if (max == length) {
                return;
            }
            resizeEntries(max);
        }
    }

    private void resizeTable(int i2) {
        if (this.table.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (((float) i2) * this.loadFactor)) + 1;
        int[] newTable = newTable(i2);
        long[] jArr = this.entries;
        int length = newTable.length - 1;
        for (int i4 = 0; i4 < this.size; i4++) {
            int hash = getHash(jArr[i4]);
            int i5 = hash & length;
            int i6 = newTable[i5];
            newTable[i5] = i4;
            jArr[i4] = (((long) hash) << 32) | (4294967295L & ((long) i6));
        }
        this.threshold = i3;
        this.table = newTable;
    }

    public static long swapNext(long j2, int i2) {
        return (j2 & -4294967296L) | (((long) i2) & 4294967295L);
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1);
        this.size = 0;
    }

    public int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    public int get(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        return this.values[indexOf];
    }

    public C87494Wz getEntry(int i2) {
        C29031Zu.A01(i2, this.size);
        return new C68013ck(this, i2);
    }

    public Object getKey(int i2) {
        C29031Zu.A01(i2, this.size);
        return this.keys[i2];
    }

    public int getValue(int i2) {
        C29031Zu.A01(i2, this.size);
        return this.values[i2];
    }

    public int indexOf(Object obj) {
        int smearedHash = C29041Zv.smearedHash(obj);
        int i2 = this.table[hashTableMask() & smearedHash];
        while (i2 != -1) {
            long j2 = this.entries[i2];
            if (getHash(j2) == smearedHash && AnonymousClass45Q.A00(obj, this.keys[i2])) {
                return i2;
            }
            i2 = getNext(j2);
        }
        return -1;
    }

    public void init(int i2, float f2) {
        int closedTableSize = C29041Zv.closedTableSize(3, (double) 1.0f);
        this.table = newTable(closedTableSize);
        this.loadFactor = 1.0f;
        this.keys = new Object[3];
        this.values = new int[3];
        this.entries = newEntries(3);
        this.threshold = Math.max(1, (int) (((float) closedTableSize) * 1.0f));
    }

    public void insertEntry(int i2, Object obj, int i3, int i4) {
        this.entries[i2] = (((long) i4) << 32) | 4294967295L;
        this.keys[i2] = obj;
        this.values[i2] = i3;
    }

    public void moveLastEntry(int i2) {
        int size2 = size() - 1;
        if (i2 < size2) {
            Object[] objArr = this.keys;
            objArr[i2] = objArr[size2];
            int[] iArr = this.values;
            iArr[i2] = iArr[size2];
            objArr[size2] = null;
            iArr[size2] = 0;
            long[] jArr = this.entries;
            long j2 = jArr[size2];
            jArr[i2] = j2;
            jArr[size2] = -1;
            int hash = getHash(j2) & hashTableMask();
            int[] iArr2 = this.table;
            int i3 = iArr2[hash];
            if (i3 == size2) {
                iArr2[hash] = i2;
                return;
            }
            while (true) {
                long j3 = jArr[i3];
                int next = getNext(j3);
                if (next == size2) {
                    jArr[i3] = swapNext(j3, i2);
                    return;
                }
                i3 = next;
            }
        } else {
            this.keys[i2] = null;
            this.values[i2] = 0;
            this.entries[i2] = -1;
        }
    }

    public int nextIndex(int i2) {
        int i3 = i2 + 1;
        if (i3 >= this.size) {
            return -1;
        }
        return i3;
    }

    public int nextIndexAfterRemove(int i2, int i3) {
        return i2 - 1;
    }

    public int put(Object obj, int i2) {
        C29011Zs.checkPositive(i2, "count");
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int smearedHash = C29041Zv.smearedHash(obj);
        int hashTableMask = hashTableMask() & smearedHash;
        int i3 = this.size;
        int[] iArr2 = this.table;
        int i4 = iArr2[hashTableMask];
        if (i4 == -1) {
            iArr2[hashTableMask] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (getHash(j2) != smearedHash || !AnonymousClass45Q.A00(obj, objArr[i4])) {
                    int next = getNext(j2);
                    if (next == -1) {
                        jArr[i4] = swapNext(j2, i3);
                        break;
                    }
                    i4 = next;
                } else {
                    int i5 = iArr[i4];
                    iArr[i4] = i2;
                    return i5;
                }
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            int i6 = i3 + 1;
            resizeMeMaybe(i6);
            insertEntry(i3, obj, i2, smearedHash);
            this.size = i6;
            if (i3 >= this.threshold) {
                resizeTable(this.table.length << 1);
            }
            this.modCount++;
            return 0;
        }
        throw AnonymousClass000.A0V("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public int removeEntry(int i2) {
        return remove(this.keys[i2], getHash(this.entries[i2]));
    }

    public void resizeEntries(int i2) {
        this.keys = Arrays.copyOf(this.keys, i2);
        this.values = Arrays.copyOf(this.values, i2);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1);
        }
        this.entries = copyOf;
    }

    public void setValue(int i2, int i3) {
        C29031Zu.A01(i2, this.size);
        this.values[i2] = i3;
    }

    public int size() {
        return this.size;
    }
}
