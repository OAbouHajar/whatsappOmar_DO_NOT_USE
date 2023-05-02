package X;

/* renamed from: X.2NM  reason: invalid class name */
public class AnonymousClass2NM<E> extends C34641kb<E> {
    public static final C34641kb EMPTY = new AnonymousClass2NM(new Object[0], 0);
    public final transient Object[] array;
    public final transient int size;

    public AnonymousClass2NM(Object[] objArr, int i2) {
        this.array = objArr;
        this.size = i2;
    }

    public int copyIntoArray(Object[] objArr, int i2) {
        System.arraycopy(this.array, 0, objArr, i2, this.size);
        return i2 + this.size;
    }

    public Object get(int i2) {
        C29031Zu.A01(i2, this.size);
        return this.array[i2];
    }

    public Object[] internalArray() {
        return this.array;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.size;
    }
}
