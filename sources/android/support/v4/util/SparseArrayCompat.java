package android.support.v4.util;

public class SparseArrayCompat<E> {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int i2) {
        this.mGarbage = false;
        int idealIntArraySize = idealIntArraySize(i2);
        this.mKeys = new int[idealIntArraySize];
        this.mValues = new Object[idealIntArraySize];
        this.mSize = 0;
    }

    private static int binarySearch(int[] iArr, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i2 - 1;
        while (i5 - i6 > 1) {
            int i7 = (i5 + i6) / 2;
            if (iArr[i7] < i4) {
                i6 = i7;
            } else {
                i5 = i7;
            }
        }
        return i5 == i2 + i3 ? (i2 + i3) ^ -1 : iArr[i5] != i4 ? i5 ^ -1 : i5;
    }

    private void gc() {
        int i2 = this.mSize;
        int i3 = 0;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != DELETED) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                }
                i3++;
            }
        }
        this.mGarbage = false;
        this.mSize = i3;
    }

    static int idealByteArraySize(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                return (1 << i3) - 12;
            }
        }
        return i2;
    }

    static int idealIntArraySize(int i2) {
        return idealByteArraySize(i2 * 4) / 4;
    }

    public void append(int i2, E e2) {
        if (this.mSize == 0 || i2 > this.mKeys[this.mSize - 1]) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                gc();
            }
            int i3 = this.mSize;
            if (i3 >= this.mKeys.length) {
                int idealIntArraySize = idealIntArraySize(i3 + 1);
                int[] iArr = new int[idealIntArraySize];
                Object[] objArr = new Object[idealIntArraySize];
                System.arraycopy(this.mKeys, 0, iArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = iArr;
                this.mValues = objArr;
            }
            this.mKeys[i3] = i2;
            this.mValues[i3] = e2;
            this.mSize = i3 + 1;
            return;
        }
        put(i2, e2);
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

    public void delete(int i2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i2);
        if (binarySearch >= 0 && this.mValues[binarySearch] != DELETED) {
            this.mValues[binarySearch] = DELETED;
            this.mGarbage = true;
        }
    }

    public E get(int i2) {
        return get(i2, (Object) null);
    }

    public E get(int i2, E e2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i2);
        return (binarySearch < 0 || this.mValues[binarySearch] == DELETED) ? e2 : this.mValues[binarySearch];
    }

    public int indexOfKey(int i2) {
        if (this.mGarbage) {
            gc();
        }
        return binarySearch(this.mKeys, 0, this.mSize, i2);
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

    public int keyAt(int i2) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i2];
    }

    public void put(int i2, E e2) {
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i2);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e2;
            return;
        }
        int i3 = binarySearch ^ -1;
        if (i3 >= this.mSize || this.mValues[i3] != DELETED) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                gc();
                i3 = binarySearch(this.mKeys, 0, this.mSize, i2) ^ -1;
            }
            if (this.mSize >= this.mKeys.length) {
                int idealIntArraySize = idealIntArraySize(this.mSize + 1);
                int[] iArr = new int[idealIntArraySize];
                Object[] objArr = new Object[idealIntArraySize];
                System.arraycopy(this.mKeys, 0, iArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = iArr;
                this.mValues = objArr;
            }
            if (this.mSize - i3 != 0) {
                System.arraycopy(this.mKeys, i3, this.mKeys, i3 + 1, this.mSize - i3);
                System.arraycopy(this.mValues, i3, this.mValues, i3 + 1, this.mSize - i3);
            }
            this.mKeys[i3] = i2;
            this.mValues[i3] = e2;
            this.mSize++;
            return;
        }
        this.mKeys[i3] = i2;
        this.mValues[i3] = e2;
    }

    public void remove(int i2) {
        delete(i2);
    }

    public void removeAt(int i2) {
        if (this.mValues[i2] != DELETED) {
            this.mValues[i2] = DELETED;
            this.mGarbage = true;
        }
    }

    public void removeAtRange(int i2, int i3) {
        int min = Math.min(this.mSize, i2 + i3);
        for (int i4 = i2; i4 < min; i4++) {
            removeAt(i4);
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
