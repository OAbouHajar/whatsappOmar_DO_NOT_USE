package X;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.0wd  reason: invalid class name and case insensitive filesystem */
public abstract class C18400wd extends C18410we {
    public Object[] contents;
    public boolean forceCopy;
    public int size = 0;

    public C18400wd(int i2) {
        C29011Zs.checkNonnegative(i2, "initialCapacity");
        this.contents = new Object[i2];
    }

    private void getReadyToExpandTo(int i2) {
        Object[] objArr;
        Object[] objArr2 = this.contents;
        int length = objArr2.length;
        if (length < i2) {
            objArr = Arrays.copyOf(objArr2, C18410we.expandedCapacity(length, i2));
        } else if (this.forceCopy) {
            objArr = (Object[]) objArr2.clone();
        } else {
            return;
        }
        this.contents = objArr;
        this.forceCopy = false;
    }

    public C18400wd add(Object obj) {
        getReadyToExpandTo(this.size + 1);
        Object[] objArr = this.contents;
        int i2 = this.size;
        this.size = i2 + 1;
        objArr[i2] = obj;
        return this;
    }

    public C18410we add(Object... objArr) {
        addAll(objArr, objArr.length);
        return this;
    }

    public C18410we addAll(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            getReadyToExpandTo(this.size + collection.size());
            if (collection instanceof C17390v0) {
                this.size = ((C17390v0) collection).copyIntoArray(this.contents, this.size);
                return this;
            }
        }
        super.addAll(iterable);
        return this;
    }

    public final void addAll(Object[] objArr, int i2) {
        AnonymousClass2CC.checkElementsNotNull(objArr, i2);
        getReadyToExpandTo(this.size + i2);
        System.arraycopy(objArr, 0, this.contents, this.size, i2);
        this.size += i2;
    }
}
