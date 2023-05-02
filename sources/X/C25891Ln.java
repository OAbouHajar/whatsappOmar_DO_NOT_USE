package X;

import android.util.SparseArray;
import android.view.View;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Ln  reason: invalid class name and case insensitive filesystem */
public final class C25891Ln extends C25901Lo {
    public final SparseArray A00 = new SparseArray();

    public C25891Ln(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C25881Lm r2 = (C25881Lm) it.next();
            this.A00.put(r2.A00, r2);
        }
    }

    public Object A01(C14990q7 r4, C31201dg r5) {
        int i2 = r5.A01;
        SparseArray sparseArray = this.A00;
        return sparseArray.indexOfKey(i2) >= 0 ? ((C25881Lm) sparseArray.get(i2)).A00(r4, r5) : super.A01(r4, r5);
    }

    public void A02(C14990q7 r5, C31201dg r6, C31201dg r7, Object obj) {
        View view = (View) obj;
        int i2 = r6.A01;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i2) >= 0) {
            ((C25881Lm) sparseArray.get(i2)).A01(view, r5, r6, r7);
        }
        super.A02(r5, r6, r7, obj);
    }

    public void A03(C14990q7 r5, C31201dg r6, C31201dg r7, Object obj) {
        View view = (View) obj;
        int i2 = r6.A01;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i2) >= 0) {
            ((C25881Lm) sparseArray.get(i2)).A02(view, r5, r6, r7);
        }
        super.A03(r5, r6, r7, obj);
    }
}
