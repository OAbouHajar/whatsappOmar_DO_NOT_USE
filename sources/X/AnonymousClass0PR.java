package X;

import android.util.SparseArray;

/* renamed from: X.0PR  reason: invalid class name */
public class AnonymousClass0PR {
    public int A00 = 0;
    public SparseArray A01 = new SparseArray();

    public final C04850Oe A00(int i2) {
        SparseArray sparseArray = this.A01;
        C04850Oe r0 = (C04850Oe) sparseArray.get(i2);
        if (r0 != null) {
            return r0;
        }
        C04850Oe r02 = new C04850Oe();
        sparseArray.put(i2, r02);
        return r02;
    }
}
