package android.support.v4.util;

public class LongSparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private long[] mKeys;
    private int mSize;
    private Object[] mValues;

    public LongSparseArray() {
        this(10);
    }

    public LongSparseArray(int i2) {
        this.mGarbage = false;
        int idealLongArraySize = idealLongArraySize(i2);
        this.mKeys = new long[idealLongArraySize];
        this.mValues = new Object[idealLongArraySize];
        this.mSize = 0;
    }

    private static int binarySearch(long[] jArr, int i2, int i3, long j2) {
        int i4 = i2 + i3;
        int i5 = i2 - 1;
        while (i4 - i5 > 1) {
            int i6 = (i4 + i5) / 2;
            if (jArr[i6] < j2) {
                i5 = i6;
            } else {
                i4 = i6;
            }
        }
        return i4 == i2 + i3 ? (i2 + i3) ^ -1 : jArr[i4] != j2 ? i4 ^ -1 : i4;
    }

    private void gc() {
        int i2 = this.mSize;
        int i3 = 0;
        long[] jArr = this.mKeys;
        Object[] objArr = this.mValues;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != DELETED) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.mGarbage = false;
        this.mSize = i3;
    }

    public static int idealByteArraySize(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                return (1 << i3) - 12;
            }
        }
        return i2;
    }

    public static int idealLongArraySize(int i2) {
        return idealByteArraySize(i2 * 8) / 8;
    }

    public void append(long j2, E e2) {
        if (this.mSize == 0 || j2 > this.mKeys[this.mSize - 1]) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                gc();
            }
            int i2 = this.mSize;
            if (i2 >= this.mKeys.length) {
                int idealLongArraySize = idealLongArraySize(i2 + 1);
                long[] jArr = new long[idealLongArraySize];
                Object[] objArr = new Object[idealLongArraySize];
                System.arraycopy(this.mKeys, 0, jArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = jArr;
                this.mValues = objArr;
            }
            this.mKeys[i2] = j2;
            this.mValues[i2] = e2;
            this.mSize = i2 + 1;
            return;
        }
        put(j2, e2);
    }

    public void clear() {
        int i2 = this.mSize;
        Object[] objArr = this.mValues;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.support.v4.util.LongSparseArray<E>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.util.LongSparseArray<E> clone() {
        /*
            r3 = this;
            r1 = 0
            java.lang.Object r2 = super.clone()     // Catch:{ CloneNotSupportedException -> 0x001e }
            r0 = r2
            android.support.v4.util.LongSparseArray r0 = (android.support.v4.util.LongSparseArray) r0     // Catch:{ CloneNotSupportedException -> 0x001e }
            r1 = r0
            long[] r2 = r3.mKeys     // Catch:{ CloneNotSupportedException -> 0x001e }
            java.lang.Object r2 = r2.clone()     // Catch:{ CloneNotSupportedException -> 0x001e }
            long[] r2 = (long[]) r2     // Catch:{ CloneNotSupportedException -> 0x001e }
            r1.mKeys = r2     // Catch:{ CloneNotSupportedException -> 0x001e }
            java.lang.Object[] r2 = r3.mValues     // Catch:{ CloneNotSupportedException -> 0x001e }
            java.lang.Object r2 = r2.clone()     // Catch:{ CloneNotSupportedException -> 0x001e }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ CloneNotSupportedException -> 0x001e }
            r1.mValues = r2     // Catch:{ CloneNotSupportedException -> 0x001e }
        L_0x001d:
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.LongSparseArray.clone():android.support.v4.util.LongSparseArray");
    }

    public void delete(long j2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j2);
        if (binarySearch >= 0 && this.mValues[binarySearch] != DELETED) {
            this.mValues[binarySearch] = DELETED;
            this.mGarbage = true;
        }
    }

    public E get(long j2) {
        return get(j2, (Object) null);
    }

    public E get(long j2, E e2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j2);
        return (binarySearch < 0 || this.mValues[binarySearch] == DELETED) ? e2 : this.mValues[binarySearch];
    }

    public int indexOfKey(long j2) {
        if (this.mGarbage) {
            gc();
        }
        return binarySearch(this.mKeys, 0, this.mSize, j2);
    }

    public int indexOfValue(E e2) {
        if (this.mGarbage) {
            gc();
        }
        for (int i2 = 0; i2 < this.mSize; i2++) {
            if (this.mValues[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public long keyAt(int i2) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i2];
    }

    public void put(long j2, E e2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, j2);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e2;
            return;
        }
        int i2 = binarySearch ^ -1;
        if (i2 >= this.mSize || this.mValues[i2] != DELETED) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                gc();
                i2 = binarySearch(this.mKeys, 0, this.mSize, j2) ^ -1;
            }
            if (this.mSize >= this.mKeys.length) {
                int idealLongArraySize = idealLongArraySize(this.mSize + 1);
                long[] jArr = new long[idealLongArraySize];
                Object[] objArr = new Object[idealLongArraySize];
                System.arraycopy(this.mKeys, 0, jArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = jArr;
                this.mValues = objArr;
            }
            if (this.mSize - i2 != 0) {
                System.arraycopy(this.mKeys, i2, this.mKeys, i2 + 1, this.mSize - i2);
                System.arraycopy(this.mValues, i2, this.mValues, i2 + 1, this.mSize - i2);
            }
            this.mKeys[i2] = j2;
            this.mValues[i2] = e2;
            this.mSize++;
            return;
        }
        this.mKeys[i2] = j2;
        this.mValues[i2] = e2;
    }

    public void remove(long j2) {
        delete(j2);
    }

    public void removeAt(int i2) {
        if (this.mValues[i2] != DELETED) {
            this.mValues[i2] = DELETED;
            this.mGarbage = true;
        }
    }

    public void setValueAt(int i2, E e2) {
        if (this.mGarbage) {
            gc();
        }
        this.mValues[i2] = e2;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public E valueAt(int i2) {
        if (this.mGarbage) {
            gc();
        }
        return this.mValues[i2];
    }
}
