package X;

import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Tg  reason: invalid class name and case insensitive filesystem */
public final class C05850Tg {
    public static final SparseArray A00 = new SparseArray();
    public static final Object A01 = new Object();
    public static final AtomicInteger A02 = new AtomicInteger(0);

    public static Object A00(Class cls, Integer num) {
        try {
            synchronized (A01) {
                SparseArray sparseArray = A00;
                int intValue = num.intValue();
                if (sparseArray.indexOfKey(intValue) < 0) {
                    return null;
                }
                Object cast = cls.cast(sparseArray.get(intValue));
                sparseArray.delete(intValue);
                return cast;
            }
        } catch (ClassCastException e2) {
            C29691b2.A01("BloksDataStorage", "Casting error when retrieving data", e2);
            return null;
        }
    }
}
