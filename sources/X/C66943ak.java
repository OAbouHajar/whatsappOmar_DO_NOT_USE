package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.3ak  reason: invalid class name and case insensitive filesystem */
public final class C66943ak<E> extends C105895Bp<E> implements RandomAccess {
    public static final C66943ak A02;
    public int A00;
    public Object[] A01;

    static {
        C66943ak r0 = new C66943ak(new Object[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public C66943ak() {
        this(new Object[10], 0);
    }

    public C66943ak(Object[] objArr, int i2) {
        this.A01 = objArr;
        this.A00 = i2;
    }

    public final /* synthetic */ C110025Us Aim(int i2) {
        if (i2 >= this.A00) {
            return new C66943ak(Arrays.copyOf(this.A01, i2), this.A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final void add(int i2, Object obj) {
        int i3;
        A02();
        if (i2 < 0 || i2 > (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        Object[] objArr = this.A01;
        if (i3 < objArr.length) {
            AnonymousClass3K4.A10(objArr, i2, i3);
        } else {
            Object[] objArr2 = new Object[AnonymousClass3K4.A03(i3)];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.A01, i2, objArr2, i2 + 1, this.A00 - i2);
            this.A01 = objArr2;
        }
        this.A01[i2] = obj;
        this.A00++;
        this.modCount++;
    }

    public final boolean add(Object obj) {
        A02();
        int i2 = this.A00;
        Object[] objArr = this.A01;
        if (i2 == objArr.length) {
            objArr = Arrays.copyOf(objArr, AnonymousClass3K4.A03(i2));
            this.A01 = objArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        objArr[i3] = obj;
        this.modCount++;
        return true;
    }

    public final Object get(int i2) {
        if (i2 >= 0 && i2 < this.A00) {
            return this.A01[i2];
        }
        throw AnonymousClass3K2.A0W(i2, this.A00);
    }

    public final Object remove(int i2) {
        int i3;
        A02();
        if (i2 < 0 || i2 >= (i3 = this.A00)) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        C105895Bp.A01(objArr, i3, i2);
        this.A00--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i2, Object obj) {
        A02();
        if (i2 < 0 || i2 >= this.A00) {
            throw AnonymousClass3K2.A0W(i2, this.A00);
        }
        Object[] objArr = this.A01;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.A00;
    }
}
