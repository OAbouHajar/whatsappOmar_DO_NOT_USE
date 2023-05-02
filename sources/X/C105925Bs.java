package X;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: X.5Bs  reason: invalid class name and case insensitive filesystem */
public final class C105925Bs extends AbstractList<C09200f6> implements RandomAccess {
    public static final AnonymousClass4SZ A02 = new AnonymousClass4SZ();
    public final int[] A00;
    public final C09200f6[] A01;

    public C105925Bs(int[] iArr, C09200f6[] r2) {
        this.A01 = r2;
        this.A00 = iArr;
    }

    public static final C105925Bs A00(C09200f6... r1) {
        return A02.A00(r1);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C09200f6)) {
            return super.contains(obj);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        return this.A01[i2];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof C09200f6)) {
            return super.indexOf(obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof C09200f6)) {
            return super.lastIndexOf(obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof C09200f6)) {
            return super.remove(obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return this.A01.length;
    }
}
