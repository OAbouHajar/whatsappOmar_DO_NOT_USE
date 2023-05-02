package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1hM  reason: invalid class name and case insensitive filesystem */
public final class C32851hM {
    public int A00 = 0;
    public final ArrayList A01 = new ArrayList();

    public int A00(Iterable iterable) {
        int i2 = 0;
        synchronized (this.A01) {
            for (Object A012 : iterable) {
                i2 |= A01(A012);
            }
        }
        return i2;
    }

    public int A01(Object obj) {
        int i2;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                if (it.next().equals(obj)) {
                    i2 |= 1 << i3;
                }
                i3++;
            }
        }
        return i2;
    }

    public int A02(Object obj) {
        int i2;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            int i3 = this.A00;
            if (i3 < 32) {
                arrayList.add(obj);
                i2 = 1 << i3;
                this.A00 = i3 + 1;
            } else {
                throw new IllegalStateException("Attempting to newEntry more than 32 entries.");
            }
        }
        return i2;
    }
}
