package X;

/* renamed from: X.2CD  reason: invalid class name */
public final class AnonymousClass2CD<E> extends C17380uz<E> {
    public static final AnonymousClass2CD EMPTY;
    public static final Object[] EMPTY_ARRAY;
    public final transient Object[] elements;
    public final transient int hashCode;
    public final transient int mask;
    public final transient int size;
    public final transient Object[] table;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY = new AnonymousClass2CD(objArr, 0, objArr, 0, 0);
    }

    public AnonymousClass2CD(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.elements = objArr;
        this.hashCode = i2;
        this.table = objArr2;
        this.mask = i3;
        this.size = i4;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.table;
        if (obj != null && objArr.length != 0) {
            int smearedHash = C29041Zv.smearedHash(obj);
            while (true) {
                int i2 = smearedHash & this.mask;
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    smearedHash = i2 + 1;
                }
            }
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i2) {
        System.arraycopy(this.elements, 0, objArr, i2, this.size);
        return i2 + this.size;
    }

    public C34641kb createAsList() {
        return C34641kb.asImmutableList(this.elements, this.size);
    }

    public int hashCode() {
        return this.hashCode;
    }

    public Object[] internalArray() {
        return this.elements;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public C28031Ub iterator() {
        return asList().iterator();
    }

    public int size() {
        return this.size;
    }
}
