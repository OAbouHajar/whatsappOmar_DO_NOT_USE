package X;

import java.util.Arrays;

/* renamed from: X.0wc  reason: invalid class name and case insensitive filesystem */
public class C18390wc extends C18400wd {
    public int hashCode;
    public Object[] hashTable;

    public C18390wc() {
        super(4);
    }

    public C18390wc(int i2) {
        super(i2);
        this.hashTable = new Object[C17380uz.chooseTableSize(i2)];
    }

    private void addDeduping(Object obj) {
        int length = this.hashTable.length - 1;
        int hashCode2 = obj.hashCode();
        int smear = C29041Zv.smear(hashCode2);
        while (true) {
            int i2 = smear & length;
            Object[] objArr = this.hashTable;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                objArr[i2] = obj;
                this.hashCode += hashCode2;
                super.add(obj);
                return;
            } else if (!obj2.equals(obj)) {
                smear = i2 + 1;
            } else {
                return;
            }
        }
    }

    public C18390wc add(Object obj) {
        if (this.hashTable == null || C17380uz.chooseTableSize(this.size) > this.hashTable.length) {
            this.hashTable = null;
            super.add(obj);
            return this;
        }
        addDeduping(obj);
        return this;
    }

    public C18390wc add(Object... objArr) {
        if (this.hashTable != null) {
            for (Object add : objArr) {
                add(add);
            }
        } else {
            super.add(objArr);
        }
        return this;
    }

    public C18390wc addAll(Iterable iterable) {
        if (this.hashTable != null) {
            for (Object add : iterable) {
                add(add);
            }
        } else {
            super.addAll(iterable);
        }
        return this;
    }

    public C17380uz build() {
        C17380uz access$100;
        int i2 = this.size;
        if (i2 == 0) {
            return C17380uz.of();
        }
        if (i2 == 1) {
            return C17380uz.of(this.contents[0]);
        }
        if (this.hashTable == null || C17380uz.chooseTableSize(i2) != this.hashTable.length) {
            access$100 = C17380uz.construct(this.size, this.contents);
            this.size = access$100.size();
        } else {
            int i3 = this.size;
            Object[] objArr = this.contents;
            if (C17380uz.shouldTrim(i3, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i3);
            }
            int i4 = this.hashCode;
            Object[] objArr2 = this.hashTable;
            access$100 = new AnonymousClass2CD(objArr, i4, objArr2, objArr2.length - 1, this.size);
        }
        this.forceCopy = true;
        this.hashTable = null;
        return access$100;
    }
}
