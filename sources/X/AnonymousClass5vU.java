package X;

import android.util.SparseArray;

/* renamed from: X.5vU  reason: invalid class name */
public class AnonymousClass5vU {
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();
    public final SparseArray A02 = new SparseArray();
    public final C119245wm A03;

    public AnonymousClass5vU(C119245wm r2) {
        this.A03 = r2;
    }

    public C111205fV A00(int i2) {
        return (C111205fV) this.A02.get(this.A03.A02(i2));
    }

    public AnonymousClass5wJ A01(int i2) {
        return (AnonymousClass5wJ) this.A00.get(this.A03.A02(i2));
    }

    public AnonymousClass5wI A02(int i2) {
        return (AnonymousClass5wI) this.A01.get(this.A03.A02(i2));
    }
}
